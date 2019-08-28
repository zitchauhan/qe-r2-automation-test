package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ES193 extends CommonActionHelper  {
	
	R2_Cart_PO r2CartPo = PageFactory.initElements(getDriver(), R2_Cart_PO.class);
	
		@Then("^Verify paypal button on Cart Page$")
		public void verify_paypal_button_on_Cart_Page() throws Throwable  {
			assertTrue(isDisplayed(r2CartPo.btnCartPaypal));
		   
		}
		

	}


