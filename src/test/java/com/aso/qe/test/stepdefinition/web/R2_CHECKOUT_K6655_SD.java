package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_PDP_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CHECKOUT_K6655_SD extends CommonActionHelper {
	
	
	R2_PDP_PO r2PdpPo = PageFactory.initElements(driver, R2_PDP_PO.class);
	
	
	@Then("^Verify that Enable Buy Now button is displayed on PDP$")
	public void verify_that_Enable_Buy_Now_button_is_displayed_on_PDP() throws Throwable {
		
		assertTrue(isDisplayed(r2PdpPo.EnableBuyNow_btn));
	}
	
	@When("^User clicks on Enable Buy Now button$")
	public void user_clicks_on_Enable_Buy_Now_button() throws Throwable {
		assertTrue(clickOnButton(r2PdpPo.EnableBuyNow_btn));
	}
	
	@Then("^user should not able to see the Enable BUY NOW button on the PDP$")
	public void user_should_not_able_to_see_the_Enable_BUY_NOW_button_on_the_PDP() throws Throwable {
		
		assertFalse(isDisplayed(r2PdpPo.EnableBuyNow_btn));
	}

}
