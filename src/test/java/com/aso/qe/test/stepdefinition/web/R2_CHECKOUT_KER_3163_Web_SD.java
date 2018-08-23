package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.Then;

public class R2_CHECKOUT_KER_3163_Web_SD extends CommonActionHelper {
	
	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	
	@Then("^verify error message is dispayed$")
	public void verify_error_message_is_dispayed() throws Throwable {
	    assertTrue(isDisplayed(r2CheckOutPo.msgZipCode));
	}

}
