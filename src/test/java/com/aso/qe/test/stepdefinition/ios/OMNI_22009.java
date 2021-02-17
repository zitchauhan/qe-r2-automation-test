package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.pageobject.ios.CartPage;
import com.aso.qe.test.pageobject.ios.PDPPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OMNI_22009 extends GlobalMobileHelper{
	private CartPage cart;
//	private int previousQuantity = -1;
	
	@Given("^User has selected a delivery option and adds \"(.*?)\" item to the cart$")
	public void selectDeliveryAndAddItem() throws Throwable {
		initializeDriver();
		//TODO Integrate the code that will add item and move to cart page
		cart = new CartPage(driver);
	}

	@Then("^User goes to the cart page$")
	public void userGoesToTheCartPage() throws Throwable {
		//TODO Integrate the code that will add item and move to cart page
	}
	
	@Then("^User sees pre-selected delivery option for \"(.*?)\" item on the cart page$")
	public void userSeesPreSelectedDeliveryOption(String arg1) throws Throwable {
		if(arg1.equalsIgnoreCase("BOPIS"))
		{
			assertTrue(cart.bopisDeliveryOptionDisplayed());
		}
		
	}
	
	
}