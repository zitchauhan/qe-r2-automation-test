package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Checkout_OMNI_2731_SD  extends CommonActionHelper {

	R2_MyAccount_PO r2_myaccount_PO = PageFactory.initElements(driver, R2_MyAccount_PO.class);

	@Then("^validate the radio button Academy Credit Card and Credit Card$")
	public void validate_the_radio_button_Academy_Credit_Card_and_Credit_Card() throws Throwable {
   
	assertTrue(isDisplayed(r2_myaccount_PO.plcc_Radio_Button));
	assertTrue(isDisplayed(r2_myaccount_PO.cc_Radio_Button));
	}

	@Then("^user now adds the \"([^\"]*)\"$")
	public void user_now_adds_the(String arg1) throws Throwable {
	 if (arg1.equalsIgnoreCase("Academy Credit Card"))
	 {
		 if (isDisplayed(r2_myaccount_PO.plcc_Radio_Button))
			{ 
			waitForElement(r2_myaccount_PO.plcc_Radio_Button);
			clickOnRadioButton(r2_myaccount_PO.plcc_Radio_Button);
						
			/*waitForElement(r2_myaccount_PO.plccCreditCardTextBox);
			assertTrue(isDisplayed(r2_myaccount_PO.plccCreditCardTextBox));
			setInputText(r2_myaccount_PO.plccCreditCardTextBox,webPropHelper.getTestDataProperty("CardVISA"));
			tabInputBox(r2_myaccount_PO.plccCreditCardTextBox);
			
			waitForElement(r2_myaccount_PO.plccErrorUnrecognizedCardNo);
			assertTrue(isDisplayed(r2_myaccount_PO.plccErrorUnrecognizedCardNo));*/

			waitForElement(r2_myaccount_PO.plccCreditCardTextBox);
			clearInputBox(r2_myaccount_PO.plccCreditCardTextBox);
			setInputText(r2_myaccount_PO.plccCreditCardTextBox,webPropHelper.getTestDataProperty("CardPlcc"));
			
			waitForElement(r2_myaccount_PO.plccLogoImg);
			assertTrue(isDisplayed(r2_myaccount_PO.plccLogoImg));
						
			waitForElement(r2_myaccount_PO.billingAddressFirstName);
			assertTrue(isDisplayed(r2_myaccount_PO.billingAddressFirstName));
			setInputText(r2_myaccount_PO.billingAddressFirstName,webPropHelper.getTestDataProperty("plccBillingFirstName"));
			
			
			waitForElement(r2_myaccount_PO.billingAddressLastName);
			assertTrue(isDisplayed(r2_myaccount_PO.billingAddressLastName));
			setInputText(r2_myaccount_PO.billingAddressLastName,webPropHelper.getTestDataProperty("plccBillingLastName"));
			
			waitForElement(r2_myaccount_PO.billingAddressAddress);
			assertTrue(isDisplayed(r2_myaccount_PO.billingAddressAddress));
			setInputText(r2_myaccount_PO.billingAddressAddress,webPropHelper.getTestDataProperty("plccBillingAddress"));
			
			waitForElement(r2_myaccount_PO.billingAddressZipCode);
			assertTrue(isDisplayed(r2_myaccount_PO.billingAddressZipCode));
			setInputText(r2_myaccount_PO.billingAddressZipCode,webPropHelper.getTestDataProperty("plccBillingZipCode"));
			
			waitForElement(r2_myaccount_PO.billingPhoneNumber);
			assertTrue(isDisplayed(r2_myaccount_PO.billingPhoneNumber));		
			setInputText(r2_myaccount_PO.billingPhoneNumber,webPropHelper.getTestDataProperty("Phone_Number"));
			
			waitForElement(r2_myaccount_PO.addAccButton);
			assertTrue(isDisplayed(r2_myaccount_PO.addAccButton));		
			clickOnButton(r2_myaccount_PO.addAccButton);
			
			if(isDisplayed(r2_myaccount_PO.AVS_Modal))
			{
				assertTrue(isDisplayed(r2_myaccount_PO.MyAccountSuggestedAddress));
				clickOnButton(r2_myaccount_PO.MyAccountSuggestedAddress);
				
			}
			}
		 
	 }
	 

	 
		 else if (arg1.equalsIgnoreCase("Credit Card")) {
			 	
			 	waitForElement(r2_myaccount_PO.cc_Radio_Button);	 	
			 	getDriver().switchTo().frame(r2_myaccount_PO.CardHolderNameFrame);
			 	//waitForElement(r2_myaccount_PO.ccCardHolderName);
			 	setInputText(r2_myaccount_PO.ccCardHolderName, webPropHelper.getTestDataProperty("CardholderName"));
			 	getDriver().switchTo().defaultContent();
			 	
			 	getDriver().switchTo().frame("first-data-payment-field-card");
			 	//waitForElement(r2_myaccount_PO.ccCreditCardNumber);
				setInputText(r2_myaccount_PO.ccCreditCardNumber,webPropHelper.getTestDataProperty("CreditCardNumber"));
				getDriver().switchTo().defaultContent();
				assertTrue(isDisplayed(r2_myaccount_PO.ccLogoImg));
				
				getDriver().switchTo().frame("first-data-payment-field-exp");
				//waitForElement(r2_myaccount_PO.ccCreditCardExpiry);
				setInputText(r2_myaccount_PO.ccCreditCardExpiry,webPropHelper.getTestDataProperty("ExpDate"));
				getDriver().switchTo().defaultContent();
				
				getDriver().switchTo().frame("first-data-payment-field-cvv");
				//waitForElement(r2_myaccount_PO.ccCreditCardCvv);
				setInputText(r2_myaccount_PO.ccCreditCardCvv,webPropHelper.getTestDataProperty("CVV"));
				getDriver().switchTo().defaultContent();				
		    	
				assertTrue(isDisplayed(r2_myaccount_PO.billingAddressFirstName));
				setInputText(r2_myaccount_PO.billingAddressFirstName,webPropHelper.getTestDataProperty("FirstName"));

				assertTrue(isDisplayed(r2_myaccount_PO.billingAddressLastName));
				setInputText(r2_myaccount_PO.billingAddressLastName,webPropHelper.getTestDataProperty("LastName"));

				assertTrue(isDisplayed(r2_myaccount_PO.billingAddressAddress));
				setInputText(r2_myaccount_PO.billingAddressAddress,webPropHelper.getTestDataProperty("Address"));

				assertTrue(isDisplayed(r2_myaccount_PO.billingAddressZipCode));
				setInputText(r2_myaccount_PO.billingAddressZipCode,webPropHelper.getTestDataProperty("zip_1"));
				
				assertTrue(isDisplayed(r2_myaccount_PO.billingPhoneNumber));
				setInputText(r2_myaccount_PO.billingPhoneNumber,webPropHelper.getTestDataProperty("Phone_Number"));
				
				clickOnButton(r2_myaccount_PO.PaymentPage_AddCreditCard_Add_btn);
				Thread.sleep(Constants.thread_medium);
				
				if(isDisplayed(r2_myaccount_PO.AVS_Modal))
				{
					assertTrue(isDisplayed(r2_myaccount_PO.MyAccountSuggestedAddress));
					clickOnButton(r2_myaccount_PO.MyAccountSuggestedAddress);
					
				}
				
				
		 }
	 }


	@Then("^validate the acc card added$")
	public void validate_the_acc_card_added() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	waitForElement(r2_myaccount_PO.plccValidateName);
	assertTrue(isDisplayed(r2_myaccount_PO.plccValidateName));
	
	}

	@Then("^user validates the \"([^\"]*)\"$")
	public void user_validates_the(String arg1) throws Throwable {
		if (arg1.equalsIgnoreCase("Academy Credit Card"))
		{
			waitForElement(r2_myaccount_PO.plcc_Radio_Button);
			if (isDisplayed(r2_myaccount_PO.plcc_Radio_Button))
			{ 
				clickOnRadioButton(r2_myaccount_PO.plcc_Radio_Button);
					
//		waitForElement(r2_myaccount_PO.plccCreditCardTextBox);
//		assertTrue(isDisplayed(r2_myaccount_PO.plccCreditCardTextBox));
//		setInputText(r2_myaccount_PO.plccCreditCardTextBox,webPropHelper.getTestDataProperty("CardVISA"));
//		tabInputBox(r2_myaccount_PO.plccCreditCardTextBox);
//		
//		waitForElement(r2_myaccount_PO.plccErrorUnrecognizedCardNo);
//		assertTrue(isDisplayed(r2_myaccount_PO.plccErrorUnrecognizedCardNo));

		waitForElement(r2_myaccount_PO.plccCreditCardTextBox);
		clearInputBox(r2_myaccount_PO.plccCreditCardTextBox);
		setInputText(r2_myaccount_PO.plccCreditCardTextBox,webPropHelper.getTestDataProperty("ValidPLCCCard"));
		
		waitForElement(r2_myaccount_PO.plccLogoImg);
		assertTrue(isDisplayed(r2_myaccount_PO.plccLogoImg));
					
		waitForElement(r2_myaccount_PO.billingAddressFirstName);
		assertTrue(isDisplayed(r2_myaccount_PO.billingAddressFirstName));
		
		
		waitForElement(r2_myaccount_PO.billingAddressLastName);
		assertTrue(isDisplayed(r2_myaccount_PO.billingAddressLastName));
		
		
		waitForElement(r2_myaccount_PO.billingAddressAddress);
		assertTrue(isDisplayed(r2_myaccount_PO.billingAddressAddress));
		
		
		waitForElement(r2_myaccount_PO.billingAddressZipCode);
		assertTrue(isDisplayed(r2_myaccount_PO.billingAddressZipCode));
		
		
		waitForElement(r2_myaccount_PO.billingPhoneNumber);
		assertTrue(isDisplayed(r2_myaccount_PO.billingPhoneNumber));			
		}
		}
		else if (arg1.equalsIgnoreCase("Credit Card"))
		{
			waitForElement(r2_myaccount_PO.cc_Radio_Button);
	 	if (isDisplayed(r2_myaccount_PO.cc_Radio_Button))
		{ 
			
			clickOnRadioButton(r2_myaccount_PO.cc_Radio_Button);
			
			waitForElement(r2_myaccount_PO.ccCardHolderName);
			assertTrue(isDisplayed(r2_myaccount_PO.ccCardHolderName));

			assertTrue(isDisplayed(r2_myaccount_PO.ccCreditCardNumber));
			//driver.switchTo().defaultContent();

			waitForElement(r2_myaccount_PO.ccCreditCardExpiry);
			assertTrue(isDisplayed(r2_myaccount_PO.ccCreditCardExpiry));
			
			assertTrue(isDisplayed(r2_myaccount_PO.ccCreditCardCvv));
			
		}
 }

}
}

