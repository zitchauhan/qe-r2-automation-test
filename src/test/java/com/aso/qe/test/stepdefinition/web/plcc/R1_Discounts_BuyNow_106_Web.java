package com.aso.qe.test.stepdefinition.web.plcc;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;

import cucumber.api.java.en.When;

public class R1_Discounts_BuyNow_106_Web extends CommonActionHelper{
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);
	@When("^user click on Buy Now button$")
	public void user_clicks_on_Buy_Now_button() throws Throwable {
		genericPO.verifyPresenceOfBuyNowButton();
		genericPO.buyNowButton.click();
	}
}
