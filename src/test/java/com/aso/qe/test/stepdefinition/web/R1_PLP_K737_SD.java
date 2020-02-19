package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R1_PLP_PO;

import cucumber.api.java.en.Then;

public class R1_PLP_K737_SD extends CommonActionHelper {

	public R1_PLP_PO plp_po = PageFactory.initElements(getDriver(), R1_PLP_PO.class);
	public R1_PDP_PO pdp_po = PageFactory.initElements(getDriver(), R1_PDP_PO.class);;
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);

	@Then("^user is able to see color and size attributes$")
	public void user_is_able_to_see_color_and_size_attributes() throws Throwable {
		waitForElement(plp_po.productColourAvailable);
		assertTrue(isDisplayed(plp_po.productColourAvailable));
		assertTrue((isDisplayed(pdp_po.secSize1)));

	}

	@Then("^user is able to see full product details attribute$")
	public void user_is_able_to_see_full_product_details_attribute() throws Throwable {
		waitForElement(plp_po.lnkSeeProdcutDetails);
		assertTrue(isDisplayed(plp_po.lnkSeeProdcutDetails));
	}

	@Then("^user is able to see quantity attribute$")
	public void user_is_able_to_see_quantity_attribute() throws Throwable {
		assertTrue(isDisplayed(pdp_po.quantityInput));
		assertTrue(isDisplayed(pdp_po.btnQuantityDec));
		assertTrue(isDisplayed(pdp_po.btnQuantityInc));
	}

	@Then("^User click on Quick view button on oos$")
	public void user_click_on_Quick_view_button_on_oss() throws Throwable {
		pdp_po.moveToPdpImage1();
		pdp_po.cilckQuickViewbutton();
	}

	@Then("^user click on see full product details$")
	public void user_click_on_see_full_product_details() throws Throwable {
		waitForElement(plp_po.lnkSeeProdcutDetails);
		assertTrue(clickOnButton(plp_po.lnkSeeProdcutDetails));
	}

}
