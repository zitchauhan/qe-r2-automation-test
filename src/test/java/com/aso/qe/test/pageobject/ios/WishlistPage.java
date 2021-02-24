package com.aso.qe.test.pageobject.ios;

import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class WishlistPage {
	
	private AppiumDriver<MobileElement> driver;
	public WishlistPage(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	 }
	
	public boolean isWishListPageDisplayed() {
		MobileElement wishListpage  = driver.findElement(Locators.WishlistPage.wishlistTitle);
		return wishListpage.isDisplayed();
	}
}
