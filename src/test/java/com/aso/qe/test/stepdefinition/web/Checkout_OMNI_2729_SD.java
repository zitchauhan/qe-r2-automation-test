package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class Checkout_OMNI_2729_SD  extends CommonActionHelper  {

	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(getDriver(), R2_CheckOut_PO.class);
	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(getDriver(), R2_MyAccount_PO.class);
	
	String defaultCreditCard = "";
	String defaultCreditCardChkoutPayment = "";
	
	@And("^user click on academy creditcard radiobtn$")
	public void user_click_on_academy_creditcard_radiobtn() throws Throwable {
		Thread.sleep(Constants.thread_medium);
		assertTrue(clickOnButton(r2CheckOutPo.Academy_CreditCard_radioBtn));
	    Thread.sleep(Constants.thread_high);
	}
	
	@And("^user makes note of saved default credit card in MyAccount$")
	public void user_makes_note_of_saved_default_credit_card_in_MyAccount() throws Throwable {
		Thread.sleep(Constants.thread_medium);
		defaultCreditCard = r2MyAccountPo.defaultCreditCard.getText();
	}
	
	@Then("^user verifies default card selected from dropdown in payment section$")
	public void user_verifies_default_card_selected_from_dropdown_in_payment_section() throws Throwable {
		defaultCreditCardChkoutPayment = r2MyAccountPo.defaultCreditCardChkoutPayment.getText();
		assertTrue(defaultCreditCard.contains(defaultCreditCardChkoutPayment));
	}
	
	@And("^user fills the credit card details in iframe of payment$")
	public void user_fills_the_credit_card_details_in_iframe_of_payment() throws Throwable {
		
		Thread.sleep(Constants.thread_low);
		getDriver().switchTo().frame("first-data-payment-field-card");
		setInputText(r2CheckOutPo.CreditCardNumber_Input, webPropHelper.getTestDataProperty("CardVISA"));
		getDriver().switchTo().defaultContent();
	}
	
	@And("^user fills the academy credit card details in payment$")
	public void user_fills_the_academy_credit_card_details_in_payment() throws Throwable {
		
		Thread.sleep(Constants.thread_low);
		setInputText(r2CheckOutPo.CreditCardNumber_Input, webPropHelper.getTestDataProperty("ValidPLCCCard"));
	}
	
	@Then("^user verifies the credit card logo image$")
	public void user_verifies_the_credit_card_logo_image() throws Throwable {
		assertTrue(isDisplayed(r2CheckOutPo.Checkout_CreditCardPay_ImgLogo)); 
	}
	
	@And("^user fills the invalid credit card details in iframe of payment$")
	public void user_fills_the_invalid_credit_card_details_in_iframe_of_payment() throws Throwable {
		
		Thread.sleep(Constants.thread_low);
		getDriver().switchTo().frame("first-data-payment-field-card");
		setInputText(r2CheckOutPo.CreditCardNumber_Input, webPropHelper.getTestDataProperty("CardPlcc"));
		getDriver().switchTo().defaultContent();
	}
	
	@And("^user fills the invalid credit card details in payment$")
	public void user_fills_the_invalid_credit_card_details_in_payment() throws Throwable {
		
		Thread.sleep(Constants.thread_low);
		setInputText(r2CheckOutPo.CreditCardNumber_Input, webPropHelper.getTestDataProperty("InvalidCard"));
		r2CheckOutPo.CreditCardNumber_Input.sendKeys(Keys.TAB);
	}
		
}
