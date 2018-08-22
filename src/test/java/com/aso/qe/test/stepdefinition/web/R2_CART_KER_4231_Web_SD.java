package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class R2_CART_KER_4231_Web_SD extends CommonActionHelper {
	R2_Cart_PO cartR2PageObj = PageFactory.initElements(driver, R2_Cart_PO.class);
	
	@Then("^user should be able to see In-Store Pick up enabled$")
	public void user_should_be_able_to_see_In_Store_Pick_up_enabled() throws Throwable {
		assertTrue(isEnabled(cartR2PageObj.rbInStorePickUp));
	}
	
	@Given("^user sets up a store for \"(.*?)\"$")
	public void user_sets_up_a_store_for(String arg1) throws Throwable {
	    cartR2PageObj.selectStore(webPropHelper.getTestDataProperty(arg1));
	}
	
}
