
package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.apache.tools.ant.util.SymbolicLinkUtils;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;

import cucumber.api.java.en.Then;
import static org.junit.Assert.assertEquals;
//import junit.framework.Assert;

public class ES194 extends CommonActionHelper{
	R2_Cart_PO r2CartPo = PageFactory.initElements(getDriver(), R2_Cart_PO.class);

	
	@Then("^User click on paypal button on cart page$")
	public void user_click_on_paypal_button_on_cart_page() throws Throwable {
		isDisplayed(r2CartPo.btnCartPaypal);
		assertTrue(clickOnButton(r2CartPo.btnCartPaypal));
	    
	}

	@Then("^Verify User is navigated to paypal home page\\.$")
	public void verify_User_is_navigated_to_paypal_home_page() throws Throwable {
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		//  System.err.println(driver.getTitle());
		   String APaypaltitle= driver.getTitle();
		  System.out.println(APaypaltitle+">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		  String Epaypaltitle="paypal" ;
		  assertEquals(APaypaltitle, Epaypaltitle);
		
		  
		}
		
	    
}
}
