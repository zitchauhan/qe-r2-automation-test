package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.pageobject.ios.CartPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;

public class OMNI_22014 extends GlobalMobileHelper{
	
	@Given("^User is on cart page with product added$")
	public void navigateToCart() throws Throwable {
		//TODO: Integrate code to navigate to cart
	}

	@Then("^User sees order summary label$")
	public void isOrderSummaryLabelDisplayed() throws Throwable {
		MobileElement orderSummaryLabel = driver.findElement(CartPage.orderSummaryLabel);
	    assertTrue(orderSummaryLabel.isDisplayed());
	}
	
	@And("^User sees subtotal label$")
	public void orderSubtotalLabelDisplayed() throws Throwable {
		MobileElement orderSubtotalLabel = driver.findElement(CartPage.orderSubtotalLabel);
	    assertTrue(orderSubtotalLabel.isDisplayed());
	}
	
	@And("^User sees change zip code button$")
	public void isChangeZipCodeButtonDisplayed() throws Throwable {
		MobileElement changeZipCode = driver.findElement(CartPage.zipCodeButton);
	    assertTrue(orderSubtotalLabel.isDisplayed());
	}
	
	@And("^User sees store pickup label$")
	public void isPickUpStoreDisplayed() throws Throwable {
	    assertTrue(ecp.isYourCartIsEmptyLabelDisplayed());
	}
	
	@And("^User sees change store label$")
	public void isChangeStoreLabelDisplayed() throws Throwable {
	    assertTrue(ecp.isYourCartIsEmptyLabelDisplayed());
	}
	
	@And("^User sees taxes label$")
	public void isTaxesLabelDisplayed() throws Throwable {
		MobileElement changeZipCode = driver.findElement(CartPage.zipCodeButton);
	    assertTrue(orderSubtotalLabel.isDisplayed());
	}
	
	@And("^User sees discount label$")
	public void isDiscountLabelDisplayed() throws Throwable {
	    assertTrue(ecp.isYourCartIsEmptyLabelDisplayed());
	}
	
	@And("^User sees promo code label$")
	public void isPromoLabelDisplayed() throws Throwable {
	    assertTrue(ecp.isYourCartIsEmptyLabelDisplayed());
	}
	
	@And("^User sees the order total label$")
	public void isOrderTotalLabelDisplayed() throws Throwable {
	    assertTrue(ecp.isYourCartIsEmptyLabelDisplayed());
	}
}
