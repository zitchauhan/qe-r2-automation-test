package com.aso.qe.test.stepdefinition.web;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.SIT_GuestCheckoutPageObject;

import cucumber.api.java.en.Then;

public class SD_SIT_GuestCheckoutPage extends CommonActionHelper{	
	
	SIT_GuestCheckoutPageObject guestpo= PageFactory.initElements(driver, SIT_GuestCheckoutPageObject.class);
	
	@Then("^user should verify the Guest checkout Page$")
	public void user_should_verify_the_Guest_checkout_Page() throws Throwable {
		assertTrue(isDisplayed(guestpo.btncheckoutguest));
		assertTrue(isDisplayed(guestpo.btnpaypalguest));
		assertTrue(isDisplayed(guestpo.btnsigninguest));
	    

	}
	
	
	@Then("^user click on Checkout as Guest button$")
	public void user_click_on_Checkout_as_Guest_button() throws Throwable {
		assertTrue(clickOnButton(guestpo.btncheckoutguest));
	    
	}
	
	
}
