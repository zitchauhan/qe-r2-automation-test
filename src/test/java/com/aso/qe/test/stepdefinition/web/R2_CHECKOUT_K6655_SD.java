package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K6655_SD extends CommonActionHelper {
	
	
	R2_R1_Fun_PO r2R1FunPO = PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	
	
	@Then("^Verify that Enable Buy Now button is displayed on PDP$")
	public void verify_that_Enable_Buy_Now_button_is_displayed_on_PDP() throws Throwable {
		
		assertTrue(isDisplayed(r2R1FunPO.EnableBuyNow_btn));
	}

}
