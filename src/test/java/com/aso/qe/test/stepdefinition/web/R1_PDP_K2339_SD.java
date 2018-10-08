package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_HomePage_PO;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R1_PDP_K2339_SD extends CommonActionHelper {
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	public R1_HomePage_PO homepagePOM = PageFactory.initElements(driver, R1_HomePage_PO.class);
	public R1_SearchProduct_PO searchProductPO = PageFactory.initElements(driver, R1_SearchProduct_PO.class);

	@Then("^User click on the product image$")
	public void user_click_on_the_productimage() throws Throwable {
		assertTrue(clickOnButton(globalElementHeader.imgMensShortShirt));
	}

	@Then("^User click on the breadcrumb last link$")
	public void user_click_on_the_breadcrumb_last_link() throws Throwable {
		driver.navigate().refresh();
		waitForPageLoad(driver);
		driver.navigate().refresh();
		waitForPageLoad(driver);
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(globalElementHeader.lnkBreadcrumbLast));
		}
	}

	@Then("^User click on the breadcrumb link for mobile$")
	public void user_click_on_the_breadcrumb_link_for_mobile() throws Throwable {
		assertTrue(clickOnButton(globalElementHeader.lnkMensClothing));
	}

	
	//SID 20-August
//	@Then("^User verify the last breadcrumb in the series should not be an active link$")
//	public void user_verify_the_last_breadcrumb_in_the_series_should_not_be_an_active_link() throws Throwable {
//		driver.navigate().refresh();
//		boolean flag= true;
//		if(isDisplayed(globalElementHeader.txtproductselected)) {
//		assertTrue(isDisplayed(globalElementHeader.txtproductselected));
//		if(isDisplayed(globalElementHeader.txtproductselected)) {
//			flag = globalElementHeader.txtproductselected.getAttribute("href")!=null;
//			assertFalse(flag);
//		}
//		}
//	}
//
	@Then("^User click on the breadcrumb last active link in PDP$")
	public void user_click_on_the_breadcrumb_last_active_link_in_PDP() throws Throwable {
		waitForPageLoad(driver);
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(globalElementHeader.lnkBreadcrumbLast));
		} else {
			assertTrue(clickOnButton(globalElementHeader.pdpLastActiveBraedcrumb));
		}
	}
	
	@Then("^User click on the breadcrumb last active link in L3$")
	public void user_click_on_the_breadcrumb_last_active_link_in_L3() throws Throwable {
		waitForPageLoad(driver);
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(globalElementHeader.lnkBreadcrumbLast));
		} else {
			assertTrue(clickOnButton(globalElementHeader.l3LastActiveBreadcrumb));
		}
	}
	@Then("^User click on the breadcrumb last active link in L2$")
	public void user_click_on_the_breadcrumb_last_active_link_in_L2() throws Throwable {
		waitForPageLoad(driver);
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(globalElementHeader.lnkBreadcrumbLast));
		} else {
			assertTrue(clickOnButton(globalElementHeader.l2LastActiveBreadcrumb));
		}
	}
	@Then("^User click on the breadcrumb last active link in L1$")
	public void user_click_on_the_breadcrumb_last_active_link_in_L1() throws Throwable {
		waitForPageLoad(driver);
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(globalElementHeader.lnkBreadcrumbLast));
		} else {
			assertTrue(clickOnButton(globalElementHeader.l1LastActiveBreadcrumb));
		}
	}
	

	@Then("^User verify the last breadcrumb in the series should not be an active link for last link$")
	public void user_verify_the_last_breadcrumb_in_the_series_should_not_be_an_active_link_for_last_link()
			throws Throwable {
		assertTrue(isDisplayed(globalElementHeader.txtproductselected));
		boolean flag= true;
		if(isDisplayed(globalElementHeader.txtproductselected)) {
		assertTrue(isDisplayed(globalElementHeader.txtproductselected));
		if(isDisplayed(globalElementHeader.txtproductselected)) {
			flag = globalElementHeader.txtproductselected.getAttribute("href")!=null;
			assertFalse(flag);
		}
		}
	}

//	@Then("^User verify the last breadcrumb in the series should not be an active link for second link$")
//	public void user_verify_the_last_breadcrumb_in_the_series_should_not_be_an_active_link_for_second_link()
//			throws Throwable {
//		assertTrue(isDisplayed(globalElementHeader.lnkL2PageNotClickable));
//	}
//	@Then("^User click on the breadcrumb last second link$")
//	public void user_click_on_the_breadcrumb_last_second_link() throws Throwable {
//		assertTrue(clickOnButton(globalElementHeader.lnkMensShirts));
//	}

	
	@And("^User verify that the last breadcrumb in PLP will not be an active link$")
	public void user_verify_that_the_last_breadcrumb_in_PLP_will_not_be_an_active_link() throws Throwable {
		assertTrue(isDisplayed(globalElementHeader.titleMensShirtclothing));
	}

	@And("^User verify that the last breadcrumb in category will not be an active link$")
	public void user_verify_that_the_last_breadcrumb_in_category_will_not_be_an_active_link() throws Throwable {
		driver.navigate().refresh();
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

	@Then("^User click on the Find a Store button in burger menu$")
	public void user_click_on_the_Find_a_Store_button_in_burger_menu() throws Throwable {
		scrollPageToWebElement(globalElementHeader.txtFindAStoreMobile);
		waitForElement(globalElementHeader.txtFindAStoreMobile);
		Thread.sleep(Constants.thread_low);
		assertTrue(clickOnButton(globalElementHeader.txtFindAStoreMobile));
	}
	@Then("^User click on the brand btn$")
	public void User_click_on_the_brand_btn() { 
		Actions actions = new Actions(getDriver());
        actions.moveToElement(globalElementHeader.btnBrandCategory).build().perform();
		//moveHover(globalElementHeader.btnBrandCategory);
		assertTrue(clickOnButton(globalElementHeader.lnkBrandNike));
		
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
		globalElementHeader.enterPincode.sendKeys("76012");
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
		Thread.sleep(Constants.thread_medium);
		for (WebElement storeResult : globalElementHeader.storeResults) {
			assertTrue(clickOnButton(storeResult));
			break;
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

	@Then("^user navigates to Store locator from the footer$")
	public void user_navigates_to_Store_locator_from_the_footer() throws Throwable {
	}

	@Then("^user verify the search page breadcrumb$")
	public void user_verify_the_search_page_breadcrumb() throws Throwable {
		waitForElement(globalElementHeader.anchorAcademy);
		assertTrue(isDisplayed(globalElementHeader.anchorAcademy));
		Boolean check = false;
		check = globalElementHeader.productNameBreadcrumb.getText().equalsIgnoreCase("Results for " + "Pants");
		if (check == true) {
			assertTrue(isDisplayed(globalElementHeader.productNameBreadcrumb));
		}
	}

	@Then("^user enters required value in search box mobile and click on search$")
	public void user_enters_required_value_in_search_box_mobile_and_click_on_search() throws Throwable {
		waitForElement(R1_SearchProduct_PO.searchTextBoxMobile);
		globalElementHeader.txtSearchBox_mobile.click();
		Thread.sleep(Constants.thread_medium);
		globalElementHeader.txtSearchBox_mobile.sendKeys("Pants");
		globalElementHeader.clickSearchbtn.click();
	}

	@Then("^user verify the search page breadcrumb in mobile$")
	public void user_verify_the_search_page_breadcrumb_in_mobile() throws Throwable {
		waitForElement(globalElementHeader.mobileBreadcrumb);
		assertEquals(globalElementHeader.mobileBreadcrumb.getText(), "Academy");
		assertTrue(isDisplayed(globalElementHeader.mobileBreadcrumb));
	}

	@Then("^user click on find a store in footer$")
	public void user_click_on_find_a_store_in_footer() throws Throwable {
		scrollPageToWebElement(globalElementHeader.lnkfindastore);
		assertTrue(clickOnButton(globalElementHeader.lnkfindastore));
	}

	@Then("^user verify the breadcrub in store locator page$")
	public void user_verify_the_breadcrub_in_store_locator_page() throws Throwable {
		assertEquals(globalElementHeader.academyBreadcrumb.getText().toLowerCase(), "academy");
		assertEquals(globalElementHeader.storeLocatorBreadcrumb.getText().toLowerCase(), "store locator");
	}

}