package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_MYACCOUNT_K4327_SD extends CommonActionHelper {
	
	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	public R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,R1_GlobalElementHeader_Home_PO.class);
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
		Thread.sleep(Constants.thread_medium);
	   
	}
	
	@When("^User clicks on Back to Order details Link on cancellation confirmation page$")
	public void user_clicks_on_Back_to_Order_details_Link_on_cancellation_confirmation_page() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.Order_Back_To_Order_Lnk));
	    
	}
	
	@When("^User Clicks on Cancel Order link$")
	public void user_Clicks_on_Cancel_Order_link() throws Throwable {
		Thread.sleep(600000); // Order will be eligible for cancellation after 4-5 mins of order placement as order take same time to reach sterling  
		assertTrue(clickOnButton(r2MyAccountPo.Order_Cancel_lnk));
	    
	}

	@When("^User clicks on No Button on confirmation modal$")
	public void user_clicks_on_No_Button_on_confirmation_modal() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.Cancel_NO_Order_Btn));
	    
	}

	@Then("^user click on view Details having orderid \"(.*?)\"$")
	public void user_click_on_view_Details_having_orderid(String orderId) throws InterruptedException {
		Thread.sleep(Constants.thread_high);
	WebElement clickViewButton = driver.findElement(By.xpath("//*[text()='"+webPropHelper.getTestDataProperty(orderId)+"']//ancestor::*[@class='row']//button"));
	boolean flag = true;
	flag = isDisplayed(clickViewButton);
	if(flag==false) {
	while(flag!=true)
		assertTrue(clickOnButton(globalElementHeader.lnkNextPagePagination));
		flag = isDisplayed(clickViewButton);
	}
	assertTrue(clickOnButton(clickViewButton));
}
	@And("^user click on yes cancel my order button$")
	public void user_click_on_yes_cancel_my_order_button() {
		isDisplayed(r2MyAccountPo.Cancel_Yes_Order_Btn);
		assertTrue(clickOnButton(r2MyAccountPo.Cancel_Yes_Order_Btn));
	}
	
	@And("^User verify Cancel Order link is not present$")
	public void User_verify_Cancel_Order_link_is_not_present() {
		boolean flag= true;
		flag= isDisplayed(r2MyAccountPo.Order_Cancel_lnk);
		assertFalse(flag);
	}
	
	@And("^user wait for two minute to cancel the order$")
	public void user_wait_for_two_minute_to_cancel_the_order() throws InterruptedException {
		Thread.sleep(120000);
	}
	
	@Then("^user should not be able to see order cancel modal pop up$")
	public void user_should_not_be_able_to_see_order_cancel_modal_pop_up() {
		boolean flag = true;
		flag= isDisplayed(r2MyAccountPo.cancelOrderModal);
			assertFalse(flag);
	}
	
	@And("^user click on NO button$")
	public void user_click_on_NO_button() {
		assertTrue(clickOnButton(r2MyAccountPo.Cancel_NO_Order_Btn));
	}
	
	@And("^user should be able to see order cancelation date$")
	public void user_should_be_able_to_see_order_cancelation_date() {
		assertTrue(isDisplayed(r2MyAccountPo.orderCancelationDate));
	}

}
