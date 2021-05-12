package com.aso.qe.test.pageobject.ios;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.lang.UnsupportedOperationException;
import java.util.List;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.aso.qe.framework.common.PropertiesHelper;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.GlobalMobileHelper.Direction;
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
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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

	public void tapOnSizeChart() {
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.btnSizeChart);
		
	}
	public boolean isSizeChartDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.sizeChartTitle);
	}
	public void tapOnCancelBtn() {
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.btnCancelSizeChart);
	}

	public boolean isPickUpAndDeliveryOptionDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.pickUpAndDeliveryTitle);
	}

	public void tapOnColor() {
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.firstColor);
		
	}

	public boolean isDisabledAddtoCart() {
		MobileElement addToCart = driver.findElement(Locators.PDPPage.buttonAddToCart);
		boolean stat = addToCart.isEnabled();
		if(stat==true) {
			return false;
		}else {
		return true;
		}
	}

	public boolean isMessageDisplayed(String args) throws Exception {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 List<Object> list = new ArrayList<Object>();
		boolean flag=true;
		if(args.equalsIgnoreCase("App_store_guidelines")) {
			 
			String textguidelines=GlobalMobileHelper.findData(args);
			 String elementtext  = driver.findElement(Locators.PDPPage.AppStoreGuidelines).getText();
			if(textguidelines.equalsIgnoreCase(elementtext)) {
				
				flag=true;
			}else {
				list.add ( new Exception("AppStoreGuidelines not present "));	
			}

			
		}
		
		if(args.equalsIgnoreCase("important_Product_and_Safety_Information")) {
			// 
			String textguidelines=GlobalMobileHelper.findData("important_Product_and_Safety_Information");
			String InformationPoint1=GlobalMobileHelper.findData("important_Product_and_Safety_InformationPoint1");
			String InformationPoint2=GlobalMobileHelper.findData("important_Product_and_Safety_InformationPoint2");
			String InformationPoint3=GlobalMobileHelper.findData("important_Product_and_Safety_InformationPoint3");
			String InformationPoint4=GlobalMobileHelper.findData("important_Product_and_Safety_InformationPoint4");
			 
			if(!(driver.findElement(Locators.PDPPage.ProductSafetyInformation).getText().equalsIgnoreCase(textguidelines))) {
				System.out.println(0+driver.findElement(Locators.PDPPage.ProductSafetyInformation).getText());
				System.out.println(0+textguidelines);
				list.add ( new Exception("ProductSafetyInformation  not matching"));	
			}
			if(!(driver.findElement(Locators.PDPPage.ProductSafetyInformationPara1).getText().equalsIgnoreCase(InformationPoint1))) {
				System.out.println(1+driver.findElement(Locators.PDPPage.ProductSafetyInformationPara1).getText());
				System.out.println(1+InformationPoint1);
				list.add ( new Exception("important_Product_and_Safety_InformationPoint para1  not matching or present"));	
			}
			if(!(driver.findElement(Locators.PDPPage.ProductSafetyInformationPara2).getText().equalsIgnoreCase(InformationPoint2))) {
				System.out.println(2+driver.findElement(Locators.PDPPage.ProductSafetyInformationPara2).getText());
				System.out.println(2+InformationPoint2);
				list.add ( new Exception("important_Product_and_Safety_InformationPoint2  not matching or present"));	
			}
			if(!(driver.findElement(Locators.PDPPage.ProductSafetyInformationPara3).getText().equalsIgnoreCase(InformationPoint3))) {
				System.out.println(3+driver.findElement(Locators.PDPPage.ProductSafetyInformationPara3).getText());
				System.out.println(3+InformationPoint3);
				list.add ( new Exception("important_Product_and_Safety_InformationPoint3  not matching or present"));	
			}
			if(!(driver.findElement(Locators.PDPPage.ProductSafetyInformationPara4).getText().equalsIgnoreCase(InformationPoint4))) {
				System.out.println(4+driver.findElement(Locators.PDPPage.ProductSafetyInformationPara4).getText());
				System.out.println(4+InformationPoint4);
				list.add ( new Exception("important_Product_and_Safety_InformationPoint4  not matching or present "));	
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

	public boolean isVariantValueDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.colorValueWhite);
	}

	public boolean isNavigatedToPDPOnWeb() {

		Set<String> availableContexts = driver.getContextHandles();

		for (String context : availableContexts) {
			if (context.contains("WEBVIEW")) {
				System.out.println("Context Name is " + context);
				driver.context(context);
				break;
			}
		}
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.WebViewBannerPDP);
	}
	
	public void selectDeliveryOption(String optionName) throws UnsupportedOperationException {
		// optionName can be home/store
		if (optionName.toLowerCase().equals("home")) {
			homeDeliveryRadio.click();
			logger.debug("Selected delivery option as " + homeDeliveryRadio.toString());
		}else if (optionName.toLowerCase().equals("store")) {
			freeStorePickupRadio.click();
			logger.debug("Selected delivery option as " + freeStorePickupRadio.toString());
		}else {
			throw new UnsupportedOperationException();
		}

		MobileElement productListed = driver.findElement(Locators.PDPPage.labelProductTitle);
		Context.setCurrentProductTitle(productListed.getText().trim()); // storing product title for later use
	}

	public void tapOnRadioBtn() {
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.btnRadioDeliveryOption);
		
	}

	public boolean isLabelDisplayed(String label) {
		String labelActual = driver.findElement(Locators.PDPPage.label).getText();
		if(labelActual.equalsIgnoreCase(label)) {
			return true;
		}else {
			return false;
		}
		
	}
	public boolean isSubLabelDisplayed(String label) {
		String labelActual = driver.findElement(Locators.PDPPage.subLabel).getText();
		if(labelActual.equalsIgnoreCase(label)) {
			return true;
		}else {
			return false;
		}
		
	}

	public void changeStore(String storeName) {
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.selectStore);
		driver.findElement(Locators.PDPPage.searchStoreBox).sendKeys(storeName);
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.cancelBtn);
		
		
		
		
		
	}
	/**
	This Method is use for validate the variant on PDP
	
	*/
	public boolean isVarientDisplayed(String varianType) {
		if (varianType.contains("color and size")) 
		{
		boolean stat1=	 GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.colorVariant);
		boolean stat2=	 GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.sizeVariant);
		     if(stat1 && stat2 == true) {
		    	 return true;
		     }else {
		    	 return false;
		     }
			
		}else if(varianType.contains("width")) {
			boolean stat4=	 GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.colorVariant);
			boolean stat5=	 GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.shoeSizeVariant);
			boolean stat6=	 GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.widthVariant);
			 if(stat4&&stat5&&stat6 == true) {
		    	 return true;
		     }else {
		    	 return false;
		     }
		}
		else  {
			boolean stat = GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.colorVariant);
			return stat;
		}
		
		
		
	}
	/**
	This Method is use for the Change Variant on PDP Page
	
	*/
	public void changeVariant(String variantType,String variantSize, String variantColor, String variantwidth) {
		if(variantType.contains("SizeAndColor")) {
			GlobalMobileHelper.tapOnElement(Locators.PDPPage.whiteColor);
            try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			GlobalMobileHelper.tapOnElement(Locators.PDPPage.mediumSize);
			
			
		}else if(variantType.contains("width")) {
			GlobalMobileHelper.tapOnElement(Locators.PDPPage.shoeSize);
			GlobalMobileHelper.tapOnElement(Locators.PDPPage.widthSizeD);
		}else {
			System.out.println("Fixed variant");
		}
		
			/*else if(variantType.contains("color")) {
		
			if(driver.findElement(Locators.PDPPage.firstColor).isDisplayed()==true) {
				GlobalMobileHelper.tapOnElement(Locators.PDPPage.whiteColor);
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				MobileElement varientColorValue = driver.findElement(Locators.PDPPage.colorValue);
				assertTrue(varientColorValue.getText().contains(variantColor));*/
			
		
			
		
	}




	public void tapOnChangeStoreLink() {
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.changeStoreLink);
	}


	public void tapOnHomeDelivery() {
		GlobalMobileHelper.swipeScreen(Direction.UP);
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.homeDeliveryRadioButton);
	}

	public void tapOnChangeStore() {
		GlobalMobileHelper.swipeScreen(Direction.UP);
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.buttonChangeStore);
	}

	public boolean isFindStoreScreenDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.FindStore.findStoreHeader);
	}

	public void enterTextInStoreSearchField(String text) {
		GlobalMobileHelper.setText(Locators.FindStore.searchBox, text, Locators.FindStore.findStoreHeader);
	}

	public boolean noStoreAvailableMessageDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.FindStore.noStoreAvailableMessage);
	}

	public void tapOnCancelButton() {
		GlobalMobileHelper.tapOnElement(Locators.FindStore.cancelButton);
	}

	public boolean isErrorMessageDisplayed(String args) throws Exception {
		 List<Object> list = new ArrayList<Object>();
			boolean flag=true;
			if(args.equalsIgnoreCase("LocatorErrorMsgOverLay")) {
				// 
				String textguidelines=GlobalMobileHelper.findData(args);
				 String elementtext  = driver.findElement(Locators.PDPPage.AppStoreGuidelines).getText();
				if(textguidelines.equalsIgnoreCase(elementtext)) {
					
					flag=true;
				}else {
					list.add ( new Exception(" not matching "));	
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

	public boolean VerifyOverlayAttribute(String args) throws Exception {


		 List<Object> list = new ArrayList<Object>();
			boolean flag=true;
			if(args.equalsIgnoreCase("SizeAndColor")) {
				if(!isOverLayCartSKUValueDisplayed()) {
					list.add ( new Exception(" SKU not displaying "));			
				}
				if(!isOverLayCartQtyDisplayed()) {
					list.add ( new Exception(" Qty not displaying "));	
					
				}
				if(!isOverLayCartPriceDisplayed()) {
					list.add ( new Exception(" Price not displaying "));	
					
				}
				if(!isOverLayCartSizeDisplayed()) {
					list.add ( new Exception(" Size not displaying "));	
					
				}
				if(!isOverLayCartTitle()) {
					list.add ( new Exception(" title not displaying "));	
					
				}
				if(!isOverLayCartImage()) {
					list.add ( new Exception(" Image not displaying "));	
					
				}
				if(!isOverLayCartview_cart()) {
					list.add ( new Exception(" view cart not displaying "));	
					
				}
				if(!isOverLayCartcontinue_shopping()) {
					list.add ( new Exception(" Continue Shopping missing"));	
					
				}
				if(!isOverLayCartdded_to_cart()) {
					list.add ( new Exception(" Added To Cart text missing "));	
					
				}
				if(!isOverLayCartcolourDisplayed()) {
					list.add ( new Exception(" color value is missing "));	
					
				}
				
			}else if(args.equalsIgnoreCase("color")) {
				
				if(!isOverLayCartdded_to_cart()) {
					list.add ( new Exception(" Added To Cart text missing "));	
					
				}
				if(!isOverLayCartTitle()) {
					list.add ( new Exception(" title not displaying "));	
					
				}
				if(!isOverLayCartImage()) {
					list.add ( new Exception(" Image not displaying "));	
					
				}
				if(!isOverLayCartcolourDisplayed()) {
					list.add ( new Exception(" color value is missing "));	
					
				}
				if(!isOverLayCartSKUValueDisplayed()) {
					list.add ( new Exception(" SKU not displaying "));			
				}
				if(!isOverLayCartQtyDisplayed()) {
					list.add ( new Exception(" Qty not displaying "));	
					
				}
				if(!isOverLayCartPriceDisplayed()) {
					list.add ( new Exception(" Price not displaying "));	
					
				}
				if(!isOverLayCartview_cart()) {
					list.add ( new Exception(" view cart not displaying "));	
				}
				if(!isOverLayCartcontinue_shopping()) {
					list.add ( new Exception(" Continue Shopping missing"));	
					
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
	
	public boolean isStoreDetailsDisplayed() {
		boolean stat = GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.storeAddress);
		boolean stat2 = GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.storetime);
		boolean stat3 = GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.storePhone);
		
		if(stat&& stat2&& stat3==true) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean isOverLayCartSKUValueDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.OverLayCartSKU);
	}	
	public boolean isOverLayCartPriceDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.OverLayCartPrice);
	}
	public boolean isOverLayCartQtyDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.OverLayCartQty);
	}
	public boolean isOverLayCartSizeDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.OverLayCartSize);
	}
	public boolean isOverLayCartcolourDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.OverLayCartcolour);
	}

	public boolean isOverLayCartTitle() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.OverLayCartTitle);
	}
	public boolean isOverLayCartImage() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.OverLayCartImage);
	}
	public boolean isOverLayCartview_cart() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.OverLayCartview_cart);
	}
	public boolean isOverLayCartcontinue_shopping() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.OverLayCartcontinue_shopping);
	}
	public boolean isOverLayCartdded_to_cart() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.OverLayCartdded_to_cart);
	}
	public void tapOnContiniueShoppingBtn() {
		GlobalMobileHelper.setImplicitWaitTo(driver, 5);
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.continueShopping);
	}

	public boolean isPickUpDeliveryOptionsDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.pickUpAndDeliveryTitle);
		
	}

	public boolean isFreeStorePickUpDisplayed() {
		
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.freeStorePickUpTitle);
	}

	public boolean isDetailsDisplayedOfProduct() {
		boolean stat1 =  GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.deailsSpecTitle);
		boolean stat2 = GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.itemTitle);
		boolean stat3 =GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.skuDetailTitle);
		boolean stat4 = GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.productDetails);
		if(stat1&&stat2&&stat3&&stat4==true) 
		{
			return true;
			
		}else {
			return false;
		}
			
	}
	public void tapOnStorePickUp() {
		GlobalMobileHelper.swipeScreen(Direction.UP);
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.freeStorePickUpRadioBtn);
	}

	public  void verifyStoreRadioButtonSelected() throws Exception {
		
		if(!GlobalMobileHelper.isElementEnabled(Locators.PDPPage.freeStorePickUpRadioBtn)) {
			throw new Exception("Button not enabled after tap");
		}
	}

	public boolean isAlertPopUpDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.liveChatBtn);
		
	}

	public void tapOnLiveChat() {
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.liveChatBtn);
		
	}

	public boolean isNavigateToLiveChatUrl() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.liveChatUrlTitle);
		
	}

	public boolean isBulkGiftCardBtnDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.bulkGiftCardBtnAlert);
	}
	public void tapOnPurchaseButton() {
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.purchaseBtn);
	}

	public boolean isCartBadgeDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.cartBadge);
	}

	@iOSXCUITFindBy(id="rd_home_delivery")
	public MobileElement CounterBadgeOnCartIcon;

	@iOSXCUITFindBy(id="lbl_cart")
	public MobileElement labelItemCount;
	private int CCheckbox;

	public boolean ItemsCountOnCartBadge(String arg1) {
		String qtyCartPage = labelItemCount.getText();
		int qtyCartPageCount = Integer.parseInt(qtyCartPage);
		String countOnCartBadge = CounterBadgeOnCartIcon.getText();
		if (qtyCartPageCount < 100) {
			assertTrue(qtyCartPage.equalsIgnoreCase(countOnCartBadge));
		} else {
			assertTrue(countOnCartBadge.equalsIgnoreCase("99+"));
		}
		return true;
	}

	public boolean isProductTitleOnHeaderDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.productTite);
	}

	public boolean isBackButtonDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.backBtn);
	}

	public void tapOnCartBadge() {
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.cartBadge);
	}
	public static void clickonPDP(String elementname) {
		if(elementname.equalsIgnoreCase("addtocart")) {
			
			GlobalMobileHelper.tapOnElement(Locators.PDPPage.buttonAddToCart);
		}else if(elementname.equalsIgnoreCase("homedeliveryradiobutton")) {
			
			GlobalMobileHelper.tapOnElement(Locators.PDPPage.homeDeliveryRadioBtn);
			
		}
		else if(elementname.equalsIgnoreCase("buttonaddtowishlist")) {
			
			GlobalMobileHelper.tapOnElement(Locators.PDPPage.buttonaddtowishlist);
		}
		else if(elementname.equalsIgnoreCase("getnotifiedBOPIS")) {
			
			GlobalMobileHelper.tapOnElement(Locators.PDPPage.getnotifiedBOPIS);
			
		}
		else if(elementname.equalsIgnoreCase("ChangeStorebutton")) {
			
			GlobalMobileHelper.tapOnElement(Locators.PDPPage.ChangeStorebutton);
		}else if(elementname.equalsIgnoreCase("SelectStorebutton")) {
			
			GlobalMobileHelper.tapOnElement(Locators.PDPPage.SelectStorebutton);

		}else {

			throw new UnsupportedOperationException("Given element not found on PDP");

		}
	}

	public static boolean VarifyElementPresenseOnPDPPage(String elementname) {
	if(elementname.equalsIgnoreCase("Standered Gift card modal")) {
			
			return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.STDGIFTCARDModal);

			
		}else if(elementname.equalsIgnoreCase("Standered Gift card modal generic message")){
			
			return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.STDGIFTCARDModalGenericContent);
			
		}else if(elementname.equalsIgnoreCase("Open STD Gift card button")){
			
			return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.OpenSTDGiftcardbutton);
		}else if(elementname.equalsIgnoreCase("Bulk Gift card modal")){
			
			return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.BulkGIFTCARDModal);
				}else if(elementname.equalsIgnoreCase("Bulk Gift card modal generic message")){
	
					return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.bulkGIFTCARDModalGenericContent);
				}else if(elementname.equalsIgnoreCase("Open Bulk Gift card button")){
	
					return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.OpenbulkGiftcardbutton);
					}else if(elementname.equalsIgnoreCase("Cancelbutton")){
			
			return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.CloseAlertmodal);
					}else if(elementname.equalsIgnoreCase("buttonaddtowishlist")){
						
						return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.buttonaddtowishlist);

			
		}else {
			
			throw new UnsupportedOperationException("Given Button not founded on PDP");

		}
	}
// To check Store Delivery and Store Pick for SOF Item 
	public static boolean VarifyElementPresenseOnPDPUnderStoreSEction(String elementname) {
if(elementname.equalsIgnoreCase("Store Delivery Heading")) {
			
			return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.StoreDeliveryHeading);
}else if(elementname.equalsIgnoreCase("PICKUPanddeliveryheading")){
	
	return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.PICKUPanddeliveryheading);
			
		}else if(elementname.equalsIgnoreCase("Avalability Geeen")){
			
			return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.AvalabilityGeeenlabel);
			
		}else if(elementname.equalsIgnoreCase("OOS red label")){
			
			return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.OOSredlabel);
		}else if(elementname.equalsIgnoreCase("Not Available")){
			
			return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.NotAvailable);
				}else if(elementname.equalsIgnoreCase("Free Store pickup Heading")){
	
					return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.FreeStorepickupHeading);
				}else if(elementname.equalsIgnoreCase("Find Availability on other Store CTA")){
	
					return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.FindAvailabilityonotherStoreCTA);
					}else if(elementname.equalsIgnoreCase("Store address")){
			
			return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.storeAddress);
					}else if(elementname.equalsIgnoreCase("Store phone")){
						
						return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.storePhone);
						}else if(elementname.equalsIgnoreCase("Store timing")){
						
						return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.storetime);
						}else if(elementname.equalsIgnoreCase("Notify me when available label")){
	
							return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.Notifymewhenavailablelabel);
						}else if(elementname.equalsIgnoreCase("Select A Store button")){
	
							return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.selectStore);
						}else if(elementname.equalsIgnoreCase("Change Store button")){
	
							return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.changeStore);

			
		}else {
			
			throw new UnsupportedOperationException("Given Button not founded on PDP");

		}
	}

	public void tapOnRatingAndReview() {
		while(true)
		try {
			GlobalMobileHelper.tapOnElement(Locators.PDPPage.ratingAndReviewBtn);
			break;
		} catch (Exception e) {
			GlobalMobileHelper.swipeScreen(Direction.UP);
		}
		
	}

	public void isRatingsAndReviewDisplayed() {
		/*List<MobileElement> ratings = driver.findElements(Locators.ReviewPage.ratingsAndReview);
		for(int i = 1; i<=ratings.size(); i++) {
			
		}*/
		GlobalMobileHelper.isElementDisplayed(Locators.ReviewPage.ratingsAndReview);
	}

	public void tapOnWriteReviewBtn() {
		GlobalMobileHelper.tapOnElement(Locators.ReviewPage.writeReviewBtn);
		
	}

	public boolean isReviewPageDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.ReviewPage.ReviewPageTitle);
		
	}

	public void enterRatingValue(int ratingValue) {
		List<MobileElement> ls = driver.findElements(Locators.ReviewPage.ratingValue);
		for(int i =1; i<=ls.size();i++) {
			if(ratingValue==i) {
				ls.get(i).click();
			}
		}
	}
   public void enteValuesOnReviewPage(String editBoxType, String value) {
	   String EditValue = PropertiesHelper.getInstance().getMobileTestDataProperty(value);
	   switch(editBoxType.toLowerCase())
		{
		case "ReviewTitle":
			GlobalMobileHelper.setText(Locators.ReviewPage.reviewTitleEditBox, EditValue);
		case "ReviewDetails":
			GlobalMobileHelper.setText(Locators.ReviewPage.reviewDetailsEditBox, EditValue);
		case "NickName":
			GlobalMobileHelper.setText(Locators.ReviewPage.nickNameEditBox, EditValue);
		case "Location":
			GlobalMobileHelper.setText(Locators.ReviewPage.LocationEditBox, EditValue);
		case "Email":
			GlobalMobileHelper.setText(Locators.ReviewPage.emailEditBox, EditValue);
		case "Recommendation":
			if(value.contains("Yes")) {
				GlobalMobileHelper.tapOnElement(Locators.ReviewPage.yesOption);
			}else {
				GlobalMobileHelper.tapOnElement(Locators.ReviewPage.NoOption);
			}
		case "Fit":
			List<MobileElement> ls = driver.findElements(Locators.ReviewPage.fitValue);
			for(int i =1; i<=ls.size();i++) {
				if(Integer.parseInt(EditValue)==i) {
					ls.get(i).click();
					}
			}
		case "sweepstackDropdown":
		GlobalMobileHelper.tapOnElement(Locators.ReviewPage.sweepstackDropdown);
		if(EditValue.contains("Yes")) {
		GlobalMobileHelper.tapOnElement(Locators.ReviewPage.yesOption);
		}else {
		GlobalMobileHelper.tapOnElement(Locators.ReviewPage.NoOption);	
		}
	}
   }

public void clickOnCheckBox(String checkBoxType) {
	if(checkBoxType.contains("SweepstackTermsCondition")) {
	GlobalMobileHelper.tapOnElement(Locators.ReviewPage.sweepstackTermCondCheckbox);
	}else {
		GlobalMobileHelper.tapOnElement(Locators.ReviewPage.termCondCheckbox);
	}
}

public void tapOnPostReviewBtn() {
	GlobalMobileHelper.tapOnElement(Locators.ReviewPage.postReviewBtn);
	
}

public boolean isRatingAndReviewDetailsPageDisplayed() {
	return GlobalMobileHelper.isElementDisplayed(Locators.ReviewPage.reviewDetailsPageTitle);
}

public void isFieldDisplayedOnReviewDetailsPage(String fieldType) {
	switch(fieldType)
	{
	case "SortOption":
		GlobalMobileHelper.isElementDisplayed(Locators.ReviewPage.sortOption);
	case "UserName":
		GlobalMobileHelper.isElementDisplayed(Locators.ReviewPage.reviewerName);
	case "PostedTime":
		GlobalMobileHelper.isElementDisplayed(Locators.ReviewPage.postedTimeText);
	case "StarRating":
		GlobalMobileHelper.isElementDisplayed(Locators.ReviewPage.starRatingValue);
	case "ReviewTitle":
		GlobalMobileHelper.isElementDisplayed(Locators.ReviewPage.reviewTitle);
	case "VerifiedPurchaserMark":
		GlobalMobileHelper.isElementDisplayed(Locators.ReviewPage.verifiedPurchaserMark);
	case "yesIRecommend":
		GlobalMobileHelper.isElementDisplayed(Locators.ReviewPage.yesIRecommend);
	case "Helpfullquestion":
		GlobalMobileHelper.isElementDisplayed(Locators.ReviewPage.helpfullquestion);
	
}
	
}

public void isElementEnabled(String yesStat, String noStat, String reportStat) {
	boolean yesEl =GlobalMobileHelper.isElementEnabled(null);
	boolean noEl =GlobalMobileHelper.isElementEnabled(null);
	boolean reportEl =GlobalMobileHelper.isElementEnabled(null);
	if(yesStat.contains("Active")) {
	
	assertEquals(true, yesEl);
	}else {
		assertEquals(false, yesEl);		
	}
	if(noStat.contains("Active")) {
		assertEquals(true, noEl);
	}else {
		assertEquals(false, noEl);
	}
	if(reportStat.contains("Active")) {
		assertEquals(true, reportEl);
	}else {
		assertEquals(false, reportEl);
	}
}

public void tabOnHelpfullReviewQn(String answer) {
	if(answer.contains("Yes")) {
		GlobalMobileHelper.tapOnElement(Locators.ReviewPage.yesOption);
	}else {
		GlobalMobileHelper.tapOnElement(Locators.ReviewPage.NoOption);
	}
}
	


public static boolean VarifyElementPresenseOngetnotifypage(String elementname) {
		if(elementname.equalsIgnoreCase("getnotifiedheading")) {
					
					return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.getnotifiedheading);
		} else if(elementname.equalsIgnoreCase("getnotifiedheading")) {
				
				    return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.emailtextbox);
			} else if(elementname.equalsIgnoreCase("BOPISdeliverymethode")) {
			
					return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.BOPISdeliverymethode);
}
				else if(elementname.equalsIgnoreCase("producttitle")) {
						
						return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.Producttitle);
					} else if(elementname.equalsIgnoreCase("productprice")) {
							
						return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.Productprice);
				} else if(elementname.equalsIgnoreCase("productimage")) {
								
						return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.Productimage);
				}else if(elementname.equalsIgnoreCase("Selectedstorename")) {
									
						return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.Selectedstorename);
				}else if(elementname.equalsIgnoreCase("storeaddress")) {
										
						return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.storeAddress);
				}else if(elementname.equalsIgnoreCase("storetiming")) {
											
						return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.storetime);
			 }else if(elementname.equalsIgnoreCase("storephone")) {
												
					  return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.storePhone);
			 }else if(elementname.equalsIgnoreCase("userisnotifiedmessage")) {
					
				  return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.userisnotifiedmessage);
		  }else {
			
			throw new UnsupportedOperationException("Given Button not founded on get notified page ");

		  }}

public static void Enteremailongetnotifypage(String fieldName) {
	String keywordValue = PropertiesHelper.getInstance().getMobileTestDataProperty(fieldName);

	String element = null;
	if (fieldName.contains("email")) {
		GlobalMobileHelper.setText(Locators.PDPPage.emailtextbox, keywordValue);
	} else {

		
		throw new UnsupportedOperationException("Given Input type not defined on get notify page ");
}
}

public static void clickongetnotifypage(String btnName) {
	
		if (btnName.equalsIgnoreCase("submitgetnotifiedbutton")) {

			GlobalMobileHelper.tapOnElement(Locators.PDPPage.submitgetnotifiedbutton);
		} else {

			
			throw new UnsupportedOperationException("Given Input type not defined on get notify page ");
	
}
}

public static void tapOnShareIconPDP() {
	// TODO Auto-generated method stub
	if(GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.shareIcon))
	{
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.shareIcon);
	}
}

public static void ValidateProductImgOnShareTray() {
	GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.labelProductTitle);
	GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.overLayProductImage);
}

public void tapOnDoneBtn() {
	GlobalMobileHelper.tapOnElement(Locators.PDPPage.doneBtn);
	
}

public boolean isAmountErrorMessageDisplayed() {
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	GlobalMobileHelper.swipeScreen(Direction.UP, 1);
	return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.amountErrormsg);
	
}

public void tapOnCancelOnAlertMsg() {
	GlobalMobileHelper.tapOnElement(Locators.PDPPage.cancelAlertBtn);
	
}

public boolean isAlertDisplayed(String alertType) {
	if(alertType.contains("liveChat")) {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.liveChatBtn);
	}else {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.bulkGiftCardBtnAlert);
	}
	
}
}
												
