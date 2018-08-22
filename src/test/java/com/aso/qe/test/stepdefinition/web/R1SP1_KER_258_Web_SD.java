package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.HomePagePOM;

import cucumber.api.java.en.Then;

public class R1SP1_KER_258_Web_SD extends CommonActionHelper{
	
	HomePagePOM hp=PageFactory.initElements(driver, HomePagePOM.class);
	 
	@Then("^User Verify product carousel is appearing on home page$")
	public void user_Verify_product_carousel_is_appearing_on_home_page() throws Throwable {
	   
		assertTrue(isDisplayed(hp.productCarousel_1));
		assertTrue(isDisplayed(hp.productCarousel_2));
		assertTrue(isDisplayed(hp.productCarousel_3));
	}

	@Then("^User Verify click on Carousel Arrows$")
	public void user_Verify_click_on_Carousel_Arrows() throws Throwable {
	    assertTrue(isClickable(hp.productCarousel_right));
	    assertTrue(isClickable(hp.productCarousel_left));
	}

	@Then("^Verify product carosel is appearing on home page for mobile$")
	public void verify_product_carosel_is_appearing_on_home_page_for_mobile() throws Throwable {
	  waitForPageLoad(driver);
	  scrollPageToWebElement(hp.imgProductCarousel_M);
		assertTrue(isDisplayed(hp.imgProductCarousel_M));
	}
	
}

