package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.SIT_SigninPageObject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SD_SIT_SignIn extends CommonActionHelper{
		
	GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	SIT_SigninPageObject signinPo= PageFactory.initElements(driver, SIT_SigninPageObject.class);
	
	@Then("^user should able to click on Signin button$")
	public void user_should_able_to_click_on_Signin_button() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			Thread.sleep(3000);
			scrollPageToWebElement(globalElementHeader.btnSignIn_mobile);
			waitForElement(globalElementHeader.btnSignIn_mobile);
			clickOnButton(globalElementHeader.btnSignIn_mobile);
			Thread.sleep(3000);
		}else {
			assertTrue(clickOnButton(globalElementHeader.btnSignIn));
		}
		
		
		
	}
	@And("^user should be able to enter the signin details$")
	public void user_should_be_able_to_enter_the_signin_details() throws Throwable {
		signinPo.verifySigninpage();
		globalElementHeader.enterEmailAddressandPassword();
		globalElementHeader.clickSubmitButton();
		
	}
	@Then("^User will verify the presence of ASO Logo and click on Logo$")
	public void user_will_verify_the_presence_of_ASO_Logo() throws Throwable {
		//scrollPageToWebElement(globalElementHeader.btnSignIn);
		globalElementHeader.clickASO_LOGO();


	}
}
