package com.aso.qe.test.stepdefinition.api;


import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aso.qe.framework.api.helpers.JSONValidationUtils;
import com.aso.qe.framework.api.json.JsonReaderCommon;
import com.aso.qe.framework.common.CommonActionHelper;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.path.json.JsonPath;

public class R2_Cart_API_SD extends JSONValidationUtils{
	private static final Logger logger = Logger.getLogger(R2_Cart_API_SD.class);

	@Given("^\"(.*?)\" endpoint for getting cart summary$")
	public void endpoint_for_getting_cart_summary(String url) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(url)+System.getProperty("OrderId")+"/summary";;
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICallWithCookie(endpoints);
	}

	@Then("^validate jsonSchema \"(.*?)\" for MiniCart with Guest$")
	public void validate_jsonSchema_for_MiniCart_with_Guest(String jsonSchemaFilePath)
	{
		try {
			boolean flag = isJsonValid(convertJsonFileToString(JsonReaderCommon.jsonSchemaFolderPath+ jsonSchemaFilePath+".json"), response.asString());
			logger.debug("JSON Schema Validate FLAG:: "+flag);
			assertTrue(flag);
		} catch (ProcessingException e) {
			logger.error("ProcessingException msg::"+e.getMessage());
		} catch (IOException e) {
			logger.error("IOException msg::"+e.getMessage());
		}

	}


	public List<io.restassured.http.Cookie> getGuestUserCookies_v1(){
		List<io.restassured.http.Cookie> restAssuredCookies = new ArrayList<io.restassured.http.Cookie>();
		RemoteWebDriver webdriver = null;
		try{
			CommonActionHelper webActionHelper = new CommonActionHelper();
			webdriver = webActionHelper.launchChromeBrowser(webActionHelper.getWebDriverFolderPath("chromedriver"));
			webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			webdriver.manage().window().maximize();
			webdriver.get(apiEndpointWebURL);
			CommonActionHelper.waitForPageLoad(webdriver);
			webdriver.manage();
			Set<Cookie> seleniumCookies = webdriver.manage().getCookies();
			logger.debug("Cookies:"+seleniumCookies);
			for (org.openqa.selenium.Cookie cookie : seleniumCookies) {
				logger.debug(cookie.getName()+" :: "+cookie.getValue());
				restAssuredCookies.add(new io.restassured.http.Cookie.Builder(cookie.getName(), cookie.getValue()).build());
			}
		}catch (Exception e) {
			logger.error("getBrowserCookies Exception MSG::"+e.getMessage());
		} catch (Throwable e) {
			logger.error("getBrowserCookies Throwable MSG::"+e.getMessage());
		}finally{
			if(webdriver != null){
				//webdriver.close();
				logger.debug("Web driver closed.");
			}
		}
		return restAssuredCookies;
	}

	@Then("^Verify response status code as (\\d+) for guest login$")
	public void verify_response_status_code_as_for_guest_login(int statusCodeExpected) throws Throwable {
		assertTrue(validateStatusCode(statusCodeExpected));
	}


	@Given("^\"(.*?)\" and post request \"(.*?)\" endpoint for Add to Cart with Guest user$")
	public void and_post_request_endpoint_for_Add_to_Cart_with_Guest_user(String AddToCartSummaryUrl, String addtocartRequestJson) throws Throwable {
		List<io.restassured.http.Cookie> restAssuredCookies = new R2_Cart_API_SD().getGuestUserCookies_v1();
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(AddToCartSummaryUrl);
		logger.debug("END Point URL:"+endpoints);
		initiateRestPostAPICallWithoutSignIn(endpoints, restAssuredCookies, loadProps.getTestDataProperty(addtocartRequestJson));
	}


	@Given("^\"(.*?)\" endpoint for getting cart$")
	public void endpoint_for_getting_cart(String GetCartUrl) throws Throwable {
		System.setProperty("OrderId","");
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(GetCartUrl);
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICallWithGuestUserCookies(endpoints);
		JsonPath jsonPathEvaluator = response.jsonPath();
		String orderID = jsonPathEvaluator.get("orderId");
		logger.debug("Order ID::"+ orderID);
		System.setProperty("OrderId", orderID);
	}


	@Given("^\"(.*?)\" endpoint for viewing cart details$")
	public void endpoint_for_viewing_cart_details(String url) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(url)+System.getProperty("OrderId");
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICallWithGuestUserCookies(endpoints);
	}
}