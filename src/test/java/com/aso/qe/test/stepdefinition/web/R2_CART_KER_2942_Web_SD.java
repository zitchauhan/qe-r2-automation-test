package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R2_CART_KER_2942_Web_SD extends CommonActionHelper {

	
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	

	@And("^User should be able to see the updated Order Summary$")
	public void user_should_be_able_to_see_the_updated_Order_Summary() throws Throwable {

	}

	@And("^updated promotions/discount as per the updated cart should be displayed$")
	public void updated_promotions_discount_as_per_the_updated_cart_should_be_displayed() throws Throwable {

	}

	@And("^Item is removed from the cart$")
	public void item_is_removed_from_the_cart() throws Throwable {

	}

	@Then("^Verify cart is empty$")
	public void verify_cart_is_empty() throws Throwable {
		assertTrue(isDisplayed(r2SanityPo.AS_txtYourCart));
	}
	
	@Then("^verify the Remove Quantity link$")
	public void verify_the_Remove_Quantity_link() throws Throwable {
		assertTrue(isDisplayed(r2SanityPo.AS_btnRemoveFromCart));
		
	}
	
	@And("^user updates the product \"(.*?)\" on PDP to four$")
	public void user_updates_the_product_on_PDP_to_four(String arg1) throws Throwable {
		Thread.sleep(5000);
		clearInputBox(r2CartPo.R2_iconQuantityIncrease);
		setInputText(r2CartPo.R2_iconQuantityIncrease, webPropHelper.getTestDataProperty(arg1));
		Thread.sleep(20000);
	}



}
