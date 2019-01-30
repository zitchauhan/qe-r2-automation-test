package com.aso.qe.test.stepdefinition.web.plcc;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.common.Common_Web_PLCC;
import com.aso.qe.test.pageobject.R1_PLCC_CreditCardApplicationModal_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;
import com.aso.qe.test.pageobject.R1_PLCC_LandingPage_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_CCAM_PreScreen_52_Web extends Common_Web_PLCC  {
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);
	R1_PLCC_LandingPage_PO plccLandingPageObjects = PageFactory.initElements(driver, R1_PLCC_LandingPage_PO.class);
	R1_PLCC_CreditCardApplicationModal_PO plccCCApplicationModalObjects = PageFactory.initElements(driver,
			R1_PLCC_CreditCardApplicationModal_PO.class);
	@When("^user clear and enter First Name on credit card Application Modal \"(.*?)\"$")
	public void user_clear_and_enter_First_Name_on_credit_card_Application_Modal(String arg1) throws Throwable {
	    clearInputBox(plccCCApplicationModalObjects.firstNameCCModal);
		plccCCApplicationModalObjects.enterFNCCModal(arg1);
		assertTrue(isDisplayed(plccCCApplicationModalObjects.firstNameCCModal));
		waitForElement(plccCCApplicationModalObjects.firstNameCCModal);
	}

	@Then("^user clear and enter Last Name on credit card Application Modal \"(.*?)\"$")
	public void user_clear_and_enter_Last_Name_on_credit_card_Application_Modal(String arg1) throws Throwable {
		clearInputBox(plccCCApplicationModalObjects.lastNameCCModal);
		plccCCApplicationModalObjects.enterLNCCModal(arg1);
		assertTrue(isDisplayed(plccCCApplicationModalObjects.lastNameCCModal));
		waitForElement(plccCCApplicationModalObjects.lastNameCCModal);
	}

	@Then("^user clear and enter Street Address \"(.*?)\"$")
	public void user_clear_and_enter_Street_Address(String arg1) throws Throwable {
		clearInputBox(plccCCApplicationModalObjects.streetAddressCCModal);
		plccCCApplicationModalObjects.enterStreetAddressCCModal(arg1);
		assertTrue(isDisplayed(plccCCApplicationModalObjects.streetAddressCCModal));
		waitForElement(plccCCApplicationModalObjects.streetAddressCCModal);
	}

	@Then("^user clear and enter City \"(.*?)\"$")
	public void user_clear_and_enter_City(String arg1) throws Throwable {
		clearInputBox(plccCCApplicationModalObjects.cityCModal);
		plccCCApplicationModalObjects.enterCityCCModal(arg1);
		assertTrue(isDisplayed(plccCCApplicationModalObjects.cityCModal));
		waitForElement(plccCCApplicationModalObjects.cityCModal);
	}

	@Then("^user clear and enter Zip Code on credit card Application Modal \"(.*?)\"$")
	public void user_clear_and_enter_Zip_Code_on_credit_card_Application_Modal(String arg1) throws Throwable {
		clearInputBox(plccCCApplicationModalObjects.zipCodeCCModal);
		plccCCApplicationModalObjects.enterZipCCModal(arg1);
		assertTrue(isDisplayed(plccCCApplicationModalObjects.zipCodeCCModal));
		waitForElement(plccCCApplicationModalObjects.zipCodeCCModal);
	}
	@Then("^user expect submit button not clickable$")
	public void user_expect_submit_button_not_clickable() throws Throwable {
		plccCCApplicationModalObjects.verifySubmitButtonIsDisabled();
	}
	@Then("^user expect submit button clickable$")
	public void user_expect_submit_button_clickable() throws Throwable {
		plccCCApplicationModalObjects.verifySubmitButtonIsEnabled();
	}
}
