package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
//import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_OrderConfirmation_Po;

import cucumber.api.java.en.Given;

public class R2_CHECKOUT_K4062_SD extends CommonActionHelper {
	R2_OrderConfirmation_Po r2OrderConfPO = PageFactory.initElements(driver, R2_OrderConfirmation_Po.class);
	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_CHECKOUT_K3132_SD r2_CheckOut_k3132_SD = new R2_CHECKOUT_K3132_SD();

	@Given("^user adds shipment address on checkout page$")
	public void user_adds_shipment_address_on_checkout_page() throws Throwable {
		setInputText(r2CheckOutPo.inputCheckoutFirstName, webPropHelper.getTestDataProperty("FirstName"));
		setInputText(r2CheckOutPo.inputCheckoutLasttName, webPropHelper.getTestDataProperty("LastName"));
		setInputText(r2CheckOutPo.inputCheckoutPhoneNumber, webPropHelper.getTestDataProperty("PhoneNumber"));
		setInputText(r2CheckOutPo.inputCheckoutAddress, webPropHelper.getTestDataProperty("Address"));
		setInputText(r2CheckOutPo.inputCheckoutZipCode, webPropHelper.getTestDataProperty("zipcode"));
		assertTrue(clickOnButton(r2CheckOutPo.btnGoToShippingMethod));
	}

	@Given("^user selects shipment method on check out page$")
	public void user_selects_shipment_method_on_check_out_page() throws Throwable {
		if (isDisplayed(r2CheckOutPo.checkout_ShippingMethod_GoToPayment_btn)) {
			assertTrue(clickOnButton(r2CheckOutPo.checkout_ShippingMethod_GoToPayment_btn));
		}
	}

	@Given("^user add \"(.*?)\" details in payment method$")
	public void user_add_details_in_payment_method(String arg1) throws Throwable {
		if (arg1.equalsIgnoreCase("credit card")) {
			r2_CheckOut_k3132_SD.user_fill_the_payment_details();
		} else if (arg1.equalsIgnoreCase("gift card")) {
			waitForElement(r2CheckOutPo.plusIconGiftCard);
			assertTrue(clickOnButton(r2CheckOutPo.plusIconGiftCard));
			setInputText(r2CheckOutPo.inputGiftcardNumber,
					webPropHelper.getTestDataProperty("Valid16DigitGiftCardNumber"));
			setInputText(r2CheckOutPo.inputPinNumber, webPropHelper.getTestDataProperty("Valid8DigitGiftCardPIN"));
			waitForElement(r2CheckOutPo.btnCheckoutApply);
			assertTrue(clickOnButton(r2CheckOutPo.btnCheckoutApply));
			setInputText(r2CheckOutPo.EmailAddressforOrderConfirmation_Input,
					webPropHelper.getTestDataProperty("EmailAddress"));
			assertTrue(clickOnButton(r2CheckOutPo.ReviewOrder_Btn));
			waitForElement(r2CheckOutPo.btnPlaceOrderPaymentPage);
			Thread.sleep(10000);

		}
	}

	@Given("^user clicks on create account on order confirmation page$")
	public void user_clicks_on_create_account_on_order_confirmation_page() throws Throwable {
		assertTrue(clickOnButton(r2OrderConfPO.orderConfirmation_CreateAcount_lnk));

	}

	@Given("^user enters \"(.*?)\" in first name field of sign up page$")
	public void user_enters_in_first_name_field_of_sign_up_page(String arg1) throws Throwable {
		setInputText(r2OrderConfPO.orderConfirmation_SignUp_FirstName_txt, webPropHelper.getTestDataProperty("arg1"));
	}

	@Given("^user clicks on sign up  button$")
	public void user_clicks_on_sign_up_button() throws Throwable {
		assertTrue(clickOnButton(r2OrderConfPO.orderConfirmation_SignUp_SignUp_btn));
	}

	@Given("^user enter \"(.*?)\" in create password field of sign up page$")
	public void user_enter_in_create_password_field_of_sign_up_page(String arg1) throws Throwable {
		String passwordToEnter = webPropHelper.getTestDataProperty(arg1);
		if (arg1.equalsIgnoreCase("PasswordLessThan8Charactes")) {
			passwordToEnter = "T@1uj0e";
		}
		setInputText(r2OrderConfPO.orderConfirmation_SignUp_CreatePassword_txt, passwordToEnter);
	}

}
