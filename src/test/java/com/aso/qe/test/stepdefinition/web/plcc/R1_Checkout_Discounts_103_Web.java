package com.aso.qe.test.stepdefinition.web.plcc;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;
import com.aso.qe.test.pageobject.R1_PLCC_LandingPage_PO;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_Checkout_Discounts_103_Web extends CommonActionHelper{
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);
	R2_CheckOut_PO checkout_po = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R1_SearchProduct_PO r1_SearchPO = PageFactory.initElements(getDriver(), R1_SearchProduct_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader_HomePO = PageFactory.initElements(getDriver(),
			R1_GlobalElementHeader_Home_PO.class);
	R1_PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), R1_PDP_PO.class);
	R1_PLCC_LandingPage_PO plccLandingPageObjects = PageFactory.initElements(driver, R1_PLCC_LandingPage_PO.class);
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	

@When("^usr click on view cart and navigates to cart page$")
public void usr_click_on_view_cart_and_navigates_to_cart_page() throws Throwable {
	genericPO.verifyPresenceOfViewCartBtn();
	
}

@When("^user click on add promo code link on cart page$")
public void user_click_on_add_promo_code_link_on_cart_page() throws Throwable {
	genericPO.viewCartBtn.click();
}

@When("^user enter promocode on cart page$")
public void user_enter_promocode_on_cart_page() throws Throwable {
	//	genericPO.enterPromoCode(arg1);
	assertTrue(isDisplayed(genericPO.promoCodeInputField));
	waitForElement(genericPO.promoCodeInputField);
}

@When("^click on submit promo code button$")
public void click_on_submit_promo_code_button() throws Throwable {
    
}

@Then("^user expect fifteen dollars discount$")
public void user_expect_fifteen_dollars_discount() throws Throwable {
  
}
}
