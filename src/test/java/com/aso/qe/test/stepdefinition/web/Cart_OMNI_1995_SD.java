package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;

import cucumber.api.java.en.Then;

public class Cart_OMNI_1995_SD  extends CommonActionHelper {

	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	
	private static double taxDisplayedBefore = 0.0f;
    private static double taxDisplayedAfter = 0.0f;
    
    @Then("^get the tax on cart page \"([^\"]*)\" refresh$")
    public void get_the_tax_on_checkout_page_refresh(String action) throws Throwable {
                if (action.contains("before")) {
                            taxDisplayedBefore = r2CartPo.getEstimatedTaxOnCartPage();
                } else if (action.contains("after")) {
                            taxDisplayedAfter = r2CartPo.getEstimatedTaxOnCartPage();
                }
    }
    
    @Then("^compare the tax applied on cart page$")
    public void compare_the_tax() throws Throwable {
    	assertTrue(taxDisplayedBefore != taxDisplayedAfter);
    }
	
}
