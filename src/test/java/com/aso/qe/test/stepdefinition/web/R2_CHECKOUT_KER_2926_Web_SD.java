package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.Then;

public class R2_CHECKOUT_KER_2926_Web_SD extends CommonActionHelper {
	
	R2_CheckOut_PO r2CheckoutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	
	@Then("^user clicks on Edit My cart in Order Summary$")
	public void user_clicks_on_Edit_My_cart_in_Order_Summary() throws Throwable {
		assertTrue(clickOnButton(r2CheckoutPo.btnEditCart));
		
	}
	
	@Then("^Remove items from the cart$")
	public void remove_items_from_the_cart() throws Throwable {
		assertTrue(clickOnButton(r2CartPo.btnRemoveCart));
		
	}
	
	@Then("^verify the item is removed$")
	public void verify_the_item_is_removed() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.cartEmptyMsg));
	}

	
}
