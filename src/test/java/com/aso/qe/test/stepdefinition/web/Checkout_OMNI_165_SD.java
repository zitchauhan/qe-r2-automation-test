package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
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
		if(arg2.equalsIgnoreCase("shipping"))
		{
			Thread.sleep(Constants.thread_medium);
			String actualErrorMessage = (r2CheckOutPo.Shipping_StateRestriction_Message).getText();		
			String expectedErrorMessage = webPropHelper.getTestDataProperty("StateRestrictionMessage_Shipping");
			expectedErrorMessage.replace("CA", arg1);
			assertEquals(expectedErrorMessage, actualErrorMessage);
			System.out.println("Correct Error message is displayed");
		}
		else if(arg2.equalsIgnoreCase("payment"))
		{
			Thread.sleep(Constants.thread_medium);
			String actualErrorMessage = (r2CheckOutPo.Payment_StateRestriction_Message).getText();		
			String expectedErrorMessage = webPropHelper.getTestDataProperty("StateRestrictionMessage_Payment");
			expectedErrorMessage.replace("CA", arg1);
			assertEquals(expectedErrorMessage, actualErrorMessage);
			System.out.println("Correct Error message is displayed");
		}
		else if(arg2.equalsIgnoreCase("myaccountaddress"))
		{
			Thread.sleep(Constants.thread_medium);
			String actualErrorMessage = (r2CheckOutPo.MyAccount_Address_RestrictionMsg).getText();		
			String expectedErrorMessage = webPropHelper.getTestDataProperty("StateRestrictionMessage_Shipping");
			expectedErrorMessage.replace("CA", arg1);
			assertEquals(expectedErrorMessage, actualErrorMessage);
			System.out.println("Correct Error message is displayed");
		}
		else if(arg2.equalsIgnoreCase("myaccountbilling"))
		{
			Thread.sleep(Constants.thread_medium);
			String actualErrorMessage = (r2CheckOutPo.Payment_StateRestriction_Message).getText();		
			String expectedErrorMessage = webPropHelper.getTestDataProperty("StateRestrictionMessage_Payment");
			expectedErrorMessage.replace("CA", arg1);
			assertEquals(expectedErrorMessage, actualErrorMessage);
			System.out.println("Correct Error message is displayed");
		}
		else
		{
			System.out.println("Error message not displayed");
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
	
	@And("^user adds restricted address on my account page$")
	public void user_adds_restricted_address_on_my_account_page() throws Throwable {
		if (isDisplayed(r2CheckOutPo.inputCheckoutFirstName)) {
			setInputText(r2CheckOutPo.inputCheckoutFirstName, webPropHelper.getTestDataProperty("FirstName"));
			setInputText(r2CheckOutPo.inputCheckoutLasttName, webPropHelper.getTestDataProperty("LastName"));
			setInputText(r2CheckOutPo.inputCheckoutPhoneNumber, r2MyAccountPO.generateRandomMobileNumber());
			setInputText(r2CheckOutPo.inputCheckoutAddress, webPropHelper.getTestDataProperty("Address"));
			clearText(r2CheckOutPo.inputCheckoutZipCode);
			setInputText(r2CheckOutPo.inputCheckoutZipCode, webPropHelper.getTestDataProperty("StateRestrictionZipList"));
			//assertTrue(clickOnButton(r2CheckOutPo.MyAccount_AddAddress));
		}
		else
		{
			
			System.out.println("Address section not visible");
		}
		
	}
	
	@And("^user clicks on \"(.*?)\" radio button$")
	public void user_clicks_on_radio_button(String tenderType)
	{
		if(tenderType.equalsIgnoreCase("CreditCard"))
		{
			if(isDisplayed(r2CheckOutPo.CreditCard_radioBtn))
			{
			(r2CheckOutPo.CreditCard_radioBtn).click();
			}
		}
	}
	
	@And("^user enters Card Holder name$")
	public void user_enters_Card_Holder_name() throws Throwable
	{
		String FirstName = "First_Name";
		Thread.sleep(Constants.thread_low);
		driver.switchTo().frame(r2CheckOutPo.NameField_Frame);
		setInputText(r2CheckOutPo.CardHolderName_Input, webPropHelper.getTestDataProperty(FirstName));
		driver.switchTo().defaultContent();
	}
	
	@And("user enter restricted ZipCode field in my account$")
	public void user_enter_restricted_ZipCode_field_in_my_account() throws Throwable
	{
		clearText(r2CheckOutPo.inputCheckoutZipCode);
		setInputText(r2CheckOutPo.inputCheckoutZipCode, webPropHelper.getTestDataProperty("StateRestrictionZipList"));
		Thread.sleep(Constants.thread_medium);
	}
	
	@And("^user clicks on edit in my account section$")
	public void user_clicks_on_edit_in_my_account_section() throws Throwable
	{
		Thread.sleep(Constants.thread_medium);
		assertTrue((r2CheckOutPo.MyAccount_Address_Edit).isDisplayed());
		(r2CheckOutPo.MyAccount_Address_Edit).click();
	}
	
	@And("^user enter restricted ZipCode field in billing section on checkout$")
	public void user_enter_restricted_ZipCode_field_in_billing_section_on_checkout() throws Throwable
	{
		clearText(r2CheckOutPo.inputCheckoutBillingZipCode);
		setInputText(r2CheckOutPo.inputCheckoutBillingZipCode, webPropHelper.getTestDataProperty("StateRestrictionZipList"));
		Thread.sleep(Constants.thread_medium);
		
	}
	

}
