package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertTrue;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CHECKOUT_KER_3166_Web_SD extends CommonActionHelper {

	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);

	@When("^user clicks on Add Promo code link under Cart Order Summary$")
	public void user_clicks_on_Add_Promo_code_link_under_Cart_Order_Summary() throws Throwable {
		assertTrue(clickOnButton(r2SanityPo.AS_iconPlusPromoCode));
	}

	@Then("^Promo code field is exposed$")
	public void promo_code_field_is_exposed() throws Throwable {
		assertTrue(isDisplayed(r2SanityPo.AS_inputPromoCode));
		Thread.sleep(1000);
	}

}
