package com.aso.qe.test.stepdefinition.web;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_FindStore_PO;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;

import cucumber.api.java.en.Then;

public class R1_HP_K721_SD<globalElementHeader> extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(R1_HP_K721_SD.class);
	public R1_FindStore_PO findStorePO= PageFactory.initElements(driver, R1_FindStore_PO.class);
	public R1_GlobalElementHeader_Home_PO globalElementHeader= PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);



	@Then("^User should not be able to see the searchBox$")
	public void User_should_not_be_able_to_see_Searchbox(){
		logger.debug("");
		globalElementHeader.validatingPresenceOfTextSearchBox();

	}

	@Then("^User should be able to see FindStore Navigation Categories and MyAccount links$")
	public void User_should_be_able_to_see_FindStore_Navigation_Categories_and_MyAccount_links() throws Exception {
		globalElementHeader.validatePreseneceOfFindStore();
		globalElementHeader.validatePresenceOfNavigationCategories();
		globalElementHeader.validatePresenceOfMyAccountLink();
	}


	@Then("^Verify user is able to see the search box after clicking on the magnifying glass$")
	public void Verify_user_is_able_to_see_the_search_box_after_clicking_on_the_magnifying_glass() throws Exception{
		globalElementHeader.validatingPresenceOfTextSearchBox();
	}

	@Then ("^User should be able to see open Search text box$")
	public void User_should_be_able_to_see_open_Search_text_box() {
		globalElementHeader.validatingPresenceOfTextSearchBoxHomePage();

	}



}
