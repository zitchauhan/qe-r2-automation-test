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

public class MyAccountWallet extends JSONValidationUtils {
	private static final Logger logger = Logger.getLogger(R1SP1_Categories_ProductsByCategorySD.class);
	public static String regEmailId;
	
	@Given("^\"(.*?)\" endpoint for getting all the credit cards$")
	public void endpoint_for_getting_all_the_credit_cards(String PLCCGetAllCreditCards) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(PLCCGetAllCreditCards);
		logger.debug("END Point URL:"+endpoints);
	}
	
	@Given("^\"(.*?)\" endpoint with \"(.*?)\" for adding a credit card for plcc$")
	public void endpoint_with_for_adding_a_credit_card_for_plcc(String PLCCAddAddressURLr2, String PLCCAddCreditCardPostRequest) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(PLCCAddAddressURLr2);
		logger.debug("END Point URL:"+endpoints);
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommon.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCAddCreditCardPostRequest)+".json");
		logger.info(JsonReaderCommon.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCAddCreditCardPostRequest)+".json");
	}
	
	@Given("^\"(.*?)\" endpoint with \"(.*?)\" for updating a credit card for plcc$")
	public void endpoint_with_for_updating_a_credit_card_for_plcc(String PLCCUpdateAddressURLr2, String PLCCUpdateCreditCardPostRequest) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(PLCCUpdateAddressURLr2);
		logger.debug("END Point URL:"+endpoints);
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommon.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCUpdateCreditCardPostRequest)+".json");
		logger.info(JsonReaderCommon.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCUpdateCreditCardPostRequest)+".json");
	}

}
