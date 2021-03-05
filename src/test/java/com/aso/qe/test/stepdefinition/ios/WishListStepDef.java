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
	public void userIsOnHomePage() {
		assertTrue(wishlistPage.isWishListPageDisplayed());
	}
}
