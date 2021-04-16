package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.AccountPage;
import com.aso.qe.test.pageobject.ios.SignUpPage;
import com.aso.qe.test.pageobject.ios.WishlistPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccountPageStepDef extends GlobalMobileHelper{
	
	AccountPage accountPage = new AccountPage(driver);
	SignUpPage signUpPage = new SignUpPage(driver);

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
	@Then("^User verifies set as default address checkbox is \"([^\"]*)\"$")
	public void user_verifies_set_as_default_address_checkbox_is(String status) throws Throwable {
		accountPage.verifydefaultAddress(status);
	}
	
	@Then("^User taps on add new address button$")
	public void user_taps_on_add_new_address_button() throws Throwable {
		accountPage.tapOnAddNewAddress();
	}
	
	@When("^User selects \"([^\"]*)\" address to edit$")
	public void user_selects_address_to_edit(String addressNum) throws Throwable {
		accountPage.selectAddress(addressNum);
	}
}
