package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
//import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_OrderConfirmation_Po;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.internal.assertion.PathFragmentEscaper;

public class R2_CHECKOUT_K4062_SD extends CommonActionHelper {
	R2_OrderConfirmation_Po r2OrderConfPO = PageFactory.initElements(driver, R2_OrderConfirmation_Po.class);
	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_CHECKOUT_K3132_SD r2_CheckOut_k3132_SD = new R2_CHECKOUT_K3132_SD();
	R2_R1_Fun_PO r2_r1_fun_po = PageFactory.initElements(driver, R2_R1_Fun_PO.class);

	@Given("^user adds shipment address on checkout page$")
	public void user_adds_shipment_address_on_checkout_page() throws Throwable {
		if (!(isDisplayed(r2CheckOutPo.btnEditShippingAddress))) {
			setInputText(r2CheckOutPo.inputCheckoutFirstName, webPropHelper.getTestDataProperty("FirstName"));
			setInputText(r2CheckOutPo.inputCheckoutLasttName, webPropHelper.getTestDataProperty("LastName"));
			setInputText(r2CheckOutPo.inputCheckoutPhoneNumber, webPropHelper.getTestDataProperty("PhoneNumber"));
			setInputText(r2CheckOutPo.inputCheckoutAddress, webPropHelper.getTestDataProperty("Address"));
			setInputText(r2CheckOutPo.inputCheckoutZipCode, webPropHelper.getTestDataProperty("zipcode"));
			assertTrue(clickOnButton(r2CheckOutPo.btnGoToShippingMethod));
		}

	}

	@Given("^user selects shipment method on check out page$")
	public void user_selects_shipment_method_on_check_out_page() throws Throwable {
		if (isDisplayed(r2CheckOutPo.checkout_ShippingMethod_GoToPayment_btn)) {
			assertTrue(clickOnButton(r2CheckOutPo.checkout_ShippingMethod_GoToPayment_btn));
		}
	}

	@Given("^user add \"(.*?)\" details in payment method$")
	public void user_add_details_in_payment_method(String arg1) throws Throwable {
		if (isDisplayed(r2CheckOutPo.EditPayment_Link)) {
			clickOnButton(r2CheckOutPo.EditPayment_Link);
		} else if (isDisplayed(r2CheckOutPo.btnRemoveGiftCard)) {
			clickOnButton(r2CheckOutPo.btnRemoveGiftCard);
			waitForElement(r2CheckOutPo.plusIconGiftCard);
		}

		if (arg1.toLowerCase().contains(("credit card"))) {
			String creditCardNumber;
			String cvv = "CVV";
			//// Credit card to be picked
			if (arg1.toLowerCase().contains(("visa")))
				creditCardNumber = "CardVISA";
			else if (arg1.toLowerCase().contains(("master")))
				creditCardNumber = "CardMaster";
			else if (arg1.toLowerCase().contains(("amex"))) {
				creditCardNumber = "CardAmex";
				cvv = "FourDigitCVV";
			} else if (arg1.toLowerCase().contains(("discover")))
				creditCardNumber = "CardDiscover";
			else
				creditCardNumber = "CreditCardNumber";

			// waitForElement(r2CheckOutPo.CreditCardNumber_Input);
			if (!(isDisplayed(r2CheckOutPo.chooseCreditcard_Dd))) {
				setInputText(r2CheckOutPo.CreditCardNumber_Input, webPropHelper.getTestDataProperty(creditCardNumber));
				setInputText(r2CheckOutPo.txtExpirationDateInput, webPropHelper.getTestDataProperty("ExpDate"));
				setInputText(r2CheckOutPo.Cvv_Input, webPropHelper.getTestDataProperty(cvv));
				setInputText(r2CheckOutPo.EmailAddressforOrderConfirmation_Input,
						webPropHelper.getTestDataProperty("EmailAddress"));
			}
			// if (isDisplayed(r2CheckOutPo.ReviewOrder_Btn)) {
			assertTrue(clickOnButton(r2CheckOutPo.ReviewOrder_Btn));
			// waitForElement(r2CheckOutPo.btnPlaceOrderPaymentPage);
			Thread.sleep(5000);
			// }

			// r2_CheckOut_k3132_SD.user_fill_the_payment_details();
		} else if (arg1.equalsIgnoreCase("gift card")) {
			// if (!(isDisplayed(r2CheckOutPo.txtGiftCardAppliedSuccessMessage))) {
			waitForElement(r2CheckOutPo.plusIconGiftCard);
			assertTrue(clickOnButton(r2CheckOutPo.plusIconGiftCard));
			setInputText(r2CheckOutPo.inputGiftcardNumber,
					webPropHelper.getTestDataProperty("Valid16DigitGiftCardNumber"));
			setInputText(r2CheckOutPo.inputPinNumber, webPropHelper.getTestDataProperty("Valid8DigitGiftCardPIN"));
			waitForElement(r2CheckOutPo.btnCheckoutApply);
			assertTrue(clickOnButton(r2CheckOutPo.btnCheckoutApply));
			waitForElement(r2CheckOutPo.txtGiftCardAppliedSuccessMessage);
			setInputText(r2CheckOutPo.EmailAddressforOrderConfirmation_Input,
					webPropHelper.getTestDataProperty("EmailAddress"));
			assertTrue(clickOnButton(r2CheckOutPo.ReviewOrder_Btn));
			// waitForElement(r2CheckOutPo.btnPlaceOrderPaymentPage);
			Thread.sleep(5000);
			// }

		} else if (arg1.equalsIgnoreCase("PayPal")) {
			clickOnButton(r2CheckOutPo.PayPal_radioBtn);
			Thread.sleep(2000);
			driver.switchTo().frame(r2_r1_fun_po.paypalCheckoutFrame);
			assertTrue(clickOnButton(r2CheckOutPo.PayPalCheckOut_Btn));
			Thread.sleep(20000);
			System.out.println("111");
			Set<String> set = driver.getWindowHandles();
			Iterator<String> it = set.iterator();
			String parentWindow = it.next();
			String childWindow = it.next();
			// System.out.println("222");
			driver.switchTo().window(childWindow);
			waitForPageLoad(driver);

			if (isDisplayed(r2CheckOutPo.PaypalClose_icon))
				assertTrue(clickOnButton(r2CheckOutPo.PaypalClose_icon));
			assertTrue(clickOnButton(r2CheckOutPo.PaypalScreenLogin_Btn));
			waitForElement(r2CheckOutPo.PaypalEmail_Input);
			assertTrue(clickOnButton(r2CheckOutPo.PaypalEmail_Input));
			setInputText(r2CheckOutPo.PaypalEmail_Input, webPropHelper.getTestDataProperty("PayPalEmail"));
			assertTrue(clickOnButton(r2CheckOutPo.PaypalNext_Btn));
			setInputText(r2CheckOutPo.PaypalPassWord_Input, webPropHelper.getTestDataProperty("PayPalPassword"));
			assertTrue(clickOnButton(r2CheckOutPo.PaypalLogin_Btn));
			assertTrue(clickOnButton(r2CheckOutPo.PayPalContinue_Btn));
			driver.switchTo().window(parentWindow);
			// waitForElement(r2CheckOutPo.btnPlaceOrderPaymentPage);
		}
		waitForElement(r2CheckOutPo.btnPlaceOrderPaymentPage);
	}

	@Given("^user clicks on create account on order confirmation page$")
	public void user_clicks_on_create_account_on_order_confirmation_page() throws Throwable {
		assertTrue(clickOnButton(r2OrderConfPO.orderConfirmation_CreateAcount_lnk));

	}

	@Given("^user enters \"(.*?)\" in first name field of sign up page$")
	public void user_enters_in_first_name_field_of_sign_up_page(String arg1) throws Throwable {
		setInputText(r2OrderConfPO.orderConfirmation_SignUp_FirstName_txt, webPropHelper.getTestDataProperty(arg1));
	}

	@And("^user clicks on sign up  button of sign up page$")
	public void user_clicks_on_sign_up_button_of_sign_up_page() throws Throwable {
		assertTrue(clickOnButton(r2OrderConfPO.orderConfirmation_SignUp_SignUp_btn));
	}

	@Given("^user enter \"(.*?)\" in create password field of sign up page$")
	public void user_enter_in_create_password_field_of_sign_up_page(String arg1) throws Throwable {
		String passwordToEnter = webPropHelper.getTestDataProperty(arg1);
		if (arg1.equalsIgnoreCase("PasswordLessThan8Charactes")) {
			passwordToEnter = "T@1uj0e";
		} else if (arg1.equalsIgnoreCase("Invalid Password")) {
			passwordToEnter = "Tg0e";
		}

		setInputText(r2OrderConfPO.orderConfirmation_SignUp_CreatePassword_txt, passwordToEnter);
	}

	@Given("^user clicks on place order on checkout page$")
	public void user_able_to_see_the_button_place_order() throws Throwable {
		assertTrue(clickOnButton(r2CheckOutPo.btnPlaceOrderPaymentPage));
	}

	@Then("^verify user is able to successfully place the order$")
	public void user_is_able_to_place_the_order() throws Throwable {
		assertTrue(isDisplayed(r2OrderConfPO.orderConfirmation_ThanksForSubmittingOrder_txt));
	}

	@And("^user enter \"(.*?)\" in last name field of sign up page$")
	public void user_enter_in_last_name_field_of_sign_up_page(String arg1) throws Throwable {
		String lastNameToEnter = webPropHelper.getTestDataProperty(arg1);
		setInputText(r2OrderConfPO.orderConfirmation_SignUp_LastName_txt, lastNameToEnter);
	}

	@And("^user enters \"(.*?)\" in email field of sign up page$")
	public void user_enters_in_email_field_of_sign_up_page(String arg1) throws Throwable {
		String emailToEnter = webPropHelper.getTestDataProperty(arg1);
		if (arg1.equalsIgnoreCase("Random Email")) {
			UUID uuid = UUID.randomUUID();
			String randomUUIDString = uuid.toString();
			emailToEnter = "a" + randomUUIDString.replaceAll("-", "").substring(1, 15) + "@deleteme.com";
		}
		setInputText(r2OrderConfPO.orderConfirmation_SignUp_EmailAddress_txt, emailToEnter);
	}

	@Then("^user verifies the fields loaded Full name, email address, choose password, submit button and check box for email News letters$")
	public void user_verifies_the_fields_loaded_Full_name_email_address_choose_password_submit_button_and_check_box_for_email_News_letters()
			throws Throwable {
		assertTrue(isDisplayed(r2OrderConfPO.orderConfirmation_FullName_txt));
		assertTrue(isDisplayed(r2OrderConfPO.orderConfirmation_EmailAddress_txt));
		assertTrue(isDisplayed(r2OrderConfPO.orderConfirmation_ChoosePassword_txt));
		assertTrue(isDisplayed(r2OrderConfPO.orderConfirmation_SigUpToGetHotDeals_checkbox));
	}

}
