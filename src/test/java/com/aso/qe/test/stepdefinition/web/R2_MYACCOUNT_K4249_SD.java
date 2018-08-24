package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.PropertiesHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_MYACCOUNT_K4249_SD extends CommonActionHelper {

	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	public GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver,
			GlobalElementHeader_HomePO.class);

	@When("^user clicks on SignIn link from global header$")
	public void user_clicks_on_Sign_In_link_from_global_header() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.lnkSignIn));
	}

	@When("^clicks on SignUp link from SignIn page$")
	public void clicks_on_Sign_Up_link_from_SignIn_page() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.lnkSignUp));
	}

	@Then("^user should land on the Sign Up page to create a new account$")
	public void user_should_land_on_the_Sign_Up_page_to_create_a_new_account() throws Throwable {
		assertTrue(isDisplayed(r2MyAccountPo.txtdescription));
	}

	@Then("^user will check whether the following fields are displayed$")
	public void user_will_check_whether_the_following_fields_are_displayed() throws Throwable {

		assertTrue(isDisplayed(r2MyAccountPo.inputFirstName));
		assertTrue(isDisplayed(r2MyAccountPo.inputLastName));
		assertTrue(isDisplayed(r2MyAccountPo.inputEmailAddress));
		assertTrue(isDisplayed(r2MyAccountPo.inputCreatePassword));
		assertTrue(isDisplayed(r2MyAccountPo.inputOptIn));
		assertTrue(isDisplayed(r2MyAccountPo.btnSignUp));
		assertTrue(isDisplayed(r2MyAccountPo.txtAlreadyHaveAnAccountSignInNow));
		assertTrue(isDisplayed(r2MyAccountPo.lnkSignInNow));
		assertTrue(isDisplayed(r2MyAccountPo.txtPasswordMustContainLabel));
		assertTrue(isDisplayed(r2MyAccountPo.txtCharactersMin));
		assertTrue(isDisplayed(r2MyAccountPo.iconCross));
		assertTrue(isDisplayed(r2MyAccountPo.txtPasswordStrength));
		assertTrue(isDisplayed(r2MyAccountPo.txtWeak));
		assertTrue(isDisplayed(r2MyAccountPo.txtStrong));
	}

	@When("^user enter create password$")
	public void user_enter_create_password() throws Throwable {
		String password = PropertiesHelper.getInstance().getTestDataProperty("password");
		setInputText(r2MyAccountPo.inputCreatePassword, password);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^user click optin checkbox$")
	public void user_click_optin_checkbox() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.inputOptIn));
	}

	@When("^clicks on Sign Up Button$")
	public void clicks_on_Sign_Up_Button() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.btnSignUp));
	}

	@When("^user should see the successfull message$")
	public void user_should_see_the_successfull_message() throws Throwable {
		assertTrue(isDisplayed(r2MyAccountPo.txtMyAccountRegisteredDescription));
	}

	@When("^user should be able to view My Account in global header$")
	public void user_should_be_able_to_view_My_Account_in_global_header() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.btnConfirmRegistered));
		assertTrue(isDisplayed(r2MyAccountPo.lnkMyAccount));

	}

	@When("^user click on signin button$")
	public void user_click_on_signin_button() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.btnSignIn));
	}

	@Then("^user should get logged in successfully$")
	public void user_should_get_logged_in_successfully() throws Throwable {

		assertTrue(isDisplayed(r2MyAccountPo.txtMyAccountDescription));
	}

	@When("^user enter first \"(.*?)\"$")
	public void user_enter_first(String arg1) throws Throwable {
		setInputText(r2MyAccountPo.inputFirstName, webPropHelper.getTestDataProperty(arg1));
	}

	@When("^user enter last \"(.*?)\"$")
	public void user_enter_last(String arg1) throws Throwable {
		setInputText(r2MyAccountPo.inputLastName, webPropHelper.getTestDataProperty(arg1));
	}

	@When("^user enter random email Address$")
	public void user_enter_email() throws Throwable {
		UUID uuid = UUID.randomUUID();
		String randomUUIDString = uuid.toString();
		String txtemailaddress_random = "abc" + randomUUIDString + "@gmail.com";
		setInputText(r2MyAccountPo.inputEmailAddress, txtemailaddress_random);
	}

	@When("^user enter password \"(.*?)\"$")
	public void user_enter_password(String arg1) throws Throwable {
		setInputText(r2MyAccountPo.inputCreatePassword, webPropHelper.getTestDataProperty(arg1));
	}

	@When("^user enter the valid emailaddress \"(.*?)\"$")
	public void user_enter_the_valid_emailaddress(String arg1) throws Throwable {
		if (arg1 != "BlankEmailAddress")
			setInputText(r2MyAccountPo.inputEmailAddress_SignIn, webPropHelper.getTestDataProperty(arg1));
	}

	@When("^user enter the valid password \"(.*?)\"$")
	public void user_enter_the_valid_password(String arg1) throws Throwable {
		if (arg1 != "BlankPassword")
			setInputText(r2MyAccountPo.inputPassword, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user should see password masked$")
	public void user_should_see_password_masked() throws Throwable {
		assertTrue(r2MyAccountPo.inputCreatePassword.getAttribute("type").equalsIgnoreCase("password"));
	}

	@Then("^clicks on the Show label$")
	public void clicks_on_the_Show_label() throws Throwable {
		if (isDisplayed(r2MyAccountPo.btnShow))
			assertTrue(clickOnButton(r2MyAccountPo.btnShow));
	}

	@Then("^user entered password should get unmasked displaying the characters$")
	public void user_entered_password_should_get_unmasked_displaying_the_characters() throws Throwable {
		assertTrue(r2MyAccountPo.inputCreatePassword.getAttribute("type").equalsIgnoreCase("text"));
	}
	
	@Then("^the label should get toggled to Hide$")
	public void the_label_should_get_toggled_to_Hide() throws Throwable {
	    assertTrue(isDisplayed(r2MyAccountPo.btnHide));
	}

}