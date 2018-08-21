package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CHECKOUT_KER_3151_Web_SD extends CommonActionHelper {
	
	GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
//	@Given("^user adds an address$")
//	public void user_adds_an_address() throws Throwable {
//
//	}

	@Given("^click on submit button$")
	public void click_on_submit_button() throws Throwable {

	}

	@When("^user selects an address from dropdown$")
	public void user_selects_an_address_from_dropdown() throws Throwable {

	}

	@When("^user should see the order summary page with the selected address$")
	public void user_should_see_the_order_summary_page_with_the_selected_address() throws Throwable {

	}

	@When("^user is navigated to order summary page$")
	public void user_is_navigated_to_order_summary_page() throws Throwable {

	}

	@Then("^user verifies the default shipping address in the drop down$")
	public void user_verifies_the_default_shipping_address_in_the_drop_down() throws Throwable {

	}

	@Then("^user verifies all the saved addresses in my account should be displayed in the dropdown$")
	public void user_verifies_all_the_saved_addresses_in_my_account_should_be_displayed_in_the_dropdown()
			throws Throwable {

	}

	@When("^user enter new address details$")
	public void user_enter_new_address_details() throws Throwable {

	}

	@Then("^new address should be displayed instead of default address$")
	public void new_address_should_be_displayed_instead_of_default_address() throws Throwable {

	}

	@Given("^user navigates to Checkout page And verify address available from my account$")
	public void user_navigates_to_Checkout_page_And_verify_address_available_from_my_account() throws Throwable {

	}

	@Then("^the list of addresses will be from newest added to oldest\\.$")
	public void the_list_of_addresses_will_be_from_newest_added_to_oldest() throws Throwable {

	}
	
	@Given("^user creates an account and signs in$")
	public void user_creates_an_account_and_signs_in(DataTable userDetails) throws Throwable {
		List<List<String>> data = userDetails.raw();
		String firstName = data.get(1).get(0);
		String lastName = data.get(1).get(1);
		String email = data.get(1).get(2);
		String password = data.get(1).get(3);
		assertTrue(globalElementHeader.signUpAndSignIn(firstName, lastName, email, password));
	}

}
