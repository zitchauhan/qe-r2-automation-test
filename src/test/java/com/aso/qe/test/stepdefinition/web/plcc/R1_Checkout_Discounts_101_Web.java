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

import java.io.PrintStream;
import java.math.BigDecimal;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_Checkout_Discounts_101_Web extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	private String plpPrice,pdpPrice,pdpClearnacePrice;
	R1_PLCC_CreditCardApplicationModal_PO plccCCApplicationModalObjects = PageFactory.initElements(driver,
			R1_PLCC_CreditCardApplicationModal_PO.class);
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);
	R1_PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), R1_PDP_PO.class);
	R1_PLP_PO plpPageObj = PageFactory.initElements(getDriver(), R1_PLP_PO.class);
	public static R1_GlobalElementHeader_Home_PO globalElementHeader;
	
	@When("^user expect element free shipping should be available$")
	public void user_expect_element_free_shipping_should_be_available() throws Throwable {
		try {
			genericPO.verifyPresenceOfFreeShipping();
			String freeShipValue = genericPO.freeShipValue.getText();
			logger.debug("FreeShip Value is " + freeShipValue);
			if (freeShipValue.equalsIgnoreCase("FREE"))
			{
				logger.debug("Item Available for free shipping");
			}
			else
			{
				logger.debug("Item is not Available for free shipping");
			}
			
		} catch (Exception e) {
			
		}
	}
	
	@Given("^user expect element free shipping should not be available$")
	public void user_expect_element_free_shipping_should_not_be_available() throws Throwable {
		try {
			genericPO.verifyPresenceOfFreeShipping();
		} catch (Exception e) {
			System.out.println("Free shipping is not working:" +e.getMessage());
		} 
	}
	@Then("^user expect element Discount not to be present$")
	public void user_expect_element_Discount_not_to_be_present() throws Throwable {
		try {
			genericPO.verifyAbsenceOfDiscountText();
		} catch (Exception e) {
			System.out.println("Validate Absence of Discount text:" +e.getMessage());
		}
	}
	
	@Then ("^User navigates to L2 page plcc$")
	public void User_navigate_to_L2_plcc() throws InterruptedException {
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
	@Then("^User should able to see Strike Through Price with Actual price for plcc$")
	public void user_should_able_to_see_Strike_Through_Price_with_Actual_price_for_plcc() throws Throwable {
		assertTrue(isDisplayed(pdpPageObj.firstClearanceItem));
		plpPrice=pdpPageObj.PriceOFfirstClearenceITem.getText();
		assertTrue(clickOnButton(pdpPageObj.PriceOFfirstClearenceITem));
		pdpPrice=pdpPageObj.txtPriceofPDP.getText();
		assertEquals(plpPrice, pdpPrice);
	}

	@Then("^user expect five percent discount$")
	public void user_expect_five_percent_discount() throws Throwable {
		try {
			plccCCApplicationModalObjects.verifyPresenceOfSubTotalValue();
			String subTotalValue = plccCCApplicationModalObjects.subtotalValue.getText().replace("$", "").trim();
			logger.debug("Subtotal value of the product is " + subTotalValue);
			double convertedToDouble;
			try {
				convertedToDouble = Double.parseDouble(subTotalValue);
			} catch (NumberFormatException e) {
				convertedToDouble = 0;
			}
			float fivePercentDiscount = (float) ((5 * convertedToDouble) / 100);
			BigDecimal bd=new BigDecimal(fivePercentDiscount);
			BigDecimal actualValue = bd.setScale(2, BigDecimal.ROUND_HALF_EVEN );
			logger.debug("Actual Value of Five Percent of Subtotal is " + fivePercentDiscount);
			logger.debug("Round Of Value of Five Percent of Subtotal is " + actualValue);
			
			genericPO.verifyPresenceOfDiscountValue();
			String valueOnWeb = genericPO.discountValue.getText().replace("-$", "").trim();

			BigDecimal expectedValue=new BigDecimal(valueOnWeb);
			if(actualValue==expectedValue)
			{
				logger.debug("Discount on Web and Discount Calulated are matching");
			}
			else
			{
				logger.debug("Discount on Web and Discount Calulated are not matching");
			}
		} catch (Exception e) {
			System.out.println("Exception Message: "+e.getMessage());
		}

	}
	@Then("^user expect ten percent discount$")
	public void user_expect_ten_percent_discount() throws Throwable {
		try {
			plccCCApplicationModalObjects.verifyPresenceOfSubTotalValue();
			String subTotalValue = plccCCApplicationModalObjects.subtotalValue.getText().replace("$", "");
			logger.debug("Subtotal value of the product is " + subTotalValue);
			double convertedToDouble;
			try {
				convertedToDouble = Double.parseDouble(subTotalValue);
			} catch (NumberFormatException e) {
				convertedToDouble = 0;
			}
			float tenPercentDiscount = (float) ((10 * convertedToDouble) / 100);
			BigDecimal bd=new BigDecimal(tenPercentDiscount);
			BigDecimal actualValue = bd.setScale(2, BigDecimal.ROUND_HALF_EVEN );
			logger.debug("Actual Value of Five Percent of Subtotal is " + tenPercentDiscount);
			logger.debug("Round Of Value of Five Percent of Subtotal is " + actualValue);
			genericPO.verifyPresenceOfDiscountValue();
			String valueOnWeb = genericPO.discountValue.getText();

			BigDecimal expectedValue=new BigDecimal(valueOnWeb);
			if(actualValue==expectedValue)
			{
				logger.debug("Discount on Web and Discount Calulated are matching");
			}
			else
			{
				logger.debug("Discount on Web and Discount Calulated are not matching");
			}
		} catch (Exception e) {
			System.out.println("Exception Message:"+e.getMessage());
		}
	}
	@When("^user expect calculated value and displayed discount value to match$")
	public void user_expect_calculated_value_and_displayed_discount_value_to_match() throws Throwable {
		genericPO.verifyPresenceOfDiscountValue();
		String displayedValue = genericPO.discountValue.getText();
		
	}
	

}
