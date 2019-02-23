package com.aso.qe.test.stepdefinition.web.plcc;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_CreditCardApplicationModal_PO;

import cucumber.api.java.en.Then;

public class R1_CCAM_Response_Success_93_Web extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_CreditCardApplicationModal_PO ccAplicationModal_PO = PageFactory.initElements(driver,
			R1_PLCC_CreditCardApplicationModal_PO.class);
	R1_PLCC_CreditCardApplicationModal_PO plccCCApplicationModalObjects = PageFactory.initElements(driver,
			R1_PLCC_CreditCardApplicationModal_PO.class);
	@Then("^user expect element WELCOME ALWAYS APPROVE!$")
	public void user_expect_element_WELCOME_ALWAYS_APPROVE() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfWelcomeTxt();
	}

	@Then("^user expect element disclosure text one to be present$")
	public void user_expect_element_disclosure_text_one_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfDisclosureTxt1SuccessModal();
	}

	@Then("^user expect element disclosure text two to be present$")
	public void user_expect_element_disclosure_text_two_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfDisclosureTxt2SuccessModal();
	}

	@Then("^user expect element disclosure text three to be present$")
	public void user_expect_element_disclosure_text_three_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfDisclosureTxt3SuccessModal();
	}

	@Then("^user expect element disclosure text four to be present$")
	public void user_expect_element_disclosure_text_four_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfDisclosureTxt4SuccessModal();
}
	@Then("^user expect element continue to shopping button to be present$")
	public void user_expect_element_continue_to_shopping_button_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfContinueToShopping();
}
	@Then("^user click on return to application$")
	public void user_click_on_return_to_application() throws Throwable {
		ccAplicationModal_PO.returnToShoppingButton.click();
		Thread.sleep(5000);
}
	@Then("^user click on close icon of success modal$")
	public void user_click_on_close_icon_of_success_modal() throws Throwable {
		ccAplicationModal_PO.closeIconSuccessModal.click();
}
	
	
	}
