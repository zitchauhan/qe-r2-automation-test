package com.aso.qe.test.pageobject.ios;

import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AccountPage {
	
	private AppiumDriver<MobileElement> driver;
	public AccountPage(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	}
	
	public boolean isAccountPageDisplayed() {
		MobileElement accountPageTitle = driver.findElement(Locators.AccountPage.accountTitle);
		return accountPageTitle.isDisplayed();
	}
}
