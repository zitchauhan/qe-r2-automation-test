package com.aso.qe.test.stepdefinition.web;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.Then;

public class ES197_SD extends CommonActionHelper {
	
	R2_CheckOut_PO r2CheckOutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	
	@Then("^capture order summary in paypal$")
	public void capture_order_summary_in_paypal() throws Throwable {
	   
	}
	@Then("^capture order summary in checkout after arriving from paypal$")
	public void capture_order_summary_in_checkout_after_arriving_from_paypal() throws Throwable {
	    
	}
	@Then("^verify order summary in checkout should be same as in paypal$")
	public void verify_order_summary_in_checkout_should_be_same_as_in_paypal() throws Throwable {
	    
	}
		
	    
	}
