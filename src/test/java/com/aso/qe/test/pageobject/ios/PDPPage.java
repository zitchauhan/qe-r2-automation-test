package com.aso.qe.test.pageobject.ios;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PDPPage {
	
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
	
	public boolean isHeroImageDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.imageHero);
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
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.buttonViewCart);
	}
	
	public void tapOnIncrementQtyStepper() {
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.qtyIncrementStepper);
	}
	
	public void tapOnDecrementQtyStepper() {
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.qtyDecrementStepper);
	}
	
	public void enterQty(String qty) {
		MobileElement qtyEditBox = driver.findElement(Locators.PDPPage.qtyEditBox);
		qtyEditBox.sendKeys(qty);
	}
	
	public boolean validateQty(String qty) {
		MobileElement qtyEditBox = driver.findElement(Locators.PDPPage.qtyEditBox);
		return qtyEditBox.getText().equals(qty);
	}
	
	public void setQty(String qty) {
		GlobalMobileHelper.setText(Locators.PDPPage.qtyEditBox, qty,Locators.PDPPage.labelProductTitle);
	}
	
	public String getProductPriceText() {
		if(isProductPriceDisplayed())
			return labelProductPrice.getText();
		else
			return null;
	}
	
	public boolean isQuantityStepperDisplayed() {
		boolean isQtyIncrementStepperDisplayed = GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.qtyIncrementStepper);
		boolean isQtyDecrementStepperDisplayed = GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.qtyDecrementStepper);
		boolean isQtEditBoxDisplayed = GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.qtyEditBox);

		return isQtyIncrementStepperDisplayed &&
				isQtyDecrementStepperDisplayed &&
				isQtEditBoxDisplayed;
	}
}