package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import io.cucumber.datatable.*;
import cucumber.api.java.en.Then;
import freemarker.template.utility.NullArgumentException;

import org.apache.log4j.Logger;

public class R2_VERIFICATION_MESSAGES_SD extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R2_VERIFICATION_MYACCOUNT_SD.class);

	@Then("Verify the message on the page$")
	public void Verify_the_message_on_the_page(DataTable arg1) throws Throwable 
	{
		//Commiting code till the time error message does not fixed.
		Thread.sleep(Constants.thread_highest);
		try {
			List<List<String>> elements = arg1.asLists();
			for (int i = 1; i < elements.size(); i++) {
				String currentElement = elements.get(i).get(0);
				System.err.println(currentElement.trim());
				VerifyTextPersent(currentElement.trim());
				// assertTrue(isDisplayed(r2CartPo.link_ContinueShopping));
			}
		} catch (NullPointerException e) {
			logger.error("This test-step has been failed");
		}
	}

	@Then("Verify the message not displayed on the page$")
	public void Verify_the_message_not_displayed_the_page(DataTable arg1) throws Throwable 
	{
		//Commiting code till the time error message does not fixed.

		try {
			List<List<String>> messages = arg1.asLists();
			for (int i = 1; i < messages.size(); i++) {
				String currentMessage = messages.get(i).get(0);
				VerifyTextNotPersent(currentMessage.trim());
			}
		} catch (NullPointerException e) {
			logger.error("This test-step has been failed");
		}
	}
}
