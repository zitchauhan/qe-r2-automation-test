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
	public String actData;
	/*@Then("^User enter the boolean search \"(.*?)\"$")
	public void User_enter_the_SKU_search(String str) throws Throwable {
		globalElementHeader.entertheSearchData("Shoes & Socks");

	}*/
	@Then("^user verifies the title of search results of 6 product card$")
	public void user_verifies_the_title_of_search_of_6_product_card() throws Throwable {
//		waitForElement(globalElementHeader.characterSearhTitle);
//		assertTrue(isDisplayed(globalElementHeader.characterSearhTitle));
		List<WebElement> countproduct = driver.findElements(By.xpath("//*[contains(@class,'search-visual-guided-suggestions')]/*"));
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
	
	
	@Then("^user enter \"(.*?)\" in search box and wait for auto suggest pop up$")
	public void user_enter_in_search_box_and_wait_for_auto_suggest_pop_up1(String arg1) throws Throwable {
		waitForPageLoad(driver);
		Thread.sleep(2000);
		SearchProductPO.searchTextBox.sendKeys( webPropHelper.getTestDataProperty(arg1));
		
	}
	
	
	
	@Then("^user verify the product image name and price$")
	public void user_verify_the_product_image_name_and_price() throws Throwable {
	    assertTrue(isDisplayed(globalElementHeader.imgAutosuggest_HomePage));
	    assertTrue(isDisplayed(globalElementHeader.productNameAutoSuggest_HomePage));
	    assertTrue(isDisplayed(globalElementHeader.productPriceAutoSuggest_HomePage));
	     actData=getText(globalElementHeader.productNameAutoSuggest_HomePage);
	    
	}
	
	

	@Then("^user enter \"(.*?)\" in search box and wait for auto suggest pop up for first data$")
	public void user_enter_in_search_box_and_wait_for_auto_suggest_pop_up_for_first_data(String go) throws Throwable {
		waitForPageLoad(driver);
		Thread.sleep(2000);
		SearchProductPO.searchTextBox.sendKeys( webPropHelper.getTestDataProperty(go));
	}

	@Then("^user enter \"(.*?)\" in search box and wait for auto suggest pop up for second data$")
	public void user_enter_in_search_box_and_wait_for_auto_suggest_pop_up_for_second_data(String shi) throws Throwable {
		Thread.sleep(2000);

		SearchProductPO.searchTextBox.clear();
		SearchProductPO.searchTextBox.sendKeys( webPropHelper.getTestDataProperty(shi));
	}
	
	@Then("^user enter \"(.*?)\" in search box and wait for auto suggest pop up for third data$")
	public void user_enter_in_search_box_and_wait_for_auto_suggest_pop_up_for_third_data(String golf) throws Throwable {
		Thread.sleep(2000);
		SearchProductPO.searchTextBox.clear();
		SearchProductPO.searchTextBox.sendKeys( webPropHelper.getTestDataProperty(golf));
	}

	@Then("^user click on first image from autosuggestion flyout on home page$")
	public void user_click_on_first_image_from_autosuggestion_flyout_on_home_page() throws Throwable {
	  clickOnButton(globalElementHeader.imgAutosuggest_HomePage);
//	  String actData=getText(globalElementHeader.productNameAutoSuggest_HomePage);
	  String expData=getText(globalElementHeader.txtProductNameOnPDP);
	  assertEquals(actData, expData);
	}
	
	@Then("^user click on Go button and verify relevent search item present in product catagory$")
	public void user_click_on_Go_button_and_verify_relevent_search_item_present_in_product_catagory() throws Throwable {
		assertTrue(clickOnButton(SearchProductPO.submitGOBtn));
		waitForPageLoad(driver);
		globalElementHeader.getProductName();
		
	}
	
}
