package com.aso.qe.test.stepdefinition.web;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_OrderConfirmation_Po;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K3165_SD extends CommonActionHelper {

	R2_R1_Fun_PO r2R1FunPO = PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R2_Cart_PO r2Cart_Po = PageFactory.initElements(driver, R2_Cart_PO.class);
	R2_CheckOut_PO r2CheckOut_po = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_MyAccount_PO r2MyAccount_po = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R2_OrderConfirmation_Po r2_OrderConfirmationPo = PageFactory.initElements(driver, R2_OrderConfirmation_Po.class);
	private static final Logger logger = Logger.getLogger(R2_CHECKOUT_K3165_SD.class);

	@And("^enters the \"(.*?)\" zip on the Cart page$")
	public void enters_the_zip_on_the_Cart_page(String arg1) throws Throwable {
		Thread.sleep(Constants.thread_low);
		assertTrue(clickOnButton(r2Cart_Po.lnkChangeZipCode));
		assertTrue(isDisplayed(r2Cart_Po.inputZipCode));
		setInputText(r2Cart_Po.inputZipCode, webPropHelper.getTestDataProperty(arg1));
	}

	@And("^click on submit button on calculate shipping model$")
	public void click_on_submit_button_on_calculate_shipping_model() throws Throwable {
		assertTrue(clickOnButton(r2Cart_Po.btnCartSubmit));
		Thread.sleep(Constants.thread_low);
	}

	@Then("^Guest User should be able to see the \"(.*?)\" zipcode pre-populated on Checkout page$")
	public void guest_User_should_be_able_to_see_the_zipcode_pre_populated_on_Checkout_page(String arg1)
			throws Throwable {
		Thread.sleep(Constants.thread_low);
		assertTrue(isDisplayed(r2CheckOut_po.inputCheckoutZipCode));
		String dataFromShippingTxtBox = r2CheckOut_po.inputCheckoutZipCode.getAttribute("value");
		String dataFromPropertyFile = webPropHelper.getTestDataProperty(arg1);
		assertTrue((dataFromShippingTxtBox.trim()).equals(dataFromPropertyFile.trim()));
	}

	@And("^City/State on the basis of the Zipcode should also be pre-populated on Checkout page$")
	public void city_State_on_the_basis_of_the_Zipcode_should_also_be_pre_populated_on_Checkout_page()
			throws Throwable {
		String cityNamePopulatedInCheckoutShip = r2CheckOut_po.inputCheckoutCity.getAttribute("value").trim();
		assertFalse(cityNamePopulatedInCheckoutShip.isEmpty());
	}

	@And("^user clicks on edit shipping method cta$")
	public void user_clicks_on_edit_shipping_method_cta() throws Throwable {
		if (isDisplayed(r2CheckOut_po.checkout_ShippingMethod_Edit_lnk)) {
			assertTrue(clickOnButton(r2CheckOut_po.checkout_ShippingMethod_Edit_lnk));
			Thread.sleep(Constants.thread_low);
		}
	}

	@And("^user fill the email address for shipment and click on review order btn$")
	public void user_fill_the_email_address_for_shipment_and_click_on_review_order_btn() throws Throwable {
		setInputText(r2CheckOut_po.EmailAddressforOrderConfirmation_Input, r2MyAccount_po.generateRandomEmailId());
		clickOnButton(r2CheckOut_po.ReviewOrder_Btn);
		Thread.sleep(Constants.thread_low);
	}

	@And("^registers for the account from the Order confirmation screen with \"(.*?)\"$")
	public void registers_for_the_account_from_the_Order_confirmation_screen_with(String passwordFromTestFile)
			throws Throwable {
		waitForPageLoad(getDriver());
		setInputText(r2_OrderConfirmationPo.orderConfirmation_ChoosePassword_txt,
				webPropHelper.getTestDataProperty(passwordFromTestFile));
		Thread.sleep(Constants.thread_low);
		assertTrue(clickOnButton(r2_OrderConfirmationPo.orderConfirmation_Submit_btn));
		if ("mobile".equalsIgnoreCase(testtype)) {
			{
				if (isDisplayed(r2_OrderConfirmationPo.orderConfirmation_Submit_btn))
					assertTrue(clickOnButton(r2_OrderConfirmationPo.orderConfirmation_Submit_btn));
			}

		}
		Thread.sleep(Constants.thread_high);
	}

	@And("^user navigates from Order successful page to address book in my account$")
	public void user_navigates_from_Order_successful_page_to_address_book_in_my_account() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			scrollPageToWebElement(r2MyAccount_po.myAccount_txt_Mobile);
			clickOnButton(r2MyAccount_po.myAccount_txt_Mobile);
			scrollPageToWebElement(r2MyAccount_po.addressBook_M);
			clickOnButton(r2MyAccount_po.addressBook_M);
		} else {
			assertTrue(clickOnButton(r2MyAccount_po.lnkSignIn));
			assertTrue(clickOnButton(r2MyAccount_po.myAccount_MyAccountList_AddressBook_lnk));
		}
	}

	@Then("^Guest User should be able to see only one available method for the shipment displayed in shipping method$")
	public void guest_User_should_be_able_to_see_only_one_available_method_for_the_shipment_displayed_in_shipping_method()
			throws Throwable {
		assertFalse(isDisplayed(r2CheckOut_po.checkout_ShippingMethod_ShippingMethodType_btn));
	}
}
