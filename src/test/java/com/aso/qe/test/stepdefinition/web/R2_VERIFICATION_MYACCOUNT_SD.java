package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import freemarker.template.utility.NullArgumentException;

import org.apache.log4j.Logger;

public class R2_VERIFICATION_MYACCOUNT_SD extends CommonActionHelper 
{

	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	private static final Logger logger = Logger.getLogger(R2_VERIFICATION_MYACCOUNT_SD.class);

	@Then("^Verify below Sub/Main Module of My Account$")
	public void Verify_below_Sub_Main_Module_of_My_Account(DataTable arg1) throws Throwable 
	{

		try {
			List<List<String>> elements = arg1.raw();
			for (int i = 1; i < elements.size(); i++) 
			{
				String currentElement = elements.get(i).get(0);
				////sign in
				if (currentElement.equalsIgnoreCase("Email Address"))
					assertTrue(isDisplayed(r2MyAccountPo.inputEmailAddress_SignIn));
				else if (currentElement.equalsIgnoreCase("Password"))
					assertTrue(isDisplayed(r2MyAccountPo.password));
				else if (currentElement.equalsIgnoreCase("Sign In"))
					assertTrue(isDisplayed(r2MyAccountPo.logIn));
				else if (currentElement.equalsIgnoreCase("Sign Up"))
					assertTrue(isDisplayed(r2MyAccountPo.lnkSignUp));
				else if (currentElement.equalsIgnoreCase("Forgot Your Password"))
					assertTrue(isDisplayed(r2MyAccountPo.btnForgotYourPassword));
				//===============================================================================
				//////forgot password
				//===============================================================================
				else if (currentElement.equalsIgnoreCase("Email Address - Forgot Password Page"))
					assertTrue(isDisplayed(r2MyAccountPo.txtEmailAddress));
				else if (currentElement.equalsIgnoreCase("Submit Button - Forgot Password Page"))
					assertTrue(isDisplayed(r2MyAccountPo.btnSubmit));
				///// Address 
				else if (currentElement.equalsIgnoreCase("First Name"))
					assertTrue(isDisplayed(r2MyAccountPo.adr_inpFirstName));
				else if (currentElement.equalsIgnoreCase("Last Name"))
					assertTrue(isDisplayed(r2MyAccountPo.adr_inpLastName));
				else if (currentElement.equalsIgnoreCase("Phone Number"))
					assertTrue(isDisplayed(r2MyAccountPo.adr_inpPhoneNumber));
				else if (currentElement.equalsIgnoreCase("Address"))
					assertTrue(isDisplayed(r2MyAccountPo.adr_inpAddress1));
				else if (currentElement.equalsIgnoreCase("Zip Code"))
					assertTrue(isDisplayed(r2MyAccountPo.adr_inpzipCode));
				else if (currentElement.equalsIgnoreCase("City"))
					assertTrue(isDisplayed(r2MyAccountPo.adr_inpCity));
				else if (currentElement.equalsIgnoreCase("State"))
					assertTrue(isDisplayed(r2MyAccountPo.btnState));
				//// Payment
				else if (currentElement.equalsIgnoreCase("No Gift Card listed mesaage"))
					assertTrue(isDisplayed(r2MyAccountPo.txtNoGiftCardListed));
				else if (currentElement.equalsIgnoreCase("Add new Gift Card"))
					assertTrue(isDisplayed(r2MyAccountPo.btnAddNewGiftCard));
				else if (currentElement.equalsIgnoreCase("Gift Card Number"))
					assertTrue(isDisplayed(r2MyAccountPo.txtGiftCardNumber));
				else if (currentElement.equalsIgnoreCase("PIN"))
					assertTrue(isDisplayed(r2MyAccountPo.txtGifCardPin));
				else if (currentElement.equalsIgnoreCase("Cancel"))
					assertTrue(isDisplayed(r2MyAccountPo.btnCancelGiftCard));
				else if (currentElement.equalsIgnoreCase("Add"))
					assertTrue(isDisplayed(r2MyAccountPo.btnAddGiftCard));
		
				else {
					logger.error("Element <" + currentElement + "> is not found in the SD list.");
					throw new NullArgumentException("Element <" + currentElement + "> is not found in the SD list.");
				}

			}
		} catch (NullPointerException e) {
			logger.error("This test-step has been failed");
		}
	}

}
