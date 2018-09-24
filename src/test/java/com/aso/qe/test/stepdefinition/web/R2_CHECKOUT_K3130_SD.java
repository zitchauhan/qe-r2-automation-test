package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CHECKOUT_K3130_SD extends CommonActionHelper {
	//private static final Logger logger = Logger.getLogger(R2_CHECKOUT_K3132_SD.class);
	
	R2_CheckOut_PO r2CheckOutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);

	
	@And("^user validates error msg displayed for all required fields$")
	public void user_validates_error_msg_displayed_for_all_required_fields() throws Throwable {
	
		r2CheckOutPo.billingAddressErrorMsgValidation();

	}


	@Then("^user clicks on the Review order button$")
	public void user_clicks_on_the_Review_order_button() throws Throwable {
		clickOnButton(r2CheckOutPo.ReviewOrder_Btn);
		Thread.sleep(10000);
	}
	
	@Then("user uncheck the checkbox for Billing address different from shipping address$")
	public void user_uncheck_the_checkbox_for_Billing_address_different_from_shipping_address() throws Throwable{
		
		clickOnButton(r2CheckOutPo.SameAsShippingAddress_checkBox);
	}


	@And("^user able to see the button place order$")
	public void user_able_to_see_the_button_place_order() throws Throwable{
		assertTrue(isDisplayed(r2CheckOutPo.btnPlaceOrderPaymentPage));
		assertTrue(clickOnButton(r2CheckOutPo.btnPlaceOrderPaymentPage));
	}
	
	@And("^user able to see error msgs for Phone Email Zip Address fields$")
	public void user_able_to_see_error_msgs_for_Phone_Email_Zip_Address_fields() throws Throwable{
		r2CheckOutPo.errormMsgValidationForInvalidZipPhoneEmail();
		
	}
	
}
