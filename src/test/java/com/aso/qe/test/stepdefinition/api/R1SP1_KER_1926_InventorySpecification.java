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
	
//*** Commented out to prevent issues on QA JENKINS JOBS - COMPILCATION ERROR - as on 09/16/2020
	
//	@Given("^\"(.*?)\" endpoint for product attributes$")
//	public void endpoint_for_product_attributes(String url) throws Throwable {
//		logger.debug("");
//		initiateRestAPICall(apiEndpointIP+url);
//	}
//	
//		
//	@Given("^\"(.*?)\" endpoint for Index Specification for get call having application key \"(.*?)\" and id \"(.*?)\"$")
//	public void endpoint_for_Product_Attribute_Index_Specification_for_get_call_id(String url,String key,String id) throws Throwable {
//		logger.debug("");
//		initiateAlgoliaRestAPICall(apiEndpointAlgolia+url,key,id);
//	}
//	
//	@Given("^\"(.*?)\" endpoint for Product Attribute Index Specification for get call for 403 having application key \"(.*?)\" and id \"(.*?)\"$")
//	public void endpoint_for_Product_Attribute_Index_Specification_for_get_call_for_403(String url,String key,String id) throws Throwable {
//		logger.debug("");
//		initiateAlgoliaRestAPICall403(apiEndpointAlgolia+url,key,id);
//	}
//	
//	@Given("^\"(.*?)\" endpoint for Product Attribute Index Specification for post call having application key \"(.*?)\" and id \"(.*?)\"$")
//	public void endpoint_for_Product_Attribute_Index_Specification_for_post(String url,String key,String id) throws Throwable {
//		logger.debug("");
//		initiateAlgoliaPostRestAPICall(apiEndpointAlgolia+url,key,id);
//	}
//	
//	@Given("^\"(.*?)\" endpoint for Product Attribute Index Specification for post 400 having application key \"(.*?)\" and id \"(.*?)\"$")
//	public void endpoint_for_Product_Attribute_Index_Specification_for_post_400(String url,String key,String id) throws Throwable {
//		logger.debug("");
//		initiateAlgoliaPostRestAPICall400(apiEndpointAlgolia+url,key,id);
//	}
//
	@Then("^Verify response status code as (\\d+) for Inventory Specification$")
	public void verify_response_status_code_as_for_Inventory_Specification(int statusCodeExpected) throws Throwable {
		assertTrue(validateStatusCode(statusCodeExpected));
	}

	@Given("^validate jsonSchema \"(.*?)\" for Inventory Specification$")
	public void validate_jsonSchema_for_Inventory_Specification(String jsonSchemaFilePath) throws Throwable {
		assertTrue(validateJsonSchema(jsonSchemaFilePath),jsonSchemaValidationErrorMsg);
	}
	
//	@Given("^validate jsonSchema \"(.*?)\" for Product Attribute Index Specification$")
//	public void validate_jsonSchema_for_Product_Attribute_Index_Specification(String jsonSchemaFilePath) throws Throwable {
//		assertTrue(validateJsonSchema(jsonSchemaFilePath),jsonSchemaValidationErrorMsg);
//	}
	
	
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
	
//	@Then("^Verify server \"([^\"]*)\" in response header$")
//	public void verify_server_in_response_header(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	   validateserver(arg1);
//	}
//
//	@Then("^Verify the value of a field \"([^\"]*)\" in the response$")
//	public void verify_the_value_of_a_field_in_the_response(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		validatefieldfromresponse(arg1);
//	}

	
}
