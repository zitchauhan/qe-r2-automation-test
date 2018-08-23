package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import org.apache.log4j.Logger;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;


public class R2_CHECKOUT_K2934_SD extends CommonActionHelper {

	private static final Logger logger = Logger.getLogger(R2_CHECKOUT_K2934_SD.class);
	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	
	@And("^verify the error message for mandatory field$")
	public void verify_the_error_message_for_mandatory_field() throws Throwable {
		assertTrue(isDisplayed(r2CheckOutPo.txtZipcodeerrormsg));
	}
	
	@Then("^verify un-populated shipping address form fields$")
	public void verify_un_populated_shipping_address_form_fields() throws Throwable {
		if(r2CheckOutPo.inputShippingAddressfield.isEmpty())
		 {
			logger.debug("All fields are Empty");
		 }
		else {
			logger.debug("All fields are Not Empty");
		}
		
		
	}
	

}
