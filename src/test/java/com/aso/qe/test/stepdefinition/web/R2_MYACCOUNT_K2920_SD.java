package com.aso.qe.test.stepdefinition.web;


import static org.junit.Assert.assertTrue;


import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.framework.common.PropertiesHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_MYACCOUNT_K2920_SD extends CommonActionHelper 
{

	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	public R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);

	@Then("^user should see \"([^\"]*)\" removed message$")
	public void user_should_see_the_proper_message(String arg1) throws Throwable {
	    if(arg1.equalsIgnoreCase("Credit Card"))
	    	{
	    	assertTrue(isDisplayed(r2MyAccountPo.txtCreditCardRemoved));
	    	}
	}
	
	@Then("^user verifies the credit card saved is set as default$")
	public void user_verifies_the_credit_card_saved_is_set_as_default() throws Throwable {
		
		if(isDisplayed(r2MyAccountPo.txtDefaultDescription)) {
			
					}
		else {
			assertTrue(clickOnButton(r2MyAccountPo.addNewCardCta));
			setInputText(r2MyAccountPo.txtCreditCardNumber, webPropHelper.getTestDataProperty("CreditCardNumber"));
			setInputText(r2MyAccountPo.txtExpiryDate, webPropHelper.getTestDataProperty("ExpDate"));
			setInputText(r2MyAccountPo.txtCVV, webPropHelper.getTestDataProperty("CVV"));
			setInputText(r2MyAccountPo.txtFirstNameInAddCreditCard, webPropHelper.getTestDataProperty("UpdateFirstName"));
			setInputText(r2MyAccountPo.txtLastNameInAddCreditCard, webPropHelper.getTestDataProperty("UpdateLastName"));
			setInputText(r2MyAccountPo.txtAddressInAddCreditCard, webPropHelper.getTestDataProperty("UpdateAddress"));
			setInputText(r2MyAccountPo.txtZipCodeInAddCreditCard, webPropHelper.getTestDataProperty("UpdateZipcode"));
			setInputText(r2MyAccountPo.adr_inpPhoneNumber, webPropHelper.getTestDataProperty("UpdatePhoneNumber"));
			assertTrue(clickOnButton(r2MyAccountPo.PaymentPage_AddCreditCard_Add_btn));
			Thread.sleep(Constants.thread_medium);
			assertTrue(isDisplayed(r2MyAccountPo.txtDefaultDescription));
	}
		
		
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
	
	@When("^user clicks Gift Card Remove button in payment page$")
	public void user_clicks_Gift_Card_Remove_button_in_payment_page() throws Throwable {
	assertTrue(clickOnButton(r2MyAccountPo.removeBtnForGiftCard));
	}
	
	@When("^user clicks Remove acc button in payment page$")
	public void user_clicks_Remove_acc_button_in_payment_page() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.btnAccRemove));
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
	
	@And("^user should see the proper message after GC delete$")
	public void user_should_see_the_proper_message() throws Throwable
	{
		Thread.sleep(Constants.thread_medium);
		assertTrue(isDisplayed(r2MyAccountPo.MyAccount_NoGCMsg));
	}
}
