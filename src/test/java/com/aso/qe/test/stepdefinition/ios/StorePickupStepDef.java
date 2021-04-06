package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
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
	
	@Then("^User sees list of stores$")
	public void user_sees_list_of_stores() throws Throwable {
		storePickup.verifyStoreList();
	}
	
	@Then("^User sees availability message with each store$")
	public void user_sees_availability_message_with_each_store() throws Throwable {
		storePickup.isAvailibilityMessageDisplayed();
	}
	
	@Then("^User sees the error message$")
	public void user_sees_the_error_message() throws Throwable {
		storePickup.verifyErrorMessage();
	}
	
	@Then("^User selects the store (\\d+)$")
	public void user_selects_the_store(int storeNumber) throws Throwable {
		storePickup.selectStore(storeNumber);
	}

	@Then("^User taps on details link of store (\\d+)$")
	public void user_taps_on_details_link_of_store(int storeNumber) throws Throwable {
		storePickup.tapsOnDetailsLink(storeNumber);
	}
	    

	@Then("^User sees address on deatils page$")
	public void user_sees_address_on_deatils_page() throws Throwable {
		GlobalMobileHelper.setImplicitWaitTo(driver, 5);
	    assertTrue("Address is not available on details page",GlobalMobileHelper.isElementDisplayed(Locators.storePickup.addressOnDetailsPage));
	}

	@Then("^User sees phone no on details page$")
	public void user_sees_phone_no_on_details_page() throws Throwable {
		GlobalMobileHelper.setImplicitWaitTo(driver, 5);
		assertTrue("Phone number is not available on details page",GlobalMobileHelper.isElementDisplayed(Locators.storePickup.phoneNumOnDetailsPage));
	}

	@Then("^User sees the store hours on details page$")
	public void user_sees_the_store_hours_on_details_page() throws Throwable {
		GlobalMobileHelper.setImplicitWaitTo(driver, 5);
		assertTrue("Store hours not available on details page",GlobalMobileHelper.isElementDisplayed(Locators.storePickup.storeHoursOnDetailsPage));   
	}

	@Then("^User verifies Make my store button is \"([^\"]*)\"$")
	public void user_verifies_Make_my_store_button_is(String visibility) throws Throwable {
		GlobalMobileHelper.setImplicitWaitTo(driver, 5);
	   if(visibility.equalsIgnoreCase("enabled"))
		   assertTrue("Make my store button is not enabled",driver.findElement(Locators.storePickup.makeMyStoreOnDetailsPage).isEnabled());   
	   else
		   assertFalse("Make my store button is enabled",driver.findElement(Locators.storePickup.makeMyStoreOnDetailsPage).isEnabled());   
	   }

	@Then("^User sees \"([^\"]*)\" option on store details page$")
	public void user_sees_option(String arg1) throws Throwable {
		storePickup.verifyOptionsOnDetailsPage(arg1);
	}
	
	@Then("^User taps on \"([^\"]*)\" on store details page$")
	public void user_taps_on_on_store_details_page(String str) throws Throwable {
		storePickup.navigateTo(str);
	}

}
