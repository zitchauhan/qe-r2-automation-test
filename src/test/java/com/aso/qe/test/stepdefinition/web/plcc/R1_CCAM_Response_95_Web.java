package com.aso.qe.test.stepdefinition.web.plcc;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_CreditCardApplicationModal_PO;

import cucumber.api.java.en.Then;

public class R1_CCAM_Response_95_Web extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_CreditCardApplicationModal_PO ccAplicationModal_PO = PageFactory.initElements(driver,
			R1_PLCC_CreditCardApplicationModal_PO.class);
	@Then("^user navigates to error modal$")
	public void user_navigates_to_error_modal() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfErrorModalCCAM();
	}

	@Then("^user expect element Error Card Modal Image to be present$")
	public void user_expect_element_Error_Card_Modal_Image_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfErrorModalImageCCAM();
	}

	@Then("^user expect element Application Under Review Text to be present$")
	public void user_expect_element_Application_Under_Review_Text_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfApplicationUnderReviewText();
	}

	@Then("^user expect element disclosure Message on Error Modal to be present$")
	public void user_expect_element_disclosure_Message_on_Error_Modal_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfDisclosureMsgErrorModalCCAM();
	}

	@Then("^user expect element continue To Checkout button to be present$")
	public void user_expect_element_continue_To_Checkout_button_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfContinueToCheckoutCCModal();
	}
	@Then("^user expect element close icon on error modal is present$")
	public void user_expect_element_close_icon_on_error_modal_is_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfCloseIconErrorModalCCAM();
	}
	@Then("^user click on continue to checkout button$")
	public void user_click_on_continue_icon_to_checkout_button() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfContinueToCheckoutCCModal();
		ccAplicationModal_PO.continueToCheckout.click();
	}
	
}
