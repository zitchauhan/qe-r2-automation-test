package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.SIT_ShippingAddressPageObject;
import cucumber.api.java.en.Then;

public class SD_SIT_ShippingAddressPage extends CommonActionHelper{
	
	public SIT_ShippingAddressPageObject ShipAddPo= PageFactory.initElements(driver, SIT_ShippingAddressPageObject.class);
	
	
	@Then("^user should able to see shipping Address page$")
	public void user_should_able_to_see_shipping_Address_page() throws Throwable {
		ShipAddPo.verifyShippingAddressPage() ;
		
	}
	
	
	@Then("^user should be able verify the order summary details$")
	public void user_should_be_able_verify_the_order_summary_details() throws Throwable {
		ShipAddPo.verifyOrdersummarydetails() ;
	}
		
	@Then("^user click on continue to shipping method button$")
	public void user_click_on_continue_to_shipping_method_button() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		assertTrue(clickOnButton(ShipAddPo.btnContiuneToMethod));
		}
		
	

	

}
