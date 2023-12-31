package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CHECKOUT_K4039_SD extends CommonActionHelper {
	 R1_GlobalElementHeader_Home_PO globalElementHeader=PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	R2_R1_Fun_PO r2_r1_fun_po=PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R2_CheckOut_PO r2CheckOutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R1_PDP_PO pdp_po =PageFactory.initElements(driver, R1_PDP_PO.class);
	
	@Then("^user verify all the paypal and more radio btn is disable$")
	public void user_verify_all_the_paypal_and_more_radio_btn_is_disable() throws Throwable {
	 assertTrue(isEnabled(r2CheckOutPo.CreditCard_radioBtn)); 
	 assertTrue(isEnabled(r2CheckOutPo.PayPal_radioBtn)); 
//	 assertTrue(isEnabled(r2CheckOutPo.rdbtnGooglePay)); 
	
	}

	/*@Then("^user click on paypal$")
	public void user_click_on_paypal() throws Throwable {
//	    waitForElement(r2CheckOutPo.PayPal_radioBtn);
		clickOnButton(r2CheckOutPo.PayPal_radioBtn);
		Thread.sleep(Constants.thread_medium);
	}*/ //Duplicate of below at line 48
	
	@Then("^user change the quantity of item in PDP$")
	public void user_change_the_quantity_of_item_in_PDP() throws Throwable {
	    clickOnButton(pdp_po.btnQuantityInc);
	    clickOnButton(pdp_po.btnQuantityInc);
	    clickOnButton(pdp_po.btnQuantityInc);
	}
	
	@Then("^user click on paypal radiobtn$")
	public void user_click_on_paypal_radiobtn() throws Throwable {
		Thread.sleep(Constants.thread_medium);
		assertTrue(clickOnButton(r2CheckOutPo.PayPal_radioBtn));
	    Thread.sleep(Constants.thread_high);
	}
	
	@Then("^user switch to iframe and enter the paypal login \"(.*?)\" \"(.*?)\"$")
	public void user_switch_to_iframe_and_enter_the_paypal_login(String arg1, String arg2) throws Throwable {
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		   System.err.println(driver.getTitle());
		   
		}
		System.err.println(getTitle());
		Thread.sleep(Constants.thread_high);
		waitForElement(r2CheckOutPo.PaypalEmail_Input);

		setInputText(r2CheckOutPo.PaypalEmail_Input, webPropHelper.getTestDataProperty(arg1));
		assertTrue(clickOnButton(r2CheckOutPo.PaypalNext_Btn));
		waitForElement(r2CheckOutPo.PaypalPassWord_Input); 
		setInputText(r2CheckOutPo.PaypalPassWord_Input, webPropHelper.getTestDataProperty(arg2));
		assertTrue(clickOnButton(r2CheckOutPo.PaypalLogin_Btn));
		//Thread.sleep(Constants.thread_high);
		waitForElement(r2CheckOutPo.PayPalPayWithSection);
		driver.manage().window().maximize();
		
		//driver.getTitle();
		if(isDisplayed(r2CheckOutPo.PayPalAcceptCookie))
		{
			assertTrue(clickOnButton(r2CheckOutPo.PayPalAcceptCookie));
		}
		waitForElement(r2CheckOutPo.PayPalContinue_Btn);
		
		//assertTrue(clickOnButton(r2CheckOutPo.PayPalContinue_Btn));  // this line won't work when called from PO
		driver.findElementByXPath("//*[text()='Continue'] | //*[@id='payment-submit-btn']").click();
		
		driver.switchTo().window(winHandleBefore);
		JavascriptExecutor jsb = (JavascriptExecutor) driver;
		Thread.sleep(Constants.thread_high);
		jsb.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(Constants.thread_high);
		System.err.println(driver.getTitle());
		
        
	}
	@Then("^user click on ADD Another Gift Card$")
	public void user_click_on_ADD_Another_Gift_Card() throws Throwable {
	    clickOnButton(r2CheckOutPo.AddAnotherGiftCard_Txt);
	}
	@Then("^user fill email address in payment$")
	public void user_fill_email_address_in_payment() throws Throwable {
	   setInputText(r2CheckOutPo.EmailAddressforOrderConfirmation_Input, webPropHelper.getTestDataProperty("EmailWithExistingCreditCard"));
	}
	
	@And("^user clicks on ok button of order not complete modal$")
	public void user_clicks_on_ok_button_of_order_not_complete_modal() throws Throwable {
		if(isDisplayed(r2CheckOutPo.OkButtonReturnFromPaypal))
		{
		assertTrue(clickOnButton(r2CheckOutPo.OkButtonReturnFromPaypal));
		}
		else
			System.out.println("You order is not complete modal not visible, so moving forward");
	}
	
}
