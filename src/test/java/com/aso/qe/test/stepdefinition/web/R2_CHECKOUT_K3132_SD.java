package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CHECKOUT_K3132_SD extends CommonActionHelper {
	//private static final Logger logger = Logger.getLogger(R2_CHECKOUT_K3132_SD.class);
	
	R2_CheckOut_PO r2CheckOutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_MyAccount_PO r2MyAccountPo=PageFactory.initElements(driver, R2_MyAccount_PO.class);
	ArrayList<String> address = new ArrayList<>();
	ArrayList<String> billingAddresses = new ArrayList<>();
	
	
	@Then("^user compare Shipping Address is same as Billing Address$")
	public void user_compare_Shipping_Address_is_same_as_Billing_Address() throws Throwable {
		
		
		r2CheckOutPo.verifyShippingAndBillingAddressAreSame();

	}
	
	@Then("^user fill the payment details$")
	public void user_fill_the_payment_details() throws Throwable {
	  
		waitForElement(r2CheckOutPo.CreditCardNumber_Input);
		setInputText(r2CheckOutPo.CreditCardNumber_Input, webPropHelper.getTestDataProperty("CreditCardNumber"));
	   setInputText(r2CheckOutPo.ExpirationDate_Input, webPropHelper.getTestDataProperty("ExpDate"));
	   setInputText(r2CheckOutPo.Cvv_Input, webPropHelper.getTestDataProperty("CVV"));
	   setInputText(r2CheckOutPo.EmailAddressforOrderConfirmation_Input, webPropHelper.getTestDataProperty("EmailAddress"));
	   assertTrue(clickOnButton(r2CheckOutPo.ReviewOrder_Btn));
	   Thread.sleep(Constants.thread_highest);
	}
	
	@Then("^user click on edit Payment link and click on billing information$")
	public void user_click_on_edit_Payment_link_and_click_on_billing_information() throws Throwable {
		Thread.sleep(Constants.thread_low); 
		if(isDisplayed(r2CheckOutPo.EditPayment_Link)) {
		assertTrue(clickOnButton(r2CheckOutPo.EditPayment_Link));
	   assertTrue(clickOnButton(r2CheckOutPo.ChangeBillingInformation_Txt));
		}
		else {
			setInputText(r2MyAccountPo.txtCVV, webPropHelper.getTestDataProperty("ThreeDigitCVV"));
			assertTrue(clickOnButton(r2CheckOutPo.ChangeBillingInformation_Txt));
		}
	}
	@Then("^user fill billing information after clicking on change billing information text$")
	public void user_fill_billing_information_after_clicking_on_change_billing_information_text() throws Throwable {
	    setInputText(r2CheckOutPo.FirstName_Input, webPropHelper.getTestDataProperty("FirstName"));
	    setInputText(r2CheckOutPo.LastName_Input, webPropHelper.getTestDataProperty("LastName"));
	    setInputText(r2CheckOutPo.PhoneNumber_Input, webPropHelper.getTestDataProperty("PhoneNumber"));
	    setInputText(r2CheckOutPo.Adderss_Input, webPropHelper.getTestDataProperty("AVSAddress"));
	    setInputText(r2CheckOutPo.ZipCode_Input, webPropHelper.getTestDataProperty("zipcode"));
	    Thread.sleep(Constants.thread_medium);
//	    setInputText(r2CheckOutPo.EmailAddressforOrderConfirmation_Input, webPropHelper.getTestDataProperty("login"));
	    clickOnButton(r2CheckOutPo.ReviewOrder_Btn);
	    Thread.sleep(Constants.thread_highest);
	}
	@Then("^user click on checkbox Same as shipping address$")
	public void user_click_on_checkbox_Same_as_shipping_address() throws Throwable {
		assertTrue(clickOnButton(r2CheckOutPo.SameAsShippingAddress_checkBox));
	}
	@Then("^user fill the email address and click on review order btn$")
	public void user_fill_the_email_address_and_click_on_review_order_btn() throws Throwable {
		
		setInputText(r2CheckOutPo.EmailAddressforOrderConfirmation_Input,  webPropHelper.getTestDataProperty("login"));
		assertTrue(clickOnButton(r2CheckOutPo.ReviewOrder_Btn));
	
	}
	
	@Then("^user fill the credit card detail in payment$")
	public void user_fill_the_credit_card_detail_in_payment() throws Throwable {
		
		setInputText(r2CheckOutPo.CreditCardNumber_Input,  webPropHelper.getTestDataProperty("CreditCardNumber"));
		setInputText(r2CheckOutPo.ExpirationDate_Input,  webPropHelper.getTestDataProperty("ExpDate"));
		setInputText(r2CheckOutPo.Cvv_Input,  webPropHelper.getTestDataProperty("CVV"));
	}
	
	@And("^user select the suggested address$")
	public void user_select_the_suggested_address() {
		assertTrue(clickOnButton(r2CheckOutPo.selectSuggestedAddress));
		for (WebElement suggestedAddress : r2CheckOutPo.suggestedAddressName) {
			address.add(suggestedAddress.getText());
		}
		assertTrue(clickOnButton(r2CheckOutPo.btnSelectedAddress));
	}
	
	@Then("^user matches the address with the Billing information$")
	public void user_matches_the_address_with_the_Billing_information() throws InterruptedException {
		Thread.sleep(10000);
		for (WebElement billingAddress : r2CheckOutPo.billingAddressCheck) {
//			Thread.sleep(5000);
			System.err.println(billingAddress.getText());
			
			billingAddresses.add(billingAddress.getText());
		}
		Thread.sleep(5000);
		int checkSize = billingAddresses.size();
		int k=0;
		System.err.println(checkSize);
		while (checkSize >= k) {
			boolean flag1= false;
			if(flag1==true) {
				int i=1;
				if(i==1){
					System.err.println(billingAddresses.get(k));
					System.err.println(address.get(i));
					flag1 = billingAddresses.get(k).contains(address.get(i));
					checkSize--;
					break;
				}
			}else {
			for (int i = 0; i <= 1; i++) {
				System.err.println(billingAddresses.get(k));
				System.err.println(address.get(i));
				flag1 = billingAddresses.get(k).contains(address.get(i));
				checkSize--;
			}
			}
		}
	}

}
