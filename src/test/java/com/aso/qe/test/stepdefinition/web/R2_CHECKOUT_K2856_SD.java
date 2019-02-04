package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_OrderConfirmation_Po;

import cucumber.api.java.en.And;

public class R2_CHECKOUT_K2856_SD extends CommonActionHelper {
	
	R2_OrderConfirmation_Po orderConfirmation = PageFactory.initElements(driver, R2_OrderConfirmation_Po.class);

	R2_CheckOut_PO r2CheckoutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	
	@And("^user should be able to see the create an account section$")
	public void user_should_be_able_to_see_the_create_an_account_section() {
		assertTrue(isDisplayed(orderConfirmation.createAnAccountOrderConfirmation));
	}
	
	@And("^user should be able to see in store pickup instruction$")
	public void use_should_be_able_to_see_in_store_pickup_instruction() {
		assertTrue(isDisplayed(orderConfirmation.inStorePickUpOrderConfirmation));
	}
	
	@And("^user should be able to see in store pickup details$")
	public void user_should_be_able_to_see_in_store_pickup_details() {
		assertTrue(isDisplayed(orderConfirmation.paymentOrderConfirmation));
	}
	
	@And("^user should be able to see the payment details$")
	public void user_should_be_able_to_see_the_payment_details() {
		assertTrue(isDisplayed(orderConfirmation.paymentOrderConfirmation));
	}
}
