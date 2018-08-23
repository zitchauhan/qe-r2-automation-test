package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;


public class R2_CHECKOUT_K6824_SD extends CommonActionHelper {
	
	R2_CheckOut_PO r2_CheckOut_Po=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	

	@And("^verify GiftCard and Pin field$")
	public void verify_GiftCard_and_Pin_field() throws Throwable {
		assertTrue(isDisplayed(r2_CheckOut_Po.txtGiftcardNumber));
		assertTrue(isDisplayed(r2_CheckOut_Po.txtPin));
	}

	@Then("^user click on GiftCard Minus icon in Checkout page$")
	public void user_click_on_GiftCard_Minus_icon_in_Checkout_page() throws Throwable {
		assertTrue(clickOnButton(r2_CheckOut_Po.minusIconGiftCard));
	}
	
	
	@Then("^verify Gift Card in order summary page$")
	public void verify_Gift_Card_in_order_summary_page() throws Throwable {
		assertTrue(isDisplayed(r2_CheckOut_Po.txtGiftCardOrderSummaryPage));
	}

	

}
