package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.PDP_PO;

import cucumber.api.java.en.Then;

public class R1_PLP_K732_SD extends CommonActionHelper {

	public PDP_PO pdp_po = PageFactory.initElements(getDriver(), PDP_PO.class);;
	GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	
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
	public void verify_addcart_button_is_displayed() throws Throwable {
		assertTrue(isDisplayed(pdp_po.btnAddToCart));
	}

}
