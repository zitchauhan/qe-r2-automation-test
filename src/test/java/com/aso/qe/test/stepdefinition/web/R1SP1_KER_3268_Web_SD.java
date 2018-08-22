package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.SearchProductPO;

import cucumber.api.java.en.Then;

public class R1SP1_KER_3268_Web_SD extends CommonActionHelper {

	GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	public SearchProductPO searchProductPO = PageFactory.initElements(driver, SearchProductPO.class);

	@Then("^User enter the boolean search \"(.*?)\"$")
	public void User_enter_the_SKU_search(String str) throws Throwable {
		globalElementHeader.entertheSearchData(str);

	}
	@Then("^user verifies the title of search results$")
	public void user_verifies_the_entered_SKU_id() throws Throwable {
		waitForElement(globalElementHeader.characterSearchLimitTitle);
		assertTrue(isDisplayed(globalElementHeader.characterSearchLimitTitle));
	}

	
	


}
