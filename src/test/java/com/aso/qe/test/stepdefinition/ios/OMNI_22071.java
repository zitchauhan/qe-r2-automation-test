package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.pageobject.ios.BottomNav;
import com.aso.qe.test.pageobject.ios.CartPage;
import com.aso.qe.test.pageobject.ios.EmptyCartPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class OMNI_22071 extends GlobalMobileHelper{
	private EmptyCartPage ecp;
	private BottomNav bnav;
	private int previousQuantity = -1;
	
	private void initializeObjects() throws MalformedURLException {
		initializeDriver();
		bnav = new BottomNav(driver);
		ecp = new EmptyCartPage(driver);
	}
	
	@Given("^Guest User is on empty cart page$")
	public void navigateToEmptyCartPage() throws Throwable {
		initializeObjects();
		bnav.tapOnCart();
	}

	@Then("^User sees Your Cart label$")
	public void isYourCartLabelDisplayed() throws Throwable {
	    assertTrue(ecp.isYourCartlabelDisplayed());
	}
	
	@And("^User sees Cart icon$")
	public void isEmptyCartIconDisplayed() throws Throwable {
	    assertTrue(ecp.isEmptyCartImageDisplayed());
	}
	
	@And("^User sees Cart Empty label$")
	public void isYourCartIsEmptyLabelDisplayed() throws Throwable {
	    assertTrue(ecp.isYourCartIsEmptyLabelDisplayed());
	}
	
	@And("^User sees Sigin text$")
	public void isUserSpecificMessageDisplayed() throws Throwable {
	    assertTrue(ecp.isUserSpecificMessageDisplayed());
	}
	
	@And("^User sees Log in Button$")
	public void isLogInButtonDisplayed() throws Throwable {
	    assertTrue(ecp.isLogInButtonDisplayed());
	}
	
	@And("^User sees Create and Account Button$")
	public void isCreateAnAccountButtonDisplayed() throws Throwable {
	    assertTrue(ecp.isCreateAnAccountButtonDisplayed());
	}
}
