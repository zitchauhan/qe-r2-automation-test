package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import cucumber.api.java.en.When;

public class R2_CHECKOUT_K4030_SD extends CommonActionHelper {

	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_R1_Fun_PO r2_r1_fun_po = PageFactory.initElements(driver, R2_R1_Fun_PO.class);

	@When("^user click on edit button of shipping method$")
	public void user_click_on_edit_button_of_shipping_method() throws Throwable {
		assertTrue(clickOnButton(r2CheckOutPo.checkout_ShippingMethod_Edit_lnk));
	}

	@When("^user click on edit button of shipping address$")
	public void user_click_on_edit_button_of_shipping_address() throws Throwable {
		assertTrue(clickOnButton(r2CheckOutPo.btnEditShippingAddress));
	}

	@When("^user modifies shipping method$")
	public void user_modifies_shipping_method() throws Throwable {
		assertTrue(clickOnButton(r2CheckOutPo.checkout_ShippingMethod_ShippingMethodType_btn));
		String selectedShippingMethod = getText(r2CheckOutPo.checkout_ShippingMethod_ShippingMethodType_btn);
		List<WebElement> shippingMethodList = r2CheckOutPo.checkout_ShippingMethod_List_dd
				.findElements(By.tagName("li"));
		for (WebElement li : shippingMethodList) {
			if (!(li.getText().contains(selectedShippingMethod))) {
				li.click();
				break;
			}
		}
		Thread.sleep(Constants.thread_medium);
	}

	@When("^user is able to modify payment method$")
	public void user_is_able_to_modify_payment_method() throws Throwable {
		if (isDisplayed(r2CheckOutPo.chooseCreditcard_Dd)) {
			assertTrue(clickOnButton(r2CheckOutPo.chooseCreditcard_Dd));
			String selectedPaymentMethod = getText(r2CheckOutPo.chooseCreditcard_Dd);
			List<WebElement> paymentMethodList = r2CheckOutPo.checkout_PaymentMethod_List_dd
					.findElements(By.tagName("li"));
			for (WebElement li : paymentMethodList) {
				if (!(li.getText().contains(selectedPaymentMethod))) {
					li.click();
					break;
				}
			}
			String newPaymentMethod = getText(r2CheckOutPo.chooseCreditcard_Dd);
			assertTrue(!(selectedPaymentMethod.equals(newPaymentMethod)));
		} else {
			clickOnButton(r2CheckOutPo.PayPal_radioBtn);
			Thread.sleep(Constants.thread_low);
			driver.switchTo().frame(r2_r1_fun_po.paypalCheckoutFrame);
			assertTrue(isDisplayed(r2CheckOutPo.PayPalCheckOut_Btn));
		}

	}

	@When("^user is able to modify shipping address$")
	public void user_modifies_shipping_address() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(r2CheckOutPo.chooseShippingAddress_Dd_Mob));
		} else {
			assertTrue(clickOnButton(r2CheckOutPo.chooseShippingAddress_Dd));
		}
		String selectedAddress = getText(r2CheckOutPo.checkout_ShippingAddress_List_dd);
		List<WebElement> paymentMethodList = r2CheckOutPo.checkout_ShippingAddress_List_dd
				.findElements(By.tagName("li"));
		for (WebElement li : paymentMethodList) {
			if (!(li.getText().contains(selectedAddress))) {
				li.click();
				break;
			}
		}
		String newPaymentMethod = getText(r2CheckOutPo.chooseShippingAddress_Dd);
		assertTrue(!(selectedAddress.equals(newPaymentMethod)));

	}

}
