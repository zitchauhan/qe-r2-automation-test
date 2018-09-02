package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_HomePage_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R1_HP_K3184_SD extends CommonActionHelper{

	R1_GlobalElementHeader_Home_PO  geh_po= PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	R1_HomePage_PO hp_p=PageFactory.initElements(driver, R1_HomePage_PO.class);
	
	
	@Then("^User click on shop Gift Cards Link and navigate to Gift Card LAnding page$")
	public void user_click_on_shop_Gift_Cards_Link_and_navigate_to_Gift_Card_LAnding_page() throws Throwable {
	
		waitForPageLoad(driver);
		Thread.sleep(2000);
		scrollPageToWebElement(geh_po.lnkgiftcards);
	    waitForElement(geh_po.lnkgiftcards);
		assertTrue(clickOnButton(geh_po.lnkgiftcards)); 
		
	}


	@Then("^user verify shop gift card button in gift card landing page$")
	public void user_verify_shop_gift_card_button_in_gift_card_landing_page() throws Throwable {
	 
	 if("mobile".equalsIgnoreCase(testtype)){	
			assertTrue(isClickable(hp_p.btnShopGiftCards_M));
		}else {
			assertTrue(isClickable(hp_p.btnShopGiftCards));
		}
	}

	
	@Then("^user scroll to service on footer and expand service$")
	public void user_scroll_to_service_on_footer_and_expand_service() throws Throwable {
	    waitForPageLoad(driver);
	   
	    Thread.sleep(2000);
	    assertTrue(clickOnButton(geh_po.expandall_Academy_services));
	   assertTrue(clickOnButton(geh_po.lnkgiftcards));
	}
	
	@Then("^User verify shop Bulk Gift Cards btn in gift card landing page$")
	public void user_verify_shop_Bulk_Gift_Cards_btn_in_gift_card_landing_page() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)){	
			assertTrue(isClickable(hp_p.btnShopBulkGiftCards_M));
		}else {
			assertTrue(isClickable(hp_p.btnShopBulkGiftCards));
		}
		
	}
	@Then("^verify check balance CTA button in gift card landing page$")
	public void verify_check_balance_CTA_button_in_gift_card_landing_page() throws Throwable {
	  
	    if("mobile".equalsIgnoreCase(testtype)){	
			assertTrue(isClickable(hp_p.btnCheckBalance_CTA_M));
		}else {
			 assertTrue(isClickable(hp_p.btnCheckBalance_CTA));
		}
		
	}

}
