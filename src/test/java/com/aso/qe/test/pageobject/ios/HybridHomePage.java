package com.aso.qe.test.pageobject.ios;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HybridHomePage {
	 private AppiumDriver<MobileElement> driver;
//	    public HomePage() {
//	    }
	    
	public HybridHomePage(AppiumDriver<MobileElement> driver) {
		  this.driver = driver;
		  PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 }
	 
	
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther[@name=\"Echo Box\"]")
	public MobileElement echo;
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther[@name=\"Login Screen\"]")
	public MobileElement loginScreen;
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther[@name=\"Clipboard Demo\"]")
	public MobileElement clipboard;
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther[@name=\"Webview Demo\"]")
	public MobileElement webviewDemo;
	
	public void clickOnEcho(){
		echo.click();
	}
	public void clickOnLginScreen()
	{
		loginScreen.click();
	}
	public void clickOnClipboard()
	{
		clipboard.click();
	}
	public void clickOnWebview() {
		webviewDemo.click();
	}
}
