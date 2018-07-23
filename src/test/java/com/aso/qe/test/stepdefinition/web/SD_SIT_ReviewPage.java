package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.SIT_ReviewPageObject;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SD_SIT_ReviewPage extends CommonActionHelper{
	   public SIT_ReviewPageObject ReviewPo= PageFactory.initElements(driver, SIT_ReviewPageObject.class);
	
	
	
	@When("^user should should be able see Order summary page$")
	public void user_should_should_be_able_see_Order_summary_page() throws Throwable {
		ReviewPo.verifyOrdersummaryPage() ;
		Thread.sleep(2000);
	    
	}
	
	@Then("^user should able to verify the Review shipping address$")
	public void user_should_able_to_verify_the_Review_shipping_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ReviewPo.verifyReviewShippingaddress();
	}
	
	@Then("^user should able to verify the Review shipping method$")
	public void user_should_able_to_verify_the_Review_shipping_method() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ReviewPo.verifyReviewShippingmethod();
	}

	@When("^user should able to verify the billing address$")
	public void user_should_able_to_verify_the_billing_address() throws Throwable {
		ReviewPo.verifyBillingaddress() ;
	}

	@When("^user should able to verify the payment method$")
	public void user_should_able_to_verify_the_payment_method() throws Throwable {
		
		ReviewPo.verifyPaymentmethod();
	   
	}
	
	@Then("^user should click on Place Order Now button$")
	public void user_should_click_on_Place_Order_Now_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(clickOnButton(ReviewPo.btnplaceordernow));
		Thread.sleep(2000);
	}

	    
	    
	   
}
