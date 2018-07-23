package com.aso.qe.test.stepdefinition.api;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;

import com.aso.qe.framework.api.helpers.JSONValidationUtils;
import com.aso.qe.framework.api.helpers.MiniCartJsonResponseHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class R1SP1_KER_1915_Wishlist extends JSONValidationUtils{
	private static final Logger logger = Logger.getLogger(R1SP1_KER_1915_Wishlist.class);
	public MiniCartJsonResponseHelper miniCartJsonResponseHelper;

	@Given("^API \"(.*?)\" and post request \"(.*?)\" endpoint for Wishlist with Sign-in user \"(.*?)\"\"(.*?)\"$")
	public void and_post_request_endpoint_for_Wishlist_with_Sign_in_user(String url, String requestJson, String userName, String password) throws Throwable {
		List<io.restassured.http.Cookie> restAssuredCookies = new R1SP1_KER_725_MiniCartSD().getSignInUserCookies(userName, password);
		String endpoints=loadProps.getConfigPropProperty("api.uat6int.baseURL")+url;
		logger.debug("END Point URL:"+endpoints);
		initiateRestPostAPICallWithCookies(endpoints, restAssuredCookies,requestJson);
	}

	@Then("^Verify response status code as (\\d+) for Wishlist$")
	public void verify_response_status_code_as_for_Wishlist(int statusCodeExpected) throws Throwable {
		assertTrue(validateStatusCode(statusCodeExpected));
	}

	@Given("^validate jsonSchema \"(.*?)\" for Wishlist with SignIn$")
	public void validate_jsonSchema_for_Wishlist_with_SignIn(String jsonSchemaFilePath) throws Throwable {
		assertTrue(validateJsonSchema(jsonSchemaFilePath),jsonSchemaValidationErrorMsg);
	}	
	
	@Given("^API \"(.*?)\" and Update request \"(.*?)\" endpoint for Wishlist with Sign-in user \"(.*?)\"\"(.*?)\"$")
	public void and_Update_request_endpoint_for_Wishlist_with_Sign_in_user(String url, String requestJson, String userName, String password) throws Throwable {
		List<io.restassured.http.Cookie> restAssuredCookies = new R1SP1_KER_725_MiniCartSD().getSignInUserCookies(userName, password);
		String endpoints=loadProps.getConfigPropProperty("api.uat6int.baseURL")+url;
		logger.debug("END Point URL:"+endpoints);
		initiateRestPutAPICallWithCookies(endpoints, restAssuredCookies,requestJson);
	}


	@Given("^\"(.*?)\" endpoint for Wishlist with Sign-in user \"(.*?)\"\"(.*?)\"$")
	public void endpoint_for_Wishlist_with_Sign_in_user(String url, String userName, String password) throws Throwable {
		List<io.restassured.http.Cookie> restAssuredCookies = new R1SP1_KER_725_MiniCartSD().getSignInUserCookies(userName, password);
		String endpoints=loadProps.getConfigPropProperty("api.uat6int.baseURL")+url;
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICallWithCookies(endpoints, restAssuredCookies);
	}
}

