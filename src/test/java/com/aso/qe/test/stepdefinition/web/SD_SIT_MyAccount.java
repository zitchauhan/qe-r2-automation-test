package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.SIT_MyAccountPO;

import cucumber.api.java.en.Then;

public class SD_SIT_MyAccount extends CommonActionHelper {
	
	
	
	public SIT_MyAccountPO myaccountpo= PageFactory.initElements(driver, SIT_MyAccountPO.class);
	
	@Then("^user should verify MyAccount page$")
	public void user_should_verify_MyAccount_page() throws Exception{
		
		assertTrue(clickOnButton(myaccountpo.lnkmyaccount));
		assertTrue(isDisplayed(myaccountpo.txtmyaccount));
		assertTrue(isDisplayed(myaccountpo.txtwelcome));
		myaccountpo.validateAccountSummaryLinkPresence();
		myaccountpo.validatePersonalInformationLinkPresence();
		myaccountpo.validateAddressBookLinkPresence();
		myaccountpo.validateWishListLinkPresence();
		
			
	}

}
