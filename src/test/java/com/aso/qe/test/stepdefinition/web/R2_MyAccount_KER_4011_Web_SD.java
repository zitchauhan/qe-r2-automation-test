package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertFalse;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.Then;


public class R2_MyAccount_KER_4011_Web_SD extends CommonActionHelper {
	
	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	public GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	
	@Then("^Sign in page should open$")
	public void sign_in_page_should_open() throws Throwable {
		assertTrue(isDisplayed(r2MyAccountPo.headerSignIn));
	}
	
	@Then("^user should be able to validate elements of sign in page$")
	public void user_should_be_able_to_validate_elements_of_sign_in_page() throws Throwable {
			assertTrue(isDisplayed(r2MyAccountPo.emailAddress));
			assertTrue(isDisplayed(r2MyAccountPo.password));
			assertTrue(isDisplayed(r2MyAccountPo.logIn));
			assertTrue(isDisplayed(r2MyAccountPo.lnkSignUp));
			assertTrue(isDisplayed(r2MyAccountPo.lnkForgotYourPassword));

	}

	
	@Then("^a greeting message should be displayed$")
	public void a_greeting_message_should_be_displayed() throws Throwable {
	    assertTrue(isDisplayed(r2MyAccountPo.txtHelloMessage));
	    getText(r2MyAccountPo.txtHelloMessage).contains("test");
	}
	
	@Then("^user should not be allowed to login$")
	public void user_should_not_be_allowed_to_login() throws Throwable {
		assertFalse(isDisplayed(r2MyAccountPo.txtHelloMessage));
	}

	@Then("^user should get an error message stating email id or password is incorrect$")
	public void user_should_get_an_error_message_stating_email_id_or_password_is_incorrect() throws Throwable {
		assertTrue(isDisplayed(r2MyAccountPo.txtIncorrectCombinationError));
	}
}
