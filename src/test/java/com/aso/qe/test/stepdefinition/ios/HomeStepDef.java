package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.HomePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;

public class HomeStepDef extends GlobalMobileHelper{
	
	HomePage homePage = new HomePage(driver);
	
	@Then("^User sees the homepage$")
	public void userIsOnHomePage() {
		assertTrue(homePage.isOnHomePage());
	}
	
	@When("^User navigates to pdp$")
	public void tapOnGoToPDPButton() {
		homePage.tapOnProduct();
	}
}