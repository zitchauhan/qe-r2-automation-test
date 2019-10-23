package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;

import cucumber.api.java.en.Then;

public class Checkout_OMNI_167_SD extends CommonActionHelper {
	
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	
	@Then("^verify discount is displayed$")
	public void verify_discount_is_applied() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.orderCnfDiscount_Txt));// txtPromocode
		} 

}
