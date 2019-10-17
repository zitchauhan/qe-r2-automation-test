package com.aso.qe.test.stepdefinition.web.plcc;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_CreditCardApplicationModal_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Registration_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class R1_CCAM_PreScreen_53_Web extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_CreditCardApplicationModal_PO ccAplicationModal_PO = PageFactory.initElements(driver,
			R1_PLCC_CreditCardApplicationModal_PO.class);
	R1_PLCC_Registration_PO plccRegistration_PO = PageFactory.initElements(driver,R1_PLCC_Registration_PO.class);
	
	@Then("^user expect element STEP(\\d+):PRESCREEN ACCEPTANCE present$")
	public void user_expect_element_STEP_PRESCREEN_ACCEPTANCE_present(int arg1) throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfPageLabelPCCApplicationModal();
	}

	
	@Then("^user enter Confirm Last four SSN \"(.*?)\"$")
	public void user_enter_Confirm_Last_four_SSN(String arg1) throws Throwable {
		assertTrue(isDisplayed(ccAplicationModal_PO.confirmSsnCCModal));
		ccAplicationModal_PO.enterConfirmSSNCCModal(arg1);
		//waitForElement(ccAplicationModal_PO.confirmSsnCCModal);
	}
	
	
	
	@Then("^user expect error message on email id field$")
	public void user_expect_error_message_on_email_id_field() throws Throwable {
		plccRegistration_PO.verifypresenceofEmailAddressErrorMessage();
	}
	@Then("^user expect error message on ssn field$")
	public void user_expect_ssn_on_email_id_field() throws Throwable {
		plccRegistration_PO.verifypresenceofInvalidSSNErrorMsg();
	}
	@Then("^user expect error message on confirm ssn field$")
	public void user_expect_confirm_ssn_on_email_id_field() throws Throwable {
		plccRegistration_PO.verifypresenceofInvalidSSNErrorMsg();
	}
@Then("^user click on ACCEPT OFFER$")
public void user_click_on_ACCEPT_OFFER() throws Throwable {
	assertTrue(clickOnButton(ccAplicationModal_PO.acceptOfferButtonPCCApplicationModal));
	//ccAplicationModal_PO.acceptOfferButtonPCCApplicationModal.click();
}
@Then("^user expect error message on mobile phone field$")
public void user_expect_error_message_on_mobile_phone_field() throws Throwable {
	plccRegistration_PO.verifyPresenceOfMobilePhoneErrorMsg();
}

@Then("^user expect error message on alternate phone field$")
public void user_expect_error_message_on_alternate_phone_field() throws Throwable {
	plccRegistration_PO.verifyPresenceOfMobilePhoneErrorMsg();
}

@Then("^user expect error message on annual income field$")
public void user_expect_error_message_on_annual_income_field() throws Throwable {
	plccRegistration_PO.verifyPresenceOfAnnualIncomeErrorMsg();
}

@Then("^user expect error message on dob field$")
public void user_expect_error_message_on_dob_field() throws Throwable {
	plccRegistration_PO.verifypresenceofDOBErrorMessage();
}

@Then("^user expect element steps indicator to be present$")
public void user_expect_element_steps_indicator_to_be_present() throws Throwable {
	ccAplicationModal_PO.verifyPresenceOfProgressIndicatorPCCApplicationModal();
}

@Then("^user expect element Your Personal Information text to be present$")
public void user_expect_element_Your_Personal_Information_text_to_be_present() throws Throwable {
	ccAplicationModal_PO.verifyPresenceOfPersonalInfoPCCApplicationModal();
}

@Then("^user expect element disclosure Text one on Pre-Screen Modal to be present$")
public void user_expect_element_disclosure_Text_one_on_Pre_Screen_Modal_to_be_present() throws Throwable {
	ccAplicationModal_PO.verifyPresenceOfDisclosureTxt1PCCApplicationModal();
}

@Then("^user expect element notice iframe one to be present$")
public void user_expect_element_notice_iframe_one_to_be_present() throws Throwable {
	ccAplicationModal_PO.verifyPresenceOfNoticeIframeModal();
}

@Then("^user expect element disclosure Text two on Pre-Screen Modal to be present$")
public void user_expect_element_disclosure_Text_two_on_Pre_Screen_Modal_to_be_present() throws Throwable {
	ccAplicationModal_PO.verifyPresenceOfDisclosureTxt2PCCApplicationModal();
}

@Given("^user verify presence of Print icon$")
public void user_verify_presence_of_Print_icon() throws Throwable {
	try {
		ccAplicationModal_PO.verifyPresenceOfPrintIconPLCCApplicationModal();
	} catch (Exception e) {
		System.out.println("Exception Message:"+e.getMessage());
	}
}

@Given("^user click on Print button$")
public void user_click_on_Print_button() throws Throwable {
	try {
		ccAplicationModal_PO.printLinkConsentModal.click();
		driver.close();
	} catch (Exception e) {
		System.out.println("Exception Message:"+e.getMessage());
	}
}
@Given("^user click on Cancel button$")
public void user_click_on_Cancel_button() throws Throwable {
	try {
		ccAplicationModal_PO.CancelLink.click();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
