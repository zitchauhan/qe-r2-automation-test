package com.aso.qe.test.stepdefinition.api;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;

import com.aso.qe.framework.api.helpers.CategoryDetailsResponse;
import com.aso.qe.framework.api.helpers.JSONValidationUtils;
import com.aso.qe.framework.api.json.JsonReaderCommon;
import com.aso.qe.framework.common.Constants;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class R1SP1_CategoryDetailsSD extends JSONValidationUtils
{
	private static final Logger logger = Logger.getLogger(R1SP1_CategoryDetailsSD.class);
	public CategoryDetailsResponse categoryDetailsResponse;
	
	@Given("^\"(.*?)\" endpoint for Category \"(.*?)\"$")
	public void endpoint_for_Category(String endpoint, String CategoryID)
	{
		String endpoints=apiEndpointIP+loadProps.getEndpointProProperty(endpoint)+CategoryID;
		initiateRestAPICall(endpoints);
	
	}
	
	@Then("^Verify response status code as (\\d+) for Category$")
	public void verify_response_status_code_as_for_Category(int statusCodeExpected)
	{
		boolean flag = validateStatusCode(statusCodeExpected);
		logger.debug("Status Code FLAG::"+flag);
		assertTrue(flag);
		
	}

	@Then("^validate jsonSchema \"(.*?)\" for CategoryDetail$")
	public void validate_jsonSchema_for_CategoryDetail(String jsonSchemaFilePath)
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
	
	@Then("^Verify the response error \"(.*?)\" for CategoryDetail$")
	public void verify_the_response_error_for_CategoryDetail(String expectedError)
	{
		logger.debug("RESPONSE:: "+response.asString());
		String responseStr = response.asString();
		boolean flag = false;
		if(responseStr!= null &&responseStr.contains(expectedError)){
			flag = true;
		}
		assertTrue(flag);
		//ErrorCode404Response errorCode404Response =JsonReaderCommon.readErrorCode404Response(response.asString());
		//assertEquals(expectedError, errorCode404Response.getError());
	}

	@Then("^Verify the response message \"(.*?)\" for CategoryDetail$")
	public void verify_the_response_message_for_CategoryDetail(String expectedMsg)
	{
		logger.debug(" RESPONSE ::"+response.asString());
		String responseStr = response.asString();
		boolean flag = false;
		if(responseStr!= null && responseStr.contains(expectedMsg)){
			flag= true;
		}
		assertTrue(flag);
		//ErrorCode404Response errorCode404Response =JsonReaderCommon.readErrorCode404Response(response.asString());
		//logger.debug("&&&&&---errorCode404Response.getMessage()---&&&&& :: "+errorCode404Response.getMessage());
		//assertEquals(expectedMsg, errorCode404Response.getMessage());
		
	}
	
	@Given("^\"(.*?)\" endpoint for Category$")
	public void endpoint_for_Category(String endpoint)
	{
		String endpoints=apiEndpointIP+loadProps.getEndpointProProperty(endpoint);
		logger.debug("For 400 endpoint:: "+endpoint);
		String errorResp = initiateErrorRestAPICall(endpoints);
		logger.debug("ERROR RESPONSE:: "+errorResp);
		boolean flag = false;
		if(errorResp!= null && errorResp.contains("400")){
			flag= true;
		}
		assertTrue(flag);
	}
	
	@Then("^Verify Error response status code as (\\d+) for Category$")
	public void verify_Error_response_status_code_as_for_Category(int statusCodeExpected)
	{
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
	
	@Then("^Read the CategoryDetails json response$")
	public void read_the_CategoryDetails_json_response() throws Throwable {
		categoryDetailsResponse = new CategoryDetailsResponse(response.asString());
	}
	
	@Then("^Validate the CategoryDetails Requried Property Value are not Null$")
	public void validate_the_CategoryDetails_Requried_Property_Value_are_not_Null(List<String> propNameList) throws Throwable {
		for(String propName:propNameList){
			assertTrue(categoryDetailsResponse.isCategoryPropertyValueNull(propName),Constants.API_ERROR_DESCRIPTION);
		}
	}
	
	@Then("^Validate the Category SubCategory Requried Property Value are not Null$")
	public void validate_the_Category_SubCategory_Requried_Property_Value_are_not_Null(List<String> propNameList) throws Throwable {
		for(String propName:propNameList){
			assertTrue(categoryDetailsResponse.isSubCategoryPropertyValueNull(propName),Constants.API_ERROR_DESCRIPTION);
		}
	}
}

