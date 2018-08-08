package com.aso.qe.test.stepdefinition.api;

import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;

import com.aso.qe.framework.api.helpers.JSONValidationUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class R1SP1_KER_556_SearchFacetedSearch extends JSONValidationUtils{
	private static final Logger logger = Logger.getLogger(R1SP1_KER_556_SearchFacetedSearch.class);

	@Given("^\"(.*?)\" endpoint for Search Faceted Search$")
	public void endpoint_for_Search_Faceted_Search(String url) throws Throwable {
		logger.debug("");
		initiateRestAPICall(apiEndpointIP+loadProps.getEndpointProProperty(url));
	}

	@Then("^Verify response status code as (\\d+) for Search Faceted Search$")
	public void verify_response_status_code_as_for_Search_Faceted_Search(int statusCodeExpected) throws Throwable {
		assertTrue(validateStatusCode(statusCodeExpected));
	}

	@Given("^validate jsonSchema \"(.*?)\" for Search Faceted Search$")
	public void validate_jsonSchema_for_Search_Faceted_Search(String jsonSchemaFilePath) throws Throwable {
		assertTrue(validateJsonSchema(jsonSchemaFilePath),jsonSchemaValidationErrorMsg);
	}
	
}
