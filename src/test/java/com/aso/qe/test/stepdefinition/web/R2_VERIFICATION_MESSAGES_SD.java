package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import freemarker.template.utility.NullArgumentException;

import org.apache.log4j.Logger;

public class R2_VERIFICATION_MESSAGES_SD extends CommonActionHelper 
{
	private static final Logger logger = Logger.getLogger(R2_VERIFICATION_MYACCOUNT_SD.class);


	@Then("Verify the message on the page$")
	public void Verify_the_message_on_the_page(DataTable arg1) throws Throwable  
	{

		try {
			List<List<String>> elements = arg1.raw();
			for (int i = 1; i < elements.size(); i++) 
			{
				String currentElement = elements.get(i).get(0);
			
					VerifyTextPersent(currentElement.trim());
					//assertTrue(isDisplayed(r2CartPo.link_ContinueShopping));
			}
		} 
		catch (NullPointerException e) 
		{
			logger.error("This test-step has been failed");
		}
	}

}
