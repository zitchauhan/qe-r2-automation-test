package com.aso.qe.test.pageobject.ios;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class EmptyCartPage {
	
	private AppiumDriver<MobileElement> driver;
	public EmptyCartPage(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	  PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
		
	@iOSXCUITFindBy(id="lbl_your_cart")
	public MobileElement labelYourCart;
	
	@iOSXCUITFindBy(id="icon_Cart")
	public MobileElement imageEmptyCart;
	
	@iOSXCUITFindBy(id="lbl_your_cart_is_empty")
	public MobileElement labelYourCartIsEmpty;
	
	@iOSXCUITFindBy(id="lbl_user_specific_message")
	public MobileElement labelEmptyCartInfo;
	
	@iOSXCUITFindBy(id="btn_login")
	public MobileElement buttonLogIn;
	
	@iOSXCUITFindBy(id="btn_create_an_account")
	public MobileElement buttonCreateAnAccount;
	
	public boolean isYourCartlabelDisplayed() {
		return labelYourCart.isDisplayed();
	}
	
	public boolean isEmptyCartImageDisplayed() {
		return imageEmptyCart.isDisplayed();
	}
	
	public boolean isYourCartIsEmptyLabelDisplayed() {
		return labelYourCartIsEmpty.isDisplayed();
	}
	
	public boolean isUserSpecificMessageDisplayed() {
		return labelEmptyCartInfo.isDisplayed();
	}
	
	public boolean isLogInButtonDisplayed() {
		return buttonLogIn.isDisplayed();
	}
	
	public boolean isCreateAnAccountButtonDisplayed() {
		return buttonCreateAnAccount.isDisplayed();
	}
}
