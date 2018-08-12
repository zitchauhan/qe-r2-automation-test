package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R1SP1_KER_1400_Web_SD extends CommonActionHelper{

	GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	
	
	@And("^User click on sign up for more deals and verify the modal$")
	public void User_click_on_sign_up_for_more_deals_and_verify_the_modal() {
		assertTrue(clickOnButton(globalElementHeader.lnkSIGNUPFORMOREDEALS));
		assertTrue(isDisplayed(globalElementHeader.lnkSIGNUPFORMOREDEALSMODAL));
	}

	@Then("^user enter the data and click on submit$")
	public void user_enter_the_data_and_click_on_submit() throws InterruptedException {
		assertTrue(clickOnButton(globalElementHeader.lnkSIGNUPFORMOREDEALSEMAIL));
		assertTrue(clickOnButton(globalElementHeader.lnkSIGNUPFORMOREDEALSEMAIL));
		setInputText(globalElementHeader.lnkSIGNUPFORMOREDEALSEMAIL, "qaz2@gmail.com");
		assertTrue(clickOnButton(globalElementHeader.lnkSIGNUPFORMOREDEALSZIPCODE));
		setInputText(globalElementHeader.lnkSIGNUPFORMOREDEALSZIPCODE, "78235");
		assertTrue(clickOnButton(globalElementHeader.lnkSIGNUPFORMOREDEALSSUBMIT));
	}
	
	@And("^user verify the success message$")
	public void user_verify_the_success_message() throws InterruptedException {
		assertTrue(isDisplayed(globalElementHeader.lnkSIGNUPFORMOREDEALSSUCCESSMESSAGE));
	}
}
