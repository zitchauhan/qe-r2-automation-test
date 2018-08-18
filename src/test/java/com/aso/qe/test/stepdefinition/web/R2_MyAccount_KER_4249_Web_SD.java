package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_MyAccount_KER_4249_Web_SD extends CommonActionHelper {

	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	public GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver,
			GlobalElementHeader_HomePO.class);

	@When("^user clicks on 'Sign In' link from global header$")
	public void user_clicks_on_Sign_In_link_from_global_header() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.lnkSignIn));
	}

	@When("^clicks on 'Sign Up' link from Sign In page$")
	public void clicks_on_Sign_Up_link_from_Sign_In_page() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.lnkSignUp));
	}

	@Then("^user should land on the Sign Up page to create a new account$")
	public void user_should_land_on_the_Sign_Up_page_to_create_a_new_account() throws Throwable {
		assertTrue(isDisplayed(r2MyAccountPo.txtdescription));
	}

	@Then("^user will check whether the following fields are displayed$")
	public void user_will_check_whether_the_following_fields_are_displayed() throws Throwable {

		assertTrue(isDisplayed(r2MyAccountPo.inputfirstname));
		assertTrue(isDisplayed(r2MyAccountPo.inputlastname));
		assertTrue(isDisplayed(r2MyAccountPo.inputemailaddress));
		assertTrue(isDisplayed(r2MyAccountPo.inputCreatepassword));
		assertTrue(isDisplayed(r2MyAccountPo.inputoptin));
		assertTrue(isDisplayed(r2MyAccountPo.btnSignUp));
		assertTrue(isDisplayed(r2MyAccountPo.txtAlreadyhaveanAccountSignInNow));
		assertTrue(isDisplayed(r2MyAccountPo.lnkSignInNow));
		assertTrue(isDisplayed(r2MyAccountPo.txtPasswordMustContainLabel));
		assertTrue(isDisplayed(r2MyAccountPo.txtCharactersMin));
		assertTrue(isDisplayed(r2MyAccountPo.iconcross));
		assertTrue(isDisplayed(r2MyAccountPo.txtPasswordStrength));
		assertTrue(isDisplayed(r2MyAccountPo.txtWeak));
		assertTrue(isDisplayed(r2MyAccountPo.txtStrong));
	}

	@When("^user enter first \"(.*?)\"$")
	public void user_enter_first(String firstname) throws Throwable {
		setInputText(r2MyAccountPo.inputfirstname, firstname);
	}

	@When("^user enter last \"(.*?)\"$")
	public void user_enter_last(String lastname) throws Throwable {
		setInputText(r2MyAccountPo.inputlastname, lastname);
	}

	@When("^user enter email \"(.*?)\"$")
	public void user_enter_email(String emailaddress) throws Throwable {
		setInputText(r2MyAccountPo.inputemailaddress, emailaddress);
	}

	@When("^user enter create \"(.*?)\"$")
	public void user_enter_create(String createpassword) throws Throwable {
		setInputText(r2MyAccountPo.inputCreatepassword, createpassword);
	}

	@When("^user click optin checkbox$")
	public void user_click_optin_checkbox() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.inputoptin));
	}

	@When("^clicks on Sign Up Button$")
	public void clicks_on_Sign_Up_Button() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.btnSignUp));
	}

	@When("^user should see the successfull message$")
	public void user_should_see_the_successfull_message() throws Throwable {

		// assertTrue(isDisplayed(r2MyAccountPo.));
	}

	@When("^user should be able to view 'My Account' in global header$")
	public void user_should_be_able_to_view_My_Account_in_global_header() throws Throwable {

	}

	@When("^user enter the valid emailaddress \"(.*?)\"$")
	public void user_enter_the_valid_emailaddress(String emailaddress) throws Throwable {
		setInputText(r2MyAccountPo.inputemailaddress_signin, emailaddress);
	}

	@When("^user enter the valid password \"(.*?)\"$")
	public void user_enter_the_valid_password(String password) throws Throwable {
		setInputText(r2MyAccountPo.inputCreatepassword, password);
	}

	@When("^user click on signin button$")
	public void user_click_on_signin_button() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.btnSignIn));
	}

	@Then("^user should get logged in successfully$")
	public void user_should_get_logged_in_successfully() throws Throwable {

		assertTrue(isDisplayed(r2MyAccountPo.txtMyaccountDescription));
	}

}