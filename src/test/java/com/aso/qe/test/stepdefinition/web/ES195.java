


package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;

import cucumber.api.java.en.Then;

public class ES195 extends CommonActionHelper{
	R2_Cart_PO r2CartPo = PageFactory.initElements(getDriver(), R2_Cart_PO.class);
	
@Then("^Verify paypal button should not be displayed on Cart Page$")
public void verify_paypal_button_should_not_be_displayed_on_Cart_Page() throws Throwable {
	if(isDisplayed(r2CartPo.btnCartPaypal)){
		Assert.fail();
		
	}
	else {
		System.out.println("Paypal button not displayed");
	}
}
}