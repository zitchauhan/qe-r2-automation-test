package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R2_MYACCOUNT_K4237_SD extends CommonActionHelper {
	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R2_CheckOut_PO r2_CheckOut_PO = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_R1_Fun_PO r2_r1_FunPo = PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R1_GlobalElementHeader_Home_PO globalelementPO = PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	
	@Then("^User clicks on View Details CTA for an order$")
	public void user_clicks_on_View_Details_CTA_for_an_order() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.Check_Btn));
	}

	@And("^user click on check order link and check for the order with zip code \"(.*?)\"$")
	public void user_click_on_check_order_link_and_check_for_the_order_with_zip_code(String zip) throws Throwable {
		Thread.sleep(Constants.thread_low);
		String orderNumber = getText(r2_CheckOut_PO.orderSubmitted_OrderNumber).trim();
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(r2_r1_FunPo.NeddHelp_M));
			assertTrue(clickOnButton(r2_r1_FunPo.CheckOrder_Lnk));
		} else {
			assertTrue(clickOnButton(r2_r1_FunPo.CheckOrder_Lnk));
		}
		clearInputBox(r2_CheckOut_PO.checkOutCheckOrderStatus_OrderNumberInput);
		setInputText(r2_CheckOut_PO.checkOutCheckOrderStatus_OrderNumberInput, orderNumber);
		clearInputBox(r2_CheckOut_PO.inputCheckoutZipCode);
		setInputText(r2_CheckOut_PO.inputCheckoutZipCode, webPropHelper.getTestDataProperty(zip));
		assertTrue(clickOnButton(r2MyAccountPo.Check_Btn));
	}

	@And("^user click on view store details button$")
	public void user_click_on_view_store_details_button() throws InterruptedException{
		assertTrue(clickOnButton(r2MyAccountPo.Order_Bopis_View_Store_Btn));
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		 System.err.println(driver.getTitle());
		   System.err.println(driver.getTitle().toLowerCase().contains("store"));
		   assertTrue(driver.getTitle().toLowerCase().contains("store"));
	}
	@Then("^user click on the check order button available in footer$")
	public void user_click_on_the_check_order_button_available_in_footer() {
		assertTrue(clickOnButton(globalelementPO.lnkcheckorder));
	}
	@And("^user enter the orderid \"(.*?)\" and billing zipcode \"(.*?)\"$")
	public void user_enter_the_orderid_and_billing_zipcode(String orderId, String zipCode) {
		setInputText(r2MyAccountPo.orderIdCheckOrderStatus, webPropHelper.getTestDataProperty(orderId));
		setInputText(r2MyAccountPo.zipCodeCheckOrderStatus,  webPropHelper.getTestDataProperty(zipCode));
	}
	
	@And("^user click on check button$")
	public void user_click_on_check_button() {
		assertTrue(clickOnButton(r2MyAccountPo.Check_Btn));
	}
	
}
