package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertFalse;
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

public class SearchPageStepDef extends GlobalMobileHelper {

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

	@Then("^User navigate Back to Search Page$")
	public void user_navigate_Back_to_Search_Page() {
		searchPage.navigateBackToSearchPage();
	}

	@Then("^User Sees the \"([^\"]*)\" title$")
	public void user_Sees_the_title(String searchsuggestionTitle) throws Throwable {
		searchPage.isRecentSearchesTitleDisplayed(searchsuggestionTitle);
	}

	@Then("^User sees the Recent Searches \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
	public void user_sees_the_Recent_Searches(String searchItem1, String searchItem2, String searchItem3,
			String searchItem4, String searchItem5) {
		assertTrue(searchPage.isAllRecentSearchesDisplayed(searchItem1, searchItem2, searchItem3, searchItem4,
				searchItem5));
	}

	@Then("^User count the total Recent Searches is (\\d+)$")
	public void user_count_the_total_Recent_Searches_is(int recentSearchItemCount) {
		assertTrue(searchPage.isTotalRecentSeacrhesDisplayed(recentSearchItemCount));
	}

	@Then("^User validate the number of visible Recent Searches is (\\d+) and total no of characters are (\\d+)$")
	public void user_validate_the_number_of_visible_Recent_Searches_is_and_total_no_of_characters_are(
			int recentSearchElipseCount, int characterCount) throws Throwable {
		searchPage.isVisibleRecentSearchesDisplayed(recentSearchElipseCount, characterCount);
	}

	@Then("^User scroll to last Recent search and click on it$")
	public void user_scroll_to_last_Recent_search_and_click_on_it() throws Throwable {
		searchPage.tapOnLastRescentSearchItem();
	}

	@Then("^User CLick on clear all$")
	public void user_CLick_on_clear_all() throws Throwable {
		searchPage.tapOnClearAll();
	}

	@Then("^User sees all Recent Searches got clear$")
	public void user_sees_all_Recent_Searches_got_clear() throws Throwable {
		assertFalse(searchPage.isRecentSearchesDisplayed());

	}

	@Then("^User sees the Popular Searches \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
	public void user_sees_the_Popular_Searches(String searchItem1, String searchItem2, String searchItem3,
			String searchItem4, String searchItem5) {
		assertTrue(searchPage.isAllPopularSearchesDisplayed(searchItem1, searchItem2, searchItem3, searchItem4,
				searchItem5));
	}

	
	@Then("^user see \"([^\"]*)\" on search result page$")
	public void user_see_on_search_result_page(String elementname) throws Throwable {
		assertTrue(searchPage.VarifyElementPresenseOnSearchPage(elementname)); 
	}
	

	@Then("^User count the total Popular Searches is (\\d+)$")
	public void user_count_the_total_Popular_Searches_is(int popularSearchItemCount) {
		assertTrue(searchPage.isTotalPopularSeacrhesDisplayed(popularSearchItemCount));
	}

	@Then("^User validate the number of visible Popular Searches is (\\d+) and total no of characters are (\\d+)$")
	public void user_validate_the_number_of_visible_Popular_Searches_is_and_total_no_of_characters_are(
			int popularSearchElipseCount, int characterCount) throws Throwable {
		searchPage.isVisiblePopularSearchesDisplayed(popularSearchElipseCount, characterCount);
	}

	@Then("^User scroll to last Popular search and click on it$")
	public void user_scroll_to_last_Popular_search_and_click_on_it() throws Throwable {
		searchPage.tapOnLastPopularSearchItem();
	}

	@Then("^User sees all Popular Searches got clear$")
	public void user_sees_all_Popular_Searches_got_clear() throws Throwable {
		assertFalse(searchPage.isPopularSearchesDisplayed());
	}



	@Then("^User sees the elipses when Character are more than (\\d+)$")
	public void user_sees_the_elipses_when_Character_are_more_than(int characterCount ) throws Throwable {
	   assertTrue( searchPage.isElipsesDisplayed(characterCount));
	}


	

	
	@Then("^i choose to click on \"([^\"]*)\" on search result page$")
	public void i_choose_to_click_on_on_search_result_page(String elementname) throws Throwable {
		searchPage.tapOnElementOnSearchPage(elementname);
	}
	
	@Then("^user \"([^\"]*)\" page$")
	public void user_page (String pagename) throws Throwable {
		assertTrue(searchPage.Varifyuserisonnoresultpage(pagename)); 
	}

	@And("^i choose to enter \"([^\"]*)\" In Search box$")
	public void Searchforsku(String searchkeyword)  {
		searchPage.Searchforsku(searchkeyword);
	}
	@Then("^i choose to click on \"([^\"]*)\" on Search page$")
		public void ClickonSearcheditem(String searchkeyword)  {
			searchPage.ClickonSearcheditem(searchkeyword);
	}
	
	@Then("^i choose to See \"([^\"]*)\" on Search page$")
	public void verifyelementonsearchpage(String Elementname) throws Throwable  {
		assertTrue(searchPage.verifyelementonsearchpage(Elementname));
}
}

