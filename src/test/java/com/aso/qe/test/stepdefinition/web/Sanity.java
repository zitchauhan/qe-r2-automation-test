package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.SearchProductPO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sanity extends CommonActionHelper{
	//private static final Logger logger = Logger.getLogger(R1SP1_KER_728_Web_SD.class);

	GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	//public ShoppingCartViewPO shoppingCartViewPO =  PageFactory.initElements(driver, ShoppingCartViewPO.class);
	public SearchProductPO searchProductPO =  PageFactory.initElements(driver, SearchProductPO.class);


	/*@When("^user clicks on one of the category and navigates to LOne page$")
	public void user_clicks_on_one_of_the_category_and_navigates_to_LOne_page() throws Throwable {
		assertTrue((clickOnButton(globalElementHeader.btnShopCategory)));
		assertTrue(clickOnButton(globalElementHeader.btnClothingCategory));

	}*/

	@Then("^User should be able to see L1 Page$")
	public void user_should_be_able_to_see_L1_Page() throws Throwable {
		globalElementHeader.verifypresenceofL1Page();


	}

	@Then("^User navigates to L2 from home page$")
	public void user_navigates_to_L2_from_home_page() throws Throwable {
		globalElementHeader.navigateToL2ViaClick_DesktopHomepage();
	}


	@Then("^User should be able to see L2 Page$")
	public void user_should_be_able_to_see_L2_Page() throws Throwable {
		globalElementHeader.verifypresenceofL2Page();

	}

	@Then("^User navigates to L3 from home page$")
	public void user_navigates_to_L3_from_home_page() throws Throwable {
		globalElementHeader.navigateToL3ViaClick_DesktopHomepage();
	}

	@Then("^User should be able to see L3 Page$")
	public void user_should_be_able_to_see_L3_Page() throws Throwable {
		globalElementHeader.verifypresenceofL3Page();
	}

	@When("^User enters required value in search box$")
	public void user_enters_required_value_in_search_box() throws Throwable {

		globalElementHeader.enterthePDPSearchData();

	}

	@Then("^User should be navigated to PDP Page$")
	public void user_should_be_navigated_to_PDP_Page() throws Throwable {
		globalElementHeader.verifypresenceofPDPPage();
	}


	@When("^User enters required value in search box to navigate to search Results page$")
	public void user_enters_required_value_in_search_box_to_navigate_to_search_Results_page() throws Throwable {
		globalElementHeader.entertheSearchDataForResultsPage();

	}

	@Given("^User clicks on any of the subcategory in L1 Page$")
	public void user_clicks_on_any_of_the_subcategory_in_L1_Page() throws Throwable {
		assertTrue((clickOnButton(globalElementHeader.CategoryL1)));
	}

	@Then("^User should be navigated to Search Results Page$")
	public void user_should_be_navigated_to_Search_Results_Page() throws Throwable {

		globalElementHeader.verifypresenceofSearchResultsPage();
	}




	@Then("^User should be navigated to L2 Page$")
	public void user_should_be_navigated_to_L2_Page() throws Throwable {
		globalElementHeader.verifypresenceofL2Page();

	}

	@When("^User clicks on required category in L2 Page$")
	public void user_clicks_on_required_category_in_L2_Page() throws Throwable {
		assertTrue((clickOnButton(globalElementHeader.CategoryL1)));
	}

	@Then("^User should be navigated to L3 Page$")
	public void user_should_be_navigated_to_L3_Page() throws Throwable {
		globalElementHeader.verifypresenceofL3Page();
	}


	@Given("^User clicks on required product in L3 Page$")
	public void user_clicks_on_required_product_in_L3_Page() throws Throwable {
		assertTrue((clickOnButton(globalElementHeader.PLPProduct)));
	}

	@Then("^User should be able to see product grid in L3 Page$")
	public void user_should_be_able_to_see_product_grid_in_L3_Page() throws Throwable {

		globalElementHeader.verifypresenceofL3Page();
	}

	@Then("^User should be able to see product grid in L2 Page$")
	public void user_should_be_able_to_see_product_grid_in_L2_Page() throws Throwable {
		globalElementHeader.verifypresenceofL2Page();
	}

	@Then("^User should be able to see BreadCrumb in L1 page$")
	public void user_should_be_able_to_see_BreadCrumb_in_L1_page() throws Throwable {
		assertTrue((isDisplayed(globalElementHeader.lnkbreadcrumbtext)));
		assertTrue((isDisplayed(globalElementHeader.lnkbreadcrumb)));
	}

	@Then("^User should be able to see pagination links in L2 page$")
	public void user_should_be_able_to_see_pagination_links_in_L2_page() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue((isDisplayed(globalElementHeader.lnkL2Pagination)));
			assertTrue((clickOnButton(globalElementHeader.lnkPagination2)));
			assertTrue((clickOnButton(globalElementHeader.lnkNextPagePagination)));
		}else {
			assertTrue((isDisplayed(globalElementHeader.lnkL2Pagination)));
			assertTrue((clickOnButton(globalElementHeader.lnkPagination2)));
			assertTrue((clickOnButton(globalElementHeader.lnkPagination3)));
		}
	}

	@Then("^User should be able to see pagination links in L3 page$")
	public void user_should_be_able_to_see_pagination_links_in_L3_page() throws Throwable {
		Thread.sleep(2000);
		assertTrue((isDisplayed(globalElementHeader.lnkL2Pagination)));
		Thread.sleep(2000);
		assertTrue((clickOnButton(globalElementHeader.lnkPagination2)));
		Thread.sleep(2000);
		assertTrue((clickOnButton(globalElementHeader.lnkNextPagePagination)));
	}

	@And("^User scroll to pagination$")
	public void user_scroll_to_pagination() throws Throwable {

		if("mobile".equalsIgnoreCase(testtype)) {	
//			scrollPageToWebElement(globalElementHeader.lnkL2PaginationMobile);
//			Thread.sleep(2000);
//			globalElementHeader.lnkL2PaginationMobile.sendKeys(Keys.ARROW_UP);
//			globalElementHeader.lnkL2PaginationMobile.sendKeys(Keys.ARROW_UP);
//			globalElementHeader.lnkL2PaginationMobile.sendKeys(Keys.ARROW_UP);
		}else {
			Thread.sleep(2000);
			scrollPageToWebElement(globalElementHeader.lnkL2Pagination);
			Thread.sleep(2000);
		}
	}

}
