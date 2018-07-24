package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.HomePagePOM;
import com.aso.qe.test.pageobject.SearchProductPO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R1SP1_KER_2339_Web_SD extends CommonActionHelper {
	// private static final Logger logger =
	// Logger.getLogger(R1SP1_KER_728_Web_SD.class);

	GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	// public ShoppingCartViewPO shoppingCartViewPO =
	// PageFactory.initElements(driver, ShoppingCartViewPO.class);
	public HomePagePOM homepagePOM = PageFactory.initElements(driver, HomePagePOM.class);
	public SearchProductPO searchProductPO = PageFactory.initElements(driver, SearchProductPO.class);

	@And("^User navigates to PDP page$")
	public void user_navigates_to_PDP_page() throws Throwable {
		assertTrue(clickOnButton(homepagePOM.menuClothing));
		assertTrue(clickOnButton(homepagePOM.submenu));
		assertTrue(clickOnButton(searchProductPO.img_men_pant));

	}

	@Then("^User click on the product image$")
	public void user_click_on_the_productimage() throws Throwable {
		assertTrue(clickOnButton(globalElementHeader.imgMensShortShirt));

	}

	@Then("^User click on the breadcrumb last link$")
	public void user_click_on_the_breadcrumb_last_link() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(globalElementHeader.lnkBreadcrumbLast));
		}else {
			assertTrue(clickOnButton(globalElementHeader.lnkMensShirts));
		}
	}

	@Then("^User click on the breadcrumb last second link$")
	public void user_click_on_the_breadcrumb_last_second_link() throws Throwable {

		assertTrue(clickOnButton(globalElementHeader.lnkMensClothing));
	}

	@Then("^User click on the breadcrumb link for mobile$")
	public void user_click_on_the_breadcrumb_link_for_mobile() throws Throwable {

		// assertTrue(clickOnButton(globalElementHeader.lnkMensShirts));

		assertTrue(clickOnButton(globalElementHeader.lnkMensClothing));
	}

	@Then("^User verify the last breadcrumb in the series should not be an active link$")
	public void user_verify_the_last_breadcrumb_in_the_series_should_not_be_an_active_link() throws Throwable {

		assertTrue(isDisplayed(globalElementHeader.txtproductselected));

	}

	@Then("^User verify the last breadcrumb in the series should not be an active link for last link$")
	public void user_verify_the_last_breadcrumb_in_the_series_should_not_be_an_active_link_for_last_link()
			throws Throwable {

		assertTrue(isDisplayed(globalElementHeader.lnkMensShirtsnotclickable));

	}

	@Then("^User verify the last breadcrumb in the series should not be an active link for second link$")
	public void user_verify_the_last_breadcrumb_in_the_series_should_not_be_an_active_link_for_second_link()
			throws Throwable {

		assertTrue(isDisplayed(globalElementHeader.lnkMensClothingnotclickable));

	}

	@And("^User verify that the last breadcrumb in PLP will not be an active link$")
	public void user_verify_that_the_last_breadcrumb_in_PLP_will_not_be_an_active_link() throws Throwable {

		assertTrue(isDisplayed(globalElementHeader.titleMensShirtclothing));

	}

	@And("^User verify that the last breadcrumb in category will not be an active link$")
	public void user_verify_that_the_last_breadcrumb_in_category_will_not_be_an_active_link() throws Throwable {

		assertTrue(isDisplayed(globalElementHeader.titleclothing));

	}

	@And("^User verify that the last breadcrumb in sub category will not be an active link$")
	public void user_verify_that_the_last_breadcrumb_in_sub_category_will_not_be_an_active_link() throws Throwable {

		assertTrue(isDisplayed(globalElementHeader.titleMensclothing));

	}

	@Then("^User click on the clothing category$")
	public void user_click_on_the_clothing_category() throws Throwable {
		assertTrue(clickOnButton(globalElementHeader.btnClothingCategory));

	}

	@Then("^User verifies that the clothing category should not be active link$")
	public void user_verifies_that_the_clothing_category_should_not_be_active_link() throws Throwable {
		assertTrue(clickOnButton(globalElementHeader.btnClothingCategory));

	}

	// ******************************************************************************************************************

	@Then("^User click on burger menu$")
	public void user_click_on_burger_menu() throws Throwable {
		assertTrue(clickOnButton(globalElementHeader.btnBurgerMenu));
	}

	@Then("^User click on the Shop tab$")
	public void user_click_on_the_Shop_tab() throws Throwable {
		assertTrue(clickOnButton(globalElementHeader.btnShopCategory));
	}

	@Then("^User click on the brand btn$")
	public void user_click_on_the_brand_btn() throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(globalElementHeader.btnBrandCategory).build().perform();
	}

	@Then("^User click on the brand tab$")
	public void user_click_on_the_brand_tab() throws Throwable {
		assertTrue(clickOnButton(globalElementHeader.btnBrandCategoryTab));
	}

	@Then("^User click on the nike name$")
	public void user_click_on_the_nike_name() throws Throwable {
		assertTrue(clickOnButton(globalElementHeader.lnkBrandNike));
	}

	@Then("^User verify that anchor is academy in breadcrumb$")
	public void user_verify_that_anchor_is_academy_in_breadcrumb() throws Throwable {
		assertTrue(isDisplayed(globalElementHeader.anchorAcademy));
	}

	@Then("^User verify that brandcrumb is previous page$")
	public void user_verify_that_brandcrumb_is_previous_page() throws Throwable {
		assertEquals(globalElementHeader.btnBrandCategory.getText().toLowerCase(),
				globalElementHeader.mobileBreadcrumb.getText().toLowerCase());
	}
	@Then("^User check for breadcrumb clickable$")
	public void user_check_for_breadcrumb_clickable() throws Throwable {
		assertTrue(clickOnButton(globalElementHeader.mobileBreadcrumb));
	}
	@Then("^User verify the title$")
	public void user_verify_the_title() throws Throwable {
		assertEquals(globalElementHeader.mobileBreadcrumb.getText().toLowerCase(),
				globalElementHeader.mobileBreadcrumbpreviousTitle.getText().toLowerCase());
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////

	@Then("^User click on the Find a Store button in burger menu$")
	public void user_click_on_the_Find_a_Store_button_in_burger_menu() throws Throwable {
		scrollPageToWebElement(globalElementHeader.txtFindAStoreMobile);
		waitForElement(globalElementHeader.txtFindAStoreMobile);
		Thread.sleep(300);
		assertTrue(clickOnButton(globalElementHeader.txtFindAStoreMobile));
	}
	@Then("^User click on the Find a Store button$")
	public void user_click_on_the_Find_a_Store_button() throws Throwable {
		assertTrue(clickOnButton(globalElementHeader.txtFindAStore));
	}

	@Then("^User is able to see Find a Store Modal$")
	public void user_is_able_to_see_Find_a_Store_Modal() throws Throwable {
		waitForElement(globalElementHeader.findaStoreModal);
		assertTrue(isDisplayed(globalElementHeader.findaStoreModal));
	}

	@Then("^User enter the pin code$")
	public void user_enter_the_pin_code() throws Throwable {
		assertTrue(clickOnButton(globalElementHeader.enterPincode));
		globalElementHeader.enterPincode.sendKeys("60007");
	}

	@Then("^User click on search button$")
	public void user_click_on_search_button() throws Throwable {
		assertTrue(clickOnButton(globalElementHeader.clickSearchIcon));
	}

	@Then("^User should able to see the results$")
	public void user_should_able_to_see_the_results() throws Throwable {
		for (WebElement storeResult : globalElementHeader.storeResults) {
			assertTrue(isDisplayed(storeResult));
			break;
		}
	}

	@Then("^User click on see details$")
	public void user_click_on_see_details() throws Throwable {
		Thread.sleep(3000);
		for (WebElement storeResult : globalElementHeader.storeResults) {
			assertTrue(clickOnButton(storeResult));
		}
	}

	@Then("^User matches the order of breadcrumb$")
	public void user_matches_the_order_of_breadcrumb() throws Throwable {
		waitForElement(globalElementHeader.storeAddressLocalityBreadcrumb);
		assertEquals(globalElementHeader.storeAddressLocality.getText().toLowerCase(),
				globalElementHeader.storeAddressLocalityBreadcrumb.getText().toLowerCase());
		assertEquals(globalElementHeader.storeAddressRegion.getText().toLowerCase(),
				globalElementHeader.storeAddressRegionBreadcrumb.getText().toLowerCase());
		assertEquals(globalElementHeader.storeName.getText().toLowerCase(),
				globalElementHeader.storeNameBreadcrumb.getText().toLowerCase());
	}

}