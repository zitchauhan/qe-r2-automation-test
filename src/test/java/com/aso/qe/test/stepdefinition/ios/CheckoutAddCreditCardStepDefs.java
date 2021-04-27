package com.aso.qe.test.stepdefinition.ios;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.AccountPage;
import com.aso.qe.test.pageobject.ios.CheckOutAddCreditCardPage;
import com.aso.qe.test.pageobject.ios.CheckoutPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.pageobject.ios.CheckoutPage;

import cucumber.api.java.en.And;
import org.openqa.selenium.By;

public class CheckoutAddCreditCardStepDefs extends GlobalMobileHelper {
private static final Logger logger = Logger.getLogger(CheckoutAddCreditCardStepDefs.class.getName());
CheckOutAddCreditCardPage checkoutAddCreditCard = new CheckOutAddCreditCardPage(driver);
AccountPage accountPage= new AccountPage(driver);

public static String cardNumber = null;
	

@When("^User taps on Add Credit card button$")
public void user_taps_on_Add_Credit_card_button() throws Throwable {
	checkoutAddCreditCard.tapOnAddCreditCard();
}

@Then("^User sees credit card information on credit card screen$")
public void user_sees_credit_card_information_on_credit_card_screen() throws Throwable {
   checkoutAddCreditCard.isCreditCardInformationDisplayed();
}

@Then("^User sees accepcted card image on credit card screen$")
public void user_sees_accepcted_card_image_on_credit_card_screen() throws Throwable {
	checkoutAddCreditCard.isCardImageDisplayed();
}

@Then("^User sees card holder name field on credit card screen$")
public void user_sees_card_holder_name_field_on_credit_card_screen() throws Throwable {
	checkoutAddCreditCard.isCardHolderNameDisplayed();
}

@Then("^User sees card number field on credit card screen$")
public void user_sees_card_number_field_on_credit_card_screen() throws Throwable {
	checkoutAddCreditCard.isCardNumberDisplayed();
}

@Then("^User sees card expiry field on credit card screen$")
public void user_sees_card_expiry_field_on_credit_card_screen() throws Throwable {
   checkoutAddCreditCard.isCardExpiryDisplayed();
}

@Then("^User sees CVV field on credit card screen$")
public void user_sees_CVV_field_on_credit_card_screen() throws Throwable {
   checkoutAddCreditCard.isCardCVVDisplayed();
}

@Then("^User sees Save For Future checkbox as default selected$")
public void user_sees_Save_For_Future_checkbox_as_default_selected() throws Throwable {
	checkoutAddCreditCard.isCheckboxSaveForFutureDisplayed();
	assertTrue(checkoutAddCreditCard.isSaveFutureCheckBoxSelected());
   
}

@Then("^User sees Billing address section$")
public void user_sees_Billing_address_section() throws Throwable {
	checkoutAddCreditCard.isBillingAddressLabel();
	
  
}

@Then("^User sees option as Shipping address as billing address$")
public void user_sees_option_as_Shipping_address_as_billing_address() throws Throwable {
	checkoutAddCreditCard.isSameAsShippingAddressDisplayed();
    
}

@Then("^User sees option as Add new billing address$")
public void user_sees_option_as_Add_new_billing_address() throws Throwable {
	checkoutAddCreditCard.isAddnewBillingAddressDisplayed();
}

@Then("^User sees save credit card button as disabled$")
public void user_sees_save_credit_card_button_as_disabled() throws Throwable {
	checkoutAddCreditCard.isSaveCreditCardButtonDisplayed();
	checkoutAddCreditCard.isSaveCreditCardButtonDisabled();
}

@Then("^User sees back button on credit card screen$")
public void user_sees_back_button_on_credit_card_screen() throws Throwable {
	checkoutAddCreditCard.isBackButtonDisplayed();
}


@When("^User enter \"([^\"]*)\" in \"([^\"]*)\" field$")
public void user_enter_in_field(String inputValue, String fieldName) throws Throwable {
	     cardNumber= inputValue;
	checkoutAddCreditCard.enterCreditCardData(inputValue, fieldName);
    
}

@Then("^User sees card image in card number input field$")
public void user_sees_card_image_as_VISA_in_card_number_input_field() throws Throwable {
	switch(cardNumber) {
	case "1111":
		checkoutAddCreditCard.isVisaImageDisplayed();
		break;
	case "3782":
		checkoutAddCreditCard.isAmexImageDisplayed();
		break;
	case "5105":
		checkoutAddCreditCard.isMasterCardImageDisplayed();
		break;
	case "6011":
		checkoutAddCreditCard.isDiscoverImageDisplayed();
		break;
	default:
		throw new IllegalStateException("Invalid card found");
}
}

@Then("^User sees invalid card error message$")
public void user_sees_invalid_card_error_message() throws Throwable {
    checkoutAddCreditCard.isInvalidCardErrorMessageDisplayed();
}


@Then("^User sees save credit card button as enabled$")
public void user_sees_save_credit_card_button_as_enabled() throws Throwable {
	checkoutAddCreditCard.isSaveCreditCardButtonDisplayed();
	checkoutAddCreditCard.isSaveCreditCardButtonEnabled();
}
@When("^user tap on Add billing address$")
public void user_tap_on_Add_billing_address() throws Throwable {
    checkoutAddCreditCard.tapOnAddBillingAddress();
}

@Then("^User sees alertPopup with message$")
public void user_sees_alertPopup_with_message() throws Throwable {
   checkoutAddCreditCard.isWarningPopUpDisplayed();
   checkoutAddCreditCard.isWarningPopupHeadingTextDisplayed();
   checkoutAddCreditCard.isWarningPopupSubHeadingTextDisplayed();
}

@Then("^User sees Continue button on alert popup$")
public void user_sees_Yes_button_on_alert_popup() throws Throwable {
     checkoutAddCreditCard.isWarningYesButtonDisplayed();
}

@Then("^User Sees Cancel button on alert popup$")
public void user_Sees_No_button_on_alert_popup() throws Throwable {
	checkoutAddCreditCard.isWarningNoButtonDisplayed();
	}

@When("^User taps on \"([^\"]*)\" button from alert popup$")
public void user_taps_on_button_from_alert_popup(String buttonName) throws Throwable {
     checkoutAddCreditCard.tapOnWarningButtons(buttonName);
}   

@Then("^User sees Add Credit card button$")
public void user_sees_Add_Credit_card_button() throws Throwable {
     checkoutAddCreditCard.isAddCreditCardButtonDisplayed();  
}
@When("^User taps on save credit card button$")
public void user_taps_on_save_credit_card_button() throws Throwable {
    checkoutAddCreditCard.tapOnSaveCreditCart();
}

@Then("^User is on Payment screen page$")
public void user_is_on_Payment_screen_page() throws Throwable {
  
}

@Then("^User sees saved address in billing section$")
public void user_sees_saved_address_in_billing_section() throws Throwable {
      checkoutAddCreditCard.isSavedAddressListDisplay();
}   

@When("^User taps on saved address$")
public void user_taps_on_saved_address() throws Throwable {
    checkoutAddCreditCard.tapOnSavedAddress();
}

@Then("^User sees Save For Future checkbox as default un-selected$")
public void user_sees_Save_For_Future_checkbox_as_default_un_selected() throws Throwable {
   assertFalse(checkoutAddCreditCard.isSaveFutureCheckBoxSelected());
}


@Then("^User see an error message for \"([^\"]*)\"$")
public void user_see_an_error_message_for(String fieldName) throws Throwable {
	
	accountPage.validateError(fieldName);
   
}



	
}
