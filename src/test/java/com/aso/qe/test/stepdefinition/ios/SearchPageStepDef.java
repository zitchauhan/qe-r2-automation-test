package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.SearchPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import junit.framework.Assert;

public class SearchPageStepDef extends GlobalMobileHelper{
	
	SearchPage searchPage = new SearchPage(driver);
	
	@And("^User search for the \"(.*?)\"$")
	public void searchEdit(String searchKeyword) {
	searchPage.tapOnSearchKeyword(searchKeyword);
	}
	
	
	@And("^User sees all products related to search keyword$")
	public void validateSearchResult() {
	assertTrue(searchPage.validateSearchResults("SearchKeyword"));
	}
	@And("^User observe message \"(.*?)\"$")
	public void validatewrongSearch(String msg) {
	
	assertTrue(searchPage.isSearchErrorDisplayed(msg));
	}
	@And("^user click on Product$")
	public void tapOnProduct() {
		searchPage.tapOnProduct();
	}
	
	


}
