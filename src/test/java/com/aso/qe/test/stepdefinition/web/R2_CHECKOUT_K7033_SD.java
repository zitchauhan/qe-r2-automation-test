package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

	
	public class R2_CHECKOUT_K7033_SD extends CommonActionHelper {
		
		R2_CheckOut_PO r2CheckoutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
		
	@When("^user does accepts the firearm specific compliance$")
	public void user_does_accepts_the_firearm_specific_compliance() throws Throwable {
		Thread.sleep(4000);
			Actions hover =new Actions(driver);
			hover.moveToElement(r2CheckoutPo.selectShipToStore).click().build().perform();
			//assertTrue(clickOnButton(r2CheckoutPo.ShipToStoreforSOF_compliance_Txt));
		    
		}

		@When("^user clicks on Continue button$")
		public void user_clicks_on_Continue_button() throws Throwable {
			assertTrue(clickOnButton(r2CheckoutPo.ShipToStoreforSOF_Payment_Btn));			
		    
		}

		@Then("^verify that user navigates to payment drawer$")
		public void verify_that_user_navigates_to_payment_drawer() throws Throwable {
			
			assertTrue(isDisplayed(r2CheckoutPo.PaymentMethodHeader_Txt));
		    
		}
	}
	


