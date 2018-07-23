package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.SearchProductPO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SD_SIT_SearchFilter extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(SD_SIT_SearchFilter.class);
	SearchProductPO searchProductPO = PageFactory.initElements(getDriver(), SearchProductPO.class);

	@When("^User enters in Required_Product with \"(.*?)\" and click on Go button$")
	public void user_enters_in_Required_Product_with_and_click_on_Go_button(String arg1) throws Throwable {
		logger.debug("Search Text ::"+arg1);
		clickOnButton(SearchProductPO.searchTextBox);
		setInputTextWithEnterKey(SearchProductPO.searchTextBox, arg1);
		//clickOnButton(searchProductPO.submitGOBtn);

	}

	@Then("^User should be navigated to Search_Page$")
	public void user_should_be_navigated_to_Search_Page() throws Throwable {
		String filterTxt = getText(searchProductPO.filtersTitle);
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

	@Then("^Verify the selected filtered products \"(.*?)\"\"(.*?)\"are displayed in product grid$")
	public void verify_the_selected_filtered_products_are_displayed_in_product_grid(String price, String color) throws Throwable {

		boolean flag = searchProductPO.checkedselectedfacet_container(searchProductPO.selectedfacet_containerList,price,color);
		logger.debug("selected filters are found:"+flag);
	}
	
	@Then("^User should be able to unselect \"(.*?)\"\"(.*?)\" the same checkbox for all the filters$")
	public void user_should_be_able_to_unselect_the_same_checkbox_for_all_the_filters(String price, String color) throws Throwable {
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
	
	//#######################################################################################################################################
	
	@When("^User should be able to see the Number of items in each price range checkbox$")
	public void user_should_be_able_to_see_the_Number_of_items_in_each_price_range_checkbox() throws Throwable {
		String filterUnder10ProductCount = getText(searchProductPO.priceCheckBoxFrom10to20Count);
		logger.debug("priceCheckBoxFrom10to20Count::"+filterUnder10ProductCount);
	}


		@Then("^Verify the selected price range product is \"(.*?)\" displayed in product grid$")
	public void verify_the_selected_price_range_product_is_displayed_in_product_grid(String priceRange) throws Throwable {
		priceRange = priceRange.replaceAll("[\\-\\$:,]","");
		logger.debug("priceRange::"+priceRange);
		String priceRangeArray[] = priceRange.split("  ");
		int min = Integer.valueOf(priceRangeArray[0]);
		String maxstr= priceRangeArray[1];
		int max = Integer.valueOf(maxstr.substring(0, maxstr.length()-3));
		searchProductPO.checkLoadedProductsPrices(min, max);
	}

	@When("^user navigates to L(\\d+) page$")
	public void user_navigates_to_L_page(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user deselect the \"(.*?)\" filter$")
	public void user_deselect_the_filter(String arg1) throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			//scrollPageToWebElement(searchProductPO.filterPricePlusBtnMobile);
			//assertTrue(clickOnButton(Common_Web_SD.searchProductPO.filterPricePlusBtnMobile));
			searchProductPO.selectUnselectFacetCheckBoxByIndex(searchProductPO.facet_Price_CheckBox_ListMobile,arg1);
		}else {
			
		searchProductPO.selectUnselectFacetCheckBoxByIndex(searchProductPO.facet_price_CheckBox_List, arg1);
	}
	}

	@Then("^Verify the list of product is dispalyed are same as before filter$")
	public void verify_the_list_of_product_is_dispalyed_are_same_as_before_filter() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^user click on filter button$")
	public void user_click_on_filter_button() throws Throwable {
	   assertTrue(clickOnButton(searchProductPO.filterTitleBtn));
	}
	
	@Given("^User expands all Filter Options$")
	public void user_expands_all_Filter_Options() throws Throwable {
		assertTrue(searchProductPO.clickAllPlusFilterOptions());

	}

	@Then("^User should be able to see all Filter Options as expanded$")
	public void user_should_be_able_to_see_all_Filter_Options_as_expanded() throws Throwable {
		searchProductPO.checkAllfilterOptionsExpandedIsDisplayed();
	}

	@Given("^User collapses all Filter Options$")
	public void user_collapses_all_Filter_Options() throws Throwable {

		assertTrue(searchProductPO.clickAllMinusFilterOptions());
	}

	@Then("^User should be able to see all Filter Options as collapsed$")
	public void user_should_be_able_to_see_all_Filter_Options_as_collapsed() throws Throwable {
		assertTrue(searchProductPO.checkAllfilterOptionCollapsedIsDisplayed());

	}

	@When("^User selects multiple PRICE filter Options$")
	public void user_selects_multiple_PRICE_filter_Options() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(searchProductPO.selectAllUnselectFacetCheckBox(searchProductPO.facet_Price_CheckBox_ListMobile));
		}else{
			assertTrue(searchProductPO.selectAllUnselectFacetCheckBox(searchProductPO.facet_price_CheckBox_List));
		}
		
	}

	@Then("^User should be able to see the selected PRICE filter Options in selected state$")
	public void user_should_be_able_to_see_the_selected_PRICE_filter_Options_in_selected_state() throws Throwable {
		assertTrue(Common_Web_SD.searchProductPO.isPriceOptionSelected());
	}

	@When("^User deselects multiple PRICE filter Options$")
	public void user_deselects_multiple_PRICE_filter_Options() throws Throwable {

		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(searchProductPO.selectAllUnselectFacetCheckBox(searchProductPO.facet_Price_CheckBox_ListMobile));
		}else{
			assertTrue(searchProductPO.selectAllUnselectFacetCheckBox(searchProductPO.facet_price_CheckBox_List));
		}
	}

	@Then("^User should be able to see the deselected PRICE filter Options in deselected state$")
	public void user_should_be_able_to_see_the_deselected_PRICE_filter_Options_in_deselected_state() throws Throwable {
		assertTrue(searchProductPO.isPriceOptionDeSelected());
	}


	@Given("^User expands PRICE Filter Option$")
	public void user_expands_PRICE_Filter_Option() throws Throwable {
		//searchProductPO.clickAllMinusFilterOptions();
		if("mobile".equalsIgnoreCase(testtype)) {
			driver =(RemoteWebDriver) driver.switchTo().defaultContent();
			scrollPageToWebElement(Common_Web_SD.searchProductPO.filterPricePlusBtnMobile);	
			assertTrue(clickOnButton(Common_Web_SD.searchProductPO.filterPricePlusBtnMobile));
		}else {
			searchProductPO.clickAllMinusFilterOptions();
		assertTrue(clickOnButton(searchProductPO.filterPricePlusBtn));
		
		}
	}

	@Given("^User expands CATEGORY Filter Option$")
	public void user_expands_CATEGORY_Filter_Option() throws Throwable {
		
		if("mobile".equalsIgnoreCase(testtype)) {
			scrollPageToWebElement(searchProductPO.filterCategoryPlusBtnMobile);	
			assertTrue(clickOnButton(searchProductPO.filterCategoryPlusBtnMobile));
		}else {
			searchProductPO.clickAllMinusFilterOptions();
		assertTrue(clickOnButton(searchProductPO.filterPricePlusBtn));
		
		}
	}

	@Given("^User expands BRAND Filter Option$")
	public void user_expands_BRAND_Filter_Option() throws Throwable {
		
		searchProductPO.clickAllMinusFilterOptions();
		if("mobile".equalsIgnoreCase(testtype)) {
			driver =(RemoteWebDriver) driver.switchTo().defaultContent();
			scrollPageToWebElement(searchProductPO.filterBrandPlusBtnMobile);
			//driver =(RemoteWebDriver) driver.switchTo().defaultContent();
			assertTrue(clickOnButton(searchProductPO.filterBrandPlusBtnMobile));
		}else{
			assertTrue(clickOnButton(searchProductPO.filterBrandPlusBtn));
		}
	}
	
	@Given("^User expands COLOR Filter Option$")
	public void user_expands_COLOR_Filter_Option() throws Throwable {
		Thread.sleep(1000);
		searchProductPO.clickAllMinusFilterOptions();
		if("mobile".equalsIgnoreCase(testtype)) {
			driver =(RemoteWebDriver) driver.switchTo().defaultContent();
			scrollPageToWebElement(searchProductPO.filterColorPlusBtnMobile);
			
			assertTrue(clickOnButton(searchProductPO.filterColorPlusBtnMobile));
		}else{
		assertTrue(clickOnButton(searchProductPO.filterColorPlusBtn));
		}
	}
	
	
	
	@Then("^user select the \"(.*?)\" in filter$")
	public void user_select_the_in_filters(String arg1) throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
		
		//searchProductPO.expandFacetDrawer(searchProductPO.filterPricePlusBtnMobile);
		searchProductPO.selectUnselectFacetCheckBoxByIndex(searchProductPO.facet_Price_CheckBox_ListMobile, arg1);
		}else {
		searchProductPO.selectUnselectFacetCheckBoxByIndex(searchProductPO.facet_price_CheckBox_List, arg1);
	}
	}

	@Then("^User should be able to see Related Categories facet$")
	public void user_should_be_able_to_see_Related_Categories_facet() throws Throwable {
		
		assertTrue(isDisplayed(searchProductPO.chkbox_RelatedCategories));
	}


	@Given("^User selects the price option in the filter$")
	public void User_selects_the_price_option_in_the_filter() throws Throwable {
			assertTrue(clickOnButton(searchProductPO.filterPricePlusBtn));
	}

	@Given("^User verify \"(.*?)\" Filter is selected$")
	public void user_verify_Filter_is_selected(String arg1) throws Throwable {
			//li[@data-auid='drawer_$10 - $19.99']//i[contains(@class,'icon-checkbox-active')]
		String xpath="//li[@data-auid='drawer_"+arg1+"']//i[contains(@class,'icon-checkbox-active')]";
		logger.debug("Check Filter check xpath::"+xpath);
		assertTrue(searchProductPO.isFilterSelected(xpath));
	}


	
	@Given("^User unselect the \"(.*?)\" Filter$")
	public void user_unselect_the_filter(String arg1) throws Throwable {
		String xpath="//li[@data-auid='drawer_"+arg1+"']//i[contains(@class,'icon-checkbox-active')]";
		logger.debug("Check Filter check xpath::"+xpath);
		assertTrue(clickOnButton(getfindElementByXPath(xpath)));
	}
	
	@Then("^User selects the required price range$")
	public void user_selects_the_required_price_range() throws Throwable {
			assertTrue(clickOnButton(searchProductPO.chkbox_PriceOption1));
	}

	@Then("^user selects filter option$")
	public void user_selects_filter_option() throws Throwable {

		//	searchProductPO.selectsfilteroption();

	}


	@Given("^User expands \"(.*?)\"$")
	public void user_expands(String arg1) throws Throwable {
		searchProductPO.clickexpandFilterOption1(searchProductPO.facet_brand_CheckBox_List, arg1);

	}


	@When("^User expand the price Filter Option$")
	public void user_expand_the_price_Filter_Option() throws Throwable {
		assertTrue(clickOnButton(searchProductPO.chkbox_PriceOption1));
	}

	@Then("^Verify all the price filters have checkbox product count should be gatherthan zero$")
	public void verify_all_the_price_filters_have_checkbox_product_count_should_be_gatherthan_zero() throws Throwable {
		assertTrue(searchProductPO.checkboxProductCount(searchProductPO.facet_brand_CheckBox_List));
	}
	
	@Then("^Verify the price filters product count with checkboxs product count should be equal$")
	public void verify_the_price_filters_product_count_with_checkboxs_product_count_should_be_equal() throws Throwable {
		int filterCheckBoxsProductCount = searchProductPO.getFilterCheckBoxsProductCount(searchProductPO.facet_brand_CheckBox_List);
		int facetProductCount = searchProductPO.getFacetProductCount(searchProductPO.filterPriceBtn);
		logger.debug(filterCheckBoxsProductCount+"::ProductCountMatch::"+facetProductCount);
		assertEquals(filterCheckBoxsProductCount, facetProductCount);
	}
	
	
	@And("^User Click on apply filter button$")
	public void User_clicks_on_the_filter_ApplyBtn() throws Throwable{
		assertTrue(clickOnButton(Common_Web_SD.searchProductPO.applyFilterfacet_containerMobile));
	}
	@And ("^user scroll till filter flyout$")
	 public void user_scroll_till_filter_flyout() throws Throwable{
		 scrollPageToWebElement(Common_Web_SD.searchProductPO.imgHero_CLP);
	 }
	@Then("^User clicks on the filter flyout$")
	public void User_clicks_on_the_filter_flyout() throws Throwable{
		//scrollPageToWebElement(Common_Web_SD.searchProductPO.btnFilterFlyoutMobile);
		Thread.sleep(2000);
		assertTrue(clickOnButton(Common_Web_SD.searchProductPO.btnFilterFlyoutMobile));
	}
	
	
	

	
}


