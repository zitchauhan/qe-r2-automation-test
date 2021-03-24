package com.aso.qe.test.pageobject.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ShopNewPage {
	
	private AppiumDriver<MobileElement> driver;
	public ShopNewPage(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	 }
	public boolean isShopNewPageDisplayed() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		GlobalMobileHelper.tapOnElement(Locators.ShopNewPage.allowOnceBtn);
		GlobalMobileHelper.tapOnElement(Locators.ShopNewPage.oKBtnLocation);
		
		boolean stat = GlobalMobileHelper.isElementDisplayed(Locators.ShopNewPage.shopNewTitle);
		return stat;
	}
	public void tapOnBackBtn() {
		GlobalMobileHelper.tapOnElement(Locators.ShopNewPage.backBtn);
	}
  
}
