package com.aso.qe.test.stepdefinition.web;


import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.PDP_PO;
import com.aso.qe.test.pageobject.PLP_PO;

import cucumber.api.java.en.Then;

public class R1SP1_KER_1954_Web_SD extends CommonActionHelper{
	
	
	
	PDP_PO pdp_po=PageFactory.initElements(driver, PDP_PO.class);
	Logger logger = Logger.getLogger(R1SP1_KER_1954_Web_SD .class);
	
	
	@Then("^User be able to write review$")
	public void user_be_able_to_write_review() throws Throwable {
	    assertTrue(clickOnButton(pdp_po.btnWriteAReview));
	   Thread.sleep(4000);
	    assertTrue(clickOnButton(pdp_po.btnExcellentStar));
	    Thread.sleep(2000);
	    pdp_po.inputReviewTitle.sendKeys("Automation Test_1");	
	    pdp_po.inputReview.sendKeys("Automation Test_2 Automation Test_2 Automation Test_2");	 
	    clickOnButton(pdp_po.btnRecommendToAFriend);
	    pdp_po.inputNickName.sendKeys("Automation Test_3");	
	    pdp_po.inputEmail.sendKeys("xyz@gmail.com");
	    pdp_po.inputPhoneNumber.sendKeys("987456321");
	    clickOnButton(pdp_po.btnTerms_conditions);
	    clickOnButton(pdp_po.btnPostReview);
	    Thread.sleep(2000);
	    assertTrue(clickOnButton(pdp_po.x_yourReviewSubmited));
	}
	
	@Then("^User select the product with No reviews$")
	public void user_select_the_product_with_No_reviews() throws Throwable {
	 //  assertTrue(clickOnButton(pdp_po.itemWithNoReview));
	//	if()
	
		pdp_po.checkAndClickProductWithNoReview();
	}

	
	@Then("^User to verify Be the first to review this product$")
	public void user_to_verify_Be_the_first_to_review_this_product() throws Throwable {
		
		assertTrue(isDisplayed(pdp_po.linkBeTheFirstTOReviewThisPRoduct));
	}
	@Then("^User to navigate to review$")
	public void user_to_navigate_to_review() throws Throwable {
	    assertTrue(clickOnButton(pdp_po.btnPlusReviews_M));
	}
	

@Then("^User to click on be the first to review and write review$")
public void user_to_click_on_be_the_first_to_review_and_write_review() throws Throwable {
   assertTrue(clickOnButton(pdp_po.linkBeTheFirstTOReviewThisPRoduct));
   
   Thread.sleep(2000);
   assertTrue(clickOnButton(pdp_po.btnExcellentStar));
   pdp_po.inputReviewTitle.sendKeys("Automation Test_1");	
   pdp_po.inputReview.sendKeys("Automation Test_2 Automation Test_2 Automation Test_2");	 
   pdp_po.inputNickName.sendKeys("Automation Test_3");	
   pdp_po.inputEmail.sendKeys("xyz@gmail.com");
   pdp_po.inputPhoneNumber.sendKeys("987456321");
   clickOnButton(pdp_po.btnTerms_conditions);  
}

@Then("^User to select the product where review is present$")
public void user_to_select_the_product_where_review_is_present() throws Throwable {
   
	assertTrue(clickOnButton(pdp_po.selectproductWithReview));
	
	
	
	
}
	
@Then("^User to be able to sort review$")
public void user_to_be_able_to_sort_review() throws Throwable {
   //selectByText(pdp_po.selectSortby,  " Highest to Lowest Rating ");
  selectByValue(pdp_po.selectSortby, "positive");
  
}
	
	
@Then("^User go for pagination$")
public void user_go_for_pagination() throws Throwable {
//   assertTrue(isDisplayed(pdp_po.reviewPaginationBackward));
//   assertTrue(isDisplayed(pdp_po.reviewPaginationForward));
if(isDisplayed(pdp_po.reviewPaginationBackward)) {
	logger.debug("page backward is persent");
}
if(isDisplayed(pdp_po.reviewPaginationForward)) {
	logger.debug("page forward is persent");
}

}

	
}
