package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;


import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class R2_CART_KER_3511_Web_SD extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R2_CART_KER_3511_Web_SD.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	public String beforeChangeZipcode;
	public String afterChangeZipcode;
	
	
	@When("^user clicks on Change Zip Code link in Estimated shipping section of Order Summary section on Cart page$")
	public void user_clicks_on_Change_Zip_Code_link_in_Estimated_shipping_section_of_Order_Summary_section_on_Cart_page() throws Throwable {
		beforeChangeZipcode = r2CartPo.txtEstimatedShipping.getText();
		assertTrue(clickOnButton(r2CartPo.lnkChangeZipCode));
	}

	@And("^user enters new \"(.*?)\" in Change ZIP Code modal overlay$")
	public void user_enters_new_in_Change_ZIP_Code_modal_overlay(String arg1) throws Throwable {
		clearInputBox(r2CartPo.inputZipCode);
		setInputText(r2CartPo.inputZipCode, webPropHelper.getTestDataProperty(arg1));
	}

	@And("^user clicks on Submit button$")
	public void user_clicks_on_Submit_button() throws Throwable {
		assertTrue(clickOnButton(r2CartPo.btnCartSubmit));
	}

	@Then("^user verifies the estimated shipping cost based on updated zip code\\.$")
	public void user_verifies_the_estimated_shipping_cost_based_on_updated_zip_code() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtEstimatedShipping));
		afterChangeZipcode = r2CartPo.txtEstimatedShipping.getText();
		if(!beforeChangeZipcode.equals(afterChangeZipcode)) {
			logger.info("Estimated shipping cost is updated based on zip code change");
		}
		else
		{
			logger.info("Estimated shipping cost is not updated based on zip code change");
		}
	}

}
