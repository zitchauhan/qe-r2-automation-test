package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CHECKOUT_K4058_SD extends CommonActionHelper {
	 R1_GlobalElementHeader_Home_PO globalElementHeader=PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	R2_R1_Fun_PO r2_r1_fun_po=PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R2_CheckOut_PO r2CheckOutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	
	@Then("^user navigate to GunStorageAndSafty L_Three$")
	public void user_navigate_to_GunStorageAndSafty_L_Three() throws Throwable 
	{
	
		if("mobile".equalsIgnoreCase(testtype))
		{			
		 	
			Thread.sleep(Constants.thread_low);
			clickOnButton(r2_r1_fun_po.btnOutdoorCategory_M);
			Thread.sleep(Constants.thread_low);
			clickOnButton(r2_r1_fun_po.secCategory_CLPMobile);
			Thread.sleep(Constants.thread_low);
			clickOnButton(r2_r1_fun_po.firearms_M);
			
		}else {
			Thread.sleep(Constants.thread_medium);
			assertTrue(clickOnButton(globalElementHeader.btnShopCategory));
			Thread.sleep(Constants.thread_low);
			
			clickOnButton(r2_r1_fun_po.btnOutdoorCategory);
			Thread.sleep(Constants.thread_low);
			clickOnButton(r2_r1_fun_po.btnShootingCategory);
			waitForPageLoad(driver);
			clickOnButton(r2_r1_fun_po.ProductgunStorageSafty);
		}
		
		
	}
	@Then("^user select the product from L_Three and navigate to PDP$")
	public void user_select_the_product_from_L_Three_and_navigate_to_PDP() throws Throwable {
	   waitForPageLoad(driver);
		assertTrue(clickOnButton(r2_r1_fun_po.productSelection));
	}
	
	@Then("^user fill the PO box in shipping address and verify error message$")
	public void user_fill_the_PO_box_in_shipping_address_and_verify_error_message() throws Throwable {
		setInputText(r2CheckOutPo.inputCheckoutFirstName, webPropHelper.getTestDataProperty("FirstName"));
		setInputText(r2CheckOutPo.inputCheckoutLasttName, webPropHelper.getTestDataProperty("LastName"));
		setInputText(r2CheckOutPo.inputCheckoutPhoneNumber, webPropHelper.getTestDataProperty("PhoneNumber"));
		setInputText(r2CheckOutPo.inputCheckoutAddress, webPropHelper.getTestDataProperty("PO_ADDRESS"));
		setInputText(r2CheckOutPo.inputCheckoutZipCode, webPropHelper.getTestDataProperty("PO_ZIPCODE"));
		assertTrue(clickOnButton(r2CheckOutPo.btnGoToShippingMethod));
		assertTrue(isDisplayed(r2CheckOutPo.AddressVerification_MSG));
	}
	
	@Then("^user navigate to L_Three Kayak$")
	public void user_navigate_to_L_Three_Kayak() throws Throwable {
if("mobile".equalsIgnoreCase(testtype)){			
	Thread.sleep(Constants.thread_low);
	clickOnButton(r2_r1_fun_po.btnOutdoorCategory);
	Thread.sleep(Constants.thread_low);
	clickOnButton(r2_r1_fun_po.boating_txt_M);
	Thread.sleep(Constants.thread_low);
	clickOnButton(r2_r1_fun_po.kayakCanoes_txt_M);

		}else {
			Thread.sleep(Constants.thread_medium);
			assertTrue(clickOnButton(globalElementHeader.btnShopCategory));
			Thread.sleep(Constants.thread_low);
			moveHover(r2_r1_fun_po.btnOutdoorCategory);
			Thread.sleep(Constants.thread_low);
			clickOnButton(r2_r1_fun_po.boating_txt);
			waitForPageLoad(driver);
			clickOnButton(r2_r1_fun_po.kayakCanoes_txt);
		}
	}
	
	@Then("^usr select the kayak and navigate to PDP page$")
	public void usr_select_the_kayak_and_navigate_to_PDP_page() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)){
		clickOnButton(r2_r1_fun_po.pelican_txt_M);
		Thread.sleep(Constants.thread_medium);
		}else {
			Thread.sleep(Constants.thread_medium);
		//Actions a=new Actions(driver);
		//a.moveToElement(r2_r1_fun_po.intexKayak_txt).click().build().perform();
		//clickOnLink(r2_r1_fun_po.intexKayak_txt);
			JavascriptExecutor je = (JavascriptExecutor) driver; //Updated by MJR 23/7/19
			je.executeScript("arguments[0].scrollIntoView(true);",r2_r1_fun_po.intexKayak_txt);
			je.executeScript("arguments[0].click();",r2_r1_fun_po.intexKayak_txt);
			 
		
		}
	}

}
