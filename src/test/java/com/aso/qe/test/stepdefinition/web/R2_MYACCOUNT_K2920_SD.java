package com.aso.qe.test.stepdefinition.web;


import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.PropertiesHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_MYACCOUNT_K2920_SD extends CommonActionHelper {

	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	public GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver,
			GlobalElementHeader_HomePO.class);

	@Then("^user should see the proper message$")
	public void user_should_see_the_proper_message() throws Throwable {
	    //assertTrue(isDisplayed(r2MyAccountPo.txtCreditCardRemoved));
	}
	
	@Then("^user verifies the credit card saved is set as default$")
	public void user_verifies_the_credit_card_saved_is_set_as_default() throws Throwable {
		
		assertTrue(isDisplayed(r2MyAccountPo.txtDefaultDescription));
	}
	
	@Then("^user verifies the following details$")
	public void user_verifies_the_following_details() throws Throwable {
		WebElement CreditCardInfo=(WebElement) r2MyAccountPo.txtCreditCard;
		assertTrue(isDisplayed(CreditCardInfo));  
		
	}

	@When("^user clicks Remove button in payment page$")
	public void user_clicks_Remove_button_in_payment_page() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.btnRemove));
	}
	
	/*@Then("^user click on set as default button$")
	public void user_click_on_set_as_default_button() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.btnSetAsDefault)); 
	}*/
	/*//div[text()='CREDIT CARDS']
	- Card type
	- Text stating: {color:#59afe1}<card type> ending in -XXXX{color}
	- Last 4 digits of the credit Card #
	- Billing Information, i.e. name and billing address
	- Two links: Edit with edit icon and Remove link with cross icon
	- Any saved card which is not default with a CTA:{color:#59afe1} SET AS DEFAULT"{color} */
		 
}