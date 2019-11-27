package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class Checkout_GooglePay_SD extends CommonActionHelper {

	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	
	@Then("^user click on googlePay radiobtn$")
	public void user_click_on_googlePay_radiobtn() throws Throwable {	
		 Thread.sleep(Constants.thread_high);
		assertTrue(clickOnButton(r2CheckOutPo.googlePayRadiobtn));
	    Thread.sleep(Constants.thread_high);
	}
	
	@And("^user click on googlePay checkout button$")
	public void user_click_on_googlePay_checkout_button() throws Throwable {	
		assertTrue(clickOnButton(r2CheckOutPo.googlePayBtn));
	}
	
	@Then("^user switch to iframe and enter the google login \"(.*?)\" \"(.*?)\"$")
	public void user_switch_to_iframe_and_enter_the_paypal_login(String arg1, String arg2) throws Throwable {
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);		 
		}
		System.err.println(getTitle());
		waitForElement(r2CheckOutPo.googlePayEmail_Txtbox_gpmodal);
		setInputText(r2CheckOutPo.googlePayEmail_Txtbox_gpmodal, webPropHelper.getTestDataProperty(arg1));
		assertTrue(clickOnButton(r2CheckOutPo.googlePay_nextBtn_gpmodal));
		setInputText(r2CheckOutPo.googlePayPassword_TxtBox_gpmodal, webPropHelper.getTestDataProperty(arg2));
		assertTrue(clickOnButton(r2CheckOutPo.googlePay_nextBtn_password_gpmodal));
		Thread.sleep(Constants.thread_high);
		WebElement ele = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(ele);
		assertTrue(clickOnButton(r2CheckOutPo.googlePayContinueBtn_gpmodal));
		Thread.sleep(Constants.thread_highest);
		driver.switchTo().window(winHandleBefore);
		System.err.println(driver.getTitle());

	}
	
	@And("^user verify \"([^\"]*)\" option is not displayed$")
	public void user_verify_option_is_not_displayed(String paymentOptions) {
		if(paymentOptions.equalsIgnoreCase("GooglePay")) {
			assertFalse(isDisplayed(r2CheckOutPo.googlePayRadiobtn));
		}
	}
}
