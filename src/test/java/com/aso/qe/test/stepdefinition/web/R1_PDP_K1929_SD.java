package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_FindStore_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R1_SIT_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R1_PDP_K1929_SD extends CommonActionHelper {
	R1_SIT_PO sitObj = PageFactory.initElements(getDriver(), R1_SIT_PO.class);
	R1_PDP_PO pdpObj = PageFactory.initElements(getDriver(), R1_PDP_PO.class);
	R2_FindStore_PO findStoreObj = PageFactory.initElements(getDriver(), R2_FindStore_PO.class);

	
	@And("^user verify the inventory message \"(.*?)\"$")
	public void user_verify_the_inventory_message(String message) {
		assertTrue(isDisplayed(sitObj.inventoryMessage));
		String pdpMessage = sitObj.inventoryMessage.getText();
		System.err.println(message + "  but found "+pdpMessage);
		if(message.equalsIgnoreCase(pdpMessage)) {
			assertTrue(true);
		}else {
			assertTrue(false);
		}
	}
	@And("^user verify the inventory message for Pickup not available")
	public void user_verify_the_inventory_message_for_Pickup_not_available() {
		assertTrue(isDisplayed(sitObj.inventoryMessage));
		String pdpMessage = sitObj.inventoryMessage.getText();
		String message=webPropHelper.getTestDataProperty("Pickup not available");
		System.err.println(message + "  but found "+pdpMessage);
		if(message.equalsIgnoreCase(pdpMessage)) {
			assertTrue(true);
		}else {
			assertTrue(false);
		}
	}
	/*@And("^user verify the inventory message")
	public void user_verify_the_inventory_message() {
		assertTrue(isDisplayed(sitObj.inventoryMessage));
		String pdpMessage = sitObj.inventoryMessage.getText();
		String message=webPropHelper.getTestDataProperty("OutOfStock1");
		System.err.println(message + "  but found "+pdpMessage);
		if(message.contains(pdpMessage)) {
			assertTrue(true);
		}else {
			assertTrue(false);
		}
	}*/
	
	@And("^below inventory message user see find a store option$")
	public void below_inventory_message_user_see_find_a_store_option() {
		assertTrue(isDisplayed(findStoreObj.lnkFindaStorePDP));
	}
	
	@Then("^user click on find a store option available on pdp below inventory message$")
	public void user_click_on_find_a_store_option_available_on_pdp_below_inventory_message() {
		assertTrue(clickOnButton(findStoreObj.lnkFindaStorePDP));
	}
	
	@And("^user verify the timing is displayed for store$")
	public void user_verify_the_timing_is_displayed_for_store() {
		assertTrue(isDisplayed(pdpObj.storeTimingPDP));
	}
	
	@And("^user verify the \"(.*?)\" option is displayed$")
	public void user_verify_the_option_is_displayed(String arg1) {
		String moreOptions = findStoreObj.lnkFindaStorePDP.getText();
		System.err.println(arg1 + "  but found "+moreOptions);
		assertTrue(arg1.equalsIgnoreCase(moreOptions));
	}
	
	
}
