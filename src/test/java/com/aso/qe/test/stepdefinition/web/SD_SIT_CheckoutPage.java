package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.SIT_CheckoutPageObject;

import cucumber.api.java.en.Then;

public class SD_SIT_CheckoutPage extends CommonActionHelper {
	
public SIT_CheckoutPageObject CheckoutPo= PageFactory.initElements(driver, SIT_CheckoutPageObject.class);
	//*[@id="orginalAddrChecked"]/div/label/span[2]
	
	/*@When("^user Verify the Address Verification page$")
	public void user_Verify_the_Address_Verification_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		CheckoutPo.verifyAddress() ;
		
	}*/
	
	@Then("^user click on continue checkout button$")
	public void user_click_on_continue_checkout_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if("mobile".equalsIgnoreCase(testtype)) {
			Thread.sleep(2000);
			assertTrue(clickOnButton(CheckoutPo.btnContinueCheckout_Mobile));
			Thread.sleep(2000);
		}else {
			assertTrue(clickOnButton(CheckoutPo.btnContinueCheckout));
		}
		
		
		
	}

}
