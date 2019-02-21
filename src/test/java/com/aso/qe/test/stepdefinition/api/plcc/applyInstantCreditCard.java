package com.aso.qe.test.stepdefinition.api.plcc;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertNotNull;

import java.io.IOException;
import org.apache.log4j.Logger;
import com.aso.qe.framework.api.helpers.JSONValidationUtils;
import com.aso.qe.framework.api.json.JsonReaderCommon;
import com.aso.qe.framework.common.FrameWorkHelper;
import com.aso.qe.test.stepdefinition.api.R1SP1_Categories_ProductsByCategorySD;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.path.json.JsonPath;

public class applyInstantCreditCard extends JSONValidationUtils {
	private static final Logger logger = Logger.getLogger(R1SP1_Categories_ProductsByCategorySD.class);
	public static String regEmailId;
	
	@Given("^\"(.*?)\" endpoint with \"(.*?)\" for applying instant credit card$")
	public void endpoint_with_for_applying_instant_credit_card(String PLCCApplyInstantCardURLr2, String PLCCApplyInstantCardPostRequest) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(PLCCApplyInstantCardURLr2);
		logger.debug("END Point URL:"+endpoints);
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommon.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCApplyInstantCardPostRequest)+".json");
		logger.info(JsonReaderCommon.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCApplyInstantCardPostRequest)+".json");
	}
	
	@Given("^\"(.*?)\" endpoint with \"(.*?)\" for applying invalid instant credit card$")
	public void endpoint_with_for_applying_invalid_instant_credit_card(String PLCCApplyMissingZipCodeInstantCardURLr2, String PLCCApplyMissingZipCodeInstantCardPostRequest) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(PLCCApplyMissingZipCodeInstantCardURLr2);
		logger.debug("END Point URL:"+endpoints);
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommon.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCApplyMissingZipCodeInstantCardPostRequest)+".json");
		logger.info(JsonReaderCommon.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCApplyMissingZipCodeInstantCardPostRequest)+".json");
	}
	
	@Given("^\"(.*?)\" endpoint with \"(.*?)\" Not found error for applying invalid instant credit card$")
	public void endpoint_with_Not_found_error_for_applying_invalid_instant_credit_card(String PLCCApplyInvalidInstantCardInvalidURL, String PLCCApplyInvalidInstantCardPostRequest) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(PLCCApplyInvalidInstantCardInvalidURL);
		logger.debug("END Point URL:"+endpoints);
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommon.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCApplyInvalidInstantCardPostRequest)+".json");
		logger.info(JsonReaderCommon.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCApplyInvalidInstantCardPostRequest)+".json");
	}
	
	@Then("^user get the response status code as (\\d+)$")
	public void user_get_the_response_status_code_as(int statusCodeExpected) throws Throwable {
		String errorTxt = getErrorTxt();
		logger.debug("400 Error Text::"+errorTxt);
		if(errorTxt != null && errorTxt.contains(String.valueOf(statusCodeExpected))){
			logger.debug("400 error code validation PASS");
			assertTrue(true);
		}else{
			logger.debug("400 error code validation FAIL");
			assertTrue(false);
		}
	}

	@Then("^verify user get the response status code as (\\d+)$")
	public void verify_user_get_the_response_status_code_as(int statusCodeExpected) throws Throwable {
		String errorTxt = getErrorTxt();
		logger.debug("404 Error Text::"+errorTxt);
		if(errorTxt != null && errorTxt.contains(String.valueOf(statusCodeExpected))){
			logger.debug("404 error code validation PASS");
			assertTrue(true);
		}else{
			logger.debug("404 error code validation FAIL");
			assertTrue(false);
		}
	}

}
