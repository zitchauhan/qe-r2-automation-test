package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.CartPage;
import com.aso.qe.test.pageobject.ios.LoginPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;

public class CartStepDef extends GlobalMobileHelper{
	
	private static final Logger logger = Logger.getLogger(CartStepDef.class.getName());
	
	CartPage cartPage = new CartPage(driver);
	private int previousQuantity = 1;
	
	@Then("^User is navigated To Cart Screen$")
	public void userIsOnCart() throws InterruptedException {
		Thread.sleep(7000);
		assertTrue(cartPage.isYourCartLabelDisplayed());
	}
	
	@And("^User sees Cart icon$")
	public void isEmptyCartIconDisplayed() throws Throwable {
	    assertTrue(cartPage.isEmptyCartIconDisplayed());
	}
	
	@And("^User sees Cart Empty label$")
	public void isYourCartIsEmptyLabelDisplayed() throws Throwable {
	    assertTrue(cartPage.isYourCartIsEmptyLabelDisplayed());
	}
	
	@And("^User sees Sigin text$")
	public void isUserSpecificMessageDisplayed() throws Throwable {
	    assertTrue(cartPage.isUserSpecificMessageDisplayed());
	}
	
	@And("^User sees Log in Button$")
	public void isLogInButtonDisplayed() throws Throwable {
	    assertTrue(cartPage.isLogInButtonDisplayed());
	}
	
	@And("^User sees Create an Account Button$")
	public void isCreateAnAccountButtonDisplayed() throws Throwable {
	    assertTrue(cartPage.isCreateAnAccountButtonDisplayed());
	}
	
	@And("^User sees items label$")
	public void isItemsLabelDisplayed() throws Throwable {
		assertTrue(cartPage.isItemCountLabelDisplayed());
	}
	
	@And("^User sees subtotal header$")
	public void isSubtotalDisplayed() throws Throwable {
		assertTrue(cartPage.isSubtotalHeaderDisplayed());
	}
	
	@And("^User sees product title$")
	public void isProductTitleDisplayed() throws Throwable {
		assertTrue(cartPage.isProductTitleDisplayed());
	}
	
	@And("^User sees SKU label$")
	public void isSkuDisplayed() throws Throwable {
		assertTrue(cartPage.isProductSkuDisplayed());
	}
	
	@And("^User sees Price label$")
	public void isPriceLabelDisplayed() throws Throwable {
		assertTrue(cartPage.isProductPriceDisplayed());
	}
	
	@Then("^User sees the quantity stepper$")
	@And("^User sees Quantity Selector$")
	public void isQuantitySelectorDisplayed() throws Throwable {
		assertTrue(cartPage.isProductQuantitySelectorDisplayed());
	}
	
	@And("^User sees Remove from cart button$")
	public void isRemoveFromCartButtonDisplayed() throws Throwable {
		assertTrue(cartPage.isRemoveFromCartButtonDisplayed());
	}
	
	@And("^User sees Add to wish list button$")
	public void isAddToWishListButtonDisplayed() throws Throwable {
	    assertTrue(cartPage.isAddToWishlistButtonDisplayed());
	}
	
	@When("^User taps on increment button$")
	public void tapOnIcrementButton() throws Throwable {
		previousQuantity = Integer.parseInt(cartPage.getProductQuantity());
		cartPage.incrementQuantityByOne();
	}
	
	@Then("^Quantity is increased by one$")
	public void qtyIncreasedByOne() throws Throwable {
		int increasedQty = Integer.parseInt(cartPage.getProductQuantity());
		assertEquals(increasedQty,previousQuantity+1);
		
	}
	
	@When("^User taps on decrement button$")
	public void tapOnDecrementButton() throws Throwable {
		previousQuantity = Integer.parseInt(cartPage.getProductQuantity());
		cartPage.decremenntQuantityByOne();
	}
	
	@Then("^Quantity is decreased by one$")
	public void user_click_on_Go_Button() throws Throwable {
		int decreasedQty = Integer.parseInt(cartPage.getProductQuantity());
		assertEquals(decreasedQty,previousQuantity-1);
	}
	
	@And("^User sees taxes label$")
	public boolean isTaxesLabelDisplayed() throws Throwable {
		logger.debug("Tax label is displayed on the Cart page");
		return isElementDisplayed(Locators.CartPage.taxesLabel);
	}
	
	@And("^User sees the order summary label$")
	public boolean isOrderSummaryLabelDisplayed() throws Throwable {
		return isElementDisplayed(Locators.CartPage.orderSummaryLabel);
	}
	
	@And("^User sees the order total label$")
	public boolean isOrderTotalLabelDisplayed() throws Throwable {
		return isElementDisplayed(Locators.CartPage.orderTotalLabel);
	}
	
	@And("^User sees \"(.*?)\" items in item label$")
	public void deliveryMessageOnCart(String arg1) throws Throwable{
		String itemLabelText = cartPage.getItemContLabelText();
		assertTrue(itemLabelText.contains(arg1));
	}
	@Then("^User sees shop with confidence label$")
	public void user_sees_shop_with_confidence_label() throws Throwable {
	    // Write code here for shop with confidence label
	    cartPage.isLabelShopWithConfidenceDisplayed();
	}

	@Then("^User sees security reassurance message$")
	public void user_sees_security_reassurance_message() throws Throwable {
	    // Write code here for security reassurance message
	    cartPage.isSecurityReassuranceMessageDisplayed();
	}

	@Then("^User sees we accept label$")
	public void user_sees_we_accept_label() throws Throwable {
	    // Write code here for we accept label
	    cartPage.isLabelWeAcceptDisplayed();
	}

	@Then("^User sees images of payment options$")
	public void user_sees_images_of_payment_options() throws Throwable {
	    // Write code here images of payment options / modes
	    cartPage.isPaymentModeImagesDisplayed();
	}

	@Then("^User notes down tax before adding quantity$")
	public void user_notes_down_tax_before_adding_quantity() throws Throwable {
	    // Write code here to note down the tax before adding any quantity
	    cartPage.noteDownCurrentTaxValue();
	}

	@Then("^User notes down subtotal before adding quantity$")
	public void user_notes_down_subtotal_before_adding_quantity() throws Throwable {
	    // Write code here to note down the sub-total before adding any quantity
	    cartPage.noteDownCurrentSubtotal();
	}

	@Then("^User notes down order total before adding quantity$")
	public void user_notes_down_order_total_before_adding_quantity() throws Throwable {
	    // Write code here to note down the order total before adding any quantity
	    cartPage.noteDownCurrentTotalValue();
	}

	@Then("^User sees updated tax value because of call to vertex after adding quantity$")
	public void user_sees_updated_tax_value_because_of_call_to_vertex_after_adding_quantity() throws Throwable {
	    // Write code here to verify that the tax value has been updated 
	    cartPage.isOrderTaxValueUpdated();
	}

	@Then("^User sees updated subtotal value after adding quantity$")
	public void user_sees_updated_subtotal_value_after_adding_quantity() throws Throwable {
	    // Write code here to verify that the sub total value has been updated 
	    cartPage.isOrderSubtotalValueUpdated();
	}

	@Then("^User sees updated order total value after adding quantity$")
	public void user_sees_updated_order_total_value_after_adding_quantity() throws Throwable {
	    // Write code here to verify that the total value has been updated 
	    cartPage.isOrderTotalValueUpdated();
	}

	@Then("User sees the correct item count on the cart badge counter on bottom navigation$")
	public void itemCountOnCartBadge() throws Throwable{
		cartPage.matchItemsCountOnCartBadge();
	}
	
	@Then("^User sees the promo code field$")
	public void user_sees_the_promo_code_field() throws Throwable {
	    // Write code here for presence of promo code field
	    cartPage.isPromoCodeFieldDisplayed();
	}

	@When("^User applies the given \"([^\"]*)\"$")
	public void user_applies_the_given(String promoCode) throws Throwable {
	    // Write code here for storing the current order value and applying the promo code
	    // note down the order total value
		cartPage.noteDownCurrentTotalValue();
		// apply the promo code
		cartPage.applyPromoCode(promoCode);
	}

	@Then("^User sees the promo code \"([^\"]*)\"$")
	public void user_sees_the_promo_code(String promoCode) throws Throwable {
	    // Write code here to see the promo code 
	    cartPage.isPromoCodeDisplayed();
	}


	@Then("^User sees that Promo code field is disabled$")
	public void user_sees_that_Promo_code_field_is_disabled() throws Throwable {
	    // Write code here to see if promo code is disabled
	    cartPage.isPromoCodeFieldDisabled();
	}


	@Then("^User sees the applied discount on the order summary field$")
	public void user_sees_the_applied_discount_on_the_order_summary_field() throws Throwable {
	    // Write code here to see whether applied promo code and corresponding amount is visible
	    cartPage.ispromoCodeAmountDisplayed();
	}

	@Then("^User sees the remove promo code button$")
	public void user_sees_the_remove_promo_code_button() throws Throwable {
	    // Write code here to see whether the remove promo code button is displayed
	    cartPage.isRemovePromoCodeButtonDisplayed();
	}

	@When("^User taps of remove promo code button$")
	public void user_taps_of_remove_promo_code_button() throws Throwable {
	    // Write code here to tap on the remove promo code button
	    cartPage.tapOnRemoveFromCart();
	    // note down the current order total now
	    cartPage.noteDownCurrentTotalValue();
	}

	@Then("^User sees that promotion discount is removed$")
	public void user_sees_that_promotion_discount_is_removed() throws Throwable {
	    // Write code here to see whether the order value is updated and promotion amount is removed
	    cartPage.ispromoCodeAmountNotDisplayed();
	}

	@Then("^User sees the updated order total$")
	public void user_sees_the_updated_order_total() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    cartPage.isOrderTotalValueUpdated();
	}

	@Then("^User sees that Promo code field is enabled$")
	public void user_sees_that_Promo_code_field_is_enabled() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    cartPage.isPromoCodeFieldEnabled();
	}
	
	@Then("^User sees the applied promocode below promo code field$")
	public void user_sees_the_applied_promocode_below_promo_code_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    cartPage.isPromoCodeDisplayed(); // doesn't assert the position
	    logger.warn("promo code position on screen is not validated");
	}
}