package com.aso.qe.test.pageobject.ios;

import static com.aso.qe.test.common.GlobalMobileHelper.setText;

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


	
	public boolean isFilterOptionDisplayed() {
	   return GlobalMobileHelper.isElementDisplayed(Locators.SearchPage.filterOption);	}


	public boolean VarifyElementPresenseOnSearchPage(String elementname) {
if(elementname.equalsIgnoreCase("showing result for label")) {
			
			return GlobalMobileHelper.isElementDisplayed(Locators.SearchPage.showingresultforlabel);

			
		}else if(elementname.equalsIgnoreCase("related keywords")){
			
			return GlobalMobileHelper.isElementDisplayed(Locators.SearchPage.showingresultforlabelvalue);
			
		}else if(elementname.equalsIgnoreCase("search insteed of label")){
			
			return GlobalMobileHelper.isElementDisplayed(Locators.SearchPage.searchinsteedof);
		}else if(elementname.equalsIgnoreCase("searched keyword button")){
			
			return GlobalMobileHelper.isElementDisplayed(Locators.SearchPage.searchinsteedofvalue);
				
		}else {
			
			throw new UnsupportedOperationException("Given Elelent not founded on search page");

		}
	}
	public void tapOnElementOnSearchPage(String elementname) {
     if(elementname.equalsIgnoreCase("searched keyword button")) {
			
			GlobalMobileHelper.tapOnElement(Locators.SearchPage.searchinsteedofvalue);


		}else {
			
			throw new UnsupportedOperationException("Given button type not found on search page");
 
		}
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
		System.out.println(lsRecentSearches.size());
		for(int i =0; i<=lsRecentSearches.size()-1; i++) {
			if(i<=4) {
			if(lsRecentSearches.get(i).getText().contains(searchItem[i])) {
				flag = true;
			}else {
				flag = false;
			}
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
			
				
					GlobalMobileHelper.swipeTillElementDisplayed(Direction.LEFT, By.id("btn_category"));
				
			
		}
	}
	public void tapOnClearAll() {
		GlobalMobileHelper.tapOnElement(Locators.SearchPage.clearAll);
		
	}
	public boolean isRecentSearchesDisplayed() {
	String s =	driver.findElement(Locators.SearchPage.recentSearches).getText();
	if(s.contains("Recent Searches")) {
		return true;
	}else {
		return false;
	}
		
		
	}
	public boolean isAllPopularSearchesDisplayed(String searchItem1, String searchItem2, String searchItem3,
			String searchItem4, String searchItem5) {
		String [] searchItem = {searchItem1,searchItem2,searchItem3,searchItem4,searchItem5};
		boolean flag=false;
		List<MobileElement> lsPopularSearches = driver.findElements(By.id("btn_category"));
		for(int i =0; i<=lsPopularSearches.size()-1; i++) {
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
		if(count<=characterCount) {
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
	public boolean isElipsesDisplayed(int characterCount) {
		List<MobileElement> lsSearches = driver.findElements(By.id("btn_category"));
		boolean flag = false;
        for(MobileElement searchTerms: lsSearches ) 
        {
        	int count=0;
        	String searchTermValue =searchTerms.getText();
        	for(int i =0; i<=searchTermValue.length()-1;i++) 
        	{
        		 if(searchTermValue.charAt(i) != ' ') 
        		 {
        			 count++;
        		 }
        	} 
        	System.out.println(searchTermValue);
        	System.out.println(count);
        	if(count>characterCount) {
        		String s= "";
        		for(int i=searchTermValue.length()-2; i>=searchTermValue.length(); i++) {
        			 s = s + searchTermValue.charAt(i); 
        	    }
        		if(s.contains("***")) {
        			flag = true;
        		}else {
        			flag= false;
        		}
        	}else {
        		flag= true;
        	}
        }
		return flag;
		
	}
	
	
	public boolean Varifyuserisonnoresultpage (String pagename) {
if(pagename.equalsIgnoreCase("see No product found")) {
			
			return GlobalMobileHelper.isElementDisplayed(Locators.SearchPage.noresultlabel);
	}else {
		
		throw new UnsupportedOperationException("User is not on result page ");}
	}
		

	

	public boolean isSortOptionDisplayed() {
		   return GlobalMobileHelper.isElementDisplayed(Locators.SearchPage.sortOption);	
		}
	
	public boolean isSearchCountDisplayed() {
		   return GlobalMobileHelper.isElementDisplayed(Locators.SearchPage.searchCount);	
		}
	
	public String getSearchCount() {
		isSearchCountDisplayed();
		return GlobalMobileHelper.getElementText(Locators.SearchPage.searchCount);
	}
	

	public boolean isNullSearchPaageDisplayed(String msg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MobileElement searchError = driver.findElement(Locators.SearchPage.nullSearchPage);
		return searchError.getText().contains(msg);
		}



	

	
	  public void swipeDown() {
		  GlobalMobileHelper.swipeScreen(Direction.DOWN, 5);
	  }
	
		public void Searchforsku(String searchkeyword) {
	 		String keywordValue = PropertiesHelper.getInstance().getMobileTestDataProperty(searchkeyword);
	 		String element = null;
	 		if(searchkeyword.contains("SKU")){
	 			setText(Locators.HomePage.searchbar, keywordValue );
	 			try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	 					/////////,Locators.SearchPage.goBtn)
	 			//GlobalMobileHelper.tapOnElement(Locators.SearchPage.goBtn);
	 			try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	 		}else  if(searchkeyword.contains("OOSStore")){
	 			setText(Locators.storePickup.searchstoretextbox, keywordValue );
	 			try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	 			GlobalMobileHelper.tapOnElement(Locators.storePickup.Store1);
	 			try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	 			
	 		}else {
	 			
				throw new UnsupportedOperationException("Given Element type not defined on Search page ");
		
	}
	}
		public void ClickonSearcheditem(String searchkeyword) {
			
				if(searchkeyword.equalsIgnoreCase("Searcheditem")) {
							
					GlobalMobileHelper.tapOnElement(Locators.PLPPage.productTitle);
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if(searchkeyword.equalsIgnoreCase("promotionaltooltip")) {
					
			GlobalMobileHelper.tapOnElement(Locators.PLPPage.promotionaltooltip);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
				}else {
		 			
					throw new UnsupportedOperationException("Given Element type not defined on Search page ");
		}
		}

		
		public boolean verifyelementonsearchpage(String elementname) {
			if(elementname.equalsIgnoreCase("promotionalmessage")) {
				
				return GlobalMobileHelper.isElementDisplayed(Locators.PLPPage.promotionalmessage);
		}else {
 			
			throw new UnsupportedOperationException("Given Element type not defined on Search page ");
}
		
			
		}
		}


	



