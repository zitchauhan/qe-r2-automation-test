package com.aso.qe.test.stepdefinition.web;


import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R1_ShoppingCartView_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R1_HP_K725_SD extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(R1_HP_K725_SD.class);

	public R1_ShoppingCartView_PO shoppingCartViewPO =  PageFactory.initElements(getDriver(), R1_ShoppingCartView_PO.class);
    public R1_PDP_PO pdp=PageFactory.initElements(getDriver(), R1_PDP_PO.class);
    R2_CheckOut_PO r2CheckoutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
    public R2_Sanity_PO sanity=PageFactory.initElements(getDriver(), R2_Sanity_PO.class);
	@Then("^User should be able to click on MiniCart icon and navigate to My cart page and Validate Shopping Cart$")
	public void user_should_be_able_to_click_on_MiniCart_icon_and_navigate_to_My_cart_page_and_Validate_Shopping_Cart() throws Throwable {
		logger.debug("user_should_be_able_to_click_on_MiniCart_icon_and_navigate_to_My_cart_page_and_Validate_Shopping_Cart");

		shoppingCartViewPO.clickOnCartIcon();
		shoppingCartViewPO.compareCartEmptyTxt("YOUR CART IS EMPTY");
	}

	@Then("^User should be dispalyed with message Your Shopping Cart is Empty$")
	public void user_should_be_dispalyed_with_message_Your_Shopping_Cart_is_Empty() throws Throwable {
		
		shoppingCartViewPO.compareCartEmptyTxt("YOUR CART IS EMPTY");
	
	}
	
	

	@Then("^User clicks on the minicart icon and navigated to minicart$")
	public void user_clicks_on_the_minicart_icon_and_navigated_to_minicart() throws Throwable {
		
		if("mobile".equalsIgnoreCase(testtype)){	
			clickOnButton(shoppingCartViewPO.cartIcon_M);
		}else {
			shoppingCartViewPO.clickOnCartIcon();	
		}
	        
	}

	@Then("^User should able to see the section where all the product are displayed$")
	public void user_should_able_to_see_the_section_where_all_the_product_are_displayed() throws Throwable {
	   
		assertTrue(isDisplayed(shoppingCartViewPO.secProductInCart));
	}
	
	@And("^user click on view cart$")
	public void user_click_on_view_cart() throws Throwable {
	    assertTrue(clickOnButton(pdp.btnViewCart));
		Thread.sleep(Constants.thread_high);
		System.out.println(sanity.AS_txtYourCart.getText());
		Thread.sleep(Constants.thread_highest);
		assertTrue(isDisplayed(sanity.AS_txtYourCart));
		
		}
		
	@And("^user select the option for Store pick up$")
	public void user_select_the_option_for_Storepickup() throws Throwable {
	    assertTrue(clickOnButton(pdp.StorePickupCheckboxCart));
		Thread.sleep(Constants.thread_high);
		
		}
	
	@And("^Verify that user should be able to navigate to the cart page and the item should be successfully added to cart$")
	public void Verify_that_user_able_to_navigate_to_cart_page_and_the_item_should_be_successfully_added_to_cart() throws Throwable {
	    assertTrue(isDisplayed(pdp.CartTitle));
		Thread.sleep(Constants.thread_high);
		assertTrue(isDisplayed(pdp.WGItemOnCart));
		}
	
	
	@And("^Verify that the Store pick up is selected and Home delivery option is unselected$")
	public void Verify_that_the_Store_pick_up_is_selected_and_Home_delivery_option_is_unselected() throws Throwable {
	    assertTrue(clickOnButton(pdp.StorePickupEstimate));
		Thread.sleep(Constants.thread_high);
		assertTrue(!isSelected(pdp.ShipToMe));
		assertTrue(isSelected(pdp.StorePickupEstimate));
		}
	
	@And("^Verify that after selecting the Home delivery option again the Store pick up option should be unselected$")
	public void Verify_that_after_selecting_Homedelivery_Storepick_up_option_should_be_unselected() throws Throwable {
	    assertTrue(clickOnButton(pdp.ShipToMe));
		Thread.sleep(Constants.thread_high);
		assertTrue(!isSelected(pdp.StorePickupEstimate));
		assertTrue(!isSelected(pdp.ShipToMe));
		}
	
		
	@Then("^verify child SKU of the product is displayed on the Cart page$")
	public void verify_child_SKU_of_the_product_is_displayed_on_Cart_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		waitForElement(shoppingCartViewPO.childskucartfirst);
	   assertTrue(isDisplayed(shoppingCartViewPO.childskucartfirst));
	   assertTrue(isDisplayed(shoppingCartViewPO.childskucartsecond));
	}
	
	@And("^close the pop up$")
	public void close_the_pop_up() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(clickOnButton(shoppingCartViewPO.closepopup));
	}

	
	@Then("^verify the message for whiteGlove item and DSV item on the cart page$")
	public void verify_the_message_for_whiteGlove_item_and_DSV_item_on_the_cart_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		waitForElement(shoppingCartViewPO.whiteglovemessage);
	   assertTrue(isDisplayed(shoppingCartViewPO.whiteglovemessage));
	   
	   waitForElement(shoppingCartViewPO.DSVmessage);
	   assertTrue(isDisplayed(shoppingCartViewPO.DSVmessage));
	}

	@Then("^Verify that the Category level promotion is applied and displayed on cart page$")
	public void verify_the_Category_level_promotion_is_displayed_on_Cart_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		waitForElement(shoppingCartViewPO.CMCPromotion);
	   assertTrue(isDisplayed(shoppingCartViewPO.CMCPromotion));
	 
	}
	
	@Then("^Verify the Category level promotion is applied and displayed on Order Summary section$")
	public void verify_the_Category_level_promotion_is_displayed_on_Order_Summary_Section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		waitForElement(shoppingCartViewPO.DiscountOrderSummary);
		assertTrue(clickOnButton(shoppingCartViewPO.DiscountOrderSummary));
	   assertTrue(isDisplayed(shoppingCartViewPO.DiscountPromotionOrderSummary));
	 
	}
	
	
}
