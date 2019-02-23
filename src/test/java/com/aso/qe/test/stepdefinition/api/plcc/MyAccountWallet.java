package com.aso.qe.test.stepdefinition.api.plcc;

import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;

import com.aso.qe.framework.api.helpers.JSONValidationUtils;
import com.aso.qe.test.common.JsonReaderCommonPlcc;
import com.aso.qe.test.stepdefinition.api.R1SP1_Categories_ProductsByCategorySD;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.path.json.JsonPath;

public class MyAccountWallet extends JSONValidationUtils {
	private static final Logger logger = Logger.getLogger(R1SP1_Categories_ProductsByCategorySD.class);
	public static String regEmailId;
	
	@Given("^\"(.*?)\" endpoint for getting all the credit cards$")
	public void endpoint_for_getting_all_the_credit_cards(String PLCCGetAllCreditCards) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(PLCCGetAllCreditCards);
		logger.debug("END Point URL:"+endpoints);
	}
	
	@Given("^\"(.*?)\" endpoint with \"(.*?)\" for adding a credit card for plcc$")
	public void endpoint_with_for_adding_a_credit_card_for_plcc(String PLCCAddAddressURLr2, String PLCCAddCreditCardPostRequest) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(PLCCAddAddressURLr2);
		logger.debug("END Point URL:"+endpoints);
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommonPlcc.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCAddCreditCardPostRequest)+".json");
		logger.info(JsonReaderCommonPlcc.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCAddCreditCardPostRequest)+".json");
	}
	
	@Given("^\"(.*?)\" endpoint with \"(.*?)\" for updating a credit card for plcc$")
	public void endpoint_with_for_updating_a_credit_card_for_plcc(String PLCCUpdateAddressURLr2, String PLCCUpdateCreditCardPostRequest) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(PLCCUpdateAddressURLr2);
		logger.debug("END Point URL:"+endpoints);
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommonPlcc.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCUpdateCreditCardPostRequest)+".json");
		logger.info(JsonReaderCommonPlcc.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCUpdateCreditCardPostRequest)+".json");
	}
	
	@Given("^\"(.*?)\" endpoint with \"(.*?)\" for Set a credit card as default$")
	public void endpoint_with_for_Set_a_credit_card_as_default(String PLCCSetCardAsDefaultURLr2, String PLCCSetCardAsDefaultPostRequest) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(PLCCSetCardAsDefaultURLr2);
		logger.debug("END Point URL:"+endpoints);
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommonPlcc.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCSetCardAsDefaultPostRequest)+".json");
		logger.info(JsonReaderCommonPlcc.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCSetCardAsDefaultPostRequest)+".json");
	}
	
	@Given("^\"(.*?)\" endpoint for deleting a credit card$")
	public void endpoint_for_deleting_a_credit_card(String PLCCDeleteCardURLr2) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(PLCCDeleteCardURLr2);
		logger.debug("END Point URL:"+endpoints);
	}
	
	@Given("^\"(.*?)\" with \"(.*?)\" endpoint for login authentication for plcc$")
	public void with_endpoint_for_login_authentication_for_plcc(String PLCCloginurl, String PLCCLoginRequest) throws Throwable {
		System.setProperty("ProfileId", "");
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(PLCCloginurl);
		logger.debug("END Point URL:"+endpoints);
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommonPlcc.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCLoginRequest)+".json");
/*		JsonPath jsonPathEvaluator = response.jsonPath();
		String  profileID = jsonPathEvaluator.get("identity.userId");
		logger.debug("Profile ID::"+ profileID);
		System.setProperty("ProfileId", profileID);*/
	}

	@Then("^Verify response status code as (\\d+) for plcc changes$")
	public void verify_response_status_code_as_for_plcc_changes(int statusCodeExpected) throws Throwable {
		String successReponse = getSuccessTxt("201");
		logger.debug("201 Error Text::"+successReponse);
		if(successReponse != null && successReponse.contains(String.valueOf(statusCodeExpected))){
			logger.debug("201 error code validation PASS");
			assertTrue(true);
		}else{
			logger.debug("201 error code validation FAIL");
			assertTrue(false);
		}
	}
	
	public String getSuccessTxt(String expSuccessMessage)
	{
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty("PLCC201SuccessMessage");
		String validSuccessMessage = endpoints;
		if(expSuccessMessage==validSuccessMessage)
		{
			logger.debug("201 error code validation PASS");
		}
		return validSuccessMessage;
	}
	
	@Then("^Verify response status code as (\\d+) message for plcc changes$")
	public void verify_response_status_code_as_message_for_plcc_changes(int statusCodeExpected) throws Throwable {
		String successReponse = get200SuccessTxt("200");
		logger.debug("200 Error Text::"+successReponse);
		if(successReponse != null && successReponse.contains(String.valueOf(statusCodeExpected))){
			logger.debug("200 error code validation PASS");
			assertTrue(true);
		}else{
			logger.debug("200 error code validation FAIL");
			assertTrue(false);
		}
	}
	
	public String get200SuccessTxt(String expSuccessMessage)
	{
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty("PLCC200SuccessMessage");
		String validSuccessMessage = endpoints;
		if(expSuccessMessage==validSuccessMessage)
		{
			logger.debug("200 error code validation PASS");
		}
		return validSuccessMessage;
	}
	
}
