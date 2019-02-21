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

public class createUserProfile extends JSONValidationUtils {
	private static final Logger logger = Logger.getLogger(R1SP1_Categories_ProductsByCategorySD.class);
	public static String regEmailId;
	
	@Given("^\"(.*?)\" endpoint with \"(.*?)\" for user registration with plcc changes$")
	public void endpoint_with_for_user_registration_with_plcc_changes(String PLCCRegistrationUrl, String PLCCRegistrationPostRequest) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(PLCCRegistrationUrl);
		logger.debug("END Point URL:"+endpoints);
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommon.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCRegistrationPostRequest)+".json");
		logger.info(JsonReaderCommon.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCRegistrationPostRequest)+".json");
		regEmailId= "PLCCQA"+FrameWorkHelper.getRandomAlphabetic(6).toLowerCase()+"@plccmail.com";
		postRequestStr = postRequestStr.replace("REPLACE_LOGONID",regEmailId)
				.replaceAll("REPLACE_PASSWORD", loadProps.getTestDataProperty("RegistrationUserPassword"));

		initiateRestPostAPICallWithoutCookiesAndReqStr(endpoints, postRequestStr);
	}

	@Then("^Verify response status code as (\\d+) for plcc$")
	public void verify_response_status_code_as_for_plcc(int statusCodeExpected) throws Throwable {
		boolean flag = validateStatusCode(statusCodeExpected);
		logger.debug("FLAG::"+flag);
		assertTrue(flag);
	}

	@Then("^validate jsonSchema \"(.*?)\" for plcc$")
	public void validate_jsonSchema_for_plcc(String jsonSchemaFilePath) throws Throwable {
		try {
			boolean flag = isJsonValid(convertJsonFileToString(JsonReaderCommon.jsonSchemaFolderPathPLCC+ jsonSchemaFilePath+".json"), response.asString());
			logger.info("schema file is"+JsonReaderCommon.jsonSchemaFolderPathPLCC+ jsonSchemaFilePath+".json");
			logger.debug("JSON Schema Validate FLAG:: "+flag);
			assertTrue(flag);
		} catch (ProcessingException e) {
			logger.debug("ProcessingException:: "+e.getMessage());
		} catch (IOException e) {
			logger.debug("IOException:: "+e.getMessage());
		}
	}

	@Then("^Validated response details of \"(.*?)\" for plcc$")
	public void validated_response_details_of_for_plcc(String key) throws Throwable {
		JsonPath jsonPathEvaluator = response.jsonPath();
		Object propObj = jsonPathEvaluator.get(key);
		logger.debug(key+"::"+ propObj);
		assertNotNull(JSONValidationUtils.isNotNull(propObj));
	}
	@Then("^Verify Error response status code as (\\d+) for plcc$")
	public void verify_Error_response_status_code_as_for_plcc(int statusCodeExpected) throws Throwable {
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
	@Given("^\"(.*?)\" endpoint with \"(.*?)\" for user registration with invalid data$")
	public void endpoint_with_for_user_registration_with_invalid_data(String PLCCRegistrationUrl, String PLCCRegistrationPostRequest) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(PLCCRegistrationUrl);
		logger.debug("END Point URL:"+endpoints);
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommon.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCRegistrationPostRequest)+".json");
		logger.info(JsonReaderCommon.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCRegistrationPostRequest)+".json");
		regEmailId= "PLCCQA"+FrameWorkHelper.getRandomAlphabetic(6).toLowerCase()+"plccmail.com";
		postRequestStr = postRequestStr.replace("REPLACE_LOGONID",regEmailId)
				.replaceAll("REPLACE_PASSWORD", loadProps.getTestDataProperty("RegistrationUserPassword"));
		initiateRestPostAPICallWithoutCookiesAndReqStr(endpoints, postRequestStr);
		String errorResp = initiateErrorRestAPICall(endpoints);
		logger.debug("ERROR RESPONSE:: "+errorResp);
		boolean flag = false;
		if(errorResp!= null && errorResp.contains("400")){
			flag= true;
		}
		assertTrue(flag);
	}
	
	@Given("^\"(.*?)\" with \"(.*?)\" endpoint for login authenticate$")
	public void with_endpoint_for_login_authenticate(String PLCCRegistrationUrl, String PLCCRegistrationPostRequest) throws Throwable {
		System.setProperty("ProfileId", "");
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(PLCCRegistrationUrl);
		logger.debug("END Point URL:"+endpoints);
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommon.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCRegistrationPostRequest)+".json");
		logger.info(JsonReaderCommon.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCRegistrationPostRequest)+".json");
		JsonPath jsonPathEvaluator = response.jsonPath();
		String  profileID = jsonPathEvaluator.get("identity.userId");
		logger.debug("Profile ID::"+ profileID);
		System.setProperty("ProfileId", profileID);
		initiateRestPostAPICallWithoutCookiesAndReqStr(endpoints, postRequestStr);
		
		}
		
	@Given("^\"(.*?)\" endpoint with \"(.*?)\" for user registration with plcc changes for invalid address$")
	public void endpoint_with_for_user_registration_with_plcc_changes_for_invalid_address(String PLCCInvalidRegistrationUrl, String PLCCInvalidRegistrationPostRequest) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(PLCCInvalidRegistrationUrl);
		logger.debug("END Point URL:"+endpoints);
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommon.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCInvalidRegistrationPostRequest)+".json");
		logger.info(JsonReaderCommon.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCInvalidRegistrationPostRequest)+".json");
	}


}
