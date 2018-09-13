package com.aso.qe.test.stepdefinition.web;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K3139_SD extends CommonActionHelper {
	R2_CheckOut_PO r2CheckOutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);

	@Then("^user able to see error msg for the unrecongnised credit card$")
	public void user_able_to_see_error_msg_for_the_unrecongnised_credit_card() throws Throwable {
		assertTrue(isDisplayed(r2CheckOutPo.UnrecognizedCardNumber_Txt));
	}
	

	@Then("^user enters invalid expiration date and validated error msg$")
	public void user_enters_invalid_expiration_date_and_validated_error_msg() throws Throwable {
		setInputText(r2CheckOutPo.txtExpirationDateInput, webPropHelper.getTestDataProperty("InvalidExpirationDate"));
		assertTrue(clickOnButton(r2CheckOutPo.ReviewOrder_Btn));
		
		assertTrue(isDisplayed(r2CheckOutPo.PastExpirationDate_Txt));
	}
	
	@Then("^user enter invalid non existent expiration date and verifies error msg$")
	public void user_enter_invalid_non_existent_expiration_date_and_verifies_error_msg() throws Throwable {
		setInputText(r2CheckOutPo.txtExpirationDateInput, webPropHelper.getTestDataProperty("UnrecongnisedExpirationDate"));
		assertTrue(clickOnButton(r2CheckOutPo.ReviewOrder_Btn));
		assertTrue(isDisplayed(r2CheckOutPo.unrecognizedExpirationDate_Txt));
	}

	@Then("^user enteres invalid CVV and validates the error msg$")
	public void user_enteres_invalid_CVV_and_validates_the_error_msg() throws Throwable {
		setInputText(r2CheckOutPo.txtCVVInput, webPropHelper.getTestDataProperty("UnrecongnisedExpirationDate"));
		assertTrue(clickOnButton(r2CheckOutPo.ReviewOrder_Btn));
		assertTrue(isDisplayed(r2CheckOutPo.PleaseEnteRaValidSecurityCode_Txt));
	}
	

}
