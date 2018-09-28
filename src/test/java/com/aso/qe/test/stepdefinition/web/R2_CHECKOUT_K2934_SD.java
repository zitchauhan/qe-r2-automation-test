package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;


import org.openqa.selenium.support.PageFactory;

import org.apache.log4j.Logger;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
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
	
		
	
	@And("^error is found in the shipping address$")
	public void error_is_found_in_the_shipping_address() throws Throwable {
		assertTrue(isDisplayed(r2CheckOutPo.errorMsgShippingAddress_txt));
	}

	@And("^user selects the suggested address instead of entered address$")
	public void user_selects_the_suggested_address_instead_of_entered_address() throws Throwable {
		assertTrue(clickOnButton(r2CheckOutPo.selectSuggestedAddress));
	}
	
	
	@And("^user verify the suggested address$")
	public void user_verify_the_suggested_address() throws Throwable {
		assertTrue(isDisplayed(r2CheckOutPo.selectSuggestedAddress));
	}

	@And("^clicks on Use Selected Address button$")
	public void clicks_on_Use_Selected_Address_button() throws Throwable {
		assertTrue(clickOnButton(r2CheckOutPo.btnSelectedAddress));
		Thread.sleep(Constants.thread_highest);
	}
	
	@And("^user should see the Zip code pre-populated in Shipping Address drawer$")
	public void user_should_see_the_Zip_code_pre_populated_in_Shipping_Address_drawer() throws Throwable {
	    String zip= r2CheckOutPo.inputCheckoutZipCode.getText();
	    if(!zip.isEmpty()) {
			  logger.info("Zip code is pre-populated");
		   }else {
			  	  logger.info("Zip code is not pre-populated");
		   }
	    	
	    }
	

}
