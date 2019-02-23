package com.aso.qe.test.stepdefinition.web.plcc;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R1_PLCC_CreditCardApplicationModal_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;
import com.aso.qe.test.pageobject.R1_PLCC_LandingPage_PO;
import com.aso.qe.test.pageobject.R1_PLP_PO;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_Checkout_Discounts_101_Web extends CommonActionHelper {
	private String plpPrice,pdpPrice,pdpClearnacePrice;
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_CreditCardApplicationModal_PO plccCCApplicationModalObjects = PageFactory.initElements(driver,
			R1_PLCC_CreditCardApplicationModal_PO.class);
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);
	R1_PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), R1_PDP_PO.class);
	R1_PLP_PO plpPageObj = PageFactory.initElements(getDriver(), R1_PLP_PO.class);
	public static R1_GlobalElementHeader_Home_PO globalElementHeader;
	@When("^user expect element free shipping should be available$")
	public void user_expect_element_free_shipping_should_be_available() throws Throwable {
		genericPO.verifyPresenceOfFreeShipping();
	}
	
	@Then ("^User navigates to L2 page$")
	public void User_navigate_to_L2() throws InterruptedException {
		if("mobile".equalsIgnoreCase(testtype)){
			
			assertTrue(clickOnButton(globalElementHeader.btnClothingCategory_M));
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeader.btnMen_Clothing_Shop_M));
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeader. txtToNavigateMensBurgerMenuMobile));
			Thread.sleep(2000);

		} else{
			Thread.sleep(3000);
			assertTrue(clickOnButton(globalElementHeader.btnShopCategory));
			Thread.sleep(2000);
			Actions hover = new Actions(getDriver());
			hover.moveToElement(globalElementHeader.btnClothingCategory).build().perform();
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeader.btnMen_Clothing_Shop));
			Thread.sleep(2000);
		}

	}
	@Then("^Navigate to PLP and select one product with clearance for plcc$")
	public void navigate_to_PLP_and_select_one_product_with_clearance_for_plcc() throws Throwable {
		//plpPageObj.clickShirtImage();
		//clickOnButton(pdpPageObj.imgWithoutPRomotion_PRice);
		//Fixed By RKA 14 Aug
		assertTrue(clickOnButton(pdpPageObj.filterADfeature));
		assertTrue(clickOnButton(pdpPageObj.filterClearence));

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
