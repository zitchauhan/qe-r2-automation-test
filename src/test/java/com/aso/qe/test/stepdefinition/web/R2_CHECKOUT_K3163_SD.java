package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CHECKOUT_K3163_SD extends CommonActionHelper {
	
	R2_CheckOut_PO r2CheckoutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	
	@Then("^verify error message is dispayed$")
	public void verify_error_message_is_dispayed() throws Throwable {
	    assertTrue(isDisplayed(r2CheckoutPo.msgZipCode));
	}
	
	
	@When("^user clicks Modify Address link$")
	public void user_clicks_Modify_Address_link() throws Throwable {
		assertTrue(clickOnButton(r2CheckoutPo.lnkModifyAddress));
	}

	

}
