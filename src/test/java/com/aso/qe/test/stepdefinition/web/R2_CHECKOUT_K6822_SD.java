package com.aso.qe.test.stepdefinition.web;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K6822_SD extends CommonActionHelper {

	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);

	@Then("^Gift Card Number field and PIN fields are displayed$")
	public void gift_Card_Number_field_and_PIN_fields_are_displayed() throws Throwable {
		assertTrue(isDisplayed(r2CheckOutPo.inputGiftCard));
		assertTrue(isDisplayed(r2CheckOutPo.inputPin));
		assertTrue(isDisplayed(r2CheckOutPo.btnCheckoutApply));
	}

	@Then("^gift card balance is applied towards the purchase$")
	public void gift_card_balance_is_applied_towards_the_purchase() throws Throwable {
		assertTrue(isDisplayed(r2CheckOutPo.txtGiftCardOrderSummaryPage));
	}
}
