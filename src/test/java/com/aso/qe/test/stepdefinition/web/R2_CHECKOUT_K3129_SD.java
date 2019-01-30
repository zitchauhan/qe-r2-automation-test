package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CHECKOUT_K3129_SD extends CommonActionHelper {

	R2_CheckOut_PO r2CheckoutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);

	String cart,totalAmountCart;

	@Then("^User should verify the tax on cart order Summary page$")
	public void user_should_verify_the_tax_on_Checkout_order_Summary_page() throws Throwable {

		assertTrue(isDisplayed(r2CartPo.txtEstimatedTaxesCart));
		cart = r2CartPo.txtEstimatedTaxesCart.getText();
	}

	@Then("^User should have same tax on Checkout Page Order Summary$")
	public void user_should_have_same_tax_on_Checkout_Page_Order_Summary() throws Throwable {

		assertTrue(isDisplayed(r2CheckoutPo.TaxesPrice_Txt));
		String checkout = r2CheckoutPo.TaxesPrice_Txt.getText();
		assertEquals(cart, checkout);
	}

	@When("^user views tax in the Item Subtotal$")
	public void user_views_tax_in_the_Item_Subtotal() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtEstimatedShippingCart)); // txtEstimatedShipping
	}

	// CR-RKA 10-Oct
	@Given("^user click on continue shopping on item added successfully popup$")
	public void user_click_on_continue_shopping_on_item_added_successfully_popup() throws Throwable {
		clickOnButton(r2CartPo.continueShoppingItemSuccessufllyAddedPopUP);
	}
	
	@And("^user make the note of cart total amount$")
	public void user_make_the_note_of_cart_total_amount() {
		totalAmountCart=r2CartPo.txtTotal.getText();
	}
	
	@And("^user verify the total amount and tax in checkout page$")
	public void user_verify_the_total_amount_and_tax_in_checkout_page() {
		waitForElement(r2CheckoutPo.checkout_CheckoutHeader_txt);
		isDisplayed(r2CheckoutPo.checkout_CheckoutHeader_txt);
		String taxCheckout= r2CheckoutPo.taxAmountCheckout.getText();
		System.err.println("taxCheckout "+ taxCheckout+" cart "+cart);
		assertEquals(taxCheckout, cart);
		String checkoutAmount = r2CheckoutPo.totalAmountCheckout.getText();
		System.err.println("checkoutAmount "+ checkoutAmount+" totalAmountCart "+totalAmountCart);
		assertEquals(checkoutAmount, totalAmountCart);
		
	}
	
}
