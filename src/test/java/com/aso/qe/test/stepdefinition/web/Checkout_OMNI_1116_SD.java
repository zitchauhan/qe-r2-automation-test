package com.aso.qe.test.stepdefinition.web;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.Then;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.support.PageFactory;

public class Checkout_OMNI_1116_SD extends CommonActionHelper  {
	
	private static double taxDisplayedBefore = 0.0f;
    private static double taxDisplayedAfter = 0.0f;    
    R2_CheckOut_PO r2CheckOutPO = PageFactory.initElements(getDriver(), R2_CheckOut_PO.class);
  
    @Then("^get the tax on checkout page \"([^\"]*)\" refresh$")
    public void get_the_tax_on_checkout_page_refresh(String action) throws Throwable {
                if (action.contains("before"))
                            taxDisplayedBefore = r2CheckOutPO.getEstimatedTaxOnCheckoutPage();
                
                if (action.contains("after"))
                            taxDisplayedAfter = r2CheckOutPO.getEstimatedTaxOnCheckoutPage();
    }

    @Then("^compare the tax$")
    public void compare_the_tax() throws Throwable {
    	assertTrue(taxDisplayedBefore != taxDisplayedAfter);
    }

}
