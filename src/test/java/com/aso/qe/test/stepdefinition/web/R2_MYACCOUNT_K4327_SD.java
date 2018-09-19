package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_MYACCOUNT_K4327_SD extends CommonActionHelper {
	
	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	
	@When("^user click on Orders link$")
	public void user_click_on_Orders_link() throws Throwable {		
		
		
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(r2MyAccountPo.Order_Back_To_Order_Lnk_M));
			
			
		} else {
			assertTrue(clickOnButton(r2MyAccountPo.myAccount_MyAccountList_Orders_lnk));

		}
	    
	}

	@Then("^user click on view Details$")
	public void user_click_on_view_Details() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.Order_View_Details_Btn));
		Thread.sleep(3000);
	   
	}
	
	@When("^User clicks on Back to Order details Link on cancellation confirmation page$")
	public void user_clicks_on_Back_to_Order_details_Link_on_cancellation_confirmation_page() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.Order_Back_To_Order_Lnk));
	    
	}
	
	@When("^User Clicks on Cancel Order link$")
	public void user_Clicks_on_Cancel_Order_link() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.Order_Cancel_lnk));
	    
	}

	@When("^User clicks on No Button on confirmation modal$")
	public void user_clicks_on_No_Button_on_confirmation_modal() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.Cancel_NO_Order_Btn));
	    
	}

}
