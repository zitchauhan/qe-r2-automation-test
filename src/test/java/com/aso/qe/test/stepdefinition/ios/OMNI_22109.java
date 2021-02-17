package com.aso.qe.test.stepdefinition.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.pageobject.ios.BottomNav;
import com.aso.qe.test.pageobject.ios.EmptyCartPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OMNI_22109 extends GlobalMobileHelper{
	private BottomNav bn;
	private int previousQuantity = -1;
	
	private void initializeCartPageObject() {
		bn = new BottomNav(driver);
	}
	
	@Given("^User has launched the app$")
	public void navigateToEmptyCartPage() throws Throwable {
		bn = new BottomNav(driver);
	}
	
	@When("^User taps on homepage$")
	public void tapOnHome() {
		bn.tapOnHome();
	}
	
	@Then("^User is navigated to homepage$")
	public void isHomePageDisplayed() {
		
	}
	
	@When("^User taps on shop page$")
	public void tapOnShop() {
		bn.tapOnShop();
	}
	
	@Then("^User is navigated to shop page$")
	public void isShopPageDisplayed() {
		
	}
	
	@When("^User taps on wishlist page$")
	public void tapOnWishlist() {
		bn.tapOnWishList();
	}
	
	@Then("^User is navigated to wishlist page$")
	public void isWishlistPageDisplayed() {
		
	}
	
	@When("^User taps on cart page$")
	public void tapOnCart() {
		bn.tapOnCart();
	}
	
	@Then("^User is navigated to cart page$")
	public void isCartPageDisplayed() {
		
	}
	
	@When("^User taps on account page$")
	public void tapOnAccount() {
		bn.tapOnHome();
	}
	
	@Then("^User is navigated to account page$")
	public void isAccountPageDisplayed() {
		
	}
}