package com.aso.qe.test.pageobject.ios;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.stepdefinition.ios.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PLPPage {
	
	Context context = new Context();
	private static final Logger logger = Logger.getLogger(Hooks.class);
	private AppiumDriver<MobileElement> driver;
	
	public PLPPage(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	}

	
	public void verifyPLPPageName(AppiumDriver<MobileElement> driver, String categoryName){
		GlobalMobileHelper.isElementDisplayed(Locators.PLPPage.PLPHeader);
		String plpTitle = driver.findElement(Locators.PLPPage.PLPHeader).getText();
		context.setCategoryTitleOnPLP(plpTitle);
		assertTrue("User should be on "+categoryName+" PLP page but user is on "+plpTitle+ " page",categoryName.trim().equalsIgnoreCase(plpTitle.trim()));
	}
		
	public void verifyShopByCategorylabel() {
		assertTrue("Shop by category title is not present",GlobalMobileHelper.isElementDisplayed(Locators.PLPPage.shopByCategoryLabel));	
		}
	
	public void verifyShopCategoryDisplayedonPLP(AppiumDriver<MobileElement> driver,List<String> shopBySubCategoryList) {
		GlobalMobileHelper.setImplicitWaitTo(driver,5);
		List<String> plpCategoryNameList = new ArrayList<String>();
		String plpcategory;
		List<MobileElement> PLPCategoriesList = (List<MobileElement>) driver.findElements(Locators.PLPPage.subCategoryButton);
		int listSize = PLPCategoriesList.size();
			assertTrue("Categories are not present on "+context.getCategoryTitleOnPLP()+" PLP Page", listSize>0);
		for (int i=0;i<listSize;i++) {
			plpcategory=PLPCategoriesList.get(i).getText();
			plpcategory=plpcategory.substring(20).trim();
			plpCategoryNameList.add(i,plpcategory);
			assertTrue("Category on shop page is "+shopBySubCategoryList.get(i)+ " but the Category on  PLP page is "+plpcategory,
					plpcategory.toLowerCase().equalsIgnoreCase(shopBySubCategoryList.get(i)));			
		context.setPlpSubCategoryList(plpCategoryNameList);
		}}
	
	public void verifyShopCategoryNotDisplayedonPLP() {
		GlobalMobileHelper.setImplicitWaitTo(driver,5);
		List<MobileElement> PLPCategoriesList = (List<MobileElement>) driver.findElements(Locators.PLPPage.subCategoryButton);
		int listSize = PLPCategoriesList.size();
			assertFalse("Categories are present on "+context.getCategoryTitleOnPLP()+" PLP Page", listSize>0);
		}
	public void navigateToPLPCategories(String plpCategoryName) {
		int listSize = context.getPlpSubCategoryList().size();
		String plpCategory;
		assertTrue("Categories are not present on "+context.getCategoryTitleOnPLP()+" PLP Page", listSize>0);
		List<MobileElement> PLPCategoriesList = (List<MobileElement>) driver.findElements(Locators.PLPPage.subCategoryButton);
		for (int i=0;i<listSize;i++) {
			plpCategory=PLPCategoriesList.get(i).getText().substring(20).trim();
			if(plpCategoryName.trim().toLowerCase().equalsIgnoreCase(plpCategory)) {
			logger.info("tapping on "+PLPCategoriesList.get(i));
			GlobalMobileHelper.tapOnElement(PLPCategoriesList.get(i));
			GlobalMobileHelper.setImplicitWaitTo(driver, 4);
			verifyPLPPageName(driver, plpCategoryName);
			/*logger.info("going back");
			GlobalMobileHelper.tapOnElement(Locators.ShopPage.categoryBackBtn);
			GlobalMobileHelper.setImplicitWaitTo(driver, 4);*/
			}
		}
	}


	public boolean verifyPLP_Banners(String args) {
		
		if(args.equalsIgnoreCase("free_Shipping_Banner")) {
		 return	isIn_Store_curbside_Banner(args);
			
			
		}if(args.equalsIgnoreCase("In_Store_curbside_Banner")) {
			 return	isIn_Store_curbside_Banner(args);
		}
		return false;
		
	}
	
	
	
	
	
	public boolean isIn_Store_curbside_Banner(String args) {
		String textguidelines=GlobalMobileHelper.findData(args);
		MobileElement BannerElement = driver.findElement(Locators.PLPPage.PLP_Page__Instore_CurbSideBaner);
		 String elementtext  = BannerElement.getText();
		 if(elementtext.equalsIgnoreCase(textguidelines)) {
			 return true; 
		 }else {
			 return false;
		 }
		
	}	
	public boolean IsDisplayed_Free_Shipping_Banner(String args) {
		String textguidelines=GlobalMobileHelper.findData(args);
		MobileElement BannerElement = driver.findElement(Locators.PLPPage.PLP_Page_FreeShippingBaner);
		 String elementtext  = BannerElement.getText();
		 if(elementtext.equalsIgnoreCase(textguidelines)) {
			 return true; 
		 }else {
			 return false;
		 }
		
	}
	public void click_ON_PLP_Link(String args) {

		
		if(args.equalsIgnoreCase("SeeDetail_FreeShipping")) {
			// driver.findElement(Locators.PLPPage.PLP_Page_FreeShippingBaner).click();

				// driver.findElement(Locators.PLPPage.PLP_Page_Instore_CurbSideBaner_SeeDeatil).click();
				int count=0;
				List<MobileElement> PLPCategoriesList = (List<MobileElement>) driver.findElements(Locators.PLPPage.PLP_Page_Instore_CurbSideBaner_SeeDeatil);
				for (MobileElement mobileElement : PLPCategoriesList) {
					count++;
					if(count==1) {
						GlobalMobileHelper.tapOnElement(PLPCategoriesList.get(0));
					}
				} 
				
				
			
			
		}if(args.equalsIgnoreCase("SeeDetail_Store_curbside")) {
			// driver.findElement(Locators.PLPPage.PLP_Page_Instore_CurbSideBaner_SeeDeatil).click();
			int count=0;
			List<MobileElement> PLPCategoriesList = (List<MobileElement>) driver.findElements(Locators.PLPPage.PLP_Page_Instore_CurbSideBaner_SeeDeatil);
			for (MobileElement mobileElement : PLPCategoriesList) {
				count++;
				if(count==1) {
					GlobalMobileHelper.tapOnElement(PLPCategoriesList.get(1));
				}
			} 
			
			
		}
			
	}

	public boolean VerifyBannerInWeb(String args) {

		
		if(args.equalsIgnoreCase("Mobile_Web_FreeShipping")) {
		 return	verifyWebFreeShippingBanner(args);
			
			
		}if(args.equalsIgnoreCase("Mobile_Web_Store_curbside")) {
			 return	verifyWebInStoreCurbsideBanne(args);
		}
		return false;
		
	
		
	}	
	
	
	public boolean verifyWebInStoreCurbsideBanne(String args) {
		String textguidelines=GlobalMobileHelper.findData(args);
	       Set<String> availableContexts = driver.getContextHandles();
			
			for(String context : availableContexts) {
				if(context.contains("WEBVIEW")){
					System.out.println("Context Name is " + context);
					driver.context(context);
					break;
				}
			}
			
			MobileElement BannerElement = driver.findElement(Locators.PLPPage.WebViewBannerTitle_Instore_CurbSideBaner);
			 String elementtext  = BannerElement.getText();
			 if(elementtext.equalsIgnoreCase(textguidelines)) {
				 return true; 
			 }else {
				 return false;
			 }
			
		}	
	public boolean verifyWebFreeShippingBanner(String args) {
		String textguidelines=GlobalMobileHelper.findData(args);
       Set<String> availableContexts = driver.getContextHandles();
		
		for(String context : availableContexts) {
			if(context.contains("WEBVIEW")){
				System.out.println("Context Name is " + context);
				driver.context(context);
				break;
			}
		}
		
		MobileElement BannerElement = driver.findElement(Locators.PLPPage.WebViewBannerTitleFreeShipping);
		 String elementtext  = BannerElement.getText();
		 if(elementtext.equalsIgnoreCase(textguidelines)) {
			 return true; 
		 }else {
			 return false;
		 }
		
	}
	
	//OMNI-20323  15.04.20201
	
	public boolean isFilterButtonDisplayed() {
		MobileElement filterButton = driver.findElement(Locators.PLPPage.FilterButton);
		return filterButton.isDisplayed();
	}
	public boolean isCancelButtonDisplayed() {
		MobileElement cancelButton = driver.findElement(Locators.PLPPage.FilterCancel);
		return cancelButton.isDisplayed();
	}
	public boolean isFilterTextDisplayed() {
		MobileElement filterText = driver.findElement(Locators.PLPPage.FilterScreenText);
		return filterText.isDisplayed();
	}
	public boolean isFilterApplyButtonDisplayed() {
		MobileElement applyButton = driver.findElement(Locators.PLPPage.FilterApplyButton);
		return applyButton.isDisplayed();
	}
	public boolean isFilterApplyButtonEnabled() {
		MobileElement applyButton = driver.findElement(Locators.PLPPage.FilterApplyButton);
		return applyButton.isEnabled();
	}
	
	public void taponFilterButton() {
		MobileElement filterButton = driver.findElement(Locators.PLPPage.FilterButton);
		GlobalMobileHelper.tapOnElement(filterButton);
	}


	public boolean isFilterTypesDisplayed(String filterType) {
		boolean flag= true;
		switch(filterType.toLowerCase()) {
		
		 case "Pick up & Delivery option":
			flag = GlobalMobileHelper.isElementDisplayed(Locators.PLPPage.pickupDeliveryFilter);
			return flag;
		 case "Category":
				flag = GlobalMobileHelper.isElementDisplayed(Locators.PLPPage.categoryFilter);
				return flag;
		 case "Brand":
				flag = GlobalMobileHelper.isElementDisplayed(Locators.PLPPage.brandFilter);
				return flag;
		 case "Size":
				flag = GlobalMobileHelper.isElementDisplayed(Locators.PLPPage.sizeFilter);
				return flag;
		 case "Style":
				flag = GlobalMobileHelper.isElementDisplayed(Locators.PLPPage.styleFilter);
				return flag;
		 case "Color":
				flag = GlobalMobileHelper.isElementDisplayed(Locators.PLPPage.colorFilter);
				return flag;
		 case "Price":
				flag = GlobalMobileHelper.isElementDisplayed(Locators.PLPPage.priceFilter);
				return flag;
		 case "Rating":
				flag = GlobalMobileHelper.isElementDisplayed(Locators.PLPPage.ratingFilter);
				return flag;
		 case "Deal":
				flag = GlobalMobileHelper.isElementDisplayed(Locators.PLPPage.dealsFilter);
				return flag;
				
		default:

			 throw new UnsupportedOperationException("No other delivery option is supported");
		}
		
		
	}


	public void tapOnCancelLink() {
		 MobileElement cancelLink = driver.findElement(Locators.PLPPage.FilterCancel);
		 GlobalMobileHelper.tapOnElement(cancelLink);
	}
	
	
}
