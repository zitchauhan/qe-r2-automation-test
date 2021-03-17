package com.aso.qe.test.stepdefinition.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.pageobject.ios.PLPPage;

import cucumber.api.java.en.Then;

public class PLPStefDef extends GlobalMobileHelper{

	PLPPage plpPage = new PLPPage(driver);
	
	@Then("^User sees \"([^\"]*)\" PLP page$")
	public void user_sees_PLP_page(String categoryName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		plpPage.verifyPLPPageName(categoryName);
	}
}
