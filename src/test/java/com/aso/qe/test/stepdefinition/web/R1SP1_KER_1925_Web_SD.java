package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.PDP_PO;
import com.aso.qe.test.pageobject.PLP_PO;
import com.aso.qe.test.pageobject.SIT_PO;

import cucumber.api.java.en.Then;

public class R1SP1_KER_1925_Web_SD extends CommonActionHelper {
	PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), PDP_PO.class);
	PLP_PO plpPageObj = PageFactory.initElements(getDriver(), PLP_PO.class);
	public GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver,
			GlobalElementHeader_HomePO.class);
	public SIT_PO HomePagePo = PageFactory.initElements(driver, SIT_PO.class);
	private String plpPrice,pdpPrice,pdpClearnacePrice;
	
	@Then("^Navigate to PLP and select one product with regular price\\(without any promotion\\)$")
	public void navigate_to_PLP_and_select_one_product_with_regular_price_without_any_promotion() throws Throwable {
//		plpPageObj.clickShirtImage();
//		clickOnButton(pdpPageObj.imgWithoutPRomotion_PRice);
//		assertTrue(isDisplayed(pdpPageObj.txtPlpPrice));
//		plpPrice=pdpPageObj.txtPlpPrice.getText();
//		pdpPageObj.clickPlpImage();
	//Fixed by RKA 14 Aug
		assertTrue(isDisplayed(pdpPageObj.imgWithoutPRomotion_PRice));
		plpPrice=pdpPageObj.imgWithoutPRomotion_PRice.getText();
		clickOnButton(pdpPageObj.imgWithoutPRomotion_PRice);
	
	
	
	}

	@Then("^Verfiy selected product price$")
	public void verfiy_selected_product_price() throws Throwable {
		assertTrue(isDisplayed(pdpPageObj.txtPdpprice));
		pdpPrice=pdpPageObj.txtPdpprice.getText();
		assertTrue(plpPrice.contains(pdpPrice));
	}
	
	@Then("^Navigate to PLP and select one product with clearance$")
	public void navigate_to_PLP_and_select_one_product_with_clearance() throws Throwable {
		//plpPageObj.clickShirtImage();
		//clickOnButton(pdpPageObj.imgWithoutPRomotion_PRice);
		//Fixed By RKA 14 Aug
		assertTrue(clickOnButton(pdpPageObj.filterADfeature));
		assertTrue(clickOnButton(pdpPageObj.filterClearence));
		
		
		
		//pdpPageObj.clickClearanceImage(); 
	}

	@Then("^User should able to see Strike Through Price with Actual price$")
	public void user_should_able_to_see_Strike_Through_Price_with_Actual_price() throws Throwable {
//		assertTrue(isDisplayed(pdpPageObj.txtPdpClearnacePrice));
//		pdpPrice=pdpPageObj.txtPdpprice.getText();
//		pdpClearnacePrice=pdpPageObj.txtPdpClearnacePrice.getText();
//		assertFalse(pdpPrice.contains(pdpClearnacePrice));	
		//pdpPrice=pdpPageObj.txtPdpprice.getText();	
		
		//Fixed By RKA 14 Aug
		
		assertTrue(isDisplayed(pdpPageObj.firstClearanceItem));
		plpPrice=pdpPageObj.PriceOFfirstClearenceITem.getText();
		assertTrue(clickOnButton(pdpPageObj.PriceOFfirstClearenceITem));
		pdpPrice=pdpPageObj.txtPriceofPDP.getText();
		assertEquals(plpPrice, pdpPrice);
		
		
	}
}
