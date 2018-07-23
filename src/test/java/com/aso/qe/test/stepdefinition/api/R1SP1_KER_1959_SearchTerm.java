package com.aso.qe.test.stepdefinition.api;

import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;

import com.aso.qe.framework.api.helpers.APIJsonResponse;
import com.aso.qe.framework.api.helpers.JSONValidationUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class R1SP1_KER_1959_SearchTerm extends JSONValidationUtils{
	private static final Logger logger = Logger.getLogger(R1SP1_KER_1959_SearchTerm.class);
	public APIJsonResponse apiJsonResponse;




	@Given("^\"(.*?)\" endpoint for Search by SearchTerm$")
	public void endpoint_for_Search_by_SearchTerm(String url) throws Throwable {
		logger.debug("");
		initiateRestAPICall(loadProps.getConfigPropProperty("api.baseURL")+url); 
	}

	@Then("^Verify response status code as (\\d+) for Search by SearchTerm$")
	public void verify_response_status_code_as_for_Search_by_SearchTerm(int statusCodeExpected) throws Throwable {
		assertTrue(validateStatusCode(statusCodeExpected));
	}

	@Given("^validate jsonSchema \"(.*?)\" for Search by SearchTerm$")
	public void validate_jsonSchema_for_Search_by_SearchTerm(String jsonSchemaFilePath) throws Throwable {
		assertTrue(validateJsonSchema(jsonSchemaFilePath),jsonSchemaValidationErrorMsg);
	}

	@Given("^\"(.*?)\" endpoint for Search by SearchTerm by page size and page number$")
	public void endpoint_for_Search_by_SearchTerm_by_page_size_and_page_number(String url) throws Throwable {
		initiateRestAPICall(loadProps.getConfigPropProperty("api.baseURL")+url); 
	}

	@Then("^Verify response status code as (\\d+) for Search by SearchTerm by page size and page number$")
	public void verify_response_status_code_as_for_Search_by_SearchTerm_by_page_size_and_page_number(int statusCodeExpected) throws Throwable {
		assertTrue(validateStatusCode(statusCodeExpected));
	}

	@Given("^validate jsonSchema \"(.*?)\" for Search by SearchTerm by page size and page number$")
	public void validate_jsonSchema_for_Search_by_SearchTerm_by_page_size_and_page_number(String jsonSchemaFilePath) throws Throwable {
		
		assertTrue(validateJsonSchema(jsonSchemaFilePath),jsonSchemaValidationErrorMsg);
	}

}

