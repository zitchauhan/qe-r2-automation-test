package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import cucumber.api.java.en.Then;

public class R1_PDP_K1934_SD extends CommonActionHelper{

	R1_PDP_PO pdp_po = PageFactory.initElements(getDriver(), R1_PDP_PO.class);

	@Then("^user verify size of product$")
	public void user_verify_size_of_product() throws Throwable {
		
		pdp_po.sizeTextname();
	}

	
	@Then("^user select the first clearance item$")
	public void user_select_the_first_clearance_item() throws Throwable {
		assertTrue(isDisplayed(pdp_po.firstClearanceItem));
		clickOnButton(pdp_po.firstClearanceItem);
		String clearanceText=getText(pdp_po.textclearance).substring(0,9 ).toLowerCase();
		assertEquals(clearanceText, "clearance");
	}
	
	@Then("^user click on non clearance item$")
	public void user_click_on_non_clearance_item() throws Throwable {
	  // driver.navigate().back();
	   waitForPageLoad(driver);
	   pdp_po.clickOnNonClearanceItem();
		
	}
	
	@Then("^user check the SKU for availabe or non available item$")
	public void user_check_the_SKU_for_availabe_or_non_available_item() throws Throwable {
	    pdp_po.verifySKUforallItem();
	}

}

