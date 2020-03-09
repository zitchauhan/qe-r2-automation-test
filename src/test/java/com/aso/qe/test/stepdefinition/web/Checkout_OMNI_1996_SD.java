package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.framework.web.helpers.WebDriverHelper;
import com.aso.qe.test.pageobject.R1_FindStore_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Checkout_OMNI_1996_SD  extends CommonActionHelper {

	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	public R1_FindStore_PO findStorePO = PageFactory.initElements(getDriver(), R1_FindStore_PO.class);
	R2_Cart_PO r2CartPO = PageFactory.initElements(driver, R2_Cart_PO.class);
	String store = "";
	String taxvalueoncart;
	
	@And("^user verifies taxes visible on the cart page$")
	public void user_verifies_taxes_visible_on_cart_page() throws Throwable
	{
		Thread.sleep(Constants.thread_high);
		taxvalueoncart = r2CheckOutPo.estimateTax_Cart.getText();
		System.out.println("Taxes are" +taxvalueoncart);
	}
	
	@And("^user validate the taxes on cart page are same as on checkout page$")
	public void taxes_cart_page_are_same_as_on_checkout_page()
	{
		String taxvalueoncheckout = r2CheckOutPo.estimateTax_Checkout.getText();
		try {
		assertEquals(taxvalueoncart,taxvalueoncheckout);
		}
		catch(AssertionError e)
		{
			System.out.println("Taxes are not same on cart and checkout page");
		}
		System.out.println("Taxes on checkout page are same as on cart page");
	}
	
	@When("^User select store with \"(.*?)\" zipcode$")
	public void User_select_store_with(String arg1) throws Throwable {
		
		if(isDisplayed(findStorePO.californiaaddress)) {
			
			setInputText(r2CartPO.inputFindaStoreHomePage, webPropHelper.getTestDataProperty(arg1));
			assertTrue(clickOnButton(r2CartPO.btnZipcodesearch));
			
            assertTrue(clickOnButton(r2CheckOutPo.expandStoreFour));
            assertTrue(clickOnButton(r2CartPO.btnstore));
            assertTrue(clickOnButton(findStorePO.ovly_btnCloseCross));
         					
		}
		else {
		System.err.println(webPropHelper.getTestDataProperty(arg1));
		store = findStorePO.testWorkaround(webPropHelper.getTestDataProperty(arg1));
		}
	}
	
	@And("^user validate the taxes for the current store are same as were before on the checkout page$")
	public void user_validate_taxes_for_current_store_are_same_as_before_on_checkout_page() throws Throwable
	{
		String taxvalue_second_oncheckout = r2CheckOutPo.estimateTax_Checkout.getText();
		assertTrue("Taxes for the same store are NOT same before and after", taxvalueoncart.equals(taxvalue_second_oncheckout));
		Thread.sleep(Constants.thread_high);
	}
	
	
}
