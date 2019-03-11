package com.aso.qe.test.stepdefinition.web.plcc;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Registration_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class R1_Discounts_BuyNow_106_Web extends CommonActionHelper{
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);
	R1_PLCC_Registration_PO plccPageObjects = PageFactory.initElements(driver, R1_PLCC_Registration_PO.class);
	R1_PDP_PO PDPpagePO = PageFactory.initElements(driver, R1_PDP_PO.class);
	@When("^user click on Buy Now button$")
	public void user_clicks_on_Buy_Now_button() throws Throwable {
		try {
			genericPO.verifyPresenceOfBuyNowButton();
			genericPO.buyNowButton.click();
		} catch (Exception e) {
			System.out.println("Exception Message: "+e.getMessage());
		}
	}
	@When("^user click on Buy Now in pop up modal$")
	public void user_click_on_Buy_Now_in_pop_up_modal() throws Throwable {
		genericPO.buyNowButton.click();
	}
	
	@Given("^user click on Enable BuyNow button$")
	public void user_click_on_Enable_BuyNow_button() throws Throwable {
		PDPpagePO.btnEnablebuynow.click();
	}
	
	@Given("^user select SameAsShippingAddress checkbox$")
	public void user_select_SameAsShippingAddress_checkbox() throws Throwable {
		genericPO.selctsameAsShippingcheckbox.click();
	}
	
	@Given("^user enter Email Address \"(.*?)\" for Enable BuyNow page$")
	public void user_enter_Email_Address_for_Enable_BuyNow_page(String arg1) throws Throwable {
		plccPageObjects.enterEmailAddressTxtFieldEnableBuyNow(arg1);
	}
	
	@Given("^user click on Buy Now button in pop up modal$")
	public void user_click_on_Buy_Now_button_in_pop_up_modal() throws Throwable {
		try {
			String MainWindow=driver.getWindowHandle();	
			Set<String> s1=driver.getWindowHandles();		
			Iterator<String> i1=s1.iterator();		
			System.out.println("SET"+s1);
			while(i1.hasNext())			
			{		
			    String ChildWindow=i1.next();		
			    		
			    if(!MainWindow.equalsIgnoreCase(ChildWindow))			
			    {    		
			            // Switching to Child window
			            driver.switchTo().window(ChildWindow);
			            genericPO.clickBuynowBtnInPopupModal.click();
			            Thread.sleep(5000);
			    }
			}
		} catch (Exception e) {
			
		}
	}
	
	@Given("^user click on Default PaymentFormSubmit Button for BuyNow$")
	public void user_click_on_Default_PaymentFormSubmit_Button_for_BuyNow() throws Throwable {
		genericPO.btndefaultPaymentFormSubmit.click();
	}
	
	@Given("^user expect PLCCFreeShipping discount displayed$")
	public void user_expect_PLCCFreeShipping_discount_displayed() throws Throwable {
	   
	}



}
