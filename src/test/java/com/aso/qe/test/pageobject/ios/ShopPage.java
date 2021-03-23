package com.aso.qe.test.pageobject.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ShopPage {
	
	private AppiumDriver<MobileElement> driver;
	public ShopPage(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	}
	
	public boolean isShopPageDisplayed() {
		MobileElement shopPageHeader = driver.findElement(Locators.ShopPage.shopPageTitle);
		return shopPageHeader.isDisplayed();
	}
	public void tapOnShopSubCat() {
		GlobalMobileHelper.tapOnElement(Locators.ShopPage.subcat);
	}
	public void tapOnShopAll() {
		GlobalMobileHelper.tapOnElement(Locators.ShopPage.shopAll);
	}
}
