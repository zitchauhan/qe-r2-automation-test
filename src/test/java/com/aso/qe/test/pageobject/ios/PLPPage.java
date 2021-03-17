package com.aso.qe.test.pageobject.ios;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
	
	public void verifyPLPPageName(String categoryName) throws InterruptedException{
		GlobalMobileHelper.isElementDisplayed(Locators.PLPPage.PLPHeader);
		String plpTitle = driver.findElement(Locators.PLPPage.PLPHeader).getText();
		context.setCategoryTitleOnPLP(plpTitle);
		assertTrue("User should be on "+categoryName+"PLP page but user is on "+plpTitle+ "page",categoryName.equalsIgnoreCase(plpTitle));
	}
		
	public void verifyShopByCategorylabel() {
		assertTrue("Shop by category title is not present",GlobalMobileHelper.isElementDisplayed(Locators.PLPPage.shopByCategoryLabel));	
		}
	
	public void compareCategoriesOnShopAndPLP(String displayStatus) {
		GlobalMobileHelper.setImplicitWaitTo(driver,5);
		List<MobileElement> shopByCategoriesList = (List<MobileElement>) driver.findElements(Locators.PLPPage.subCategoryButton);
		int listSize = shopByCategoriesList.size();
		if(displayStatus.equalsIgnoreCase("not displaying")) {
			assertFalse("Categories are present on "+context.getCategoryTitleOnPLP()+" PLP Page", shopByCategoriesList.size()>0);
		}
		else if(displayStatus.equalsIgnoreCase("displaying")) {
			assertTrue("Categories are not present on "+context.getCategoryTitleOnPLP()+" PLP Page", shopByCategoriesList.size()>0);
		for (int i=0;i<shopByCategoriesList.size();i++) {
			assertTrue("Category on shop page: "+context.getSubCategoryNameList().get(i)+ " and Category on  PLP page: "+shopByCategoriesList.get(i).getText(),
					shopByCategoriesList.get(i).getText().equalsIgnoreCase(context.getSubCategoryNameList().get(i)));			
		}
		}}
}
