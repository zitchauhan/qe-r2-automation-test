package com.aso.qe.test.stepdefinition.web;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_FindStore_PO;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_HP_K730_SD extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_HP_K730_SD.class);
	public R1_FindStore_PO findStorePO = PageFactory.initElements(getDriver(), R1_FindStore_PO.class);
	public R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(getDriver(),R1_GlobalElementHeader_Home_PO.class);

	@Then("^User should be able to click on Find Store$")
	public void User_should_be_able_to_see_Find_Store() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			Common_Web_SD.globalElementHeader.findAndClickStoreinMobile();
		} else {
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

	@When("^User select store with Postal Code$")
	public void User_select_store_with_Postal_Code() throws Throwable {
		findStorePO.selectAStore("FL 32822");
	}

	@When("^User select store with City$")
	public void User_select_store_with_City() throws Throwable {
		findStorePO.selectAStore("The Crosslands");
	}

	@When("^User select store with State$")
	public void User_select_store_with_State() throws Throwable {
		findStorePO.selectAStore("Florida");
	}

	@Then("^User should be able to see Selected_Store in the place of Find a Store link$")
	// public void
	// User_should_be_able_to_see_Selected_Store_in_the_place_of_Find_a_Store_link(String
	// selectedStoreTitle) throws Throwable {
	// String selectedStoreName = findStorePO.selectAStore(selectedStoreTitle);
	// Common_Web_SD.globalElementHeader.validateStoreNameExist(selectedStoreName);
	public void User_should_be_able_to_see_Selected_Store_in_the_place_of_Find_a_Store_link()
			throws InterruptedException {
		findStorePO.selectedStore();
	}

	@When("^User enters special character in Store Locator Modal$")
	public void User_enters_special_character_in_Store_Locator_Modal() throws Throwable {
		findStorePO.selectAStoreEmptyOrSpecialchars("@");
		Thread.sleep(Constants.thread_medium); 
	}

	@When("^User enters space in Store Locator Modal$")
	public void User_enters_space_in_Store_Locator_Modal() throws Throwable {
		findStorePO.selectAStoreEmptyOrSpecialchars("      ");// Passing empty space as per the requirement
	}

	@Then("^error message should be displayed$")
	public void error_message_should_be_displayed() throws Throwable {
		findStorePO.validateErrorMsg();
	}
	
	@When("^User select store with Postal Code in Find A Store page\"(.*?)\"$")
	public void User_select_store_with_Postal_Code_in_Find_A_Store_page(String str) {
		findStorePO.verifyFindaStoreFucntionalityFromFooter(str);
	}
	@Then("^close the find the store$")
	public void close_the_find_the_store() throws Throwable {
	     waitForElement(findStorePO.findAstoreXBTN_M);
	     clickOnButton(findStorePO.findAstoreXBTN_M);
	     
	}
}
