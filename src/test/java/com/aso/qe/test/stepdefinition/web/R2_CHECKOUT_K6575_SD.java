package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K6575_SD extends CommonActionHelper {
	
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	R2_CheckOut_PO r2CheckoutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	
	@Then("^user will click on Checkout button and navigates to Checkout page$")
	public void user_will_click_on_Checkout_button_and_navigates_to_Checkout_page() throws Throwable {
		assertTrue(clickOnButton(r2SanityPo.AS_btnCheckout));
		Thread.sleep(3000);
	}

	@Then("^user clicks on mini cart Icon in checkout page$")
	public void user_clicks_on_mini_cart_Icon_in_checkout_page() throws Throwable {
		waitForElement(r2CheckoutPo.btnMiniCart);
		assertTrue(clickOnButton(r2CheckoutPo.btnMiniCart));
	}

	@Then("^user should navigates to the CartPage \"(.*?)\"$")
	public void user_should_navigates_to_the_CartPage(String tittle) throws Throwable {
		//String actualTittle=driver.getTitle();
		webPropHelper.getTestDataProperty(tittle);	
		assertEquals(driver.getTitle(), webPropHelper.getTestDataProperty(tittle));
	}

	@Then("^user clicks on Academy sports Logo$")
	public void user_clicks_on_Academy_sports_Logo() throws Throwable {
		waitForElement(r2CheckoutPo.logoHeader);
		assertTrue(clickOnButton(r2CheckoutPo.logoHeader));
	}	
	
	@Then("^user should navigate user to the HomePage \"(.*?)\"$")
	public void user_should_navigate_user_to_the_HomePage(String tittle) throws Throwable {
		assertEquals(driver.getTitle(), webPropHelper.getTestDataProperty(tittle));
	}
	
	@Then("^user should able to see Academy Business Logo$")
	public void user_should_able_to_see_Academy_Business_Logo() throws Throwable {
		waitForElement(r2CheckoutPo.btnMiniCart);
		assertTrue(isDisplayed(r2CheckoutPo.logoHeader));
	}

	@Then("^verify the presence of the following in the Order Summary$")
	public void verify_the_presence_of_the_following_in_the_Order_Summary() throws Throwable {
		assertTrue(isDisplayed(r2CheckoutPo.txtSubTotal));		
		assertTrue(isDisplayed(r2CheckoutPo.txtEsitmatedShipping));
		assertTrue(isDisplayed(r2CheckoutPo.txtExtimatedTax));	
		assertTrue(isDisplayed(r2CheckoutPo.txtTotalDiscount));
	}
	
//	@Then("^user verifies item summary of Shipping items$")
//	public void user_verifies_item_summary_of_Shipping_items() throws Throwable {
//		assertTrue(isDisplayed(r2CheckoutPo.DetailOrderSummary_txt)); 
//	}
	
	
	@Then("^user in checkout page And verify items count$")
	public void user_in_checkout_page_And_verify_items_count() throws Throwable {
		assertTrue(isDisplayed(r2CheckoutPo.txtItems));
	}

	@Then("^Item summary with number of pick up items should display in checkout page$")
	public void item_summary_with_number_of_pick_up_items_should_display_in_checkout_page() throws Throwable {
		assertTrue(isDisplayed(r2CheckoutPo.DetailOrderSummary_txt)); 
		assertTrue(isDisplayed(r2CheckoutPo.txtQuantity));
		
	}
	
	
	@Then("^user should see the mini cart Icon with no\\. of items in cart notifier$")
	public void user_should_see_the_mini_cart_Icon_with_no_of_items_in_cart_notifier() throws Throwable {
		assertTrue(isDisplayed(r2CheckoutPo.R2_iconMiniCartCheckout));
		assertTrue(isDisplayed(r2CheckoutPo.R2_miniCartCountCheckout));
	}

}
