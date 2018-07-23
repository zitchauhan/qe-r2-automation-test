package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.HomePagePOM;

import cucumber.api.java.en.Then;

public class R1SP1_KER_3274_Web_SD extends CommonActionHelper{
	//private static final Logger logger = Logger.getLogger(R1SP1_KER_3274_Web_SD.class);

	GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	//public ShoppingCartViewPO shoppingCartViewPO =  PageFactory.initElements(driver, ShoppingCartViewPO.class);
	public HomePagePOM homePagePOM =  PageFactory.initElements(driver, HomePagePOM.class);
	
	
	@Then("^User enter the search \"(.*?)\"$")
	public void User_enter_the_search(String str) throws Throwable {
		globalElementHeader.entertheSearchData("Goolf");

	}
	
	@Then("^User verifies the title for closest matching term$")
	public void User_verifies_the_title_for_closest_matching_termUser_verifies_the_title_for_closest_matching_term() throws Throwable {
		//globalElementHeader.verifyTheNullPage();
		assertTrue(isDisplayed(homePagePOM.result1));
		assertTrue(isDisplayed(homePagePOM.result2));
		assertTrue(isDisplayed(homePagePOM.result3));
		assertTrue(isDisplayed(homePagePOM.result4));
		assertTrue(isDisplayed(homePagePOM.result5));

	}
	
	@Then("^User verifies the label for closest matching term$")
	public void User_verifies_the_label_for_closest_matching_term() throws Throwable {
		globalElementHeader.verifyTheLabelForSearch();

	}
	
	
	
	@Then("^User verifies the respective search results$")
	public void User_verifies_the_respective_search_results() throws Throwable {
		assertTrue(isDisplayed(homePagePOM.result1));
		assertTrue(isDisplayed(homePagePOM.result2));
		assertTrue(isDisplayed(homePagePOM.result3));
		assertTrue(isDisplayed(homePagePOM.result4));
		assertTrue(isDisplayed(homePagePOM.result5));
		

	}
	
	@Then("^User verifies the respective search results clickable$")
	public void User_verifies_the_respective_search_results_clickable() throws Throwable {
		assertTrue(isClickable(homePagePOM.result1));
		assertTrue(isClickable(homePagePOM.result2));
		assertTrue(isClickable(homePagePOM.result3));
		assertTrue(isClickable(homePagePOM.result4));
		assertTrue(isClickable(homePagePOM.result5));
		assertTrue(clickOnButton(homePagePOM.result5));
		//assertTrue(isDisplayed(globalElementHeader.characterSearchLimitTitle));

	}
	
				

}
