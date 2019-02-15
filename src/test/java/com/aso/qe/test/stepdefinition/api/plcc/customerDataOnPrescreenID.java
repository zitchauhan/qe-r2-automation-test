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

public class customerDataOnPrescreenID extends JSONValidationUtils {
	private static final Logger logger = Logger.getLogger(R1SP1_Categories_ProductsByCategorySD.class);
	public static String regEmailId;
	
	@Given("^\"(.*?)\" endpoint for getting cutomer data based on prescreenID$")
	public void endpoint_for_getting_cutomer_data_based_on_prescreenID(String PLCCCustomerDataBasedonPrescreenID) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(PLCCCustomerDataBasedonPrescreenID);
		logger.debug("END Point URL:"+endpoints);
		//initiateRestAPICallWithCookie(endpoints);
	}
	
	@Given("^\"(.*?)\" endpoint for Invalid prescreenID$")
	public void endpoint_for_Invalid_prescreenID(String PLCCInvalidPrescreenID) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(PLCCInvalidPrescreenID);
		logger.debug("END Point URL:"+endpoints);
	}

	@Then("^Verify response status (\\d+) for plcc$")
	public void verify_response_status_for_plcc(int statusCodeExpected) throws Throwable {
		String errorTxt = getErrorTxt();
		logger.debug("404 Error Text::"+errorTxt);
		if(errorTxt != null && errorTxt.contains(String.valueOf(statusCodeExpected))){
			logger.debug("404 error code validation PASS");
			assertTrue(true);
		}else{
			logger.debug("404 error code validation FAIL");
			assertTrue(false);
		}
	}


}
