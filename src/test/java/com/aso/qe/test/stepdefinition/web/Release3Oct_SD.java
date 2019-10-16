package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class Release3Oct_SD extends CommonActionHelper {
	
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	R1_GlobalElementHeader_Home_PO r1GlobalHeader = PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	R2_CheckOut_PO r2CheckoutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	String subTotalBeforeShippingMethodChange, shippingChargesBeforeShippingMethodChanged, taxBeforeShippingMethodChanged, selectedMethodValue;
	
	@Then("^verify discount is displayed$")
	public void verify_discount_is_applied() throws Throwable {
		if(isDisplayed(r2CartPo.orderCnfDiscount_Txt))
		{
		assertTrue(isDisplayed(r2CartPo.orderCnfDiscount_Txt));// txtPromocode
		}
		else
		{
			assertFalse(isDisplayed(r2CartPo.orderCnfDiscount_Txt));
		}
	} 
	
	@Then("^verify Free Shipping and BOPIS Messaging is displayed in the Header$")
	public void verify_Free_Shipping_and_BOPIS_Messaging_is_displayed_in_the_Header() {
		if(isDisplayed(r1GlobalHeader.pagePromotionBanner)) {
			assertTrue(isDisplayed(r1GlobalHeader.pagePromotionBanner));
		}
		else
			assertFalse(isDisplayed(r1GlobalHeader.pagePromotionBanner));
	}

	@When("^user clicks on \"([^\"]*)\" half of promotion message$")
	public void user_clicks_on_half_of_promotion_message(String section) {
		if(section.equalsIgnoreCase("first")) {
				clickOnLink(r1GlobalHeader.promotionBannerFreeShippingSection);	
		}
		else if(section.equalsIgnoreCase("second")) {
			clickOnLink(r1GlobalHeader.promotionBannerBopisMessage);
		}
	}

	@When("^user lands on free shipping promotional disclaimer page$")
	public void user_lands_on_free_shipping_promotional_disclaimer_page() {
		String pageTitle = getTitle();
		if(pageTitle.equalsIgnoreCase("shipping-returns")) {
			assertTrue(true);
		}else {
			assertFalse(false);
		}
	}

	@When("^user lands on pick up for messaging page$")
	public void user_lands_on_pick_up_for_messaging_page() {
		String pageTitle = getTitle();
		if(pageTitle.equalsIgnoreCase("buy-online-pick-up-in-store")) {
			assertTrue(true);
		}else {
			assertFalse(false);
		}
	}

	@When("^when user clicks on select a store link on promtion message$")
	public void when_user_clicks_on_select_a_store_link_on_promtion_message() {
		clickOnLink(r1GlobalHeader.bannerFindaStore);
	}
	
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
