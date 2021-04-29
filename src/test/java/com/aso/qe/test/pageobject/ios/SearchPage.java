package com.aso.qe.test.pageobject.ios;

import java.util.List;

import org.openqa.selenium.By;

import com.aso.qe.framework.common.PropertiesHelper;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.GlobalMobileHelper.Direction;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class SearchPage {
	
	private AppiumDriver<MobileElement> driver;
	public SearchPage(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	 }
	public void tapOnSearchKeyword(String keyword) 
	{   try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		GlobalMobileHelper.searchByKeyword(keyword);
		driver.findElement(Locators.SearchPage.goBtn).click();
	}
	
	public boolean validateSearchResults(String keyword) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MobileElement pname = driver.findElement(By.id("lbl_product_title"));
		return pname.getText().contains(PropertiesHelper.getInstance().getMobileTestDataProperty(keyword));
		}
	public boolean isSearchErrorDisplayed(String msg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MobileElement searchError = driver.findElement(Locators.SearchPage.searchErrormsg);
		return searchError.getText().contains(msg);
		}

	public void tapOnProduct() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MobileElement productListed = driver.findElement(Locators.PLPPage.productTitle);
		GlobalMobileHelper.tapOnElement(productListed);
	}
	public void tapOnCancelBtn() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GlobalMobileHelper.tapOnElement(Locators.SearchPage.cancelBtn);
	}
	public boolean isOutOfStockToggleDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PLPPage.toggleOOS);
	}
	public boolean isOosTogleDisabled() {
		MobileElement oOSToggle = driver.findElement(Locators.PLPPage.toggleOOS);
		boolean stat = oOSToggle.isEnabled();
		if(stat==true) {
			return false;
		}else {
		return true;
		}
	}
	public void oosToggleEnable() {
		GlobalMobileHelper.tapOnElement(Locators.PLPPage.toggleOOS);

	}
	public void navigateBackToSearchPage() {
		GlobalMobileHelper.tapOnElement(Locators.SearchPage.navigateBack);
		
	}
	public boolean isRecentSearchesTitleDisplayed(String searchSuggestionTitle) {
		if(searchSuggestionTitle.contains("Recent Searches")) {
		return GlobalMobileHelper.isElementDisplayed(Locators.SearchPage.recentSearchesTitle);
		}else {
			return GlobalMobileHelper.isElementDisplayed(Locators.SearchPage.popularSearchesTitle);
		}
	}
	public boolean isAllRecentSearchesDisplayed(String searchItem1, String searchItem2, String searchItem3, String searchItem4, String searchItem5) {
		String [] searchItem = {searchItem1,searchItem2,searchItem3,searchItem4,searchItem5};
		boolean flag=false;
		List<MobileElement> lsRecentSearches = driver.findElements(By.id("btn_category"));
		for(int i =0; i<=lsRecentSearches.size(); i++) {
			if(lsRecentSearches.get(i).getText().contains(searchItem[i])) {
				flag = true;
			}else {
				flag = false;
			}
			
		
		}
		return flag;
	}
	public boolean isTotalRecentSeacrhesDisplayed(int recentSearchItemCount) {
		List<MobileElement> lsRecentSearches = driver.findElements(By.id("btn_category"));
		int count = lsRecentSearches.size();
		if(count==recentSearchItemCount) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isVisibleRecentSearchesDisplayed(int recentSearchElipseCount, int characterCount) {
		List<MobileElement> lsRecentSearches = driver.findElements(By.id("btn_category"));
		int count =0;
		for(int i=1; i<=recentSearchElipseCount;i++) {
			String s =lsRecentSearches.get(i).getText();
			count = count + s.length();
		}
		if(count==characterCount) {
			return true;
		}else {
			return false;
		}
		
	}
	public void tapOnLastRescentSearchItem() {
		List<MobileElement> lsRecentSearches = driver.findElements(By.id("btn_category"));
		for(int i =1;i<=lsRecentSearches.size();i++) {
			
				try {
					lsRecentSearches.get(lsRecentSearches.size()).click();
				} catch (Exception e) {
					GlobalMobileHelper.swipeScreen(Direction.LEFT);
				}
			
		}
	}
	public void tapOnClearAll() {
		GlobalMobileHelper.tapOnElement(Locators.SearchPage.clearAll);
		
	}
	public boolean isRecentSearchesDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.SearchPage.recentSearches);
		
	}
	public boolean isAllPopularSearchesDisplayed(String searchItem1, String searchItem2, String searchItem3,
			String searchItem4, String searchItem5) {
		String [] searchItem = {searchItem1,searchItem2,searchItem3,searchItem4,searchItem5};
		boolean flag=false;
		List<MobileElement> lsPopularSearches = driver.findElements(Locators.SearchPage.popularsearchesItem);
		for(int i =0; i<=lsPopularSearches.size(); i++) {
			if(lsPopularSearches.get(i).getText().contains(searchItem[i])) {
				flag = true;
			}else {
				flag = false;
			}
			
		
		}
		return flag;
	}
	public boolean isTotalPopularSeacrhesDisplayed(int popularSearchItemCount) {
		List<MobileElement> lsPopularSearches = driver.findElements(By.id("btn_category"));
		int count = lsPopularSearches.size();
		if(count==popularSearchItemCount) {
			return true;
		}else {
			return false;
		}
		
	}
	public boolean isVisiblePopularSearchesDisplayed(int popularSearchElipseCount, int characterCount) {
		
		List<MobileElement> lsPopularSearches = driver.findElements(By.id("btn_category"));
		int count =0;
		for(int i=1; i<=popularSearchElipseCount;i++) {
			String s =lsPopularSearches.get(i).getText();
			count = count + s.length();
		}
		if(count==characterCount) {
			return true;
		}else {
			return false;
		}
		
	}
	public void tapOnLastPopularSearchItem() {
		List<MobileElement> lsPopularSearches = driver.findElements(By.id("btn_category"));
		for(int i =1;i<=lsPopularSearches.size();i++) {
			
				try {
					lsPopularSearches.get(lsPopularSearches.size()).click();
				} catch (Exception e) {
					GlobalMobileHelper.swipeScreen(Direction.LEFT);
				}
			
		}
	}
	public boolean isPopularSearchesDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.SearchPage.popularsearchesItem);
	}
		
	}



	


