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
	public String checkout;
	
	@Then("^User should verify the Shipping Price on Checkout order Summary page$")
	public void user_should_verify_the_Shipping_Price_on_Checkout_order_Summary_page() throws Throwable {
		assertTrue(isDisplayed(r2CheckoutPo.txtEsitmatedShipping)); 
	}

	@Then("^User should have same Shipping price on Cart Page Order Summary$")
	public void user_should_have_same_Shipping_price_on_Cart_Page_Order_Summary() throws Throwable {
	     try {
			checkout= r2CheckoutPo.EstimatedShippingPrice_txt.getText();
			assertEquals(R2_CART_K2940_SD.cart,checkout);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^User verify the fixed shipping price value set in DB for the selected shipping method from DB$")
	public void user_verify_the_fixed_shipping_price_value_set_in_DB_for_the_selected_shipping_method_from_DB() throws Throwable {
	    String sof=r2CheckoutPo.SpecialOrderShipToStore_txt.getText();
	    assertEquals(sof,"$10.95");
	}
	
	
	
	
	@Then("^User should retrieve the FREE shipping for the selected shipping method from DB$")
	public void user_should_retrieve_the_FREE_shipping_for_the_selected_shipping_method_from_DB() throws Throwable {
		String giftCard=r2CheckoutPo.EstimatedShippingPrice_txt.getText();
		assertEquals(giftCard,"FREE");
	}
	
//	@Then("^User should retrieve the expected shipping price for the selected shipping method from Shipping  Exception table in DB$")
//	public void user_should_retrieve_the_expected_shipping_price_for_the_selected_shipping_method_from_Shipping_Exception_table_in_DB() throws Throwable {
//		String WhiteGlove_OrderSummary=r2CheckoutPo.ShippingPrice_Txt.getText();
//		String WhiteGlove_OrderSummary_price= WhiteGlove_OrderSummary.replaceAll("[^0-9]", "");
//		String WhiteGlove_Shippingmethod = r2CheckoutPo.shippingPriceInShippingMethod_txt.getText();
//		String WhiteGlove_price= WhiteGlove_Shippingmethod.replaceAll("[^0-9]", "");
//		assertEquals(WhiteGlove_OrderSummary_price,WhiteGlove_price);
//	}
	
	@Then("^User should retrieve the expected shipping price for the selected shipping method from Shipping Exception table in DB$")
	public void user_should_retrieve_the_expected_shipping_price_for_the_selected_shipping_method_from_Shipping_Exception_table_in_DB() throws Throwable {
		String WhiteGlove_OrderSummary=r2CheckoutPo.ShippingPrice_Txt.getText();
		String WhiteGlove_OrderSummary_price= WhiteGlove_OrderSummary.replaceAll("[^0-9]", "");
		String WhiteGlove_Shippingmethod = r2CheckoutPo.shippingPriceInShippingMethod_txt.getText();
		String WhiteGlove_price= WhiteGlove_Shippingmethod.replaceAll("[^0-9]", "");
		assertEquals(WhiteGlove_OrderSummary_price,WhiteGlove_price);
	}
}
