package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R1_SLR_K3237_SD extends CommonActionHelper{
	//private static final Logger logger = Logger.getLogger(R1SP1_KER_728_Web_SD.class);

	R1_GlobalElementHeader_Home_PO globalElementHeader= PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	//public ShoppingCartViewPO shoppingCartViewPO =  PageFactory.initElements(driver, ShoppingCartViewPO.class);
	public R1_SearchProduct_PO searchProductPO =  PageFactory.initElements(driver, R1_SearchProduct_PO.class);

	@Then("^User should be able to view Search Box on Homepage$")
	public void User_should_be_able_to_see_Search_Box_on_Homepage() throws Throwable {
		globalElementHeader.validatingTxtSearchBox();

	}
	@Then("^User should be able to view Search Lens$")
	public void User_should_be_able_to_see_Search_Lens() throws Throwable {
		globalElementHeader.validitingClickingOnSearchLens();

	}
	
	@Then("^User enter the color for search$")
	public void User_enter_the_color_for_search() throws Throwable {
		globalElementHeader.entertheColor();

	}
	@And("^User click on the search icon$")
	public void User_click_on_the_search_icon() throws Throwable {
		globalElementHeader.clickOnButton();

	}
	
	@And("^User verifies the predictive suggestions for matching keyword$")
	public void User_verifies_the_predictive_suggestions_for_matching_keyword() throws Throwable {
		try {
			assertTrue(globalElementHeader.verifySuggestionPage("Shoes"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	@And("^User should not see duplicates within predictive suggestions$")
	public void User_should_not_see_duplicates_within_predictive_suggestions() throws Throwable {
		try {
			globalElementHeader.verifyDuplicateSuggestion("Clothing");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@And("^User verifies the predictive suggestions for matching category$")
	public void User_verifies_the_predictive_suggestions_for_matching_category() throws Throwable {
		try {
			globalElementHeader.verifySuggestionPage("shirt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@And("^User verifies the predictive suggestions for matching brand$")
	public void User_verifies_the_predictive_suggestions_for_matching_brand() throws Throwable {
		try {
			globalElementHeader.verifySuggestionPage("Adidas");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Then("^User click on the matching keyword$")
	public void User_click_on_the_matching_keyword() throws Throwable {
		try {
			globalElementHeader.clickOnSuggestion("shirt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Then("^User click on clear all button$")
	public void User_click_on_clear_all_button() throws Throwable{
		try {
			globalElementHeader.clickClearAllButton();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
