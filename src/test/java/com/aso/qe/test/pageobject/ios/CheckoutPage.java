package com.aso.qe.test.pageobject.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CheckoutPage {
	
	AppiumDriver<MobileElement> driver;
	public CheckoutPage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	public boolean isCheckoutPageDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.CheckoutPage.labelTitle);
	}
}
