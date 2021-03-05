package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.pageobject.ios.PDPPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class PDPStepDef extends GlobalMobileHelper{
	
	PDPPage pdp = new PDPPage(driver);
	
	@Then("^User sees product image$")
	public void isProductImageDisplayed() throws Throwable {
		Thread.sleep(5000);
	    assertTrue(pdp.isHeroImageDisplayed());
	}
	
	@And("^User sees Product title$")
	public void isProductTitleDisplayed() throws Throwable {
		assertTrue(pdp.isProductTitleDisplayed());
	}
	
	@And("^User sees Product Price$")
	public void isProductPriceDisplayed() throws Throwable {
		assertTrue(pdp.isProductPriceDisplayed());
	}
	
	@And("^User taps on add to cart button$")
	public void tapOnAddToCart() throws Throwable {
		pdp.tapOnAddToCart();
	}
	
	@And("^User taps on View Cart button$")
	public void tapOnViewCart() throws Throwable {
		
	}	
}
