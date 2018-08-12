package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.PDP_PO;
import com.aso.qe.test.pageobject.PLP_PO;

import cucumber.api.java.en.Then;

public class R1SP1_KER_737_Web_SD extends CommonActionHelper {

	public PLP_PO plp_po = PageFactory.initElements(getDriver(), PLP_PO.class);
	public PDP_PO pdp_po = PageFactory.initElements(getDriver(), PDP_PO.class);;
	GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);

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
		assertTrue(isDisplayed(pdp_po.btnAddToCart));
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
