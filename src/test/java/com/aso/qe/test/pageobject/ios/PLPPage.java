package com.aso.qe.test.pageobject.ios;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.stepdefinition.ios.Hooks;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PLPPage {

	Context context = new Context();
	private static final Logger logger = Logger.getLogger(Hooks.class);
	private AppiumDriver<MobileElement> driver;
	public PLPPage(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	}
	
		public void verifyPLPPageName(String categoryName) throws InterruptedException{
		GlobalMobileHelper.isElementDisplayed(Locators.PLPPage.PLPHeader);
		String plpTitle = driver.findElement(Locators.PLPPage.PLPHeader).getText();
		assertTrue("User should be on "+categoryName+"PLP page but user is on "+plpTitle+ "page",categoryName.equalsIgnoreCase(plpTitle));
	}
	
}
