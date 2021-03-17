package com.aso.qe.test.pageobject.ios;

import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.stepdefinition.ios.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ShopPage {
	
	@iOSXCUITFindBy(id="rd_home_delivery")
	public MobileElement homeDeliveryRadio;
	
	Context context = new Context();
	private static final Logger logger = Logger.getLogger(Hooks.class);
	private AppiumDriver<MobileElement> driver;
	PLPPage plpPage = new PLPPage(driver);
	public ShopPage(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	}
	
	
	public boolean isShopPageDisplayed() {
		MobileElement shopPageHeader = driver.findElement(Locators.ShopPage.shopPageTitle);
		return shopPageHeader.isDisplayed();
	}
	
	public void isCategoriesDisplayed() throws InterruptedException {
		//driver.findElementsByAccessibilityId("lbl_category_list_item");
		GlobalMobileHelper.setImplicitWaitTo(driver,5);
		List<MobileElement> categoriesList = (List<MobileElement>) driver.findElements(Locators.ShopPage.categoriesList);
		assertTrue("categories are not present !", categoriesList.size()>0);
		}
	
	
	public void navigateToNthLinkInList(String category) throws InterruptedException{
		GlobalMobileHelper.setImplicitWaitTo(driver,5);
		List<MobileElement> categoriesList = (List<MobileElement>) driver.findElements(Locators.ShopPage.categoriesList);			
		logger.info("Navigating to "+category);
		for(int i=0;i<categoriesList.size();i++)
		{
			if(categoriesList.get(i).getText().toLowerCase().contains(category.toLowerCase())){
				GlobalMobileHelper.tapOnElement(categoriesList.get(i));
				break;}
				}
		}
	
	public void verifyL1CategoryLevel(){
		try{
			GlobalMobileHelper.setImplicitWaitTo(driver,5);
		List<MobileElement> categoriesList = (List<MobileElement>) driver.findElements(Locators.ShopPage.categoriesList);
		assertTrue("L1 categories are not present !", categoriesList.size()>0);
		for (int i=0;i<categoriesList.size();i++) {			
			MobileElement element = categoriesList.get(i);
			String elementName = element.getText();
			logger.info("Level 1 categories list");
			logger.info(" category--> "+elementName);
			GlobalMobileHelper.setImplicitWaitTo(driver,8);
			GlobalMobileHelper.tapOnElement(element);
			GlobalMobileHelper.setImplicitWaitTo(driver,5);
			isCategoriesDisplayed();
			String categorytitle= driver.findElement(Locators.ShopPage.categorytitle).getText();
			assertTrue("User is not landed on correct category page",elementName.contains(categorytitle));
			logger.info("going back");
			GlobalMobileHelper.tapOnElement(driver.findElement(Locators.ShopPage.categoryBackBtn)); 
			GlobalMobileHelper.setImplicitWaitTo(driver,3);
		} } 	catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e);
		}	
		
	}
	public void verifyL2CategoryLevel(){
		try{ 
			GlobalMobileHelper.setImplicitWaitTo(driver,5);
		List<MobileElement> categoriesList = (List<MobileElement>) driver.findElements(Locators.ShopPage.categoriesList);
		assertTrue("L2 categories are not present !", categoriesList.size()>0);
		String categorytitle= driver.findElement(Locators.ShopPage.categorytitle).getText();
		assertTrue("shop all link is not present for "+categorytitle,GlobalMobileHelper.isElementDisplayed(Locators.ShopPage.shopAllLink));
		for (int i=0;i<categoriesList.size();i++) {
			
			MobileElement element = categoriesList.get(i);
			String elementName = element.getText();
			logger.info("Level 2 categories list");
			logger.info(" category--> "+elementName);
			GlobalMobileHelper.setImplicitWaitTo(driver,8);
			GlobalMobileHelper.tapOnElement(element);
			GlobalMobileHelper.setImplicitWaitTo(driver,5);
			isCategoriesDisplayed();
			categorytitle= driver.findElement(Locators.ShopPage.categorytitle).getText();
			assertTrue("User is not landed on correct category page",elementName.contains(categorytitle));
			logger.info("going back");
			GlobalMobileHelper.tapOnElement(driver.findElement(Locators.ShopPage.categoryBackBtn)); 
			GlobalMobileHelper.setImplicitWaitTo(driver,5);
		} } 	catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e);
		}	
		
	}
	
	public void verifyL3CategoryLevel(){
		try {
			GlobalMobileHelper.setImplicitWaitTo(driver,5);
		List<MobileElement> categoriesList = (List<MobileElement>) driver.findElements(Locators.ShopPage.categoriesList);
		assertTrue("L3 categories are not present !", categoriesList.size()>0);
		String categorytitle= driver.findElement(Locators.ShopPage.categorytitle).getText();
		assertTrue("shop all link is not present for "+categorytitle,GlobalMobileHelper.isElementDisplayed(Locators.ShopPage.shopAllLink));
		for (int i=0;i<categoriesList.size();i++) {
			
			MobileElement element = categoriesList.get(i);
			String elementName = element.getText();
			logger.info("Level 3 categories list");
			logger.info(" category--> "+elementName);
			GlobalMobileHelper.setImplicitWaitTo(driver,8);
			GlobalMobileHelper.tapOnElement(element);
			GlobalMobileHelper.setImplicitWaitTo(driver,5);
			plpPage.verifyPLPPageName(elementName);
			logger.info("going back");
			GlobalMobileHelper.tapOnElement(driver.findElement(Locators.ShopPage.categoryBackBtn)); 
		}	GlobalMobileHelper.setImplicitWaitTo(driver,3);
		} 	catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e);
		}	
	}
	
	public void verifyCategoryTitle(String category) throws InterruptedException{
		GlobalMobileHelper.setImplicitWaitTo(driver,5);
		List<MobileElement> categoriesList = (List<MobileElement>) driver.findElements(Locators.ShopPage.categoriesList);			
		logger.info("Navigating to "+category);
		for(int i=0;i<categoriesList.size();i++)
		{
			String categoryPageTitle  = driver.findElement(Locators.ShopPage.categorytitle).getText();
			assertTrue("user should be on "+category +"page but user is on '"+ categoryPageTitle+"' category page",categoryPageTitle.toLowerCase().contains(category.toLowerCase()));
				}
		}
	public void navigateToNthLinkInList(int n) throws InterruptedException{
		GlobalMobileHelper.setImplicitWaitTo(driver,5);
		List<MobileElement> categoriesList = (List<MobileElement>) driver.findElements(Locators.ShopPage.categoriesList);			
		logger.info("Navigating to "+categoriesList.get(n-1).getText());
		GlobalMobileHelper.tapOnElement(categoriesList.get(n-1));		
	}
	
	public void getCategoryList() throws InterruptedException {
		//driver.findElementsByAccessibilityId("lbl_category_list_item");
		GlobalMobileHelper.setImplicitWaitTo(driver,5);
		String nameOfCategory;
		String categorytitle= driver.findElement(Locators.ShopPage.categorytitle).getText();
		List<String> categoryNameList = new ArrayList<String>();
		List<MobileElement> categoriesList = (List<MobileElement>) driver.findElements(Locators.ShopPage.categoriesList);
		assertTrue("categories are not present !", categoriesList.size()>0);
		for(int i=0;i<categoriesList.size();i++) {
			nameOfCategory = categoriesList.get(i).getText();
			nameOfCategory=(String) nameOfCategory.substring(18, nameOfCategory.indexOf("sub category"));
			 categoryNameList.add(i,nameOfCategory);
		} 
		context.setSubCategoryNameList(categoryNameList);
		logger.info("Main category is: "+categorytitle);
		logger.info("Sub categories are: "+context.getSubCategoryNameList());
		}
	
}
