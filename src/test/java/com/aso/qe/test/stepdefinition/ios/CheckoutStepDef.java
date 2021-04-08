package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.CheckoutPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.pageobject.ios.CheckoutPage;

import cucumber.api.java.en.And;

public class CheckoutStepDef extends GlobalMobileHelper {
private static final Logger logger = Logger.getLogger(CheckoutStepDef.class.getName());
	CheckoutPage checkoutPage = new CheckoutPage(driver);
	
	@And("^User sees the checkout screen$")
	public void isCheckoutPageDisplayed() throws Throwable {
	    assertTrue(checkoutPage.isCheckoutPageDisplayed());
	}
	
	@Then("^User sees the checkout button$")
	public void user_sees_the_checkout_button() throws Throwable {
	    swipeScreen(Direction.UP, 5);
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
	
	@Then("^User verifies existing address are \"([^\"]*)\" on shipping information screen$")
	public void user_verifies_existing_address_are_on_shipping_information_screen(String visibility) throws Throwable {
		checkoutPage.isAddressDisplayed(visibility);
	}
	
	@Then("^User sees \"([^\"]*)\" on shipping information screen$")
	public void user_sees_on_shipping_information_screen(String arg1) throws Throwable {
		assertTrue("Add new address button is not displayed",isElementDisplayed(Locators.CheckoutPage.addNewAddress));
	}
	
	@Then("^User sees first address as default address$")
	public void user_sees_first_address_as_default_address() throws Throwable {
		checkoutPage.verifyDefaultAddress();
	}
	
	@Then("^User sees address not verified message on shipping information screen$")
	public void user_sees_address_not_verified_message_on_shipping_information_screen() throws Throwable {
		checkoutPage.verifyMessage();
	}
	@Then("^User taps on chevron icon in shipping section$")
	public void user_taps_on_chevron_icon_in_shipping_section() throws Throwable {
	   assertTrue("Add you shipping information link is not available",GlobalMobileHelper.isElementDisplayed(Locators.CheckoutPage.addYourShippingInformation));
	GlobalMobileHelper.tapOnElement(Locators.CheckoutPage.addYourShippingInformation);
	}
	
	@Then("^User edit the \"([^\"]*)\"$")
	public void user_edit_the_field(String fieldName) throws Throwable {
		checkoutPage.editFieldValue(fieldName);
	}
	@Then("^User taps on edit link of \"([^\"]*)\" address$")
	public void user_taps_on_edit_link_of_address(String arg) throws Throwable {
	   checkoutPage.tapOnEditAddressLink(arg);
	}

	@Then("^User navigated to edit shipping address screen$")
	public void user_navigated_to_edit_shipping_address_screen() throws Throwable {
	    checkoutPage.verifyEditShippingAddressPage();
	}
	@Then("^User verifies \"([^\"]*)\" is updated in \"([^\"]*)\" address$")
	public void user_verifies_information_is_updated_in_address(String field,String addressindex) throws Throwable {
	    checkoutPage.verifyUpdatedinformation(field,addressindex);
	}
	@Then("^User sees shipping Address title$")
	public void user_sees_shipping_Address_title() throws Throwable {
		checkoutPage.verifyShippingAddressTitle();
	}

	@Then("^User sees shipping message in shipping address section$")
	public void user_sees_shipping_message_in_shipping_address_section() throws Throwable {
		checkoutPage.verifyMessage();
	}
}
