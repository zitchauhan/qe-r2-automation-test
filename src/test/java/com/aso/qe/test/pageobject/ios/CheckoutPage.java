package com.aso.qe.test.pageobject.ios;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CheckoutPage {
	private static final Logger logger = Logger.getLogger(CheckoutPage.class.getName());
	
	private AppiumDriver<MobileElement> driver;
	public CheckoutPage(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	  PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	 }
	
}
