package com.aso.qe.test.stepdefinition.web.plcc;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_PLCC_CreditCardApplicationModal_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;
import com.aso.qe.test.pageobject.R1_PLCC_LandingPage_PO;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_PLCC_86_Web extends Common_Web_SD_PLCC {
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);
	R1_PLCC_LandingPage_PO plccLandingPageObjects = PageFactory.initElements(driver, R1_PLCC_LandingPage_PO.class);
	R1_PLCC_CreditCardApplicationModal_PO plccCCApplicationModalObjects = PageFactory.initElements(driver,
			R1_PLCC_CreditCardApplicationModal_PO.class);

	@Then("^user expect Landing page to be present$")
	public void user_expect_Landing_page_to_be_present() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfLandingPage();
	}

	@When("^user click on APPLY NOW button$")
	public void user_click_on_APPLY_NOW_button() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfApplyNowButton();
		plccLandingPageObjects.applyNowButton.click();

	}

	@Then("^user navigates to Generic Credit Card Application Modal$")
	public void user_navigates_to_Generic_Credit_Card_Application_Modal() throws Throwable {
		plccCCApplicationModalObjects.verifyPresenceOfGenericCreditCardApplicationModal();
	}

	@When("^user enter Last four SSN \"(.*?)\"$")
	public void user_enter_Last_SSN(String arg2) throws Throwable {
		plccCCApplicationModalObjects.enterSSNCCModal(arg2);
		assertTrue(isDisplayed(plccCCApplicationModalObjects.ssnCCModal));
		waitForElement(plccCCApplicationModalObjects.ssnCCModal);
	}

	@When("^user enetr Date of Birth \"(.*?)\"$")
	public void user_enetr_Date_of_Birth(String arg1) throws Throwable {
		plccCCApplicationModalObjects.enterDOBCCModal(arg1);
		assertTrue(isDisplayed(plccCCApplicationModalObjects.dobCCModal));
		waitForElement(plccCCApplicationModalObjects.dobCCModal);
	}

	@When("^user enter Annual Income \"(.*?)\"$")
	public void user_enter_Annual_Income(String arg1) throws Throwable {
		
		assertTrue(isDisplayed(plccCCApplicationModalObjects.annualIncomeCCModal));
		waitForElement(plccCCApplicationModalObjects.annualIncomeCCModal);
		plccCCApplicationModalObjects.enterAnnualIncomeCCModal(arg1);
	}

	@When("^user enter Street Address \"(.*?)\"$")
	public void user_enter_Street_Address(String arg1) throws Throwable {
		plccCCApplicationModalObjects.enterStreetAddressCCModal(arg1);
		assertTrue(isDisplayed(plccCCApplicationModalObjects.streetAddressCCModal));
		waitForElement(plccCCApplicationModalObjects.streetAddressCCModal);
	}

	@When("^user enter Suite or Apartment \"(.*?)\"$")
	public void user_enter_Suite_or_Apartment(String arg1) throws Throwable {
		plccCCApplicationModalObjects.enterApartmentNameCCModal(arg1);
		assertTrue(isDisplayed(plccCCApplicationModalObjects.apartmentNameCCModal));
		waitForElement(plccCCApplicationModalObjects.apartmentNameCCModal);
	}

	@When("^user enter City \"(.*?)\"$")
	public void user_enter_City(String arg1) throws Throwable {
		plccCCApplicationModalObjects.enterCityCCModal(arg1);
		assertTrue(isDisplayed(plccCCApplicationModalObjects.cityCModal));
		waitForElement(plccCCApplicationModalObjects.cityCModal);
	}

	@When("^user select State \"(.*?)\"$")
	public void user_select_State(String arg1) throws Throwable {
		plccCCApplicationModalObjects.stateDropDownCCModal.click();
		String stateName = plccCCApplicationModalObjects.stateDropDownListCCModal.getText();
		Common_Web_SD_PLCC.waitUntilElePresent(driver, plccCCApplicationModalObjects.stateDropDownPACCModal,
				ELEMWAITTIME_MEDIUM);
		plccCCApplicationModalObjects.stateDropDownPACCModal.click();
	}

	@When("^user enter Confirm Email Address \"(.*?)\"$")
	public void user_enter_Confirm_Email_Address(String arg1) throws Throwable {
		plccCCApplicationModalObjects.enterConfirmEmailIdCCModal(arg1);
		assertTrue(isDisplayed(plccCCApplicationModalObjects.confirmEmailIdCCModal));
		waitForElement(plccCCApplicationModalObjects.confirmEmailIdCCModal);
	}

	@When("^user enter Mobile Phone \"(.*?)\"$")
	public void user_enter_Mobile_Phone(String arg1) throws Throwable {
		plccCCApplicationModalObjects.enterMobilePhoneCCModal(arg1);
		assertTrue(isDisplayed(plccCCApplicationModalObjects.mobilePhoneCCModal));
		waitForElement(plccCCApplicationModalObjects.mobilePhoneCCModal);
	}

	@When("^user enter First Name on credit card Application Modal \"(.*?)\"$")
	public void user_enter_First_Name_on_credit_card_Application_Modal(String arg1) throws Throwable {
		plccCCApplicationModalObjects.enterFNCCModal(arg1);
		assertTrue(isDisplayed(plccCCApplicationModalObjects.firstNameCCModal));
		waitForElement(plccCCApplicationModalObjects.firstNameCCModal);
	}

	@When("^user enter Last Name user_enter_Last_Name \"(.*?)\"$")
	public void user_enter_Last_Name_user_enter_Last_Name(String arg1) throws Throwable {
		plccCCApplicationModalObjects.enterLNCCModal(arg1);
		assertTrue(isDisplayed(plccCCApplicationModalObjects.lastNameCCModal));
		waitForElement(plccCCApplicationModalObjects.lastNameCCModal);
	}

	@When("^user enter Alternate Phone \"(.*?)\"$")
	public void user_enter_Alternate_Phone(String arg1) throws Throwable {
		plccCCApplicationModalObjects.enterAlternatePhoneCCModal(arg1);
		assertTrue(isDisplayed(plccCCApplicationModalObjects.alternatePhoneCCModal));
		waitForElement(plccCCApplicationModalObjects.alternatePhoneCCModal);
	}

	@When("^user click on CONTINUE button$")
	public void user_click_on_CONTINUE_button() throws Throwable {
		plccCCApplicationModalObjects.verifyPresenceOfContinueButtonCCModal();
		plccCCApplicationModalObjects.continueButtonCCModal.click();
		Common_Web_SD_PLCC.waitUntilElePresent(driver, plccCCApplicationModalObjects.continueButtonCCModal,
				ELEMWAITTIME_MEDIUM);
		assertTrue(clickOnButton(plccCCApplicationModalObjects.continueButtonCCModal));
	}

	@When("^user select credit application modal agree message$")
	public void user_select_credit_application_modal_agree_message() throws Throwable {
		plccCCApplicationModalObjects.verifyPresenceOfAgreeApplicationModalCCModal();
		Common_Web_SD_PLCC.waitUntilElePresent(driver, plccCCApplicationModalObjects.TandCCheckBox,
				ELEMWAITTIME_MEDIUM);
		assertTrue(clickOnButton(plccCCApplicationModalObjects.TandCCheckBox));
	}

	@Then("^user navigates to credit card approval modal$")
	public void user_navigates_to_credit_card_approval_modal() throws Throwable {
		plccCCApplicationModalObjects.verifyPresenceOfSuccessModalCCModal();
		plccCCApplicationModalObjects.successModal.click();
	}

	@When("^user click on continue to checkout$")
	public void user_click_on_continue_to_checkout() throws Throwable {
		plccCCApplicationModalObjects.verifyPresenceOfContinueToCheckoutCCModal();
		plccCCApplicationModalObjects.continueToCheckout.click();
	}

	@Then("^user navigates to cart page$")
	public void user_navigates_to_cart_page() throws Throwable {
		plccCCApplicationModalObjects.verifyPresenceOfASOHomePage();
	}

	@When("^user click on continue shopping  button$")
	public void user_click_on_continue_shopping_button() throws Throwable {
		plccCCApplicationModalObjects.continueShoppingBtn.click();
	}

	@When("^user enter Zip Code on credit card Application Modal \"(.*?)\"$")
	public void user_enter_Zip_Code_on_credit_card_Application_Modal(String arg1) throws Throwable {
		plccCCApplicationModalObjects.enterZipCCModal(arg1);
		assertTrue(isDisplayed(plccCCApplicationModalObjects.zipCodeCCModal));
		waitForElement(plccCCApplicationModalObjects.zipCodeCCModal);
	}

	@When("^user enter Email Address on credit card Application Modal \"(.*?)\"$")
	public void user_enter_Email_Address_on_credit_card_Application_Modal(String arg1) throws Throwable {
		plccCCApplicationModalObjects.enterEmailIdCCModal(arg1);
		assertTrue(isDisplayed(plccCCApplicationModalObjects.emailIdCCModal));
		waitForElement(plccCCApplicationModalObjects.emailIdCCModal);
	}

	@When("^user click on SUBMIT button$")
	public void user_click_on_SUBMIT_button() throws Throwable {
		plccCCApplicationModalObjects.verifyPresenceOfSubmitButtonCCModal();
		assertTrue(isDisplayed(plccCCApplicationModalObjects.submitButton));
		plccCCApplicationModalObjects.submitButton.click();
	}
	@Then("^user verify presence of STEP(\\d+): CONSENT$")
	public void user_verify_presence_of_STEP_CONSENT(int arg1) throws Throwable {
		plccCCApplicationModalObjects.verifyPresenceOfConsentModelPageLabel();
	}


}
