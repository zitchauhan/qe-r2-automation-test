package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CHECKOUT_K4119_SD extends CommonActionHelper {
	 R1_GlobalElementHeader_Home_PO globalElementHeader=PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	R2_R1_Fun_PO r2_r1_fun_po=PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R2_CheckOut_PO r2CheckOutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R1_PDP_PO pdp_po =PageFactory.initElements(driver, R1_PDP_PO.class);
	Actions hover = new Actions(getDriver());
	@Given("^navigate plp to shipping & pickup$")
	public void navigate_plp_to_shipping_pickup() throws Throwable {
		Thread.sleep(3000);
		assertTrue(clickOnButton(globalElementHeader.btnShopCategory));
		Thread.sleep(2000);
		
		hover.moveToElement(globalElementHeader.btnOutdoorsCategory).build().perform();
		assertTrue(clickOnButton(r2_r1_fun_po.boating_txt ));
		hover.moveToElement(r2_r1_fun_po.ProdutCard_img).build().perform();
		hover.moveToElement(pdp_po.btnQuickView).click().build().perform();
		Thread.sleep(2000);
		
		
		
	}
	
	@Then("^Verify that Add to Cart CTA is displayed$")
	public void verify_that_Add_to_Cart_CTA_is_displayed() throws Throwable {
		waitForElement(r2_r1_fun_po.AddToCart_btn);
		Thread.sleep(2000);
		assertTrue(clickOnButton(r2_r1_fun_po.AddToCart_btn));
		Thread.sleep(20000);
	}
	
	@Then("^verify that View Cart and Checkout CTA is displayed$")
	public void verify_that_View_Cart_and_Checkout_CTA_is_displayed() throws Throwable {
		assertTrue(isDisplayed(pdp_po.btnViewCart));
		//assertTrue(isDisplayed(pdp_po.btnAddToCart));
	}

	
	
//	@Then("^user verify all the paypal and more radio btn is disable$")
//	public void user_verify_all_the_paypal_and_more_radio_btn_is_disable() throws Throwable {
//	 assertTrue(isEnabled(r2CheckOutPo.CreditCard_radioBtn)); 
//	 assertTrue(isEnabled(r2CheckOutPo.PayPal_radioBtn)); 
////	 assertTrue(isEnabled(r2CheckOutPo.rdbtnGooglePay)); 
//	
//	}
//
//	@Then("^user click on paypal$")
//	public void user_click_on_paypal() throws Throwable {
////	    waitForElement(r2CheckOutPo.PayPal_radioBtn);
//		clickOnButton(r2CheckOutPo.PayPal_radioBtn);
//		Thread.sleep(1000);
//	}
//	
//	@Then("^user change the quantity of item in PDP$")
//	public void user_change_the_quantity_of_item_in_PDP() throws Throwable {
//	    clickOnButton(pdp_po.btnQuantityInc);
//	    clickOnButton(pdp_po.btnQuantityInc);
//	    clickOnButton(pdp_po.btnQuantityInc);
//	}
//	
//	@Then("^user click on paypal radiobtn$")
//	public void user_click_on_paypal_radiobtn() throws Throwable {
//	   clickOnButton(r2CheckOutPo.PayPal_radioBtn);
//	}
//	@Then("^user switch to iframe to verify paypalcheckoutBtn$")
//	public void user_switch_to_iframe_to_verify_paypalcheckoutBtn() throws Throwable {
//	    Thread.sleep(2000);
//		driver.switchTo().frame(r2_r1_fun_po.paypalCheckoutFrame);
//	}
//	@Then("^user click on ADD Another Gift Card$")
//	public void user_click_on_ADD_Another_Gift_Card() throws Throwable {
//	    clickOnButton(r2CheckOutPo.AddAnotherGiftCard_Txt);
//	}
//	@Then("^user fill email address in payment$")
//	public void user_fill_email_address_in_payment() throws Throwable {
//	   setInputText(r2CheckOutPo.EmailAddressforOrderConfirmation_Input, webPropHelper.getTestDataProperty("EmailWithExistingCreditCard"));
//	}
	@Then("^user verify item added successfully$")
	public void user_verify_item_added_successfully() throws Throwable {
	    isDisplayed(pdp_po.msgItemAddedSuccessfully);
	}

}
