package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.pageobject.ios.PDPPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class PDPStepDef extends GlobalMobileHelper{
	
	PDPPage pdp = new PDPPage(driver);
	
	@And("^User taps on add to cart button$")
	public void tapOnAddToCart() throws Throwable {
		pdp.tapOnAddToCart();
	}
	
	@And("^User taps on View Cart button$")
	public void tapOnViewCart() throws Throwable {
		
	}	
	
	@Then("^User sees product \"([^\"]*)\" on PDP $")
	public void isProductAttributeDisplayed(String productAttributeName) throws Throwable {
	pdp.verifyProductAttribute(productAttributeName);
	}
}
