package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.SearchProductPO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SD_SIT_SearchNullResult extends CommonActionHelper {
	
	GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	//public ShoppingCartViewPO shoppingCartViewPO =  PageFactory.initElements(driver, ShoppingCartViewPO.class);
	public SearchProductPO searchProductPO =  PageFactory.initElements(driver, SearchProductPO.class);

	@Then("^User should be able to see Search Box on Homepage$")
	public void User_should_be_able_to_see_Search_Box_on_Homepage() throws Throwable {
		globalElementHeader.validatingTxtSearchBox();

	}
	@Then("^User should be able to see Search Lens$")
	public void User_should_be_able_to_see_Search_Lens() throws Throwable {
		globalElementHeader.validitingClickingOnSearchLens();

	}
	
	
	@Then("^User enter the null data$")
	public void User_enter_the_null_data() throws Throwable {
		globalElementHeader.entertheNullData();

	}
	
	@And("^User click on search icon$")
	public void User_click_on_search_icon() throws Throwable {
		globalElementHeader.clickOnButton();
	}

	@Then("^User is navigated to null page$")
	public void User_is_navigated_to_null_page() throws Throwable {
		globalElementHeader.verifyTheNullPage();

	}
	
	
	@Then("^User verify the product name$")
	public void User_verify_the_product_name() throws Throwable{
		searchProductPO.verifyProductName();
	}
	
}