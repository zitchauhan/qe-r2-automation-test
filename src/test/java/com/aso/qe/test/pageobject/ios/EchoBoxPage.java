package com.aso.qe.test.pageobject.ios;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class EchoBoxPage {
	 private AppiumDriver<MobileElement> driver;
//	    public HomePage() {
//	    }
	    
	public EchoBoxPage(AppiumDriver<MobileElement> driver) {
		  this.driver = driver;
		  PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 }
	 
	
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther[@name=\"Say something new\"]")
	public MobileElement inputBox;
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Save\"]")
	public MobileElement save;
//	@iOSXCUITFindBy(xpath="//XCUIElementTypeText[@name=\"Say something new\"]")
//	public MobileElement inputBox;
	
	public void enterTextInTextBox()
	{
		inputBox.click();
		inputBox.sendKeys("Hey, I am Priyanka");
		
	}
	
}
