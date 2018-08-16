package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.HomePagePOM;

import cucumber.api.java.en.Then;

public class R1SP1_KER_259_Web_SD extends CommonActionHelper{
	
	HomePagePOM hp=PageFactory.initElements(driver, HomePagePOM.class);

	@Then("^Verify user click on Carousel indicatior and advance towards next carousel image$")
	public void verify_user_click_on_Carousel_indicatior_and_advance_towards_next_carousel_image() throws Throwable {
	   assertTrue(clickOnButton(hp.productCarouselIndicator_1));
	   assertTrue(clickOnButton(hp.productCarouselIndicator_2));
	}
	
}

