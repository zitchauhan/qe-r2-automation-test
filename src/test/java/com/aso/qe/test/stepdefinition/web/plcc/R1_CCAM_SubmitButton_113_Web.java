package com.aso.qe.test.stepdefinition.web.plcc;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_CreditCardApplicationModal_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Registration_PO;

import cucumber.api.java.en.When;

public class R1_CCAM_SubmitButton_113_Web extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_CreditCardApplicationModal_PO ccAplicationModal_PO = PageFactory.initElements(driver,
			R1_PLCC_CreditCardApplicationModal_PO.class);
	R1_PLCC_Registration_PO plccRegistration_PO = PageFactory.initElements(driver, R1_PLCC_Registration_PO.class);
	@When("^user click on close icon$")
	public void user_click_on_close_icon() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfCloseIconCCAM();
		ccAplicationModal_PO.closeButtonCCApplicationModal.click();
	}
	@When("^user click on cancel link$")
	public void user_click_on_cancel_link() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfCancelLinkCCModal();
		ccAplicationModal_PO.cancelLinkCCModal.click();
	}
}
//verifyPresenceOfCancelLinkCCModal