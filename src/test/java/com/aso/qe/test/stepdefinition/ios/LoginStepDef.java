package com.aso.qe.test.stepdefinition.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.HomePage;
import com.aso.qe.test.pageobject.ios.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends GlobalMobileHelper{
	
	LoginPage loginPage = new LoginPage(driver);
	HomePage homePage = new HomePage(driver);
	
	@When("^User enters email address")
	public void enterEmail() {
		String email = "testuser1@yopmail.com";
		loginPage.enterEmail(email);
	}
	
	@And("^User enters password")
	public void enterPassword() {
		String password = "Testing123#";
		loginPage.enterPassword(password);
	}
	@And("^User taps on Login")
	public void tapOnLogin() {
		loginPage.tapOnLogin();
	}
	
	@And("^User Logs into the application$")
	public void login() {
		try {
			homePage.isOnHomePage();
		}catch(Exception e) {
			enterEmail();
			enterPassword();
			tapOnLogin();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	@And("^User continues as guest user$")
	public void continueAsGuest() {
		GlobalMobileHelper.tapOnElement(Locators.LoginPage.continueAsGuestButton);
	@Given("^User is on Log In screen$")
	public void user_is_on_Log_In_screen() throws Throwable {
		loginPage.isOnLoginScreen();
	}

	@Then("^User sees email address field$")
	public void user_sees_email_address_field() throws Throwable {
		loginPage.isEmailFieldDisplayed();
	}

	@Then("^User sees passwordd field$")
	public void user_sees_passwordd_field() throws Throwable {
		loginPage.isPasswordFieldDisplayed();
	}

	@Then("^User sees login button$")
	public void user_sees_login_button() throws Throwable {
	    loginPage.isLoginButtonDisplayed();   
	}

	@Then("^User sees forgot password link$")
	public void user_sees_forgot_password_link() throws Throwable {
	    
	    loginPage.isForgotPasswordLinkDisplayed();
	}

	@When("^User taps on email address field$")
	public void user_taps_on_email_address_field() throws Throwable {
	    loginPage.tapOnEmailField();
	}

	@Then("^User sees the soft keyboard on the screen$")
	public void user_sees_the_soft_keyboard_on_the_screen() throws Throwable {
	    // TODO write the steps
	    loginPage.isKeyboardDisplayed();
	}


	@When("^User taps Show button$")
	public void user_taps_Show_button() throws Throwable {
	    loginPage.tapOnPasswordShowButton();
	}

	@Then("^User sees the password$")
	public void user_sees_the_password() throws Throwable {
		loginPage.isPasswordFieldNotMasked();
	}

	@Then("^User sees Hide button$")
	public void user_sees_Hide_button() throws Throwable {
	    loginPage.isPasswordHideButtonDisplayed();
	}

	@When("^User taps Hide button$")
	public void user_taps_Hide_button() throws Throwable {
	    loginPage.tapOnPasswordHideButton();
	}

	@Then("^password field is masked$")
	public void password_field_is_masked() throws Throwable {
		loginPage.isPasswordFieldMasked();
	}

	@Then("^User sees the Show button$")
	public void user_sees_the_Show_button() throws Throwable {
	    loginPage.isPasswordShowButtonDisplayed();
	    
	}

	@When("^User enters incorrect email \"([^\"]*)\"$")
	public void user_enters_incorrect_email(String emailAddress) throws Throwable {
	    
	    loginPage.enterEmail(emailAddress);
	}

	@Then("^User sees the error message \"([^\"]*)\"$")
	public void user_sees_the_error_message(String errorMessage) throws Throwable {
	    
	    loginPage.isErrorMessageDisplayed(errorMessage);
	}

	@Given("^User is on Log In sreen$")
	public void user_is_on_Log_In_sreen() throws Throwable {
	    
	    loginPage.isOnLoginScreen();
	}
	
	@When("^User enters incorrect password \"([^\"]*)\"$")
	public void user_enters_incorrect_password(String incorrectPassword) throws Throwable {
	    loginPage.enterPassword(incorrectPassword);
	}
	
	@When("^User taps on LogIn button$")
	public void user_taps_on_LogIn_button() throws Throwable {
	    loginPage.tapOnLogin();
	}
	
	@Then("^User sees Create Account button$")
	public void user_sees_Create_Account_button() throws Throwable {
	    loginPage.isCreateAcccountDisplayed();
	}
}
