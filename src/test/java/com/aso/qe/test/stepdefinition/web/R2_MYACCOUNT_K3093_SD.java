package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.Given;

public class R2_MYACCOUNT_K3093_SD extends CommonActionHelper {
	
	R2_MyAccount_PO myAccountPo= PageFactory.initElements(driver, R2_MyAccount_PO.class);
	
	@Given("^user clicks on payment tab$")
	public void user_clicks_on_payment_tab() throws Throwable {
	    assertTrue(clickOnButton(myAccountPo.lnkPayment));
	}
	
	@Given("^user clicks on Add New Gift Card button$")
	public void user_clicks_on_Add_New_Gift_Card_button() throws Throwable {
		assertTrue(clickOnButton(myAccountPo.btnAddNewGiftCard));
	}

}
