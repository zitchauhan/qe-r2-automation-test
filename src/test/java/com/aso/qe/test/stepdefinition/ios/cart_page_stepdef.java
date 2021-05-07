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

public class cart_page_stepdef extends GlobalMobileHelper{
	private CartPage cart;
//	private int previousQuantity = -1;
	
	@Given("^User adds \"(.*?)\" qty of \"(.*?)\" item to the cart$")
	public void selectDeliveryAndAddItem(String arg1, String arg2) throws Throwable {
		initializeDriver();
		//TODO Integrate the code that will add item and move to cart page
		cart = new CartPage(driver);
	}

	@Then("^User goes to the cart page$")
	public void userGoesToTheCartPage() throws Throwable {
		//TODO Integrate the code that will add item and move to cart page
	}
	
	@Then("^User sees pre-selected delivery option for \"(.*?)\" item on the cart page$")
	public void userSeesPreSelectedDeliveryOption(String arg1) throws Throwable {
		if(arg1.equalsIgnoreCase("BOPIS"))
		{
			assertTrue(cart.bopisDeliveryOptionDisplayed());
		}
		
	}
	
	@And("^User sees delivery message for \"(.*?)\" item on the cart$")
	public void deliveryMessageOnCart(String arg1) throws Throwable{
		if(arg1.equalsIgnoreCase("BOPIS"))
		{
			assertTrue(cart.bopisDeliveryMessageCartDisplayed());			
		}
	}
	
	@And("^User sees arrow button for more delivery options$")
	public void arrorButtonForDeliveryOptions() throws Throwable{
		assertTrue(cart.arrowIconDeliveryOptionCartDisplayed());
	}
	
	@Then("^User clicks on chevron button$")
	public void userClicksChevronButton() throws Throwable{
		cart.clickChevronButtonCart();
	}
	
	@Then("^User sees both fulfillment options$")
	public void fulfillmentOptionCartPage() throws Throwable{
		assertTrue(cart.isBopisOptionsFulfillmentDisplayed());
		assertTrue(cart.isSthFulfillmentDisplayed());
	}
	
	@And("^User is able to click on \"(.*?)\" fulfillment option$")
	public void userClickOnFulfillmentOption(String arg1) throws Throwable{
		if(arg1.equalsIgnoreCase("BOPIS"))
		{
			cart.clickFreeStorePickUp();
		}
		
		else if(arg1.equalsIgnoreCase("STH"))
		{
			cart.clickHomeDelivery();
		}
	}
	
	@Given("^User goes to a cart page and deletes all the items$")
	public void userEmptyCart() throws Throwable {
		//TODO Integrate the code that will delete all the items available in the cart
	}
	
	@Then("^User sees no counter badge on the cart icon on bottom navigation$")
	public void noCounterBadgeOnCartIcon() throws Throwable {
		assertTrue(cart.noCounterBadgeCartIconDisplayed());
	}
	
//	@Then("User sees the correct item count on the cart badge counter on bottom navigation$")
//	public void itemCountOnCartBadge() throws Throwable{
//		cart.matchItemsCountOnCartBadge();
//	}
	

	
	@Then("^User edits the quantity to \"(.*?)\" on cart page$")
	public void editQuantityOnCartPage(String arg1) throws Throwable{
		cart.editQtyCartPage(arg1);
	}
	
	@Given("^User is able to see cart icon on bottom navigation$")
	public void cartIconVisibleBottomNav() throws Throwable{
		cart.iscartIconBottomNavDisplayed();
	}
	
	@Then("^User taps on the cart icon on bottom navigation$")
	public void tapCartIconBottomNav() throws Throwable{
		cart.clickCartIconBottomNav();
	}
	
	
	@Then("^user click on \"([^\"]*)\"  button on cart page$")
	public void user_click_on_button_on_cart_page(String btnName) throws Throwable {
		 CartPage.clickonButtononcartpage(btnName);
	}
	@Then("^user see \"([^\"]*)\" page$")
	public void user_see_page(String pagename) throws Throwable {
		assertTrue(CartPage.VarifyUserisonwishlistpage(pagename));
	}
	
	@Then("^user click on \"([^\"]*)\" on wish list page$")
	public void user_click_on_on_wish_list_page(String btnName) throws Throwable {
		 CartPage.clickonButtononcartwishpage(btnName);
	}
}