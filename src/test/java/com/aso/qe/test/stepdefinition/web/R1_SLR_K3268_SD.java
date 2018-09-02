package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;

import cucumber.api.java.en.Then;

public class R1_SLR_K3268_SD extends CommonActionHelper {

	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	public R1_SearchProduct_PO searchProductPO = PageFactory.initElements(driver, R1_SearchProduct_PO.class);

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
