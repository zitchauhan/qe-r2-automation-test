package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.pageobject.ios.CheckoutPage;

import cucumber.api.java.en.And;

public class CheckoutStepDef extends GlobalMobileHelper{
	CheckoutPage checkout = new CheckoutPage(driver);
	
	@And("^User sees the checkout screen$")
	public void isCheckoutPageDisplayed() throws Throwable {
	    assertTrue(checkout.isCheckoutPageDisplayed());
	}
}
