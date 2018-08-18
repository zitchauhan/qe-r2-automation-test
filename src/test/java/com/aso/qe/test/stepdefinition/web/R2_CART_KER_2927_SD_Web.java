package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.PDP_PO;
import com.aso.qe.test.pageobject.R2_CART_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CART_KER_2927_SD_Web extends CommonActionHelper {
	private static float taxDisplayed = 0.0f;

	GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	R2_CART_PO cartR2PageObj = PageFactory.initElements(driver, R2_CART_PO.class);

	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), PDP_PO.class);

	@When("^user navigates to checkout page$")
	public void user_navigates_to_checkout_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Then("^checkout page displays updated tax$")
	public void checkout_page_displays_updated_tax() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@When("^user switches the shipping to Store Pick up$")
	public void user_switches_the_shipping_to_Store_Pick_up() throws Throwable {
		cartR2PageObj.selectInStorPickUp();
	}

	@Given("^user makes a note of tax calculation$")
	public void user_makes_a_note_of_tax_calculation() throws Throwable {
		taxDisplayed = cartR2PageObj.getEstimatedTaxOnCartPage();

	}

	@When("^user increases products quantity$")
	public void user_increases_products_quantity() throws Throwable {
		cartR2PageObj.increaseQuantityOnCartPage(1);
	}

	@Then("^cart page displays updated tax$")
	public void cart_page_displays_updated_tax() throws Throwable {
		float currentTaxDisplayed = cartR2PageObj.getEstimatedTaxOnCartPage();
		assertTrue(taxDisplayed != currentTaxDisplayed);
	}

	@Given("^user selects Ship To Me radio button$")
	public void user_selects_Ship_To_Me_radio_button() throws Throwable {
		cartR2PageObj.selectShipToMe();
	}

}
