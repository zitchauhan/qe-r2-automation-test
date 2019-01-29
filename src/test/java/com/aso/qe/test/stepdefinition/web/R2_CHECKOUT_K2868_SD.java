package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_OrderConfirmation_Po;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;
import com.sun.corba.se.impl.orbutil.closure.Constant;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K2868_SD extends CommonActionHelper {

	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_OrderConfirmation_Po orderConfirmationPo = PageFactory.initElements(driver, R2_OrderConfirmation_Po.class);
	R1_PDP_PO pdp_po =PageFactory.initElements(driver, R1_PDP_PO.class);
	R2_R1_Fun_PO r2R1FunPO=PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R2_MyAccount_PO r2_MyAccount_PO = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	
	@Then("^user click on review order button$")
	public void user_click_on_review_order_button() throws Throwable {
		clickOnButton(r2CheckOutPo.ReviewOrder_Btn);
	}
	
	
	@And("^user should be able to see the instore pickup instruction$")
	public void user_should_be_able_to_see_the_instore_pickup_instruction() {
		assertTrue(isDisplayed(orderConfirmationPo.storePickUpInstructionOrderConfirmationPage));
	}
	
	@And("^user verify that item count is displayed in Order Summary$")
	public void user_verify_that_item_count_is_displayed_in_Order_Summary() {
		assertTrue(isDisplayed(orderConfirmationPo.itemCountOrderSummary));
	}

	@And("^user verify that product attributes are displayed in Order Summary$")
	public void user_verify_that_product_attributes_are_displayed_in_Order_Summary() {
		for (WebElement productAttribute : orderConfirmationPo.productAttributes) {
			assertTrue(isDisplayed(productAttribute));
		}
	}

	@And("^user verify that other attributes are displayed in Order Summary$")
	public void user_verify_that_other_attributes_are_displayed_in_Order_Summary() {
		for (WebElement otherDetail : orderConfirmationPo.otherDetailsOfOrderSummary) {
			assertTrue(isDisplayed(otherDetail));
		}
	}
	
	@And("^user should be able to see instore pickup information on order confirmation page$")
	public void user_should_be_able_to_see_instore_pickup_information_on_order_confirmation_page() throws InterruptedException {
		Thread.sleep(Constants.thread_high);
		assertTrue(isDisplayed(orderConfirmationPo.pickupDate));
		assertTrue(isDisplayed(orderConfirmationPo.pickupStore));
		assertTrue(clickOnButton(orderConfirmationPo.pickupStoreHourDropDown));
		assertTrue(isDisplayed(orderConfirmationPo.pickupStoreHourTiming));
		assertTrue(isDisplayed(orderConfirmationPo.pickupPerson));
		
	}
	
	@Then("^user enter payment details having random mailing address$")
	public void user_enter_payment_details_having_random_mailing_address() throws InterruptedException {
		waitForElement(r2CheckOutPo.CreditCardNumber_Input);
		r2CheckOutPo.ZipCode_Input.clear();
		setInputText(r2CheckOutPo.CreditCardNumber_Input, webPropHelper.getTestDataProperty("CreditCardNumber"));
		setInputText(r2CheckOutPo.ExpirationDate_Input, webPropHelper.getTestDataProperty("ExpDate"));
		setInputText(r2CheckOutPo.Cvv_Input, webPropHelper.getTestDataProperty("CVV"));
		setInputText(r2CheckOutPo.FirstName_Input, webPropHelper.getTestDataProperty("FirstName"));
		setInputText(r2CheckOutPo.LastName_Input, webPropHelper.getTestDataProperty("LastName"));
		setInputText(r2CheckOutPo.PhoneNumber_Input, webPropHelper.getTestDataProperty("PhoneNumber"));
		setInputText(r2CheckOutPo.Adderss_Input, webPropHelper.getTestDataProperty("Address"));
		setInputText(r2CheckOutPo.ZipCode_Input, webPropHelper.getTestDataProperty("zipcode"));
		Thread.sleep(Constants.thread_medium);
		setInputText(r2_MyAccount_PO.txtEmailAddress, r2_MyAccount_PO.generateRandomEmailId());
		Thread.sleep(Constants.thread_medium);
		assertTrue(clickOnButton(r2CheckOutPo.ReviewOrder_Btn));
		Thread.sleep(Constants.thread_highest);
	}
	
	@Then("^user verify the account is created \"(.*?)\"$")
	public void user_verify_the_account_is_created(String message) {
		assertTrue(r2CartPo.messageFlyout.getText().contains(webPropHelper.getTestDataProperty(message)));
	}
	
}
