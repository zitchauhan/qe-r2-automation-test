package com.aso.qe.test.stepdefinition.web.plcc;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_CreditCardApplicationModal_PO;

import cucumber.api.java.en.Then;

public class R1_PLCC_53_Web extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_CreditCardApplicationModal_PO ccAplicationModal_PO = PageFactory.initElements(driver,
			R1_PLCC_CreditCardApplicationModal_PO.class);
	R1_PLCC_CreditCardApplicationModal_PO plccCCApplicationModalObjects = PageFactory.initElements(driver,
			R1_PLCC_CreditCardApplicationModal_PO.class);
	@Then("^user expect element STEP(\\d+):PRESCREEN ACCEPTANCE present$")
	public void user_expect_element_STEP_PRESCREEN_ACCEPTANCE_present(int arg1) throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfPageLabelPCCApplicationModal();
	}

	@Then("^user expect element steps indicator to be present$")
	public void user_expect_element_steps_indicator_to_be_present() throws Throwable {
		
	}

	@Then("^user expect element Your Personal Information text to be present$")
	public void user_expect_element_Your_Personal_Information_text_to_be_present() throws Throwable {
	   
	}

}
