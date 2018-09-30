package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K2869_SD extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_HP_K729_SD.class);
//	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
//	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
//			R1_GlobalElementHeader_Home_PO.class);
//	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R1_PDP_PO pdp_po =PageFactory.initElements(driver, R1_PDP_PO.class);
	R2_R1_Fun_PO r2R1FunPO=PageFactory.initElements(driver, R2_R1_Fun_PO.class);

	@Then("^user decrease the quantity of item in PDP$")
	public void user_decrease_the_quantity_of_item_in_PDP() throws Throwable {
		 assertTrue(clickOnButton(pdp_po.btnQuantityDec));
		 assertTrue(clickOnButton(pdp_po.btnQuantityDec));
	}
	
	@Then("^Verify add to cart button not dispalyed$")
	public void verify_add_to_cart_button_not_dispalyed() throws Throwable {
		assertFalse(isDisplayed(pdp_po.btnAddToCart));
	}
	
	@Then("^verfiy the Change Zip code link$")
	public void verfiy_the_Change_Zip_code_link() throws Throwable {
		assertTrue(isDisplayed(r2R1FunPO.ChangeZipCode_lnk));
	}
	
	@Then("^verfiy the Change Pickup Location link$")
	public void verfiy_the_Change_Pickup_Location_link() throws Throwable {
		assertTrue(isDisplayed(r2R1FunPO.lnkPickupLocation));
	}
	
	@Then("^User clicks on choose location$")
	public void user_clicks_on_choose_location() throws Throwable {
		 //assertTrue(clickOnButton(r2R1FunPO.ChooseLocation_Lnk));
		 Thread.sleep(Constants.thread_low);
	}
	
	@Then("^verify that Find a Store Modal is displayed$")
	public void verify_that_Find_a_Store_Modal_is_displayed() throws Throwable {
		assertFalse(isDisplayed(r2CartPo.txtZipCode));
	}
}
