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

public class addressGetCityandState extends JSONValidationUtils {
	private static final Logger logger = Logger.getLogger(R1SP1_Categories_ProductsByCategorySD.class);
	public static String regEmailId;
	
	@Given("^\"(.*?)\" endpoint for getting city and State of users address$")
	public void endpoint_for_getting_city_and_State_of_users_address(String PLCCAddressCityAndState) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(PLCCAddressCityAndState);
		logger.debug("END Point URL:"+endpoints);
		//initiateRestAPICallWithCookie(endpoints);
	}
	
	@Given("^\"(.*?)\" with \"(.*?)\" endpoint for address validation of a profile$")
	public void with_endpoint_for_address_validation_of_a_profile(String PLCCAddressURL, String PLCCAddressPostRequest) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(PLCCAddressURL);
		logger.debug("END Point URL:"+endpoints);
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommon.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCAddressPostRequest)+".json");
		logger.info(JsonReaderCommon.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCAddressPostRequest)+".json");
		//initiateRestPostAPICallWithoutCookiesAndReqStr(endpoints, addressID);
	}
}
