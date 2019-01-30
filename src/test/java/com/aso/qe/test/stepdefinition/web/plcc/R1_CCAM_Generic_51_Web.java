package com.aso.qe.test.stepdefinition.web.plcc;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_CreditCardApplicationModal_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_CCAM_Generic_51_Web extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_CreditCardApplicationModal_PO ccAplicationModal_PO = PageFactory.initElements(driver,
			R1_PLCC_CreditCardApplicationModal_PO.class);
	R1_PLCC_CreditCardApplicationModal_PO plccCCApplicationModalObjects = PageFactory.initElements(driver,
			R1_PLCC_CreditCardApplicationModal_PO.class);

	@Then("^user expect element STEP(\\d+): APPLICATION FORM present$")
	public void user_expect_element_STEP_APPLICATION_FORM_present(int arg1) throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfFirstNameCCModal();
	}

	@Then("^user expect element FirstName text Field on CC Aplication Modal to be present$")
	public void user_expect_element_FirstName_text_Field_on_CC_Aplication_Modal_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfFirstNameCCModal();
	}

	@Then("^user expect element LastName text Field on CC Aplication Modal to be present$")
	public void user_expect_element_LastName_text_Field_on_CC_Aplication_Modal_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfFirstNameCCModal();
	}

	@Then("^user expect element SSN text Field on CC Aplication Modal to be present$")
	public void user_expect_element_SSN_text_Field_on_CC_Aplication_Modal_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfSSNCCModal();
	}

	@Then("^user expect element DOB text Field on CC Aplication Modal to be present$")
	public void user_expect_element_DOB_text_Field_on_CC_Aplication_Modal_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfDOBTextField();
	}

	@Then("^user expect element Annual Income text Field on CC Aplication Modal to be present$")
	public void user_expect_element_Annual_Income_text_Field_on_CC_Aplication_Modal_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfAnnualIncomeCCModal();
	}

	@Then("^user expect element Street Address text Field on CC Aplication Modal to be present$")
	public void user_expect_element_Street_Address_text_Field_on_CC_Aplication_Modal_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfStreetCCModal();
	}

	@Then("^user expect element Suite or Apartment text Field on CC Aplication Modal to be present$")
	public void user_expect_element_Suite_or_Apartment_text_Field_on_CC_Aplication_Modal_to_be_present()
			throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfApartmentNameCCModal();
	}

	@Then("^user expect element city text Field on CC Aplication Modal to be present$")
	public void user_expect_element_city_text_Field_on_CC_Aplication_Modal_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfCityCModalCCModal();
	}

	@Then("^user expect element state drop down on CC Aplication Modal to be present$")
	public void user_expect_element_state_drop_down_on_CC_Aplication_Modal_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfStateDropDownCCModal();
	}

	@Then("^user expect element zip code text field on CC Aplication Modal to be present$")
	public void user_expect_element_zip_code_text_field_on_CC_Aplication_Modal_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfZipCodeCCModal();
	}

	@Then("^user expect element email text field on CC Aplication Modal to be present$")
	public void user_expect_element_email_text_field_on_CC_Aplication_Modal_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfEmailIdCCModal();
	}

	@Then("^user expect element confirm email text field on CC Aplication Modal to be present$")
	public void user_expect_element_confirm_email_text_field_on_CC_Aplication_Modal_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfConfirmEmailIdCCModal();
	}

	@Then("^user expect element Mobile Phone text field on CC Aplication Modal to be present$")
	public void user_expect_element_Mobile_Phone_text_field_on_CC_Aplication_Modal_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfMobilePhoneCCModal();
	}

	@Then("^user expect element Alternate Phone text field on CC Aplication Modal to be present$")
	public void user_expect_element_Alternate_Phone_text_field_on_CC_Aplication_Modal_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfAlternatePhoneCCModal();
	}

	@Then("^user expect element CONTINUE on CC Aplication Modal to be present$")
	public void user_expect_element_CONTINUE_on_CC_Aplication_Modal_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfContinueButtonCCModal();
	}

	@Then("^user expect element agree checkbox on CC Aplication Modal to be present$")
	public void user_expect_element_agree_checkbox_on_CC_Aplication_Modal_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfAgreeApplicationModalCCModal();
	}

	@Then("^user expect element SUBMIT on CC Aplication Modal to be present$")
	public void user_expect_element_SUBMIT_on_CC_Aplication_Modal_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfSubmitButtonCCModal();
	}

	@Then("^user expect element CANCEL on CC Aplication Modal to be present$")
	public void user_expect_element_CANCEL_on_CC_Aplication_Modal_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfCancelLinkCCModal();
	}
	@When("^user enter Last Name on credit card Application Modal \"(.*?)\"$")
	public void user_enter_Last_Name_on_credit_card_Application_Modal(String arg1) throws Throwable {
		plccCCApplicationModalObjects.enterLNCCModal(arg1);
		assertTrue(isDisplayed(plccCCApplicationModalObjects.lastNameCCModal));
		waitForElement(plccCCApplicationModalObjects.lastNameCCModal);
	}
}
