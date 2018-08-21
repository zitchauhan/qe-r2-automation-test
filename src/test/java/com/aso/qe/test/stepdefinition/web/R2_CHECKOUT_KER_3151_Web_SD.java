package com.aso.qe.test.stepdefinition.web;

import org.apache.log4j.Logger;

import com.aso.qe.framework.common.CommonActionHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CHECKOUT_KER_3151_Web_SD extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R2_CHECKOUT_KER_3151_Web_SD.class);
	
	@Given("^user adds an address$")
	public void user_adds_an_address() throws Throwable {

	}

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
		String currentURL = getCurrentPageURL();
		if(currentURL.contains("checkout")) {
			logger.debug("User is successfully navigated to Checkout page with URL :: " + currentURL  );
		}
		else {
			logger.debug("User is not able to navigate to Checkout instead navigated to URL :: " + currentURL  );
		}
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

}
