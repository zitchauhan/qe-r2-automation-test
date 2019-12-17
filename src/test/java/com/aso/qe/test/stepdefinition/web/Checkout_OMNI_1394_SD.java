package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.And;

public class Checkout_OMNI_1394_SD extends CommonActionHelper {
	
	R2_CheckOut_PO r2CheckoutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	
	@And("^user verify shipping charges on order summary is as per shipping methods$")
	public void user_verify_shipping_charges_on_order_summary_is_as_per_shipping_methods() throws Throwable {
		Thread.sleep(Constants.thread_medium);
		String expectedShippingPrice =  r2CheckoutPo.getTheShippingMenthodSumValueOnCheckout();		
		assertTrue(getText(r2CheckoutPo.ShippingPrice_Txt).contains(expectedShippingPrice)); 
	}

}
