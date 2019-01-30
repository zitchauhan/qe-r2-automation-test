package com.aso.qe.test.stepdefinition.web.plcc;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.Then;

public class R1_Checkout_82_Web extends CommonActionHelper {
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);
	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);

	@Then("^user expect element cvv field to be not present$")
	public void user_expect_element_cvv_field_to_be_not_present() throws Throwable {
		genericPO.verifyAbsenceOfCvvTextField();
	}

	@Then("^user expect element cvv field to be present$")
	public void user_expect_element_cvv_field_to_be_present() throws Throwable {
		genericPO.verifyPresenceOfCvvTextField();
	}
}
