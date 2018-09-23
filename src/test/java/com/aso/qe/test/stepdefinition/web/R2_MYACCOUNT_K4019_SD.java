package com.aso.qe.test.stepdefinition.web;


import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_MYACCOUNT_K4019_SD extends CommonActionHelper 
{
    String OrderNumber;
	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R2_R1_Fun_PO r2R1FunPO = PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R2_CheckOut_PO r2CheckOutPO = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	
	public R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);

	@And("^user click on yes cancle my order button$")
	public void user_click_on_yes_cancle_my_order_button() {
		assertTrue(clickOnButton(r2MyAccountPo.Cancel_Yes_Order_Btn));
	}
	
	@And("^Cancel Order CTA should not be displayed$")
	public void Cancel_Order_CTA_should_not_be_displayed() {
		Boolean flag= false;
		flag=isDisplayed(r2MyAccountPo.Order_Cancel_lnk);
		if(flag) {
			assertFalse(flag);
		}
		else {
			assertFalse(flag);
		}
	}
	
	@Then("^Verify that the order cancellation confirmation page is displayed$")
	public void Verify_that_the_order_cancellation_confirmation_page_is_displayed() {
		waitForElement(r2MyAccountPo.Order_Cancellation_page);
		assertTrue(isDisplayed(r2MyAccountPo.Order_Cancellation_page));
	}
	
	@And("^user should be able to see cancellation message$")
	public void user_should_be_able_to_see_cancellation_message() {
		assertTrue(isDisplayed(r2MyAccountPo.Order_Cancellaton_Message));
		assertEquals("Your Order Cancellation request has been received".toLowerCase(), r2MyAccountPo.Order_Cancellaton_Message.getText().toLowerCase());
	}
	
	@And("^Refund details should be displayed$")
	public void Refund_details_should_be_displayed() {
		assertTrue(isDisplayed(r2MyAccountPo.Cancellation_Page_Refund_Payment_Details));
		
	}
	
	
}