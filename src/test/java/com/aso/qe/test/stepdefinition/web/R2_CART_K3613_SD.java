package com.aso.qe.test.stepdefinition.web;



import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CART_K3613_SD extends CommonActionHelper {
	
	R2_Cart_PO r2CartPO=PageFactory.initElements(driver, R2_Cart_PO.class);
	
	@When("^clicks on the Select Store link in the header$")
	public void clicks_on_the_Select_Store_link_in_the_header() throws Throwable {
		assertTrue(clickOnButton(r2CartPO.linkStoreLocator));		
	}

	@Then("^user should be able to see the Find a Store modal prompting up$")
	public void user_should_be_able_to_see_the_Find_a_Store_modal_prompting_up() throws Throwable {
		assertTrue(isDisplayed(r2CartPO.fieldStoreModal));		
	}
	
	@Then("^user enters ZIP \"(.*?)\" code manually in the search input bar$")
	public void user_enters_ZIP_code_manually_in_the_search_input_bar(String zipcode) throws Throwable {
		waitForElement(r2CartPO.textzipCode);
		setInputText(r2CartPO.textzipCode,  webPropHelper.getTestDataProperty(zipcode));
	}

	@Then("^Clicks submit button$")
	public void clicks_submit_button() throws Throwable {
		assertTrue(clickOnButton(r2CartPO.submitZipCode));		
	}

	@Then("^store results should get displayed on the basis of ZIPCode entered$")
	public void store_results_should_get_displayed_on_the_basis_of_ZIPCode_entered() throws Throwable {
		assertTrue(isDisplayed(r2CartPO.storeDetails));
		Thread.sleep(5000);
		
	}

}
