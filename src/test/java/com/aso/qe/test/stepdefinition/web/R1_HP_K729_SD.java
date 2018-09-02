package com.aso.qe.test.stepdefinition.web;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_FindStore_PO;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;

import cucumber.api.java.en.Then;

public class R1_HP_K729_SD extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(R1_HP_K729_SD.class);
	R1_FindStore_PO findStorePO= PageFactory.initElements(driver, R1_FindStore_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader= PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);

	

	@Then("^User should be able to see Weekly Ad link$")
	public void User_should_be_able_to_see_Weekly_Ad_link() throws Throwable {
		logger.debug("User_should_be_able_to_see_Weekly_Ad_link");
		globalElementHeader.validateWeeklyAdLinkPresence();

	}

	
	
}
