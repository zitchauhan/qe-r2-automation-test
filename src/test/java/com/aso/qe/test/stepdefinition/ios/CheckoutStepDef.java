package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.pageobject.ios.CheckoutPage;

import cucumber.api.java.en.And;

public class CheckoutStepDef extends GlobalMobileHelper {
CheckoutPage checkout = new CheckoutPage(driver);
	
	@And("^User sees the checkout screen$")
	public void isCheckoutPageDisplayed() throws Throwable {
	    assertTrue(checkout.isCheckoutPageDisplayed());
	}
	private static final Logger logger = Logger.getLogger(CheckoutStepDef.class.getName());
	
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
	
	@Then("^User sees contact information section$")
	public void user_sees_contact_information_section() throws Throwable {
	    assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.CheckoutPage.contactInformation));
	}
	
	@When("^User taps on contact information section$")
	public void user_taps_on_contact_information_section() throws Throwable {
	    GlobalMobileHelper.tapOnElement(Locators.CheckoutPage.contactInformation);
	}
	
	@Then("^User is shown email field$")
	public void user_is_shown_email_field() throws Throwable {
		assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.CheckoutPage.emailField));
	}
	
	@Then("^User enters \"([^\"]*)\" in email field$")
	public void user_enters_in_email_field(String arg1) throws Throwable {
	    GlobalMobileHelper.setText(Locators.CheckoutPage.emailField, arg1);
	}
	
	@Then("^User is shown Create an Account button in contact information screen$")
	public void user_is_shown_Create_an_Account_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@When("^User taps on Save Email button$")
	public void tapOnSaveEmail() throws Throwable {
	    GlobalMobileHelper.tapOnElement(Locators.CheckoutPage.saveEmailButton);
	}
	
	@Then("^User is shown Create an Account button$")
	public void createAnAccountButtonIsDisplayed() throws Throwable {
		assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.CheckoutPage.createAnAccountButton));
	}
	
	@Then("^User is shown Sign In button$")
	public void user_is_shown_Sign_In_button() throws Throwable {
		assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.CheckoutPage.signInButton));
	}
	
	@When("^User taps on Continue as Guest button$")
	public void user_taps_on_Continue_as_Guest_button() throws Throwable {
		GlobalMobileHelper.tapOnElement(Locators.CheckoutPage.continueAsGuestButton);
	}
	
	@Then("^User sees \"([^\"]*)\" in contact information screen$")
	public void user_sees_in_contact_information_screen(String arg1) throws Throwable {
	    String actual = GlobalMobileHelper.getElementText(Locators.CheckoutPage.emailFieldLabel);
	    assertTrue(actual.equals(arg1));
	}
}

