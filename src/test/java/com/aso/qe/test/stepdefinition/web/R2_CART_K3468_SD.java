package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_Cart_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CART_K3468_SD extends CommonActionHelper {
	R2_Cart_PO r2_cart_po = PageFactory.initElements(driver, R2_Cart_PO.class);
	
	
	@Then("^user verify the outofstock modal should appear$")
	public void user_verify_the_outofstock_modal_should_appear() {
		assertTrue(isDisplayed(r2_cart_po.outOfStockModal));
	}
	
	
	@And("^user click on close button in outofstock modal$")
	public void user_click_on_close_button_in_outofstock_modal() {
		assertTrue(clickOnButton(r2_cart_po.outOfStockModalCloseButton));
	}
	
	@And("^user clicks on mini cart Icon$")
	public void user_clicks_on_mini_cart_Icon() {
		assertTrue(clickOnButton(r2_cart_po.clickCartIconFromGlobalHeader));
	}
	
	@And("^user click outside the outofstock modal$")
	public void user_click_outside_the_outofstock_modal() throws InterruptedException {
		assertTrue(clickOnButton(r2_cart_po.clickCartIconFromGlobalHeader));
		System.err.println("clickDone");
		Thread.sleep(3000);
	}
	
	@And("^user verify the outofstock modal should not appear$")
	public void user_verify_the_outofstock_modal_should_not_appear() throws InterruptedException {
		Thread.sleep(200);
		assertTrue(!isDisplayed(r2_cart_po.outOfStockModal));
	}

	@And("^user will see the store error message \"(.*?)\"$")
	public void user_will_see_the_store_error_message(String message) {
		assertTrue(isDisplayed(r2_cart_po.bopisStoreNotSelectedErrorMessage));
		String errorMessage = r2_cart_po.messageFlyout.getText();
		System.err.println(" errorMessage " + errorMessage + " message " + webPropHelper.getTestDataProperty(message));
		assertEquals(errorMessage, webPropHelper.getTestDataProperty(message));
	}

	@And("^user should be able to see out of stock error message \"(.*?)\"$")
	public void user_should_be_able_to_see_out_of_stock_error_message(String message) {
		assertTrue(isDisplayed(r2_cart_po.outOfStockMesssageCart));
		String errorMessage = r2_cart_po.outOfStockMesssageCart.getText();
		System.err.println(" errorMessage " + errorMessage + " message " + webPropHelper.getTestDataProperty(message));
		assertEquals(errorMessage, webPropHelper.getTestDataProperty(message));
	}

}
