package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.Then;

public class Checkout_OMNI_1070_SD extends CommonActionHelper {
	
	R2_CheckOut_PO r2CheckoutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	String subTotalBeforeShippingMethodChange, shippingChargesBeforeShippingMethodChanged, taxBeforeShippingMethodChanged, selectedMethodValue;
	
	
	@Then("^user upgrade the shipping method from the shipping method dropdown$")
	public void user_upgrade_the_shipping_method_from_the_shipping_method_dropdown() {
		
		subTotalBeforeShippingMethodChange = getText(r2CheckoutPo.SubTotalPrice_Txt);
		shippingChargesBeforeShippingMethodChanged = getText(r2CheckoutPo.ShippingPrice_Txt);
		taxBeforeShippingMethodChanged = getText(r2CheckoutPo.TaxesPrice_Txt);
		
		clickOnButton(r2CheckoutPo.checkout_ShippingMethod_ShippingMethodType_btn);
		selectedMethodValue = r2CheckoutPo.selectNextAvaiableShippingMethod();
				
	}

	@Then("^user verify order summay is updated$")
	public void user_verify_order_summay_is_updated() {
		assertTrue(subTotalBeforeShippingMethodChange.equalsIgnoreCase(getText(r2CheckoutPo.SubTotalPrice_Txt)));
		assertTrue(getText(r2CheckoutPo.ShippingPrice_Txt).contains(selectedMethodValue));
		if(!shippingChargesBeforeShippingMethodChanged.equals(selectedMethodValue))
			assertTrue(!taxBeforeShippingMethodChanged.equals(getText(r2CheckoutPo.TaxesPrice_Txt)));
	}

}
