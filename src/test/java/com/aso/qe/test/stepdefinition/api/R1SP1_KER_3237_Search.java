package com.aso.qe.test.stepdefinition.api;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;

import com.aso.qe.framework.api.helpers.APIJsonResponse;
import com.aso.qe.framework.api.helpers.JSONValidationUtils;
import com.aso.qe.framework.api.json.JsonReaderCommon;
import com.aso.qe.framework.common.Constants;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class R1SP1_KER_3237_Search extends JSONValidationUtils{
	private static final Logger logger = Logger.getLogger(R1SP1_KER_3237_Search.class);
	public APIJsonResponse apiJsonResponse;
	
	@Given("^\"(.*?)\" endpoint for Auto Suggestion$")
	public void endpoint_for_Auto_Suggestion(String url) throws Throwable {
		initiateRestAPICall(loadProps.getConfigPropProperty("api.baseURL")+url); 
	}

	@Then("^Verify response status code as (\\d+) for Auto Suggestion$")
	public void verify_response_status_code_as_for_Auto_Suggestion(int statusCodeExpected) throws Throwable {
		assertTrue(validateStatusCode(statusCodeExpected));
	}

	@Given("^validate jsonSchema \"(.*?)\" for Auto Suggestion$")
	public void validate_jsonSchema_for_Auto_Suggestion(String jsonSchemaFilePath) throws Throwable {
		boolean flag = false;
		String errorMsg="Pass";
		try {
			flag = isJsonValid(convertJsonFileToString(JsonReaderCommon.jsonSchemaFolderPath+ jsonSchemaFilePath+".json"), response.asString());

		} catch (ProcessingException e) {
			errorMsg=e.getMessage();
			logger.error("ProcessingException msg::"+e.getMessage());
		} catch (IOException e) {
			errorMsg=e.getMessage();
			logger.error("IOException msg::"+e.getMessage());
		}
		logger.debug("JSON Schema Validate FLAG:: "+flag +"ERROR Txt:"+errorMsg);
		assertTrue(flag,errorMsg);
	}

	@Then("^Read the Auto Suggestion json response$")
	public void read_the_Auto_Suggestion_json_response() throws Throwable {
		apiJsonResponse = new APIJsonResponse(response.asString());
	}

	@Then("^Validate the Auto Suggestion Requried Property Values contains with\"(.*?)\"$")
	public void validate_the_Auto_Suggestion_Requried_Property_Values_contains_with(String propName) throws Throwable {
		assertTrue(apiJsonResponse.isAutoSuggestionPropertyValueNull(propName),Constants.API_ERROR_DESCRIPTION);
	}
	
	
	
	//================================================================================
	
	@Given("^\"(.*?)\" endpoint for Search Suggestion$")
	public void endpoint_for_Search_Suggestion(String url) throws Throwable {
		initiateRestAPICall(loadProps.getConfigPropProperty("api.baseURL")+url); 
	}

	@Then("^Verify response status code as (\\d+) for Search Suggestion$")
	public void verify_response_status_code_as_for_Search_Suggestion(int statusCodeExpected) throws Throwable {
		assertTrue(validateStatusCode(statusCodeExpected));
	}

	@Given("^validate jsonSchema \"(.*?)\" for Search Suggestion$")
	public void validate_jsonSchema_for_Search_Suggestion(String jsonSchemaFilePath) throws Throwable {

		boolean flag = false;
		String errorMsg="Pass";
		try {
			flag = isJsonValid(convertJsonFileToString(JsonReaderCommon.jsonSchemaFolderPath+ jsonSchemaFilePath+".json"), response.asString());

		} catch (ProcessingException e) {
			errorMsg=e.getMessage();
			logger.error("ProcessingException msg::"+e.getMessage());
		} catch (IOException e) {
			errorMsg=e.getMessage();
			logger.error("IOException msg::"+e.getMessage());
		}
		logger.debug("JSON Schema Validate FLAG:: "+flag +"ERROR Txt:"+errorMsg);
		assertTrue(flag,errorMsg);
	}

	@Then("^Read the Search Suggestion json response$")
	public void read_the_Search_Suggestion_json_response() throws Throwable {
		apiJsonResponse = new APIJsonResponse(response.asString());
	}

	@Then("^Validate the Search Suggestion \"(.*?)\" Requried Property Values are not Null$")
	public void validate_the_Search_Suggestion_Requried_Property_Values_are_not_Null(String suggestionType, List<String> propNameList) throws Throwable {
		for(String propName:propNameList){
			assertTrue(apiJsonResponse.isSitecontentPropertyValueNull(suggestionType,propName),Constants.API_ERROR_DESCRIPTION);
		}
	}
	
	
	@Then("^Validate the Search Suggestion \"(.*?)\" Requried Property Values contains with \"(.*?)\"$")
	public void validate_the_Search_Suggestion_Requried_Property_Values_contains_with(String suggestionType, String suggestionText, List<String> propNameList) throws Throwable {
		for(String propName:propNameList){
			assertTrue(apiJsonResponse.isContainsSitecontentPropertyValue(suggestionType,suggestionText,propName),Constants.API_ERROR_DESCRIPTION);
		}
	}
	

}

