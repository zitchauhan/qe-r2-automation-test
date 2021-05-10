package com.aso.qe.test.stepdefinition.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.BottomNav;
import com.aso.qe.test.pageobject.ios.Context;
import com.aso.qe.test.pageobject.ios.HomePage;
import com.aso.qe.test.pageobject.ios.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;

import org.apache.log4j.Logger;

public class LoginStepDef extends GlobalMobileHelper {
	private static final Logger logger = Logger.getLogger(LoginStepDef.class.getName());
	LoginPage loginPage = new LoginPage(driver);
	HomePage homePage = new HomePage(driver);
	BottomNav bottomNav = new BottomNav(driver);

	@When("^User enters email address")
	public void enterEmail() {
		String email = "Newtest1@yopmail.com";
		loginPage.enterEmail(email);
	}

	@And("^User enters password")
	public void enterPassword() {
		String password = "Welcome1@@";
		loginPage.enterPassword(password);
	}

	@And("^User taps on Login")
	public void tapOnLogin() {
		loginPage.tapOnLogin();
	}

	@And("^User Logs into the application$")
	public void login() throws Throwable {
		try {
			if (!homePage.isOnHomePage()) {
				tapOnElement(Locators.WelcomeScreen.HomeButton);
				bottomNav.tapOnAccount();
				tapOnElement(Locators.AccountPage.loginLink);
				enterEmail();
				enterPassword();
				tapOnLogin();
			}
		} catch (Exception e) {
			logger.error(e);
		}
	}

	@And("^User continues as guest user$")
	public void continueAsGuest() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		if (GlobalMobileHelper.isElementDisplayed(Locators.LoginPage.HomeLogin))
			GlobalMobileHelper.tapOnElement(Locators.LoginPage.HomeLogin);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}

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

	@Then("^User sees the password error message \"([^\"]*)\"$")
	public void user_sees_the_password_error_message(String errorMessage) throws Throwable {

		loginPage.isPasswordErrorMessageDisplayed(errorMessage);
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

	@Then("^User taps on cancel button$")
	public void user_taps_on_cancel_button() throws Throwable {
		loginPage.tapOnCancelBtn();
	}

	// Login new code by Prafull to read user name and password from data file
	@Given("^User is on \"([^\"]*)\" screen$")
	public void user_is_on_screen(String pagename) throws Throwable {
		verifyUserIsOnPage(pagename);
	}

	@When("^User enters \"([^\"]*)\" on login screen$")
	public void user_enters_on_login_screen(String logindetails) throws Throwable {
		loginPage.enterLoginDetails(logindetails);
	}

	@When("^User taps on \"([^\"]*)\" button on login screen$")
	public void user_taps_on_button_on_login_screen(String btnName) throws Throwable {
		loginPage.tapOnButtonOnLoginPage(btnName);
	}

	@And("^User logs into the application as \"([^\"]*)\"$")
	public void userLogsIntoTheApplicationAs(String username) throws Throwable {
		/* Created By jitsingh7 on @{DATE} */
		logOut();
		bottomNav.tapOnHome();

		if (!username.equalsIgnoreCase("guest"))
			loginPage.loginAsUser(username);

		waitForDefaultTime();

		// set the current user type
		if (!username.equalsIgnoreCase("guest"))
			Context.setCurrentUserType("registered");
		else {
			Context.setCurrentUserType("guest");
			logger.info("Current User type is a guest");
		}
	}

	private void logOut() throws Throwable {
		swipeScreen(Direction.UP, 2);
		bottomNav.tapOnHome();
		bottomNav.tapOnAccount();
		tapOnElement(Locators.AccountPage.buttonLogOut);
	}

	// -----------Password Change Module

	@Then("User Tap on Profile")
	public void User_Tap_on_Profile() throws Throwable {
		loginPage.tapOnProfile();

	}

	@Then("^User tap on Password$")
	public void user_tap_on_Password() throws Throwable {
		loginPage.tapOnPassword();

	}

	@Then("^user is on Change Your Password screen$")
	public void user_is_on_Change_Your_Password_screen() throws Throwable {
		loginPage.isvisibleChangePasspage();

	}

	@Then("User Enter Valid Current Password")
	public void user_Enter_Valid_Currunt_Password() throws Throwable {
		String validpasword = "Test@12345";
		loginPage.currentPassword(validpasword);
	}

	@Then("^User Enter inValid Current Password")
	public void user_Enter_inValid_Currunt_Password() throws Throwable {
		String validpasword = "T1qd@p345";
		loginPage.currentPassword(validpasword);
	}

	
	@Then("User Enter  Valid Same new Password")
	public void Then_User_Enter_Valid_Same_new_Password() throws Throwable {
		String Samepasword = "Test@12345";
		loginPage.currentPassword(Samepasword);
	}
	
	@Then("^User Ener Valid new Password$")
	public void user_Ener_Valid_new_Password() throws Throwable {
		String newpassword = "Qwerty@12345";
		loginPage.newPassword(newpassword);
	}

	@Then("^User tap on Upated$")
	public void user_tap_on_Upated() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		loginPage.tapOnUpdate();
	}

	@Then("^User Redirect to Profile Screen$")
	public void user_Redirect_to_Profile_Screen() throws Throwable {
		loginPage.isOnLoginScreen();
	}

	/*
	 * @Then("^User Enter Valid Current Password") public void
	 * user_Enter_Valid_Current(String password) throws Throwable {
	 * 
	 * loginPage.enterPassword(password); }
	 */
	@Then("Then User Enter inValid Current Password")
	public void user_Ener_inValid_new(String newpassword) throws Throwable {
		loginPage.enterPassword(newpassword);

	}
	@Then("User Enter Valid new Password")
	public void user_Ener_Valid_new(String newpassword) throws Throwable {
		loginPage.enterPassword(newpassword);

	}
	
	@Then("user see on Change Your Password screen")
	public void user_see_on_Change_Your_Password_screen() throws Throwable{
		
		loginPage.IsVisibleChangeYourPassword();
	}

	@Then("User will get Error massge")
	public void User_will_get_Error_massge() throws Throwable{
		
		loginPage.Errormsg();
	}
	
	//-----------------Sing Up For Deals
	@Then("^User sees password field$")
	public void user_sees_password_field() throws Throwable {
	  }

	@Then("^User tap on Sign-Up for Deals$")
	public void user_tap_on_Sign_Up_for_Deals() throws Throwable {
		loginPage.tapOnDealsSingUp();
	  
	}

	@Then("^User see Sign Up for deals screen$")
	public void user_see_Sign_Up_for_deals_screen() throws Throwable {
		loginPage.isSingUpDealsDisplayed();
	  
	}

	@Then("^User enters valid email as  \"([^\"]*)\"$")
	public void user_enters_valid_email_id(String email) throws Throwable {
		loginPage.validEmail(email);	
	  
	}

	@Then("^User enters valid zip code as  \"([^\"]*)\"$")
	public void user_enters_valid_zip_code(String zip) throws Throwable {
		loginPage.validZip(zip);
	 }

	@Then("^User tap on SIGN UP$")
	public void user_tap_on_SIGN_UP() throws Throwable {
		loginPage.tapOnDealsSingUp();
	 	}

	@Then("^User See Message Confirmed! You are On the list$")
	public void user_See_Message_Confirmed_You_are_On_the_list() throws Throwable {
		loginPage.conformationMsg();
		
	 }

	@When("^User Tap Back Navigation$")
	public void user_Tap_Back_Navigation() throws Throwable {
		loginPage.backNavigation();
	 
	}
	@Then("^Then User get Message  Please enter valid email address$")
	public void Then_User_get_Message_Please_enter_valid_email_address() throws Throwable {
		loginPage.errorMsg();
	}

	@When("^User enters invalid email \"([^\"]*)\"$")
	public void user_enters_invalid_email(String email) throws Throwable {
		loginPage.enterinvalidEmail(email);
	}
		
		
	
	//-------------------------------------
}