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

public class applyInstantCreditCard extends JSONValidationUtils {
	private static final Logger logger = Logger.getLogger(R1SP1_Categories_ProductsByCategorySD.class);
	public static String regEmailId;
	
	@Given("^\"(.*?)\" endpoint with \"(.*?)\" for applying instant credit card$")
	public void endpoint_with_for_applying_instant_credit_card(String PLCCApplyInstantCardURLr2, String PLCCApplyInstantCardPostRequest) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(PLCCApplyInstantCardURLr2);
		logger.debug("END Point URL:"+endpoints);
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommon.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCApplyInstantCardPostRequest)+".json");
		logger.info(JsonReaderCommon.jsonRequestFolderPathPLCC+ loadProps.getTestDataProperty(PLCCApplyInstantCardPostRequest)+".json");
		//initiateRestPostAPICallWithoutCookiesAndReqStr(endpoints, addressID);
	}
}
