package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.Then;

public class R2_MYACCOUNT_K4012_SD extends CommonActionHelper {
	
	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	
	
	@Then("^user click on view Details of List orders and verify the cancel order button$")
	public void user_click_on_view_Details_of_List_orders_and_verify_the_cancel_order_button() throws Throwable {
		
		for(WebElement ViewOrder:r2MyAccountPo.viewOrderDetailsBtn ) {
			
			assertTrue(clickOnButton(ViewOrder));
			assertTrue(isDisplayed(r2MyAccountPo.Order_Cancel_lnk));			
			
			
			
		}
		
		
	}

}
