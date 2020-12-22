package com.aso.qe.test.stepdefinition.web;


import static org.testng.Assert.assertTrue;


import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;

import com.aso.qe.test.pageobject.R1_PDP_PO;

import cucumber.api.java.en.Then;

public class R1_PDP_K652_SD extends CommonActionHelper {
	
	R1_PDP_PO pd_p=PageFactory.initElements(driver, R1_PDP_PO.class);
	
	@Then("^user verify customer is able to view the average rating on top$")
	public void user_verify_customer_is_able_to_view_the_average_rating_on_top() throws Throwable {
	  assertTrue(isDisplayed(pd_p.starRatingOnPDPtop));
	}
	
	@Then("^user click on Review and Rating on top of the page$")
	public void user_click_on_Review_and_Rating_on_top_of_the_page() throws Throwable {
	   assertTrue(clickOnButton(pd_p.starRatingOnPDPtop));
	}	

}
