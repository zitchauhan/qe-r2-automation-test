package com.aso.qe.test.pageobject.ios;

import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.GlobalMobileHelper.Direction;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.stepdefinition.ios.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class StorePickup extends GlobalMobileHelper{
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
			assertTrue(option+ " is not available on current screen",GlobalMobileHelper.isElementDisplayed(Locators.storePickup.allowLocationService));
			break;
		case "ENTER CITY OR ZIPCODE":
			assertTrue(option+ " is not available on current screen",GlobalMobileHelper.isElementDisplayed(Locators.storePickup.enterCityOrZipcode));
			break;
		case "Maybe later":
			assertTrue(option+ " is not available on current screen",GlobalMobileHelper.isElementDisplayed(Locators.storePickup.maybeLater));
			break;
		case "Allow Once":
			assertTrue(option+ " is not available on current screen",GlobalMobileHelper.isElementDisplayed(Locators.storePickup.allowOnce));
			break;
		case "allowWhileUsingApp":
			assertTrue(option+ " is not available on current screen",GlobalMobileHelper.isElementDisplayed(Locators.storePickup.allowWhileUsingApp));
			break;
		case "Don't allow":
			assertTrue(option+ " is not available on current screen",GlobalMobileHelper.isElementDisplayed(Locators.storePickup.doNotAllow));
			break;
		default : logger.error(option+ " is not available on current screen");
		}
	}

	public void tapOnOption(String option) {
		GlobalMobileHelper.setImplicitWaitTo(driver, 5);
		switch (option) {	
		case "ALLOW LOCATION SERVICES":
			GlobalMobileHelper.tapOnElement(Locators.storePickup.allowLocationService);
			break;
		case "ENTER CITY OR ZIPCODE":
			GlobalMobileHelper.tapOnElement(Locators.storePickup.enterCityOrZipcode);
			break;
		case "Maybe later":
			GlobalMobileHelper.tapOnElement(Locators.storePickup.maybeLater);
			break;
		case "Allow Once":
			GlobalMobileHelper.tapOnElement(Locators.storePickup.allowOnce);
			break;
		case "Allow while using app":
			GlobalMobileHelper.tapOnElement(Locators.storePickup.allowWhileUsingApp);
			break;
		case "Don't allow":
			GlobalMobileHelper.tapOnElement(Locators.storePickup.doNotAllow);
			break;	
		default: logger.error("Options doesn't match");
		}
		
	}

	public void isServicePopupDisplayed() {
		assertTrue("Service popup is not displayed on current screen",GlobalMobileHelper.isElementDisplayed(Locators.storePickup.allowWhileUsingApp));	
	}

	public void verifyStoreList() {
		List<MobileElement> storeNameList = driver.findElements(Locators.storePickup.storeNameFindStore);
		List<MobileElement> storeDetailslinkList = driver.findElements(Locators.storePickup.storeNameFindStore);
		List<MobileElement> storeRadioBtnList = driver.findElements(Locators.storePickup.storeNameFindStore);
		logger.info(storeNameList.size()+" stores are displaying on page load");
		for(int i=0;i<storeNameList.size();i++) {
			if(i==4) {
			swipeScreenFromElement(Direction.UP,storeNameList.get(i),1); }
			assertTrue("Store name is not displayed for store number "+(i+1),GlobalMobileHelper.isElementDisplayed(storeNameList.get(i)));
			assertTrue("Store details link is not displayed for store number "+(i+1),GlobalMobileHelper.isElementDisplayed(storeDetailslinkList.get(i)));
			assertTrue("Store radio button is not displayed for store number "+(i+1),GlobalMobileHelper.isElementDisplayed(storeRadioBtnList.get(i)));
			logger.info("Name of Store no. "+(i+1)+" : "+storeNameList.get(i).getText());
			
		}
	}

	public void isAvailibilityMessageDisplayed() {
		List<MobileElement> storeNameList = driver.findElements(Locators.storePickup.storeNameFindStore);
		List<MobileElement> availibilityMessageList = driver.findElements(Locators.storePickup.availibilityMessage);
		logger.info(storeNameList.size()+" stores are displaying on page load");
		for(int i=0;i<storeNameList.size();i++) {
			if(i==4) {
			swipeScreenFromElement(Direction.UP,storeNameList.get(i),1); }
			assertTrue("Item availibility message is not displayed for store number "+(i+1),GlobalMobileHelper.isElementDisplayed(availibilityMessageList.get(i)));
	}
}

	public void verifyErrorMessage() {
		assertTrue("Error message is not displayed",GlobalMobileHelper.isElementDisplayed(Locators.storePickup.errorMessage));
		assertTrue("Error message is not expected",driver.findElement(Locators.storePickup.errorMessage).getText().equalsIgnoreCase("Sorry! There are no stores within 25 miles. Please order online or try new ZIP code."));
	}

	public void selectStore(int storeNumber) {
		List<MobileElement> storeNameList = driver.findElements(Locators.storePickup.storeNameFindStore);
		List<MobileElement> storeRadioBtnList = driver.findElements(Locators.storePickup.storeRadioBtn);
		logger.info(storeNameList.size()+" stores are displaying on page load");
		String fullStoreName, storeName;
		for(int i=0;i<storeRadioBtnList.size();i++) {
			if((i+1)==storeNumber) {
			logger.info("Tap on Store no. "+storeNumber);
			fullStoreName=storeNameList.get(i).getText();
			storeName= fullStoreName.split("(?=\\d)(?<!\\d)")[0].trim();
			Context.setStoreName(storeName);
			GlobalMobileHelper.tapOnElement(storeRadioBtnList.get(i));
			break;
			}	
	}
	}

	public void tapsOnDetailsLink(int storeNumber) {
		GlobalMobileHelper.setImplicitWaitTo(driver, 5);
		List<MobileElement> storeDetailslinkList = driver.findElements(Locators.storePickup.storeDetailsLink);
		logger.info(storeDetailslinkList.size()+" stores are displaying on page load");
		for(int i=0;i<storeDetailslinkList.size();i++) {
			if((i+1)==storeNumber) {
			logger.info("Tap on Store no. "+storeNumber);
			GlobalMobileHelper.tapOnElement(storeDetailslinkList.get(i));
			break;
			}	
	}
	}

	public void verifyOptionsOnDetailsPage(String option) {
		switch (option) {
		case "Copy address":
			assertTrue(option+ " is not available on current screen",GlobalMobileHelper.isElementDisplayed(Locators.storePickup.copyAddressLink));
			break;
		case "Open in google map":
			assertTrue(option+ " is not available on current screen",GlobalMobileHelper.isElementDisplayed(Locators.storePickup.openInGoogleMap));
			break;
		case "Open in maps":
			assertTrue(option+ " is not available on current screen",GlobalMobileHelper.isElementDisplayed(Locators.storePickup.openInMaps));
			break;
		case "cancel":
			assertTrue(option+ " is not available on current screen",GlobalMobileHelper.isElementDisplayed(Locators.storePickup.cancelBtn));
			break;
			default: logger.error("Options doesn't match");
		}
	}

	public void navigateTo(String str) {
		switch (str) {
		case "address":
			GlobalMobileHelper.tapOnElement(Locators.storePickup.addressOnDetailsPage);
			break;
		case "make my store":
			GlobalMobileHelper.tapOnElement(Locators.storePickup.makeMyStoreOnDetailsPage);
			break;
		case "cancel":
			GlobalMobileHelper.tapOnElement(Locators.storePickup.cancelBtn);
			break;
		default: logger.error("Couldn't click on "+str);
		}
	}
}
