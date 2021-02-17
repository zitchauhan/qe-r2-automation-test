package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.pageobject.ios.CartPage;
import com.aso.qe.test.pageobject.ios.PDPPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OMNI_21749 extends GlobalMobileHelper{
	private PDPPage pdp;
	private int previousQuantity = -1;
	
	@Given("^User has selected a product and is on PDP$")
	public void launchApp() throws Throwable {
		initializeDriver();
		//TODO Integrate the code that will take to PDP
		pdp = new PDPPage(driver);
	}

	@Then("^User sees product image$")
	public void isProductImageDisplayed() throws Throwable {
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
	
	@And("^User sees Quantity Stepper$")
	public void isQuantityStepperDisplayed() throws Throwable {
		assertTrue(pdp.isQuantityStepperDisplayed());
	}
	
}