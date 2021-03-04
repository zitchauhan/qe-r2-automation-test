package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.CartPage;
import com.aso.qe.test.pageobject.ios.LoginPage;

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
		MobileElement taxLabel = driver.findElement(Locators.CartPage.taxesLabel);
		assertTrue(taxLabel.isDisplayed());
		logger.debug("Tax label is displayed on the Cart page");
		return taxLabel.isDisplayed();
	}
	
	@And("^User sees the order summary label$")
	public boolean isOrderSummaryLabelDisplayed() throws Throwable {
		MobileElement taxLabel = driver.findElement(Locators.CartPage.orderSummaryLabel);
		return taxLabel.isDisplayed();
	}
	
	@And("^User sees the order total label$")
	public boolean isOrderTotalLabelDisplayed() throws Throwable {
		MobileElement orderTotal = driver.findElement(Locators.CartPage.orderTotalLabel);
		return orderTotal.isDisplayed();
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
}