package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;

import cucumber.api.java.en.Then;

public class R2_CART_K2946_SD extends CommonActionHelper {
	
	R2_Cart_PO cart_po_r2 = PageFactory.initElements(driver, R2_Cart_PO.class);
	
	@Then("^user should see all payment icons on cart page$")
	public void user_should_see_all_payment_icons_on_cart_page() throws Throwable {
		assertTrue(isDisplayed(cart_po_r2.iconVisa));
		assertTrue(isDisplayed(cart_po_r2.iconMasterCard));
		assertTrue(isDisplayed(cart_po_r2.iconPaypal));
	//	assertTrue(isDisplayed(cart_po_r2.iconGooglePay)); /De-scoped
		assertTrue(isDisplayed(cart_po_r2.iconApplePay));
		assertTrue(isDisplayed(cart_po_r2.iconDiscover));
		assertTrue(isDisplayed(cart_po_r2.iconAmericanExpress));
	}
	
	
	
	
	
	
	/*@Then("^user able to signin$")//temporary basis 
	public void user_able_to_signin() throws Throwable 
	{
	   driver.findElement(By.xpath("//*[@data-auid='emailid_input']")).sendKeys("testacademy@gmail.com");
	   driver.findElement(By.xpath("//*[@data-auid='password_input']")).sendKeys("Test@1234");
	   driver.findElement(By.xpath("//*[@data-auid='btnemail-signin-button']")).click();
	}*/
	
	
	
}
