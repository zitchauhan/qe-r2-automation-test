package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
//import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;
//

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_OrderConfirmation_Po;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.internal.assertion.PathFragmentEscaper;

public class R2_CHECKOUT_K4062_SD extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R2_CheckOut_PO.class);
	R2_OrderConfirmation_Po r2OrderConfPO = PageFactory.initElements(driver, R2_OrderConfirmation_Po.class);
	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	// R2_CHECKOUT_K3132_SD r2_CheckOut_k3132_SD = new R2_CHECKOUT_K3132_SD();
	R2_R1_Fun_PO r2_r1_fun_po = PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R2_MyAccount_PO r2MyAccountPO = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	Hooks hooks = new Hooks();
	String orderID=" ";
	
	@And("^user adds shipment address on checkout page for \"(.*?)\" user$")
	public void user_adds_shipment_address_on_checkout_page_for_user(String arg1) throws Throwable {
		boolean userWithoutExistingShippingAddress = false;
		if (arg1.equalsIgnoreCase("newly registered") | arg1.equalsIgnoreCase("guest")
				| arg1.equalsIgnoreCase("unauthenticated"))
			userWithoutExistingShippingAddress = true;
		if (!(userWithoutExistingShippingAddress)) {
			if (!(isDisplayed(r2CheckOutPo.btnEditShippingAddress)))
				userWithoutExistingShippingAddress = true;
		}
		if (userWithoutExistingShippingAddress) {
			setInputText(r2CheckOutPo.inputCheckoutFirstName, webPropHelper.getTestDataProperty("FirstName"));
			setInputText(r2CheckOutPo.inputCheckoutLasttName, webPropHelper.getTestDataProperty("LastName"));
			setInputText(r2CheckOutPo.inputCheckoutPhoneNumber, r2MyAccountPO.generateRandomMobileNumber());
			setInputText(r2CheckOutPo.inputCheckoutAddress, webPropHelper.getTestDataProperty("Address"));
			setInputText(r2CheckOutPo.inputCheckoutZipCode, webPropHelper.getTestDataProperty("zipcode"));
			assertTrue(clickOnButton(r2CheckOutPo.btnGoToShippingMethod));
		}
	}

	@And("^user selects shipment method on check out page for \"(.*?)\" user$")
	public void user_selects_shipment_method_on_check_out_page_for_user(String arg1) throws Throwable {
		boolean userWithoutExistingShippingMethod = false;
		if (arg1.equalsIgnoreCase("newly registered") | arg1.equalsIgnoreCase("guest")
				| arg1.equalsIgnoreCase("unauthenticated"))
			userWithoutExistingShippingMethod = true;

		if (!(userWithoutExistingShippingMethod)) {
			if (isDisplayed(r2CheckOutPo.checkout_ShippingMethod_GoToPayment_btn)) {
				userWithoutExistingShippingMethod = true;
			}
		}

		if (userWithoutExistingShippingMethod)
			assertTrue(clickOnButton(r2CheckOutPo.checkout_ShippingMethod_GoToPayment_btn));
	}

	////// Implemented only for guest, and newly registered user
	@And("^user add \"(.*?)\" details in payment method for \"(.*?)\" user$")
	public void user_add_details_in_payment_method_for_user(String arg1, String arg2) throws Throwable {
		boolean userWithoutExistingPaymentDetails = false;
		if (arg2.equalsIgnoreCase("newly registered") | arg2.equalsIgnoreCase("guest")
				| arg2.equalsIgnoreCase("unauthenticated"))
			userWithoutExistingPaymentDetails = true;

		if (!(userWithoutExistingPaymentDetails)) {
			if (isDisplayed(r2CheckOutPo.EditPayment_Link)) {
				clickOnButton(r2CheckOutPo.EditPayment_Link);
			}
			if (isDisplayed(r2CheckOutPo.btnRemoveGiftCard)) {
				clickOnButton(r2CheckOutPo.btnRemoveGiftCard);
			}
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

			boolean chooseCreditCard = false;
			if (!(userWithoutExistingPaymentDetails)) {
				if (!(isDisplayed(r2CheckOutPo.chooseCreditcard_Dd)))
					chooseCreditCard = true;
			}

			if (chooseCreditCard | userWithoutExistingPaymentDetails) {
				setInputText(r2CheckOutPo.CreditCardNumber_Input, webPropHelper.getTestDataProperty(creditCardNumber));
				setInputText(r2CheckOutPo.txtExpirationDateInput, webPropHelper.getTestDataProperty("ExpDate"));
				setInputText(r2CheckOutPo.Cvv_Input, webPropHelper.getTestDataProperty(cvv));
				if (arg2.equalsIgnoreCase("guest") | arg2.equalsIgnoreCase("unauthenticated")) {
					setInputText(r2CheckOutPo.EmailAddressforOrderConfirmation_Input,
							r2MyAccountPO.generateRandomEmailId());
				}

				assertTrue(clickOnButton(r2CheckOutPo.ReviewOrder_Btn));
			}
			if (!(userWithoutExistingPaymentDetails)) {
				if (isDisplayed(r2CheckOutPo.ReviewOrder_Btn))
					assertTrue(clickOnButton(r2CheckOutPo.ReviewOrder_Btn));
			}
			Thread.sleep(Constants.thread_medium);

		} else if (arg1.equalsIgnoreCase("gift card")) {
			boolean chooseGiftCard = true;
			if (!(userWithoutExistingPaymentDetails)) {
				if (isDisplayed(r2CheckOutPo.plusIconGiftCard)) {
					assertTrue(clickOnButton(r2CheckOutPo.plusIconGiftCard));
					if (isDisplayed((r2CheckOutPo.inputGiftcardNumber))) {
						setInputText(r2CheckOutPo.inputGiftcardNumber,
								webPropHelper.getTestDataProperty("GiftCardNumberForOrderPlacement"));

					} else if (isDisplayed(r2CheckOutPo.btnCheckoutApply)) {
						chooseGiftCard = false;
						clickOnButton(r2CheckOutPo.btnCheckoutApply);

					}
				}
			} else {
				assertTrue(clickOnButton(r2CheckOutPo.plusIconGiftCard));
				setInputText(r2CheckOutPo.inputGiftcardNumber,
						webPropHelper.getTestDataProperty("GiftCardNumberForOrderPlacement"));
			}

			if (chooseGiftCard) {
				setInputText(r2CheckOutPo.inputPinNumber, webPropHelper.getTestDataProperty("GiftCardPinForOrderPlacement"));
				waitForElement(r2CheckOutPo.btnCheckoutApply);
				assertTrue(clickOnButton(r2CheckOutPo.btnCheckoutApply));
				waitForElement(r2CheckOutPo.txtGiftCardAppliedSuccessMessage);
				if (arg2.equalsIgnoreCase("guest") | arg2.equalsIgnoreCase("unauthenticated")) {
					setInputText(r2CheckOutPo.EmailAddressforOrderConfirmation_Input,
							r2MyAccountPO.generateRandomEmailId());
				}
			}

			Thread.sleep(Constants.thread_medium);
			if (isDisplayed(r2CheckOutPo.ReviewOrder_Btn)) {
				assertTrue(clickOnButton(r2CheckOutPo.ReviewOrder_Btn));
			}

		} else if (arg1.equalsIgnoreCase("PayPal")) {
			clickOnButton(r2CheckOutPo.PayPal_radioBtn);
			Thread.sleep(Constants.thread_low);
			driver.switchTo().frame(r2_r1_fun_po.paypalCheckoutFrame);
			assertTrue(clickOnButton(r2CheckOutPo.PayPalCheckOut_Btn));
			Thread.sleep(Constants.thread_highest);
			Set<String> set = driver.getWindowHandles();
			Iterator<String> it = set.iterator();
			String parentWindow = it.next();
			String childWindow = it.next();
			driver.switchTo().window(childWindow);
			waitForPageLoad(driver);

			if (isDisplayed(r2CheckOutPo.PaypalClose_icon))
				assertTrue(clickOnButton(r2CheckOutPo.PaypalClose_icon));
			assertTrue(clickOnButton(r2CheckOutPo.PaypalScreenLogin_Btn));
			waitForElement(r2CheckOutPo.PaypalEmail_Input);
			assertTrue(clickOnButton(r2CheckOutPo.PaypalEmail_Input));
			setInputText(r2CheckOutPo.PaypalEmail_Input, webPropHelper.getTestDataProperty("PayPalEmail"));
			assertTrue(clickOnButton(r2CheckOutPo.PaypalNext_Btn));
			waitForElement(r2CheckOutPo.PaypalPassWord_Input);
			setInputText(r2CheckOutPo.PaypalPassWord_Input, webPropHelper.getTestDataProperty("PayPalPassword"));
			assertTrue(clickOnButton(r2CheckOutPo.PaypalLogin_Btn));
			waitForPageLoad(driver);
			assertTrue(clickOnButton(r2CheckOutPo.PayPalContinue_Btn));
			driver.switchTo().window(parentWindow);
		}
		waitForElement(r2CheckOutPo.btnPlaceOrderPaymentPage);
	}

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
						r2MyAccountPO.generateRandomEmailId());
			}
			// if (isDisplayed(r2CheckOutPo.ReviewOrder_Btn)) {
			assertTrue(clickOnButton(r2CheckOutPo.ReviewOrder_Btn));
			// waitForElement(r2CheckOutPo.btnPlaceOrderPaymentPage);
			Thread.sleep(Constants.thread_medium);
			// }

			// r2_CheckOut_k3132_SD.user_fill_the_payment_details();
		} else if (arg1.equalsIgnoreCase("gift card")) {
			// if (!(isDisplayed(r2CheckOutPo.txtGiftCardAppliedSuccessMessage))) {
			waitForElement(r2CheckOutPo.plusIconGiftCard);
			assertTrue(clickOnButton(r2CheckOutPo.plusIconGiftCard));
			setInputText(r2CheckOutPo.inputGiftcardNumber,
					webPropHelper.getTestDataProperty("GiftCardNumberForOrderPlacement"));
			setInputText(r2CheckOutPo.inputPinNumber, webPropHelper.getTestDataProperty("GiftCardPinForOrderPlacement"));
			waitForElement(r2CheckOutPo.btnCheckoutApply);
			assertTrue(clickOnButton(r2CheckOutPo.btnCheckoutApply));
			waitForElement(r2CheckOutPo.txtGiftCardAppliedSuccessMessage);
			setInputText(r2CheckOutPo.EmailAddressforOrderConfirmation_Input, r2MyAccountPO.generateRandomEmailId());
			assertTrue(clickOnButton(r2CheckOutPo.ReviewOrder_Btn));
			// waitForElement(r2CheckOutPo.btnPlaceOrderPaymentPage);
			Thread.sleep(Constants.thread_medium);
			// }

		} else if (arg1.equalsIgnoreCase("PayPal")) {
			clickOnButton(r2CheckOutPo.PayPal_radioBtn);
			Thread.sleep(Constants.thread_low);
			driver.switchTo().frame(r2_r1_fun_po.paypalCheckoutFrame);
			assertTrue(clickOnButton(r2CheckOutPo.PayPalCheckOut_Btn));
			Thread.sleep(Constants.thread_highest);
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

	@And("^user clicks on sign up button of sign up page$")
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
		if (isDisplayed(r2OrderConfPO.orderConfirmation_ThanksForSubmittingOrder_txt)) {
			hooks.embedScreenshotForPassScenario();
		}
		assertTrue(isDisplayed(r2OrderConfPO.orderConfirmation_ThanksForSubmittingOrder_txt));
		orderID = r2CheckOutPo.txtOrderID.getText();
		logger.debug("Order Id on order confirmation status" + orderID);
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
			emailToEnter = r2MyAccountPO.generateRandomEmailId();
		}
		setInputText(r2OrderConfPO.orderConfirmation_SignUp_EmailAddress_txt, emailToEnter);
	}

	@Then("^user verifies the fields loaded Full name, email address, choose password, submit button and check box for email News letters$")
	public void user_verifies_the_fields_loaded_Full_name_email_address_choose_password_submit_button_and_check_box_for_email_News_letters()
			throws Throwable {
		assertTrue(isDisplayed(r2OrderConfPO.orderConfirmation_FullName_txt));
		assertTrue(isDisplayed(r2OrderConfPO.orderConfirmation_EmailAddress_txt));
		assertTrue(isDisplayed(r2OrderConfPO.orderConfirmation_ChoosePassword_txt));
		assertTrue(isDisplayed(r2OrderConfPO.orderConfirmation_NotifyMe_checkbox));
	}

	@When("^user enter \"(.*?)\" in password field of order confirmation page$")
	public void user_enter_in_password_field_of_order_confirmation_page(String arg1) throws Throwable {
		setInputText(r2OrderConfPO.orderConfirmation_ChoosePassword_txt, webPropHelper.getTestDataProperty(arg1));
	}

	@When("^user unchecks email news letter checkbox on order confirmation page$")
	public void user_unchecks_email_news_letter_checkbox_on_order_confirmation_page() throws Throwable {
		if (isSelected(r2OrderConfPO.orderConfirmation_NotifyMe_checkbox)) {
			clickOnButton(r2OrderConfPO.orderConfirmation_NotifyMe_checkbox);
		}
	}

	@When("^user clicks on submit button on order confirmation page$")
	public void user_clicks_on_submit_button_on_order_confirmation_page() throws Throwable {
		assertTrue(clickOnButton(r2OrderConfPO.orderConfirmation_Submit_btn));
	}

	@Then("^verify user is able to sign up successfully on order confirmation page$")
	public void verify_user_is_able_to_sign_up_successfully_on_order_confirmation_page() throws Throwable {
		assertTrue(isDisplayed(r2OrderConfPO.orderConfirmation_AccountCreatedMessage_txt));
	}
	
	
	@Then("user able to see the same order ID in My order section$")
	public void user_able_to_see_the_same_order_ID_in_My_order_section() throws Throwable{
		r2CheckOutPo.orderIDvalidationInMyAccount(orderID);
	}

	@Then("^user selects the gift card which is not exhausted$")
	public void user_selects_the_gift_card_which_is_not_exhausted() throws Throwable {
		r2CheckOutPo.validGiftCardSelection();
	}
}
