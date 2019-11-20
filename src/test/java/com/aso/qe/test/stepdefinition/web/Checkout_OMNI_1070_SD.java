package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class Checkout_OMNI_1070_SD extends CommonActionHelper {
	
	R2_CheckOut_PO r2CheckoutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	String subTotalBeforeShippingMethodChange, shippingChargesBeforeShippingMethodChanged, taxBeforeShippingMethodChanged, selectedShippingMethod;
	
	@Then("^user verify order summay is updated$")
	public void user_verify_order_summay_is_updated() {
		assertTrue(subTotalBeforeShippingMethodChange.equalsIgnoreCase(getText(r2CheckoutPo.SubTotalPrice_Txt)));
		selectedShippingMethod = getText(r2CheckoutPo.checkout_ShippingMethod_ShippingMethodType_btn);
		if(selectedShippingMethod.contains("FREE")) {
			selectedShippingMethod = "FREE";
		}else {
			int i = selectedShippingMethod.indexOf('$');
			selectedShippingMethod = selectedShippingMethod.substring(i, selectedShippingMethod.length());
			selectedShippingMethod = selectedShippingMethod.substring(0, selectedShippingMethod.indexOf('\n')).trim();
			
		}
		assertTrue(getText(r2CheckoutPo.ShippingPrice_Txt).contains(selectedShippingMethod));
		if(!shippingChargesBeforeShippingMethodChanged.equals(selectedShippingMethod))
			assertTrue(!taxBeforeShippingMethodChanged.equals(getText(r2CheckoutPo.TaxesPrice_Txt)));
	}
	
	@And("^user get order summary details$")
	public void user_get_order_summary_details() {
		subTotalBeforeShippingMethodChange = getText(r2CheckoutPo.SubTotalPrice_Txt);
		shippingChargesBeforeShippingMethodChanged = getText(r2CheckoutPo.ShippingPrice_Txt);
		taxBeforeShippingMethodChanged = getText(r2CheckoutPo.TaxesPrice_Txt);
	}

}
