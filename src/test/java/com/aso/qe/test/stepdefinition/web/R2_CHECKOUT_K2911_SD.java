package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K2911_SD extends CommonActionHelper {
	
	R2_CheckOut_PO r2CheckoutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	
	@Then("^User should verify the Shipping Price on Checkout order Summary page$")
	public void user_should_verify_the_Shipping_Price_on_Checkout_order_Summary_page() throws Throwable {
		assertTrue(isDisplayed(r2CheckoutPo.txtEsitmatedShipping)); 
	}

	@Then("^User should have same Shipping price on Cart Page Order Summary$")
	public void user_should_have_same_Shipping_price_on_Cart_Page_Order_Summary() throws Throwable {
	   String cart= r2CartPo.txtEstimatedShippingCart.getText();
	   String checkout= r2CheckoutPo.txtEsitmatedShipping.getText();
	   assertEquals(cart,checkout);
	}

	
}
