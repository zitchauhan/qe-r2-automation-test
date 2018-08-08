package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.PDP_PO;
import com.aso.qe.test.pageobject.SIT_HomePagePageObject;

import cucumber.api.java.en.Then;

public class R1SP1_KER_1925_Web_SD extends CommonActionHelper {
	PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), PDP_PO.class);
	public GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver,
			GlobalElementHeader_HomePO.class);
	public SIT_HomePagePageObject HomePagePo = PageFactory.initElements(driver, SIT_HomePagePageObject.class);
	private String plpPrice,pdpPrice,pdpClearnacePrice;
	
	@Then("^Navigate to PLP and select one product with regular price\\(without any promotion\\)$")
	public void navigate_to_PLP_and_select_one_product_with_regular_price_without_any_promotion() throws Throwable {
		pdpPageObj.clickShritImage();
		assertTrue(isDisplayed(pdpPageObj.txtPlpPrice));
		plpPrice=pdpPageObj.txtPlpPrice.getText();
		pdpPageObj.clickPlpImage();
	}

	@Then("^Verfiy selected product price$")
	public void verfiy_selected_product_price() throws Throwable {
		assertTrue(isDisplayed(pdpPageObj.txtPdpprice));
		pdpPrice=pdpPageObj.txtPdpprice.getText();
		assertTrue(plpPrice.contains(pdpPrice));
	}
	
	@Then("^Navigate to PLP and select one product with clearance$")
	public void navigate_to_PLP_and_select_one_product_with_clearance() throws Throwable {
		pdpPageObj.clickShritImage();
		pdpPageObj.clickClearanceImage(); 
	}

	@Then("^User should able to see Strike Through Price with Actual price$")
	public void user_should_able_to_see_Strike_Through_Price_with_Actual_price() throws Throwable {
		assertTrue(isDisplayed(pdpPageObj.txtPdpClearnacePrice));
		pdpPrice=pdpPageObj.txtPdpprice.getText();
		pdpClearnacePrice=pdpPageObj.txtPdpClearnacePrice.getText();
		assertFalse(pdpPrice.contains(pdpClearnacePrice));	
	}
}
