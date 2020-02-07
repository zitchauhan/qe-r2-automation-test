package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.And;

public class Checkout_OMNI_2729_SD  extends CommonActionHelper  {

	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(getDriver(), R2_CheckOut_PO.class);
	
	String defaultCreditCard = "";
	
	@And("^user click on academy creditcard radiobtn$")
	public void user_click_on_academy_creditcard_radiobtn() throws Throwable {
		Thread.sleep(Constants.thread_medium);
		assertTrue(clickOnButton(r2CheckOutPo.Academy_CreditCard_radioBtn));
	    Thread.sleep(Constants.thread_high);
	}
		
}
