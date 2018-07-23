package com.aso.qe.test.stepdefinition.api;
import static org.testng.Assert.assertTrue;
import org.apache.log4j.Logger;
import com.aso.qe.framework.api.helpers.JSONValidationUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class R1SP1_KER_3276_ProductSuggest extends JSONValidationUtils{
	private static final Logger logger = Logger.getLogger(R1SP1_KER_3276_ProductSuggest.class);


@Given("^\"(.*?)\" endpoint for Product Suggest$")
public void endpoint_for_Product_Suggest(String url) throws Throwable {
	logger.debug("");
	initiateRestAPICall(loadProps.getConfigPropProperty("api.baseURL")+url); 
}

@Then("^Verify response status code as (\\d+) for Product Suggest$")
public void verify_response_status_code_as_for_Product_Suggest(int statusCodeExpected) throws Throwable {
	assertTrue(validateStatusCode(statusCodeExpected));
}

@Given("^validate jsonSchema \"(.*?)\" for Product Suggest$")
public void validate_jsonSchema_for_Product_Suggest(String jsonSchemaFilePath) throws Throwable {
	assertTrue(validateJsonSchema(jsonSchemaFilePath),jsonSchemaValidationErrorMsg);
}

@Then("^Read the Product Suggest json response$")
public void read_the_Product_Suggest_json_response() throws Throwable {
   
}
/*
@Then("^Validate the Product Suggest \"(.*?)\" Requried Property Values are not Null$")
public void validate_the_Product_Suggest_Requried_Property_Values_are_not_Null(String arg1, DataTable arg2) throws Throwable {
    
}

@Then("^Validate the Product Suggest \"(.*?)\" Requried Property Values contains with \"(.*?)\"$")
public void validate_the_Product_Suggest_Requried_Property_Values_contains_with(String arg1, String arg2, DataTable arg3) throws Throwable {
   
}*/

	
}

