package com.aso.qe.test.stepdefinition.web;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K6822_SD extends CommonActionHelper {

	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_MyAccount_PO myAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);
	R2_R1_Fun_PO r2R1FunPo = PageFactory.initElements(driver, R2_R1_Fun_PO.class);

	@Then("^Gift Card Number field and PIN fields are displayed$")
	public void gift_Card_Number_field_and_PIN_fields_are_displayed() throws Throwable {
		assertTrue(isDisplayed(r2CheckOutPo.inputGiftCard));
		assertTrue(isDisplayed(r2CheckOutPo.inputPin));
		assertTrue(isDisplayed(r2CheckOutPo.btnCheckoutApply));
	}

	@Then("^gift card balance is applied towards the purchase$")
	public void gift_card_balance_is_applied_towards_the_purchase() throws Throwable {
		assertTrue(isDisplayed(r2CheckOutPo.txtGiftCardOrderSummaryPage));
	}

	@And("^user clicks on edit payment cta$")
	public void user_clicks_on_edit_payment_cta() throws Throwable {
		scrollPageToWebElement(r2CheckOutPo.secPaymentHeading);
		if (isDisplayed(r2CheckOutPo.EditPayment_Link)) {
			assertTrue(clickOnButton(r2CheckOutPo.EditPayment_Link));
		}
	}

	@And("^user selects add new gift card option from the dropdown$")
	public void user_selects_add_new_gift_card_option_from_the_dropdown() throws Throwable {
		if (isDisplayed(r2CheckOutPo.checkOutGiftCardDropDown)) {
			Actions hover = new Actions(getDriver());
			hover.click(r2CheckOutPo.checkOutGiftCardDropDown).build().perform();
			hover.sendKeys(Keys.DOWN, Keys.ENTER).build().perform();
		}
	}

	@And("^User navigates from checkout to payments in myaccount$")
	public void user_navigates_from_checkout_to_payments_in_myaccount() throws Throwable {
		Thread.sleep(2000);
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(r2CheckOutPo.logoHeader));
			globalElementHeader.clickOnBurgerMenu();
			scrollPageToWebElement(myAccountPo.myAccount_txt_Mobile);
			clickOnButton(myAccountPo.myAccount_txt_Mobile);
			scrollPageToWebElement(r2R1FunPo.payment_M_Txt);
			clickOnButton(r2R1FunPo.payment_M_Txt);
			Thread.sleep(1000);
		} else {
			assertTrue(clickOnButton(r2CheckOutPo.logoHeader));
			assertTrue(clickOnButton(myAccountPo.myAccount));
			assertTrue(clickOnButton(myAccountPo.myAccount_MyAccountList_Payment_lnk));
			Thread.sleep(1000);
		}

	}

}
