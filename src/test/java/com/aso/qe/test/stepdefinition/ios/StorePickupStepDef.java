package com.aso.qe.test.stepdefinition.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.pageobject.ios.StorePickup;

import cucumber.api.java.en.Then;

public class StorePickupStepDef extends GlobalMobileHelper {
	
	StorePickup storePickup = new StorePickup(driver);

	@Then("^User navigated to find your nearest store page$")
	public void user_navigated_to_find_your_nearest_store_page() throws Throwable {
		storePickup.isFindNearestStorePageDisplayed();
	   
	}
	@Then("^User verifies \"([^\"]*)\" option is displayed on the screen$")
	public void user_verifies_option_is_displayed_on_the_screen(String option) throws Throwable {
	   storePickup.isOptionDisplayed(option);
	}

	@Then("^User taps on \"([^\"]*)\" option$")
	public void user_taps_on_option(String option) throws Throwable {
		storePickup.tapOnOption(option);
	
	}

	@Then("^User verifies location service popup is displayed$")
	public void user_verifies_location_service_popup_is_displayed() throws Throwable {
	 storePickup.isServicePopupDisplayed();
	}

}
