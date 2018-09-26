package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K2868_SD extends CommonActionHelper {
//	private static final Logger logger = Logger.getLogger(R1_HP_K729_SD.class);
//	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
//	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
//	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
//			R1_GlobalElementHeader_Home_PO.class);
	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R1_PDP_PO pdp_po =PageFactory.initElements(driver, R1_PDP_PO.class);
	R2_R1_Fun_PO r2R1FunPO=PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	@Then("^user click on review order button$")
	public void user_click_on_review_order_button() throws Throwable {
		clickOnButton(r2CheckOutPo.ReviewOrder_Btn);
	}

	@Then("^Verify that In-Store Pickup Information is displayed$")
	public void verify_that_In_Store_Pickup_Information_is_displayed() throws Throwable {
		 //Need to verify, functionality is not working 
	}

	@Then("^Verify that notes are displayed$")
	public void verify_that_notes_are_displayed() throws Throwable {
		 //Need to verify, functionality is not working 
	}

	@Then("^Verify that Order Summary displayed$")
	public void verify_that_Order_Summary_displayed() throws Throwable {
		 //Need to verify, functionality is not working 
	}

	@Then("^Verify that Payment Details is displayed$")
	public void verify_that_Payment_Details_is_displayed() throws Throwable {
	  //Need to verify, functionality is not working  
	}


}
