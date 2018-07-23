package com.aso.qe.test.stepdefinition.api;

import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;

import com.aso.qe.framework.api.helpers.JSONValidationUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class R1SP1_KER_2606_ProductPDP extends JSONValidationUtils{
	private static final Logger logger = Logger.getLogger(R1SP1_KER_2606_ProductPDP.class);

	@Given("^\"(.*?)\" endpoint for Product PDP Specification$")
	public void endpoint_for_Product_PDP_Specification(String url) throws Throwable {
		logger.debug("");
		initiateRestAPICall(loadProps.getConfigPropProperty("api.baseURL")+url);
	}

	@Then("^Verify response status code as (\\d+) for Product PDP Specification$")
	public void verify_response_status_code_as_for_Product_PDP_Specification(int statusCodeExpected) throws Throwable {
		assertTrue(validateStatusCode(statusCodeExpected));
	}

	@Given("^validate jsonSchema \"(.*?)\" for Product PDP Specification$")
	public void validate_jsonSchema_for_Product_PDP_Specification(String jsonSchemaFilePath) throws Throwable {
		assertTrue(validateJsonSchema(jsonSchemaFilePath),jsonSchemaValidationErrorMsg);
	}
	
	@Given("^\"(.*?)\" endpoint for BundleProduct PDP Specification$")
	public void endpoint_for_BundleProduct_PDP_Specification(String url) throws Throwable {
		initiateRestAPICall(loadProps.getConfigPropProperty("api.baseURL")+url);
	}

	@Then("^Verify response status code as (\\d+) for BundleProduct PDP Specification$")
	public void verify_response_status_code_as_for_BundleProduct_PDP_Specification(int statusCodeExpected) throws Throwable {
		assertTrue(validateStatusCode(statusCodeExpected));
	}

	@Given("^validate jsonSchema \"(.*?)\" for BundleProduct PDP Specification$")
	public void validate_jsonSchema_for_BundleProduct_PDP_Specification(String jsonSchemaFilePath) throws Throwable {
		assertTrue(validateJsonSchema(jsonSchemaFilePath),jsonSchemaValidationErrorMsg);
	}


}
