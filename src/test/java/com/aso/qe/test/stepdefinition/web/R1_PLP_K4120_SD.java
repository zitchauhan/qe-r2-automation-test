package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLP_PO;

import cucumber.api.java.en.Then;

public class R1_PLP_K4120_SD extends CommonActionHelper{
	
	
	R1_GlobalElementHeader_Home_PO globalElementHeader= PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	R1_PLP_PO plp_po=PageFactory.initElements(driver, R1_PLP_PO.class);
	@Then("^User see the promotional message if it is available in PLP$")
	public void user_see_the_promotional_message_if_it_is_available_in_PLP() throws Throwable {
		System.out.println("IF THIS METHOD/TEST CASE FAIL THEN PROMOTIONAL CODE IS NOT AVAILABLE ON ITEM ");
		assertTrue(isDisplayed(plp_po.textPromotionMsg));
		
		
		//	    if(isDisplayed(plp_po.textPromotionMsg)) {
//	    	System.out.println("Promotion Message is available on PLP");
//	    }
//	    else {
//	    	System.out.println("Promotion Message is NOT available on PLP");	
//	    }
	}
	@Then("^User click on Rebates Footer$")
	public void user_click_on_Rebates_Footer() throws Throwable {
	   assertTrue(clickOnButton(globalElementHeader.lnkrebates));
	}
	@Then("^User Verify Rebates UI$")
	public void user_Verify_Rebates_UI() throws Throwable {
	    
	}

}
