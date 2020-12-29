package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CART_K4231_SD extends CommonActionHelper {
	R2_Cart_PO cartR2PageObj = PageFactory.initElements(driver, R2_Cart_PO.class);
	R2_CheckOut_PO checkoutPO = PageFactory.initElements(driver, R2_CheckOut_PO.class); 
	
	
	@Then("^user should be able to see In-Store Pick up enabled$")
	public void user_should_be_able_to_see_In_Store_Pick_up_enabled() throws Throwable {
		assertTrue(isEnabled(cartR2PageObj.rbInStorePickUp));
	}

	@Given("^user sets up a store for \"(.*?)\"$")
	public void user_sets_up_a_store_for(String arg1) throws Throwable {
		cartR2PageObj.selectStore(webPropHelper.getTestDataProperty(arg1));
	}

	@And("^user selects store with \"(.*?)\" and \"(.*?)\"$")
	public void user_selects_store_with_and(String zipCode, String storeName) throws Throwable {
		cartR2PageObj.selectStoreWithZipAndStoreName(webPropHelper.getTestDataProperty(zipCode),
				webPropHelper.getTestDataProperty(storeName));
	}
	

	@And("^user changes store pickup with zipcode \"(.*?)\" and storename \"(.*?)\"$")
	public void user_selects_store(String zipCode, String storeName) throws Throwable {
		checkoutPO.editStorePickup();
		cartR2PageObj.selectStore(webPropHelper.getTestDataProperty(zipCode),
				webPropHelper.getTestDataProperty(storeName));
	}
	
	@And("^Verify Order error message$")
	public void verify_error_message(String zipCode, String storeName) throws Throwable {
		checkoutPO.verifyOrderErrorMessage();
	}
	
	
	@And("^user selects store with \"(.*?)\" and \"(.*?)\" yext$")
	public void user_selects_store_with_and_yext(String zipCode, String storeNameText) throws Throwable {

		String storeNameSelect=null;
		String zip = null;
		if(!SEO_YEXT_SD.storeName.equals("")) {
			storeNameSelect=SEO_YEXT_SD.storeName;
		}
		else if(!SEO_YEXT_SD.yextStoreExistingAddress[6].equals("")){
			storeNameSelect=SEO_YEXT_SD.yextStoreExistingAddress[6];
		}
		else
			storeNameSelect=storeNameText;
		
		if(!SEO_YEXT_SD.yextStoreExistingAddress[4].equals("")) {
			zip=SEO_YEXT_SD.yextStoreExistingAddress[4];
		}
		else if(!webPropHelper.getTestDataProperty("YextNewLocAddressPin").equals(""))
			zip=webPropHelper.getTestDataProperty("YextNewLocAddressPin");
		else
			zip=zipCode;
		cartR2PageObj.selectStoreWithZipCodeAndStoreName(zip,storeNameSelect);
	}

	@When("^user enter qty more then the limit qty by \"(.*?)\"$")
	public void user_enter_qty_more_then_the_limit(int qty)  throws Throwable {
		
		cartR2PageObj.increaseQuantityOnCartPage(qty);
		
     }
	
	@Then("^user should get message item is limited to qty per order$")
	public void user_should_get_message_item_is_limited_to_qty_per_order()  throws Throwable {
		
		cartR2PageObj.verifyLimitedQtyMsgPopup();
		
    }

}
