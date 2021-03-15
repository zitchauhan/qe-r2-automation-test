package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.pageobject.ios.PDPPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

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
		pdp.tapOnViewCart();
	}
	
	@Then("^User sees quantity stepper$")
	public void isQuantityStepperDisplayed() throws Throwable {
		swipeScreen(Direction.UP);
		assertTrue(pdp.isQuantityStepperDisplayed());
	}
	
	@When("^User taps on increment quantity stepper$")
	public void incrementQuantity() throws Throwable {
		pdp.tapOnIncrementQtyStepper();
	}
	
	@When("^User taps on decrement quantity stepper$")
	public void decrementQuantity() throws Throwable {
		pdp.tapOnDecrementQtyStepper();
	}
	
	@When("^User sets qty to \"(.*?)\"$")
	public void setQty(String qty) throws Throwable {
		pdp.setQty(qty);
	}
	
	@Then("^Quantity is changed to \"(.*?)\"$")
	public void validateQuantity(String qty) {
		assertTrue(pdp.validateQty(qty));
	}
}