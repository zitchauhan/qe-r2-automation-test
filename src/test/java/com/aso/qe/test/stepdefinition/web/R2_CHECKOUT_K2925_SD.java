package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_ReskinPO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K2925_SD extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R2_CheckOut_PO.class);
	R2_CheckOut_PO r2CheckoutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	R1_ReskinPO reskinPO = PageFactory.initElements(driver, R1_ReskinPO.class);
	public String checkout;

	String orderID=" ";

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
		orderID = r2CheckoutPo.txtOrderID.getText();
		logger.debug("Order Id on order confirmation status" + orderID);
	}

	@Then("^user enters wrong card detail in payment section$")
	public void user_enters_wrong_card_detail_in_payment_section() throws Throwable{
		r2CheckoutPo.enterWrongCardDetails();

	}

	@And("^user clicks on the Terms and condition link and navigate to respective page$")
	public void user_clicks_on_the_Terms_and_condition_link_and_navigate_to_respective_page() throws Throwable{
		r2CheckoutPo.userNavigateToTermsCondition();
	}


	@And("user clicks on the Privacy policy link and navigate to respective page$")
	public void user_clicks_on_the_Privacy_policy_link_and_navigate_to_respective_page() throws Throwable{
		r2CheckoutPo.userNavigateToPrivacyPolicy();
	}

	@Then("user able to see the same order ID in My order section$")
	public void user_able_to_see_the_same_order_ID_in_My_order_section() throws Throwable{
		Boolean flag =false;
		System.out.println(orderID);
		flag =isDisplayed(driver.findElement(By.xpath("//*[contains(text(),'"+orderID+"')]")));
		assertTrue(flag);
	}

	@Then("^user modify the shipping address$")
	public void user_modify_the_shipping_address() throws Throwable{

		assertTrue(clickOnButton(r2CheckoutPo.Checkout_ShippingAddressAfterEdit_ShippingAddress_Dd));
		assertTrue(clickOnButton(r2CheckoutPo.Checkout_ShippingAddressAfterEdit_AddaNewShippingAddress));
	}
	
	@Then("^user validate the same updated shipping address in my orders page$")
	public void user_validate_the_same_updated_shipping_address_in_my_orders_page() throws Throwable {
		r2CheckoutPo.verifymodifiedShippingAddress();
	}
	
	@Then("^user selects different shipping method$")
	public void user_selects_different_shipping_method() throws Throwable{
		
		
	}
}
