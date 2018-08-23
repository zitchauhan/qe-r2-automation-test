package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class R2_CHECKOUT_KER_6962_Web_SD extends CommonActionHelper{

	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	
	@Given("^applied gift card \"(.*?)\" should be displayed$")
	public void applied_gift_card_should_be_displayed(String arg1) throws Throwable {
	    assertTrue(getText(r2CheckOutPo.txtGiftCardAppliedSuccessMessage).contains((webPropHelper.getTestDataProperty(arg1))));
	}

	@Then("^Remove option is displayed to user$")
	public void remove_option_is_displayed_to_user() throws Throwable {
	    assertTrue(isDisplayed(r2CheckOutPo.btnRemoveGiftCard));
	}
	
}
