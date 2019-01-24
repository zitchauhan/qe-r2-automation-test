package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import cucumber.api.java.en.And;

public class R2_CHECKOUT_K2866_SD extends CommonActionHelper {
	
	R2_CheckOut_PO r2CheckoutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);

	@And("^user should be able to see applied gift card in order summary$")
	public void user_should_be_able_to_see_applied_gift_card_in_order_summary() {
		assertTrue(isDisplayed(r2CheckoutPo.giftCardApplyOrderSummary));
	}
@And("^user click on paypal checkout button$")
	public void user_click_on_paypal_checkout_button() throws InterruptedException {
		Thread.sleep(Constants.thread_medium);
		assertTrue(clickOnButton(r2CheckoutPo.paypalButton));
}
}
