package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckoutStepDef extends GlobalMobileHelper {
	
	private static final Logger logger = Logger.getLogger(CheckoutStepDef.class.getName());
	
	
	@Then("^User sees the checkout button$")
	public void user_sees_the_checkout_button() throws Throwable {
	    swipeScreen(Direction.UP, 4);
	    assertTrue(isElementDisplayed(Locators.CheckoutPage.buttonCheckout));
	    logger.debug("Checkout button is displayed on the cart screen");
	}

	@When("^User taps on checkout button$")
	public void user_taps_on_checkout_button() throws Throwable {
	    
	    tapOnElement(Locators.CheckoutPage.buttonCheckout);
	    logger.debug("Checkout button is tapped on cart screen");
	}

	@Then("^User sees product thumbnail on checkout$")
	public void user_sees_product_thumbnail_on_checkout() throws Throwable {
	    
	    assertTrue(isElementDisplayed(Locators.CheckoutPage.productThumbNail));
	    logger.debug("Product thumbnail is displayed on Checkout screen");
	}

	@Then("^User sees product name on checkout$")
	public void user_sees_product_name_on_checkout() throws Throwable {
	    
	    assertTrue(isElementDisplayed(Locators.CheckoutPage.productTitle));
	    logger.debug("Product name is displayed on the checkout screen");
	}

	@Then("^User sees sku on the cart page$")
	public void user_sees_sku_on_the_cart_page() throws Throwable {
	    
	    assertTrue(isElementDisplayed(Locators.CheckoutPage.productSKU));
	    logger.debug("Product SKU is displayed on the checkout screen");
	}

	@Then("^User sees the quantity on the cart page$")
	public void user_sees_the_quantity_on_the_cart_page() throws Throwable {
	    
		throw new PendingException("Element locator not available for Product Quantity");
	}

	@Then("^User sees the product price on the cart page$")
	public void user_sees_the_product_price_on_the_cart_page() throws Throwable {
	    
	    assertTrue(isElementDisplayed(Locators.CheckoutPage.productPrice));
	    logger.debug("Product price label is displayed on the checkout screen");
	}

	@And("^User swipes right on cart page$")
	public void user_swipes_right_on_cart_page(){
		swipeScreen(Direction.RIGHT);
	}
}
