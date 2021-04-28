package com.aso.qe.test.pageobject.ios;


import org.openqa.selenium.Alert;
import org.apache.log4j.Logger;
import org.apache.tools.ant.launch.Locator;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class WishlistPage {
	
	private static final Logger logger = Logger.getLogger(LoginPage.class.getName());

	private String wishlistFieldType;
	
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
		} else if (GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.wishlistAddButton)) {
			GlobalMobileHelper.tapOnElement(Locators.WishlistPage.wishlistAddButton);
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
	
	public void tapOnWishList() {
		if (GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.wishlist)) {
			GlobalMobileHelper.tapOnElement(Locators.WishlistPage.wishlist);
		}
	}

	public void tapOnWishListIcon(String arg1) {
		if (GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.wishlistIcon)) {
			GlobalMobileHelper.tapOnElement(Locators.WishlistPage.wishlistIcon);
		}		
	}
	
	public void enterWishlistName(String wishlist) {
		MobileElement wishlistField = driver.findElement(Locators.WishlistPage.wishlistTextInput);
		wishlistField.sendKeys("My List");
		wishlistFieldType = wishlistField.getAttribute("type");
		logger.debug(wishlistFieldType);
	}

	public void buttonEnabled(String btn) {
		GlobalMobileHelper.isElementEnabled(Locators.WishlistPage.wishlistAddButton);	
	}

	public void tapOnBackButton(String back) {
		GlobalMobileHelper.tapOnElement(Locators.WishlistPage.backBtn);		
	}

	public boolean isWishListItemDisplayed(String arg) {
		switch(arg) {
		case "Product Title":
			return GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.productTitle);
		case "Product Image":
			return GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.productImage);
		case "Product Price":
			return GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.productPrice);
		case "Remove Button":
			return GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.removeButton);
		case "Move To Cart":
			return GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.moveToCartButton);
		case "Empty":
			return GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.emptyWishListLabel);
		default:
			throw new IllegalStateException("Wrong argument");
			
		}
	}

	public boolean isItemCountDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.itemCount);
	}

	public void tapOnWishList(String wishlist) {
		GlobalMobileHelper.tapOnElement(GlobalMobileHelper.getLocator(Locators.WishlistPage.wishListName, wishlist));
	}

	public boolean isWishListDisplayed(String wishlist) {
		return GlobalMobileHelper.isElementDisplayed(GlobalMobileHelper.getLocator(Locators.WishlistPage.wishListHeader, wishlist));
	}

	public void tapOnRemoveButton() {
		GlobalMobileHelper.tapOnElement(Locators.WishlistPage.removeButton);
	}

	public boolean isConfirmationPopUpDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.confirmationPopup);
	}

	public void tapOnCreatedWishList(String arg1) {
		GlobalMobileHelper.tapOnElement(Locators.WishlistPage.createdWishlist);
	}

	public boolean varifyElementPresenseOnPage(String element) {
			if (element.equalsIgnoreCase("Instruction banner")) {
				return GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.bannerTitle);
			} else if (element.equalsIgnoreCase("Instruction Banner subtitle")) {
				return GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.bannerSubTitle);
			}else {
				throw new UnsupportedOperationException("Given Element type not defined");
			}
		}

	public void tapOnBannerCta(String arg1) {
			if (GlobalMobileHelper.isElementDisplayed(Locators.WishlistPage.bannerCTA)) {
				GlobalMobileHelper.tapOnElement(Locators.WishlistPage.bannerCTA);
			}
		}		
}

