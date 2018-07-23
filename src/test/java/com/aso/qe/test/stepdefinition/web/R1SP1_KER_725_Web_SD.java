package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.ShoppingCartViewPO;

import cucumber.api.java.en.Then;

public class R1SP1_KER_725_Web_SD extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(R1SP1_KER_725_Web_SD.class);

	public ShoppingCartViewPO shoppingCartViewPO =  PageFactory.initElements(getDriver(), ShoppingCartViewPO.class);;

	@Then("^User should be able to click on MiniCart icon and navigate to My cart page and Validate Shopping Cart$")
	public void user_should_be_able_to_click_on_MiniCart_icon_and_navigate_to_My_cart_page_and_Validate_Shopping_Cart() throws Throwable {
		logger.debug("user_should_be_able_to_click_on_MiniCart_icon_and_navigate_to_My_cart_page_and_Validate_Shopping_Cart");

		shoppingCartViewPO.clickOnCartIcon();
		shoppingCartViewPO.compareCartEmptyTxt("Your Shopping Cart is Empty");
	}

	@Then("^User should be dispalyed with message Your Shopping Cart is Empty$")
	public void user_should_be_dispalyed_with_message_Your_Shopping_Cart_is_Empty() throws Throwable {
		shoppingCartViewPO.clickOnCartIcon();
		shoppingCartViewPO.compareCartEmptyTxt("Your Shopping Cart is Empty");
		shoppingCartViewPO.compareContinueShoppingLinkTxt("Continue Shopping");
	}
	
	@Then("^User should be able to see number of products added in the minicart$")
	public void user_should_be_able_to_see_number_of_products_added_in_the_minicart() throws Throwable {
	   
		assertTrue(isDisplayed(shoppingCartViewPO.txtMinicartCount));
	        
	}

	@Then("^User clicks on the minicart icon and navigated to minicart$")
	public void user_clicks_on_the_minicart_icon_and_navigated_to_minicart() throws Throwable {
		shoppingCartViewPO.clickOnCartIcon();
	        
	}

	@Then("^User should able to see the section where all the product are displayed$")
	public void user_should_able_to_see_the_section_where_all_the_product_are_displayed() throws Throwable {
	   
		assertTrue(isDisplayed(shoppingCartViewPO.secProductInCart));
	}
}
