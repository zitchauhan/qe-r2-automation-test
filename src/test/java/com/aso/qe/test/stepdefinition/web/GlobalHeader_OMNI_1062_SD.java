package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class GlobalHeader_OMNI_1062_SD extends CommonActionHelper {
		
	R1_GlobalElementHeader_Home_PO r1GlobalHeader = PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	
	@Then("^verify Free Shipping and BOPIS Messaging is displayed in the Header$")
	public void verify_Free_Shipping_and_BOPIS_Messaging_is_displayed_in_the_Header() {
		//if(isDisplayed(r1GlobalHeader.pagePromotionBanner)) {
			assertTrue(isDisplayed(r1GlobalHeader.pagePromotionBanner));
		//}
		//else
		//	assertFalse(isDisplayed(r1GlobalHeader.pagePromotionBanner));
	}

	@When("^user clicks on \"([^\"]*)\" half of promotion message$")
	public void user_clicks_on_half_of_promotion_message(String section) {
		if(section.equalsIgnoreCase("first")) {
				clickOnLink(r1GlobalHeader.promotionBannerFreeShippingSection);	
		}
		else if(section.equalsIgnoreCase("second")) {
			clickOnLink(r1GlobalHeader.promotionBannerBopisMessage);
		}
	}

	@When("^user lands on free shipping promotional disclaimer page$")
	public void user_lands_on_free_shipping_promotional_disclaimer_page() throws InterruptedException {
		Thread.sleep(Constants.thread_medium);
		String pageTitle = getTitle();
		if(pageTitle.equalsIgnoreCase("Shipping Returns")) {
			//assertTrue(pageTitle.equalsIgnoreCase("Shipping Returns"));
		assertTrue(true);
		}else {
			assertFalse(true);
		}
	}

	@When("^user lands on pick up for messaging page$")
	public void user_lands_on_pick_up_for_messaging_page() throws InterruptedException {
		Thread.sleep(Constants.thread_medium);
		String pageTitle = getTitle();
		if(pageTitle.equalsIgnoreCase("BOPIS")) {
			assertTrue(true);
		}else {
			assertFalse(true);
		}
	}

	@When("^when user clicks on select a store link on promtion message$")
	public void when_user_clicks_on_select_a_store_link_on_promtion_message() {
		clickOnLink(r1GlobalHeader.bannerFindaStore);
	}
	
}
