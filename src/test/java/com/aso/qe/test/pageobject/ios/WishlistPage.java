package com.aso.qe.test.pageobject.ios;

import org.apache.log4j.Logger;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class WishlistPage {
	
	private static final Logger logger = Logger.getLogger(LoginPage.class.getName());

	private String wishlistFieldType;
	
	private AppiumDriver<MobileElement> driver;
	public WishlistPage(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	 }
	
	public boolean isWishListPageDisplayed() {
		MobileElement wishListpage  = driver.findElement(Locators.WishlistPage.wishlistTitle);
		return wishListpage.isDisplayed();
	}

	public void tapOnWishList() {
		if (GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.wishlist)) {
			GlobalMobileHelper.tapOnElement(Locators.WishlistPage.wishlist);
		}
	}

	public void tapOnWishListIcon(String arg1) {
		if (GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.wishlistIcon)) {
			GlobalMobileHelper.tapOnElement(Locators.WishlistPage.wishlistIcon);
		}		
	}
	
	public void enterWishlistName(String wishlist) {
		MobileElement wishlistField = driver.findElement(Locators.WishlistPage.wishlistTextInput);
		wishlistField.sendKeys("My List");
		wishlistFieldType = wishlistField.getAttribute("type");
		logger.debug(wishlistFieldType);
	}

	public void buttonEnabled(String btn) {
		GlobalMobileHelper.isElementEnabled(Locators.WishlistPage.wishlistAddButton);	
	}

	public void tapOnAddWishListButton(String button) {
		if (GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.wishlistAddButton)) {
			GlobalMobileHelper.tapOnElement(Locators.WishlistPage.wishlistAddButton);
		}	
	}

	public void tapOnBackButton(String back) {
		GlobalMobileHelper.tapOnElement(Locators.WishlistPage.backBtn);		
	}
	
}
