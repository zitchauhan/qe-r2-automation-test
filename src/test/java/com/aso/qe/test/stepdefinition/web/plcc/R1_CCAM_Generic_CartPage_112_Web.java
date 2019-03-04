package com.aso.qe.test.stepdefinition.web.plcc;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_CreditCardApplicationModal_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Registration_PO;

import cucumber.api.java.en.Then;

public class R1_CCAM_Generic_CartPage_112_Web extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_CreditCardApplicationModal_PO ccAplicationModal_PO = PageFactory.initElements(driver,
			R1_PLCC_CreditCardApplicationModal_PO.class);
	R1_PLCC_Registration_PO plccRegistration_PO = PageFactory.initElements(driver,R1_PLCC_Registration_PO.class);
	@Then("^user click on plcc banner of cart button$")
	public void user_click_on_plcc_banner_of_cart_button() throws Throwable {
		ccAplicationModal_PO.verifyPresenceOfBannerOnCartPage();
		ccAplicationModal_PO.bannerCartPage.click();
	}
}
