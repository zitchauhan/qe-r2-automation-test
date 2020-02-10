package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.And;

public class Checkout_OMNI_2730_SD extends CommonActionHelper {

	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(getDriver(), R2_CheckOut_PO.class);
	
	@And("^user click on creditcard radiobtn$")
	public void user_click_on_creditcard_radiobtn() throws Throwable {
		Thread.sleep(Constants.thread_medium);
		assertTrue(clickOnButton(r2CheckOutPo.CreditCard_radioBtn));
	    Thread.sleep(Constants.thread_high);
	}
	
}
