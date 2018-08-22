package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.PDP_PO;
import com.aso.qe.test.pageobject.SearchProductPO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class R1SP1_KER_1955_Web_SD extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(R1SP1_KER_1955_Web_SD.class);
	SearchProductPO searchProductPO = PageFactory.initElements(getDriver(), SearchProductPO.class);
	PDP_PO pdp_po = PageFactory.initElements(getDriver(), PDP_PO.class);
	String productName ="";

	@And("^User selects Required product in Product Listing Page$")
	public void user_selects_Required_product_in_Product_Listing_Page() throws Throwable {
		logger.debug("selecting requried product from L3 page::");
		clickOnButton(searchProductPO.productList.get(0));
	}

	@Then("^User should be select the color$")
	public void user_should_be_select_the_color() throws Throwable {
		assertTrue(clickOnButton(pdp_po.btnDifferentColor));
	}

	@Then("^User should be select the size$")
	public void user_should_be_select_the_size() throws Throwable {
		assertTrue(clickOnButton(pdp_po.btnMediumSize));
	}

	@Then("^User should be select the Quantity$")
	public void user_should_be_select_the_Quantity() throws Throwable {
		pdp_po.addToCartAvailability();
		productName = getText(pdp_po.txtProductTitle);
		assertTrue(clickOnButton(pdp_po.btnQuantityInc));
	}

	@Then("^User clicks on AddToCart Button$")
	public void user_clicks_on_AddToCart_Button() throws Throwable {
		assertTrue(clickOnButton(pdp_po.btnAddToCart));
	}

	@Then("^User should be able to see ATC notification$")
	public void user_should_be_able_to_see_ATC_notification() throws Throwable {

		assertTrue(clickOnButton(pdp_po.secAddToCartPopup));
	}

	@When("^User clicks on View_Cart Button$")
	public void user_clicks_on_View_Cart_Button() throws Throwable {
		assertTrue(clickOnButton(pdp_po.btnViewCart));
	}

	@Then("^User should be navigated to Cart Page$")
	public void user_should_be_navigated_to_Cart_Page() throws Throwable {
		String actualURL = getTitle();
		assertTrue(actualURL.contains("Shopping Cart"));
	}

	@Then("^User should be able to see added product in cart$")
	public void user_should_be_able_to_see_added_product_in_cart() throws Throwable {
		
		WebElement actualTitleInAddToCart = driver.findElement(By.xpath("(//*[text()=\""+productName+"\"])[2]"));
		assertTrue(isDisplayed(actualTitleInAddToCart));
		
	}

}
