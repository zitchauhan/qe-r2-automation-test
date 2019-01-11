package com.aso.qe.test.stepdefinition.web.plcc;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;

import cucumber.api.java.en.Then;

public class R1_PLCC_87_Web extends CommonActionHelper {
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);
	@Then("^user expect element plcc card image in footer to be present$")
	public void user_expect_element_plcc_card_image_in_footer_to_be_present() throws Throwable {
		genericPO.verifyPresenceOfPlccCreditCardInFooter();
	}
}
