package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.SEO_YEXT_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SEO_YEXT_SD  extends CommonActionHelper {

	SEO_YEXT_PO seoYextPage = PageFactory.initElements(getDriver(), SEO_YEXT_PO.class);
	
	
	
/*    
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
    }*/
	
    @And("^User signs into YEXT$")
    public void user_signs_in() throws Throwable{
    	seoYextPage.signIn();
    }
    
    @And("^User selects the entity$")
    public void user_selects_entity() throws Throwable{
    	seoYextPage.selectExistingEntity("Bhavna_Test", "ASO_Bhavna_test2");
    }
    
}
