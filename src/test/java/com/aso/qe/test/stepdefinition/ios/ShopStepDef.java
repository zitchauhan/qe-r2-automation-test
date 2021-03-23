package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.pageobject.ios.ShopPage;
import com.aso.qe.test.pageobject.ios.WishlistPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ShopStepDef extends GlobalMobileHelper{
	
	ShopPage shopPage = new ShopPage(driver);
	
	@Then("^User sees the shop page$")
	public void userIsOnShopPage() {
		assertTrue(shopPage.isShopPageDisplayed());
	}
	@And("^User click on Shop sub categories$")
	public void tapOnSubCat() {
		shopPage.tapOnShopSubCat();
	}
	@And("^User click on Shop All$")
	public void tapOnShopAll() {
		shopPage.tapOnShopAll();
	}
}
