package com.aso.qe.test.pageobject.ios;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HybridWebViewDemoPage {
	 private AppiumDriver<MobileElement> driver;
//	    public HomePage() {
//	    }
	    
	public HybridWebViewDemoPage(AppiumDriver<MobileElement> driver) {
		  this.driver = driver;
		  PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 }
	 
	
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther[@name=\"urlInput\"]")
	public MobileElement urlInputField;
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther[@name=\"navigateBtn\"]")
	public MobileElement navigateBtn;
	@iOSXCUITFindBy(xpath="//XCUIElementTypeImage[@name=\"Link\"]")
	public MobileElement navigationDrawer;
	@iOSXCUITFindBy(xpath="//XCUIElementTypeLink[@name=\"Subscribe\"]")
	public MobileElement subscribe;
	@iOSXCUITFindBy(xpath="//XCUIElementTypeHeader[@name=\"Subscribe Now\"]")
	public MobileElement subscribenow;
	public void enterUrl()
	{
		urlInputField.sendKeys("https://appiumpro.com");
	}
	public void clickNavigate() {
		navigateBtn.click();
	}
	public void clickOnNavigationDrawer() {
		navigationDrawer.click();
	}
	public boolean isSubscribePresent() {
		subscribe.isDisplayed();
		return true;
	}
	public void clickOnSubscribe()
	{
		subscribe.click();
	}
	public boolean isSubscribeNowPresent() {
		subscribenow.isDisplayed();
		return true;
	}
}
