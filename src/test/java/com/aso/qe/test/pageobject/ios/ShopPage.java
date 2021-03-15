package com.aso.qe.test.pageobject.ios;

import static org.junit.Assert.assertTrue;
import java.util.List;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ShopPage {
	
	@iOSXCUITFindBy(id="rd_home_delivery")
	public MobileElement homeDeliveryRadio;
	
	private AppiumDriver<MobileElement> driver;
	public ShopPage(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	}
	
	public boolean isShopPageDisplayed() {
		MobileElement shopPageHeader = driver.findElement(Locators.ShopPage.shopPageTitle);
		return shopPageHeader.isDisplayed();
	}
	
	public void isCategoriesDisplayed() throws InterruptedException {
		//driver.findElementsByAccessibilityId("lbl_category_list_item");
		Thread.sleep(5000);
		List<MobileElement> shopCategoriesList = (List<MobileElement>) driver.findElements(Locators.ShopPage.categoriesList);
		assertTrue("categories are not present !", shopCategoriesList.size()>0);
		}
	
		/*
		 * public void verifyAllCategories() throws InterruptedException{
		 * Thread.sleep(5000); List<MobileElement> categoriesList =
		 * (List<MobileElement>) driver.findElements(Locators.ShopPage.categoriesList);
		 * 
		 * for (int i=0;i<categoriesList.size();i++) {
		 * 
		 * MobileElement element = categoriesList.get(i);
		 * System.out.println("category--> "+element.getText()); Thread.sleep(5000);
		 * GlobalMobileHelper.tapOnElement(element); Thread.sleep(5000);
		 * verifyAllCategories(); } Thread.sleep(3000); System.out.print("going back");
		 * GlobalMobileHelper.tapOnElement(driver.findElement(Locators.ShopPage.
		 * categoryBackBtn)); }
		 */
	
	public void navigateToNthLinkInList(String category) throws InterruptedException{
		Thread.sleep(5000);
		List<MobileElement> categoriesList = (List<MobileElement>) driver.findElements(Locators.ShopPage.categoriesList);			
		System.out.println("Navigating to "+category);
		for(int i=0;i<categoriesList.size();i++)
		{
			if(categoriesList.get(i).getText().toLowerCase().contains(category.toLowerCase())){
				GlobalMobileHelper.tapOnElement(categoriesList.get(i));
				break;}
				}
		}
	
	public void verifyL1CategoryLevel() throws InterruptedException{
		Thread.sleep(5000);
		List<MobileElement> categoriesList = (List<MobileElement>) driver.findElements(Locators.ShopPage.categoriesList);
		assertTrue("L1 categories are not present !", categoriesList.size()>0);
		for (int i=0;i<categoriesList.size();i++) {			
			MobileElement element = categoriesList.get(i);
			String elementName = element.getText();
			System.out.println(" category--> "+elementName);
			Thread.sleep(8000);
			GlobalMobileHelper.tapOnElement(element);
			Thread.sleep(5000);
			isCategoriesDisplayed();
			String categorytitle= driver.findElement(Locators.ShopPage.categorytitle).getText();
			assertTrue("User is not landed on correct category page",elementName.contains(categorytitle));
			System.out.println("going back");
			//GlobalMobileHelper.tapOnElement(driver.findElement(Locators.ShopPage.categoryBackBtn)); 
			Thread.sleep(3000);
		} 
		
	}
	public void verifyL2CategoryLevel() throws InterruptedException{
		Thread.sleep(5000);
		List<MobileElement> categoriesList = (List<MobileElement>) driver.findElements(Locators.ShopPage.categoriesList);
		assertTrue("L2 categories are not present !", categoriesList.size()>0);
		String categorytitle= driver.findElement(Locators.ShopPage.categorytitle).getText();
		assertTrue("shop all link is not present for "+categorytitle,GlobalMobileHelper.isElementDisplayed(Locators.ShopPage.shopAllLink));
		for (int i=0;i<categoriesList.size();i++) {
			
			MobileElement element = categoriesList.get(i);
			String elementName = element.getText();
			System.out.println(" category--> "+elementName);
			Thread.sleep(8000);
			GlobalMobileHelper.tapOnElement(element);
			Thread.sleep(5000);
			isCategoriesDisplayed();
			categorytitle= driver.findElement(Locators.ShopPage.categorytitle).getText();
			assertTrue("User is not landed on correct category page",elementName.contains(categorytitle));
			System.out.println("going back");
			GlobalMobileHelper.tapOnElement(driver.findElement(Locators.ShopPage.categoryBackBtn)); 
			Thread.sleep(3000);
		} 
		
	}
	
	public void verifyL3CategoryLevel() throws InterruptedException{
		Thread.sleep(5000);
		List<MobileElement> categoriesList = (List<MobileElement>) driver.findElements(Locators.ShopPage.categoriesList);
		assertTrue("L3 categories are not present !", categoriesList.size()>0);
		String categorytitle= driver.findElement(Locators.ShopPage.categorytitle).getText();
		assertTrue("shop all link is not present for "+categorytitle,GlobalMobileHelper.isElementDisplayed(Locators.ShopPage.shopAllLink));
		for (int i=0;i<categoriesList.size();i++) {
			
			MobileElement element = categoriesList.get(i);
			String elementName = element.getText();
			System.out.println(" category--> "+elementName);
			Thread.sleep(8000);
			GlobalMobileHelper.tapOnElement(element);
			Thread.sleep(5000);
			//verify PLP page is displayed, need to write the code as currently plp page is not available
			System.out.println("going back");
			GlobalMobileHelper.tapOnElement(driver.findElement(Locators.ShopPage.categoryBackBtn)); 
			Thread.sleep(3000);
		} 		
	}
	
	public void verifyCategoryTitle(String category) throws InterruptedException{
		Thread.sleep(5000);
		List<MobileElement> categoriesList = (List<MobileElement>) driver.findElements(Locators.ShopPage.categoriesList);			
		System.out.println("Navigating to "+category);
		for(int i=0;i<categoriesList.size();i++)
		{
			String categoryPageTitle  = driver.findElement(Locators.ShopPage.categorytitle).getText();
			assertTrue("user should be on "+category +"page but user is on "+ categoryPageTitle+" category page",categoryPageTitle.toLowerCase().contains(category.toLowerCase()));
				}
		}
	public void navigateToNthLinkInList(int n) throws InterruptedException{
		Thread.sleep(5000);
		List<MobileElement> categoriesList = (List<MobileElement>) driver.findElements(Locators.ShopPage.categoriesList);			
		System.out.println("Navigating to "+categoriesList.get(n-1).getText());
		GlobalMobileHelper.tapOnElement(categoriesList.get(n-1));		
	}
}
