package com.aso.qe.test.stepdefinition.api.plcc;

import static org.testng.Assert.assertTrue;

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
import com.aso.qe.framework.common.FrameWorkHelper;
import com.aso.qe.test.stepdefinition.api.R2_Cart_API_SD;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.path.json.JsonPath;

public class createUserProfile extends JSONValidationUtils {
	private static final Logger logger = Logger.getLogger(R2_Cart_API_SD.class);

	@Given("^\"(.*?)\" and post request \"(.*?)\" endpoint for create user profile$")
	public void and_post_request_endpoint_for_create_user_profile(String RegistrationPageURI,
			String createUserProfileRequest) throws Throwable {
	List<io.restassured.http.Cookie> restAssuredCookies = new createUserProfile().getGuestUserCookies_v1();
		String endpoints = apiEndpointIP + loadProps.getTestDataProperty(RegistrationPageURI);
		String postRequestStr = JSONValidationUtils
				.convertJsonFileToString(JsonReaderCommon.jsonRequestFolderPathPLCC + createUserProfileRequest + ".json");
		logger.debug("END Point URL:" + endpoints);

		initiateRestPostAPICallWithoutCookiesAndReqStr(endpoints, postRequestStr);

	}

	@Then("^Verify response status code as (\\d+) after user profile created succefully$")
	public void verify_response_status_code_as_after_user_profile_created_succefully(int statusCodeExpected)
			throws Throwable {
		boolean flag = validateStatusCode(statusCodeExpected);
		logger.debug("FLAG::" + flag);
		assertTrue(flag);
	}

	public List<io.restassured.http.Cookie> getGuestUserCookies_v1() {
		List<io.restassured.http.Cookie> restAssuredCookies = new ArrayList<io.restassured.http.Cookie>();
		RemoteWebDriver webdriver = null;
		try {
			CommonActionHelper webActionHelper = new CommonActionHelper();
			webdriver = webActionHelper.launchChromeBrowser(webActionHelper.getWebDriverFolderPath("chromedriver"));
			webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			webdriver.manage().window().maximize();
			webdriver.get(apiEndpointWebURL);
			CommonActionHelper.waitForPageLoad(webdriver);
			webdriver.manage();
			Set<Cookie> seleniumCookies = webdriver.manage().getCookies();
			logger.debug("Cookies:" + seleniumCookies);
			for (org.openqa.selenium.Cookie cookie : seleniumCookies) {
				logger.debug(cookie.getName() + " :: " + cookie.getValue());
				restAssuredCookies
						.add(new io.restassured.http.Cookie.Builder(cookie.getName(), cookie.getValue()).build());
			}
		} catch (Exception e) {
			logger.error("getBrowserCookies Exception MSG::" + e.getMessage());
		} catch (Throwable e) {
			logger.error("getBrowserCookies Throwable MSG::" + e.getMessage());
		} finally {
			if (webdriver != null) {
				// webdriver.close();
				logger.debug("Web driver closed.");
			}
		}
		return restAssuredCookies;
	}

}
