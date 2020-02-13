package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_PDP_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class Checkout_OMNI_2730_SD extends CommonActionHelper {

	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(getDriver(), R2_CheckOut_PO.class);
	R2_PDP_PO r2PdpPo = PageFactory.initElements(driver, R2_PDP_PO.class);
	
	@And("^user click on creditcard radiobtn$")
	public void user_click_on_creditcard_radiobtn() throws Throwable {
		Thread.sleep(Constants.thread_medium);
		assertTrue(clickOnButton(r2CheckOutPo.CreditCard_radioBtn));
	    Thread.sleep(Constants.thread_high);
	}
	
	@And("^user fills the academy credit card details$")
	public void user_fills_the_academy_credit_card_details() throws Throwable {
		
		Thread.sleep(Constants.thread_low);
		setInputText(r2PdpPo.Academy_Credit_CardNumber_txt, webPropHelper.getTestDataProperty("ValidPLCCCard"));
	}
	
	@Then("^user verifies the credit card logo image in EBN modal$")
	public void user_verifies_the_credit_card_logo_image_in_EBN_modal() throws Throwable {
		assertTrue(isDisplayed(r2PdpPo.EBN_CreditCardPay_ImgLogo)); 
	}
	
	@And("^user fills the credit card details in iframe of EBN$")
	public void user_fills_the_credit_card_details_in_iframe_of_EBN() throws Throwable {
		
		Thread.sleep(Constants.thread_low);
		getDriver().switchTo().frame(r2CheckOutPo.CardField_Frame);
		setInputText(r2CheckOutPo.CreditCardNumber_Input, webPropHelper.getTestDataProperty("CardVISA"));
		getDriver().switchTo().defaultContent();
	}
	
	@And("^user fills the invalid credit card details in EBN$")
	public void user_fills_the_invalid_credit_card_details_in_EBN() throws Throwable {
		
		Thread.sleep(Constants.thread_low);
		setInputText(r2CheckOutPo.CreditCardNumber_Input, webPropHelper.getTestDataProperty("InvalidCard"));
		r2CheckOutPo.CreditCardNumber_Input.sendKeys(Keys.TAB);
	}
	
	@And("^user fills the invalid credit card details in iframe of EBN$")
	public void user_fills_the_invalid_credit_card_details_in_iframe_of_EBN() throws Throwable {
		
		Thread.sleep(Constants.thread_low);
		getDriver().switchTo().frame(r2CheckOutPo.CardField_Frame);
		setInputText(r2CheckOutPo.CreditCardNumber_Input, webPropHelper.getTestDataProperty("CardPlcc"));
		getDriver().switchTo().defaultContent();
	}
	
}
