package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K7031_SD extends CommonActionHelper {

	R2_CheckOut_PO r2CheckoutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);

	@Then("^user should not be allowed to view shipping method drawer if only SOF items are in the cart$")
	public void user_should_not_be_allowed_to_view_shipping_method_drawer_if_only_SOF_items_are_in_the_cart()
			throws Throwable {

		assertFalse(isDisplayed(r2CheckoutPo.checkout_ShippingMethod_ShippingMethodHeader_txt));

	}

	@Then("^user selects a store with ZIP \"(.*?)\"$")
	public void user_selects_a_store_with_ZIP(String arg1) throws Throwable {
		r2CartPo.selectStore(webPropHelper.getTestDataProperty(arg1));
	}
}
