package com.aso.qe.test.pageobject.ios;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class BottomNav {
	private AppiumDriver<MobileElement> driver;
    
	public BottomNav(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	  PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	 }
	
	@iOSXCUITFindBy(id="lbl_home")
	public MobileElement home;
	
	@iOSXCUITFindBy(id="lbl_shop")
	public MobileElement shop;
	
	@iOSXCUITFindBy(id="lbl_wishlist")
	public MobileElement wishList;
	
	@iOSXCUITFindBy(id="lbl_cart")
	public MobileElement cart;
	
	@iOSXCUITFindBy(id="lbl_account")
	public MobileElement account;
	
	public void tapOnHome() {
		home.click();
	}
	
	public void tapOnShop() {
		shop.click();
	}
	
	public void tapOnWishList() {
		wishList.click();
	}
	
	public void tapOnCart() {
		cart.click();
	}
	
	public void tapOnAccount() {
		account.click();
	}
}
