package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.When;

public class R2_CHECKOUT_K4030_SD extends CommonActionHelper{
	
	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	
	@When("^user click on edit button of shipping method$")
	public void user_click_on_edit_button_of_shipping_method() throws Throwable {
	    assertTrue(clickOnButton(r2CheckOutPo.checkout_ShippingMethod_Edit_lnk));
	}
	
	@When("^user modifies shipping method$")
	public void user_modifies_shipping_method() throws Throwable {
		assertTrue(clickOnButton(r2CheckOutPo.checkout_ShippingMethod_ShippingMethodType_btn));
		String selectedShippingMethod = getText(r2CheckOutPo.checkout_ShippingMethod_ShippingMethodType_btn);
		System.out.println(selectedShippingMethod);
		List<WebElement> countriesList=r2CheckOutPo.checkout_ShippingMethod_List_dd.findElements(By.tagName("li"));
		for (WebElement li : countriesList) {
		if (!(li.getText().contains(selectedShippingMethod))) {
		     li.click();
		     break;
		   }
		}
		System.out.println(selectedShippingMethod);
	}

	

@When("^clicks on confirm or go to payment button$")
public void clicks_on_confirm_or_go_to_payment_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
}
	
	
	


}
