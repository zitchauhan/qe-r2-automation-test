package com.aso.qe.test.stepdefinition.web;


import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class R2_MYACCOUNT_K2919_SD extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R2_MYACCOUNT_K2919_SD.class);
	R2_MyAccount_PO myAccountPo= PageFactory.initElements(driver, R2_MyAccount_PO.class);
	
		
	@Given("^user clicks on Add New Credit Card button$")
	public void user_clicks_on_Add_New_Credit_Card_button() throws Throwable {
		assertTrue(clickOnButton(myAccountPo.btnAddNewCreditCard));
	}
	
	@And("^user clicks the CVV Tool Tip$")
	public void user_clicks_the_CVV_Tool_Tip() throws Throwable {
		assertTrue(clickOnButton(myAccountPo.iconCVVToolTip));
	}

	@Then("^verify that a flyout with tool tip is opened$")
	public void verify_that_a_flyout_with_tool_tip_is_opened() throws Throwable {
	    moveHover(myAccountPo.iconCVVToolTip);
	    waitForElement(myAccountPo.iconCVVToolTipFlyout);
	    assertTrue(isDisplayed(myAccountPo.iconCVVToolTipFlyout));
	}
	
	@And("^User enters Credit Card number \"(.*?)\"$")
	public void user_enters_Credit_Card_number(String text) throws Throwable {
		setInputText(myAccountPo.txtCreditCardNumber, webPropHelper.getTestDataProperty(text));
		
	}
	
		
	
	@Then("^User views red outlined box and message 'Unrecognized card number'$")
	public void user_views_red_outlined_box_and_message_Unrecognized_card_number() throws Throwable {
	   
	}

	@And("^User enters expiration date \"(.*?)\"$")
	public void user_enters_expiration_date(String arg1) throws Throwable {
		setInputText(myAccountPo.txtExpiryDate, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^Verify that red outlined box and message 'Past expiration date' is displayed$")
	public void verify_that_red_outlined_box_and_message_Past_expiration_date_is_displayed() throws Throwable {
	    
	}
	
	@Then("^Verify that red outlined box and message 'Unrecognized expiration date' is displayed$")
	public void verify_that_red_outlined_box_and_message_Unrecognized_expiration_date_is_displayed() throws Throwable {
	    
	}
	
	@Given("^User enters CVV number \"(.*?)\"$")
	public void user_enters_CVV_number(String arg1) throws Throwable {
		setInputText(myAccountPo.txtCVV, webPropHelper.getTestDataProperty(arg1));
		
	}

	@Then("^verify that red outlined box and message 'Please enter a valid security code' is displayed$")
	public void verify_that_red_outlined_box_and_message_Please_enter_a_valid_security_code_is_displayed() throws Throwable {
	   
	}
	
	@Then("^verify that the field population does not happen$")
	public void verify_that_the_field_population_does_not_happen() throws Throwable {
	    String cvv = myAccountPo.txtCVV.getAttribute("Value");
		if(cvv.isEmpty()) {
			  logger.info("CVV field is Empty");
		   }else {
			  	  logger.info("CVV field is not Empty");
		   }
	}
	
	
	@And("^User clicks on Add CTA$")
	public void user_clicks_on_Add_CTA() throws Throwable {
		assertTrue(clickOnButton(myAccountPo.btnAddInAddCreditCard));
		
	}
	
	@Then("^verify that inline error messages are displayed prompting the user to enter all required fields$")
	public void verify_that_inline_error_messages_are_displayed_prompting_the_user_to_enter_all_required_fields() throws Throwable {
	    for(WebElement inlineError: myAccountPo.inlineErrorMsg) {
	    	assertTrue(isDisplayed(inlineError));
	    }
	}
	
	
	@And("^user enter First Name field \"(.*?)\"$")
	public void user_enter_First_Name_field(String arg1) throws Throwable {
		setInputText(myAccountPo.txtFirstNameInAddCreditCard, webPropHelper.getTestDataProperty(arg1));
	}

	@And("^user enter Last Name field \"(.*?)\"$")
	public void user_enter_Last_Name_field(String arg1) throws Throwable {
		setInputText(myAccountPo.txtLastNameInAddCreditCard, webPropHelper.getTestDataProperty(arg1));
	}

	
	@And("^user enter Address field \"(.*?)\"$")
	public void user_enter_Address_field(String arg1) throws Throwable {
		setInputText(myAccountPo.txtAddressInAddCreditCard, webPropHelper.getTestDataProperty(arg1));
	}

	@And("^user enter ZipCode field \"(.*?)\"$")
	public void user_enter_ZipCode_field(String arg1) throws Throwable {
		setInputText(myAccountPo.txtZipCodeInAddCreditCard, webPropHelper.getTestDataProperty(arg1));
		
	}
	
	@Given("^User clicks on cancel$")
	public void user_clicks_on_cancel() throws Throwable {
		assertTrue(clickOnButton(myAccountPo.btnCancelInAddCreditCard));
	}
	
	@Then("^User verifies that the form fields are closed$")
	public void user_verifies_that_the_form_fields_are_closed() throws Throwable {
		assertTrue(isDisplayed(myAccountPo.btnAddNewCreditCard));
	}
	
	@Then("^User verifies that city and State are populated automatically$")
	public void user_verifies_that_city_and_State_are_populated_automatically() throws Throwable {
		String city = myAccountPo.txtCityInAddCreditCard.getAttribute("value");
	    String state = myAccountPo.btnState.getText();
	       
	    assertTrue(!city.isEmpty());
	    assertTrue(!state.isEmpty());
	    
	}

}
