package com.aso.qe.test.pageobject.ios;

import org.openqa.selenium.By;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginPage {
	private AppiumDriver<MobileElement> driver;

	public LoginPage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	public void enterEmail(String email) {
		MobileElement emailField = driver.findElement(Locators.LoginPage.emailEditBox);
		emailField.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		MobileElement passwordField = driver.findElement(Locators.LoginPage.passwordEditBox);
		passwordField.sendKeys(password);
	}
	
	public void tapOnLogin() {
		//driver.hideKeyboard();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MobileElement loginButton = driver.findElement(Locators.LoginPage.loginButton);
		//first clicking on login button to hide the keypad
		GlobalMobileHelper.tapOnElement(loginButton);
		//clicking on login button again to tap on login 
		GlobalMobileHelper.tapOnElement(loginButton);
	}
}