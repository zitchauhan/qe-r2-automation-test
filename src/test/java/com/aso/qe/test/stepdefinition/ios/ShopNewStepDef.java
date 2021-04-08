package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.pageobject.ios.ShopNewPage;

import cucumber.api.java.en.Then;

public class ShopNewStepDef extends GlobalMobileHelper{
	ShopNewPage shopNewPage = new ShopNewPage(driver);
	
	@Then("^user sees shop new page$")
	public void isShopNewPageDisplayed() {
		
	assertTrue(shopNewPage.isShopNewPageDisplayed());
	}
	
	@Then("^user navigate back to Homepage$")
	public void tapOnBackBtn() {
		shopNewPage.tapOnBackBtn();
	}

}
