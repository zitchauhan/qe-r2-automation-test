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
	@Then("^User taps on Find Store link$")
	public void user_taps_on_Find_Store_link() throws Throwable {
		accountPage.tapOnFindStoreLink();
	}
	@When("^user see myaccount welcomesection$")
	public void user_see_myaccount_welcomesection() throws Throwable {

		
		assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.MyAccountwelcomePage.MyAcademy));
		
	    
	}
	
	@Then("^user taps on payment button$")
	public void user_taps_on_payment_button() throws Throwable {
	    accountPage.tabOnPaymentButton();
	    
	}
	@Then("^user is on payment screen$")
	public void paymentScreenIsDisplayed() {
		assertTrue(accountPage.isPaymentScreenIsDisplayed());
	}
	
	
	@When("^user clicks onAdd new credit card tile$")
	public void user_clicks_onAdd_new_credit_card_tile() throws Throwable {
		accountPage.tabOnAddccButton();
	    
	}
	@Then("^user is taken to add new credit card page$")
	public void addNewCreditCardPageDisplayed() {
		
	assertTrue(accountPage.isaddnewcreditcardpagedisplayed());
	}
	
	@When("^user clicks onAdd new Academy card tile$")
	public void tabOnAddAsoCardtile() {
		accountPage.tabOnAddAsoCardtile();
	}
	@Then("^user is taken to add new Aso card page$")
	public void asoAddCCpagedisplayed() {
		
		assertTrue(accountPage.isaddAsocardpagedisplayed());
		}
	@Then("^existing cards are shown to user$")
	public void savedCardsDisplayed() {
		assertTrue(accountPage.isSavedCardDisplayed());
	    
	}
	
	@Then("^top most card is default card$")
	public void savedDefaulltCardsDisplayed() {
		assertTrue(accountPage.isSavedDefaultCardDisplayed());
	}
	
	@Then("^i choose to enter Aso card \"([^\"]*)\"$")
	public void i_choose_to_enter_Aso_card(String asocardnumber) throws Throwable {
		 accountPage.enterAsocardnumber(asocardnumber);
	}
	@Then("^i choose to enter first name \"([^\"]*)\"$")
	public void i_choose_to_enter_first_name(String billingfirstname) throws Throwable {
		accountPage.enterBillingFirstname(billingfirstname);
	}

	@Then("^i choose to enter Last name \"([^\"]*)\"$")
	public void i_choose_to_enter_Last_name(String billinglastname) throws Throwable {
		accountPage.enterBillinglastname(billinglastname);
	}

	@Then("^i choose to enter Address \"([^\"]*)\"$")
	public void i_choose_to_enter_Address(String billingaddressname) throws Throwable {
		accountPage.enterBillingaddressname(billingaddressname);
	}

	@Then("^i choose to enter aprt name \"([^\"]*)\"$")
	public void i_choose_to_enter_aprt_name(String billingaptname) throws Throwable {
		accountPage.enterBillingaptname(billingaptname);
	}

	@Then("^i choose to enter zip code \"([^\"]*)\"$")
	public void i_choose_to_enter_zip_code(String billingzipcode) throws Throwable {
		accountPage.enterBillingZipCode(billingzipcode);
	}

	@Then("^i choose to enter choose to enter city \"([^\"]*)\"$")
	public void i_choose_to_enter_choose_to_enter_city(String billingcity) throws Throwable {
		accountPage.enterBillingCity(billingcity);
	}

	@Then("^i choose to enter mobile number \"([^\"]*)\"$")
	public void i_choose_to_enter_mobile_number(String billingphonenumber) throws Throwable {
		accountPage.enterBillingPhoneNumber(billingphonenumber);
	}

	@Then("^i choose to click onsave card button$")
	public void tabOnSaveCardButton() {
		accountPage.tabOnSaveCardButton();
     }
}
