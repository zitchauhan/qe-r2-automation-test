package com.aso.qe.test.stepdefinition.api;

import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;

import com.aso.qe.framework.api.helpers.JSONValidationUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class R1SP1_KER_1926_InventorySpecification extends JSONValidationUtils{
	private static final Logger logger = Logger.getLogger(R1SP1_KER_1926_InventorySpecification.class);

	@Given("^\"(.*?)\" endpoint for Inventory Specification$")
	public void endpoint_for_Inventory_Specification(String url) throws Throwable {
		logger.debug("");
		initiateRestAPICall(apiEndpointIP+url);
	}

	@Then("^Verify response status code as (\\d+) for Inventory Specification$")
	public void verify_response_status_code_as_for_Inventory_Specification(int statusCodeExpected) throws Throwable {
		assertTrue(validateStatusCode(statusCodeExpected));
	}

	@Given("^validate jsonSchema \"(.*?)\" for Inventory Specification$")
	public void validate_jsonSchema_for_Inventory_Specification(String jsonSchemaFilePath) throws Throwable {
		assertTrue(validateJsonSchema(jsonSchemaFilePath),jsonSchemaValidationErrorMsg);
	}
	
	
	@Given("^\"(.*?)\" endpoint for Inventory Store Specification$")
	public void endpoint_for_Inventory_Store_Specification(String url) throws Throwable {
		initiateRestAPICall(apiEndpointIP+url);
	}

	@Then("^Verify response status code as (\\d+) for Inventory Store Specification$")
	public void verify_response_status_code_as_for_Inventory_Store_Specification(int statusCodeExpected) throws Throwable {
		assertTrue(validateStatusCode(statusCodeExpected));
	}

	@Given("^validate jsonSchema \"(.*?)\" for Inventory Store Specification$")
	public void validate_jsonSchema_for_Inventory_Store_Specification(String jsonSchemaFilePath) throws Throwable {
		assertTrue(validateJsonSchema(jsonSchemaFilePath),jsonSchemaValidationErrorMsg);
	}
	
	@Given("^\"(.*?)\" endpoint for Inventory Product Store Specification$")
	public void endpoint_for_Inventory_Product_Store_Specification(String url) throws Throwable {
		initiateRestAPICall(apiEndpointIP+url);
	}

	@Then("^Verify response status code as (\\d+) for Inventory Product Store Specification$")
	public void verify_response_status_code_as_for_Inventory_Product_Store_Specification(int statusCodeExpected) throws Throwable {
		assertTrue(validateStatusCode(statusCodeExpected));
	}

	@Given("^validate jsonSchema \"(.*?)\" for Inventory Product Store Specification$")
	public void validate_jsonSchema_for_Inventory_Product_Store_Specification(String jsonSchemaFilePath) throws Throwable {
		assertTrue(validateJsonSchema(jsonSchemaFilePath),jsonSchemaValidationErrorMsg);
	}
}
