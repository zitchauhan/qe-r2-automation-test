package com.aso.qe.test.pageobject.ios;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import java.lang.UnsupportedOperationException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.stepdefinition.ios.Hooks;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PDPPage {
	private static final Logger logger = Logger.getLogger(Hooks.class);
	private AppiumDriver<MobileElement> driver;
	
	public PDPPage(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	  PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	Context context = new Context();
	
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
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.imageHero);
	}
	
	public boolean isProductTitleDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.labelProductTitle);
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
		if(addToCartButton.isEnabled()) {
			addToCartButton.click();
		}else {
			System.out.println("This Varient of the Product is out of stock");
		}
		
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
	
	public void verifyProductAttribute(String productAttributeName) throws InterruptedException {
		Thread.sleep(7000);
		switch(productAttributeName.toLowerCase())
		{
		case "image":
			assertTrue(driver.findElement(Locators.PDPPage.imageHero).isDisplayed());
		case "title":
			assertTrue(driver.findElement(Locators.PDPPage.labelProductTitle).isDisplayed());
		case "price":
			assertTrue(driver.findElement(Locators.PDPPage.labelProductPrice).isDisplayed());
			context.setProductPriceOnPDP(driver.findElement(Locators.PDPPage.labelProductPrice).getText());
		}
	}
<<<<<<< HEAD

	public boolean isSizeVarientDisplayed() {
		boolean isSizeVarientDisplayed = GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.sizeVariant);
		return isSizeVarientDisplayed;
	}
	public boolean isColorVariantDisplayed() {
		boolean isColorVariantDisplayed = GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.colorVariant);
		return isColorVariantDisplayed;
	}
	public boolean isSizeChartBtnDisplayed() {
		boolean isSizeChartbtnDisplayed = GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.btnSizeChart);
		return isSizeChartbtnDisplayed;
	}
	public void tapOnSmallSize() {
		
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.smallSize);
		
	}
	public void tapOnLargeSize() {
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.largeSize);
	}
	public boolean validateVarientSize(String size) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MobileElement varientSizeValue = driver.findElement(Locators.PDPPage.sizeValue);
		return varientSizeValue.getText().contains(size);
	}
	
	public void tapOnMediumSize() {
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.mediumSize);
	}
	public void tapOnHomeDelivery() {
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.homeDeliveryRadioBtn);
	}
	public void tapOnSizeChart() {
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.btnSizeChart);
		
	}
	public boolean isSizeChartDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.sizeChartTitle);
	}
	public void tapOnCancelBtn() {
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.btnCancelSizeChart);
	}
	public boolean isVariantValueDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.colorValue);
	}
	
	
	public void selectDeliveryOption(String optionName) throws UnsupportedOperationException {
=======
	
	public void selectDeliveryOption(String optionName) throws OperationNotSupportedException {
>>>>>>> fdc7ed85... complete script creation and execution of OMNI-26631
		// optionName can be home/store
		if (optionName.toLowerCase().equals("home")) {
			homeDeliveryRadio.click();
			logger.debug("Selected delivery option as " + homeDeliveryRadio.toString());
		}else if (optionName.toLowerCase().equals("store")) {
			freeStorePickupRadio.click();
			logger.debug("Selected delivery option as " + freeStorePickupRadio.toString());
		}else {
<<<<<<< HEAD
			throw new UnsupportedOperationException();
=======
			throw new OperationNotSupportedException();
>>>>>>> fdc7ed85... complete script creation and execution of OMNI-26631
		}
		
	}
}

