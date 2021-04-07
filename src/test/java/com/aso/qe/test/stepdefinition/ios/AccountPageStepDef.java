package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.AccountPage;
import com.aso.qe.test.pageobject.ios.SignUpPage;
import com.aso.qe.test.pageobject.ios.WishlistPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccountPageStepDef extends GlobalMobileHelper{
	
	AccountPage accountPage = new AccountPage(driver);
	SignUpPage signUpPage = new SignUpPage(driver);
	
	@Then("^User sees the account page$")
	public void userIsOnHomePage() {
		assertTrue(accountPage.isAccountPageDisplayed());
	}
	
	@When("^User taps on Create An Account button$")
	public void tapOnCreateAnAccount() {
		accountPage.tapOnCreateAnAccount();
	}
	
	@When("^User sees sign up screen$")
	public void isSignUpScreenVisible() {
		assertTrue(signUpPage.isSignUpPageDisplayed());
	}
	
	@Then("^User enters \"(.*?)\" in \"(.*?)\" field$")
	public void enterFieldValues(String value,String field) {
		signUpPage.enterFieldValues(value,field);
	}
	
	@Then("^User enters \"(.*?)\" in \"(.*?)\" field on add address screen$")
	public void enterFieldValuesOnAddAddress(String value,String field) {
		accountPage.enterFieldValuesOnAddAddress(value,field);
	}
	
	@Then("^User sees error for \"(.*?)\" field$")
	public void validateError(String field) {
		accountPage.validateError(field);
	}
	
	@Then("^User taps on Add New address button$")
	public void tapOnAddNewAddress() {
		accountPage.tapOnAddNewAddress();
	}
	
	@Then("^User sees \"(.*?)\" in state field on add address screen$")
	public void validateState(String state) {
		assertTrue(accountPage.validateState(state));
	}
	
	@When("^User sees \"(.*?)\" field$")
	public void isSignUpField(String field) {
		assertTrue(signUpPage.isFieldDisplayed(field));
	}
	
	@When("^User taps on Create an account button on Signup screen$")
	public void tapOnCreateAnAccfountOnSignUp() {
		accountPage.tapOnCreateAnAccountOnSignUpPage();
	}
	
	@Then("^User sees account already registered error$")
	public void accountAlreadyRegisteredErrorDisplayed(String value,String field) {
		assertTrue(signUpPage.isAccountAlreadyRegisteredErrorDisplayed());
	}
	
	@When("^User sess the empty fields error on SignUp Screen$")
	public void isEmptyErrorFieldsDisplayed() {
		assertTrue(signUpPage.isEmptyFirstNameErrorDisplayed());
		assertTrue(signUpPage.isEmptyLastNameErrorDisplayed());
		assertTrue(signUpPage.isEmptyEmailErrorDisplayed());
		assertTrue(signUpPage.isEmptyPasswordErrorDisplayed());
	}
	
	@When("^User sees error for invalid email$")
	public void invalidEmailsErrorDisplayed() {
		accountPage.tapOnCreateAnAccountOnSignUpPage();
	}
	
	@Then("^User sees the address book place holder$")
	public void addressBookButtonDisplayed() {
		assertTrue(accountPage.isAddressBookButtonDisplayed());
	}
	
	@When("^User taps on the address book placeholder$")
	public void tapOnAddressBookButton() {
		accountPage.tapOnAddressBookButton();
	}
	@Then("^User is taken to add address screen$")
	public void addAddressScreenIsDisplayed() {
		assertTrue(accountPage.isAddAddressScreenDisplayed());
	}
	
	@Then("^User sees the error pop up$")
	public void user_sees_the_error_pop_up() throws Throwable {
	    
		assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.AddAddress.errorPopUp));
	}
}