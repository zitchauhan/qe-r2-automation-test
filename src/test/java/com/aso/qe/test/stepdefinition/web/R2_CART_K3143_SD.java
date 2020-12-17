package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_HomePage_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.Then;


public class R2_CART_K3143_SD extends CommonActionHelper {
    R1_HomePage_PO hp=PageFactory.initElements(driver, R1_HomePage_PO.class); 
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	R2_MyAccount_PO myAccountPo= PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R1_PDP_PO pdp=PageFactory.initElements(driver, R1_PDP_PO.class);
	R2_CheckOut_PO r2checkout=PageFactory.initElements(driver,R2_CheckOut_PO.class );
	@Then("^user verify IN Store Pick Up-Free is enable$")
	public void user_verify_IN_Store_Pick_Up_Free_is_enable() throws Throwable {
	   assertTrue(isEnabled(r2CartPo.rbInStorePickUp));
	}
	
	@Then("^user click on My account link$")
	public void user_click_on_My_account_link() throws Throwable {
		
		if("mobile".equalsIgnoreCase(testtype)){	
			scrollPageToWebElement(myAccountPo.myAccount_txt_Mobile);
			clickOnButton(myAccountPo.myAccount_txt_Mobile);
		}else {
			clickOnButton(myAccountPo.lnkMyAccount);
		}
		
//		clickOnButton(myAccountPo.lnkMyAccount);
	}
	@Then("^User click on sign in button on cart page$")
	public void user_click_on_sign_in_button_on_cart_page() throws Throwable {
	   assertTrue(clickOnButton(r2CartPo.btnCrtSignIn));
	}
	@Then("^user sign in on my cart page$")
	public void user_sign_in_on_my_cart_page() throws Throwable {
		setInputText(r2CartPo.WelcomeBackEmailAddress_Input, webPropHelper.getTestDataProperty("EmailAddress"));
		setInputText(r2CartPo.WelcomeBackPassword_Input, webPropHelper.getTestDataProperty("Password"));
		assertTrue(clickOnButton(r2CartPo.WelcomeBackSignIN_Btn));
		
	}
//	@Then("^user will empty the cart if product is in cart$")
//	public void user_will_empty_the_cart_if_product_is_in_cart() throws Throwable {
//	    r2CartPo.emptyCart();
//	}
	@Then("^user click on continue shopping$")
	public void user_click_on_continue_shopping() throws Throwable {
	   assertTrue(clickOnButton(r2CartPo.ATC_ContinueShopping));
	  
	   
	}
	
	@Then("^user click on View Cart and Checkout")
	public void user_click_on_View_Cart_and_Checkout() throws Throwable {
	   assertTrue(clickOnButton(r2CartPo.ATC_ViewCartCheckout));
	  
	   
	}										   

	@Then("^user verify title of the home page$")
	public void user_verify_title_of_the_home_page() throws Throwable {
	   assertTrue(isDisplayed(hp.btnShopNowHeroImage));
	}
	@Then("^user verify sucessfully added item MSG$")
	public void user_verify_sucessfully_added_item_MSG() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)){	
			isDisplayed(pdp.msgItemAddedSuccessfully_M);
		}else {
			isDisplayed(pdp.msgItemAddedSuccessfully);
		}
		
		
		
	}

@Then("^user sign in from checkout page$")
public void user_sign_in_from_checkout_page() throws Throwable {
   clickOnButton(r2checkout.checkout_SignIn_lnk);
}
//	@Then("^user scroll to order in my account in mobile$")
//	public void user_scroll_to_order_in_my_account_in_mobile() throws Throwable {
//	 scrollPageToWebElement(myAccountPo.burgerMenu_Orders_lnk);   
//	}
}
