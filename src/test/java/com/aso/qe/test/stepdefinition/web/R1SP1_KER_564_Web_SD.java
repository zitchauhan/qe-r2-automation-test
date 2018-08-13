package com.aso.qe.test.stepdefinition.web;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;

import com.aso.qe.test.pageobject.PLP_PO;

import cucumber.api.java.en.Then;

public class R1SP1_KER_564_Web_SD extends CommonActionHelper{

	

	PLP_PO plp_p= PageFactory.initElements(driver, PLP_PO.class);
	
	
	
	@Then("^User Verify color facet$")
	public void user_Verify_color_facet() throws Throwable {
  

		if("mobile".equalsIgnoreCase(testtype)){	
			assertTrue(clickOnButton(plp_p.colorFacet_M));
			   assertTrue(clickOnButton(plp_p.blackColorFacet_M));
			   assertTrue(isDisplayed(plp_p.verifyBlackFromClearAll));  
			   
		}else {
			assertTrue(clickOnButton(plp_p.colorFacet));
			   assertTrue(clickOnButton(plp_p.blackColorFacet));
			   assertTrue(isDisplayed(plp_p.verifyBlackFromClearAll));  
			   
		}
	}

	
	@Then("^User Verify Pagination of page$")
	public void user_Verify_Pagination_of_page() throws Throwable {
	   if(isDisplayed(plp_p.paginationForPage_2)) {
		  scrollPageToWebElement(plp_p.paginationForPage_2);
		   assertTrue(clickOnButton(plp_p.paginationForPage_2));
	   }
	}
	
	
	
	
	
	
	
	

}

