package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K4134_SD extends CommonActionHelper {
	
	R2_CheckOut_PO r2CheckOutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	String expPhoneNumber;
	
	@Then("^user enter Phone number \"(.*?)\" in Billing address$")
	public void user_enter_Phone_number_in_Billing_address(String arg1) throws Throwable {
		setInputText(r2CheckOutPo.PhoneNumber_Input, webPropHelper.getTestDataProperty(arg1));
		expPhoneNumber = r2CheckOutPo.PhoneNumber_Input.getAttribute("value");
		assertTrue(expPhoneNumber.equals(webPropHelper.getTestDataProperty(arg1)));
	}

	@Then("^user views the phone number given in the My account saved Billing address$")
	public void user_views_the_phone_number_given_in_the_My_account_saved_Billing_address() throws Throwable {
		expPhoneNumber = r2CheckOutPo.PhoneNumber_Input.getAttribute("value");
		assertFalse(expPhoneNumber.isEmpty());

	}
	
	@Then("^user can enter the alternative person phone number \"(.*?)\"$")
	public void user_can_enter_the_alternative_person_phone_number(String arg1) throws Throwable {
		setInputText(r2CheckOutPo.PhoneNumber_Input, webPropHelper.getTestDataProperty(arg1));
		tabInputBox((r2CheckOutPo.PhoneNumber_Input));
		String expPhoneNumber=r2CheckOutPo.PhoneNumber_Input.getAttribute("value");
		assertTrue(expPhoneNumber.equals(webPropHelper.getTestDataProperty(arg1)));
	}
	
	@Given("^checks for no form errors$")
	public void checks_for_no_form_errors() throws Throwable {
		assertFalse(isDisplayed(r2CheckOutPo.AlternatePhoneNumberErrorMsg_Txt));
		
	}
	
	@Then("^user can enter the alternative person invalid phone number \"(.*?)\"$")
	public void user_can_enter_the_alternative_person_invalid_phone_number(String arg1) throws Throwable {
		setInputText(r2CheckOutPo.PhoneNumber_Input, webPropHelper.getTestDataProperty(arg1));
		tabInputBox((r2CheckOutPo.PhoneNumber_Input));
		
	}
	
	@Then("^checks for form errors$")
	public void checks_for_form_errors() throws Throwable {
		assertTrue(isDisplayed(r2CheckOutPo.AlternatePhoneNumberErrorMsg_Txt));
	}
	
	@Then("^user enter alternative person FirstName \"(.*?)\"$")
	public void user_enter_alternative_person_FirstName(String arg1) throws Throwable {
		setInputText(r2CheckOutPo.FirstName_Input, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user enter alternative person LastName \"(.*?)\"$")
	public void user_enter_alternative_person_LastName(String arg1) throws Throwable {
		setInputText(r2CheckOutPo.LastName_Input, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user enter alternative person Email \"(.*?)\"$")
	public void user_enter_alternative_person_Email(String arg1) throws Throwable {
		setInputText(r2CheckOutPo.EmailAddressforOrderConfirmation_Input, webPropHelper.getTestDataProperty(arg1));
	}
}
