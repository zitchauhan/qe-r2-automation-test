package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K4038_SD extends CommonActionHelper {
	
	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(getDriver(), R2_CheckOut_PO.class);

	@Then("^user should be able to see cumulative deduction from the gift cards in single line item in the order summary$")
	public void user_should_be_able_to_see_cumulative_deduction_from_the_gift_cards_in_single_line_item_in_the_order_summary() throws Throwable {
		assertTrue(isDisplayed(r2CheckOutPo.giftCards_txt));
		assertTrue(isDisplayed(r2CheckOutPo.giftCardsPrice_txt));
	}
}
