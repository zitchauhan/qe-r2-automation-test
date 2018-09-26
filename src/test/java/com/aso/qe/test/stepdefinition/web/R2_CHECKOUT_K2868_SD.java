package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K2868_SD extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_HP_K729_SD.class);
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

	
}
