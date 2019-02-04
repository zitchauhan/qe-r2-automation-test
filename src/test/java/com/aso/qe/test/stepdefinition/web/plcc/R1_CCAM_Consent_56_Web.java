package com.aso.qe.test.stepdefinition.web.plcc;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_CreditCardApplicationModal_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Registration_PO;

import cucumber.api.java.en.Then;

public class R1_CCAM_Consent_56_Web extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_CreditCardApplicationModal_PO ccAplicationModal_PO = PageFactory.initElements(driver,
			R1_PLCC_CreditCardApplicationModal_PO.class);
	R1_PLCC_Registration_PO plccRegistration_PO = PageFactory.initElements(driver, R1_PLCC_Registration_PO.class);
	@Then("^user expect element credit card image to be present$")
	public void user_expect_element_credit_card_image_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfPlccCardImgCCAM();
	}

	@Then("^user expect element ACCOUNT TERMS AND CONDITIONS to be present$")
	public void user_expect_element_ACCOUNT_TERMS_AND_CONDITIONS_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfAccountTAndCsLabelConsentModal();
	}

	@Then("^user expect element didclosure text one on consent modal to be present$")
	public void user_expect_element_didclosure_text_one_on_consent_modal_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfDisclosureTxt1ConsentModal();
	}

	@Then("^user expect element didclosure text two on consent modal to be present$")
	public void user_expect_element_didclosure_text_two_on_consent_modal_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfDisclosureTxt2ConsentModal();
	}

	@Then("^user expect element CONSENT TO ACCOUNT TERMS AND CONDITIONS to be present$")
	public void user_expect_element_CONSENT_TO_ACCOUNT_TERMS_AND_CONDITIONS_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfConsentToAccountTAndCsLabelConsentModal();
	}

	@Then("^user expect element CONSENT TO ACCOUNT Iframe to be present$")
	public void user_expect_element_CONSENT_TO_ACCOUNT_Iframe_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfConsentToFinancialIframeConsentModal();
	}

	@Then("^user expect element CONSENT TO FINANCIAL TERMS OF THE ACCOUNT to be present$")
	public void user_expect_element_CONSENT_TO_FINANCIAL_TERMS_OF_THE_ACCOUNT_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfAccountToFinancialTAndCsLabelConsentModal();
	}

	@Then("^user expect element CONSENT TO FINANCIAL Iframe to be present$")
	public void user_expect_element_CONSENT_TO_FINANCIAL_Iframe_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfConsentToFinancialIframeConsentModal();
	}

	@Then("^user expect element I agree TandCs on consent modal to be present$")
	public void user_expect_element_I_agree_TandCs_on_consent_modal_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfAgreeApplicationModalCCModal();
	}

	@Then("^user expect element SUBMIT button to be present$")
	public void user_expect_element_SUBMIT_button_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfSubmitButtonCCModal();
	}

	@Then("^user expect element Cancel link to be present$")
	public void user_expect_element_Cancel_link_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfCancelLinkCCModal();
	}

	@Then("^user expect element print link to be present on Credit card application modal$")
	public void user_expect_element_print_link_to_be_present_on_Credit_card_application_modal() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfPrintLinkConsentModal();
	}
	@Then("^user expect element back link to be present$")
	public void user_expect_element_back_link_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfBackButtonConsentModel();
	}
	

}
