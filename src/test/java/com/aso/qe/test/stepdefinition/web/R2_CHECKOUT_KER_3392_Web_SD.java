package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertTrue;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Checkout_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CHECKOUT_KER_3392_Web_SD extends CommonActionHelper {

	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	R2_Checkout_PO r2_CheckOut_Po=PageFactory.initElements(driver, R2_Checkout_PO.class);
	R2_MyAccount_PO r2_MyAccount_PO=PageFactory.initElements(driver, R2_MyAccount_PO.class);
	
	@Then("^user will click on Checkout button$")
	public void user_will_click_on_Checkout_button() throws Throwable {
		assertTrue(clickOnButton(r2SanityPo.AS_btnCheckout));  
	}
	
//	@Then("^user will verify the message for Sign-in$")
//	public void user_will_verify_the_message_for_Sign_in() throws Throwable {
//		assertTrue(isDisplayed(r2_CheckOut_Po.txtSignInDescription));
//	}
//	
//	@When("^user click on SignIn link$")
//	public void user_click_on_SignIn_link() throws Throwable {
//		assertTrue(clickOnButton(r2_CheckOut_Po.lnkSignIn_CheckOut)); 
//	}
	
	@Then("^user will verify the fields in SignIn popup$")
	public void user_will_verify_the_fields_in_SignIn_popup() throws Throwable {
		assertTrue(isDisplayed(r2_MyAccount_PO.txtWelcomeDescription)); 
		assertTrue(isDisplayed(r2_MyAccount_PO.txtEmailAddressDescription)); 
		assertTrue(isDisplayed(r2_MyAccount_PO.inputEmailAddress_SignIn));
		assertTrue(isDisplayed(r2_MyAccount_PO.txtPasswordDescription)); 
		assertTrue(isDisplayed(r2_MyAccount_PO.inputCreatePassword));
		assertTrue(isDisplayed(r2_MyAccount_PO.txtForgotYourPasswordDescription)); 
		assertTrue(isDisplayed(r2_MyAccount_PO.btnSignIn));
		assertTrue(isDisplayed(r2_MyAccount_PO.txtCreateAccountDescription));
		
		
	}
	
	@When("^user click on Create a Account link$")
	public void user_click_on_Create_a_Account_link() throws Throwable {
		assertTrue(clickOnButton(r2_MyAccount_PO.lnkCreateAccount)); 
	}
	
	@Then("^User is navigated to Create a Account page$")
	public void user_is_navigated_to_Create_a_Account_page() throws Throwable {
	  
	}
	
	@Then("^verify that user navigates to checkout page as a signed in user$")
	public void verify_that_user_navigates_to_checkout_page_as_a_signed_in_user() throws Throwable {
	  
	}

	@When("^user click on Forgot Password link$")
	public void user_click_on_Forgot_Password_link() throws Throwable {
		assertTrue(clickOnButton(r2_MyAccount_PO.txtForgotYourPasswordDescription));  
	}

	@When("^user resets the password$")
	public void user_resets_the_password() throws Throwable {
	    
	}

	@Then("^verify that user navigates to cart page as a signed in user$")
	public void verify_that_user_navigates_to_cart_page_as_a_signed_in_user() throws Throwable {
	   
	}

	@Then("^verify that the cart from previous session and current session is merged\\.$")
	public void verify_that_the_cart_from_previous_session_and_current_session_is_merged() throws Throwable {
	   
	}

}
