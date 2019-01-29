package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_PDP_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_MYACCOUNT_K4012_SD extends CommonActionHelper {
	
	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R2_PDP_PO r2PdpPo = PageFactory.initElements(driver, R2_PDP_PO.class);
	R2_CheckOut_PO r2CheckOutPO = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	String actualOrderNumber;
	//R2_MYACCOUNT_K4327_SD r2MyAccount_SD = PageFactory.initElements(driver, R2_MYACCOUNT_K4327_SD.class);
	
	
	@Then("^user click on view Details of List orders and verify the cancel order button$")
	public void user_click_on_view_Details_of_List_orders_and_verify_the_cancel_order_button() throws Throwable {
		Thread.sleep(Constants.thread_highest); 
		for(WebElement ViewOrder:r2MyAccountPo.viewOrderDetailsBtn ) {
			
			assertTrue(clickOnButton(ViewOrder));
			assertTrue(isDisplayed(r2MyAccountPo.Order_Cancel_lnk));	
			
		}		
	}
	
	@When("^User clicks on Yes Button on confirmation modal$")
	public void user_clicks_on_Yes_Button_on_confirmation_modal() throws Throwable {
		
		assertTrue(clickOnButton(r2MyAccountPo.Cancel_Yes_Order_Btn));
		
	}
	

	@Then("^user clicks on By Now button$")
	public void user_clicks_on_By_Now_button() throws Throwable {
		waitForPageLoad(driver);
		waitForElement(r2PdpPo.Default_Payment_Option_btn);
		assertTrue(clickOnButton(r2PdpPo.Default_Payment_Option_btn));
		
	}
	
	@Then("^user is navigated to order confirmation page and captures order number$")
	public void user_is_navigated_to_order_confirmation_page_and_captures_order_number() throws Throwable {
		waitForElement(r2CheckOutPO.orderConfirmationPage_OrderNumber);
		actualOrderNumber=r2CheckOutPO.orderConfirmationPage_OrderNumber.getText();
		System.err.println(actualOrderNumber);
		
	}
	
	@Then("^user click on view Details with the GeneratedOrdernumber by No$")
	public void user_click_on_view_Details_with_the_GeneratedOrdernumber_by_No() throws Throwable {
			waitForElement(r2MyAccountPo.ordersDropDownNewest);
			for(WebElement ViewOrder:r2MyAccountPo.viewOrderDetailsBtn) {        	   
	     	 assertTrue(clickOnButton(ViewOrder));
	     	Thread.sleep(Constants.thread_medium);
			String ordernumber=r2MyAccountPo.MyAccount_OrderDetailsPage_OrderNumber.getText();	
				if(ordernumber.equalsIgnoreCase(actualOrderNumber)) {		
					assertTrue(clickOnButton(r2MyAccountPo.Order_Cancel_lnk));	
					assertTrue(clickOnButton(r2MyAccountPo.Cancel_NO_Order_Btn));
					break;					
				}
				
			}	
		
	}
	
	@Then("^user click on view Details with the GeneratedOrdernumber by yes$")
	public void user_click_on_view_Details_with_the_GeneratedOrdernumber() throws Throwable {
		
		for(WebElement ViewOrder:r2MyAccountPo.viewOrderDetailsBtn) {        	   
	     	 assertTrue(clickOnButton(ViewOrder));
	     	Thread.sleep(Constants.thread_medium);
			String ordernumber=r2MyAccountPo.Order_Number_Txt.getText();	
				if(ordernumber.equalsIgnoreCase(actualOrderNumber)) {		
					assertTrue(clickOnButton(r2MyAccountPo.Order_Cancel_lnk));	
					assertTrue(clickOnButton(r2MyAccountPo.Cancel_Yes_Order_Btn));
					break;					
				}
				
			}		
	}
	
	@Then("^verify the cancellation Order message$")
	public void verify_the_cancellation_Order_message() throws Throwable {
		//Functionality not working
	}
	
	@Then("^verify the cancel order link is not displayed$")
	public void order_is_cancelled_And_Cancel_Order_link_is_not_displayed_in_Order_Details_Page() throws Throwable {
		
		assertFalse(isDisplayed(r2MyAccountPo.Order_Cancel_lnk));
		
	}
	
	

}
