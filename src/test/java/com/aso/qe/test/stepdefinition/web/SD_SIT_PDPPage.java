package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.PDP_PO;

import cucumber.api.java.en.Then;

public class SD_SIT_PDPPage extends CommonActionHelper {
	//private static final Logger logger = Logger.getLogger(SD_SIT_PDPPage.class);
	PDP_PO pdp_po = PageFactory.initElements(getDriver(), PDP_PO.class);

	@Then("^user should verify the Product is not for sold online$")
	public void user_should_verify_the_Product_is_not_for_sold_online() throws Throwable {
		assertTrue(isDisplayed(pdp_po.txtNotsoldonline));
	}



}
