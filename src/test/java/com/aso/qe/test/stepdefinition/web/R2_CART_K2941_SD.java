package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R2_CART_K2941_SD extends CommonActionHelper {
	
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);

	@Then("^verify the discounts to specific items are displayed at the item level \\(Free Shipping, BOGO, Gift With Purchase\\)$")
	public void verify_the_discounts_to_specific_items_are_displayed_at_the_item_level_Free_Shipping_BOGO_Gift_With_Purchase()
			throws Throwable {

	}
	
	@And("^user verify the promo code field$")
	public void user_verify_the_promo_code_field() throws Throwable {
		assertTrue(isDisplayed(r2SanityPo.AS_txtAddPromoCode));
		assertTrue(clickOnButton(r2SanityPo.AS_iconPlusPromoCode));
		assertTrue(isDisplayed(r2SanityPo.AS_inputPromo));
	}
	
	
	@And("^user click on Hide promo code field$")
	public void user_click_on_Hide_promo_code_field() throws Throwable {
		assertTrue(clickOnButton(r2SanityPo.AS_iconMinusPromoCode));
		assertFalse(isDisplayed(r2SanityPo.AS_inputPromo));
	}
	
	
	@And("^again try to apply Promocode \"(.*?)\"$")
	public void again_try_to_apply_Promocode(String arg1) throws Throwable {
		//assertFalse(isDisplayed(r2SanityPo.AS_txtAddPromoCode));
		assertFalse(clickOnButton(r2SanityPo.AS_iconPlusPromoCode));
		//setInputText(r2SanityPo.AS_inputPromoCode, webPropHelper.getTestDataProperty(arg1));
		//assertFalse(clickOnButton(r2SanityPo.AS_btnCartSubmit));
	    
	}
	
}
