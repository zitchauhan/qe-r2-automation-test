package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_ReskinPO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K2915_SD extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R2_CheckOut_PO.class);
	R2_CheckOut_PO r2CheckoutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	R1_ReskinPO reskinPO = PageFactory.initElements(driver, R1_ReskinPO.class);
	public String checkout;
	
	@Then("^user fill the PO box in shipping address$")
	public void user_fill_the_PO_box_in_shipping_address_and_verify_error_message() throws Throwable {
		setInputText(r2CheckoutPo.inputCheckoutFirstName, webPropHelper.getTestDataProperty("FirstName"));
		setInputText(r2CheckoutPo.inputCheckoutLasttName, webPropHelper.getTestDataProperty("LastName"));
		setInputText(r2CheckoutPo.inputCheckoutPhoneNumber, webPropHelper.getTestDataProperty("PhoneNumber"));
		setInputText(r2CheckoutPo.inputCheckoutAddress, webPropHelper.getTestDataProperty("PO_ADDRESS"));
		setInputText(r2CheckoutPo.inputCheckoutZipCode, webPropHelper.getTestDataProperty("PO_ZIPCODE"));
		assertTrue(clickOnButton(r2CheckoutPo.btnGoToShippingMethod));
	}

	
	@And("^user check order confirmation status in order summary page$")
	public void user_check_order_confirmation_status_in_order_summary_page() throws Throwable {
		assertTrue(clickOnButton(r2CheckoutPo.txtOrderSuccesfullStatus));
		String orderID = r2CheckoutPo.txtOrderID.getText();
		logger.debug("Order Id on order confirmation status" + orderID);
	}
	
	
}
