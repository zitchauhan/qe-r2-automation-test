package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ES196_SD extends CommonActionHelper {
	
	R2_CheckOut_PO r2CheckOutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	
	@Then("^verify state restriction message in checkout page$")
	public void verify_state_restriction_message_in_checkout_page() throws Throwable {
		Thread.sleep(2000);
		Assert.assertTrue(isDisplayed(r2CheckOutPo.shippingerrormessage));
		
	    
	}
}
		