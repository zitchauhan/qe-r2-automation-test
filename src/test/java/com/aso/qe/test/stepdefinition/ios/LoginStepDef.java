package com.aso.qe.test.stepdefinition.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.HomePage;
import com.aso.qe.test.pageobject.ios.LoginPage;

import cucumber.api.java.en.And;
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
	}
	@When("^User enters valid email \"([^\"]*)\"$")
	public void user_enters_valid_email(String email) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.enterEmail(email);
	}

	@When("^User enters valid password \"([^\"]*)\"$")
	public void user_enters_valid_password(String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.enterPassword(password);
	}
}
