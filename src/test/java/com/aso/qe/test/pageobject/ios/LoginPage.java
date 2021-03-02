package com.aso.qe.test.pageobject.ios;

import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginPage {
	private AppiumDriver<MobileElement> driver;
	
	private static final Logger logger = Logger.getLogger(LoginPage.class.getName());
	
	private String passwordFieldType;
	
	public LoginPage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	public void enterEmail(String email) {
		MobileElement emailField = driver.findElement(Locators.LoginPage.emailEditBox);
		emailField.sendKeys(email);
		logger.debug(emailField.getAttribute("type"));
	}
	
		
	public void enterPassword(String password) {
		MobileElement passwordField = driver.findElement(Locators.LoginPage.passwordEditBox);
		passwordField.sendKeys(password);
		passwordFieldType = passwordField.getAttribute("type");
		logger.debug(passwordFieldType);
	}
	
	public void tapOnLogin() {
		driver.hideKeyboard();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MobileElement loginButton = driver.findElement(Locators.LoginPage.loginButton);
		GlobalMobileHelper.tapOnElement(loginButton);
	}
	
	public void isOnLoginScreen() {
		assertTrue(driver.findElement(Locators.LoginPage.emailEditBox).isDisplayed());
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
	
		//MobileElement passwordField = driver.findElement(Locators.LoginPage.passwordEditBox);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		assertEquals("XCUIElementTypeSecureTextField", passwordFieldType);
		
		logger.debug("Type of Password field is " + passwordFieldType);
		//logger.debug("Text in the Password field is " + passwordField.getText());
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
		assertEquals(driver.findElement(Locators.LoginPage.screenErrorMessage).getText().trim(), errorMessage);
	}
	
	public void isKeyboardDisplayed() {
		MobileElement emailField = driver.findElement(Locators.LoginPage.emailEditBox);
		emailField.click();
		logger.warn("This step was performed without driver.isKeyboardShown()");
		//assertTrue(driver.isKeyboardShown());
		// TODO The above api call is not working - Need to discuss
	}
	
	public void isCreateAcccountDisplayed() {
		assertTrue(driver.findElement(Locators.LoginPage.createAccountButton).isDisplayed());
		logger.debug("Create Account button is displayed on the Log In screen");
	}
}