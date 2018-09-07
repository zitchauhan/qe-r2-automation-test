package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CHECKOUT_K3392_SD extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R2_CART_K3511_SD.class);
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_MyAccount_PO r2_MyAccount_PO=PageFactory.initElements(driver, R2_MyAccount_PO.class);
	
	public String nullvalue="";
	
	@Then("^user will click on Checkout button$")
	public void user_will_click_on_Checkout_button() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(clickOnButton(r2CheckOutPo.btnCheckOut_M));  
		}
		else {
		assertTrue(clickOnButton(r2SanityPo.AS_btnCheckout));  
	}
	}
	
	@Then("^user will verify the message for Sign-in$")
	public void user_will_verify_the_message_for_Sign_in() throws Throwable {
		assertTrue(isDisplayed(r2CheckOutPo.txtSignInDescription));
	}
	
	@When("^user click on SignIn link$")
	public void user_click_on_SignIn_link() throws Throwable {
		waitForElement(r2CheckOutPo.lnkSignIn_CheckOut);
		assertTrue(clickOnButton(r2CheckOutPo.lnkSignIn_CheckOut));
		Thread.sleep(3000);
	}
	
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
	
	
	@And("^user will click on close button on the popup$")
	public void user_will_click_on_close_button_on_the_popup() throws Throwable {
		assertTrue(clickOnButton(r2CheckOutPo.iconClose));
	}

	@Then("^User will verfiy that the Sign-in popup is closed$")
	public void user_will_verfiy_that_the_Sign_in_popup_is_closed() throws Throwable {
		assertFalse(isDisplayed(r2CheckOutPo.iconClose)); 
	}
	
	@And("^user is not authenticated, user must see empty fields in signin popup$")
	public void user_is_not_authenticated_user_must_see_empty_fields_in_signin_popup() throws Throwable {
		String email=r2_MyAccount_PO.inputEmailAddress_SignIn.getText();
		String password= r2_MyAccount_PO.inputCreatePassword.getText();
		   if(email.equals(nullvalue)) {
		   	   logger.info("Email field is Empty");
	   }else {
		  		   logger.info("Email field is not Empty");
	   }
	   
	   if(password.equals(nullvalue)) {
		   logger.info("Password field is Empty");
	   }else {
		   logger.info("Password field is not Empty");
	   }
	}
	
	
	@When("^user enter the Invalid emailaddress \"(.*?)\"$")
	public void user_enter_the_Invalid_emailaddress(String arg1) throws Throwable {
		if (arg1 != "BlankEmailAddress")
			setInputText(r2CheckOutPo.inputEmailCheckOut, webPropHelper.getTestDataProperty(arg1));
	}

	@When("^user enter the Invalid password \"(.*?)\"$")
	public void user_enter_the_Invalid_password(String arg1) throws Throwable {
		if (arg1 != "BlankPassword")
			setInputText(r2CheckOutPo.inputPasswordCheckOut, webPropHelper.getTestDataProperty(arg1));
	}
	
	
	@When("^user enter the valid Emailaddress \"(.*?)\"$")
	public void user_enter_the_valid_Emailaddress(String arg1) throws Throwable {
		if (arg1 != "BlankEmailAddress")
			setInputText(r2CheckOutPo.inputEmailCheckOut, webPropHelper.getTestDataProperty(arg1));
	}

	@When("^user enter the valid Password \"(.*?)\"$")
	public void user_enter_the_valid_Password(String arg1) throws Throwable {
		if (arg1 != "BlankPassword")
			setInputText(r2CheckOutPo.inputPasswordCheckOut, webPropHelper.getTestDataProperty(arg1));
	}

}
