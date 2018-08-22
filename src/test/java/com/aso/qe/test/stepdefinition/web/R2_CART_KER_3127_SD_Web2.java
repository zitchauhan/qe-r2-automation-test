package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R2_CART_KER_3127_SD_Web2 extends CommonActionHelper {

	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);

	@And("^User verifies and click the shipping policy link$")
	public void user_verifies_and_click_the_shipping_policy_link() throws Throwable {
		scrollPageToWebElement(r2CartPo.lnkShippingPolicy);
		assertTrue(clickOnButton(r2CartPo.lnkShippingPolicy));
	}

	@Then("^User is navigated to Shipping Charges page$")
	public void user_is_navigated_to_Shipping_Charges_page() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtShippingCharges));
	}

	@And("^User verifies and click the Return policy link$")
	public void user_verifies_and_click_the_Return_policy_link() throws Throwable {
		scrollPageToWebElement(r2CartPo.lnkReturnPolicy);
		assertTrue(clickOnButton(r2CartPo.lnkReturnPolicy));
	}

	@Then("^User is navigated to Return Policy page$")
	public void user_is_navigated_to_Return_Policy_page() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtReturnPolicy));
	}

}
