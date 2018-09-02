package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;

import cucumber.api.java.en.Then;

public class R1_SLR_K3267_SD extends CommonActionHelper {

	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	public R1_SearchProduct_PO searchProductPO = PageFactory.initElements(driver, R1_SearchProduct_PO.class);
	public R1_PDP_PO pdp_po = PageFactory.initElements(driver, R1_PDP_PO.class);

	@Then("^User enter the SKU search \"(.*?)\"$")
	public void User_enter_the_SKU_search(String str) throws Throwable {
		globalElementHeader.entertheSearchData(str);

	}

	@Then("^User enter the invalid SKU search \"(.*?)\"$")
	public void User_enter_the_invalid_SKU_search(String str) throws Throwable {
		globalElementHeader.entertheSearchData(str);

	}

	@Then("^user verifies the entered SKU id$")
	public void user_verifies_the_entered_SKU_id() throws Throwable {
		assertTrue(isDisplayed(pdp_po.txtProductSKU));
	}

	@Then("^user verifies the error null search result page$") //Anuj 09-Aug
	public void user_verifies_the_error_null_search_result_page() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			
			waitForElement(globalElementHeader.txtPleaseTryAnotherSearchMobile);
			String textError = globalElementHeader.txtPleaseTryAnotherSearchMobile.getText();
			assertTrue(textError.contains("couldn't find anything for"));
		}else {
			waitForElement(globalElementHeader.txtPleaseTryAnotherSearchMobile);
			String textError = globalElementHeader.txtPleaseTryAnotherSearchMobile.getText();
			assertTrue(textError.contains("couldn't find anything for"));
		}
	}
}
