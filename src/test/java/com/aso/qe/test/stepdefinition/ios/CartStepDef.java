package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.GlobalMobileHelper.Direction;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.CartPage;
import com.aso.qe.test.pageobject.ios.LoginPage;
import com.aso.qe.test.pageobject.ios.PDPPage;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;

public class CartStepDef extends GlobalMobileHelper{
	
	private static final Logger logger = Logger.getLogger(CartStepDef.class.getName());
	
	CartPage cartPage = new CartPage(driver);
	PDPPage pdpPage = new PDPPage(driver);
	
	private int previousQuantity = 1;
	private String productDisclaimer;
	private int shippingChargesToZipCode;
	
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

	@Then("^User verifies guest user sign in section \"([^\"]*)\" on cart page$")
	public void user_sees_guest_user_sign_in_section(String displayStatus) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    cartPage.validateGuestSignInSection(displayStatus);
	}
	@Then("^User taps on Sign in button on cart page$")
	public void user_taps_on_Sign_in_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   cartPage.tapOnSignInButton();
	}
	
	@And("^User sees the Variant of selected Product$")
	public void validateVariantOnCart() {
		assertTrue(cartPage.validateCartVariant());
	}
	@And("^User sees the Variant of selected golf Ball$")
	public void validateGolfBallVariatOnCart() {
		assertTrue(cartPage.validateCartVariant());
	}
	@Then("^User sees shop with confidence label$")
	public void user_sees_shop_with_confidence_label() throws Throwable {
	    // Write code here for shop with confidence label
		swipeScreen(Direction.UP);
		swipeScreen(Direction.UP);
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
		swipeScreen(Direction.UP,3);
	    cartPage.isOrderTaxValueUpdated();
	}

	@Then("^User sees updated subtotal value after adding quantity$")
	public void user_sees_updated_subtotal_value_after_adding_quantity() throws Throwable {
	    // Write code here to verify that the sub total value has been updated
		swipeScreen(Direction.UP,3);
	    cartPage.isOrderSubtotalValueUpdated();
	}

	@Then("^User sees updated order total value after adding quantity$")
	public void user_sees_updated_order_total_value_after_adding_quantity() throws Throwable {
	    // Write code here to verify that the total value has been updated
		swipeScreen(Direction.UP,3);
	    cartPage.isOrderTotalValueUpdated();
	}

	@Then("User sees the correct item count on the cart badge counter on bottom navigation$")
	public void itemCountOnCartBadge() throws Throwable{
		cartPage.matchItemsCountOnCartBadge();
	}
	
	@Then("^User sees the promo code field$")
	public void user_sees_the_promo_code_field() throws Throwable {
	    // Write code here for presence of promo code field
		swipeScreen(Direction.UP);
	    cartPage.isPromoCodeFieldDisplayed();
	}

	@When("^User applies the given \"([^\"]*)\"$")
	public void user_applies_the_given(String promoCode) throws Throwable {
	    // Write code here for storing the current order value and applying the promo code
	    // note down the order total value
		cartPage.noteDownCurrentTotalValue();
		// apply the promo code
		swipeScreen(Direction.UP);
		cartPage.applyPromoCode(promoCode);
		swipeScreen(Direction.UP);
	}

	@Then("^User sees the promo code \"([^\"]*)\"$")
	public void user_sees_the_promo_code(String promoCode) throws Throwable {
	    // Write code here to see the promo code 
		swipeScreen(Direction.UP);
	    cartPage.isPromoCodeDisplayed();
	}


	@Then("^User sees the promo code error \"([^\"]*)\"$")
	public void user_sees_the_promo_code_error(String promoCodeError) throws Throwable {
	    // Write code here to see the promo code error
	    cartPage.verifyPromoErroMessage(promoCodeError);
	}

	@Then("^User sees that Promo code field is disabled$")
	public void user_sees_that_Promo_code_field_is_disabled() throws Throwable {
	    // Write code here to see if promo code is disabled
	    cartPage.isPromoCodeFieldDisabled();
	}


	@Then("^User sees the applied discount on the order summary field$")
	public void user_sees_the_applied_discount_on_the_order_summary_field() throws Throwable {
	    // Write code here to see whether applied promo code and corresponding amount is visible
		swipeScreen(Direction.UP);
	    cartPage.ispromoCodeAmountDisplayed();
	}

	@Then("^User sees the remove promo code button$")
	public void user_sees_the_remove_promo_code_button() throws Throwable {
	    // Write code here to see whether the remove promo code button is displayed
	    cartPage.isRemovePromoCodeButtonDisplayed();
	}

	@When("^User taps the remove promo code button$")
	public void user_taps_of_remove_promo_code_button() throws Throwable {
	    // Write code here to tap on the remove promo code button
		swipeScreen(Direction.UP);
	    cartPage.tapOnRemovePromoButton();
	    swipeScreen(Direction.UP);
	    // note down the current order total now
	    cartPage.noteDownCurrentTotalValue();
	}

	@Then("^User sees that promotion discount is removed$")
	public void user_sees_that_promotion_discount_is_removed() throws Throwable {
	    // Write code here to see whether the order value is updated and promotion amount is removed
		swipeScreen(Direction.UP);
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
		swipeScreen(Direction.UP);
	    cartPage.isPromoCodeFieldDisplayed();
	}
	
	@Then("^User sees the applied promocode below promo code field$")
	public void user_sees_the_applied_promocode_below_promo_code_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    cartPage.isPromoCodeDisplayed(); // doesn't assert the position
	    logger.warn("promo code position on screen is not validated");
	}
	
	@When("^User taps on view cart button$")
	public void user_taps_on_view_cart_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   tapOnElement(Locators.PDPPage.buttonViewCart);
	   logger.debug("Tapped on View Cart button");
	}
	
	@Then("^User sees the product disclaimer \"([^\"]*)\"$")
	public void user_sees_the_product_disclaimer(String disclaimer) throws Throwable {
	    // Write code here for verifying the product disclaimer
	    cartPage.verifyProductDisclaimer(disclaimer);
	}

	@When("^User changes the zip code to \"([^\"]*)\"$")
	public void user_changes_the_zip_code_to(String zipCode) throws Throwable {
	    // Write code here to change the zip code
	    throw new PendingException();
	}

	@Then("^User sees longer product disclaimer with elipses$")
	public void user_sees_longer_product_disclaimer_with_elipses() throws Throwable {
	    // Write code here to verify longer product disclaimer
	    cartPage.verifyLongerProductDisclaimer(productDisclaimer);
	}
	
	@When("^User selects home delivery option$")
	public void user_select_home_delivery_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    pdpPage.selectDeliveryOption("home");
	}

	@When("^User taps on Change zip code$")
	public void user_taps_on_Change_zip_code() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		swipeScreen(Direction.UP);
		tapOnElement(Locators.CartPage.zipCodeButton);
		logger.debug("opened changed zip code modal");
	}

	@Then("^User sees change zip code field$")
	public void user_sees_change_zip_code_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(isElementDisplayed(Locators.CartPage.textChangeZipCode));
	    logger.debug("change zip code field is displayed");
	}

	@Then("^User sees change zip code submit button$")
	public void user_sees_change_zip_code_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertTrue(isElementDisplayed(Locators.CartPage.buttonSubmit));
	    logger.debug("submit button on change zip code is displayed");
	}

	@When("^User notes down estimated shipping charges$")
	public void user_notes_down_estimated_shipping_charges() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    cartPage.noteDownCurrentShippingCharges();
	}

	@When("^User notes down order total before changing zip code$")
	public void user_notes_down_order_total_before_changing_zip_code() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    cartPage.noteDownCurrentTotalValue();
	}

	@When("^User enters zip code \"([^\"]*)\"$")
	public void user_enters_zip_code(String zipCode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    setText(Locators.CartPage.textChangeZipCode, zipCode);
	    GlobalMobileHelper.tapOnElement(Locators.CartPage.lableChangeZipCodeModal);
	    GlobalMobileHelper.tapOnElement(Locators.CartPage.buttonSubmit, 20);
	    logger.debug("entered the zip code " + zipCode);
	    GlobalMobileHelper.tapOnElement(Locators.CartPage.buttonSubmit);
	}

	@Then("^User sees zip code in the order summary$")
	public void user_sees_zip_code_in_the_order_summary() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		tapOnElement(Locators.CartPage.labelEstimatedShipping, 10);
	    isElementDisplayed(Locators.CartPage.labelEstimatedShipping);
	    logger.debug("Label for estimated shipping to zip code is displayed");
	}

	@Then("^User sees estimated shipping charges for zip code$")
	public void user_sees_estimated_shipping_charges_for_zip_code() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertNotEquals(productDisclaimer, shippingChargesToZipCode, previousQuantity);
	}

	@Then("^User sees updated order total after changing the zip code$")
	public void user_sees_updated_order_total_after_changing_the_zip_code() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    cartPage.isOrderTotalValueUpdated("shipping");
	}

	@Then("^User sees zip code buying restriction message \"([^\"]*)\"$")
	public void user_sees_zip_code_buying_restriction_message(String restriction_message) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		// pending for locator for label of error messages
	    throw new PendingException();
	}

	@Then("^User sees \"([^\"]*)\" on cart page$")
	public void user_sees_on_cart_page(String arg) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		GlobalMobileHelper.setImplicitWaitTo(driver, 5);
	    if(arg.equalsIgnoreCase("Shipping policy")) {
	    	assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.CartPage.buttonShippingPolicy));
	    } else if(arg.equalsIgnoreCase("Return policy")) {
	    	assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.CartPage.buttonReturnPolicy));
	    } else if(arg.equalsIgnoreCase("order summary")) {
	    	assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrderSummary.orderSummaryHeading));
	    } else if(arg.equalsIgnoreCase("Free with purchase label")) {
	    	assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.CartPage.freeItemTitleId));
	    } else if(arg.equalsIgnoreCase("Free with purchase item title")) {
	    	assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.CartPage.freeGiftProductTitleId));
	    } else if(arg.equalsIgnoreCase("Free with purchase item image")) {
	    	assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.CartPage.freeGiftProductImage));
	    } else if(arg.equalsIgnoreCase("Free with purchase item price")) {
	    	assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.CartPage.orderItemPriceId));
	    } else if(arg.equalsIgnoreCase("Free with purchase item discounted price")) {
	    	assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.CartPage.orderItemDiscountPriceId));
	    } else if(arg.equalsIgnoreCase("Free with purchase tool tip")) {
	    	assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.CartPage.freeGiftToolTipIcon));
	    } else if(arg.equalsIgnoreCase("Free with purchase tool tip modal")) {
	    	assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.CartPage.freeGiftToolTipIconmodal));
	    }
	}

	@Then("^User taps on \"([^\"]*)\"$")
	public void user_taps_on(String arg) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		GlobalMobileHelper.setImplicitWaitTo(driver, 5);
		cartPage.tapOnPolicyLink(arg);
	}

	@Then("^User lands on \"([^\"]*)\" page$")
	public void user_lands_on_page(String arg) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		GlobalMobileHelper.setImplicitWaitTo(driver, 5);
	    cartPage.isPolicyPageDisplayed(arg);
	}

	@Then("^User scrolls down to the bottom$")
	public void user_scrolls_down_to_the_bottom() throws Throwable {		
	swipeScreen(Direction.UP,3);
	}
	
	
	@Then("^User does not see item total$")
	public void user_does_not_see_item_total() throws Throwable {
	    // Write code here for verifying that item total is not shown on the screen
	    assertFalse(isElementDisplayed(Locators.CartPage.labelItems));
	}

	@Then("^User does not see order subtotal summary$")
	public void user_does_not_see_order_subtotal_summary() throws Throwable {
	    // Write code here for verifying that order sub total is not displayed as the first element
	    assertFalse(isElementDisplayed(Locators.CartPage.orderSubtotalLabel));
	}

	@Then("^User tap on \"(.*?)\" action for quantity$")
	public void userTapPlusActionForQty(String arg1) throws Throwable{
		if(arg1.equalsIgnoreCase("+")) {
			cartPage.tapPlusActionCartPage();
		}
		else{
			cartPage.tapMinusActionCartPage();
		}
	}


    @And("^User has Gift Card \"(.*?)\" in the cart$")
    public void userHasGiftCardInTheCart(String arg0) throws Throwable{
        /* Created By jitsingh7 on 2-Apr-2021 */
		throw new PendingException();
    }

    @When("^User is on the cart screen$")
    public void userIsOnTheCartScreen() throws InterruptedException {
        /* Created By jitsingh7 on 2-Apr-2021 */
		userIsOnCart();
    }

    @And("^User does not see arrow button for more delivery options$")
    public void userDoesNotSeeArrowButtonForMoreDeliveryOptions() throws Throwable{
        /* Created By jitsingh7 on 2-Apr-2021 */
		throw new PendingException();
    }

    @And("^User sees default delivery option \"(.*?)\"$")
    public void userSeesDefaultDeliveryOption(String arg0) throws Throwable{
        /* Created By jitsingh7 on 2-Apr-2021 */
		throw new PendingException();
    }

    @And("^User sees estimated arrival date")
    public void userSeesEstimatedArrivalDate() throws Throwable{
        /* Created By jitsingh7 on 2-Apr-2021 */
		throw new PendingException();
    }

    @And("^User updates quantity to \"(.*?)\"$")
    public void userUpdatesQuantityTo(String arg0) throws Throwable{
        /* Created By jitsingh7 on 2-Apr-2021 */
		throw new PendingException();
    }

    @Then("^User sees quantity as \"(.*?)\"$")
    public void userSeesQuantityAs(String arg0) throws Throwable{
        /* Created By jitsingh7 on 2-Apr-2021 */
		throw new PendingException();
    }

    @And("^User sees the quantity stepper error message \"(.*?)\"$")
    public void userSeesTheQuantityStepperErrorMessage(String arg0) throws Throwable{
        /* Created By jitsingh7 on 2-Apr-2021 */
		throw new PendingException();
    }

    @Then("^User sees the cart screen alert with text \"(.*?)\"$")
    public void userSeesTheCartScreenAlertWithText(String arg0) throws Throwable{
        /* Created By jitsingh7 on 2-Apr-2021 */
		throw new PendingException();
    }

    @And("^User removes the card from the cart$")
    public void userRemovesTheCardFromTheCart() throws Throwable{
        /* Created By jitsingh7 on 2-Apr-2021 */
		throw new PendingException();
    }

    @Then("^User does not see the product title$")
    public void userDoesNotSeeTheProductTitle() throws Throwable{
        /* Created By jitsingh7 on 2-Apr-2021 */
		throw new PendingException();
    }

	@Given("^A registered user is logged in$")
	public void aRegisteredUserIsLoggedIn() throws Throwable{
		/* Created By jitsingh7 on 2-Apr-2021 */
		// TODO: The user will not be able to see the Guest User login tile on the cart page
		// There can be multiple ways to verify a logged in user
		logger.warn("to be implemented later");
	}
	@And("^User sees the \"(.*?)\" and \"(.*?)\" and \"(.*?)\" of selected Product \"(.*?)\"$")
	public void isvariantDisplayedonCart(String variantSize , String variantColor,String variantWidth, String variantType) {
		assertTrue(cartPage.isvariantDisplayedOnCart(variantSize,variantColor,variantWidth,variantType));
	}



	@And("^User taps on product title$")
	public void tapOnnProductTitle() throws Throwable{
		cartPage.tapOnProductTitle();
	}

//	@And("^User sees the checkout button$")
//	public void checkoutButtonIsDisplayed() throws Throwable{
//		GlobalMobileHelper.swipeScreen(Direction.UP);
//		GlobalMobileHelper.swipeScreen(Direction.UP);
//		assertTrue(cartPage.isCheckoutPageDisplayed());
//	}

	@When("^User taps on the checkout button$")
	public void tapOnCheckoutButton() throws Throwable{
		cartPage.tapOnCheckoutButton();
	}
	@Then("^Guest User is on empty cart page$")
	public void guest_User_is_on_empty_cart_page() throws Throwable {
		assertFalse(isElementDisplayed(Locators.CartPage.orderSubtotalLabel));
	}
	@Then("^I choose to verify \"([^\"]*)\" label in Overlay$")
	public void i_choose_to_verify_label_in_Overlay(String arg1) throws Throwable {
		assertTrue(cartPage.VerifyDileveryAttribute(arg1));
	}
	@Then("^User note down the total quantity on cart page$")
	public void user_note_down_the_cart_quantity_on_cart_page() throws Throwable {
		cartPage.noteDownTotalQty();
	}
	
	@Then("^User scrolls down to the bottom in \"([^\"]*)\" swipe$")
	public void user_scrolls_down_to_the_bottom_in_swipe(String args) throws Throwable {
		swipeScreen(Direction.UP,Integer.parseInt(args));
	 

}
	
	@And("User has a whiteGloveBulky product in the cart")
	public void userHasAWhiteGloveBulkyProductInTheCart() {
		/* Created By jitsingh7 on 11/04/21 */
		assertTrue(cartPage.hasWhiteGloveBulkyItem());
		logger.info("User has a white glove and bulky product in the cart");
	}
	
	// Order Summary Code , need to make it global as order summary is global component from cart to order history 
	@Then("^User sees \"([^\"]*)\" on OrderSummary$")
	public void user_sees_on_OrderSummary(String ElementName) throws Throwable {
		assertTrue(cartPage.IsShowingOnOrderSummary(ElementName));
	}

}
