package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_PDP_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CHECKOUT_K6655_SD extends CommonActionHelper {
	
	
	R2_PDP_PO r2PdpPo = PageFactory.initElements(driver, R2_PDP_PO.class);
	R2_R1_Fun_PO r2R1FunPO=PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R2_Sanity_PO r2SanityPo=PageFactory.initElements(driver,R2_Sanity_PO.class);
	
	
	@Then("^Verify that Enable Buy Now button is displayed on PDP$")
	public void verify_that_Enable_Buy_Now_button_is_displayed_on_PDP() throws Throwable {
		
		assertTrue(isDisplayed(r2PdpPo.EnableBuyNow_btn));
	}
	
	@When("^User clicks on Enable Buy Now button$")
	public void user_clicks_on_Enable_Buy_Now_button() throws Throwable {
		assertTrue(clickOnButton(r2PdpPo.EnableBuyNow_btn));
	}
	
	@Then("^user should not able to see the Enable BUY NOW button on the PDP$")
	public void user_should_not_able_to_see_the_Enable_BUY_NOW_button_on_the_PDP() throws Throwable {
		
		assertFalse(isDisplayed(r2PdpPo.EnableBuyNow_btn));
	}
	
	@Then("^user clicks on one of the subcategory and navigates to LTwo Baits$")
	public void user_clicks_on_one_of_the_subcategory_and_navigates_to_LTwo_Baits() throws Throwable {
		 if("mobile".equalsIgnoreCase(testtype)){ 
			 waitForElement(r2R1FunPO.Baits_secCategory_CLP_m);
			 assertTrue(clickOnButton(r2R1FunPO.Baits_secCategory_CLP_m));
			 assertTrue(clickOnButton(r2R1FunPO.Baits_productPLP_m));
			 Thread.sleep(3000);
		 }else {
			 waitForElement(r2R1FunPO.Baits_secCategory_CLP);
			 assertTrue(clickOnButton(r2R1FunPO.Baits_secCategory_CLP));
			 assertTrue(clickOnButton(r2R1FunPO.Baits_productPLP));
			 Thread.sleep(3000);
		}
	}
	
	@Then("^user should not able to see the BUY NOW button on the PDP$")
	public void user_should_not_able_to_see_the_BUY_NOW_button_on_the_PDP() throws Throwable {
		waitForElement(r2PdpPo.Default_Payment_Option_btn);
		assertTrue(isDisplayed(r2PdpPo.Default_Payment_Option_btn));
		
	}
	
	@Then("^user clicks on one of the product category and navigates to LThree Baits$")
	public void user_clicks_on_one_of_the_product_category_and_navigates_to_LThree_Baits() throws Throwable {
		
		if("mobile".equalsIgnoreCase(testtype)){ 
			 waitForElement(r2R1FunPO.Baits_productPLP1_m);
			 assertTrue(clickOnButton(r2R1FunPO.Baits_productPLP1_m));
			 waitForElement(r2R1FunPO.Baits_productPLP1_m);
			 waitForElement(r2SanityPo.AS_productPLP1);
			 assertTrue(clickOnButton(r2SanityPo.AS_productPLP1));
			 Thread.sleep(3000);
		 }else {
			 waitForElement(r2SanityPo.AS_productPLP1);
			 assertTrue(clickOnButton(r2SanityPo.AS_productPLP1));
			 Thread.sleep(3000);
		
	}
	

}
}
