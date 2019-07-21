package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K4332_SD extends CommonActionHelper {
	
	R2_CheckOut_PO r2CheckOutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	R2_Cart_PO r2CartPO=PageFactory.initElements(driver, R2_Cart_PO.class);
	String productName="";
	R2_R1_Fun_PO r2R1FunPO=PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	
	@Then("^verify the buy now button is clickable$")
	public void verify_the_buy_now_button_is_clickable() throws Throwable {
		if(isEnabled(r2R1FunPO.BuyNow_btn)) {
			assertTrue(clickOnButton(r2R1FunPO.BuyNow_btn));
			//Commented by Rahul on 18.07.19
			//Thread.sleep(Constants.thread_highest);
			//Thread.sleep(Constants.thread_highest);
			//Thread.sleep(Constants.thread_low);
		}
		
	}
	
	@And("^user enters CVV \"(.*?)\" on Buy Now Popup modal$")
	public void user_enters_CVV_on_Buy_Now_Popup_modal(String CVV) throws Throwable {
		r2CheckOutPo.enterCVVBuyNowModal(webPropHelper.getTestDataProperty(CVV));
		
	}
	
	@Then("^user clicks Buy Now button on Buy Now Popup modal$")
	public void user_clicks_Buy_Now_button_on_Buy_Now_Popup_modal() throws Throwable {
		if(isEnabled(r2CheckOutPo.BuyNow_Modal)) {
			assertTrue(clickOnButton(r2CheckOutPo.BuyNow_Modal));
			Thread.sleep(Constants.thread_highest);
			//Thread.sleep(Constants.thread_highest);
			//Thread.sleep(Constants.thread_low);
		}
	    
	}
	
}
