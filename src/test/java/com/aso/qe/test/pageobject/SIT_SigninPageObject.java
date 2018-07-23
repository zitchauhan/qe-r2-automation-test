package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class SIT_SigninPageObject extends CommonActionHelper{
	
	@FindBy(xpath="//h1[text()='Welcome Back!']") public WebElement txtwelcomeback;
	@FindBy(xpath="//a[text()='Forgot your password?']") public WebElement lnkforgotpwd;
	@FindBy(xpath="//span[contains(text(),'Don')]") public WebElement txtdonthaveanaccount;
	@FindBy(xpath="//a[text()='Sign Up']") public WebElement txtdonthaveanaccounttxtdonthaveanaccount;
	
	
	public void verifySigninpage() throws Exception{
		assertTrue(isDisplayed(txtwelcomeback));
		assertTrue(isDisplayed(lnkforgotpwd));
		assertTrue(isDisplayed(txtdonthaveanaccount));
		assertTrue(isDisplayed(txtdonthaveanaccount));
	}
			

}
