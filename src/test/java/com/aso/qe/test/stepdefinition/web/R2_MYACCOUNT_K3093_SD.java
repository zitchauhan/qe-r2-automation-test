package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class R2_MYACCOUNT_K3093_SD extends CommonActionHelper {
	
	R2_MyAccount_PO myAccountPo= PageFactory.initElements(driver, R2_MyAccount_PO.class);
	public R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(getDriver(),R1_GlobalElementHeader_Home_PO.class);
	@Given("^user clicks on payment tab$")
	public void user_clicks_on_payment_tab() throws Throwable {
		
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(clickOnButton(myAccountPo.lnkPayment_Mobile));	
		}else
		{
	    assertTrue(clickOnButton(myAccountPo.lnkPayment));
		}
	}
	
	@Given("^user clicks on Add New Gift Card button$")
	public void user_clicks_on_Add_New_Gift_Card_button() throws Throwable {
		assertTrue(clickOnButton(myAccountPo.btnAddNewGiftCard));
	}
	
	@Given("^User has empty wallet with no Gift Card added$")
	public void user_has_empty_wallet_with_no_Gift_Card_added() throws Throwable {
		if(isDisplayed((myAccountPo.btnAddGiftCardPlusIcon))){
			for(WebElement btnRemove: myAccountPo.btnRemoveGiftCardList) {
		    	if(isDisplayed(btnRemove))
		    		assertTrue(clickOnButton(btnRemove));
			}
		}
		
	    
	}

	@Given("^user enter valid \"(.*?)\" in Gift Card Number text field$")
	public void user_enter_valid_in_Gift_Card_Number_text_field(String arg1) throws Throwable {
	    setInputText(myAccountPo.txtGiftCardNumber, webPropHelper.getTestDataProperty(arg1));
	}

	@Given("^user enter valid \"(.*?)\" in Gift Card PIN text field$")
	public void user_enter_valid_in_Gift_Card_PIN_text_field(String arg1) throws Throwable {
		setInputText(myAccountPo.txtGifCardPin, webPropHelper.getTestDataProperty(arg1));
	}

	@Given("^clicks on Add button to add gift card$")
	public void clicks_on_Add_button_to_add_gift_card() throws Throwable {
		if(isDisplayed(myAccountPo.btnAddGiftCard)) 
			assertTrue(clickOnButton((myAccountPo.btnAddGiftCard)));
		else
			assertTrue(clickOnButton((myAccountPo.btnAddGiftCardPlusIcon)));
		
	   
	}


	@Then("^user should be able to see \"(.*?)\" Gift card$")
	public void user_should_be_able_to_see_Gift_card(String arg1) throws Throwable {
		boolean localFlag = false;
		Thread.sleep(2000);
		for(WebElement txtAddedGiftCard: myAccountPo.txtAddedGiftCardList) {
	    	if(isDisplayed(txtAddedGiftCard)) {
	    		String lastFourCharacters = webPropHelper.getTestDataProperty(arg1).substring(webPropHelper.getTestDataProperty(arg1).length() - 4);
	    		if(getText(txtAddedGiftCard).contains(lastFourCharacters)) {
	    			localFlag = true;
	    			break;
	    		}
	    	}
		}
		assertTrue(localFlag);
	}

	@Then("^there should be a Remove link with cross icon$")
	public void there_should_be_a_Remove_link_with_cross_icon() throws Throwable {
		for(WebElement btnRemove: myAccountPo.btnRemoveGiftCardList) {
	    	assertTrue(isDisplayed(btnRemove));
		}
	}
	
	@Then("^user should be able to see available balance$")
	public void user_should_be_able_to_see_available_balance() throws Throwable {
		assertTrue(isDisplayed(myAccountPo.txtAvailableBalance));
		
	}
	
	@Then("^user click on MyAccount breadcrumb$")
	public void user_click_on_MyAccount_breadcrumb() throws Throwable {
		assertTrue(clickOnButton(globalElementHeader.mobileBreadcrumb));
		
	}//KER-2910 CR-RK Sep 4

}
