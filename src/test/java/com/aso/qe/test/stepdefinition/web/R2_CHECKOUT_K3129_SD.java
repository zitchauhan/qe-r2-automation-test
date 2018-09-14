package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CHECKOUT_K3129_SD extends CommonActionHelper {
	
	R2_CheckOut_PO r2CheckoutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	
	String cart;
	@Then("^User should verify the tax on cart order Summary page$")
	public void user_should_verify_the_tax_on_Checkout_order_Summary_page() throws Throwable {
		
		assertTrue(isDisplayed(r2CartPo.txtEstimatedTaxesCart)); 
		cart=r2CartPo.txtEstimatedTaxesCart.getText();
	}
	

	
	@Then("^User should have same tax on Checkout Page Order Summary$")
	public void user_should_have_same_tax_on_Checkout_Page_Order_Summary() throws Throwable {
		
		assertTrue(isDisplayed(r2CheckoutPo.TaxesPrice_Txt)); 
	   String checkout= r2CheckoutPo.TaxesPrice_Txt.getText();
	   assertEquals(cart,checkout);
	}
	@When("^user views tax in the Item Subtotal$")
	public void user_views_tax_in_the_Item_Subtotal() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtEstimatedShippingCart)); // txtEstimatedShipping
	}

	
}
