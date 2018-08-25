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

public class R2_VERIFICATION_CART_SD extends CommonActionHelper 
{

	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	private static final Logger logger = Logger.getLogger(R2_VERIFICATION_CART_SD.class);

	@Then("^Verify below Sub-Module of My Account$")
	public void login_page_should_display_below_elements(DataTable arg1) throws Throwable {

		try {
			List<List<String>> elements = arg1.raw();
			for (int i = 1; i < elements.size(); i++) 
			{
				String currentElement = elements.get(i).get(0);
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
				
				else if (currentElement.equalsIgnoreCase("Forgot Your Password"))
					assertTrue(isDisplayed(r2MyAccountPo.btnForgotYourPassword));
				
				
				
				else {
					logger.error("Element " + currentElement + " is not found.");
					throw new NullArgumentException("Element <" + currentElement + "> is not found.");
				}

			}
		} catch (NullPointerException e) {
			logger.error("This test-step has been failed");
		}
	}

}
