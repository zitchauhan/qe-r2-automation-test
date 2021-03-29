package com.aso.qe.test.pageobject.ios;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.stepdefinition.ios.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class StorePickup {
	private static final Logger logger = Logger.getLogger(Hooks.class);
	private AppiumDriver<MobileElement> driver;
	
	public StorePickup(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	  PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	Context context = new Context();

	public void isFindNearestStorePageDisplayed() {
		assertTrue("Find your nearest store page is not displayed",GlobalMobileHelper.isElementDisplayed(Locators.storePickup.findYourStoreMessage));		
	}

	public void isOptionDisplayed(String option) {
		MobileElement element = null;
		switch (option) {
		case "ALLOW LOCATION SERVICES":
			element = driver.findElement(Locators.storePickup.allowLocationService);
			break;
		case "ENTER CITY OR ZIPCODE":
			element = driver.findElement(Locators.storePickup.enterCityOrZipcode);
			break;
		case "Maybe Later":
			element = driver.findElement(Locators.storePickup.maybeLater);
			break;
		case "Allow all the timeS":
			element = driver.findElement(Locators.storePickup.allowAllTheTime);
			break;
		case "allowWhileUsingApp":
			element = driver.findElement(Locators.storePickup.allowWhileUsingApp);
			break;
		case "Don't allow":
			element = driver.findElement(Locators.storePickup.doNotAllow);
			break;
		
		}
		assertTrue(option+ " is not available on current screen",GlobalMobileHelper.isElementDisplayed(element));
	}

	public void tapOnOption(String option) {
		MobileElement element = null;
		switch (option) {
		case "ALLOW LOCATION SERVICES":
			element = driver.findElement(Locators.storePickup.allowLocationService);
			break;
		case "ENTER CITY OR ZIPCODE":
			element = driver.findElement(Locators.storePickup.enterCityOrZipcode);
			break;
		case "Maybe Later":
			element = driver.findElement(Locators.storePickup.maybeLater);
			break;
		case "Allow all the timeS":
			element = driver.findElement(Locators.storePickup.allowAllTheTime);
			break;
		case "allowWhileUsingApp":
			element = driver.findElement(Locators.storePickup.allowWhileUsingApp);
			break;
		case "Don't allow":
			element = driver.findElement(Locators.storePickup.doNotAllow);
			break;	
		}
		GlobalMobileHelper.tapOnElement(element);
	}

	public void isServicePopupDisplayed() {
		assertTrue("Service popup is not displayed on current screen",GlobalMobileHelper.isElementDisplayed(Locators.storePickup.allowLocationService));	
		
	}
	

}
