package com.aso.qe.test.common;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aso.qe.framework.common.PropertiesHelper;
import com.aso.qe.test.pageobject.ios.CartPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class GlobalMobileHelper {
	private static final Logger logger = Logger.getLogger(GlobalMobileHelper.class.getName());
	private static PropertiesHelper propHelper = PropertiesHelper.getInstance();
	public static AppiumDriver<MobileElement> driver;
	private static final int DEFAULT_EXPLICIT_WAIT = Integer.parseInt(propHelper.getConfigPropProperty("default_explicit_wait"));
	
	public void initializeDriver() throws MalformedURLException {
		String platform = propHelper.getConfigPropProperty("i.platform");
		String udid = propHelper.getConfigPropProperty("i.udid");
		String platformVersion = propHelper.getConfigPropProperty("i.platformVersion");
		String deviceName = propHelper.getConfigPropProperty("i.deviceName");
		String url = propHelper.getConfigPropProperty("appiumServerURL");
		String app = propHelper.getConfigPropProperty("i.app");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,platform);
		caps.setCapability(MobileCapabilityType.UDID,udid);
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
		boolean result=false;
		
		if(driver == null) {
			throw new IllegalStateException("Driver is not initialized");
		}
		try {
			WebDriverWait wait = new WebDriverWait(driver,DEFAULT_EXPLICIT_WAIT);
			result = wait.until(ExpectedConditions.presenceOfElementLocated(locator)).isDisplayed();
		}catch(TimeoutException e) {
			logger.warn("Appium driver timed out waiting for element " + locator.toString());
		}catch (Exception e) {
		    System.err.println(e.getMessage());
		}
		
		return result;
	}
	
	public static boolean isElementDisplayed(MobileElement element) {
		boolean result=false;
		
		if(driver == null) {
			throw new IllegalStateException("Driver is not initialized");
		}
		try {
			Thread.sleep(DEFAULT_EXPLICIT_WAIT * 1000);
			result = element.isDisplayed();
		}catch(Exception e) {
			logger.warn("Appium driver explicit wait for mobile element " + element.toString());
		}
		
		return result;
	}
	
	public static void setText(By locator,String text) {
		if(driver == null) {
			throw new IllegalStateException("Driver is not initialized");
		}
		WebDriverWait wait = new WebDriverWait(driver,DEFAULT_EXPLICIT_WAIT);
		MobileElement editBox = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		editBox.clear();
		editBox.sendKeys(text);
		//wait.until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(text);
		driver.hideKeyboard();
	}
	
	public static void setText(By locator,String text,By tapLocatorToHideKeyboard) {
		setText(locator,text);
		tapOnElement(tapLocatorToHideKeyboard);
	}
	
	public static void setImplicitWaitTo(AppiumDriver<MobileElement> driver, int seconds) {
			driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		    }
			
	public static void searchByKeyword(String keyword) {
	 		String keywordValue = PropertiesHelper.getInstance().getMobileTestDataProperty(keyword);
		 		MobileElement searchBar= driver.findElement(By.id("search_bar"));
		 		searchBar.sendKeys(keywordValue);	 		
		 	}
	 
	public void swipeScreen(Direction dir) {
        System.out.println("swipeScreenSmall(): dir: '" + dir + "'"); // always log your actions

	// Animation default time:
	//  - Android: 300 ms
	//  - iOS: 200 ms
	// final value depends on your app and could be greater
	final int ANIMATION_TIME = 1500; // ms
	
	final int PRESS_TIME = 200; // ms
	
	PointOption pointOptionStart, pointOptionEnd;
	
	// init screen variables
	Dimension dims = driver.manage().window().getSize();
	
	// init start point = center of screen
	pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);
	
	// reduce swipe move into multiplier times comparing to swipeScreen move
	int mult = 5; // multiplier
	switch (dir) {
	case DOWN: // center of footer
	    pointOptionEnd = PointOption.point(dims.width / 2, (dims.height / 2) + (dims.height / 2) / mult);
	    break;
	case UP: // center of header
	    pointOptionEnd = PointOption.point(dims.width / 2, (dims.height / 2) - (dims.height / 2) / mult);
	    break;
	case LEFT: // center of left side
	    pointOptionEnd = PointOption.point((dims.width / 2) - (dims.width / 2) / mult, dims.height / 2);
	    break;
	case RIGHT: // center of right side
	    pointOptionEnd = PointOption.point((dims.width / 2) + (dims.width / 2) / mult, dims.height / 2);
	    break;
	default:
	    throw new IllegalArgumentException("swipeScreenSmall(): dir: '" + dir.toString() + "' NOT supported");
	}

	// execute swipe using TouchAction
	try {
	new TouchAction(driver)
	        .press(pointOptionStart)
	        // a bit more reliable when we add small wait
	        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
	        .moveTo(pointOptionEnd)
	        .release().perform();
	} catch (Exception e) {
	System.err.println("swipeScreenSmall(): TouchAction FAILED\n" + e.getMessage());
	return;
	}

	// always allow swipe action to complete
	try {
	Thread.sleep(ANIMATION_TIME);
	} catch (InterruptedException e) {
	// ignore
	}
}

	 public enum Direction {
         UP,
         DOWN,
         LEFT,
         RIGHT;
     }
	 
}
