package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.pageobject.ios.HomePage;
import com.aso.qe.test.pageobject.ios.WishlistPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WishListStepDef extends GlobalMobileHelper{
	
	WishlistPage wishlistPage = new WishlistPage(driver);
	
	@Then("^User sees the wishlist page$")
	public void userIsOnWishlistPage() {
		assertTrue(wishlistPage.isWishListPageDisplayed());
	}
	
	@Then("^User should not see the wishlist page$")
	public void wishListPageNotBeDisplayed() {
		assertTrue(!wishlistPage.isWishListPageDisplayed());
	}
	
	//OMNI-33102
	@When("^User taps on Wishlist$")
	public void tapOnWishlist() {
		wishlistPage.tapOnWishList();
	}
	
	@Then("^User taps on \"([^\"]*)\" icon$")
	public void user_taps_on__Wishlisticon(String arg1) {
		wishlistPage.tapOnWishListIcon(arg1);
	}

	@Then("^User enters wishlist name$")
	public void enterWishlistName() {
			String wishlist = "My List";
			wishlistPage.enterWishlistName(wishlist);
	}

	@Then("^User sees \"([^\"]*)\" button enabled$")
	public void user_sees_button_enabled(String btn) {
		wishlistPage.buttonEnabled(btn);
	}

	@Then("^User taps on \"([^\"]*)\" button$")
	public void user_taps_on_Add_Wishlist_button(String button) {
		wishlistPage.tapOnAddWishListButton(button);
	}
	
	@Then("^User sees \"([^\"]*)\" screen$")
	public void user_sees_screen(String arg) {
		verifyUserIsOnPage(arg);
	}

	@When("^User taps on \"([^\"]*)\" back button$")
	public void user_taps_on_back_button(String back) {
		wishlistPage.tapOnBackButton(back);
	}	 
}
