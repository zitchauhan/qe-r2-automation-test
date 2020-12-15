package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
//import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
//import com.aso.qe.test.pageobject.And;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Search_Smoke_SD extends CommonActionHelper  {
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	//R1_SearchProduct_PO searchProductPO = PageFactory.initElements(getDriver(), R1_SearchProduct_PO.class);
	R1_PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), R1_PDP_PO.class);
	
	@Then("^User enter the \"([^\"]*)\" text for search$")
	public void enterSearchText(String SmSearchtext) throws Exception{
		globalElementHeader.entertheSearchData(SmSearchtext);
	
	}
	
	@Then("^User expands PRICE Filter and Select Option$")
	public void user_selects_PRICE_filter_Option1() throws Throwable {
	//	assertTrue(globalElementHeader.expandPriceFilterAndSelect());	
		globalElementHeader.expandPriceFilterAndSelect();

	}
	
	@Then("^User expands category Filter and Select option$")
	public void user_selects_Category_Filter_Option1() throws Throwable {
		//assertTrue(globalElementHeader.expandCategoryFilterAndSelect());	
		globalElementHeader.expandCategoryFilterAndSelect();
	}
	
	@Then("^User enters a text for search \"([^\"]*)\"$")
	public void enterSpecialCharacterSearchText(String searchText) throws Exception{
		globalElementHeader.enterSearchText(searchText);
	
	}
}
