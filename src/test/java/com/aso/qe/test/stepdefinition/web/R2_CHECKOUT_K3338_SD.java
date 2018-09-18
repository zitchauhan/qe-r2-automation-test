package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K3338_SD extends CommonActionHelper {
	
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_MyAccount_PO r2_MyAccount_PO=PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R2_R1_Fun_PO r2_r1_fun_po=PageFactory.initElements(driver, R2_R1_Fun_PO.class);

	
	@Then("^Verify paypal button is clicked$")
	public void verify_paypal_button_is_clicked() throws Throwable {	
		assertTrue(clickOnButton(r2CheckOutPo.PayPalCheckOut_Btn));
		Thread.sleep(10000);
	}
}
