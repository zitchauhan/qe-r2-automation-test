package com.aso.qe.test.stepdefinition.web;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_MYACCOUNT_K4018_SD extends CommonActionHelper 
{
    String OrderNumber;
	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R2_R1_Fun_PO r2R1FunPO = PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R2_CheckOut_PO r2CheckOutPO = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	
	public R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);

	@Then("^User navigates to Check Oder status Page$")
	public void user_navigates_to_Check_Oder_status_Page() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(r2R1FunPO.NeddHelp_M));
			assertTrue(clickOnButton(r2R1FunPO.CheckOrder_Lnk));
		}
		else
		{
			assertTrue(clickOnButton(r2R1FunPO.CheckOrder_Lnk));
		}
	  
	}

	@When("^user enter \"(.*?)\" and \"(.*?)\"$")
	public void user_enter_and(String arg1, String arg2) throws Throwable {
	    setInputText(r2MyAccountPo.OrderNumber_Input, webPropHelper.getTestDataProperty(arg1));
	    setInputText(r2MyAccountPo.BillindZipCode_Input, webPropHelper.getTestDataProperty(arg2));
	}

	@When("^User clicks on Check button$")
	public void user_clicks_on_Check_button() throws Throwable {
		assertTrue(isDisplayed(r2MyAccountPo.Check_Btn));
	}

	@Then("^Verify that error message is displayed$")
	public void verify_that_error_message_is_displayed() throws Throwable {
	   //Need to verify functionality is not working
	}


	@Then("^Order Details page should be displayed$")
	public void order_Details_page_should_be_displayed() throws Throwable {
		//Need to verify functionality is not working
	}

	@Then("^Billing information associated with order should NOT be displayed$")
	public void billing_information_associated_with_order_should_NOT_be_displayed() throws Throwable {
		//Need to verify functionality is not working
	}

	@Then("^system should navigate the authenticated user to Order Details page in my account page$")
	public void system_should_navigate_the_authenticated_user_to_Order_Details_page_in_my_account_page() throws Throwable {
		//Need to verify functionality is not working
	}

	@Then("^the Authenticated user should see all the placed orders in my account order details page$")
	public void the_Authenticated_user_should_see_all_the_placed_orders_in_my_account_order_details_page() throws Throwable {
		//Need to verify functionality is not working
	}

	@Then("^user able to see order number$")
	public void user_able_to_see_order_number() throws Throwable {
		waitForElement(r2CheckOutPO.orderConfirmationPage_OrderNumber);
		OrderNumber=r2CheckOutPO.orderConfirmationPage_OrderNumber.getText();
	}
		
	@Then("^System Generate ordernumber \"(.*?)\" and \"(.*?)\"$")
	public void system_Generate_ordernumber_and(String arg1, String arg2) throws Throwable {
		setInputText(r2MyAccountPo.OrderNumber_Input, OrderNumber);
	    setInputText(r2MyAccountPo.BillindZipCode_Input, webPropHelper.getTestDataProperty(arg2));
	}
}