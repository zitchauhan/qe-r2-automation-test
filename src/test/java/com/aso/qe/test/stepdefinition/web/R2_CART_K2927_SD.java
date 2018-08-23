package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
//<<<<<<< Updated upstream
import static org.testng.Assert.assertFalse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.PDP_PO;
//<<<<<<< Updated upstream
import com.aso.qe.test.pageobject.R2_Cart_PO;
//import com.aso.qe.test.pageobject.R2_CheckOut_PO;
//=======
//import com.aso.qe.test.pageobject.R2_CART_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
//>>>>>>> Stashed changes
import com.aso.qe.test.pageobject.R2_Sanity_PO;

//=======
//import static org.junit.Assert.assertFalse;
//
import org.apache.log4j.Logger;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.PageFactory;
//
//import com.aso.qe.framework.common.CommonActionHelper;
//import com.aso.qe.test.pageobject.Cart_PO_R2;
//import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
//import com.aso.qe.test.pageobject.PDP_PO;
//import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.And;
//>>>>>>> Stashed changes
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CART_K2927_SD extends CommonActionHelper {
//<<<<<<< Updated upstream

	private static float taxDisplayed = 0.0f;

	GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	R2_Cart_PO cartR2PageObj = PageFactory.initElements(driver, R2_Cart_PO.class);
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), PDP_PO.class);
	R2_CheckOut_PO r2CheckOutPO = PageFactory.initElements(getDriver(), R2_CheckOut_PO.class);

	@When("^user navigates to checkout page$")
	public void user_navigates_to_checkout_page() throws Throwable {
		assertTrue(cartR2PageObj.clickOnCheckoutButton());
		waitForElement(r2CheckOutPO.txtEstimatedTax);
	}

	@Then("^checkout page displays updated tax$")
	public void checkout_page_displays_updated_tax() throws Throwable {
		float currentTaxDisplayed = r2CheckOutPO.getEstimatedTaxOnCheckoutPage();
		assertTrue(taxDisplayed != currentTaxDisplayed);
	}
	
	@Then("^checkout page displays increased tax$")
	public void checkout_page_displays_increased_tax() throws Throwable {
		float currentTaxDisplayed = r2CheckOutPO.getEstimatedTaxOnCheckoutPage();
		assertTrue(taxDisplayed < currentTaxDisplayed);
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
	
	@Then("^cart page displays increased tax$")
	public void cart_page_displays_increased_tax() throws Throwable {
		float currentTaxDisplayed = cartR2PageObj.getEstimatedTaxOnCartPage();
		assertTrue(taxDisplayed < currentTaxDisplayed);
	}

	@Given("^user selects Ship To Me radio button$")
	public void user_selects_Ship_To_Me_radio_button() throws Throwable {
		cartR2PageObj.selectShipToMe();
	}
	
	@When("^user decreases product quantity to zero$")
	public void user_decreases_product_quantity_to_zero() throws Throwable {
		setInputText(cartR2PageObj.txtQuantity, "0");
		tabInputBox(cartR2PageObj.txtQuantity);
		getDriver().navigate().refresh();
		waitForElement(cartR2PageObj.txtQuantity);
	}
	
	@Then("^estimated tax Is populated separately under Order Summary$")
	public void estimated_tax_Is_populated_separately_under_Order_Summary() throws Throwable {
		assertTrue(isDisplayed(cartR2PageObj.txtEstimatedTax));
	}

	@Then("^Total amount including Tax Is populated separately under Order Summary$")
	public void total_amount_including_Tax_Is_populated_separately_under_Order_Summary() throws Throwable {
	    assertTrue(isDisplayed(cartR2PageObj.txtTotal));
	}

	@Then("^user verifies estimated tax and total on checkout page$")
	public void user_verifies_estimated_tax_and_total_on_checkout_page() throws Throwable {
	    assertTrue(isDisplayed(r2CheckOutPO.txtEstimatedTax));
	    assertTrue(isDisplayed(r2CheckOutPO.txtTotal));
	}


	@When("^user switches from Store Pick up to Shipping$")
	public void user_switches_from_Store_Pick_up_to_Shipping() throws Throwable {

	}
}
