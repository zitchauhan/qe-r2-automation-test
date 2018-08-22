package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.PDP_PO;

import cucumber.api.java.en.Then;

public class R1SP1_KER_732_Web_SD extends CommonActionHelper {

	public PDP_PO pdp_po = PageFactory.initElements(getDriver(), PDP_PO.class);;
	GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	
	@Then("^User click on Quick view button$")
	public void user_click_on_Quick_view_button() throws Throwable {
//	  pdp_po.moveToPdpImage();
//	  //Thread.sleep(5000);
//	  pdp_po.cilckQuickViewbutton();
//	  
	  moveHover(pdp_po.pdpImage);
	  clickOnLink(pdp_po.btnQuickView);
	}

	@Then("^verify addcart or see details button is displayed\\.$")
	public void verify_addcart_or_see_details_button_is_displayed() throws Throwable {
		pdp_po.verifyAddcartOrSeeDetailsButton();
	}

}
