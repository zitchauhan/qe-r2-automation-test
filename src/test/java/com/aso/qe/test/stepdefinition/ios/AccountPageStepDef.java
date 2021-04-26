package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.AccountPage;
import com.aso.qe.test.pageobject.ios.OrdersPage;
import com.aso.qe.test.pageobject.ios.SignUpPage;
import com.aso.qe.test.pageobject.ios.WishlistPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccountPageStepDef extends GlobalMobileHelper{
	
	AccountPage accountPage = new AccountPage(driver);
	SignUpPage signUpPage = new SignUpPage(driver);
	OrdersPage orderPage = new OrdersPage(driver);

	@Then("^User sees the account page$")
	public void userIsOnHomePage() {
		assertTrue(accountPage.isAccountPageDisplayed());
	}


    @Then("User sees password strength meter list")
    public void userSeesPasswordStrengthMeterList() {
        /* Created By @{USER} on @{DATE} */
		throw new PendingException("userSeesPasswordStrengthMeterList Not implemented");
    }

    @And("^User sees password rule \"(.*?)\" as \"(.*?)\"")
    public void userSeesPasswordRuleAs(String arg0, String arg1) {
        /* Created By @{USER} on @{DATE} */
		throw new PendingException("userSeesPasswordRuleAs Not implemented");
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


	@Then("User sees Create Account modal")
	public void userSeesCreateAccountModal() {
		isElementDisplayed(Locators.CreateAccount.buttonCancel);
	}

	@Then("^User taps on Find Store link$")
	public void user_taps_on_Find_Store_link() throws Throwable {
		accountPage.tapOnFindStoreLink();
	}
	
	@Then("^User taps on the orders button$")
	public void tapOnOrderButton() {
		accountPage.tapOnOrderButton();
	}
	
	@Then("^User enter \"(.*?)\" in order field$")
	public void enterOrderId(String args) {
		accountPage.enterOrderID(args);
	}
	
	@Then("^User enters \"(.*?)\" in zip code field$")
	public void enterZipCode(String args) {
		accountPage.enterOrderZipCode(args);
	}
	
	@Then("^User taps on Order Check button$")
	public void tapOnOrderCheckButton(String args) {
		accountPage.tapOnOrderCheckButton();
	}
	
	@Then("^User taps on Order button in orders screen$")
	public void tapOnOrderButtonInOrderScreen() {
		accountPage.tapOnOrderButtonInOrderScreen();
	}
	
	@Then("^User is navigated to payment details screen$")
	public void isPaymentDetailsScreenDisplayed() {
		assertTrue(accountPage.isPaymentDetailsScreenDisplayed());
	}
	
	@Then("^User sees Order Summary label$")
	public void isOrderSummaryLabelDisplayed() {
		assertTrue(accountPage.isOrderSummaryLabelDisplayed());
	}
	
	@And("^User sees \"(.*?)\" field in Payment detail screen$")
	public void isOrderSummaryElementsDisplayed(String element) {
		assertTrue(orderPage.isOrderSummaryElementsDisplayed(element));
	}
	
	@Then("^User sees the payment method label$")
	public void isPaymentMethodLabelDisplayed() {
		assertTrue(accountPage.isPaymentMethodLabelDisplayed());
	}
	
	@Then("^User sees \"(.*?)\" in order Cancellation screen$")
	public void isCancellationScreenElementDisplayed(String element) {
		assertTrue(orderPage.isCancellationScreenElementDisplayed(element));
	}
}
