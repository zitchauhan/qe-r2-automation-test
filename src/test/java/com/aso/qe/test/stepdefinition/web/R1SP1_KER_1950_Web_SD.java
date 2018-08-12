package com.aso.qe.test.stepdefinition.web;




import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.PDP_PO;

import cucumber.api.java.en.Then;




public class R1SP1_KER_1950_Web_SD extends CommonActionHelper{
	
	
	
	PDP_PO pdp_po=PageFactory.initElements(driver, PDP_PO.class);

	@Then("^user verify detail and specs tab and its content is displayed$")
	public void user_verify_detail_and_specs_tab_and_its_content_is_displayed() throws Throwable {
              
               isDisplayed(pdp_po.tabDetailsSpecs);
               isDisplayed(pdp_po.textFeatureBenefits);
	}
	@Then("^user do mousehover on review having name$")
	public void user_do_mousehover_on_review_having_name() throws Throwable {
	   
		if(!pdp_po.mouseHoverOnReviewName.equals("Anonymous")) {
			Thread.sleep(2000);
	    	Actions act =new Actions(driver);    	
	    	act.moveToElement(pdp_po.mouseHoverOnReviewName).perform();
		    	
	    
	    }
	}
}
