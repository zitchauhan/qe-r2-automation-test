package com.aso.qe.test.stepdefinition.web;



import static org.junit.Assert.assertTrue;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CART_K3172_SD extends CommonActionHelper {
	
	R2_MyAccount_PO r2_MyAccount_PO = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	
		
	@Then("^user click on print receipt link$")
	public void user_click_on_print_receipt_link() throws Throwable {
	    assertTrue(isDisplayed(r2_MyAccount_PO.Order_Print_Receipt));
	}
	
	}
