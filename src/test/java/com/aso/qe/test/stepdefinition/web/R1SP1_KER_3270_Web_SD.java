package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.SearchProductPO;

import cucumber.api.java.en.Then;

public class R1SP1_KER_3270_Web_SD extends CommonActionHelper{
	GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	public SearchProductPO searchProductPO = PageFactory.initElements(driver, SearchProductPO.class);
	String categoryName =  "";
	
	@Then("^User enter the search upper keyword \"(.*?)\"$")
	public void user_enter_the_search_upper_keyword(String arg1) throws Throwable {
		globalElementHeader.entertheSearchData("Shirt vs shirt");
	}
	
	@Then("^User is navigated to pdp page and verifies search result visible$")
	public void user_is_navigated_to_pdp_page_and_verifies_search_result_visible() throws Throwable {
		waitForElement(globalElementHeader.searchTitle);
		assertTrue(isDisplayed(globalElementHeader.searchTitle)); 
	}
	
	@Then("^User enter the specific search keyword \"(.*?)\"$")
	public void user_enter_the_specific_search_keyword(String arg1) throws Throwable {
		globalElementHeader.entertheSearchData("gloves");
	}
	
	@Then("^navigated to pdp page$")
	public void navigated_to_pdp_page() throws Throwable {
	    String actualUrl=getCurrentPageURL();
	    assertTrue(actualUrl.contains(categoryName));
	}

	@Then("^User enter the instead of search keyword \"(.*?)\"$")
	public void user_enter_the_instead_of_search_keyword(String arg1) throws Throwable {
		globalElementHeader.entertheSearchData("sketchers");
	}
	
	@Then("^User verifes the last breadcrumb in the series of keyword$")
	public void user_verifes_the_last_breadcrumb_in_the_series_of_keyword() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			waitForElement(globalElementHeader.mobileBreadcrumb);
			assertTrue(isDisplayed(globalElementHeader.mobileBreadcrumb));
		}
		else {
			waitForElement(globalElementHeader.specificSearchTitle);
			assertTrue(isDisplayed(globalElementHeader.specificSearchTitle));
			
		}
	}
	
	
	@Then("^User enter the search term in search box \"(.*?)\"$")
	public void user_enter_the_search_term_in_search_box(String arg1) throws Throwable {
		globalElementHeader.entertheSearchData("water slide");
	}

	@Then("^User verifes the last breadcrumb keyword$")
	public void user_verifes_the_last_breadcrumb_keyword() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			waitForElement(globalElementHeader.mobileBreadcrumb);
			assertTrue(isDisplayed(globalElementHeader.mobileBreadcrumb));
		}
		else {
		waitForElement(globalElementHeader.searchTerm);
		assertTrue(isDisplayed(globalElementHeader.searchTerm));
		}
	}
	
	@Then("^User enter the synonyms search keyword \"(.*?)\"$")
	public void user_enter_the_synonyms_search_keyword(String arg1) throws Throwable {
		globalElementHeader.entertheSearchData("frisbee");
	}
	
	@Then("^User is navigated to pdp page and verifies search result like disc$")
	public void user_is_navigated_to_pdp_page_and_verifies_search_result_like_disc() throws Throwable {
		waitForElement(globalElementHeader.txtSearchFrisbeeProduct);
		assertTrue(isDisplayed(globalElementHeader.txtSearchFrisbeeProduct));
	}


}
