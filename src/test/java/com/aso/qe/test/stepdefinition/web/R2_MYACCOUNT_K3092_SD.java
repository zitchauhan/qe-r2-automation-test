package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.framework.common.PropertiesHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_MYACCOUNT_K3092_SD extends CommonActionHelper {
	R2_MyAccount_PO myAccountPo= PageFactory.initElements(driver, R2_MyAccount_PO.class);
	
	
	@Then("^user filling the gift card detail$")
	public void user_filling_the_gift_card_detial() throws Throwable {
		/*for (WebElement btnRemove : myAccountPo.btnRemoveGiftCardList) {
			if(isDisplayed(btnRemove))
					clickOnButton(btnRemove);
		}*/
		
		myAccountPo.deleteAllGiftCardsFromMyAccount();
		assertTrue(clickOnButton(myAccountPo.btnAddNewGiftCard));
		setInputText(myAccountPo.txtGiftCardNumber, webPropHelper.getTestDataProperty("validGiftCardNumber"));
		 setInputText(myAccountPo.txtGifCardPin, webPropHelper.getTestDataProperty("validPinNumber"));
		 assertTrue(clickOnButton((myAccountPo.btnAddGiftCard)));
		 Thread.sleep(Constants.thread_medium);
	}
	
	@Then("^user remove the gift card$")
	public void user_remove_the_gift_card() throws Throwable {
		if(isDisplayed(myAccountPo.btnRemove)) {
			clickOnButton(myAccountPo.btnRemove);
			
		}else if(isDisplayed(myAccountPo.btnAddNewGiftCard)) {
			assertTrue(clickOnButton(myAccountPo.btnAddNewGiftCard));
		setInputText(myAccountPo.txtGiftCardNumber, webPropHelper.getTestDataProperty("GIFTCARDNUMBER"));
		 setInputText(myAccountPo.txtGifCardPin, webPropHelper.getTestDataProperty("GIFTCARDPIN"));
		 assertTrue(clickOnButton((myAccountPo.btnAddGiftCard)));
		 Thread.sleep(Constants.thread_highest);
		 clickOnButton(myAccountPo.btnRemove);
		}
	}

}