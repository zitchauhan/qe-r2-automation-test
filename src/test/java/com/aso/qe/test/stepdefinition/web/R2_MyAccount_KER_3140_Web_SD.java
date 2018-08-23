package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;

import cucumber.api.java.en.Then;

public class R2_MyAccount_KER_3140_Web_SD extends CommonActionHelper {
	
	R2_Cart_PO cartR2PageObj = PageFactory.initElements(driver, R2_Cart_PO.class);
	@Then("^Authenticated user should see the Favorite store \"(.*?)\" details in home page$")
	public void authenticated_user_should_see_the_Favorite_store_details_in_home_page(String arg1) throws Throwable {
		String storeLocator = getText(cartR2PageObj.txtStoreLocator);
		assertTrue(storeLocator.equalsIgnoreCase(webPropHelper.getTestDataProperty(arg1)));
	}

}
