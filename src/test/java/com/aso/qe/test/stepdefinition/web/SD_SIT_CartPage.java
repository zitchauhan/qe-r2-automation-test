package com.aso.qe.test.stepdefinition.web;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.SIT_CartPageObject;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.PDP_PO;

import cucumber.api.java.en.Then;

public class SD_SIT_CartPage extends CommonActionHelper
{
                
                public GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
                PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), PDP_PO.class);
                public SIT_CartPageObject SITCommonFunction =   PageFactory.initElements(getDriver(), SIT_CartPageObject.class);
/*
                @Then("^user click on Add to cart button$")
            	public void user_click_on_Add_to_cart_button() throws Throwable {
            		assertTrue(clickOnButton(pdpPageObj.btnAddToCart));

            	}
                     
                @Then("^user click on view cart button$")
            	public void user_click_on_view_cart_button() throws Throwable {
            		assertTrue(clickOnButton(pdpPageObj.btnViewCart));

            	}

            	@Then("^user click on checkout button$")
            	public void user_click_on_checkout_button() throws Throwable {
            		assertTrue(clickOnButton(pdpPageObj.btnCheckout));

            	}


            	@Then("^user should be able to click on Begin Checkout button$")
            	public void user_should_be_able_to_click_on_Begin_Checkout_button() throws Throwable {
            		assertTrue(clickOnButton(SITCommonFunction.btnBeginCheckout));

            	}
            	*/
            	
            	@Then("^user validate the cart icon$")
            	public void user_validate_the_cart_icon() throws Throwable {
            		globalElementHeader.validatingAddtoCartIcon();
            	}

            	@Then("^user click on cart icon and verify the cart page$")
            	public void user_click_on_cart_icon_and_verify_the_cart_page() throws Throwable {
            		assertTrue(clickOnButton(globalElementHeader.iconcart));
            	}


            	
}
