package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
//import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;
//

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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
	R2_CheckOut_PO r2CheckoutPoN = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	Hooks hooks = new Hooks();
	String orderID = " ";

	@And("^user adds shipment address on checkout page for \"(.*?)\" user$")
	public void user_adds_shipment_address_on_checkout_page_for_user(String arg1) throws Throwable {
		boolean userWithoutExistingShippingAddress = false;
		if (arg1.equalsIgnoreCase("newly registered") | arg1.equalsIgnoreCase("guest")
				| arg1.equalsIgnoreCase("unauthenticated"))
			userWithoutExistingShippingAddress = true;
//		if (!(userWithoutExistingShippingAddress)) {
//			if (!(isDisplayed(r2CheckOutPo.btnEditShippingAddress)))
//				userWithoutExistingShippingAddress = true;
//		}
		if (userWithoutExistingShippingAddress) {
			setInputText(r2CheckOutPo.inputCheckoutFirstName, webPropHelper.getTestDataProperty("FirstName"));
			setInputText(r2CheckOutPo.inputCheckoutLasttName, webPropHelper.getTestDataProperty("LastName"));
			setInputText(r2CheckOutPo.inputCheckoutPhoneNumber, r2MyAccountPO.generateRandomMobileNumber());
			setInputText(r2CheckOutPo.inputCheckoutAddress, webPropHelper.getTestDataProperty("Address"));
			Thread.sleep(Constants.thread_low);
			setInputText(r2CheckOutPo.inputCheckoutZipCode, webPropHelper.getTestDataProperty("Zipcode"));
			Thread.sleep(Constants.thread_low);
			//assertTrue(clickOnButton(r2CheckOutPo.btnGoToShippingMethod));
		}
		Thread.sleep(Constants.thread_medium);
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

	
	//guest user and different card types
	@Then("^user add \"([^\"]*)\" details for a guest user$")
	public void user_add_details_for_a_guest_user(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String creditCardNumber="CardVISA";
		String cvv = "CVV";
		//// Credit card to be picked
		if (arg1.toLowerCase().contains(("visa")))
			creditCardNumber = "CardVISA";
		else if (arg1.toLowerCase().contains(("master")))
			creditCardNumber = "CardMaster";
		else if (arg1.toLowerCase().contains(("amex"))) 
		{
			creditCardNumber = "CardAmex";
			cvv = "FourDigitCVV";
		} else if (arg1.toLowerCase().contains(("discover")))
			creditCardNumber = "CardDiscover";
		//else
			//creditCardNumber = "CreditCardNumber";
		
//		setInputText(r2CheckOutPo.CreditCardNumber_Input, webPropHelper.getTestDataProperty(creditCardNumber));
//		setInputText(r2CheckOutPo.txtExpirationDateInput, webPropHelper.getTestDataProperty("ExpDate"));
//		setInputText(r2CheckOutPo.Cvv_Input, webPropHelper.getTestDataProperty(cvv));
		Thread.sleep(5000);
		String name = webPropHelper.getTestDataProperty("CardholderName");
		driver.switchTo().frame("first-data-payment-field-name");
		setInputText(r2CheckOutPo.CardholderName_Input, name);
		System.out.println("CardHoldername="+webPropHelper.getTestDataProperty("CardholderName"));
		driver.switchTo().defaultContent();
		driver.switchTo().frame("first-data-payment-field-card");
		setInputText(r2CheckOutPo.CreditCardDetails_Input, webPropHelper.getTestDataProperty(creditCardNumber));
		System.out.println("CardNumber="+webPropHelper.getTestDataProperty(creditCardNumber));
		driver.switchTo().defaultContent();
		driver.switchTo().frame("first-data-payment-field-exp");	
		setInputText(r2CheckOutPo.ExpDate_Input, webPropHelper.getTestDataProperty("ExpDate"));
		driver.switchTo().defaultContent();
		driver.switchTo().frame("first-data-payment-field-cvv");
		setInputText(r2CheckOutPo.PassCvv_Input, webPropHelper.getTestDataProperty(cvv));
		driver.switchTo().defaultContent();
		setInputText(r2CheckOutPo.EmailAddressforOrderConfirmation_Input,
				r2MyAccountPO.generateRandomEmailId());
		
		if (isDisplayed(r2CheckOutPo.ReviewOrder_Btn))
			assertTrue(clickOnButton(r2CheckOutPo.ReviewOrder_Btn));
	}


	
	////// Implemented only for guest unauthentic, and newly registered user
	@And("^user add \"(.*?)\" details in payment method for \"(.*?)\" user$")
	public void user_add_details_in_payment_method_for_user(String arg1, String arg2) throws Throwable {
		//System.out.println("In - And user add Payment Type details in payment method for guest user");
		boolean userWithoutExistingPaymentDetails = userWithoutStoredPaymentDetails(arg2);
		
		if (!(userWithoutExistingPaymentDetails)) {
			if (isDisplayed(r2CheckOutPo.EditPayment_Link)) {
				clickOnButton(r2CheckOutPo.EditPayment_Link);
			}
			if (isDisplayed(r2CheckOutPo.btnRemoveGiftCard)) {
				clickOnButton(r2CheckOutPo.btnRemoveGiftCard);
			}
		}
		if (arg1.toLowerCase().contains(("credit card"))) {
			//CreditCardModule(userWithoutExistingPaymentDetails,arg1, arg2);
			r2CheckOutPo.paymentViaCreditCard(userWithoutExistingPaymentDetails,arg1, arg2);
		}
		
		else if (arg1.equalsIgnoreCase("gift card")) {
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
				setInputText(r2CheckOutPo.inputPinNumber,
						webPropHelper.getTestDataProperty("GiftCardPinForOrderPlacement"));
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
			R2_CHECKOUT_K4039_SD PayPalMethodObject = new R2_CHECKOUT_K4039_SD();
			Thread.sleep(Constants.thread_medium);
			assertTrue(clickOnButton(r2CheckOutPo.PayPal_radioBtn));
		    waitForElement(r2CheckoutPoN.paypalButton);
			assertTrue(clickOnButton(r2CheckoutPoN.paypalButton));
			PayPalMethodObject.user_switch_to_iframe_and_enter_the_paypal_login("PayPalEmail", "PayPalPassword");
			PayPalMethodObject.user_clicks_on_ok_button_of_order_not_complete_modal();
		}
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
			setInputText(r2CheckOutPo.inputPinNumber,
					webPropHelper.getTestDataProperty("GiftCardPinForOrderPlacement"));
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

	@And("^user clicks on place order on checkout page$")
	public void user_able_to_see_the_button_place_order() throws Throwable {
		waitForElement(r2CheckOutPo.btnPlaceOrderPaymentPage);
		r2CheckOutPo.JS_Click(r2CheckOutPo.btnPlaceOrderPaymentPage);
		//assertTrue(clickOnButton(r2CheckOutPo.btnPlaceOrderPaymentPage));
	}
	
	@And("^User clicks on Place order and verifies error message$")
	public void user_able_to_place_order() throws Throwable {
		try {
			assertTrue(clickOnButton(r2CheckOutPo.btnPlaceOrderPaymentPage));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		//Added the code and locator here as there was a webdriver session issue if called from other class
		logger.info("Verify the error message displayed");
		if(driver.findElements(By.xpath("//p[contains(text(),'Ship and pickup not allowed on selected store, please update cart or change store')]")).size()>0) {
			
			logger.info("Error message displayed is: " +driver.findElement(By.xpath("//p[contains(text(),'Ship and pickup not allowed on selected store, please update cart or change store')]")).getText());
		}
		else {
			Assert.fail("Error mesasge is not displayed");
		}
		
	}

	@Then("^verify user is able to successfully place the order$")
	public void user_is_able_to_place_the_order() throws Throwable {
		if (isDisplayed(r2CheckOutPo.txtOrderID)) {
			hooks.embedScreenshotForPassScenario();
		}
		assertTrue(isDisplayed(r2CheckOutPo.txtOrderID));
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
		//Added as submit button needs to be clicked twice for mobile 
		if ("mobile".equalsIgnoreCase(testtype)) {
			if(isDisplayed(r2OrderConfPO.orderConfirmation_Submit_btn))
				assertTrue(clickOnButton(r2OrderConfPO.orderConfirmation_Submit_btn));
		}
	}

	@Then("^verify user is able to sign up successfully on order confirmation page$")
	public void verify_user_is_able_to_sign_up_successfully_on_order_confirmation_page() throws Throwable {
		assertTrue(isDisplayed(r2OrderConfPO.orderConfirmation_AccountCreatedMessage_txt));
	}

	@Then("user able to see the same order ID in My order section$")
	public void user_able_to_see_the_same_order_ID_in_My_order_section() throws Throwable {
		r2CheckOutPo.orderIDvalidationInMyAccount(orderID);
	}

	@Then("^user selects the gift card which is not exhausted$")
	public void user_selects_the_gift_card_which_is_not_exhausted() throws Throwable {
		r2CheckOutPo.validGiftCardSelection();
	}

// ********************Venkat *************
	@Then("^user validates shipping address$")
	public void user_validates_shipping_address() throws Throwable {
		r2MyAccountPO.retriveAddressOnConfirmationPageAndVerifyOnMyAccountPage();
	}
	
	@Then("^user sees the restriction error message on checkout page$")
	public void user_sees_the_restricition_error_message_on_checkout_page() throws Throwable {
		waitForElement(r2CheckOutPo.DailyQtyErrorMsg);
		assertTrue(isDisplayed(r2CheckOutPo.DailyQtyErrorMsg));
	}
	

	public static void JavaExecutorForClick(WebElement Element)
    {
   	 

   	 //Option 1 remove the disabled attribute
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("arguments[0].click",Element);
   	 Element.click();
    }
@Then("^user validates that free shipping is applied$")
	public void user_validates_that_free_shipping_is_applied() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(isDisplayed(r2CheckOutPo.FreeShippingCart));

	}
	

@Then("^validates that shipping is free on order summary$")
public void validates_that_shipping_is_free_on_order_summary() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	assertTrue(isDisplayed(r2CheckOutPo.FreeShippingordersummary));
}

@When("^user click on continue button$")
public void user_click_on_continue_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(6000);
	clickOnButton(r2CheckOutPo.continueshpopping);
}

@Then("^Validate that shipping is free on order confirmation page$")
public void validate_that_shipping_is_free_on_order_confirmation_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	assertTrue(isDisplayed(r2CheckOutPo.FreeShippingorderconfirmation));
}

	public boolean userWithoutStoredPaymentDetails(String userType)
	{
		if (userType.equalsIgnoreCase("newly registered") | userType.equalsIgnoreCase("guest")
				| userType.equalsIgnoreCase("unauthenticated"))
			return true;
		else
			return false;		
	}
	
	public boolean CreditCardModule(boolean userWithoutExistingPaymentDetails, String CCtype, String userType) throws InterruptedException
	{
		//if (arg1.toLowerCase().contains(("credit card"))) {
//			String creditCardNumber;
//			String cvv = "CVV";
//			//// Credit card to be picked
//			if (CCtype.toLowerCase().contains(("visa")))
//				creditCardNumber = "CardVISA";
//			else if (CCtype.toLowerCase().contains(("master")))
//				creditCardNumber = "CardMaster";
//			else if (CCtype.toLowerCase().contains(("amex"))) {
//				creditCardNumber = "CardAmex";
//				cvv = "FourDigitCVV";
//			} else if (CCtype.toLowerCase().contains(("discover")))
//				creditCardNumber = "CardDiscover";
//			else
//				creditCardNumber = "CreditCardNumber";

			boolean chooseCreditCard = false;
			if (!(userWithoutExistingPaymentDetails)) {
				if (isNotDisplayed(r2CheckOutPo.chooseCreditcard_Dd))
					chooseCreditCard = true;
			}

			if (chooseCreditCard | userWithoutExistingPaymentDetails) {
//				waitForInnerFormElement(r2CheckOutPo.CardholderName_Input,"first-data-payment-field-name"); 
//				SwitchToDefaultFrame();
//				waitForElement(r2CheckOutPo.ZipCode_Input);
//				r2CheckOutPo.ZipCode_Input.clear();
//				Thread.sleep(5000);
//				driver.switchTo().frame("first-data-payment-field-name");
//				waitForElement(r2CheckOutPo.CardholderName_Input);
//				setInputText(r2CheckOutPo.CardholderName_Input, webPropHelper.getTestDataProperty("CardholderName"));
//				driver.switchTo().defaultContent();
//				driver.switchTo().frame("first-data-payment-field-card");
//				setInputText(r2CheckOutPo.CreditCardDetails_Input, webPropHelper.getTestDataProperty("CreditCardNumber"));
//				driver.switchTo().defaultContent();
//				driver.switchTo().frame("first-data-payment-field-exp");
//				setInputText(r2CheckOutPo.ExpDate_Input, webPropHelper.getTestDataProperty("ExpDate"));
//				driver.switchTo().defaultContent();
//				driver.switchTo().frame("first-data-payment-field-cvv");
//				setInputText(r2CheckOutPo.PassCvv_Input, webPropHelper.getTestDataProperty("CVV"));
//				driver.switchTo().defaultContent();
//				
//				setInputText(r2CheckOutPo.FirstName_Input, webPropHelper.getTestDataProperty("FirstName"));
//				setInputText(r2CheckOutPo.LastName_Input, webPropHelper.getTestDataProperty("LastName"));
//				setInputText(r2CheckOutPo.PhoneNumber_Input, webPropHelper.getTestDataProperty("PhoneNumber"));
//				setInputText(r2CheckOutPo.Adderss_Input, webPropHelper.getTestDataProperty("Address"));
//				setInputText(r2CheckOutPo.ZipCode_Input, webPropHelper.getTestDataProperty("zipcode"));
//				Thread.sleep(Constants.thread_medium);
//				setInputText(r2CheckOutPo.EmailAddressforOrderConfirmation_Input,webPropHelper.getTestDataProperty("EmailAddress"));
//				Thread.sleep(Constants.thread_medium);
//				waitForElement(r2CheckOutPo.ReviewOrder_Btn);
//				assertTrue(clickOnButton(r2CheckOutPo.ReviewOrder_Btn));
//				Thread.sleep(Constants.thread_highest);
//				
//				//for popup modal after review for SOF orders
//				if(isDisplayed(r2CheckOutPo.ContinueReviewCTA))
//				{
//					assertTrue(clickOnButton(r2CheckOutPo.ContinueReviewCTA));
//					Thread.sleep(Constants.thread_high);
//				}
				/////////////////
				Thread.sleep(Constants.thread_low);
				waitForInnerFormElement(r2CheckOutPo.CardholderName_Input,"first-data-payment-field-name"); 
				//driver.switchTo().frame("first-data-payment-field-name");
			   	setInputText(r2CheckOutPo.CardholderName_Input, webPropHelper.getTestDataProperty("CardholderName"));
				//System.out.println("CardHoldername="+webPropHelper.getTestDataProperty("CardholderName"));
				driver.switchTo().defaultContent();
				waitForInnerFormElement(r2CheckOutPo.CreditCardDetails_Input,"first-data-payment-field-card"); 
				//driver.switchTo().frame("first-data-payment-field-card");
				setInputText(r2CheckOutPo.CreditCardDetails_Input, webPropHelper.getTestDataProperty("CreditCardNumber"));
				//System.out.println("CardNumber="+webPropHelper.getTestDataProperty("CreditCardNumber"));
				driver.switchTo().defaultContent();
				waitForInnerFormElement(r2CheckOutPo.ExpDate_Input,"first-data-payment-field-exp"); 				
				//driver.switchTo().frame("first-data-payment-field-exp");	
				setInputText(r2CheckOutPo.ExpDate_Input, webPropHelper.getTestDataProperty("ExpDate"));
				driver.switchTo().defaultContent();
				waitForInnerFormElement(r2CheckOutPo.PassCvv_Input,"first-data-payment-field-cvv"); 				
				//driver.switchTo().frame("first-data-payment-field-cvv");
				setInputText(r2CheckOutPo.PassCvv_Input, webPropHelper.getTestDataProperty("cvv"));
				driver.switchTo().defaultContent();
				if (userType.equalsIgnoreCase("guest") | userType.equalsIgnoreCase("unauthenticated")) {
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
			return true;

	}
}

	
