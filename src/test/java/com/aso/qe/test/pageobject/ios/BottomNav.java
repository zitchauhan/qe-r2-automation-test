package com.aso.qe.test.pageobject.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class BottomNav{
	
	private AppiumDriver<MobileElement> driver;
	public BottomNav(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	}
	
	public void tapOnHome() throws Throwable{
		MobileElement home = driver.findElement(Locators.BottomNav.home);
		GlobalMobileHelper.tapOnElement(home);
	}
	
	public void tapOnShop() throws Throwable{
		MobileElement shop = driver.findElement(Locators.BottomNav.shop);
		GlobalMobileHelper.tapOnElement(shop);
	}
	
	public void tapOnWishList() throws Throwable {
		MobileElement wishList = driver.findElement(Locators.BottomNav.wishlist);
		GlobalMobileHelper.tapOnElement(wishList);
	}
	
	public void tapOnCart() throws Throwable {
		Thread.sleep(5000);
		MobileElement cart = driver.findElement(Locators.BottomNav.cart);
		GlobalMobileHelper.tapOnElement(cart);
	}
	
	public void tapOnAccount() throws Throwable {
		GlobalMobileHelper.setImplicitWaitTo(driver, 5);
		MobileElement account = driver.findElement(Locators.BottomNav.account);
		GlobalMobileHelper.tapOnElement(account);
	}
}