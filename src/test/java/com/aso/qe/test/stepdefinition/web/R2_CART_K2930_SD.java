package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;
import cucumber.api.java.en.And;

public class R2_CART_K2930_SD extends CommonActionHelper {

	public R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,R1_GlobalElementHeader_Home_PO.class);
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	R2_MyAccount_PO r2MyAccountPO = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R2_R1_Fun_PO r2R1FunPO = PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R1_PDP_PO r1PDPPO = PageFactory.initElements(driver, R1_PDP_PO.class);
	
	
	@And("^user verify that shipping charges for instore is coming as free$")
	public void user_verify_that_shipping_charges_for_instore_is_coming_as_free() {
		String shippingPrice = r2CartPo.instoreShippingChargesCartPage.getText();
		assertEquals(shippingPrice.toLowerCase(), "free");
	}
	
	@And("^user verify that pickup location for items are displayed$")
	public void user_verify_that_pickup_location_for_items_are_displayed() throws InterruptedException {
		Thread.sleep(Constants.thread_high);
		for(WebElement storeNameCartPage : r2CartPo.storeNamesCartPage) {
			assertTrue(isDisplayed(storeNameCartPage));
		}
	}
	
}
