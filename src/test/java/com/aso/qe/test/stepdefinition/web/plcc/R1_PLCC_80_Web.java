package com.aso.qe.test.stepdefinition.web.plcc;

import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;
import com.aso.qe.test.pageobject.R1_PLCC_LandingPage_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Registration_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_PLCC_80_Web extends CommonActionHelper {
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_LandingPage_PO plccLandingPageObjects = PageFactory.initElements(driver, R1_PLCC_LandingPage_PO.class);
	R1_PLCC_Registration_PO plccPageObjects = PageFactory.initElements(driver, R1_PLCC_Registration_PO.class);
	R1_PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), R1_PDP_PO.class);
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);
	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_MyAccount_PO r2MyAccountPO = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R2_R1_Fun_PO r2_r1_fun_po = PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);

	@When("^user enters \"(.*?)\" in the search box$")
	public void user_enters_in_the_search_box(String arg1) throws Throwable {
		plccPageObjects.enterSearchItem(arg1);
		assertTrue(isDisplayed(plccLandingPageObjects.searchBox));
		waitForElement(plccLandingPageObjects.searchBox);
	}

	@When("^user click on Add to cart button$")
	public void user_click_on_Add_to_cart_button() throws Throwable {
		pdpPageObj.addToCartAvailability();
		waitForElement(pdpPageObj.btnAddToCart);
		assertTrue(clickOnButton(pdpPageObj.btnAddToCart));
	}

	@When("^user click on search icon$")
	public void user_click_on_search_icon() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfSearchIcon();
		plccLandingPageObjects.searchIcon.click();
	}

	@When("^user click on checkout from ATC pop up$")
	public void user_click_on_checkout_from_ATC_pop_up() throws Throwable {
		genericPO.clickOnCheckoutButton();
	}

	@When("^user selects credit card radio button$")
	public void user_selects_credit_card_radio_button() throws Throwable {
		genericPO.verifyPresenceOfCreditCardRadioButton();
		r2CheckOutPo.CreditCard_radioBtn.click();
	}

	@When("^user add \"(.*?)\" details on payment method for \"(.*?)\" user$")
	public void user_add_details_on_payment_method_for_user(String arg1, String arg2) throws Throwable {
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
			}

			// *----author:Vidya Siddaramappa ---*//
			else if (arg1.toLowerCase().contains(("plcc card"))) {
				creditCardNumber = "CardPlcc";
				// *----author:Vidya Siddaramappa ---*//

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
			if (isDisplayed(r2CheckOutPo.PaypalScreenLogin_Btn))
				assertTrue(clickOnButton(r2CheckOutPo.PaypalScreenLogin_Btn));

//				assertTrue(clickOnButton(r2CheckOutPo.PaypalScreenLogin_Btn));
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

	@When("^user clicks on checkout button and navigates to checkout page$")
	public void user_clicks_on_checkout_button_and_navigates_to_checkout_page() throws Throwable {
		genericPO.verifyPresenceOfCheckoutPage();
	}

	@When("^user expect credit card text field is present$")
	public void user_expect_credit_card_text_field_is_present() throws Throwable {
		genericPO.verifyPresenceOfCreditCardTextField();
	}

	@When("^user enter plcc card \"(.*?)\"$")
	public void user_enter_plcc_card(String arg1) throws Throwable {
		genericPO.enterCardBinNumber(arg1);
		assertTrue(isDisplayed(genericPO.CreditCardNumber_Input));
		waitForElement(genericPO.CreditCardNumber_Input);
	}

	@Then("^user expect element plcc credit card image on credit card text field to present$")
	public void user_expect_element_plcc_credit_card_image_on_credit_card_text_field_to_present() throws Throwable {
		genericPO.verifyPresenceOfPlccCardOnCreditCardTxtField();
	}

	@When("^user enter visa card \"(.*?)\"$")
	public void user_enter_visa_card(String arg1) throws Throwable {
		genericPO.enterCardBinNumber(arg1);
		assertTrue(isDisplayed(genericPO.CreditCardNumber_Input));
		waitForElement(genericPO.CreditCardNumber_Input);
	}

	@Then("^user expect element visa card image on credit card text field to present$")
	public void user_expect_element_visa_card_image_on_credit_card_text_field_to_present() throws Throwable {
		genericPO.verifyPresenceOfVisaCardImageOnCCField();
	}

	@When("^user enter master card \"(.*?)\"$")
	public void user_enter_master_card(String arg1) throws Throwable {
		genericPO.enterCardBinNumber(arg1);
		assertTrue(isDisplayed(genericPO.CreditCardNumber_Input));
		waitForElement(genericPO.CreditCardNumber_Input);
	}

	@Then("^user expect element master card image on credit card text field to present$")
	public void user_expect_element_master_card_image_on_credit_card_text_field_to_present() throws Throwable {
		genericPO.verifyPresenceOfVisaCardImageOnCCField();
	}

	@When("^user enter amex card \"(.*?)\"$")
	public void user_enter_amex_card(String arg1) throws Throwable {
		genericPO.enterCardBinNumber(arg1);
		assertTrue(isDisplayed(genericPO.CreditCardNumber_Input));
		waitForElement(genericPO.CreditCardNumber_Input);
	}

	@When("^user enter discover card \"(.*?)\"$")
	public void user_enter_discover_card(String arg1) throws Throwable {
		genericPO.enterCardBinNumber(arg1);
		assertTrue(isDisplayed(genericPO.CreditCardNumber_Input));
		waitForElement(genericPO.CreditCardNumber_Input);
	}

	@Then("^user expect element amex card image on credit card text field to present$")
	public void user_expect_element_amex_card_image_on_credit_card_text_field_to_present() throws Throwable {
		genericPO.verifyPresenceOfAmexCardImageOnCCField();
	}

	@Then("^user expect element discover card image on credit card text field to present$")
	public void user_expect_element_discover_card_image_on_credit_card_text_field_to_present() throws Throwable {
		genericPO.verifyPresenceOfDiscoveCardImageOnCCField();
	}

	@Then("^user expect element invalid card type error message to present$")
	public void user_expect_element_invalid_card_type_error_message_to_present() throws Throwable {
		genericPO.verifyPresenceOfInvalidErrorMessageOnCCField();
	}

	@When("^user expect element credit card text field is present$")
	public void user_expect_element_credit_card_text_field_is_present() throws Throwable {
		genericPO.verifyPresenceOfCreditCardTextField();
	}

	@Then("^user expect selected credit card image on credit card text field$")
	public void user_expect_selected_credit_card_image_on_credit_card_text_field() throws Throwable {
		genericPO.verifyPresenceOfCreditCardImageOnCCField();
	}

	@When("^user click on edit my cart link$")
	public void user_click_on_edit_my_cart_link() throws Throwable {
		genericPO.verifyPresenceOfEditMyCartLink();
		r2CheckOutPo.btnEditCart.click();
	}

	@When("^user click on remove from cart$")
	public void user_click_on_remove_from_cart() throws Throwable {
		genericPO.verifyPresenceOfRemoveFromCartLink();
		r2CheckOutPo.AS_btnRemoveFromCart.click();
	}
	@When("^user click on expiry date text field$")
	public void user_click_on_expiry_date_text_field() throws Throwable {
		genericPO.verifyPresenceOfExpiryTextField();
		r2CheckOutPo.txtExpirationDateInput.click();
	}

	@Then("^user expect element Unrecognized card number to be present$")
	public void user_expect_element_Unrecognized_card_number_to_be_present() throws Throwable {
		genericPO.verifyPresenceOfInvalidCardNumberErrorMsg();
	}
}


