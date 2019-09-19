package com.aso.qe.test.stepdefinition.web;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.Then;

public class ES197_SD extends CommonActionHelper {
	
	R2_CheckOut_PO r2CheckOutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	String taxpaypal;
	String shippingpaypal;
	String shippingpcheckout;
	String taxcheckout;
	
	@Then("^user enter the paypal login \"(.*?)\" \"(.*?)\" and capture order summary in paypal$")
	public void user_enter_the_paypal_login_and_capture_order_summary_in_paypal(String arg1, String arg2) throws Throwable {
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		   System.err.println(driver.getTitle());
		 
		}
	
		setInputText(r2CheckOutPo.PaypalEmail_Input, webPropHelper.getTestDataProperty(arg1));
		assertTrue(clickOnButton(r2CheckOutPo.PaypalNext_Btn));
		setInputText(r2CheckOutPo.PaypalPassWord_Input, webPropHelper.getTestDataProperty(arg2));
		assertTrue(clickOnButton(r2CheckOutPo.PaypalLogin_Btn));
		Thread.sleep(Constants.thread_high);
		driver.manage().window().maximize();
		Thread.sleep(Constants.thread_high);
		
		taxpaypal=r2CheckOutPo.PayPaltaxprice.getText();
		taxpaypal=taxpaypal.replace("$", "");
		taxpaypal=taxpaypal.replace("USD", "");
		Thread.sleep(Constants.thread_high);
		shippingpaypal=r2CheckOutPo.PayPalshippingprice.getText();
		shippingpaypal=shippingpaypal.replace("$", "");
		shippingpaypal=shippingpaypal.replace("USD", "");

		assertTrue(clickOnButton(r2CheckOutPo.PayPalContinue_Btn));
/*
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(Constants.thread_high);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(Constants.thread_high);
		assertTrue(clickOnButton(r2CheckOutPo.PayPalContinue_Btn));
		*/
		Thread.sleep(Constants.thread_highest);
		driver.switchTo().window(winHandleBefore);
		System.err.println(driver.getTitle());

	}
	@Then("^capture order summary in checkout after arriving from paypal$")
	public void capture_order_summary_in_checkout_after_arriving_from_paypal() throws Throwable {
		Thread.sleep(Constants.thread_high);
		taxcheckout=r2CheckOutPo.taxAmountCheckout.getText();
		taxcheckout=taxcheckout.replace("$", "");
		shippingpcheckout=r2CheckOutPo.ShippingPrice_Txt.getText();
		shippingpcheckout=shippingpcheckout.replace("$", "");
	    
	}
	@Then("^verify order summary in checkout should be same as in paypal$")
	public void verify_order_summary_in_checkout_should_be_same_as_in_paypal() throws Throwable {
		 float paypalshippingvalidation = Float.parseFloat(shippingpaypal);
		 float checkoutshippingvalidation = Float.parseFloat(shippingpcheckout);
		 float paypaltaxvalidation = Float.parseFloat(taxpaypal);
		 float checkouttaxvalidation = Float.parseFloat(taxcheckout);
		 
		System.out.println(paypalshippingvalidation);
		System.out.println(checkoutshippingvalidation);
		System.out.println(paypaltaxvalidation);
		System.out.println(checkouttaxvalidation);

		Assert.assertEquals(paypaltaxvalidation, checkouttaxvalidation, 0.0);
		Assert.assertEquals(paypalshippingvalidation, checkoutshippingvalidation, 0.0);
	}
		
	    
	}
