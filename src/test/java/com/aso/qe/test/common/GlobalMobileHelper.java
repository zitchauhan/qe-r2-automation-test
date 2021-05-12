package com.aso.qe.test.common;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
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
	public static final int DEFAULT_EXPLICIT_WAIT = Integer.parseInt(propHelper.getConfigPropProperty("default_explicit_wait"));


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
			setImplicitWaitTo(driver,DEFAULT_EXPLICIT_WAIT);
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
	
	public static boolean isElementSelected(By locator) {
		boolean result=false;

		if(driver == null) {
			throw new IllegalStateException("Driver is not initialized");
		}
		try {
			WebDriverWait wait = new WebDriverWait(driver,DEFAULT_EXPLICIT_WAIT);
			result = wait.until(ExpectedConditions.presenceOfElementLocated(locator)).isSelected();
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
			Thread.sleep(DEFAULT_EXPLICIT_WAIT * 1000L);
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
		wait.until(ExpectedConditions.presenceOfElementLocated(locator)).clear();
		wait.until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(text);

		try {
			driver.hideKeyboard();
		}catch (Exception e){
			// passing with the warning
			logger.warn(e.getLocalizedMessage());
		}

	}

	public static void setText(MobileElement mobileElement, String text) {
		if(driver == null) {
			throw new IllegalStateException("Driver is not initialized");
		}
		WebDriverWait wait = new WebDriverWait(driver,DEFAULT_EXPLICIT_WAIT);
		wait.until(ExpectedConditions.visibilityOf(mobileElement)).clear();
		wait.until(ExpectedConditions.visibilityOf(mobileElement)).sendKeys(text);

		try {
			driver.hideKeyboard();
		}catch (Exception e){
			// passing with the warning
			logger.warn(e.getLocalizedMessage());
		}
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
		MobileElement searchBar= driver.findElement(Locators.SearchPage.searchBar);
		searchBar.sendKeys(keywordValue);
	}
	 
	public static void swipeScreen(Direction dir, int numOftimes) {
		int start=0;
		while (start < numOftimes) {
			swipeScreen(dir);
			start+=1;
		}
	}
	
	public static String findData(String keyword) {
		String keywordValue=null;
		keywordValue = PropertiesHelper.getInstance().getMobileTestDataProperty(keyword);
		return keywordValue;
	}

	public static void swipeScreen(Direction dir) {
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
	 public void swipeScreenFromElement(Direction dir, MobileElement fromElement) {
		   System.out.println("swipeScreenSmall(): dir: '" + dir + "'"); // always log your actions

			// Animation default time:
			//  - Android: 300 ms
			//  - iOS: 200 ms
			// final value depends on your app and could be greater
			final int ANIMATION_TIME = 1500; // ms
			
			final int PRESS_TIME = 200; // ms
			Point location = fromElement.getLocation();
			  int x = location.getX();
			  int y = location.getY();
			PointOption pointOptionStart, pointOptionEnd;

			Dimension dims = driver.manage().window().getSize();
			
			pointOptionStart = PointOption.point(x,y);
			int mult = 3; // multiplier
			switch (dir) {
			case DOWN: 
			    pointOptionEnd = PointOption.point(x, y + y / mult);
			    break;
			case UP: 
			    pointOptionEnd = PointOption.point(x, y - y/ mult);
			    break;
			case LEFT: 
			    pointOptionEnd = PointOption.point(x - x / mult, y);
			    break;
			case RIGHT: 
			    pointOptionEnd = PointOption.point(x + x / mult, y);
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

	public void swipeScreenFromElement(Direction dir, MobileElement fromElement,int numOftimes) {
		int start=0;
		while (start < numOftimes) {
			swipeScreenFromElement(dir,fromElement);
			start+=1;
		}
	}
	 
	public static String getElementText(By locator) {
		if(driver == null) {
			throw new IllegalStateException("Driver is not initialized");
		}
		WebDriverWait wait = new WebDriverWait(driver,DEFAULT_EXPLICIT_WAIT);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator)).getText();
	}

	public static String getElementText(MobileElement mobileElement) {
		if(driver == null) {
			throw new IllegalStateException("Driver is not initialized");
		}
		WebDriverWait wait = new WebDriverWait(driver,DEFAULT_EXPLICIT_WAIT);
		return wait.until(ExpectedConditions.visibilityOf(mobileElement)).getText();
	}

	public static int randomInteger(int min, int max) {
		  return (int) (Math.floor(Math.random() * (max - min + 1)) + min);
	}

	public void verifyUserIsOnPageone(String pagename) {

		if(pagename.equalsIgnoreCase("LogIn")) {

			assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.LoginPage.emailEditBox));
		}else if(pagename.equalsIgnoreCase("Cart")){

			assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.CartPage.labelYourCart));

		}else {

			throw new UnsupportedOperationException("Given button type not defined");

		}
	}


		//}else if(pagename.equalsIgnoreCase("save")){

			//assertTrue (GlobalMobileHelper.isElementDisplayed(Locators.Addnewasocreditcard.AddnewAsocrerditCardlabel));
	public static boolean isElementEnabled(By locator) {
		boolean result=false;
		
		if(driver == null) {
			throw new IllegalStateException("Driver is not initialized");
		}
		try {
			WebDriverWait wait = new WebDriverWait(driver,DEFAULT_EXPLICIT_WAIT);
			result = wait.until(ExpectedConditions.presenceOfElementLocated(locator)).isEnabled();
		}catch(TimeoutException e) {
			logger.warn("Appium driver timed out waiting for element " + locator.toString());
		}catch (Exception e) {
		    System.err.println(e.getMessage());
		}
		
		return result;
	}


	public void verifyUserIsOnPage(String pageName) {
		if(pageName.equalsIgnoreCase("Add Wishlist")) {
			assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.wishlistAddButton));
		}else if(pageName.equalsIgnoreCase("wishlist listing")) {
			assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.wishlistTileTitle));
		}else if(pageName.equalsIgnoreCase("Previous page")) {
			assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.BottomNav.wishlist));
		}else if(pageName.equalsIgnoreCase("Edit Wish List")) {
			assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.editBtn));
		}else if(pageName.equalsIgnoreCase("created wishlist")) {
			assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.createdWishlist));
		}else {
			throw new UnsupportedOperationException("type not defined");
		}
	}


	public static By getLocator(By locator,String replacement) {
		String loc = locator.toString();
		return By.xpath(loc.replace("{0}", replacement));
	}

	public static boolean swipeTillElementDisplayed(Direction dir, By element) {
		final int NO_OF_TIMES = 4;
		return swipeTillElementDisplayed(dir,element,NO_OF_TIMES);
	}

	public void handleUnwantedAlerts(){
		WebDriverWait wait = new WebDriverWait(driver,DEFAULT_EXPLICIT_WAIT);
		int exitOn = 1;
		while (exitOn <= 10 ){// handle the alert 10 times
			try {
				wait.until(ExpectedConditions.alertIsPresent());
				driver.switchTo().alert().accept();
				exitOn++;
			}catch (TimeoutException e){
				logger.debug("timeout expired while waiting for the alert");
				break;
			}
		}
	}

	/**
	 * Method to wait for the amount to time mentioned as Explicit wait
	 */
	public static void waitForDefaultTime(){
		try {
			Thread.sleep(DEFAULT_EXPLICIT_WAIT * 1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	//Returns true if element is displayed false otherwise
	public static boolean swipeTillElementDisplayed(Direction dir, By element, int noOfTimes) {
		while(noOfTimes-- > 0) {
			if(GlobalMobileHelper.isElementDisplayed(element)) {
				return true;
			}
			swipeScreen(dir);
		}
		return false;
	}

	public static void searchProductByName(String productName){
		// enable search before searching
		MobileElement searchBox= driver.findElement(Locators.HomePage.searchBox);
		searchBox.click();
		// search for the word
		MobileElement searchBar=driver.findElement(Locators.SearchPage.searchBar);
		searchBar.sendKeys(productName);
		tapOnElement(Locators.SearchPage.goBtn);
		waitForDefaultTime();
	}


	/**
	 * Method to trigger field level error on the UI using one element of type MobileElement
	 * @param mobileElement of type MobileElement, generally an input.
	 */
	public static void tapOutOfAnElement(MobileElement mobileElement){

		try {

			TouchAction touchAction  = new TouchAction(driver);
			Dimension dimension = mobileElement.getSize();
			Point startPointOfElement = mobileElement.getLocation();
			int xPoint = startPointOfElement.x + dimension.width / 2 ;
			int yPoint = startPointOfElement.y + dimension.height + 2 ; // add 2 points below y

			PointOption offSetXYOption = PointOption.point(xPoint, yPoint);
			touchAction.tap(offSetXYOption).perform();

		}catch (Exception e){
			logger.error(e.getLocalizedMessage());
		}

	}

	/**
	 * Method to trigger field level error on the UI using 2 elements of type MobileElement
	 * @param mobileElement1 of type MobileElement, generally an input
	 * @param mobileElement2 of type MobileElement, can be an input, or any other element on the page that registers a tap
	 */
	public static void tapOutOfAnElement(MobileElement mobileElement1, MobileElement mobileElement2){

		try {
			mobileElement1.click(); //
			mobileElement2.click();
		}catch (Exception e){
			logger.error(e.getLocalizedMessage());
		}

	}

	/**
	 * Method to trigger field level error on the UI using one locator
	 * @param locator of type By created using Locators Class under common package
	 */
	public static void tapOutOfAnElement(By locator){
		MobileElement mobileElement = driver.findElement(locator);
		tapOutOfAnElement(mobileElement);
	}

	/**
	 * Method to trigger field level error for Element1 on the UI using 2 elements/locators of type By
	 * @param locator1 of type By, generally an input
	 * @param locator2 of type By, can be an input, or any other element on the page that registers a tap
	 */
	public static void tapOutOfAnElement(By locator1, By locator2){
		try {
			MobileElement mobileElement1 = driver.findElement(locator1);
			MobileElement mobileElement2 = driver.findElement(locator2);
			tapOutOfAnElement(mobileElement1, mobileElement2);

		}catch (Exception e){
			logger.error(e.getLocalizedMessage());
		}
	}
}





