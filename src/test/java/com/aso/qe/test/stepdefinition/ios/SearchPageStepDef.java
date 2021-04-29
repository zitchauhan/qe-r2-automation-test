package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
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
	@Then("^User sees null search result  as \"([^\"]*)\"$")
	public void user_sees_null_search_result_as(String arg1) throws Throwable {
	    assertTrue(searchPage.isNullSearchPaageDisplayed(arg1));
	}
	
	@Then("^User swipe down on the screen$")
	public void user_swipe_down_on_the_screen() throws Throwable {
		searchPage.swipeDown();
	}




    

@Then("^User sees search result count in Search result page$")
public void user_sees_search_result_count_in_Search_result_page() throws Throwable {
	 assertTrue(searchPage.isSearchCountDisplayed());
     
}

@Then("^User sees sort option  in Search result page$")
public void user_sees_sort_option_in_Search_result_page() throws Throwable {
	assertTrue(searchPage.isSortOptionDisplayed());
    
}

@Then("^User sees fiter option in Search result page$")
public void user_sees_fiter_option_in_Search_result_page() throws Throwable {
   assertTrue(searchPage.isFilterOptionDisplayed());
}





	


}

