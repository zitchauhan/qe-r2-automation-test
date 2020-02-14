package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_PDP_PO;
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


@Then("^user validates the \"([^\"]*)\"$")
public void user_validates_the(String arg1) throws Throwable {
 if (arg1.equalsIgnoreCase("Academy Credit Card"))
 {
	 if (isDisplayed(r2_myaccount_PO.plcc_Radio_Button))
		{ 
		waitForElement(r2_myaccount_PO.plcc_Radio_Button);
		clickOnRadioButton(r2_myaccount_PO.plcc_Radio_Button);
					
		waitForElement(r2_myaccount_PO.plccCreditCardTextBox);
		assertTrue(isDisplayed(r2_myaccount_PO.plccCreditCardTextBox));
		setInputText(r2_myaccount_PO.plccCreditCardTextBox,webPropHelper.getTestDataProperty("CardVISA"));
		tabInputBox(r2_myaccount_PO.plccCreditCardTextBox);
		
		waitForElement(r2_myaccount_PO.plccErrorUnrecognizedCardNo);
		assertTrue(isDisplayed(r2_myaccount_PO.plccErrorUnrecognizedCardNo));

		waitForElement(r2_myaccount_PO.plccCreditCardTextBox);
		clearInputBox(r2_myaccount_PO.plccCreditCardTextBox);
		setInputText(r2_myaccount_PO.plccCreditCardTextBox,webPropHelper.getTestDataProperty("CardPlcc"));
		
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
	 if (isDisplayed(r2_myaccount_PO.cc_Radio_Button))
		{ 
			waitForElement(r2_myaccount_PO.cc_Radio_Button);
			clickOnRadioButton(r2_myaccount_PO.cc_Radio_Button);
			
			waitForElement(r2_myaccount_PO.ccCardHolderName);
			assertTrue(isDisplayed(r2_myaccount_PO.ccCardHolderName));
		 
			waitForElement(r2_myaccount_PO.ccCreditCardExpiry);
			assertTrue(isDisplayed(r2_myaccount_PO.ccCreditCardExpiry));
			
			waitForElement(r2_myaccount_PO.ccCreditCardCvv);
			assertTrue(isDisplayed(r2_myaccount_PO.ccCreditCardCvv));
			
			Thread.sleep(Constants.thread_low);
			driver.switchTo().frame(r2_myaccount_PO.CardField_Frame);
			waitForElement(r2_myaccount_PO.ccCreditCardNumber);
			assertTrue(isDisplayed(r2_myaccount_PO.ccCreditCardNumber));
			setInputText(r2_myaccount_PO.ccCreditCardNumber,webPropHelper.getTestDataProperty("CardPlcc"));
			tabInputBox(r2_myaccount_PO.plccCreditCardTextBox);
			driver.switchTo().defaultContent();
			
			Thread.sleep(Constants.thread_low);
			waitForElement(r2_myaccount_PO.plccErrorUnrecognizedCardNo);
			assertTrue(isDisplayed(r2_myaccount_PO.plccErrorUnrecognizedCardNo));
			
			Thread.sleep(Constants.thread_low);
			driver.switchTo().frame(r2_myaccount_PO.CardField_Frame);
			waitForElement(r2_myaccount_PO.ccCreditCardNumber);
			assertTrue(isDisplayed(r2_myaccount_PO.ccCreditCardNumber));
			setInputText(r2_myaccount_PO.ccCreditCardNumber,webPropHelper.getTestDataProperty("CardVISA"));
			tabInputBox(r2_myaccount_PO.plccCreditCardTextBox);
			driver.switchTo().defaultContent();
			
			//driver.switchTo().frame(r2_myaccount_PO.CardField_Frame);
			waitForElement(r2_myaccount_PO.ccLogoImg);
			assertTrue(isDisplayed(r2_myaccount_PO.ccLogoImg));	
			//driver.switchTo().defaultContent();
			
	    	waitForElement(r2_myaccount_PO.billingAddressFirstName);
			assertTrue(isDisplayed(r2_myaccount_PO.billingAddressFirstName));
			//setInputText(r2_myaccount_PO.billingAddressFirstName,webPropHelper.getTestDataProperty("FirstName"));
			
			waitForElement(r2_myaccount_PO.billingAddressLastName);
			assertTrue(isDisplayed(r2_myaccount_PO.billingAddressLastName));
			//setInputText(r2_myaccount_PO.billingAddressLastName,webPropHelper.getTestDataProperty("LastName"));
			
			waitForElement(r2_myaccount_PO.billingAddressAddress);
			assertTrue(isDisplayed(r2_myaccount_PO.billingAddressAddress));
			//setInputText(r2_myaccount_PO.billingAddressAddress,webPropHelper.getTestDataProperty("Address"));
			
			waitForElement(r2_myaccount_PO.billingAddressZipCode);
			assertTrue(isDisplayed(r2_myaccount_PO.billingAddressZipCode));
			//setInputText(r2_myaccount_PO.billingAddressZipCode,webPropHelper.getTestDataProperty("zip_1"));
			
			waitForElement(r2_myaccount_PO.billingPhoneNumber);
			assertTrue(isDisplayed(r2_myaccount_PO.billingPhoneNumber));
			
		}
 }
}
}

