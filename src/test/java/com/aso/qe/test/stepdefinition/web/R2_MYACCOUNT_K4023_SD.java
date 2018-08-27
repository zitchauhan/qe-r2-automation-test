package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_MYACCOUNT_K4023_SD extends CommonActionHelper{
	
	R2_MyAccount_PO r2_MyAccount_PO=PageFactory.initElements(driver, R2_MyAccount_PO.class);
	
	@When("^user clicks on Forgot your password link on the Sign in page$")
	public void user_clicks_on_Forgot_your_password_link_on_the_Sign_in_page() throws Throwable {
	    assertTrue(clickOnButton(r2_MyAccount_PO.btnForgotYourPassword));
	}

	@Then("^Forgot Password page should open$")
	public void forgot_Password_page_should_open() throws Throwable {
		assertTrue(isDisplayed(r2_MyAccount_PO.headerForgotYourPassword));
	}
	
	@Then("^user should be able to validate elements of forgot your password page$")
	public void user_should_be_able_to_validate_elements_of_forgot_your_password_page() throws Throwable {
	    assertTrue(isDisplayed(r2_MyAccount_PO.emailAddress));
	    assertTrue(isDisplayed(r2_MyAccount_PO.btnSubmit));
	    
	}
	@Then("^user clicks on Submit button without entering the email address$")
	public void user_clicks_on_Submit_button_without_entering_the_email_address() throws Throwable {
		assertTrue(clickOnButton(r2_MyAccount_PO.btnSubmit));
	}
	

	@Then("^user should get an error message$")
	public void user_should_get_an_error_message() throws Throwable {
		assertTrue(isDisplayed(r2_MyAccount_PO.txtInvalidEmailAddressError));
	}
	
	@Then("^user enters a \"(.*?)\" and clicks on Submit button$")
	public void user_enters_a_and_clicks_on_Submit_button(String arg1) throws Throwable {
		setInputText(r2_MyAccount_PO.emailAddress, webPropHelper.getTestDataProperty(arg1));
		assertTrue(clickOnButton(r2_MyAccount_PO.btnSubmit));
	}
	@Then("^user should get an error message for nonregisteredemailid address$")
	public void user_should_get_an_error_message_for_invalid_email() throws Throwable {
		 assertTrue(isDisplayed(r2_MyAccount_PO.txtInvalidEmailAddressError));
	    
	}
}
