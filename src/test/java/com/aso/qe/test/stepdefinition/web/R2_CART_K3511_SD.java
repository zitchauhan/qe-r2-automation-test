package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
//import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;


import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class R2_CART_K3511_SD extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R2_CART_K3511_SD.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	R2_MyAccount_PO r2MyAccountPo=PageFactory.initElements(driver, R2_MyAccount_PO.class);
	public String beforeChangeZipcode;
	public String afterChangeZipcode;
	
	
	@When("^user clicks on Change Zip Code link in Estimated shipping section of Order Summary section on Cart page$")
	public void user_clicks_on_Change_Zip_Code_link_in_Estimated_shipping_section_of_Order_Summary_section_on_Cart_page() throws Throwable {
		waitForPageLoad(getDriver());
		waitForElement(r2CartPo.txtEstimatedShippingCart);
		//Thread.sleep(5000);
		beforeChangeZipcode = r2CartPo.txtEstimatedShippingCart.getText();//txtEstimatedShipping
		assertTrue(clickOnButton(r2CartPo.lnkChangeZipCode));
	}

	@And("^user enters new \"(.*?)\" in Change ZIP Code modal overlay$")
	public void user_enters_new_in_Change_ZIP_Code_modal_overlay(String arg1) throws Throwable {
		clearInputBox(r2CartPo.inputZipCode);
		setInputText(r2CartPo.inputZipCode, webPropHelper.getTestDataProperty(arg1));
	}

	@And("^user clicks on Submit button$")
	public void user_clicks_on_Submit_button() throws Throwable {
		assertTrue(clickOnButton(r2CartPo.btnCartSubmit));
	}

	@Then("^user verifies the estimated shipping cost based on updated zip code\\.$")
	public void user_verifies_the_estimated_shipping_cost_based_on_updated_zip_code() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtEstimatedShippingCart));//txtEstimatedShipping
		afterChangeZipcode = r2CartPo.txtEstimatedShippingCart.getText();//txtEstimatedShipping
		if(!beforeChangeZipcode.equals(afterChangeZipcode)) {
			logger.info("Estimated shipping cost is updated based on zip code change");
		}
		else
		{
			logger.info("Estimated shipping cost is not updated based on zip code change");
		}
	}
	
	@Then("^Verify that estimated shipping is displayed on the basis of detected Geo location$")
	public void verify_that_estimated_shipping_is_displayed_on_the_basis_of_detected_Geo_location() throws Throwable {		
		assertTrue(isDisplayed(r2SanityPo.AS_txtEstimatedShippingCart));		
	  }

	@Then("^user fill the Address book details$")
	public void user_fill_the_Address_book_details() throws Throwable {
	  
		if(isDisplayed(r2MyAccountPo.default_txt)||isDisplayed(r2MyAccountPo.setAsDefaultBtn)) {
			logger.info("%%%%%%%%%%%%%%%%%%%%  Address book detail is already filled  %%%%%%%%%%%%%");
		
		}
		else	{
			logger.info("%%%%%%%%%%%%%%%%%%%%  Address book detail is NOT filled  %%%%%%%%%%%%%");
	
			assertTrue(clickOnButton(r2MyAccountPo.addNewAddressBtn));
			
//			setInputText(r2MyAccountPo.adr_inpFirstName, "test1");
//	    setInputText(r2MyAccountPo.adr_inpLastName, "test2");
//	    setInputText(r2MyAccountPo.adr_inpAddress1, "test3");
//	    setInputText(r2MyAccountPo.adr_inpzipCode, "78710");
//	    Thread.sleep(2000);
//	    setInputText(r2MyAccountPo.adr_inpPhoneNumber, "7896541230");
//	    assertTrue(clickOnButton(r2MyAccountPo.btnAddInAddressField));
		
		//webPropHelper.getTestDataProperty(arg1)
	    setInputText(r2MyAccountPo.adr_inpFirstName, webPropHelper.getTestDataProperty("UpdateFirstName"));
	    setInputText(r2MyAccountPo.adr_inpLastName, webPropHelper.getTestDataProperty("UpdateLastName"));
	    setInputText(r2MyAccountPo.adr_inpAddress1, webPropHelper.getTestDataProperty("UpdateAddress"));
	    setInputText(r2MyAccountPo.adr_inpzipCode, webPropHelper.getTestDataProperty("UpdateZipcode"));
	    Thread.sleep(Constants.thread_low); 
	    setInputText(r2MyAccountPo.adr_inpPhoneNumber, webPropHelper.getTestDataProperty("UpdatePhoneNumber"));
	    assertTrue(clickOnButton(r2MyAccountPo.btnAddInAddressField));
	    
		}
	}
	
	
	@Then("^user change zip code$")
	public void user_change_zip_code() throws Throwable {
   assertTrue(clickOnButton(r2CartPo.lnkChangeZipCode));
   Thread.sleep(Constants.thread_low); 
   setInputText(r2CartPo.inputZipCode, webPropHelper.getTestDataProperty("ZIPCODE"));
   assertTrue(clickOnButton(r2CartPo.btnCartSubmit));
   Thread.sleep(Constants.thread_medium);
	}
	
	@Then("^user click on change zip code and fill the zip code outside the US$")
	public void user_click_on_change_zip_code_and_fill_the_zip_code_outside_the_US() throws Throwable {
	 clickOnButton(r2CartPo.lnkChangeZipCode);
	 setInputText(r2CartPo.inputZipCode, webPropHelper.getTestDataProperty("ZipCodeOtherThenUS"));
	 clickOnButton(r2CartPo.btnCartSubmit);
	 Thread.sleep(Constants.thread_medium);
	}


}
