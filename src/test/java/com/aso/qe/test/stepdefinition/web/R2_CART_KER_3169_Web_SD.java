package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;


import cucumber.api.java.en.Then;


public class R2_CART_KER_3169_Web_SD extends CommonActionHelper {

	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	
	@Then("^verify proper validation message and Promo code discount should not applied$")
	public void verify_proper_validation_message_and_Promo_code_discount_should_not_applied() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtInvalidPromo));
		assertFalse(isDisplayed(r2CartPo.txtPromocode));
	}
	

}
