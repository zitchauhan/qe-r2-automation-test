package com.aso.qe.test.pageobject.ios;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.common.Phrase;
import com.aso.qe.test.stepdefinition.ios.Hooks;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SignUpPage {
	private static final Logger logger = Logger.getLogger(Hooks.class);
	private AppiumDriver<MobileElement> driver;
	
	public SignUpPage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	public boolean isSignUpPageDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.SignUp.signUpHeader);
	}
	
	public boolean isFieldDisplayed(String field) {
		boolean result = false;
		switch(field) {
		case "First Name":
			result = GlobalMobileHelper.isElementDisplayed(Locators.SignUp.firstName);
			break;
		case "Last Name":
			result = GlobalMobileHelper.isElementDisplayed(Locators.SignUp.lastName);
			break;
		case "Email":
			result = GlobalMobileHelper.isElementDisplayed(Locators.SignUp.email);
			break;
		case "Password":
			result = GlobalMobileHelper.isElementDisplayed(Locators.SignUp.password);
			break;
		case "Promotion":
			result = GlobalMobileHelper.isElementDisplayed(Locators.SignUp.promotion);
			break;
		case "Create an Account":
			result = GlobalMobileHelper.isElementDisplayed(Locators.SignUp.createAnAccountButton);
			break;
		case "T&C":
			result = GlobalMobileHelper.isElementDisplayed(Locators.SignUp.termsAndConditions);
			break;
		default:
			throw new IllegalArgumentException("Wrong Field");
			
		}
		return result;
	}

	public boolean isEmptyFirstNameErrorDisplayed() {
		String error = Phrase.Account.ERROR_EMPTY_FIRST_NAME;
		String actualError = GlobalMobileHelper.getElementText(Locators.SignUp.labelErrorEmptyFirstName);
		return error.equals(actualError);
	}
	
	public boolean isEmptyLastNameErrorDisplayed() {
		String error = Phrase.Account.ERROR_EMPTY_LAST_NAME;
		String actualError = GlobalMobileHelper.getElementText(Locators.SignUp.labelErrorEmptyLastName);
		return error.equals(actualError);
	}
	
	public boolean isEmptyEmailErrorDisplayed() {
		String error = Phrase.Account.ERROR_EMPTY_EMAIL;
		String actualError = GlobalMobileHelper.getElementText(Locators.SignUp.labelErrorEmptyEmail);
		return error.equals(actualError);
	}
	
	public boolean isEmptyPasswordErrorDisplayed() {
		String error = Phrase.Account.ERROR_EMPTY_PASSWORD;
		String actualError = GlobalMobileHelper.getElementText(Locators.SignUp.labelErrorEmptyPassword);
		return error.equals(actualError);
	}

	public void enterFieldValues(String value, String field) {
		switch(field) {
		case "First Name":
			GlobalMobileHelper.setText(Locators.SignUp.inputFirstName, value);
			break;
		case "Last Name":
			GlobalMobileHelper.setText(Locators.SignUp.inputLastName, value);
			break;
		case "Email":
			GlobalMobileHelper.setText(Locators.SignUp.inputEmail, value);
			break;
		case "Password":
			GlobalMobileHelper.setText(Locators.SignUp.inputPassword, value);
			break;
		default:
			throw new IllegalStateException("Wrong field");
		}
	}

	public boolean isAccountAlreadyRegisteredErrorDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.SignUp.labelAccountAlreadyRegistered);
	}
}