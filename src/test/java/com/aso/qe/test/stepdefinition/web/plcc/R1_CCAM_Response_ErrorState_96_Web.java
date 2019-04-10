package com.aso.qe.test.stepdefinition.web.plcc;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_CreditCardApplicationModal_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_CCAM_Response_ErrorState_96_Web extends CommonActionHelper  {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_CreditCardApplicationModal_PO ccAplicationModal_PO = PageFactory.initElements(driver,
			R1_PLCC_CreditCardApplicationModal_PO.class);
	
	@Then("^user expect element disclosure text on error modal to be present$")
	public void user_expect_element_disclosure_text_on_error_modal_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfErrorText();
	}
	@Then("^user expect error text to be present$")
	public void user_expect_error_text_to_be_present() throws Throwable {
		try {
			ccAplicationModal_PO.verifyPresenceOfErrorText();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("^user expect element return to application to be present$")
	public void user_expect_element_return_to_application_to_be_present() throws Throwable {
		try {
			ccAplicationModal_PO.verifyPresenceOfDisclosureText();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@When("^user click on continue to checkout button on error modal$")
	public void user_click_on_continue_to_checkout_button_on_error_modal() throws Throwable {
		try {
			ccAplicationModal_PO.verifyPresenceOfContinueToCheckoutErrorModal();
			ccAplicationModal_PO.continueToCheckoutBtnErrorModal.click();
		} catch (Exception e) {
			logger.debug("Exception Message: "+e.getMessage());
		}
	}
	@When("^user click on return to application on error modal$")
	public void user_click_on_return_to_application_on_error_modal() throws Throwable {
		try {
			ccAplicationModal_PO.verifyPresenceOfReturnToApplicationErrorModal();
			ccAplicationModal_PO.returnToApplicationErrorModal.click();
		} catch (Exception e) {
			logger.debug("Exception Message: "+e.getMessage());
		}
	}
	
}
