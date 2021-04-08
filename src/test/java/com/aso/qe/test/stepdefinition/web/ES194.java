
package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.apache.tools.ant.util.SymbolicLinkUtils;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.Then;
import static org.junit.Assert.assertEquals;
//import junit.framework.Assert;

public class ES194 extends CommonActionHelper{
	R2_Cart_PO r2CartPo = PageFactory.initElements(getDriver(), R2_Cart_PO.class);
	R2_CheckOut_PO r2CheckOutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);

	
	@Then("^User click on paypal button on cart page$")
	public void user_click_on_paypal_button_on_cart_page() throws Throwable {
		isDisplayed(r2CartPo.btnCartPaypal);
		Thread.sleep(2000);
		assertTrue(clickOnButton(r2CartPo.btnCartPaypal));
		Thread.sleep(Constants.thread_medium);
	}

	
		
		@Then("^user switch to iframe and verify PayPal Home page$")
		public void user_switch_to_iframe_and_verify_PayPal_Home_page() throws Throwable {
			String winHandleBefore = driver.getWindowHandle();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			   System.err.println(driver.getTitle());
			 
			}
			System.err.println(getTitle());
			Thread.sleep(Constants.thread_medium);
			Assert.assertTrue(isDisplayed(r2CartPo.PaypalHomepage));
			
		    
		    
		}
		
		
		
		
		
	    
}

