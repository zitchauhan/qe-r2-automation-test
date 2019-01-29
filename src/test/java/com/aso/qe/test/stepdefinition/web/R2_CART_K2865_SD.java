package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;
import cucumber.api.java.en.And;


public class R2_CART_K2865_SD extends CommonActionHelper {

	public R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,R1_GlobalElementHeader_Home_PO.class);
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	R2_MyAccount_PO r2MyAccountPO = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R2_R1_Fun_PO r2R1FunPO = PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R1_PDP_PO r1PDPPO = PageFactory.initElements(driver, R1_PDP_PO.class);
	R2_CheckOut_PO r2CheckoutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	
	@And("^user click on change location link in view cart page$")
	public void user_click_on_location_link_in_view_cart_page() {
		assertTrue(clickOnButton(r2CartPo.changeLocationViewCart));
	}
	
	@And("^user collapse the store name$")
	public void user_collapse_the_store_name() throws InterruptedException {
		Thread.sleep(Constants.thread_high);
		assertTrue(clickOnButton(r2CheckoutPo.collapse));
	}
}
