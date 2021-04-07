package com.aso.qe.test.stepdefinition.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.pageobject.ios.PDPPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class PDPPageSD extends GlobalMobileHelper{

	private PDPPage pdp;
	
	@Then("^User verifies delivery options in PDP$")
	public void verifyDeliveryOptions() throws Throwable {
		pdp.verifyDeliveryOptionsInPDP();
	}
	
	@Then("^User verifies default delivery option selected in PDP$")
	public void verifyDefaultDeliveryOption() throws Throwable {
		pdp.verifyDefaultDeliveryOption();
	}
	
	
}
