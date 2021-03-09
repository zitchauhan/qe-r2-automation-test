package com.aso.qe.test.pageobject.ios;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.aso.qe.test.common.Locators;
import com.aso.qe.test.stepdefinition.ios.Hooks;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PDPPage {
	private static final Logger logger = Logger.getLogger(Hooks.class);
	private AppiumDriver<MobileElement> driver;
	public PDPPage(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	}
	
	@iOSXCUITFindBy(id="lbl_your_cart")
	public MobileElement imageHero;
	
	@iOSXCUITFindBy(id="lbl_product_title")
	public MobileElement labelProductTitle;
	
	@iOSXCUITFindBy(id="lbl_product_price")
	public MobileElement labelProductPrice;
	
	@iOSXCUITFindBy(id="btn_quantity_decrement")
	public MobileElement quantitySelectorDecrement;
	
	@iOSXCUITFindBy(id="btn_quantity_increment")
	public MobileElement quantitySelectorIncrement;
	
	@iOSXCUITFindBy(id="txt_quantity_box")
	public MobileElement quantityEditBox;
	
	@iOSXCUITFindBy(id="lbl_free_store_pickup")
	public MobileElement freeStorePickupText;
	
	@iOSXCUITFindBy(id="lbl_pickup_availability")
	public MobileElement pickupAvailableText;
	
	@iOSXCUITFindBy(id="lbl_home_delivery")
	public MobileElement homeDeliveryText;
	
	@iOSXCUITFindBy(id="lbl_shipping_availability")
	public MobileElement shippingAvailbaleText;
	
	@iOSXCUITFindBy(id="rd_free_store_pickup")
	public MobileElement freeStorePickupRadio;
	
	@iOSXCUITFindBy(id="rd_home_delivery")
	public MobileElement homeDeliveryRadio;
	
	public boolean isHeroImageDisplayed() {
		MobileElement heroImage = driver.findElement(Locators.PDPPage.imageHero);
		return heroImage.isDisplayed();
	}
	
	public boolean isProductTitleDisplayed() {
		MobileElement productTitle = driver.findElement(Locators.PDPPage.labelProductTitle);
		return productTitle.isDisplayed();
	}
	
	public String getProductTitle() {
		if(isProductTitleDisplayed())
			return labelProductTitle.getText();
		else
			return null;
	}
	
	public boolean isProductPriceDisplayed() {
		MobileElement productPrice = driver.findElement(Locators.PDPPage.labelProductPrice);
		return productPrice.isDisplayed();
	}
	
	public void tapOnAddToCart() {
		MobileElement addToCartButton = driver.findElement(Locators.PDPPage.buttonAddToCart);
		addToCartButton.click();
	}
	
	public void tapOnViewCart() {
		MobileElement viewCartButton = driver.findElement(Locators.PDPPage.buttonViewCart);
		viewCartButton.click();
	}
	
	public String getProductPriceText() {
		if(isProductPriceDisplayed())
			return labelProductPrice.getText();
		else
			return null;
	}
	
	public boolean isQuantityStepperDisplayed() {
		return quantitySelectorDecrement.isDisplayed() &&
				quantitySelectorIncrement.isDisplayed() &&
				quantityEditBox.isDisplayed();
				
	}
	
	public void verifyDeliveryOptionsInPDP() {
		Assert.assertEquals(true, freeStorePickupText.isDisplayed());
		Assert.assertEquals(true, homeDeliveryText.isDisplayed());
		Assert.assertEquals(true, pickupAvailableText.isDisplayed());
		Assert.assertEquals(true, shippingAvailbaleText.isDisplayed());
	}
	
	public void verifyDefaultDeliveryOption() {
		Assert.assertEquals(true, freeStorePickupRadio.isSelected());
		Assert.assertEquals(false, homeDeliveryRadio.isSelected());
	}
}