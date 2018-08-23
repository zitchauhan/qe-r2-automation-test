package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class R2_CHECKOUT_KER_3167_Web_SD extends CommonActionHelper {

	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	R2_CheckOut_PO r2CheckOutPO = PageFactory.initElements(getDriver(), R2_CheckOut_PO.class);

	@Given("^user navigate to Cart page and changes the quantity to \"(.*?)\"$")
	public void user_navigate_to_Cart_page_and_changes_the_quantity_to(String quantity10) throws Throwable {
		Thread.sleep(2000);
		assertTrue(isDisplayed(r2SanityPo.AS_txtYourCart));
		clearInputBox(r2SanityPo.AS_inputQty);
		setInputText(r2SanityPo.AS_inputQty, webPropHelper.getTestDataProperty("quantity10"));
	}

	@Given("^click on mini cart$")
	public void click_on_mini_cart() throws Throwable {
		Thread.sleep(2000);
		assertTrue(clickOnButton(r2CheckOutPO.clickMiniCart));
		Thread.sleep(4000);
	}

	@Then("^discount is displayed in Order Summary$")
	public void discount_is_displayed_in_Order_Summary() throws Throwable {
		assertTrue(isDisplayed(r2CheckOutPO.discountAmt));
	}

	@Then("^User clicks on Remove Promo code link$")
	public void user_clicks_on_Remove_Promo_code_link() throws Throwable {
		assertTrue(isDisplayed(r2CheckOutPO.removeCpnBtn));
		assertTrue(clickOnButton(r2CheckOutPO.removeCpnBtn));
	}

	@Then("^Promo code is Removed$")
	public void promo_code_is_Removed() throws Throwable {
		assertFalse(isDisplayed(r2CheckOutPO.promotxt));
	}

	@Then("^user is displayed Promo code XXXXX applied$")
	public void user_is_displayed_Promo_code_XXXXX_applied() throws Throwable {
		isDisplayed(r2CheckOutPO.promoAddedTxt);
	}
}
