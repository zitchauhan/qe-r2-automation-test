package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;

import cucumber.api.java.en.Then;

public class R1SP1_KER_262_Global_Header_SD extends CommonActionHelper{
	//private static final Logger logger = Logger.getLogger(R1SP1_KER_728_Web_SD.class);

	GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	//public ShoppingCartViewPO shoppingCartViewPO =  PageFactory.initElements(driver, ShoppingCartViewPO.class);


	@Then("^User will verify the presence of Sign In$")
	public void user_will_verify_the_presence_of_Sign_In() throws Throwable {
		//scrollPageToWebElement(globalElementHeader.btnSignIn);
		globalElementHeader.verifypresenceofsigninlink();


	}
	@Then("^User will verify the presence of ASO Logo$")
	public void user_will_verify_the_presence_of_ASO_Logo() throws Throwable {
		//scrollPageToWebElement(globalElementHeader.btnSignIn);
		globalElementHeader.clickASO_LOGO();


	}
	@Then("^User will verify the presence of WeeklyAD$")
	public void user_will_verify_the_presence_of_WeeklyAD() throws Throwable {
		globalElementHeader.validateWeeklyAdLinkPresence();

	}
	@Then("^User will verify the presence of Find a Store$")
	public void user_will_verify_the_presence_of_Find_a_Store() throws Throwable {
		globalElementHeader.validatePreseneceOfFindStore();
	}
	@Then("^User will verify the presence of search$")
	public void user_will_verify_the_presence_of_search() throws Throwable {
		globalElementHeader.validatingTxtSearchBox();
	}
	@Then("^User will verify the presence of add to cart icon$")
	public void user_will_verify_the_presence_of_add_cart_icon() throws Throwable {
		globalElementHeader.validatingAddtoCartIcon();
	}

	@Then("^User will verify the presence of shop category$")
	public void user_will_verify_the_presence_of_shop_category() throws Throwable {

		globalElementHeader.validatingShopCategory();
	}
	@Then("^User will verify the presence of trending category$")
	public void user_will_verify_the_presence_of_trending_category() throws Throwable {

		globalElementHeader.validatingTrendingCategory();
	}
	@Then("^User will verify the presence of deals category$")
	public void user_will_verify_the_presence_of_deals_category() throws Throwable {

		globalElementHeader.validatingDealsCategory();
	}
}
