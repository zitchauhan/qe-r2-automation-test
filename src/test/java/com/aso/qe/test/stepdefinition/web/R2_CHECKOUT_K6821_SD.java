package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class R2_CHECKOUT_K6821_SD extends CommonActionHelper {
	
	R2_CheckOut_PO r2CheckOutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	
	
	@Then("^user click on checkout button in Cart page$")
	public void user_click_on_checkout_button_in_Cart_page() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
		assertTrue(clickOnButton(r2CartPo.btn_checkOut_OrderSummary));}//KER-6941 CR-RK Sep 4
		else
		{
			assertTrue(clickOnButton(r2CartPo.btnCartCheckout));
		}
	}
	
	@When("^user enter First name \"(.*?)\"$")
	public void user_enter_First_name(String arg1) throws Throwable {
		setInputText(r2CheckOutPo.inputCheckoutFirstName, webPropHelper.getTestDataProperty(arg1));
	}

	@And("^user enter Last name \"(.*?)\"$")
	public void user_enter_Last_name(String arg1) throws Throwable {
		setInputText(r2CheckOutPo.inputCheckoutLasttName, webPropHelper.getTestDataProperty(arg1));
	}

	@And("^user enter Phone number \"(.*?)\"$")
	public void user_enter_Phone_number(String arg1) throws Throwable {
		setInputText(r2CheckOutPo.inputCheckoutPhoneNumber, webPropHelper.getTestDataProperty(arg1));
	}

	@And("^user enter Address \"(.*?)\"$")
	public void user_enter_Address(String arg1) throws Throwable {
		setInputText(r2CheckOutPo.inputCheckoutAddress, webPropHelper.getTestDataProperty(arg1));
	}

	@And("^user enter Zipcode \"(.*?)\"$")
	public void user_enter_Zipcode(String arg1) throws Throwable {
		r2CheckOutPo.inputCheckoutZipCode.clear();
		setInputText(r2CheckOutPo.inputCheckoutZipCode, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user click on Go To Shipping Method button in Checkout page$")
	public void user_click_on_Go_To_Shipping_Method_button_in_Checkout_page() throws Throwable {
		assertTrue(clickOnButton(r2CheckOutPo.btnGoToShippingMethod));
		Thread.sleep(5000);
	}
	
	@Then("^user click on GiftCard Plus icon in Checkout page$")
	public void user_click_on_GiftCard_Plus_icon_in_Checkout_page() throws Throwable {
		assertTrue(clickOnButton(r2CheckOutPo.plusIconGiftCard));
	}
	
	@And("^user enter Gift card Number \"(.*?)\"$")
	public void user_enter_Gift_card_Number(String arg1) throws Throwable {
		setInputText(r2CheckOutPo.inputGiftcardNumber, webPropHelper.getTestDataProperty(arg1));
	}

	@And("^user enter Pin Number \"(.*?)\"$")
	public void user_enter_Pin_Number(String arg1) throws Throwable {
		setInputText(r2CheckOutPo.inputPinNumber, webPropHelper.getTestDataProperty(arg1));
	}

	@And("^user click on Apply button$")
	public void user_click_on_Apply_button() throws Throwable {
		assertTrue(clickOnButton(r2CheckOutPo.btnCheckoutApply));
		Thread.sleep(20000);
	}

	@Then("^user verify the inline error message stating: Invalid Gift Card Number/Insufficient Funds$")
	public void user_verify_the_inline_error_message_stating_Invalid_Gift_Card_Number_Insufficient_Funds() throws Throwable {
		assertTrue(isDisplayed(r2CheckOutPo.txtInvalidGiftcard));
		assertTrue(isDisplayed(r2CheckOutPo.txtInvalidPin));
	}
	
	@When("^user clicks on Add Gift Card link$")
	public void user_clicks_on_Add_Gift_Card_link() throws Throwable {
		waitForElement(r2CheckOutPo.lnkGiftCard);
		assertTrue(clickOnButton(r2CheckOutPo.lnkGiftCard));
	}

	@When("^enter valid Gift Card Number \"(.*?)\"$")
	public void enter_valid_Gift_Card_Number(String arg1) throws Throwable {
		setInputText(r2CheckOutPo.inputGiftCard, webPropHelper.getTestDataProperty(arg1));
	}

	@When("^enters an alphanumeric PIN \"(.*?)\"$")
	public void enters_an_alphanumeric_PIN(String arg1) throws Throwable {
		setInputText(r2CheckOutPo.inputPin, webPropHelper.getTestDataProperty(arg1));
	   
	}

	@Then("^user should NOT be allowed to input any non-numeric value to the gift card PIN field$")
	public void user_should_NOT_be_allowed_to_input_any_non_numeric_value_to_the_gift_card_PIN_field() throws Throwable {
	    String str=r2CheckOutPo.inputPin.getAttribute("value");
	    System.out.println("*****" +str);
	    assertTrue(str.isEmpty());
	}
	
	@Then("^user will click on Paypal radio button$")
	public void user_will_click_on_Paypal_radio_button() throws Throwable {
		Thread.sleep(1000);
		waitForElement(r2CheckOutPo.rdPaypal);
		assertTrue(clickOnButton(r2CheckOutPo.rdPaypal));
	}

	

}
