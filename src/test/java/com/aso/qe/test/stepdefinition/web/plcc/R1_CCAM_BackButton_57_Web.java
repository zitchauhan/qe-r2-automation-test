package com.aso.qe.test.stepdefinition.web.plcc;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_CreditCardApplicationModal_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Registration_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_CCAM_BackButton_57_Web extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_CreditCardApplicationModal_PO ccAplicationModal_PO = PageFactory.initElements(driver,
			R1_PLCC_CreditCardApplicationModal_PO.class);
	R1_PLCC_Registration_PO plccRegistration_PO = PageFactory.initElements(driver, R1_PLCC_Registration_PO.class);

	@Then("^user expect element Accept Terms and Conditions checkbox to be unchecked$")
	public void user_expect_element_Accept_Terms_and_Conditions_checkbox_to_be_unchecked() throws Throwable {
		ccAplicationModal_PO.verifyTAndCCheckboxOnConsentModelInactive();
	}

	@Then("^user expect element STEP (\\d+) :PRESCREEN ACCEPTANCE present$")
	public void user_expect_element_STEP_PRESCREEN_ACCEPTANCE_present(int arg1) throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfPageLabelPCCApplicationModal();
	}

	@When("^user clisk on back button of consent modal$")
	public void user_clisk_on_back_button_of_consent_modal() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfBackButtonConsentModel();
	}

}
