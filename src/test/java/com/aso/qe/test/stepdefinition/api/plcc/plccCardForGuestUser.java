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

public class plccCardForGuestUser extends JSONValidationUtils {
	private static final Logger logger = Logger.getLogger(R1SP1_Categories_ProductsByCategorySD.class);
	public static String regEmailId;
	
	@Given("^\"(.*?)\" endpoint for getting plc card for guest user$")
	public void endpoint_for_getting_plc_card_for_guest_user(String PLCCCardForGuestUser) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(PLCCCardForGuestUser);
		logger.debug("END Point URL:"+endpoints);
	}


}
