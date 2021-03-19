package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.CartPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;

public class CartStepDef extends GlobalMobileHelper{
	
	
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
	@And("^User sees the Variant of selected Product$")
	public void validateVariantOnCart() {
		assertTrue(cartPage.validateCartVariant());
	}
	@And("^User sees the Variant of selected golf Ball$")
	public void validateGolfBallVariatOnCart() {
		assertTrue(cartPage.validateCartVariant());
	}
}