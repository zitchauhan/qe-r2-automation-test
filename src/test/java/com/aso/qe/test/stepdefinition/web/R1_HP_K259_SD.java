package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_HomePage_PO;

import cucumber.api.java.en.Then;

public class R1_HP_K259_SD extends CommonActionHelper{
	
	R1_HomePage_PO hp=PageFactory.initElements(driver, R1_HomePage_PO.class);

	@Then("^Verify user click on Carousel indicatior and advance towards next carousel image$")
	public void verify_user_click_on_Carousel_indicatior_and_advance_towards_next_carousel_image() throws Throwable {
	   assertTrue(clickOnButton(hp.productRecommendationIndicator));
	}
	
}

