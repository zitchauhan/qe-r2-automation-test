package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K3338_SD extends CommonActionHelper {
	
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_MyAccount_PO r2_MyAccount_PO=PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R2_R1_Fun_PO r2_r1_fun_po=PageFactory.initElements(driver, R2_R1_Fun_PO.class);

	
	@Then("^Verify paypal button is clicked$")
	public void verify_paypal_button_is_clicked() throws Throwable {	
		assertTrue(clickOnButton(r2CheckOutPo.PayPalCheckOut_Btn));
		Thread.sleep(Constants.thread_highest);
	}
	@Then("^user switch to window of paypal$")
	public void user_switch_to_window_of_paypal() throws Throwable {
	    System.out.println("111");
		Set<String> set=driver.getWindowHandles();
	    Iterator<String> it=set.iterator();
	    String parentWindow=it.next();
	    String childWindow=it.next();
	    //System.out.println("222");
	    driver.switchTo().window(childWindow);
	    waitForPageLoad(driver);
	   // System.out.println("3333");
	}
	@Then("^user verify the element of paypal window$")
	public void user_verify_the_element_of_paypal_window() throws Throwable {
//		 System.out.println("444");
//		 Thread.sleep(20000);
//		Boolean ee= driver.findElement(By.xpath("//*[text()='Shipping discount']")).isDisplayed();
//		 System.out.println("555");
//		System.out.println(ee);
//		
		assertTrue(isDisplayed(r2CheckOutPo.PaypalClose_icon));
	}
	
	@Then("^enter the paypal login \"(.*?)\" \"(.*?)\"$")
	public void enter_the_paypal_login(String arg1, String arg2) throws Throwable {

		waitForElement(r2CheckOutPo.PaypalEmail_Input);
		assertTrue(clickOnButton(r2CheckOutPo.PaypalEmail_Input));
		setInputText(r2CheckOutPo.PaypalEmail_Input, webPropHelper.getTestDataProperty(arg1));
		assertTrue(clickOnButton(r2CheckOutPo.PaypalNext_Btn));
		setInputText(r2CheckOutPo.PaypalPassWord_Input, webPropHelper.getTestDataProperty(arg2));
		assertTrue(clickOnButton(r2CheckOutPo.PaypalLogin_Btn));
		isDisplayed(r2CheckOutPo.PayPalContinue_Btn);
		assertTrue(clickOnButton(r2CheckOutPo.PayPalContinue_Btn));	
		Thread.sleep(Constants.thread_highest);
		assertTrue(clickOnButton(r2CheckOutPo.PayPalContinue_Btn));	
	}

	
	@Then("^verify the gift card option is not displayed$")
	public void verify_the_gift_card_option_is_not_displayed() throws Throwable {
	 assertFalse(isDisplayed(r2CheckOutPo.plusIconGiftCard));
	}

	@Then("^verify the paypal radio option is not displayed$")
	public void verify_the_paypal_radio_option_is_not_displayed() throws Throwable {
		assertFalse(isDisplayed(r2CheckOutPo.PayPal_radioBtn));
	}
	
	@Then("^user selects terms and conditions checkbox for SOF items$")
	public void user_selects_terms_and_conditions_checkbox_for_SOF_items() throws Throwable {
	    if(!(isSelected(r2CheckOutPo.termsAndConditions_checkBox))) {
	    	clickOnButton(r2CheckOutPo.termsAndConditions_checkBox);
	    }
	}
	
}
