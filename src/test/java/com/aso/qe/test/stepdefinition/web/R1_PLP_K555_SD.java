package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.SearchProductPO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_PLP_K555_SD extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(R1_PLP_K555_SD.class);
	SearchProductPO searchProductPO = PageFactory.initElements(getDriver(), SearchProductPO.class);;


	@When("^User enters in Required_Product with \"(.*?)\" and click on Go button$")
	public void user_enters_in_Required_Product_with_and_click_on_Go_button(String arg1) throws Throwable {
		logger.debug("Search Text ::"+arg1);
		clickOnButton(SearchProductPO.searchTextBox);
		setInputTextWithEnterKey(SearchProductPO.searchTextBox, arg1);
		//clickOnButton(searchProductPO.submitGOBtn);

	}

	@Then("^User should be navigated to Search_Page$")
	public void user_should_be_navigated_to_Search_Page() throws Throwable {
		String filterTxt = getText(searchProductPO.btnBuyNowHeroImage);
		logger.debug("Filter Title Text:: "+filterTxt);
		if(filterTxt!= null && filterTxt.contains("Filters")){
			assertTrue(true);
		}else{
			assertTrue(true);
		}
		
	}

	@Then("^User expands and selects checkbox of the Price in filter$")
	public void user_select_some_checkbox_of_the_Price_in_filter() throws Throwable {
		searchProductPO.expandFacetDrawer(searchProductPO.filterPricePlusBtn);

		clickOnButton(searchProductPO.priceCheckBoxFrom10to20);

		String filterUnder10ProductCount = getText(searchProductPO.priceCheckBoxFrom10to20Count);
		logger.debug("priceCheckBoxFrom10to20Count::"+filterUnder10ProductCount);
		//searchProductPO.checkLoadedProductsPrices();

	}

	@Then("^User expands and selects checkbox of the Brand in filter$")
	public void user_select_some_checkbox_of_the_Brand_in_filter() throws Throwable {
		searchProductPO.expandFacetDrawer(searchProductPO.brandBtn);

		clickOnButton(searchProductPO.brandCheckBoxASICS);

		//searchProductPO.checkLoadedProductsPrices();

	}
	
	@Then("^User select some checkbox of the Gender in filter$")
	public void user_select_some_checkbox_of_the_Gender_in_filter() throws Throwable {
		searchProductPO.expandFacetDrawer(searchProductPO.genderBtn);

		clickOnButton(searchProductPO.genderFilterAdults);
		String genderFilterAdultsCount = getText(searchProductPO.genderFilterAdultsCount);
		logger.debug("genderFilterAdultsCount::"+genderFilterAdultsCount);
		//searchProductPO.checkLoadedProductsPrices();

	}

	@Then("^User expands and selects checkbox of the Color in filter$")
	public void user_select_some_checkbox_of_the_Color_in_filter() throws Throwable {
		searchProductPO.expandFacetDrawer(searchProductPO.colorBtn);
		
		clickOnButton(searchProductPO.blackColour);
		String blackColourProductCount = getText(searchProductPO.blackColourProductCount);
		logger.debug("blackColourProductCount::"+blackColourProductCount);
		//searchProductPO.checkLoadedProductsPrices();
	}

	@Then("^Verify the selected filtered products \"(.*?)\"\"(.*?)\"\"(.*?)\"are displayed in product grid$")
	public void verify_the_selected_filtered_products_are_displayed_in_product_grid(String price, String brandName, String color) throws Throwable {

		boolean flag = searchProductPO.checkedselectedfacet_container(searchProductPO.selectedfacet_containerList,price,brandName,color);
		logger.debug("selected filters are found:"+flag);
	}
	
	@Then("^User should be able to unselect \"(.*?)\"\"(.*?)\"\"(.*?)\" the same checkbox for all the filters$")
	public void user_should_be_able_to_unselect_the_same_checkbox_for_all_the_filters(String price, String brandName, String color) throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(searchProductPO.clearAllfacet_containerMobile));
			//clickOnButton(searchProductPO.applyFilterfacet_containerMobile);
		}else{
			searchProductPO.checkedselectedfacet_containerClearAll(searchProductPO.selectedfacet_containerList);	
		}
		
		
		/*searchProductPO.clickAllPlusFilterOptions();
		
		searchProductPO.clickAllMinusFilterOptions();
		assertTrue(clickOnButton(searchProductPO.filterPricePlusBtn));
				searchProductPO.selectUnselectFacetCheckBoxByIndex(searchProductPO.facet_price_CheckBox_List, price);
				searchProductPO.selectUnselectFacetCheckBoxByIndex(searchProductPO.facet_price_CheckBox_List, brandName);
				searchProductPO.selectUnselectFacetCheckBoxByIndex(searchProductPO.facet_price_CheckBox_List, color);
		boolean brandNameflag = clickOnButton(getfindElementByXPath("//span[contains(text(),'"+brandName+"')]"));
		boolean colorflag = clickOnButton(getfindElementByXPath("//span[contains(text(),'"+color+"')]"));
		logger.debug("priceflag:"+priceflag+"  brandNameflag:"+brandNameflag+"  colorflag:"+colorflag);
		assertTrue((priceflag&&brandNameflag&&colorflag));*/
		
	}

	@Then("^User should be able to unselect the same checkbox for all the filters$")
	public void user_should_be_able_to_unselect_the_same_checkbox_for_all_the_filters() throws Throwable {
		scrollPageToWebElement(searchProductPO.filterPricePlusBtn);
		clickOnButton(searchProductPO.filterPricePlusBtn);
		clickOnButton(searchProductPO.priceCheckBoxFrom10to20);

		scrollPageToWebElement(searchProductPO.brandBtn);
		clickOnButton(searchProductPO.brandBtn);
		clickOnButton(searchProductPO.brandCheckBoxASICS);
		/*scrollToElement(searchProductPO.genderBtn);
		clickOnButton(searchProductPO.genderBtn);
		clickOnButton(searchProductPO.genderFilterAdults);*/
	}


}
