package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.pageobject.ios.CartPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OMNI_22013 extends GlobalMobileHelper{
	
	private CartPage cp;
	private int previousQuantity = -1;
	
	private void initializeCartPageObject() {
		cp = new CartPage(driver);
	}
	
	@Given("^User has launched the app and is on PDP$")
	public void launchApp() throws Throwable {
		//TODO: Integrate the code that will navigate to cart
	}

	@And("^User has tapped on add product to cart$")
	public void addProductToCart() throws Throwable {
		driver.findElement(By.id("btn_add_to_cart")).click();
		
	}
	
	@When("^User taps on view cart button$")
	public void tapOnViewCart() throws Throwable {
		
	}
	
	@Then("^User navigates to cart detail page$")
	public void navigationToCart() throws Throwable {
		initializeCartPageObject();
	}
	
	@And("^User sees \"Your Cart\" label$")
	public void isCartLabelDisplayed() throws Throwable {
	    assertTrue(cp.isYourCartLabelDisplayed());
	}
	
	@And("^User sees items label$")
	public void isItemsLabelDisplayed() throws Throwable {
		assertTrue(cp.isItemCountLabelDisplayed());
	}
	
	@And("^User sees subtotal header$")
	public void isSubtotalDisplayed() throws Throwable {
		assertTrue(cp.isSubtotalHeaderDisplayed());
	}
	
	@And("^User sees product title$")
	public void isProductTitleDisplayed() throws Throwable {
		assertTrue(cp.isProductTitleDisplayed());
	}
	
	@And("^User sees SKU label$")
	public void isSkuDisplayed() throws Throwable {
		assertTrue(cp.isProductSkuDisplayed());
	}
	
	@And("^User sees Price label$")
	public void isPriceLabelDisplayed() throws Throwable {
		assertTrue(cp.isProductSkuDisplayed());
	}
	
	@And("^User sees Quantity Selector$")
	public void isQuantitySelectorDisplayed() throws Throwable {
		assertTrue(cp.isProductQuantitySelectorDisplayed());
	}
	
	@And("^User sees Remove from cart button$")
	public void isRemoveFromCartButtonDisplayed() throws Throwable {
		assertTrue(cp.isRemoveFromCartButtonDisplayed());
	}
	
	@And("^User sees Add to wish list button$")
	public void isAddToWishListButtonDisplayed() throws Throwable {
	    assertTrue(cp.isAddToWishlistButtonDisplayed());
	}
	
	@When("^User taps on increment button$")
	public void tapOnIcrementButton() throws Throwable {
		previousQuantity = Integer.parseInt(cp.getProductQuantity());
		cp.incrementQuantityByOne();
	}
	
	@Then("^Quantity is increased by one$")
	public void qtyIncreasedByOne() throws Throwable {
		int increasedQty = Integer.parseInt(cp.getProductQuantity());
		assertEquals(increasedQty,previousQuantity+1);
		
	}
	
	@When("^User taps on decrement button$")
	public void tapOnDecrementButton() throws Throwable {
		previousQuantity = Integer.parseInt(cp.getProductQuantity());
		cp.decremenntQuantityByOne();
	}
	
	@Then("^Quantity is decreased by one$")
	public void user_click_on_Go_Button() throws Throwable {
		int decreasedQty = Integer.parseInt(cp.getProductQuantity());
		assertEquals(decreasedQty,previousQuantity-1);
	}
}
