package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;


import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;


import cucumber.api.java.en.Then;



public class R2_CHECKOUT_K6823_SD extends CommonActionHelper {
	R2_MyAccount_PO myAccountPo= PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R2_CheckOut_PO checkout_po=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	@Then("^user fill the gift card in My Account$")
	public void user_fill_the_gift_card_in_My_Account() throws Throwable {
	   
		 setInputText(myAccountPo.txtGiftCardNumber, webPropHelper.getTestDataProperty("Valid16DigitGiftCardNumber"));
		 setInputText(myAccountPo.txtGifCardPin, webPropHelper.getTestDataProperty("Valid8DigitGiftCardPIN"));
		 assertTrue(clickOnButton((myAccountPo.btnAddGiftCard)));
	}

	@Then("^user click on choose Gift card Dropdown$")
	public void user_click_on_choose_Gift_card_Dropdown() throws Throwable {
	  clickOnButton(checkout_po.checkOutGiftCardDropDown);
	}
	@Then("^user click on apply giftcard button$")
	public void user_click_on_apply_giftcard_button() throws Throwable {
	    clickOnButton(checkout_po.apply_btn);
	}

	@Then("^user click on remove gift card$")
	public void user_click_on_remove_gift_card() throws Throwable {
	  clickOnButton(checkout_po.btnRemoveGiftCard);
	}




}
