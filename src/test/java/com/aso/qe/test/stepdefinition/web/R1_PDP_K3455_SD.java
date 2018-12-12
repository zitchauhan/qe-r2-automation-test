package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;

import com.aso.qe.test.pageobject.R1_PDP_PO;

import cucumber.api.java.en.Then;

public class R1_PDP_K3455_SD extends CommonActionHelper{
	
	R1_PDP_PO p_po=PageFactory.initElements(driver, R1_PDP_PO.class);
	
	@Then("^User select the product from PDP page$")
	public void user_select_the_product_from_PDP_page() throws Throwable {
	assertTrue(clickOnButton(p_po.selectFirstItem));	
	}
	
	@Then("^User select the avialable item and click on add to cart$")
	public void user_select_the_avialable_item_and_click_on_add_to_cart() throws Throwable {
		p_po.addToCartAvailability();
		p_po.quantityInput.sendKeys("2");
		clickOnButton(p_po.btnAddToCart);
		if("mobile".equalsIgnoreCase(testtype)){	
			assertTrue(isDisplayed(p_po.msgItemAddedSuccessfully_M));
		}else {
			assertTrue(isDisplayed(p_po.msgItemAddedSuccessfully));
		}	
	}
	@Then("^User to verify product is successfully added in cart$")
	public void user_to_verify_product_is_successfully_added_in_cart() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)){	
			assertTrue(isDisplayed(p_po.msgItemAddedSuccessfully_M));
		}else {
				assertTrue(isDisplayed(p_po.msgItemAddedSuccessfully));		
		}
	}

	@Then("^User Verify Bundle price in ATC notification$")
	public void user_Verify_Bundle_price_in_ATC_notification() throws Throwable {		
		if("mobile".equalsIgnoreCase(testtype)){	
			assertTrue(isDisplayed(p_po.msgBundleProductPRice_M));
		}else {
			assertTrue(isDisplayed(p_po.msgBundleProductPRice));
		}
	}
	@Then("^User Verify view cart functionality in ATC noticfication$")
	public void user_Verify_view_cart_functionality_in_ATC_noticfication() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)){	
			assertTrue(isClickable(p_po.btmViewcartATCnotificcation_M));
		}else {
			assertTrue(isClickable(p_po.btmViewcartATCnotificcation));
		}
	}
	
	@Then("^User Verify checkout button in ATC notification$")
	public void user_Verify_checkout_button_in_ATC_notification() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)){	
			assertTrue(isClickable(p_po.btmCheckOutATCnotification_M));
		}else {
			assertTrue(isClickable(p_po.btmCheckOutATCnotification));
		}
	}
	
	
	@Then("^User Verify bundle image in ATC notification$")
	public void user_Verify_bundle_image_in_ATC_notification() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)){	
			assertTrue(isDisplayed(p_po.imgproductATCnotification_M));
		}else {
			assertTrue(isDisplayed(p_po.imgproductATCnotification));
		}
	}
	@Then("^User verify name of added product in ATC notification$")
	public void user_verify_name_of_added_product_in_ATC_notification() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)){	
			assertTrue(isDisplayed(p_po.producrNameATCnotification_M));
		}else {
			assertTrue(isDisplayed(p_po.producrNameATCnotification));
		}
	}
}
