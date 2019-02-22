package com.aso.qe.test.stepdefinition.api.plcc;

import org.apache.log4j.Logger;

import com.aso.qe.framework.api.helpers.JSONValidationUtils;
import com.aso.qe.test.common.JsonReaderCommonPlcc;
import com.aso.qe.test.stepdefinition.api.R1SP1_Categories_ProductsByCategorySD;

import cucumber.api.java.en.Given;

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
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommonPlcc.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCAddressPostRequest)+".json");
		logger.info(JsonReaderCommonPlcc.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCAddressPostRequest)+".json");
		//initiateRestPostAPICallWithoutCookiesAndReqStr(endpoints, addressID);
	}
	
	@Given("^\"(.*?)\" endpoint for getting city and State for invalid address$")
	public void endpoint_for_getting_city_and_State_for_invalid_address(String PLCCInvalidAddressCityAndState) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(PLCCInvalidAddressCityAndState);
		logger.debug("END Point URL:"+endpoints);
	}
	
	@Given("^\"(.*?)\" endpoint for getting city and State for invalid url for address$")
	public void endpoint_for_getting_city_and_State_for_invalid_url_for_address(String PLCCInvalidURLAddressCityAndState) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(PLCCInvalidURLAddressCityAndState);
		logger.debug("END Point URL:"+endpoints);
	}
}
