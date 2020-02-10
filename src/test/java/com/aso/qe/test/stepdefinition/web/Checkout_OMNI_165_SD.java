package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class Checkout_OMNI_165_SD extends CommonActionHelper {
	
	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_MyAccount_PO r2MyAccountPO = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R1_SearchProduct_PO r1_SearchPO = PageFactory.initElements(getDriver(), R1_SearchProduct_PO.class);
	
	@And("^user adds restricted shipment address on checkout page for \"(.*?)\" user$")
	public void user_adds_restricted_shipment_address_on_checkout_page_for_user(String arg1) throws Throwable {
		
		boolean userWithoutExistingShippingAddress = false;
		if (arg1.equalsIgnoreCase("newly registered") | arg1.equalsIgnoreCase("guest")
				| arg1.equalsIgnoreCase("unauthenticated"))
			userWithoutExistingShippingAddress = true;
		if (!(userWithoutExistingShippingAddress)) {
			if (!(isDisplayed(r2CheckOutPo.btnEditShippingAddress)))
				userWithoutExistingShippingAddress = true;
		}
		if (userWithoutExistingShippingAddress) {
			setInputText(r2CheckOutPo.inputCheckoutFirstName, webPropHelper.getTestDataProperty("FirstName"));
			setInputText(r2CheckOutPo.inputCheckoutLasttName, webPropHelper.getTestDataProperty("LastName"));
			setInputText(r2CheckOutPo.inputCheckoutPhoneNumber, r2MyAccountPO.generateRandomMobileNumber());
			setInputText(r2CheckOutPo.inputCheckoutAddress, webPropHelper.getTestDataProperty("Address"));
			clearText(r2CheckOutPo.inputCheckoutZipCode);
			setInputText(r2CheckOutPo.inputCheckoutZipCode, webPropHelper.getTestDataProperty("StateRestrictionZipList"));
			assertTrue(clickOnButton(r2CheckOutPo.btnGoToShippingMethod));
		}
		
	}
	
	@Then("^global restriction error message is displayed for \"(.*?)\" on \"(.*?)\" section$")
	public void global_restriction_error_message_is_displayed(String arg1, String arg2) throws Throwable {
		if(arg2 == "shipping")
		{
		String actualErrorMessage = (r2CheckOutPo.Shipping_StateRestriction_Message).getText();		
		String expectedErrorMessage = webPropHelper.getTestDataProperty("StateRestrictionMessage_Shipping");
		expectedErrorMessage.replace("CA", arg1);
		assertEquals(expectedErrorMessage, actualErrorMessage);
		}
		else if(arg2 == "payment")
		{
			String actualErrorMessage = (r2CheckOutPo.Payment_StateRestriction_Message).getText();		
			String expectedErrorMessage = webPropHelper.getTestDataProperty("StateRestrictionMessage_Payment");
			expectedErrorMessage.replace("CA", arg1);
			assertEquals(expectedErrorMessage, actualErrorMessage);
		}
	}
	
	
	@And("^user adds restricted billing address on checkout page$")
	public void user_adds_restricted_billing_address_on_checkout_page() throws Throwable {
		//InProgress
		clearText(r2CheckOutPo.FirstName_Input);
		clearText(r2CheckOutPo.LastName_Input);
		clearText(r2CheckOutPo.PhoneNumber_Input);
		clearText(r2CheckOutPo.Adderss_Input);
		clearText(r2CheckOutPo.ZipCode_Input);
		// clearText(r2CheckOutPo.EmailAddressforOrderConfirmation_Input);
		setInputText(r2CheckOutPo.FirstName_Input, webPropHelper.getTestDataProperty("FirstName"));
		setInputText(r2CheckOutPo.LastName_Input, webPropHelper.getTestDataProperty("LastName"));
		setInputText(r2CheckOutPo.PhoneNumber_Input, webPropHelper.getTestDataProperty("PhoneNumber"));
		setInputText(r2CheckOutPo.Adderss_Input, webPropHelper.getTestDataProperty("Address"));
		setInputText(r2CheckOutPo.ZipCode_Input, webPropHelper.getTestDataProperty("StateRestrictionZipList"));
		if (r1_SearchPO.verifyTextDisplayedOnPage("Email Address for Order Confirmation")) {
			setInputText(r2CheckOutPo.EmailAddressforOrderConfirmation_Input, webPropHelper.getTestDataProperty("EmailAddress"));
		}
	}

}
