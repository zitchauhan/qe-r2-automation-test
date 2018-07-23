package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.SIT_AccountSummaryPageObject;


import cucumber.api.java.en.Then;

public class SD_SIT_AccountSummaryPage extends CommonActionHelper{
	
	SIT_AccountSummaryPageObject accountsummary= PageFactory.initElements(driver, SIT_AccountSummaryPageObject.class);
	GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	
	
	
	@Then("^user click on Account Summary link$")
	public void user_click_on_Account_Summary_link() throws Throwable {
		
		//globalElementHeader.clickOnAccountSummaryFromMyAccount();
		clickOnButton(accountsummary.lnkAccountSummary);
	    
	}

	@Then("^user should verify the Account Summary page$")
	public void user_should_verify_the_Account_Summary_page() throws Throwable {
		assertTrue(isDisplayed(accountsummary.txtcantfindorder));
		assertTrue(isDisplayed(accountsummary.labelordernumber));
		assertTrue(isDisplayed(accountsummary.labelshippingzip));
	}

}
