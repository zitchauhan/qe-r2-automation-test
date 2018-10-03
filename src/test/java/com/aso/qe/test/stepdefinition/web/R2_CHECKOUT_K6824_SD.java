package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;


public class R2_CHECKOUT_K6824_SD extends CommonActionHelper {
	
	R2_CheckOut_PO r2CheckOutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	

	@And("^verify GiftCard and Pin field$")
	public void verify_GiftCard_and_Pin_field() throws Throwable {
		assertTrue(isDisplayed(r2CheckOutPo.txtGiftcardNumber));
		assertTrue(isDisplayed(r2CheckOutPo.txtPin));
	}

	@Then("^user click on GiftCard Minus icon in Checkout page$")
	public void user_click_on_GiftCard_Minus_icon_in_Checkout_page() throws Throwable {
		assertTrue(clickOnButton(r2CheckOutPo.minusIconGiftCard));
	}
	
	
	@Then("^verify Gift Card in order summary page$")
	public void verify_Gift_Card_in_order_summary_page() throws Throwable {
		assertTrue(isDisplayed(r2CheckOutPo.txtGiftCardOrderSummaryPage));
	}
	
	
	@And("^verify \\+ Add another Gift Card$")
	public void verify_Add_another_Gift_Card() throws Throwable {
		assertTrue(isDisplayed(r2CheckOutPo.plusAnotherIconGiftCard));
		assertTrue(clickOnButton(r2CheckOutPo.plusAnotherIconGiftCard));
	}

	@And("^verify Hide Gift Card$")
	public void verify_Hide_Gift_Card() throws Throwable {
		assertTrue(isDisplayed(r2CheckOutPo.minusIconGiftCard));
	}
	
	@Then("^\\+Add Another Gift Card should be suppressed$")
	public void add_Another_Gift_Card_should_be_suppressed() throws Throwable {
		assertFalse(isDisplayed(r2CheckOutPo.plusAnotherIconGiftCard));
	}

	@And("^clicking on Remove and Remove icon should remove the applied GC$")
	public void clicking_on_Remove_and_Remove_icon_should_remove_the_applied_GC() throws Throwable {
		assertTrue(clickOnButton(r2CheckOutPo.btnRemoveGiftCard));
		Thread.sleep(Constants.thread_high);
		assertFalse(isDisplayed(r2CheckOutPo.btnRemoveGiftCard));
	}

}
