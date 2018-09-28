package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_MYACCOUNT_K6841_SD extends CommonActionHelper {

	R2_MyAccount_PO r2_MyAccount_PO = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	R2_Cart_PO r2CartPO = PageFactory.initElements(driver, R2_Cart_PO.class);

	@Then("^User verifies that list of all saved credit/debit cards are displayed$")
	public void user_verifies_that_list_of_all_saved_credit_debit_cards_are_displayed() throws Throwable {
		Thread.sleep(Constants.thread_low);
		assertTrue(isDisplayed(r2_MyAccount_PO.headerBillingInformation));
	}

	@When("^user clicks on Edit CTA for a selected card$")
	public void user_clicks_on_Edit_CTA_for_a_selected_card() throws Throwable {
		assertTrue(clickOnButton(r2_MyAccount_PO.btnEdit));
		Thread.sleep(Constants.thread_low);
	}

	@Then("^user verify all the form fields are pre-populated$")
	public void user_verify_all_the_form_fields_are_pre_populated() throws Throwable {
		assertTrue(isDisplayed(r2_MyAccount_PO.txtCreditCardNumber));
		assertTrue(isDisplayed(r2_MyAccount_PO.txtExpiryDate));
		assertTrue(isDisplayed(r2_MyAccount_PO.txtCVV));
		assertTrue(isDisplayed(r2_MyAccount_PO.txtFirstNameInAddCreditCard));
		assertTrue(isDisplayed(r2_MyAccount_PO.txtLastNameInAddCreditCard));
		assertTrue(isDisplayed(r2_MyAccount_PO.txtAddressInAddCreditCard));
		assertTrue(isDisplayed(r2_MyAccount_PO.txtZipCodeInAddCreditCard));
		assertTrue(isDisplayed(r2_MyAccount_PO.txtCityInAddCreditCard));
		assertTrue(isDisplayed(r2_MyAccount_PO.txtPhoneNumberInAddCreditCard));
		String ccNumber = r2_MyAccount_PO.txtCreditCardNumber.getAttribute("value");
		String expDate = r2_MyAccount_PO.txtExpiryDate.getAttribute("value");
		String cvv = r2_MyAccount_PO.txtCVV.getAttribute("value");
		String fName = r2_MyAccount_PO.txtFirstNameInAddCreditCard.getAttribute("value");
		String lName = r2_MyAccount_PO.txtLastNameInAddCreditCard.getAttribute("value");
		String address = r2_MyAccount_PO.txtAddressInAddCreditCard.getAttribute("value");
		String zip = r2_MyAccount_PO.txtZipCodeInAddCreditCard.getAttribute("value");
		String city = r2_MyAccount_PO.txtCityInAddCreditCard.getAttribute("value");
		String phone = r2_MyAccount_PO.txtPhoneNumberInAddCreditCard.getAttribute("value");
		System.out.println(ccNumber + expDate + cvv + fName + lName + address + zip + city + phone);
		assertTrue(isDisplayed(r2_MyAccount_PO.iconCVVToolTip));
		assertFalse(ccNumber.isEmpty());
		assertFalse(expDate.isEmpty());
		assertTrue(cvv.isEmpty());
		assertFalse(fName.isEmpty());
		assertFalse(lName.isEmpty());
		assertFalse(address.isEmpty());
		assertFalse(zip.isEmpty());
		assertFalse(city.isEmpty());
		assertFalse(phone.isEmpty());
	}

	@Then("^verify cancel CTA and Add CTA are displayed$")
	public void verify_cancel_CTA_and_Add_CTA_are_displayed() throws Throwable {
		assertTrue(isDisplayed(r2_MyAccount_PO.btnCancelInAddCreditCard));
		assertTrue(isDisplayed(r2_MyAccount_PO.btnAddInAddCreditCard));
	}

	@When("^user clicks on add new credit card cta$")
	public void user_clicks_on_add_new_credit_card_cta() throws Throwable {
		assertTrue(clickOnButton(r2_MyAccount_PO.addNewCardCta));
	}

	@When("^user fills the credit/debit form$")
	public void user_fills_the_credit_debit_form() throws Throwable {
		setInputText(r2_MyAccount_PO.txtCreditCardNumber, webPropHelper.getTestDataProperty("CreditCardNumber"));
		Thread.sleep(Constants.thread_low);
		setInputText(r2_MyAccount_PO.txtExpiryDate, webPropHelper.getTestDataProperty("ExpDate"));
		Thread.sleep(Constants.thread_low);
		setInputText(r2_MyAccount_PO.txtCVV, webPropHelper.getTestDataProperty("CVV"));
		Thread.sleep(Constants.thread_low);
		setInputText(r2_MyAccount_PO.txtFirstNameInAddCreditCard, webPropHelper.getTestDataProperty("FirstName"));
		setInputText(r2_MyAccount_PO.txtLastNameInAddCreditCard, webPropHelper.getTestDataProperty("LastName"));
		setInputText(r2_MyAccount_PO.txtAddressInAddCreditCard, webPropHelper.getTestDataProperty("Address"));
		setInputText(r2_MyAccount_PO.txtZipCodeInAddCreditCard, webPropHelper.getTestDataProperty("zipcode"));
		setInputText(r2_MyAccount_PO.txtPhoneNumberInAddCreditCard, webPropHelper.getTestDataProperty("PhoneNumber"));
	}

	@When("^user clicks on add cta$")
	public void user_clicks_on_add_cta() throws Throwable {
		assertTrue(clickOnButton(r2_MyAccount_PO.PaymentPage_AddCreditCard_Add_btn)); //Sep24 CR-RK KER-2920
		Thread.sleep(Constants.thread_low);
	}

	@Then("^User updates CC/debit card and billing information$")
	public void user_updates_CC_debit_card_and_billing_information() throws Throwable {
		clearInputBox(r2_MyAccount_PO.txtExpiryDate);
		setInputText(r2_MyAccount_PO.txtExpiryDate, webPropHelper.getTestDataProperty("updateExpDate"));
		clearInputBox(r2_MyAccount_PO.txtCVV);
		setInputText(r2_MyAccount_PO.txtCVV, webPropHelper.getTestDataProperty("updateCVV"));
		clearInputBox(r2_MyAccount_PO.txtFirstNameInAddCreditCard);
		setInputText(r2_MyAccount_PO.txtFirstNameInAddCreditCard, webPropHelper.getTestDataProperty("updateFirstName"));
		clearInputBox(r2_MyAccount_PO.txtLastNameInAddCreditCard);
		setInputText(r2_MyAccount_PO.txtLastNameInAddCreditCard, webPropHelper.getTestDataProperty("updateLastName"));
		clearInputBox(r2_MyAccount_PO.txtAddressInAddCreditCard);
		setInputText(r2_MyAccount_PO.txtAddressInAddCreditCard, webPropHelper.getTestDataProperty("updateAddress"));
		clearInputBox(r2_MyAccount_PO.txtZipCodeInAddCreditCard);
		setInputText(r2_MyAccount_PO.txtZipCodeInAddCreditCard, webPropHelper.getTestDataProperty("updateZipCode"));
		clearInputBox(r2_MyAccount_PO.txtPhoneNumberInAddCreditCard);
		setInputText(r2_MyAccount_PO.txtPhoneNumberInAddCreditCard,
				webPropHelper.getTestDataProperty("updatePhoneNumber"));
	}

	@Then("^User clicks on Cancel CTA$")
	public void user_clicks_on_Cancel_CTA() throws Throwable {
		assertTrue(clickOnButton(r2_MyAccount_PO.btnCancelInAddCreditCard));
	}

	@Then("^Verify that updated details are not saved$")
	public void verify_that_updated_details_are_not_saved(DataTable l1) throws Throwable {
		// fetch the existing values
		String expDate = r2_MyAccount_PO.txtExpiryDate.getAttribute("value");
		String fName = r2_MyAccount_PO.txtFirstNameInAddCreditCard.getAttribute("value");
		String lName = r2_MyAccount_PO.txtLastNameInAddCreditCard.getAttribute("value");
		String address = r2_MyAccount_PO.txtAddressInAddCreditCard.getAttribute("value");
		String zip = r2_MyAccount_PO.txtZipCodeInAddCreditCard.getAttribute("value");
		String phone = r2_MyAccount_PO.txtPhoneNumberInAddCreditCard.getAttribute("value");

		// compare with modified values
		assertTrue(expDate != webPropHelper.getTestDataProperty("updateExpDate"));
		assertTrue(fName != webPropHelper.getTestDataProperty("updateFirstName"));
		assertTrue(lName != webPropHelper.getTestDataProperty("updateLastName"));
		assertTrue(address != webPropHelper.getTestDataProperty("updateAddress"));
		assertTrue(zip != webPropHelper.getTestDataProperty("updateZipCode"));
		assertTrue(phone != webPropHelper.getTestDataProperty("updatePhoneNumber"));
	}
}
