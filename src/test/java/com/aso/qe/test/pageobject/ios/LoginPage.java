package com.aso.qe.test.pageobject.ios;

import com.aso.qe.framework.common.PropertiesHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;

import com.aso.qe.framework.common.PropertiesHelper;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;

public class LoginPage {
	private AppiumDriver<MobileElement> driver;

	private static final Logger logger = Logger.getLogger(LoginPage.class.getName());

	private String passwordFieldType;

	public LoginPage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}

	public void enterEmail(String email) {
//		MobileElement emailField = driver.findElement(Locators.LoginPage.emailEditBox);
//		emailField.sendKeys(email);
		GlobalMobileHelper.setText(Locators.LoginPage.emailEditBox, email, Locators.LoginPage.passwordEditBox);
		logger.debug("Entered the email on Login screen");
	}

	public void enterPassword(String password) {
		MobileElement passwordField = driver.findElement(Locators.LoginPage.passwordEditBox);
		passwordField.sendKeys(password);
		passwordFieldType = passwordField.getAttribute("type");
		logger.debug(passwordFieldType);
	}

	public void tapOnLogin() {
		// driver.hideKeyboard();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MobileElement loginButton = driver.findElement(Locators.LoginPage.loginButton);
		// first clicking on login button to hide the keypad
		GlobalMobileHelper.tapOnElement(loginButton);
		// clicking on login button again to tap on login
		GlobalMobileHelper.tapOnElement(loginButton);
	}

	public void isOnLoginScreen() {
		// to be removed later
		GlobalMobileHelper.tapOnElement(Locators.AccountPage.accountTitle);
		GlobalMobileHelper.tapOnElement(Locators.AccountPage.loginLink);
		// driver.findElement(logInLink).click();

		assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.LoginPage.emailEditBox));
		logger.debug("Log In Screen is Displayed");
	}

	public void isEmailFieldDisplayed() {
		assertTrue(driver.findElement(Locators.LoginPage.emailEditBox).isDisplayed());
		logger.debug("Email field is Displayed on Log In screen");
	}

	public void isLoginButtonDisplayed() {
		assertTrue(driver.findElement(Locators.LoginPage.loginButton).isDisplayed());
		logger.debug("Login button is Displayed on Log In screen");
	}

	public void isPasswordFieldDisplayed() {
		assertTrue(driver.findElement(Locators.LoginPage.passwordEditBox).isDisplayed());
		logger.debug("Password field is Displayed on Log In screen");
	}

	public void isPasswordShowButtonDisplayed() {
		assertTrue(driver.findElement(Locators.LoginPage.passwordShowButton).isDisplayed());
		logger.debug("Password show button is displayed on Log In screen");
	}

	public void isPasswordHideButtonDisplayed() {
		assertTrue(driver.findElement(Locators.LoginPage.passwordHideButton).isDisplayed());
		logger.debug("Password hide button is displayed on Log In screen");
	}

	public void isForgotPasswordLinkDisplayed() {
		assertTrue(driver.findElement(Locators.LoginPage.forgotPasswordLink).isDisplayed());
		logger.debug("Forgot password link is Displayed on Log In screen");
	}

	public void tapOnEmailField() {
		GlobalMobileHelper.tapOnElement(driver.findElement(Locators.LoginPage.emailEditBox));
		logger.debug("Tapped on Email field on Log In screen");
	}

	public void tapOnPasswordHideButton() {
		GlobalMobileHelper.tapOnElement(driver.findElement(Locators.LoginPage.passwordHideButton));
		logger.debug("Tapped on Password Hide button on Log In screen");
	}

	public void tapOnPasswordShowButton() {
		GlobalMobileHelper.tapOnElement(driver.findElement(Locators.LoginPage.passwordShowButton));
		logger.debug("Tapped on Password Show button on Log In screen");
	}

	public void isPasswordFieldMasked() {

		// MobileElement passwordField =
		// driver.findElement(Locators.LoginPage.passwordEditBox);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		assertEquals("XCUIElementTypeSecureTextField", passwordFieldType);

		logger.debug("Type of Password field is " + passwordFieldType);
		// logger.debug("Text in the Password field is " + passwordField.getText());
		logger.debug("Password field is masked");
	}

	public void isPasswordFieldNotMasked() {

		MobileElement passwordField = driver.findElement(Locators.LoginPage.passwordEditBox);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		assertEquals("XCUIElementTypeTextField", passwordField.getAttribute("type")); // Might be Static Text
		// XCUIElementTypeStaticText
		logger.debug("Type of Password field is " + passwordField.getAttribute("type"));
		logger.debug("Text in the Password field is " + passwordField.getText());
		logger.debug("Password field is masked");
	}

	public void isErrorMessageDisplayed(String errorMessage) {
		assertEquals(driver.findElement(Locators.LoginPage.screenEmailError).getText().trim(), errorMessage);
	}

	public void isPasswordErrorMessageDisplayed(String errorMessage) {
		assertEquals(driver.findElement(Locators.LoginPage.screenPasswordError).getText().trim(), errorMessage);
	}

	public void isKeyboardDisplayed() {
		MobileElement emailField = driver.findElement(Locators.LoginPage.emailEditBox);
		emailField.click();
		logger.warn("This step was performed without driver.isKeyboardShown()");
		// assertTrue(driver.isKeyboardShown());
		// TODO The above api call is not working - Need to discuss
	}

	public void isCreateAcccountDisplayed() {
		assertTrue(driver.findElement(Locators.LoginPage.createAccountButton).isDisplayed());
		logger.debug("Create Account button is displayed on the Log In screen");
	}

	public void tapOnCancelBtn() {
		GlobalMobileHelper.setImplicitWaitTo(driver, 5);
		GlobalMobileHelper.tapOnElement(Locators.LoginPage.cancelButton);

	}

	public static void enterLoginDetails(String fieldName) {
		String keywordValue = PropertiesHelper.getInstance().getMobileTestDataProperty(fieldName);

		String element = null;
		if (fieldName.contains("email")) {
			GlobalMobileHelper.setText(Locators.LoginPage.emailEditBox, keywordValue,
				Locators.LoginPage.passwordEditBox);
		System.out.println("value of " +keywordValue);
 		//String element = null;
 		if(fieldName.contains("email")){
 			GlobalMobileHelper.setText(Locators.LoginPage.emailEditBox, keywordValue,Locators.LoginPage.passwordEditBox);

		} else if (fieldName.equalsIgnoreCase("password")) {

			GlobalMobileHelper.setText(Locators.LoginPage.passwordEditBox, keywordValue,
					Locators.LoginPage.loginButton);
		} else if (fieldName.equalsIgnoreCase("emailwhichhascreditcard")) {
 			GlobalMobileHelper.setText(Locators.LoginPage.passwordEditBox, keywordValue,Locators.LoginPage.loginButton);
 		    try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 		}else if(fieldName.equalsIgnoreCase("emailwhichhascreditcard")){

			GlobalMobileHelper.setText(Locators.LoginPage.emailEditBox, keywordValue, Locators.LoginPage.loginButton);

		} else {

			// throw new IllegalStateException("Given button type not defined");
			throw new UnsupportedOperationException("Given button type not defined");

		}}

	}

	public void tapOnButtonOnLoginPage(String btnName) {
		if (btnName.equalsIgnoreCase("LogIn")) {

			GlobalMobileHelper.tapOnElement(Locators.LoginPage.loginButton);

		} else if (btnName.equalsIgnoreCase("account")) {

			GlobalMobileHelper.tapOnElement(Locators.BottomNav.account);
		} else if (btnName.equalsIgnoreCase("gotologin")) {

			GlobalMobileHelper.tapOnElement(Locators.BottomNav.Login);

		} else {

			// throw new IllegalStateException("Given button type not defined");
			throw new UnsupportedOperationException("Given button type not defined");

		}

	}

	public void loginAsUser(String username) {
		String keywordValue = PropertiesHelper.getInstance().getMobileTestDataProperty(username);
		String[] userAndPassword = keywordValue.split(",");
		isOnLoginScreen();
		enterEmail(userAndPassword[0]);
		enterPassword(userAndPassword[1]);
		tapOnLogin();
	}

	// password change ---------------------------------
	public void tapOnProfile() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MobileElement tapProfile = driver.findElement(Locators.ChangePassword.tapOnProfile);
		// first clicking on password
		GlobalMobileHelper.tapOnElement(tapProfile);
		// clicking on password
		GlobalMobileHelper.tapOnElement(tapProfile);
	}

	public void tapOnPassword() {
		// driver.hideKeyboard();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MobileElement tapOnPassword = driver.findElement(Locators.ChangePassword.taponPassword);
		// first clicking on password
		GlobalMobileHelper.tapOnElement(tapOnPassword);
		// clicking on password
		GlobalMobileHelper.tapOnElement(tapOnPassword);
	}

	public void isvisibleChangePasspage() {
		assertTrue(driver.findElement(Locators.ChangePassword.changeyourpassword).isDisplayed());
		logger.debug("Change pass is  Displayed on Log In screen");
	}

	public void currentPassword(String currentpassword) {
		MobileElement currentpasswordField = driver.findElement(Locators.ChangePassword.currentpassword);
		currentpasswordField.sendKeys(currentpassword);
		passwordFieldType = currentpasswordField.getAttribute("type");
		logger.debug(passwordFieldType);
	}

	public void newPassword(String newpassword) {
		MobileElement currentpasswordField = driver.findElement(Locators.ChangePassword.newpassword);
		currentpasswordField.sendKeys(newpassword);
		passwordFieldType = currentpasswordField.getAttribute("type");
		logger.debug(passwordFieldType);
	}

	public void tapOnUpdate() {
		// driver.hideKeyboard();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MobileElement tapOnUpdate = driver.findElement(Locators.ChangePassword.updatebutton);
		// first clicking on update button to hide the keypad
		GlobalMobileHelper.tapOnElement(tapOnUpdate);
		// clicking on update button again to tap on login
		GlobalMobileHelper.tapOnElement(tapOnUpdate);
	}

	public void IsVisibleChangeYourPassword() {
		assertTrue(driver.findElement(Locators.ChangePassword.changeyourpassword).isDisplayed());
		assertTrue(driver.getTitle().contains("Change Your Password"));
		logger.debug("chage your password Displayed on Password screen");
	}

	public void Errormsg() throws InterruptedException {
		assertTrue(driver.findElement(Locators.ChangePassword.errormsg).isDisplayed());
		assertTrue(driver.getTitle()
				.contains("For maximum security, please enter a Password different from your Email Address"));
		Thread.sleep(10000);

	}

	// ------------------------------//

//------Sing up for deals------------------ 

	public void tapOnDealsSingUp() {
		// driver.hideKeyboard();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MobileElement SignUpButton = driver.findElement(Locators.SignUpForDeals.SingUpButton);
		// first clicking on login button to hide the keypad
		GlobalMobileHelper.tapOnElement(SignUpButton);
		// clicking on login button again to tap on login
		GlobalMobileHelper.tapOnElement(SignUpButton);
	}

	public void isSingUpDealsDisplayed() {
		assertTrue(driver.findElement(Locators.SignUpForDeals.getMoreDeals).isDisplayed());
		logger.debug("Email field is Displayed on Log In screen");
	}

	public void validEmail(String validemail) {
		String keywordValue = PropertiesHelper.getInstance().getMobileTestDataProperty(validemail);	
		MobileElement emailidField = driver.findElement(Locators.SignUpForDeals.emailTextBox);
		emailidField.sendKeys(validemail);
		GlobalMobileHelper.setText(Locators.SignUpForDeals.emailTextBox, validemail,Locators.SignUpForDeals.emailTextBox);
		logger.debug("Entered the email on Login screen");
	}

	public void validZip(String validzip) {
		MobileElement zipCodeField = driver.findElement(Locators.SignUpForDeals.inputZipCode);
		zipCodeField.sendKeys(validzip);
		GlobalMobileHelper.setText(Locators.SignUpForDeals.inputZipCode, validzip,Locators.SignUpForDeals.inputZipCode);
		logger.debug("Entered the email on Login screen");
	} 

	public void conformationMsg() {

		String expectedText = "Confirmed! You're on the list";
		assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.SignUpForDeals.ConformationMsg));
		logger.debug("Confirmed! You're on the list");
	}

	public void backNavigation() {

		GlobalMobileHelper.setImplicitWaitTo(driver, 5);
		MobileElement backNavigation = driver.findElement(Locators.SignUpForDeals.backNavigation);
		GlobalMobileHelper.tapOnElement(backNavigation);

	}
	public void errorMsg() {
		
		String expectedText = "Please enter valid email address";
		assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.SignUpForDeals.errorMsg));
		logger.debug("Please enter valid email address");
	}

	public void enterinvalidEmail(String invalidemail) {
		MobileElement passwordField = driver.findElement(Locators.SignUpForDeals.emailTextBox);
		passwordField.sendKeys(invalidemail);
		GlobalMobileHelper.setText(Locators.LoginPage.emailEditBox, invalidemail, Locators.SignUpForDeals.emailTextBox);
		logger.debug("Entered the email on Login screen");
	}
		
	
}