package com.aso.qe.test.stepdefinition.web;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.SIT_FindaStorePageObject;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SD_SIT_FindaStore extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(SD_SIT_FindaStore.class);
	GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	public SIT_FindaStorePageObject findStorePO= PageFactory.initElements(driver, SIT_FindaStorePageObject.class);	
	/*@Then("^User should click on FIND A STORE$")
	public void user_should_click_on_FIND_A_STORE() throws Throwable {
		globalElementHeader.validatePreseneceOfFindStore();
		assertTrue(clickOnButton(globalElementHeader.btnFindAStoreBurgerMenu));

	}*/
	
	@Then("^User should be able to click on Find Store$")
	public void User_should_be_able_to_see_Find_Store() throws Throwable {
		globalElementHeader.findAndClickStoreinGH();

	}

	@Then("^Find Store Modal should pop-up$")
	public void Find_Store_Modal_should_pop_up() throws Throwable {
		boolean isDisplayed = findStorePO.validatingFindStoreDisplayed();
		if(isDisplayed)
			logger.debug("Find A store overlay is displayed");
		else
			logger.debug("Find A store overlay is NOT displayed");
		
		Assert.assertTrue(isDisplayed);
	}


	
	@When("^User select store with Postal Code$")
	public void User_select_store_with_Postal_Code() throws Throwable{
		findStorePO.selectAStore("FL 34741");
	}
	
	@When("^User select store with City$")
	public void User_select_store_with_City() throws Throwable{
		findStorePO.selectAStore("The Crosslands");
	}
	
	@When("^User select store with State$")
	public void User_select_store_with_State() throws Throwable{
		findStorePO.selectAStore("Florida");
	}
	
	
	@Then("^User should be able to see Selected_Store in the place of Find a Store link$")
	public void User_should_be_able_to_see_Selected_Store_in_the_place_of_Find_a_Store_link(String selectedStoreTitle) throws Throwable {
		
		String selectedStoreName = findStorePO.selectAStore(selectedStoreTitle);
		globalElementHeader.validateStoreNameExist(selectedStoreName);
		
	}
	
	
		

}
