package com.aso.qe.test.stepdefinition.web;

//import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;

import cucumber.api.java.en.Then;

public class R2_CART_K2871_SD extends CommonActionHelper {
	R2_Cart_PO cartR2PageObj = PageFactory.initElements(driver, R2_Cart_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader= PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);

	@Then("^user is able to see nearest store location \"(.*?)\" and details on home page$")
	public void user_is_able_to_see_nearest_store_location_and_details_on_home_page(String arg1) throws Throwable {
		String storeLocator = getText(cartR2PageObj.txtStoreLocator);
		assertTrue(storeLocator.equalsIgnoreCase(webPropHelper.getTestDataProperty(arg1)));
	}
	
	@Then("^user is able to see nearest store location \"(.*?)\"$")
	public void user_is_able_to_see_nearest_store_location_in_burger_menu(String arg1) throws Throwable {
		
		if ("mobile".equalsIgnoreCase(testtype)) {
			
			//assertTrue(clickOnButton(cartR2PageObj.btnFindStoreClose));
			assertTrue(clickOnButton(globalElementHeader.btnBurgerMenu));
			String storeLocator = getText(cartR2PageObj.lnkFindAStore_M);
			assertTrue(storeLocator.equalsIgnoreCase(webPropHelper.getTestDataProperty(arg1)));

		} else {
			
			String storeLocator = getText(cartR2PageObj.lnkFindAStore);
			assertTrue(storeLocator.equalsIgnoreCase(webPropHelper.getTestDataProperty(arg1)));

		}
	}

	
}
