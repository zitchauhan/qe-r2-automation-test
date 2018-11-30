package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_HomePage_PO;
import com.aso.qe.test.pageobject.R1_PLP_PO;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;
import cucumber.api.java.en.Then;

public class R1_PLP_K1961_SD extends CommonActionHelper {
	String breadcrumb="";
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	public R1_HomePage_PO homepagePOM = PageFactory.initElements(driver, R1_HomePage_PO.class);
	public R1_SearchProduct_PO searchProductPO = PageFactory.initElements(driver, R1_SearchProduct_PO.class);
	R1_PLP_PO plp_po = PageFactory.initElements(driver, R1_PLP_PO.class);
	
	@Then("^User click on burger menu$")
	public void User_click_on_burger_menu() throws Throwable {
		assertTrue(clickOnButton(globalElementHeader.btnBurgerMenu));
	}

	@Then("^User click on the Shop tab$")
	public void User_click_on_the_Shop_tab() throws Throwable {
		assertTrue(clickOnButton(globalElementHeader.btnShopCategory));
	}


	@Then("^User click on the brand tab$")
	public void User_click_on_the_brand_tab() throws Throwable {
		Thread.sleep(Constants.thread_medium);
		scrollPageToWebElement(globalElementHeader.btnBrandCategoryTab);
			breadcrumb=globalElementHeader.btnBrandCategoryTab.getText();
		assertTrue(clickOnButton(globalElementHeader.btnBrandCategoryTab));
	}

	@Then("^User click on the nike name$")
	public void User_click_on_the_nike_name() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(clickOnButton(globalElementHeader.selectBrand_M));
		}
		else {
		assertTrue(clickOnButton(globalElementHeader.lnkBrandNike));
	}
	}

	@Then("^User verify that anchor is academy in breadcrumb$")
	public void User_verify_that_anchor_is_academy_in_breadcrumb() throws Throwable {
		assertTrue(isDisplayed(globalElementHeader.anchorAcademy));
	}
	
	@Then("^User verify that brandcrumb is previous page$")
	public void User_verify_that_brandcrumb_is_previous_page() throws Throwable {
		assertEquals(globalElementHeader.mobileBreadcrumb.getText().toLowerCase(),breadcrumb.toLowerCase());
	} 

	@Then("^User check for breadcrumb clickable$")
	public void User_check_for_breadcrumb_clickable() throws Throwable {
		breadcrumb = globalElementHeader.mobileBreadcrumb.getText();
		assertTrue(clickOnButton(globalElementHeader.mobileBreadcrumb));
	}

	@Then("^User verify the title$")
	public void User_verify_the_title() throws Throwable {
		assertEquals(plp_po.txtSectionTitle.getText().toLowerCase(), breadcrumb.toLowerCase());
	}
}
