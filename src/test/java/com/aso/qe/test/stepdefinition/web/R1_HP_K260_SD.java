package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.HomePagePOM;

import cucumber.api.java.en.Then;

public class R1_HP_K260_SD extends CommonActionHelper{
	
	HomePagePOM hp=PageFactory.initElements(driver, HomePagePOM.class);
	
	
	 @Then("^User verify atleast one hero image should appear on home page$")
	 public void user_verify_atleast_one_hero_image_should_appear_on_home_page() throws Throwable {
	     assertTrue(isDisplayed(hp.imgHero));
	 }

	 
	 @Then("^User Verify CTA button is clickable and navigate to respective page$")
	 public void user_Verify_CTA_button_is_clickable_and_navigate_to_respective_page() throws Throwable {
	    assertTrue(clickOnButton(hp.btnShopNowHeroImage));
	    assertTrue(isDisplayed(hp.txtSectionTitle));
	 }

}

