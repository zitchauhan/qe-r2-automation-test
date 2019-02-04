package com.aso.qe.test.stepdefinition.web.plcc;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_LandingPage_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_LP_35_Web extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_LandingPage_PO plccLandingPageObjects = PageFactory.initElements(driver, R1_PLCC_LandingPage_PO.class);
	@When("^user click on manage your card link$")
	public void user_click_on_manage_your_card_link() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfManageYourCardLink();
		plccLandingPageObjects.manageYourCardLink.click();
	}
	@Then("^user navigates to bank page$")
	public void user_navigates_to_bank_page() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfBankPage();
	}
}
