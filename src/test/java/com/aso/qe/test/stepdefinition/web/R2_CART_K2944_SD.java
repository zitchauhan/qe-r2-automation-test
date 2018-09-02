package com.aso.qe.test.stepdefinition.web;

//<<<<<<< Updated upstream
import com.aso.qe.framework.common.CommonActionHelper;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//public class R2_CART_KER_2944_Web_SD extends CommonActionHelper {

//	@Given("^user creates an account and signs in$")
//	public void user_creates_an_account_and_signs_in(DataTable arg1) throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		// For automatic transformation, change DataTable to one of
//		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//		// E,K,V must be a scalar (String, Integer, Date, enum etc)
//
//	}
//
//	@When("^user clicks on \"(.*?)\" CTA$")
//	public void user_clicks_on_CTA(String arg1) throws Throwable {
//
//	}
//
//	@When("^user changes the fulfillment method of OOS item \\(BOPIS to STH\\)$")
//	public void user_changes_the_fulfillment_method_of_OOS_item_BOPIS_to_STH() throws Throwable {
//
//	}
//
//	@Then("^verify that user is able to navigate to Checkout page$")
//	public void verify_that_user_is_able_to_navigate_to_Checkout_page() throws Throwable {
//
//	}
//
//	@When("^user clicks on \"(.*?)\" CTA for OOS item$")
//	public void user_clicks_on_CTA_for_OOS_item(String arg1) throws Throwable {
//
//	}
//
//	@When("^user clicks on Continue to Checkout CTA$")
//	public void user_clicks_on_Continue_to_Checkout_CTA() throws Throwable {
//
//	}
//
//	@When("^user clicks on Remove from Cart CTA for OOS item$")
//	public void user_clicks_on_Remove_from_Cart_CTA_for_OOS_item() throws Throwable {
//
//	}
//
//	@When("^user clicks on Add to Wish list CTA for OOS item$")
//	public void user_clicks_on_Add_to_Wish_list_CTA_for_OOS_item() throws Throwable {
//
//	}
//
//	@Then("^verify that message\\( Item is successfully added to wishlist\\) is displayed$")
//	public void verify_that_message_Item_is_successfully_added_to_wishlist_is_displayed() throws Throwable {
//
//=======
import cucumber.api.PendingException;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;

public class R2_CART_K2944_SD extends CommonActionHelper {
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	
	@Given("^user enter the OOS SKU search \"(.*?)\"$")
	public void user_enter_the_OOS_SKU_search(String searchSKU) throws Throwable {
		globalElementHeader.entertheSearchData(searchSKU);
	}
	

	@Then("^verify that message Item is successfully added to wishlist is displayed$")
	public void verify_that_message_Item_is_successfully_added_to_wishlist_is_displayed() throws Throwable {
//		isDisplayed(element)
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
//>>>>>>> Stashed changes
	}

	@Then("^verify that item is added to wishlist$")
	public void verify_that_item_is_added_to_wishlist() throws Throwable {
//<<<<<<< Updated upstream

	}

	@Then("^verify that the item is removed from cart$")
	public void verify_that_the_item_is_removed_from_cart() throws Throwable {

//	}
//=======
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

//>>>>>>> Stashed changes

}
