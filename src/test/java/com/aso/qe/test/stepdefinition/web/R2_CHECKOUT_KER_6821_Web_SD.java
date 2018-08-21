package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class R2_CHECKOUT_KER_6821_Web_SD extends CommonActionHelper {
	
	R2_CheckOut_PO r2_CheckOut_Po=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	
	
	@Then("^user click on checkout button in Cart page$")
	public void user_click_on_checkout_button_in_Cart_page() throws Throwable {
		assertTrue(clickOnButton(r2CartPo.btnCartCheckout));
	}
	
	@When("^user enter First name \"(.*?)\"$")
	public void user_enter_First_name(String arg1) throws Throwable {
		setInputText(r2_CheckOut_Po.inputCheckoutFirstName, webPropHelper.getTestDataProperty(arg1));
	}

	@And("^user enter Last name \"(.*?)\"$")
	public void user_enter_Last_name(String arg1) throws Throwable {
		setInputText(r2_CheckOut_Po.inputCheckoutLasttName, webPropHelper.getTestDataProperty(arg1));
	}

	@And("^user enter Phone number \"(.*?)\"$")
	public void user_enter_Phone_number(String arg1) throws Throwable {
		setInputText(r2_CheckOut_Po.inputCheckoutPhoneNumber, webPropHelper.getTestDataProperty(arg1));
	}

	@And("^user enter Address \"(.*?)\"$")
	public void user_enter_Address(String arg1) throws Throwable {
		setInputText(r2_CheckOut_Po.inputCheckoutAddress, webPropHelper.getTestDataProperty(arg1));
	}

	@And("^user enter Zipcode \"(.*?)\"$")
	public void user_enter_Zipcode(String arg1) throws Throwable {
		setInputText(r2_CheckOut_Po.inputCheckoutZipCode, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user click on Go To Shipping Method button in Checkout page$")
	public void user_click_on_Go_To_Shipping_Method_button_in_Checkout_page() throws Throwable {
		assertTrue(clickOnButton(r2_CheckOut_Po.btnGoToShippingMethod));
		Thread.sleep(5000);
	}
	
	@Then("^user click on GiftCard Plus icon in Checkout page$")
	public void user_click_on_GiftCard_Plus_icon_in_Checkout_page() throws Throwable {
		assertTrue(clickOnButton(r2_CheckOut_Po.plusIconGiftCard));
	}
	
	@And("^user enter Gift card Number \"(.*?)\"$")
	public void user_enter_Gift_card_Number(String arg1) throws Throwable {
		setInputText(r2_CheckOut_Po.inputGiftcardNumber, webPropHelper.getTestDataProperty(arg1));
	}

	@And("^user enter Pin Number \"(.*?)\"$")
	public void user_enter_Pin_Number(String arg1) throws Throwable {
		setInputText(r2_CheckOut_Po.inputPinNumber, webPropHelper.getTestDataProperty(arg1));
	}

	@And("^user click on Apply button$")
	public void user_click_on_Apply_button() throws Throwable {
		assertTrue(clickOnButton(r2_CheckOut_Po.btnCheckoutApply));
		Thread.sleep(20000);
	}

	@Then("^user verify the inline error message stating: Invalid Gift Card Number/Insufficient Funds$")
	public void user_verify_the_inline_error_message_stating_Invalid_Gift_Card_Number_Insufficient_Funds() throws Throwable {
		assertTrue(isDisplayed(r2_CheckOut_Po.txtInvalidGiftcard));
		assertTrue(isDisplayed(r2_CheckOut_Po.txtInvalidPin));
	}

	

}
