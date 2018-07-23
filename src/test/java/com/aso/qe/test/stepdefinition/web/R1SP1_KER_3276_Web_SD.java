package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.SearchProductPO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R1SP1_KER_3276_Web_SD extends CommonActionHelper {

	GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	public SearchProductPO searchProductPO = PageFactory.initElements(driver, SearchProductPO.class);

	/*@Then("^User enter the boolean search \"(.*?)\"$")
	public void User_enter_the_SKU_search(String str) throws Throwable {
		globalElementHeader.entertheSearchData("Shoes & Socks");

	}*/
	@Then("^user verifies the title of search results of 6 product card$")
	public void user_verifies_the_title_of_search_of_6_product_card() throws Throwable {
		waitForElement(globalElementHeader.characterSearhTitle);
		assertTrue(isDisplayed(globalElementHeader.characterSearhTitle));
		List<WebElement> countproduct = driver.findElements(By.xpath("(//div[@class='row mt-1 justify-content-center']/div)"));
		String sizeofCount = ""+countproduct.size();
		assertEquals(sizeofCount,"6");
		
	}
	@And("^user verifies the Applicable category and brand and on LHS displays 6 product card$")
	public void User_verifies_the_Applicable_category_and_brand_and_on_LHS_displays_6_product_card() throws Throwable {
		globalElementHeader.verifySuggestionPage_Productcard("sh");

	}
	@And("^User verifies the predictive suggestions for applicable category$")
	public void User_verifies_the_predictive_suggestions_for_applicable_category() throws Throwable {
		globalElementHeader.verifySuggestionPage("sh");

	}
	/*@Then("^User enter the invalid SKU search \"(.*?)\"$")
	public void User_enter_the_invalid_SKU_search(String str) throws Throwable {
		globalElementHeader.entertheSearchData("1111111111");

	}

	@Then("^user verifies the entered SKU id$")
	public void user_verifies_the_entered_SKU_id() throws Throwable {
		waitForElement(globalElementHeader.skuID);
		assertTrue(isDisplayed(globalElementHeader.skuID));
	}

	@Then("^user verifies the error 404 page$")
	public void user_verifies_the_error_404_page() throws Throwable {
		waitForElement(globalElementHeader.error404);
		assertTrue(isDisplayed(globalElementHeader.error404));
	}*/
}
