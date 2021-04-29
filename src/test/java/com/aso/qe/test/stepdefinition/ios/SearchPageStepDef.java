package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.PDPPage;
import com.aso.qe.test.pageobject.ios.SearchPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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
	@Then("^user clicks on cancel button$")
	public void tapOnCancelBtn() {
		searchPage.tapOnCancelBtn();
	}
	@And("^User sees the Hide Out Of Stock Section$")
	public void isHideOutOfStockToggleDisplayed() {
		assertTrue(searchPage.isOutOfStockToggleDisplayed());
	}
	@Then("^User sees the OOS toggle is deactivated$")
	public void isOosToggleDeactivated() {
		assertTrue(searchPage.isOosTogleDisabled());
	}
	@When("^User Enabled the OOS toggle$")
	public void enableOosTogle() {
		searchPage.oosToggleEnable();
	}
	
	
	@Then("^user see \"([^\"]*)\" on search result page$")
	public void user_see_on_search_result_page(String elementname) throws Throwable {
		assertTrue(searchPage.VarifyElementPresenseOnSearchPage(elementname)); 
	}
	
	
	@Then("^i choose to click on \"([^\"]*)\" on search result page$")
	public void i_choose_to_click_on_on_search_result_page(String elementname) throws Throwable {
		searchPage.tapOnElementOnSearchPage(elementname);
	}

}
