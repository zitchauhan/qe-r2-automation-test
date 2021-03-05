package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.pageobject.ios.ShopPage;
import com.aso.qe.test.pageobject.ios.WishlistPage;

import cucumber.api.java.en.Then;

public class ShopStepDef extends GlobalMobileHelper{
	
	ShopPage shopPage = new ShopPage(driver);
	
	@Then("^User sees the shop page$")
	public void userIsOnShopPage() {
		assertTrue(shopPage.isShopPageDisplayed());
	}
}
