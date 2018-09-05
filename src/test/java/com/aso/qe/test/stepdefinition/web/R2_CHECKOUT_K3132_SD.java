package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CHECKOUT_K3132_SD extends CommonActionHelper {
	//private static final Logger logger = Logger.getLogger(R2_CHECKOUT_K3132_SD.class);
	
	R2_CheckOut_PO r2CheckOutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);

	
	@Then("^user compare Shipping Address is same as Billing Address$")
	public void user_compare_Shipping_Address_is_same_as_Billing_Address() throws Throwable {
		
		
		r2CheckOutPo.verifyShippingAndBillingAddressAreSame();

	}
	
	@Then("^user fill the payment details$")
	public void user_fill_the_payment_details() throws Throwable {
	  
		waitForElement(r2CheckOutPo.CreditCardNumber_Input);
		setInputText(r2CheckOutPo.CreditCardNumber_Input, webPropHelper.getTestDataProperty("CreditCardNumber"));
	   setInputText(r2CheckOutPo.ExpirationDate_Input, webPropHelper.getTestDataProperty("ExpDate"));
	   setInputText(r2CheckOutPo.Cvv_Input, webPropHelper.getTestDataProperty("CVV"));
	   setInputText(r2CheckOutPo.EmailAddressforOrderConfirmation_Input, webPropHelper.getTestDataProperty("EmailAddress"));
	   assertTrue(clickOnButton(r2CheckOutPo.ReviewOrder_Btn));
	   Thread.sleep(10000);
	}
	
	@Then("^user click on edit Payment link and click on billing information$")
	public void user_click_on_edit_Payment_link_and_click_on_billing_information() throws Throwable {
	   assertTrue(clickOnButton(r2CheckOutPo.EditPayment_Link));
	   assertTrue(clickOnButton(r2CheckOutPo.ChangeBillingInformation_Txt));
	}


}
