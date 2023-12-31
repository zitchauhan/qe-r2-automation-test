package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K2926_SD extends CommonActionHelper {

	R2_CheckOut_PO r2CheckoutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);

	// CR-RKA 10Oct
	@Then("^user clicks on Edit My cart in Order Summary$")
	public void user_clicks_on_Edit_My_cart_in_Order_Summary() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			if (isDisplayed(r2CheckoutPo.itemExpand_icon_M)) {
				assertTrue(clickOnButton(r2CheckoutPo.itemExpand_icon_M));
			}
			// assertTrue(clickOnButton(r2CheckoutPo.EditCart_btn_M));
			assertTrue(clickOnButton(r2CheckoutPo.btnEditCart_m));
		} else {
			assertTrue(clickOnButton(r2CheckoutPo.btnEditCart));
		}
	}

	// CR-RKA 10Oct
	@Then("^user clicks on items$")
	public void user_clicks_on_items() throws Throwable {
		if (isDisplayed(r2CheckoutPo.itemExpand_icon_M)) {
			assertTrue(clickOnButton(r2CheckoutPo.itemExpand_icon_M));
		}
	}

	// @Then("^Remove items from the cart$")
	// public void remove_items_from_the_cart() throws Throwable {
	// assertTrue(clickOnButton(r2CartPo.btnRemoveCart));
	//
	// }

	// @Then("^verify the item is removed$")
	// public void verify_the_item_is_removed() throws Throwable {
	// assertTrue(isDisplayed(r2CartPo.cartEmptyTxt));//cartEmptyMsg
	// }

	@Then("^user remove the product form your cart$")
	public void user_remove_the_product_form_your_cart() throws Throwable {
		r2CartPo.emptyCart();
	}

}
