package com.aso.qe.test.stepdefinition.web.plcc;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_CreditCardApplicationModal_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.Then;

public class R1_CCAM_Response_ExistingCustomer_94_Web extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_CreditCardApplicationModal_PO ccAplicationModal_PO = PageFactory.initElements(driver,
			R1_PLCC_CreditCardApplicationModal_PO.class);
	R1_PLCC_CreditCardApplicationModal_PO plccCCApplicationModalObjects = PageFactory.initElements(driver,
			R1_PLCC_CreditCardApplicationModal_PO.class);
	R2_MyAccount_PO myAccount_po = PageFactory.initElements(driver,R2_MyAccount_PO.class);
	
	@Then("^user navigates to existing account modal$")
	public void user_navigates_to_existing_account_modal() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfExistingCustomer();
	}
	@Then("^user expect element disclosure text on existing account modal to be present$")
	public void user_expect_element_disclosure_text_on_existing_account_modal_to_be_present() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfDisclosureTextExistingAccount();
	}
	@Then("^user click on continue to checkout button on existing user modal$")
	public void user_click_on_continue_to_checkout_button_on_existing_user_modal() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfContinueToCheckoutExistingUser();
		ccAplicationModal_PO.continueBtnExistingUser.click();
	}
	
	//mobile implementation
	@Then("^user click on Payments link on mobile$")
	public void user_click_on_Payments_link_on_mobile() throws Throwable {
		myAccount_po.lnkPayment_Mobile.click();
	}
}
