package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K4238_SD extends CommonActionHelper {
	
	R2_CheckOut_PO r2CheckOutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	R2_Cart_PO r2CartPO=PageFactory.initElements(driver, R2_Cart_PO.class);
	String productName="";
	
	@And("^user verify the employee discount is visible at item level$")
	public void user_verify_the_employee_discount_is_visible_at_item_level() throws Throwable {
		assertTrue(isDisplayed(r2CheckOutPo.employeeDiscountItemLevel_CartPage));
	}
	
	@And("^user verify the employee discount in order summery$")
	public void user_verify_the_employee_discount_in_order_summery() throws Throwable {
		assertTrue(isDisplayed(r2CheckOutPo.employeeDiscountOrderSummerPage));
	}
	

	@Then("^user click on Deals tab$")
	public void user_click_on_Deals_tab() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(globalElementHeader.btnBurgerMenu));
			assertTrue(clickOnButton(globalElementHeader.btnDEALSBurgerMenu));
		} else {
			assertTrue(clickOnButton(globalElementHeader.btnDEALS));
		}
	}
	
	@And("^user select a product from deal tab$")
	public void user_select_a_product_from_deal_tab() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(globalElementHeader.btnDEALSBurgerMenu));
			productName = globalElementHeader.clickDealItem.getText();
			assertTrue(clickOnButton(globalElementHeader.clickDealItem));
		} else {
			productName = r2CheckOutPo.dealTabProduct.getAttribute("alt");
			assertTrue(clickOnButton(globalElementHeader.clickDealItem));
		}
	}
	
	@And("^user verify the employee discount is visible at item level when deal items are there$")
	public void user_verify_the_employee_discount_is_visible_at_item_level_when_deal_items_are_there() throws Throwable {
		Boolean flag=false;
		assertTrue(isDisplayed(r2CheckOutPo.employeeDiscountItemLevel_CartPage));
		flag = getfindElementByXPath("//*[@title="+"\""+productName+"\""+"]/parent::div//*[(contains(text(),'Employee Discount applied'))]").isDisplayed();
		System.err.println(flag);
		assertFalse(flag);
		
	}


	@Then("^system should not display the estimated shipping discount on cart page$")
	public void system_should_not_display_the_estimated_shipping_discount_on_cart_page() throws Throwable {
		String amount=r2CartPO.txt_EstimatedShipping.getText();
		String free="Free";
		assertFalse(amount.contains(free));
	}
	
	@Then("^verify employee discount should not display$")
	public void verify_employee_discount_should_not_display() throws Throwable {
		assertTrue(isDisplayed(r2CartPO.txt_EstimatedShipping));
	}


	
}
