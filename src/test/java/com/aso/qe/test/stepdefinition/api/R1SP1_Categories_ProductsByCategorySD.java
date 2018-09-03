package com.aso.qe.test.stepdefinition.api;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;

import com.aso.qe.framework.api.helpers.APIJsonResponse;
import com.aso.qe.framework.api.helpers.JSONValidationUtils;
import com.aso.qe.framework.api.helpers.ProductsByCategoryResponse;
import com.aso.qe.framework.api.json.ErrorCode404Response;
import com.aso.qe.framework.api.json.JsonReaderCommon;
import com.aso.qe.framework.common.Constants;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class R1SP1_Categories_ProductsByCategorySD extends JSONValidationUtils{
	private static final Logger logger = Logger.getLogger(R1SP1_Categories_ProductsByCategorySD.class);
	public ProductsByCategoryResponse productsByCategoryResponse;
	public APIJsonResponse apiJsonResponse;
	
	@Given("^\"(.*?)\" endpoint for product \"(.*?)\"$")
	public void endpoint_for_product(String endpoint, String CategoryID) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getEndpointProProperty(endpoint)+CategoryID+"/products";
		initiateRestAPICall(endpoints);

	}

	@Then("^validate jsonSchema \"(.*?)\" with jsonResponse$")
	public void validate_jsonSchema_with_jsonResponse(String jsonSchemaFilePath)
	{
		try {
			boolean flag = isJsonValid(convertJsonFileToString(JsonReaderCommon.jsonSchemaFolderPath+ jsonSchemaFilePath+".json"), response.asString());
			logger.debug("JSON Schema Validate FLAG:: "+flag);
			assertTrue(flag);
		} catch (ProcessingException e) {
			assertTrue(false,e.getMessage());
			logger.error("ProcessingException msg:"+e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			assertTrue(false,e.getMessage());
			logger.error("IOException msg:"+e.getMessage());
			e.printStackTrace();
		}

	}


	@Then("^Verify response status code as (\\d+)$")
	public void verify_response_status_code_as(int statusCodeExpected)
	{

		boolean flag = validateStatusCode(statusCodeExpected);
		logger.debug("FLAG::"+flag);
		assertTrue(flag);


	}

	@Given("^\"(.*?)\" endpoint for Facets \"(.*?)\"$")
	public void endpoint_for_Facets(String endpoint, String CategoryID)
	{
		String endpoints=apiEndpointIP+loadProps.getEndpointProProperty(endpoint)+CategoryID+"/facets";
		initiateRestAPICall(endpoints);

	}

	@Given("^\"(.*?)\" endpoint for product and Facets with \"(.*?)\"$")
	public void endpoint_for_product_and_Facets_with(String endpoint, String CategoryID)
	{
		String endpoints=apiEndpointIP+loadProps.getEndpointProProperty(endpoint)+CategoryID+"/products?displayFacets=true";
		initiateRestAPICall(endpoints);

	}

	@Given("^\"(.*?)\" endpoint for product with \"(.*?)\"$")
	public void endpoint_for_product_with(String endpoint, String CategoryID)
	{
		String endpoints=apiEndpointIP+loadProps.getEndpointProProperty(endpoint)+CategoryID+"/products"+1;
		initiateRestAPICall(endpoints);

	}

	@Then("^Verify the response error \"(.*?)\"$")
	public void verify_the_response_error(String expectedError)
	{
		ErrorCode404Response errorCode404Response =JsonReaderCommon.readErrorCode404Response(response.asString());
		assertEquals(expectedError, errorCode404Response.getError());
	}

	@Then("^Verify the response message \"(.*?)\"$")
	public void verify_the_response_message(String expectedMsg)
	{
		logger.debug("JSON Response::"+response.asString());
		ErrorCode404Response errorCode404Response =JsonReaderCommon.readErrorCode404Response(response.asString());
		assertEquals(expectedMsg, errorCode404Response.getMessage());
		logger.debug("&&&&&---errorCode404Response.getMessage()---&&&&& :: "+errorCode404Response.getMessage());

	}

	@Given("^\"(.*?)\" endpoint for facets with \"(.*?)\"$")
	public void endpoint_for_facets_with(String endpoint, String CategoryID)
	{
		String endpoints=apiEndpointIP+loadProps.getEndpointProProperty(endpoint)+CategoryID+"/facets"+1;
		initiateRestAPICall(endpoints);
	}


	@Then("^validate jsonSchema \"(.*?)\"$")
	public void validate_jsonSchema(String jsonSchemaFilePath){

		try {
			boolean flag = isJsonValid(convertJsonFileToString(JsonReaderCommon.jsonSchemaFolderPath+ jsonSchemaFilePath+".json"), response.asString());
			logger.debug("JSON Schema Validate FLAG:: "+flag);
			assertTrue(flag);
		} catch (ProcessingException e) {
			logger.debug("ProcessingException:: "+e.getMessage());
		} catch (IOException e) {
			logger.debug("IOException:: "+e.getMessage());
		}
	}

	@Then("^read the ProductsByCategory json response$")
	public void read_the_ProductsByCategory_json_response() throws Throwable {
		productsByCategoryResponse = new ProductsByCategoryResponse(response.asString());
	}
	

	@Then("^Validate ProductInfo Requried Property Value are not Null$")
	public void validate_ProductInfo_Requried_Property_Value_are_not_Null(List<String> propNameList) throws Throwable {
		for(String propName:propNameList){
			assertTrue(productsByCategoryResponse.isPropertyValueNull(propName,productsByCategoryResponse.productinfoArray),Constants.API_ERROR_DESCRIPTION);
		}
	}
	
	@Then("^Validate FacetsInfo Requried Property Value are not Null$")
	public void validate_FacetsInfo_Requried_Property_Value_are_not_Null(List<String> propNameList) throws Throwable {
		for(String propName:propNameList){
			assertTrue(productsByCategoryResponse.isPropertyValueNull(propName,productsByCategoryResponse.facetsArray),Constants.API_ERROR_DESCRIPTION);
		}
	}

	@Then("^Validate ProductInfo defaultSkuPrice Requried Property Value are not Null$")
	public void validate_ProductInfo_defaultSkuPrice_Requried_Property_Value_are_not_Null(List<String> propNameList) throws Throwable {
		for(String propName:propNameList){
			assertTrue(productsByCategoryResponse.isProductInfoDefaultSkuPricePropertyValueNull(propName),Constants.API_ERROR_DESCRIPTION);
		}
	}
	
	@Then("^Validate FacetsInfo labels Requried Property Value are not Null$")
	public void validate_FacetsInfo_lables_Requried_Property_Value_are_not_Null(List<String> propNameList) throws Throwable {
		for(String propName:propNameList){
			assertTrue(productsByCategoryResponse.isFacetsLabelsPropertyValueNull(propName),Constants.API_ERROR_DESCRIPTION);
		}
	}

	@Then("^Validate sortByInfo Requried Property Value are not Null$")
	public void validate_ProductInfo_sortByInfo_Requried_Property_Value_are_not_Null(List<String> propNameList) throws Throwable {
		for(String propName:propNameList){
			assertTrue(productsByCategoryResponse.isSortByInfoPropertyValueNull(propName),Constants.API_ERROR_DESCRIPTION);
		}
	}
	
	@Then("^read the API json response$")
	public void read_the_API_json_response() throws Throwable {
		apiJsonResponse = new APIJsonResponse(response.asString());
	}
	
	@Then("^Validate the API Requried Property Value are not Null$")
	public void validate_API_Requried_Property_Value_are_not_Null(List<String> propNameList) throws Throwable {
		for(String propName:propNameList){
			assertTrue(apiJsonResponse.isPropertyValueNull(propName),Constants.API_ERROR_DESCRIPTION);
		}
	}
	
	@Then("^Validate the Search by SearchTerm Requried Property Values contains with \"(.*?)\"$")
	public void validate_the_Search_by_SearchTerm_Requried_Property_Values_contains_with(String searchTxt, List<String> propNameList) throws Throwable {
		for(String propName:propNameList){
			assertTrue(productsByCategoryResponse.isContainsPropertyValueNull(propName,searchTxt,productsByCategoryResponse.productinfoArray),Constants.API_ERROR_DESCRIPTION);
			//assertTrue(productsByCategoryResponse.isContainsBreadcrumbPropertyValue("breadcrumb", searchTxt, propName),Constants.API_ERROR_DESCRIPTION);
		}
	}
	
	@Then("^Validate the Search by SearchTerm \"(.*?)\" Requried Property Values contains with \"(.*?)\"$")
	public void validate_the_Search_by_SearchTerm_Requried_Property_Values_contains_with(String propertyType, String searchTxt, List<String> propNameList) throws Throwable {
		for(String propName:propNameList){
			assertTrue(productsByCategoryResponse.isContainsBreadcrumbPropertyValue(propertyType,searchTxt,propName),Constants.API_ERROR_DESCRIPTION);
		}
	}
	
	
	@Then("^Validate the Inventory Specification API Requried Property Value are not Null$")
	public void validate_the_Inventory_Specification_API_Requried_Property_Value_are_not_Null(List<String> propNameList) throws Throwable {
		for(String propName:propNameList){
			assertTrue(apiJsonResponse.verifyInventorySpecificationOnline(propName,"online"),Constants.API_ERROR_DESCRIPTION);
		}
	}
	
	@Then("^Validate the Inventory Store Specification API Requried Property Value are not Null$")
	public void validate_the_Inventory_Store_Specification_API_Requried_Property_Value_are_not_Null(List<String> propNameList) throws Throwable {
		for(String propName:propNameList){
			assertTrue(apiJsonResponse.verifyInventorySpecificationOnline(propName,"online"),Constants.API_ERROR_DESCRIPTION);
		}
	}
	
	@Then("^Validate the Product PDP \"(.*?)\" with \"(.*?)\" API Requried Property Value are not Null$")
	public void validate_the_Product_PDP_inventory_store_API_Requried_Property_Value_are_not_Null(String rootElement, String type, List<String> propNameList) throws Throwable {
		for(String propName:propNameList){
			assertTrue(apiJsonResponse.verifyInventoryStoreOnline(propName,rootElement, type),Constants.API_ERROR_DESCRIPTION);
		}
	}
	
	@Then("^Validate the \"(.*?)\" with \"(.*?)\" API Requried Property Value are not Null$")
	public void validate_the_addToCart_inventory_store_API_Requried_Property_Value_are_not_Null(String rootElement, String type, List<String> propNameList) throws Throwable {
		for(String propName:propNameList){
			assertTrue(apiJsonResponse.verifyInventoryStoreOnline(propName,rootElement, type),Constants.API_ERROR_DESCRIPTION);
		}
	}
	
	
	@Then("^Validate the Add to Cart API Requried Property Value are not Null$")
	public void validate_the_AddToCart_API_Requried_Property_Value_are_not_Null(List<String> propNameList) throws Throwable {
		for(String propName:propNameList){
			assertTrue(apiJsonResponse.verifyAddtoCartProp(propName,"addToCart"),Constants.API_ERROR_DESCRIPTION);
		}
	}
	
	@Given("^Validate the Product PDP \"(.*?)\" API Requried Property Value are not Null$")
	public void validate_the_Product_PDP_API_Requried_Property_Value_are_not_Null(String rootName, List<String> propNameList) throws Throwable {
		for(String propName:propNameList){
			assertTrue(apiJsonResponse.verifyAddtoCartProp(propName,rootName),Constants.API_ERROR_DESCRIPTION);
		}
	}
	
	@Given("^Validate the \"(.*?)\" API Requried Property Value are not Null$")
	public void validate_the_API_Requried_Property_Value_are_not_Null(String rootName, List<String> propNameList) throws Throwable {
		for(String propName:propNameList){
			assertTrue(apiJsonResponse.verifyAddtoCartProp(propName,rootName),Constants.API_ERROR_DESCRIPTION);
		}
	}
	
}
