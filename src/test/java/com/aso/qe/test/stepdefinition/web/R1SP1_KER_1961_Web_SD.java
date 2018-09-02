package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.HomePagePOM;
import com.aso.qe.test.pageobject.PLP_PO;
import com.aso.qe.test.pageobject.SearchProductPO;
import cucumber.api.java.en.Then;

public class R1SP1_KER_1961_Web_SD extends CommonActionHelper {
	String breadcrumb="";
	GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	public HomePagePOM homepagePOM = PageFactory.initElements(driver, HomePagePOM.class);
	public SearchProductPO searchProductPO = PageFactory.initElements(driver, SearchProductPO.class);
	PLP_PO plp_po = PageFactory.initElements(driver, PLP_PO.class);
	
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
		Thread.sleep(5000);	
		scrollPageToWebElement(globalElementHeader.btnBrandCategoryTab);
			breadcrumb=globalElementHeader.btnBrandCategoryTab.getText();
		assertTrue(clickOnButton(globalElementHeader.btnBrandCategoryTab));
	}

	@Then("^User click on the nike name$")
	public void User_click_on_the_nike_name() throws Throwable {
		assertTrue(clickOnButton(globalElementHeader.lnkBrandNike));
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
