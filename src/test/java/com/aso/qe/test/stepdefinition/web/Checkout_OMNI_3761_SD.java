package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;

import cucumber.api.java.en.And;

public class Checkout_OMNI_3761_SD extends CommonActionHelper {

	R1_SearchProduct_PO r1_SearchPO = PageFactory.initElements(getDriver(), R1_SearchProduct_PO.class);
	R2_Cart_PO cartR2PageObj = PageFactory.initElements(driver, R2_Cart_PO.class);
	
	@And("^user will remove the oos item$")
	public void user_will_remove_the_oos_item() throws Throwable {
		waitForPageLoad(driver);
		Thread.sleep(Constants.thread_high);
		
		boolean oosProductsAvailable = false;
		
		if (r1_SearchPO.verifyTextDisplayedOnPage("WE'RE SORRY")) {
			assertTrue(clickOnButton(cartR2PageObj.editInCart_btn));
			oosProductsAvailable = true;
		}
		
		if (oosProductsAvailable) {
			for (WebElement removeOOSBtn : cartR2PageObj.removeCartforOOSProducts_lst_btn) {
				assertTrue(clickOnButton(removeOOSBtn));
				Thread.sleep(Constants.thread_high);
			}
		}
		
	}
	
}
