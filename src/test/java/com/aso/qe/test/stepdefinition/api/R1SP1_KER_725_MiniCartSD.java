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
import com.aso.qe.framework.api.helpers.MiniCartJsonResponseHelper;
import com.aso.qe.framework.api.json.JsonReaderCommon;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.common.CommonTestHelper;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class R1SP1_KER_725_MiniCartSD extends JSONValidationUtils{
	private static final Logger logger = Logger.getLogger(R1SP1_KER_725_MiniCartSD.class);
	public MiniCartJsonResponseHelper miniCartJsonResponseHelper;
	
	@Given("^\"(.*?)\" endpoint for MiniCart with Sign-in user \"(.*?)\"\"(.*?)\"$")
	public void endpoint_for_MiniCart_with_Sign_in_user(String url, String userName, String password) throws Throwable {
		List<io.restassured.http.Cookie> restAssuredCookies = getSignInUserCookies(userName, password);
		String endpoints=CommonTestHelper.getAPIEndpointWebURL(apiEndpointWebURL)+url;
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICallWithCookies(endpoints, restAssuredCookies);
	}

	@Then("^Verify response status code as (\\d+) for Minicart$")
	public void verify_response_status_code_as_for_Minicart(int statusCodeExpected)
	{
		boolean flag = validateStatusCode(statusCodeExpected);
		logger.debug("Status Code FLAG::"+flag);
		assertTrue(flag);
		
	}
	
	@Then("^Verify the response message \"(.*?)\" for Minicart$")
	public void verify_the_response_error_for_CategoryDetail(String expectedError)
	{
		logger.debug("RESPONSE:: "+response.asString());
		String responseStr = response.asString();
		boolean flag = false;
		if(responseStr!= null &&responseStr.contains(expectedError)){
			flag = true;
		}
		assertTrue(flag);
	}
	
	@Then("^validate jsonSchema \"(.*?)\" for MiniCart with SignIn$")
	public void validate_jsonSchema_for_MiniCart_with_SignIn(String jsonSchemaFilePath)
	{
		try {
			boolean flag = isJsonValid(convertJsonFileToString(JsonReaderCommon.jsonSchemaFolderPath+ jsonSchemaFilePath+".json"), response.asString());
			logger.debug("JSON Schema Validate FLAG:: "+flag);
			assertTrue(flag);
		} catch (ProcessingException e) {
			logger.error("ProcessingException msg::"+e.getMessage());
			//e.printStackTrace();
		} catch (IOException e) {
			logger.error("IOException msg::"+e.getMessage());
			//e.printStackTrace();
		}
		
	}
	
	@Then("^Read the MiniCartSignIn json response$")
	public void read_the_MiniCartSignIn_json_response() throws Throwable {
		miniCartJsonResponseHelper = new MiniCartJsonResponseHelper(response.asString());
	}
	
	@Then("^Validate the MiniCartSignIn Requried Property Value are not Null$")
	public void validate_the_MiniCartSignIn_Requried_Property_Value_are_not_Null(List<String> propNameList) throws Throwable {
		for(String propName:propNameList){
			assertTrue(miniCartJsonResponseHelper.isMiniCartPropertyValueNull(propName),Constants.API_ERROR_DESCRIPTION);
		}
	}
	
	@Then("^Validate the MiniCartSignIn quantity Requried Property Value are not Null$")
	public void validate_the_MiniCartSignIn_quantity_Requried_Property_Value_are_not_Null(List<String> propNameList) throws Throwable {
		for(String propName:propNameList){
			assertTrue(miniCartJsonResponseHelper.isMinicartQuantityPropertyValueNull(propName),Constants.API_ERROR_DESCRIPTION);
		}
	}
	
	public List<io.restassured.http.Cookie> getSignInUserCookies(String username, String password){
		  List<io.restassured.http.Cookie> restAssuredCookies = new ArrayList<io.restassured.http.Cookie>();
		  RemoteWebDriver webdriver = null;
		try{
			logger.debug("UserName:"+username +" :Password:"+password);
			CommonActionHelper webActionHelper = new CommonActionHelper();
			webdriver = webActionHelper.launchChromeBrowser(webActionHelper.getWebDriverFolderPath("chromedriver"));
			
			webdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			webdriver.manage().window().maximize();
			webdriver.get(apiEndpointWebURL);
			CommonActionHelper.waitForPageLoad(webdriver);
			webActionHelper.getfindElementByXPath("//li[@data-auid='MyAccount']").click();
			webActionHelper.getfindElementByXPath("//INPUT[@id='logonId']").sendKeys(username);
			webActionHelper.getfindElementByXPath("//INPUT[@id='logonPassword']").sendKeys(password);
			webActionHelper.getfindElementByXPath("//BUTTON[@id='logonSubmit']").click();
			CommonActionHelper.waitForPageLoad(webdriver);
			webdriver.navigate().refresh();
			CommonActionHelper.waitForPageLoad(webdriver);
			Set<Cookie> seleniumCookies = webdriver.manage().getCookies();

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
				webdriver.close();
				logger.debug("Web driver closed.");
			}
		}
		return restAssuredCookies;
	}
	
	
}

