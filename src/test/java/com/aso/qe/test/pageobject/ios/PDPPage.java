package com.aso.qe.test.pageobject.ios;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.aso.qe.test.common.GlobalMobileHelper;
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

	public boolean isBadgeDisplayed(String args) {
		Boolean flag=false;
	

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MobileElement btnGoToPDP=null;
		if(args.equalsIgnoreCase("Ships to Store")) 
		{
			
			 String elementtext  = driver.findElement(Locators.PDPPage.lbl_badge_text).getText();
		      if(elementtext.equalsIgnoreCase("Ships_to_Store")) {
	           return true; 
		      
			}
		}
		
		if(args.equalsIgnoreCase("Clearance")) 
		{
			
			 String elementtext  = driver.findElement(Locators.PDPPage.lbl_badge_text).getText();
		      if(elementtext.equalsIgnoreCase("Clearance")) {
	           return true; 
		      
			}
		}
		
		if(args.equalsIgnoreCase("Hot Deal")) 
		{
			
			 String elementtext  = driver.findElement(Locators.PDPPage.lbl_badge_text).getText();
		      if(elementtext.equalsIgnoreCase("Hot Deal")) {
	           return true; 
		      
			}
		}
		
		if(args.equalsIgnoreCase("Price Drop")) 
		{
			
	      String elementtext  = driver.findElement(Locators.PDPPage.lbl_badge_text).getText();
	      if(elementtext.equalsIgnoreCase("Price Drop")) {
           return true; 
	      
		}
		}
		if(args.equalsIgnoreCase("New")) 
		{
			
			  String elementtext  = driver.findElement(Locators.PDPPage.lbl_badge_text).getText();
		      if(elementtext.equalsIgnoreCase("New")) {
	           return true; 
		      
			}
		}
		
		if(args.equalsIgnoreCase("Exclusive")) 
		{
			
			  String elementtext  = driver.findElement(Locators.PDPPage.lbl_badge_text).getText();
		      if(elementtext.equalsIgnoreCase("Exclusive")) {
	           return true; 
		      
			}
		}
		
		if(args.equalsIgnoreCase("Online Only")) 
		{
			
			  String elementtext  = driver.findElement(Locators.PDPPage.lbl_badge_text).getText();
		      if(elementtext.equalsIgnoreCase("Price Drop")) {
	           return true; 
		      
			}
		}

		GlobalMobileHelper.tapOnElement(btnGoToPDP);
		
	
		
		return false;
	}
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
			// TODO Auto-generated catch block
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

	public boolean isMessageDisplayed(String args) throws Exception {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 List<Object> list = new ArrayList<Object>();
		boolean flag=true;
		if(args.equalsIgnoreCase("App_store_guidelines")) {
			// 
			String textguidelines=GlobalMobileHelper.findData(args);
			 String elementtext  = driver.findElement(Locators.PDPPage.AppStoreGuidelines).getText();
			if(textguidelines.equalsIgnoreCase(elementtext)) {
				
				flag=true;
			}else {
				list.add ( new Exception("AppStoreGuidelines  not present "));	
			}

			
		}
		
		if(args.equalsIgnoreCase("important_Product_and_Safety_Information")) {
			// 
			String textguidelines=GlobalMobileHelper.findData("important_Product_and_Safety_Information");
			String InformationPoint1=GlobalMobileHelper.findData("important_Product_and_Safety_InformationPoint1");
			String InformationPoint2=GlobalMobileHelper.findData("important_Product_and_Safety_InformationPoint2");
			String InformationPoint3=GlobalMobileHelper.findData("important_Product_and_Safety_InformationPoint3");
			String InformationPoint4=GlobalMobileHelper.findData("important_Product_and_Safety_InformationPoint4");
			 
			if(!driver.findElement(Locators.PDPPage.ProductSafetyInformation).getText().equalsIgnoreCase(textguidelines)) {
				list.add ( new Exception("ProductPrice  not present"));	
			}
			if(!driver.findElement(Locators.PDPPage.ProductSafetyInformationPara1).getText().equalsIgnoreCase(InformationPoint1)) {
				list.add ( new Exception("important_Product_and_Safety_InformationPoint  not present"));	
			}
			if(!driver.findElement(Locators.PDPPage.ProductSafetyInformationPara2).getText().equalsIgnoreCase(InformationPoint2)) {
				list.add ( new Exception("important_Product_and_Safety_InformationPoint2  not present"));	
			}
			if(!driver.findElement(Locators.PDPPage.ProductSafetyInformationPara3).getText().equalsIgnoreCase(InformationPoint3)) {
				list.add ( new Exception("important_Product_and_Safety_InformationPoint3  not present"));	
			}
			if(!driver.findElement(Locators.PDPPage.ProductSafetyInformationPara4).getText().equalsIgnoreCase(InformationPoint4)) {
				list.add ( new Exception("important_Product_and_Safety_InformationPoint4  not present "));	
			}
			
		}
		 if(!list.isEmpty()) {
			 flag=false;
				String s=null;
				for (Object object : list) {
				 s =s+object.toString();
				}
				throw new Exception(s);			    
		 }
		return flag;
		
	}

	public boolean isNavigatedToPDPOnWeb() {
		
		return false;
	}
	
	
}