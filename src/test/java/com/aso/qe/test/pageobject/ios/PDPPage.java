package com.aso.qe.test.pageobject.ios;

import org.openqa.selenium.support.PageFactory;

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
}