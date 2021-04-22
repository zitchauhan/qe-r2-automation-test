package com.aso.qe.test.pageobject.ios;

import org.openqa.selenium.Alert;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class WishlistPage {
	
	private AppiumDriver<MobileElement> driver;
	public WishlistPage(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	 }
	
	public boolean isWishListPageDisplayed() {
		MobileElement wishListpage  = driver.findElement(Locators.WishlistPage.wishlistTitle);
		return wishListpage.isDisplayed();
	}

	public void tapOnButton(String arg1) {
		if (GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.editBtn)) {
			GlobalMobileHelper.tapOnElement(Locators.WishlistPage.editBtn);
		} else if (GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.updateButton)) {
			GlobalMobileHelper.tapOnElement(Locators.WishlistPage.updateButton);
		} else if (GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.deleteWishlistButton)) {
			GlobalMobileHelper.getElementText(Locators.WishlistPage.deleteWishlistButton);
		} else if (GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.deleteBtn)) {
			GlobalMobileHelper.getElementText(Locators.WishlistPage.deleteBtn);
		} else if (GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.cancelbtn)) {
			GlobalMobileHelper.getElementText(Locators.WishlistPage.cancelbtn);
		}
	}

	public void renameWishlist(String rename) {
			MobileElement renameWishlistTitle = driver.findElement(Locators.WishlistPage.renameWishlistTitle);
			renameWishlistTitle.sendKeys(rename);
		}

	public boolean verifyUpdatedName(String arg1) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.renameWishlistTitle);	
	}

	public void verifyConfirmationPopup(String arg1) {
		MobileElement btn = driver.findElement(Locators.WishlistPage.deleteWishlistButton);
		btn.click();
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		System.out.println(text);
	}

	public boolean isOnEditWishlistPage() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.renameWishlistTitle);	
	}
	
}