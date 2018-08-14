package com.aso.qe.test.stepdefinition.web;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.SIT_ReviewPageObject;
import com.aso.qe.test.pageobject.SIT_ShippingMethodPageObject;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.Then;

public class SD_SIT_ShippingMethodPage extends CommonActionHelper{
	public SIT_ShippingMethodPageObject shippingmethod= PageFactory.initElements(driver, SIT_ShippingMethodPageObject.class);
	public SIT_ReviewPageObject review= PageFactory.initElements(driver, SIT_ReviewPageObject.class);
	/*@And("^user should be able to see ShippingMethod mention in the current url$")
	public void user_should_be_able_to_see_ShippingMethod_mention_in_the_current_url() throws Throwable{

		String currentURL = getCurrentPageURL();
		if(currentURL.contains("ShippingMethod")) {
			logger.debug("User is successfully navigated to PDP page with URL :: " + currentURL  );
		}
		else {
			logger.debug("User is not able to navigate to PDP instead navigated to URL :: " + currentURL  );
		}
	}*/
	
	@Then("^user should able to verify the shipping address$")
	public void user_should_able_to_verify_the_shipping_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//		shippingmethod.verifyShippingaddress();
		shippingmethod.Shippingaddress.click();
//		shippingmethod.verifyShippingaddress();
	}
	
	@Then("^user should able to verify the shipping method$")
	public void user_should_able_to_verify_the_shipping_method() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//		shippingmethod.verifyShippingmethod();
//			shippingmethod.verifyShippingmethod();
//			waitForElement(shippingmethod.Shippingmethod);
			assertTrue(isDisplayed(shippingmethod.Shippingmethod));
	}

	@Then("^user should able to click on Continue to Payment button$")
	public void user_should_able_to_click_on_Continue_to_Payment_button() throws Throwable {
		waitForElement(shippingmethod.btncontinuepayment);
		isDisplayed(shippingmethod.btncontinuepayment);
		assertTrue(clickOnButton(shippingmethod.btncontinuepayment));
		}
	
	
	
	
}
