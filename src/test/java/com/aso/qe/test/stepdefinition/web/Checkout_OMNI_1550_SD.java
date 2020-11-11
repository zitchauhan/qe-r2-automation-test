package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;

public class Checkout_OMNI_1550_SD extends CommonActionHelper{
	
	//R2_Cart_PO r2_cart_PO = PageFactory.initElements(driver, R2_Cart_PO.class);
	R1_PDP_PO r1_pdp_PO = PageFactory.initElements(driver, R1_PDP_PO.class);
	String productName;
	
	@When("^User gets a product name for \"([^\"]*)\"$")
	public void user_gets_a_product_name_for(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//productName= r2_cart_PO.lnkProducttext.getText();;
		productName = r1_pdp_PO.productname.getText();
		System.out.println("Product name on PDP is "+productName);
	}

	@Then("^user should be able to validate the cart merge$")
	public void user_should_be_able_to_validate_the_cart_merge() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		String productNameOnCart = (r1_pdp_PO.productNameCartPage).getText();
		assertTrue(productNameOnCart.contains(productName));
	}



}
