package com.aso.qe.test.pageobject.ios;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import java.lang.UnsupportedOperationException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.GlobalMobileHelper.Direction;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.stepdefinition.ios.Hooks;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class GCPDPPage {
	private static final Logger logger = Logger.getLogger(Hooks.class);
	private AppiumDriver<MobileElement> driver;
	
	public GCPDPPage(AppiumDriver<MobileElement> driver) {
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
	
	
	public void tapOnCancelBtn() {
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.btnCancelSizeChart);
	}
	public boolean isVariantValueDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.colorVariant);
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
		
		Set<String> availableContexts = driver.getContextHandles();
		
		for(String context : availableContexts) {
			if(context.contains("WEBVIEW")){
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
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.changeStore);
		
		
		
		
	}

	public boolean isVarientDisplayed(String varianType) {
		if (varianType.contains("color and size")) 
		{
		boolean stat1=	 GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.sizeVariant);
		boolean stat2=	 GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.colorVariant);
		     if(stat1 && stat2 == true) {
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

	public void changeVariant(String variantType,String variantSize, String variantColor) {
		if(variantType.contains("SizeAndColor")) {
			GlobalMobileHelper.tapOnElement(Locators.PDPPage.whiteColor);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			MobileElement varientColorValue = driver.findElement(Locators.PDPPage.colorVariant);
			assertTrue(varientColorValue.getText().contains(variantColor));
			
			GlobalMobileHelper.tapOnElement(Locators.PDPPage.mediumSize);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			MobileElement varientSizeValue1 = driver.findElement(Locators.PDPPage.sizeVariant);
			assertTrue(varientSizeValue1.getText().contains(variantSize));
			
		}else {
			System.out.println("fixed variants");
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
	
//	public boolean isCardAmountDisplayed() {
//		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.cardAmount);
//	}
	public boolean isGiftCardDescriptionDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.GiftCardDesc);
	}
	
	
	public String getGiftCardDescription() {
		return GlobalMobileHelper.getElementText(Locators.PDPPage.GiftCardDesc);
	}

	
	
	
	public boolean isdetailDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.GiftCardDetails);

	}
	public boolean isOutOfStockDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.OutofStock);

	}
	
	public boolean isAddedToCartDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.overLayAddedToCartText);
	}
	public boolean isShippingTypeDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.overLayShippingInformation);
	}
	public boolean isGCproductNameDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.labelProductTitle);
	}
	
	public boolean isGCproductSkuDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.OverLayCartSKU);
	}
	
	
	public boolean isGCproductPriceDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.OverLayCartPrice);
	}
	public boolean isGCproductQtyDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.OverLayCartQty);
	}
	
	public boolean isGCViewCartDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.buttonViewCart);
	}
	public boolean isGCContinueShoppingDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.buttonContinueShopping);
	}
	
	public boolean isCardAmountComponentDisplay() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.listCardAmount);
	}
	public boolean isDefaultCardAmountDisplay() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.labelDefaultCardAmount);
	}
	public boolean isCardAmountLabelDisplay() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.labelcardAmount);
	}
	
	public String getDefaultCardAmount() {
		return GlobalMobileHelper.getElementText(Locators.PDPPage.labelDefaultCardAmount);
	}
	
	public boolean isInstructionMessageDisplay() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.labelInstructionMsg);
	}
	
	public boolean isEnterAmountFieldDisplay() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.inputEnterAmount);
	}
	
	public boolean isGiftCardErrorMessageDisplay() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PDPPage.labelErrorMessage);
	}
	
	public String getEnterAmountDefaultValue() {
		return GlobalMobileHelper.getElementText(Locators.PDPPage.inputEnterAmountDefaultValue);
	}
	
	public String getGiftCardErrorMessage() {
		return GlobalMobileHelper.getElementText(Locators.PDPPage.labelErrorMessage);
	}
//	public void enterGiftCardMessage(String gcMessage) {
//		MobileElement gcMessageInput = driver.findElement(Locators.PDPPage.GiftCardMessage);
//		gcMessageInput.sendKeys(gcMessage);
//		
//	}

	public String getShippingType() {		
		return GlobalMobileHelper.getElementText(Locators.PDPPage.overLayShippingInformation);
	}

	public void tapOnAmountListed(String amount) {
		String actualamount = "Select Card Amount "+amount+", by tapping on the button";
		
		List<MobileElement> amountLs = driver.findElements(Locators.PDPPage.cardAmountList);
		//System.out.println(amountLs.size());
		for(int i =1; i<=amountLs.size()-1;i++) {
			//System.out.println(amountLs.get(i).getText());
			if(amountLs.get(i).getText().contains(actualamount)) {
			//System.out.println(amountLs.get(i).getText());
				amountLs.get(i).click();	
			}
		}
	}

	public void EnterAmountOnEditBox(String amount) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(Locators.PDPPage.inputEnterAmount).clear();
		GlobalMobileHelper.setText(Locators.PDPPage.inputEnterAmount, amount);
		
	}
	
	
	
	
	
}
