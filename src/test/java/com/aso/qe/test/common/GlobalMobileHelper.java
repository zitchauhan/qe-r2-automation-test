package com.aso.qe.test.common;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aso.qe.framework.common.PropertiesHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class GlobalMobileHelper {
	
	private static PropertiesHelper propHelper = PropertiesHelper.getInstance();
	public static AppiumDriver<MobileElement> driver;
	private static final int DEFAULT_EXPLICIT_WAIT = Integer.parseInt(propHelper.getConfigPropProperty("default_explicit_wait"));
	
	public void initializeDriver() throws MalformedURLException {
		String platform = propHelper.getConfigPropProperty("i.platform");
	//	String udid = propHelper.getConfigPropProperty("i.udid");
		String platformVersion = propHelper.getConfigPropProperty("i.platformVersion");
		String deviceName = propHelper.getConfigPropProperty("i.deviceName");
		String url = propHelper.getConfigPropProperty("appiumServerURL");
		String app = propHelper.getConfigPropProperty("i.app");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,platform);
	//	caps.setCapability(MobileCapabilityType.UDID,udid);
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,platformVersion);
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
		caps.setCapability(MobileCapabilityType.APP, app);
		
	    if(platform.equalsIgnoreCase("iOS")) {
	    	driver = new IOSDriver<MobileElement>(new URL(url),caps);
	    }
	    else if(platform.equalsIgnoreCase("android")) {
	    	driver = new AndroidDriver<MobileElement>(new URL(url),caps);
	    }
	}
	
	public static void tapOnElement(MobileElement element) {
		if(driver == null) {
			throw new IllegalStateException("Driver is not initialized");
		}
		else {
			WebDriverWait wait = new WebDriverWait(driver,DEFAULT_EXPLICIT_WAIT);
			
			if(!element.isDisplayed()) {
				throw new IllegalStateException("Element is not displayed");
			}
			element.click();
		}
	}
	
	public static void tapOnElement(By locator) {
		if(driver == null) {
			throw new IllegalStateException("Driver is not initialized");
		}
		else {
			WebDriverWait wait = new WebDriverWait(driver,DEFAULT_EXPLICIT_WAIT);
			wait.until(ExpectedConditions.presenceOfElementLocated(locator)).click();
		}
	}
	
	public static void tapOnElement(By locator,int timeout) {
		if(driver == null) {
			throw new IllegalStateException("Driver is not initialized");
		}
		else {
			WebDriverWait wait = new WebDriverWait(driver,timeout);
			wait.until(ExpectedConditions.presenceOfElementLocated(locator)).click();
		}
	}
	
	public static boolean isElementDisplayed(By locator) {
		if(driver == null) {
			throw new IllegalStateException("Driver is not initialized");
		}
		WebDriverWait wait = new WebDriverWait(driver,DEFAULT_EXPLICIT_WAIT);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator)).isDisplayed();
	}
	
	public static void setText(By locator,String text) {
		if(driver == null) {
			throw new IllegalStateException("Driver is not initialized");
		}
		WebDriverWait wait = new WebDriverWait(driver,DEFAULT_EXPLICIT_WAIT);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(text);
		driver.hideKeyboard();
	}
	
	public static void setText(By locator,String text,By tapLocatorToHideKeyboard) {
		setText(locator,text);
		tapOnElement(tapLocatorToHideKeyboard);
	}
	
	public static void searchByKeyword(String keyword) {
		String keywordValue = PropertiesHelper.getInstance().getMobileTestDataProperty(keyword);
		MobileElement searchBar= driver.findElement(By.id("search_bar"));
		searchBar.sendKeys(keywordValue);
	
		
	}
	
}
