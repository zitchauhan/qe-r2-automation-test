package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_FindStore_PO;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_HP_K730_SD extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_HP_K730_SD.class);
	public R1_FindStore_PO findStorePO = PageFactory.initElements(getDriver(), R1_FindStore_PO.class);
	public R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(getDriver(),R1_GlobalElementHeader_Home_PO.class);
	R2_R1_Fun_PO r2r1FunPo = PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R2_Cart_PO r2cartPO = PageFactory.initElements(driver, R2_Cart_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	String store = "";
	
	@Then("^User should be able to click on Find Store$")
	public void User_should_be_able_to_see_Find_Store() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			Common_Web_SD.globalElementHeader.findAndClickStoreinMobile();
		} 
		else {
			Common_Web_SD.globalElementHeader.findAndClickStoreinGH();
			}
	}
	
	@Then("^User should be able to click on Find Store in footer$")
	public void User_should_be_able_to_see_Find_Store_in_footer() throws Throwable {

			Common_Web_SD.globalElementHeader.findAndClickStoreinFooter();
	}

	@Then("^Find Store Modal should pop-up$")
	public void Find_Store_Modal_should_pop_up() throws Throwable {
		boolean isDisplayed = findStorePO.validatingFindStoreDisplayed();
		if (isDisplayed)
			logger.debug("Find A store overlay is displayed");
		else
			logger.debug("Find A store overlay is NOT displayed");
		Assert.assertTrue(isDisplayed);	
	}

	@When("^User select store with \"(.*?)\"$")
	public void User_select_store_with(String arg1) throws Throwable {
		
		if(isDisplayed(findStorePO.californiaaddress)) {
			
			setInputText(r2CartPo.inputFindaStoreHomePage, webPropHelper.getTestDataProperty(arg1));
			assertTrue(clickOnButton(r2CartPo.btnZipcodesearch));
			
            assertTrue(clickOnButton(findStorePO.expandStore));
            assertTrue(clickOnButton(r2CartPo.btnstore));
            assertTrue(clickOnButton(findStorePO.ovly_btnCloseCross));
         					
		}
		else {
		System.err.println(webPropHelper.getTestDataProperty(arg1));
		store = findStorePO.testWorkaround(webPropHelper.getTestDataProperty(arg1));
		}
	}
	
	@And("^user verify the selected store$")
		public void user_verify_the_selected_store() {
		store.equalsIgnoreCase(findStorePO.selectedStoreNameinPDP.getText());
	}
	


	@Then("^User should be able to see Selected_Store in the place of Find a Store link$")
	public void User_should_be_able_to_see_Selected_Store_in_the_place_of_Find_a_Store_link()
			throws InterruptedException {
		findStorePO.selectedStore();
	}

	@When("^User enters \"(.*?)\" in Store Locator Modal$")
	public void User_enters_in_Store_Locator_Modal(String arg1) throws Throwable {
		findStorePO.selectAStoreEmptyOrSpecialchars(webPropHelper.getTestDataProperty(arg1));
	}

	@When("^User enters space in Store Locator Modal$")
	public void User_enters_space_in_Store_Locator_Modal() throws Throwable {
		findStorePO.selectAStoreEmptyOrSpecialchars("      ");// Passing empty space as per the requirement
	}

	@Then("^error message should be displayed$")
	public void error_message_should_be_displayed() throws Throwable {
		findStorePO.validateErrorMsg();
	}
	
	@When("^User select store with Postal Code in Find A Store page \"(.*?)\"$")
	public void User_select_store_with_Postal_Code_in_Find_A_Store_page(String arg1) {
		findStorePO.verifyFindaStoreFucntionalityFromFooter(webPropHelper.getTestDataProperty(arg1));
	}
	@Then("^close the find the store$")
	public void close_the_find_the_store() throws Throwable {
	     waitForElement(findStorePO.findAstoreXBTN_M);
	     clickOnButton(findStorePO.findAstoreXBTN_M);
	     
	}
	
	@And("^user verify the selected store in cart page$")
	public void user_verify_the_selected_store_in_cart_page() {
		assertTrue(r2cartPO.storeNameOnCartPageInStorePickUp.getText().equalsIgnoreCase(store));
	}
}
