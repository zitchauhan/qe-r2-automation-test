package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;

import cucumber.api.java.en.Then;

public class R1_PDP_K1922_SD extends CommonActionHelper{
	//private static final Logger logger = Logger.getLogger(R1SP1_KER_1920_Web_SD.class);
	R1_PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), R1_PDP_PO.class);
	public R1_GlobalElementHeader_Home_PO globalElementHeader= PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);

	@Then("^user clicks on the product image to zoom$")
	public void user_clicks_on_the_product_image_to_zoom() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			  assertTrue(clickOnButton(pdpPageObj.imgClickToZoomMobile));
		}else {
	   assertTrue(clickOnButton(pdpPageObj.imgClickToZoom));
		}
	}

	@Then("^user clicks on the cross button to close the zoomed image$")
	public void user_clicks_on_the_cross_button_to_close_the_zoomed_image() throws Throwable {
		   assertTrue(clickOnButton(pdpPageObj.btnCloseCrossZoom));
	}



}

