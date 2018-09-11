package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K6576_SD extends CommonActionHelper {
	
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	R2_CheckOut_PO r2CheckoutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	
	@Then("^user click on Privacy Policy link in checkout page$")
	public void user_click_on_Privacy_Policy_link_in_checkout_page() throws Throwable {
	   assertTrue(clickOnButton(r2CheckoutPo.checkoutFooterLegalLinkPrivacyPolicy));
	  
	}

	@Then("^user click on Terms and Conditions link in checkout page$")
	public void user_click_on_Terms_and_Conditions_link_in_checkout_page() throws Throwable {
		assertTrue(clickOnButton(r2CheckoutPo.checkoutFooterLegalLinkTermsConditions)) ;
	}

	@Then("^user click on Prop link in checkout page$")
	public void user_click_on_Prop_link_in_checkout_page() throws Throwable {
		assertTrue(clickOnButton(r2CheckoutPo.checkoutFooterLegalLinkCaliforniaProposition65)) ; 
	}

	@Then("^user click on Chat modal link in checkout page$")
	public void user_click_on_Chat_modal_link_in_checkout_page() throws Throwable {
		assertTrue(clickOnButton(r2CheckoutPo.checkoutFooterChatNowLink));
	}
}
