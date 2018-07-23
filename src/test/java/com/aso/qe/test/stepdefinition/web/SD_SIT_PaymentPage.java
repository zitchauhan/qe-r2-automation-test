package com.aso.qe.test.stepdefinition.web;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.SIT_PaymentPageObject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SD_SIT_PaymentPage extends CommonActionHelper {
	
	public SIT_PaymentPageObject PayPo= PageFactory.initElements(driver, SIT_PaymentPageObject.class);
	

	
	
	@When("^user should be able see the the payment method page and enter the creditcard details$")
	public void user_should_be_able_see_the_the_payment_method_page_and_enter_the_creditcard_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PayPo.validatecreditcarddetails();
	}
	
	@Then("^user should click on continue to review button$")
	public void user_should_click_on_continue_to_review_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(clickOnButton(PayPo.btncontinuetoreview));
		Thread.sleep(2000);
	}
	
	@And("^user enter verified by visa password and click on submit button$")
	public void user_enter_verified_by_visa_password_and_click_on_submit_button() throws Throwable {
			
		PayPo.verifyVisapwd();
		
	}
	
	

}
