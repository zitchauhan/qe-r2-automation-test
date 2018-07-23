package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;

import cucumber.api.java.en.Then;

public class SD_SIT_HeaderPage extends CommonActionHelper{
	
	GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	//public ShoppingCartViewPO shoppingCartViewPO =  PageFactory.initElements(driver, ShoppingCartViewPO.class);


	@Then("^User will verify the presence of Sign In in Header$")
	public void user_will_verify_the_presence_of_Sign_In() throws Throwable {
		//scrollPageToWebElement(globalElementHeader.btnSignIn);
		globalElementHeader.verifypresenceofsigninlink();


	}
	@Then("^User will verify the presence of ASO Logo in Header$")
	public void user_will_verify_the_presence_of_ASO_Logo() throws Throwable {
		//scrollPageToWebElement(globalElementHeader.btnSignIn);
		globalElementHeader.clickASO_LOGO();


	}
	@Then("^User will verify the presence of WeeklyAD in Header$")
	public void user_will_verify_the_presence_of_WeeklyAD() throws Throwable {
		globalElementHeader.validateWeeklyAdLinkPresence();

	}
	@Then("^User will verify the presence of Find a Store in Header$")
	public void user_will_verify_the_presence_of_Find_a_Store() throws Throwable {
		globalElementHeader.validatePreseneceOfFindStore();
	}
	@Then("^User will verify the presence of search in Header$")
	public void user_will_verify_the_presence_of_search() throws Throwable {
		globalElementHeader.validatingTxtSearchBox();
	}
	@Then("^User will verify the presence of add to cart icon in Header$")
	public void user_will_verify_the_presence_of_add_cart_icon() throws Throwable {
		globalElementHeader.validatingAddtoCartIcon();
	}

	@Then("^User will verify the presence of shop category in Header$")
	public void user_will_verify_the_presence_of_shop_category() throws Throwable {

		globalElementHeader.validatingShopCategory();
	}
	@Then("^User will verify the presence of trending category in Header$")
	public void user_will_verify_the_presence_of_trending_category() throws Throwable {

		globalElementHeader.validatingTrendingCategory();
	}
	@Then("^User will verify the presence of deals category in Header$")
	public void user_will_verify_the_presence_of_deals_category() throws Throwable {

		globalElementHeader.validatingDealsCategory();
	}

}
