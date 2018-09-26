package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K4119_SD extends CommonActionHelper {
	 R1_GlobalElementHeader_Home_PO globalElementHeader=PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	R2_R1_Fun_PO r2_r1_fun_po=PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R2_CheckOut_PO r2CheckOutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R1_PDP_PO pdp_po =PageFactory.initElements(driver, R1_PDP_PO.class);

	
	
	@Then("^Verify that Add to Cart CTA is displayed$")
	public void verify_that_Add_to_Cart_CTA_is_displayed() throws Throwable {
		//waitForElement(r2_r1_fun_po.AddToCart_btn);
		//Thread.sleep(2000);
		assertTrue(clickOnButton(pdp_po.btnAddToCart));
		//assertTrue(clickOnButton(r2_r1_fun_po.AddToCart_btn));
		//Thread.sleep(2000);
	}
	
	@Then("^verify that View Cart and Checkout CTA is displayed$")
	public void verify_that_View_Cart_and_Checkout_CTA_is_displayed() throws Throwable {
		assertTrue(isDisplayed(pdp_po.btnViewCart));
		//assertTrue(isDisplayed(pdp_po.btnAddToCart));
	}


	@Then("^user verify item added successfully$")
	public void user_verify_item_added_successfully() throws Throwable {
	    isDisplayed(pdp_po.msgItemAddedSuccessfully);
	}

}
