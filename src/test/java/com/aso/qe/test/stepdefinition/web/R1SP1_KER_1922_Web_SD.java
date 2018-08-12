package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.PDP_PO;

import cucumber.api.java.en.Then;

public class R1SP1_KER_1922_Web_SD extends CommonActionHelper{
	//private static final Logger logger = Logger.getLogger(R1SP1_KER_1920_Web_SD.class);
	PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), PDP_PO.class);
	public GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);

	@Then("^user clicks on the product image to zoom$")
	public void user_clicks_on_the_product_image_to_zoom() throws Throwable {
	   assertTrue(clickOnButton(pdpPageObj.imgClickToZoom));
	   
	}

	@Then("^user clicks on the cross button to close the zoomed image$")
	public void user_clicks_on_the_cross_button_to_close_the_zoomed_image() throws Throwable {
		   assertTrue(clickOnButton(pdpPageObj.btnCloseCrossZoom));
	}



}

