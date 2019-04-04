package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R1_HP_K1400_SD extends CommonActionHelper
{

	R1_GlobalElementHeader_Home_PO globalElementHeader= PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	
	
	@And("^User click on sign up for more deals and verify the modal$")
	public void User_click_on_sign_up_for_more_deals_and_verify_the_modal() {
		assertTrue(clickOnButton(globalElementHeader.lnkSIGNUPFORMOREDEALS));
		assertTrue(isDisplayed(globalElementHeader.lnkSIGNUPFORMOREDEALSMODAL));
	}

	@Then("^user enter the data and click on submit$")
	public void user_enter_the_data_and_click_on_submit() throws InterruptedException {
		assertTrue(clickOnButton(globalElementHeader.lnkSIGNUPFORMOREDEALSEMAIL));
		assertTrue(clickOnButton(globalElementHeader.lnkSIGNUPFORMOREDEALSEMAIL));
		setInputText(globalElementHeader.lnkSIGNUPFORMOREDEALSEMAIL, "SignUpTest@gmail.com");
		assertTrue(clickOnButton(globalElementHeader.lnkSIGNUPFORMOREDEALSZIPCODE));
		setInputText(globalElementHeader.lnkSIGNUPFORMOREDEALSZIPCODE, "78235");
		assertTrue(clickOnButton(globalElementHeader.lnkSIGNUPFORMOREDEALSSUBMIT));
	}
	
	@And("^user verify the success message$")
	public void user_verify_the_success_message() throws InterruptedException {
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(globalElementHeader.lnkSIGNUPFORMOREDEALSSUCCESSMESSAGE_M));
			Thread.sleep(Constants.thread_low);
			assertTrue(clickOnButton(globalElementHeader.btnCloseCrossSuccess));
		} else {
			assertTrue(isDisplayed(globalElementHeader.lnkSIGNUPFORMOREDEALSSUCCESSMESSAGE_D));
			Thread.sleep(Constants.thread_low);
			assertTrue(clickOnButton(globalElementHeader.btnCloseCrossSuccess));
		}
	}
}
