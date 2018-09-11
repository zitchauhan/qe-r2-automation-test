package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CART_K3467_SD extends CommonActionHelper {
	R2_Cart_PO r2_cart_po = PageFactory.initElements(driver, R2_Cart_PO.class);
	
	@When("^user enters \"(.*?)\" in Find a store search zip code field$")
	public void user_enters_in_Find_a_store_search_zip_code_field(String arg1) throws Throwable {
		if("mobile".equalsIgnoreCase(testtype))
		{
			assertTrue(clickOnButton(r2_cart_po.lnkFindAStore_M));
			setInputText(r2_cart_po.txtZipCode, webPropHelper.getTestDataProperty(arg1));
	        assertTrue(clickOnButton(r2_cart_po.btnZipCode));
	        Thread.sleep(1000);
		}
		else
		{
		assertTrue(clickOnButton(r2_cart_po.lnkFindAStore));
        setInputText(r2_cart_po.txtZipCode, webPropHelper.getTestDataProperty(arg1));
        assertTrue(clickOnButton(r2_cart_po.btnZipCode));
        Thread.sleep(1000);
		}
	}

	@Then("^message There are no stores within 250 miles is displayed$")
	public void message_There_are_no_stores_within_miles_id_displayed() throws Throwable {
	    assertTrue(isDisplayed(r2_cart_po.txtNoStoreErrorMessage));
	}

}
