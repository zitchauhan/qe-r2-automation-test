
package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.apache.tools.ant.util.SymbolicLinkUtils;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.Then;
import static org.junit.Assert.assertEquals;
//import junit.framework.Assert;

public class ES199_SD extends CommonActionHelper{
	R2_Cart_PO r2CartPo = PageFactory.initElements(getDriver(), R2_Cart_PO.class);
	R2_CheckOut_PO r2CheckOutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);

	@Then("^User click on Cancel and return to Academy Sports Outdoor's Test Store link on paypal home page$")
	public void user_click_on_Cancel_and_return_to_Academy_Sports_Outdoor_s_Test_Store_link_on_paypal_home_page() throws Throwable {
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		   System.err.println(driver.getTitle());
		 
		}
		System.err.println(getTitle());
		Thread.sleep(Constants.thread_medium);
		driver.manage().window().maximize();
		Thread.sleep(Constants.thread_medium);
		Assert.assertTrue(isDisplayed(r2CartPo.Paypalteststorelink));
		clickOnLink(r2CartPo.Paypalteststorelink); 
		driver.switchTo().window(winHandleBefore);
		
		
	}

	@Then("^Verify user will navigated to cart page$")
	public void verify_user_will_navigated_to_cart_page() throws Throwable {
		Thread.sleep(Constants.thread_low);
		System.err.println(driver.getTitle());		
		genericPO.verifyPresenceOfCartPage();
	    
	}
	

	
		
		
		
		
		
		
		
	    
}