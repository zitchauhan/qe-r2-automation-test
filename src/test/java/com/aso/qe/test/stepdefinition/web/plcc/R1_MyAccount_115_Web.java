package com.aso.qe.test.stepdefinition.web.plcc;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;

import cucumber.api.java.en.Then;

public class R1_MyAccount_115_Web extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);
	@Then("^user expect plcc card to be save in payments section of my account$")
	public void user_expect_plcc_card_to_be_save_in_payments_section_of_my_account() throws Throwable {
		genericPO.verifyPresenceOfSavedCardCheckoutPage();
		String savedCard = genericPO.savedCardCheckoutPage.getText();
		logger.debug(savedCard + " Saved card is displayed on payment page");
	}
}
