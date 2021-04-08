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
	
	public ShopPage(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	}
	PLPPage plpPage = new PLPPage(driver);
	
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
		Thread.sleep(5000);
		List<MobileElement> categoriesList = (List<MobileElement>) driver.findElements(Locators.ShopPage.categoriesList);			
		logger.info("Navigating to "+category);
		String categoryName;
		category=category.toLowerCase().trim();
		for(int i=0;i<categoriesList.size();i++)
		{ 	
		    categoryName = trimCategoryName(categoriesList.get(i).getText()).trim().toLowerCase();
		    if(categoryName.contains(category)){
				GlobalMobileHelper.tapOnElement(categoriesList.get(i));
				break;}
				}
		}
	
	public void verifyL1CategoryLevel(){
		try{
			Thread.sleep(5000);
		List<MobileElement> categoriesList = (List<MobileElement>) driver.findElements(Locators.ShopPage.categoriesList);
		assertTrue("L1 categories are not present !", categoriesList.size()>0);
		logger.info("Level 1 categories list");
		for (int i=0;i<categoriesList.size();i++) {			
			MobileElement element = categoriesList.get(i);
			String elementName = element.getText();
			logger.info(" category--> "+elementName);
			Thread.sleep(8000);
			GlobalMobileHelper.tapOnElement(element);
			Thread.sleep(5000);
			isCategoriesDisplayed();
			String categorytitle= driver.findElement(Locators.ShopPage.categorytitle).getText();
			assertTrue("User is not landed on correct category page",elementName.contains(categorytitle));
			logger.info("going back");
			GlobalMobileHelper.tapOnElement(driver.findElement(Locators.ShopPage.categoryBackBtn)); 
			Thread.sleep(3000);
		} } 	catch (Exception e) {
			
			e.printStackTrace();
			logger.error(e);
		}	
		
	}
	
	public void verifyL2CategoryLevel(){
		try{ 
		Thread.sleep(5000);
		List<MobileElement> categoriesList = (List<MobileElement>) driver.findElements(Locators.ShopPage.categoriesList);
		assertTrue("L2 categories are not present !", categoriesList.size()>0);
		String categorytitle= driver.findElement(Locators.ShopPage.categorytitle).getText();
		assertTrue("shop all link is not present for "+categorytitle,GlobalMobileHelper.isElementDisplayed(Locators.ShopPage.shopAllLink));
		logger.info("Level 2 categories list");
		for (int i=0;i<categoriesList.size();i++) {		
			MobileElement element = categoriesList.get(i);
			String elementName = element.getText();
			logger.info(" category--> "+elementName);
			Thread.sleep(5000);
			GlobalMobileHelper.tapOnElement(element);
			Thread.sleep(5000);
			isCategoriesDisplayed();
			categorytitle= driver.findElement(Locators.ShopPage.categorytitle).getText();
			assertTrue("User is not landed on correct category page",elementName.contains(categorytitle));
			logger.info("going back");
			GlobalMobileHelper.tapOnElement(driver.findElement(Locators.ShopPage.categoryBackBtn)); 
			GlobalMobileHelper.setImplicitWaitTo(driver,5);
		} } 	catch (InterruptedException e) {
			e.printStackTrace();
			logger.error(e);
		}	
		
	}
	
	public void verifyL3CategoryLevel(){
		try {
			Thread.sleep(5000);
		List<MobileElement> categoriesList = (List<MobileElement>) driver.findElements(Locators.ShopPage.categoriesList);
		assertTrue("L3 categories are not present !", categoriesList.size()>0);
		String categorytitle= driver.findElement(Locators.ShopPage.categorytitle).getText();
		assertTrue("shop all link is not present for "+categorytitle,GlobalMobileHelper.isElementDisplayed(Locators.ShopPage.shopAllLink));		
		logger.info("Level 3 categories list");
		for (int i=0;i<categoriesList.size();i++) {		
			MobileElement element = categoriesList.get(i);
			String elementName = element.getText();
			logger.info(" category--> "+elementName);
			Thread.sleep(5000);
			GlobalMobileHelper.tapOnElement(element);
			Thread.sleep(5000);
			plpPage.verifyPLPPageName(driver,trimCategoryName(elementName));
		//	plpPage.verifyShopCategoryDisplayedonPLP("not displaying");
			logger.info("going back");
			GlobalMobileHelper.tapOnElement(driver.findElement(Locators.ShopPage.categoryBackBtn)); 
		}	GlobalMobileHelper.setImplicitWaitTo(driver,3);
		} 	catch (Exception e) {
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
			assertTrue("user should be on "+category +" page but user is on '"+ categoryPageTitle+"' category page",categoryPageTitle.toLowerCase().contains(category.toLowerCase()));
				}
		}
	public void navigateToNthLinkInList(int n) throws InterruptedException{
		Thread.sleep(3000);
		List<MobileElement> categoriesList = (List<MobileElement>) driver.findElements(Locators.ShopPage.categoriesList);			
		logger.info("Navigating to "+categoriesList.get(n-1).getText());
		GlobalMobileHelper.tapOnElement(categoriesList.get(n-1));		
	}
	
	public List<String> getCategoryList() throws InterruptedException {
		//driver.findElementsByAccessibilityId("lbl_category_list_item");
		Thread.sleep(4000);
		String categoryName;
		List<String> categoryNameList = new ArrayList<String>();
		List<MobileElement> categoriesList = (List<MobileElement>) driver.findElements(Locators.ShopPage.categoriesList);
		assertTrue("categories are not present !", categoriesList.size()>0);
		for(int i=0;i<categoriesList.size();i++) {
			categoryName = categoriesList.get(i).getText();
			categoryName=(String) categoryName.substring(18, categoryName.indexOf("sub category")).trim();
			 categoryNameList.add(i,categoryName);
		}
		return categoryNameList; 
	}
	public List<String> L1CategoryList() throws InterruptedException {
		List<String> L1CategoryList = getCategoryList();
		context.setL1CategoryList(L1CategoryList);
		return context.getL1CategoryList();
	}
	
	public List<String> L2CategoryList() throws InterruptedException {
		List<String> L2CategoryList = getCategoryList();
		context.setL2CategoryList(L2CategoryList);
		return context.getL2CategoryList();
	}
	
	public List<String> L3CategoryList() throws InterruptedException {
		List<String> L3CategoryList = getCategoryList();
		context.setL3CategoryList(L3CategoryList);
		return context.getL3CategoryList();
	}
	
	public void verifyAllCategoriesAndPLP() throws InterruptedException {
		String categoryPageTitle;
		List<String> L1List=L1CategoryList();
		List<String> L2List;
		List<String> L3List;
		for(int l1=0;l1<L1List.size();l1++)
		{	logger.info("category level 1");
			navigateToNthLinkInList(L1List.get(l1));
			GlobalMobileHelper.setImplicitWaitTo(driver, 5);
			categoryPageTitle  = driver.findElement(Locators.ShopPage.categorytitle).getText();
			assertTrue("user should be on "+L1List.get(l1) +"page but user is on '"+ categoryPageTitle+"' category page",
					categoryPageTitle.trim().equalsIgnoreCase(L1List.get(l1).trim()));
			L2List=L2CategoryList();
			navigateToShopAllLink();
			plpPage.verifyPLPPageName(driver, L1List.get(l1));
			logger.info("verifying L2 categories on PLP");
			plpPage.verifyShopCategoryDisplayedonPLP(driver,L2List);
			logger.info("going back to shop by page");
			tapOnBackbtn(driver);
			
			for(int l2=0;l2<L2List.size();l2++) {
				logger.info("category level 2");
				navigateToNthLinkInList(L2List.get(l2));
				categoryPageTitle  = driver.findElement(Locators.ShopPage.categorytitle).getText();
				assertTrue("user should be on "+L2List.get(l2) +"page but user is on '"+ categoryPageTitle+"' category page",
						categoryPageTitle.trim().equalsIgnoreCase(L2List.get(l2).trim()));
				L3List=L3CategoryList();
				navigateToShopAllLink();
				plpPage.verifyPLPPageName(driver, L2List.get(l2));
				logger.info("verifying L3 categories on PLP");
				//plpPage.verifyShopCategoryDisplayedonPLP(driver,L3List);
				logger.info("going back to shop by page");
				tapOnBackbtn(driver);
				
				for(int l3=0;l3<L3List.size();l3++) {
					logger.info("category level 3");
					logger.info("verifying L3 categories on PLP");
					navigateToNthLinkInList(L3List.get(l3));
					GlobalMobileHelper.isElementDisplayed(Locators.PLPPage.PLPHeader);
					String plpTitle = driver.findElement(Locators.PLPPage.PLPHeader).getText();
					context.setCategoryTitleOnPLP(plpTitle);
					assertTrue("User should be on "+L3List.get(l3)+"PLP page but user is on "+plpTitle+ "page",
							L3List.get(l3).trim().equalsIgnoreCase(plpTitle.trim()));
					logger.info("going back to shop by page");
					tapOnBackbtn(driver);
					GlobalMobileHelper.setImplicitWaitTo(driver, 5);
			}
				tapOnBackbtn(driver);
				GlobalMobileHelper.setImplicitWaitTo(driver, 5);
		}
			tapOnBackbtn(driver);
			GlobalMobileHelper.setImplicitWaitTo(driver, 5);
	}
}


	public void navigateToShopAllLink() {
		assertTrue("shop all link is not present",GlobalMobileHelper.isElementDisplayed(Locators.ShopPage.shopAllLink));
		GlobalMobileHelper.tapOnElement(Locators.ShopPage.shopAllLink);
	}
	
	public String trimCategoryName(String categoryName) {
		String category=  (String) categoryName.substring(18, categoryName.indexOf("sub category"));
		return category;
	}
	
	public void tapOnBackbtn(AppiumDriver<MobileElement> driver) throws InterruptedException {
		GlobalMobileHelper.tapOnElement(Locators.ShopPage.categoryBackBtn);
		Thread.sleep(5000);
	}
}
