package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
//<<<<<<< Updated upstream
import static org.testng.Assert.assertFalse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
//import org.xbill.DNS.TXTRecord;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
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

public class R2_CART_K2927_SD extends CommonActionHelper 
{

	private static double taxDisplayed = 0.0f;
	private static double totalAmountDisplayed = 0.0f;

	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	R2_Cart_PO cartR2PageObj = PageFactory.initElements(driver, R2_Cart_PO.class);
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	R1_PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), R1_PDP_PO.class);
	R2_CheckOut_PO r2CheckOutPO = PageFactory.initElements(getDriver(), R2_CheckOut_PO.class);

	@When("^user navigates to checkout page$")
	public void user_navigates_to_checkout_page() throws Throwable {
		assertTrue(cartR2PageObj.clickOnCheckoutButton());
		waitForElement(r2CheckOutPO.txtEstimatedTax);
	}

	@Then("^checkout page displays updated tax$")
	public void checkout_page_displays_updated_tax() throws Throwable {
		double currentTaxDisplayed = r2CheckOutPO.getEstimatedTaxOnCheckoutPage();
		if(taxDisplayed != 0)
			assertTrue(taxDisplayed != currentTaxDisplayed);
	}
	
	@Then("^checkout page displays increased tax$")
	public void checkout_page_displays_increased_tax() throws Throwable {
		double currentTaxDisplayed = r2CheckOutPO.getEstimatedTaxOnCheckoutPage();
		assertTrue(taxDisplayed < currentTaxDisplayed);
	}

	@And("^user selects the ship to Store Pick up radio button$")
	@When("^user switches the shipping to Store Pick up$")
	public void user_switches_the_shipping_to_Store_Pick_up() throws Throwable {
		cartR2PageObj.selectInStorPickUp();
		getDriver().navigate().refresh();
	}

	@Given("^user makes a note of tax calculation$")
	public void user_makes_a_note_of_tax_calculation() throws Throwable {
		taxDisplayed = cartR2PageObj.getEstimatedTaxOnCartPage();
	}
	
	@Given("^user makes a note of tax and total amount$")
	public void user_makes_a_note_of_tax_and_total_amount() throws Throwable {
		taxDisplayed = cartR2PageObj.getEstimatedTaxOnCartPage();
		totalAmountDisplayed = cartR2PageObj.getTotaAmountOnCartPage();
	}
	
	

	@When("^user increases products quantity$")
	public void user_increases_products_quantity() throws Throwable {
		cartR2PageObj.increaseQuantityOnCartPage(1);
	}

	@Then("^cart page displays updated tax$")
	public void cart_page_displays_updated_tax() throws Throwable {
		double currentTaxDisplayed = cartR2PageObj.getEstimatedTaxOnCartPage();
		if(taxDisplayed != 0)
			assertTrue(taxDisplayed != currentTaxDisplayed);
	}
	
	@Then("^cart page displays increased tax$")
	public void cart_page_displays_increased_tax() throws Throwable {
		double currentTaxDisplayed = cartR2PageObj.getEstimatedTaxOnCartPage();
		assertTrue(taxDisplayed < currentTaxDisplayed);
	}

	@Given("^user switches from Store Pick up to Shipping$")
	@And("^user selects Ship To Me radio button$")
	public void user_selects_Ship_To_Me_radio_button() throws Throwable {
		cartR2PageObj.selectShipToMe();
		getDriver().navigate().refresh();
	}
	
	@When("^user decreases product quantity to zero$")
	public void user_decreases_product_quantity_to_zero() throws Throwable {
		setInputText(cartR2PageObj.input_Quantity, "0");
		tabInputBox(cartR2PageObj.input_Quantity);
		getDriver().navigate().refresh();
		waitForElement(cartR2PageObj.input_Quantity);
	}
	
	@Then("^estimated tax Is populated separately under Order Summary$")
	public void estimated_tax_Is_populated_separately_under_Order_Summary() throws Throwable {
		assertTrue(isDisplayed(cartR2PageObj.txtEstimatedTaxesCart));//txtEstimatedTax
	}

	@Then("^Total amount including Tax Is populated separately under Order Summary$")
	public void total_amount_including_Tax_Is_populated_separately_under_Order_Summary() throws Throwable {
	    assertTrue(isDisplayed(cartR2PageObj.txtTotal));
	}

	@Then("^user verifies estimated tax and total on checkout page$")
	public void user_verifies_estimated_tax_and_total_on_checkout_page() throws Throwable {
		waitForElement(r2CheckOutPO.TaxesPrice_Txt);
	    assertTrue(isDisplayed(r2CheckOutPO.TaxesPrice_Txt));
	    assertTrue(isDisplayed(r2CheckOutPO.txtTotal));
	}
	
	@Then ("^User navigates to L3 of women clothes$")
	public void User_navigates_to_L3() throws InterruptedException {
		if("mobile".equalsIgnoreCase(testtype)){
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeader.btnClothingCategory));
			Thread.sleep(2000);
			assertTrue(clickOnButton(r2SanityPo.AS_btnWomen_Clothing_Shop));
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeader.burgerMenu_GoToWomen_btn)); 
			Thread.sleep(2000);
			assertTrue(clickOnButton(r2SanityPo.AS_btnWomensTops_Women_Clothing_Shop));
			Thread.sleep(4000);
		}

	}
	
	@When("^user enters \"(.*?)\" in change zipcode field in cart page$")
	public void user_changes_zipcode_in_cart_page(String arg1) throws Throwable {
		assertTrue(clickOnButton(cartR2PageObj.lnkChangeZipCode));
		setInputText(cartR2PageObj.inputZipCode, webPropHelper.getTestDataProperty(arg1));
		assertTrue(clickOnButton(cartR2PageObj.btnCartSubmit));
	}
	
	@Then("^tax displayed on cart is greater than zero$")
	public void tax_displayed_on_cart_is_greater_than_zero() throws Throwable {
	    double estimatedTaxOnCartPage = cartR2PageObj.getEstimatedTaxOnCartPage();
	    assertTrue(estimatedTaxOnCartPage > 0);
	}

	@Then("^tax and total amount displayed in checkout page is same as cart page$")
	public void tax_displayed_in_checkout_page_is_same_as_cart_page() throws Throwable {
	    double taxOnCheckOutPage = r2CheckOutPO.getEstimatedTaxOnCheckoutPage();
	    double totalAmountOnCheckOutPage = r2CheckOutPO.getTotalAmountOnCheckoutPage();
//	    System.out.println("taxDisplayed ==" + taxDisplayed +" taxOnCheckOutPage = " + taxOnCheckOutPage);
//	    System.out.println("totalAmountDisplayed ==" + totalAmountDisplayed +" totalAmountOnCheckOutPage = " + totalAmountOnCheckOutPage);
	    assertTrue(taxDisplayed == taxOnCheckOutPage);
	    assertTrue(totalAmountDisplayed == totalAmountOnCheckOutPage);
	}

	


}
