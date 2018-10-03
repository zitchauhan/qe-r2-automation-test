package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertFalse;
//import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CHECKOUT_K6962_SD extends CommonActionHelper {

	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);

	@Given("^applied gift card \"(.*?)\" should be displayed$")
	public void applied_gift_card_should_be_displayed(String arg1) throws Throwable {
		String lastFourDigitOfGiftCard = (webPropHelper.getTestDataProperty(arg1))
				.substring((webPropHelper.getTestDataProperty(arg1)).length() - 4);
		assertTrue(getText(r2CheckOutPo.txtGiftCardAppliedSuccessMessage).contains(lastFourDigitOfGiftCard));
	}
	
	@Then("^applied gift card \"(.*?)\" should be displayed for second gift card$")
	public void applied_gift_card_should_be_displayed_for_second_gift_cardelds_loaded_Full_name_email_address_choose_password_submit_button_and_check_box_for_email_News_letters(String arg1) throws Throwable {
		String lastFourDigitOfGiftCard = (webPropHelper.getTestDataProperty(arg1))
				.substring((webPropHelper.getTestDataProperty(arg1)).length() - 4);
		assertTrue(getText(r2CheckOutPo.txtGiftCardAppliedSuccessMessageSecond).contains(lastFourDigitOfGiftCard));
	}

	@Then("^Remove option is displayed to user$")
	public void remove_option_is_displayed_to_user() throws Throwable {
		assertTrue(isDisplayed(r2CheckOutPo.btnRemoveGiftCard));
	}

	@Given("^user unchecks same as shipping address checkbox on checkout page$")
	public void user_unchecks_same_as_shipping_address_checkbox_on_checkout_page() throws Throwable {
		if (!(isDisplayed(r2CheckOutPo.FirstName_Input))) {
			assertTrue(clickOnButton(r2CheckOutPo.SameAsShippingAddress_checkBox));
		}

	}

	@Given("^user click on remove gift card on checkout page$")
	public void user_click_on_remove_gift_card_on_checkout_page() throws Throwable {
		assertTrue(clickOnButton(r2CheckOutPo.btnRemoveGiftCard));
		waitForElement(r2CheckOutPo.plusIconGiftCard);
	}

	@Then("^gift card should no longer be applied to the transaction$")
	public void gift_card_should_no_longer_be_applied_to_the_transaction() throws Throwable {
		assertFalse(isDisplayed(r2CheckOutPo.giftCards_txt));
		assertFalse(isDisplayed(r2CheckOutPo.giftCardsPrice_txt));
	}
	
	@Given("^Remaining gift card balance should be displayed$")
	public void remaining_gift_card_balance_should_be_displayed() throws Throwable {
		assertTrue(getText(r2CheckOutPo.txtGiftCardAppliedSuccessMessage).toLowerCase().contains("remaining balance"));
	}

	@Given("^Applied amount should be displayed in order summary$")
	public void applied_amount_should_be_displayed_in_order_summary() throws Throwable {
		assertTrue(isDisplayed(r2CheckOutPo.giftCards_txt));
		assertTrue(isDisplayed(r2CheckOutPo.giftCardsPrice_txt));
		String giftCardPrice = getText(r2CheckOutPo.giftCardsPrice_txt);
		giftCardPrice = giftCardPrice.replace("-", "");
		assertTrue(getText(r2CheckOutPo.txtGiftCardAppliedSuccessMessage).contains(giftCardPrice));
	}
	
	@When("^user selects \"(.*?)\" from choose gift card dropdown$")
	public void user_selects_from_choose_gift_card_dropdown(String arg1) throws Throwable {
		assertTrue(clickOnButton(r2CheckOutPo.checkOutGiftCardDropDown));
		List<WebElement> shippingMethodList = r2CheckOutPo.checkout_GiftCard_List_dd.findElements(By.tagName("li"));
		for (WebElement li : shippingMethodList) {
			if (li.getText().contains(arg1)) {
				li.click();
				break;
			}
		}
	}
	
	@Then("^user should be able to do transaction successfully with gift card and credit card$")
	public void user_should_be_able_to_do_transaction_successfully_with_gift_card_and_credit_card() throws Throwable {
	    assertTrue(isDisplayed(r2CheckOutPo.btnPlaceOrderPaymentPage));
	}
	
	@Then("^user should not be able to pay remaining balace with paypal$")
	public void user_should_not_be_able_to_pay_remaining_balace_with_paypal() throws Throwable 
	{
		assertFalse(isEnabled(r2CheckOutPo.checkout_PaymentMethod_PayPal_Disabled_rb));
//		assertTrue(isDisplayed(r2CheckOutPo.checkout_PaymentMethod_PayPal_Disabled_rb));
	}

}
