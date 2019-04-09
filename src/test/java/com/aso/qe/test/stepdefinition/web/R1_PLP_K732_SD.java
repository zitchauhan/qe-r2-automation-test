package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;

import cucumber.api.java.en.Then;

public class R1_PLP_K732_SD extends CommonActionHelper {

	public R1_PDP_PO pdp_po = PageFactory.initElements(getDriver(), R1_PDP_PO.class);;
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_Generic_PO generic_po = PageFactory.initElements(getDriver(), R1_PLCC_Generic_PO.class);
	
	@Then("^User click on Quick view button$")
	public void user_click_on_Quick_view_button() throws Throwable {
		Actions actions = new Actions(driver);
		actions.moveToElement(pdp_po.pdpImage).build().perform();
		actions.moveToElement(pdp_po.btnQuickView).click().build().perform();
//	  moveHover(pdp_po.pdpImage);
//	  moveHover(pdp_po.btnQuickView);
//	  clickOnLink(pdp_po.btnQuickView);
	}

	@Then("^verify addcart button is displayed$")
	public void verify_addcart_button_is_displayed() throws Throwable 
	{
		pdp_po.addToCartAvailability();
		assertTrue(isDisplayed(pdp_po.btnAddToCart));
	}

	@Then("^verify ship it button is displayed$")
	public void verify_ship_it_button_is_displayed() throws Throwable 
	{
		assertTrue(isDisplayed(generic_po.shipItButton));
	}
	

}

