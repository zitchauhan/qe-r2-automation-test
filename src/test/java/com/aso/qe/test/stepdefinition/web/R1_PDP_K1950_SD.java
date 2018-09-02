package com.aso.qe.test.stepdefinition.web;




import static org.junit.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_PDP_PO;

import cucumber.api.java.en.Then;




public class R1_PDP_K1950_SD extends CommonActionHelper{
	
	
	
	R1_PDP_PO pdp_po=PageFactory.initElements(driver, R1_PDP_PO.class);

	@Then("^user verify detail and specs tab and its content is displayed$")
	public void user_verify_detail_and_specs_tab_and_its_content_is_displayed() throws Throwable {
              
               isDisplayed(pdp_po.tabDetailsSpecs);
               isDisplayed(pdp_po.textFeatureBenefits);
	}
	@Then("^user do mousehover on review having name$")
	public void user_do_mousehover_on_review_having_name() throws Throwable {

		if(pdp_po.mouseHoverOnReviewName.getText().equals("Anonymous")==false) {
			waitForElement(pdp_po.mouseHoverOnReviewName);
	    	Actions act =new Actions(driver);    	
	    	act.moveToElement(pdp_po.mouseHoverOnReviewName).build().perform();
	    	assertTrue(isDisplayed(pdp_po.reviewFlyout));
	    	
		    	
	    
	    }
	}
}
