package com.aso.qe.test.pageobject.ios;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AttributePage {
	 private AppiumDriver<MobileElement> driver;
	    
		public AttributePage(AppiumDriver<MobileElement> driver) {
			  this.driver = driver;
			  PageFactory.initElements(new AppiumFieldDecorator(driver), this);
			 }
		@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[@name=\"aIdentifier\"]")
		public MobileElement editText;
		@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Back\"]")
		public MobileElement back;
		@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Second\"]")
		public MobileElement second;
		public void clickOnEditBox() throws InterruptedException {
			editText.click();
			Thread.sleep(2000);
			
		}
		public void sendText()
		{
			editText.sendKeys("Sending text for testing");
		}
		public boolean isElementPresent()
		{
			back.isDisplayed();
			return true;
			
		}
		public void clickSecond()
		{
			second.click();
		}
}
