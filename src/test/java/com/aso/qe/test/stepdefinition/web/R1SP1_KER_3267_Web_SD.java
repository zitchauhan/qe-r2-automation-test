package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.SearchProductPO;

import cucumber.api.java.en.Then;

public class R1SP1_KER_3267_Web_SD extends CommonActionHelper {

	GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	public SearchProductPO searchProductPO = PageFactory.initElements(driver, SearchProductPO.class);

	@Then("^User enter the SKU search \"(.*?)\"$")
	public void User_enter_the_SKU_search(String str) throws Throwable {
		globalElementHeader.entertheSearchData("111269310");

	}

	@Then("^User enter the invalid SKU search \"(.*?)\"$")
	public void User_enter_the_invalid_SKU_search(String str) throws Throwable {
		globalElementHeader.entertheSearchData("1111111111");

	}

	@Then("^user verifies the entered SKU id$")
	public void user_verifies_the_entered_SKU_id() throws Throwable {
		waitForElement(globalElementHeader.skuID);
		assertTrue(isDisplayed(globalElementHeader.skuID));
	}

	@Then("^user verifies the error null search result page$")
	public void user_verifies_the_error_null_search_result_page() throws Throwable {
		waitForElement(globalElementHeader.txtPleaseTryAnotherSearch);
		assertTrue(isDisplayed(globalElementHeader.txtPleaseTryAnotherSearch));
	}
}
