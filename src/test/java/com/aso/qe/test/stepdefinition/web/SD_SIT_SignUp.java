			package com.aso.qe.test.stepdefinition.web;



import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SD_SIT_SignUp extends CommonActionHelper{
	
GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);

@Then("^user should able to click on Signup button$")
public void user_should_able_to_click_on_Signup_button() throws Throwable {
	//assertTrue(clickOnButton(globalElementHeader.lnkSignUp));
}

@And("^user should able to enter the Signup details$")
public void user_should_able_to_enter_the_Signup_details() throws Throwable {
	globalElementHeader.enterFirstName();
	globalElementHeader.enterLastName();
	globalElementHeader.enterEmailAddress_signup();
	globalElementHeader.enterPasswordForSignUp();
	globalElementHeader.enterConfirmPassword();
//	globalElementHeader.clickSignupButton();
}

@Then("^user sign out from the website$")
public void user_sign_out_from_the_website() throws Throwable {
	globalElementHeader.signOut();
}

}
