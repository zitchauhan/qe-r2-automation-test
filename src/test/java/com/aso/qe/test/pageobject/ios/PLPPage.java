package com.aso.qe.test.pageobject.ios;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
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
}
