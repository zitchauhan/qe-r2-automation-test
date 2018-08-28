package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R2_CART_K2942_SD extends CommonActionHelper {

	
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	String intgeres="1234567890";
	

	@And("^User should be able to see the updated Order Summary$")
	public void user_should_be_able_to_see_the_updated_Order_Summary() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtPromocodeCart));// txtPromocode
	}

	@And("^updated promotions/discount as per the updated cart should be displayed$")
	public void updated_promotions_discount_as_per_the_updated_cart_should_be_displayed() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.txtPromoPrice));// txtPromoCodePrice
	}

	@And("^Item is removed from the cart$")
	public void item_is_removed_from_the_cart() throws Throwable {

	}

	@Then("^Verify cart is empty$")
	public void verify_cart_is_empty() throws Throwable {
		assertTrue(isDisplayed(r2SanityPo.AS_txtYourCart));
	}
	
	@Then("^verify the Remove Quantity link$")
	public void verify_the_Remove_Quantity_link() throws Throwable {
		assertTrue(isDisplayed(r2SanityPo.AS_btnRemoveFromCart));
		
	}
	
	@And("^user updates the product \"(.*?)\" on PDP to four$")
	public void user_updates_the_product_on_PDP_to_four(String arg1) throws Throwable {
		Thread.sleep(5000);
		clearInputBox(r2CartPo.R2_iconQuantityIncrease);
		setInputText(r2CartPo.R2_iconQuantityIncrease, webPropHelper.getTestDataProperty(arg1));
		Thread.sleep(20000);
	}
	
	@Then("^user should not be allowed to enter more than available stock \"(.*?)\"$")
	public void user_should_not_be_allowed_to_enter_more_than_available_stock(String quantity3) throws Throwable {
		Thread.sleep(2000);

		String str1 = r2SanityPo.AS_inputQty.getAttribute("value");
		int quantityFromSite = Integer.parseInt(str1);
		int quantityFromProperty = Integer.parseInt(webPropHelper.getTestDataProperty(quantity3));
		assertTrue(quantityFromSite == quantityFromProperty);
		Thread.sleep(1000);
	}

	@Then("^user should not be allowed to enter any non-numeric value in the input$")
	public void user_should_not_be_allowed_to_enter_any_non_numeric_value_in_the_input() throws Throwable {
		String str1 = r2SanityPo.AS_inputQty.getAttribute("value");
		boolean flag = true;
		try {
			Integer.parseInt(str1);
		} catch (NumberFormatException e) {
			flag = false;
		} catch (NullPointerException e) {
			flag = false;
		}

		assertTrue(flag == true);

	}

	@Then("^click the Remove from cart link$")
	public void click_the_Remove_from_cart_link() throws Throwable {
		assertTrue(clickOnButton(r2CartPo.lnkRemoveCart));
	}

	@Then("^verify the remove quantity message$")
	public void verify_the_remove_quantity_message() throws Throwable {
	  
	}

	@Then("^verify the Quantity is numeric value$")
	public void verify_the_Quantity_is_numeric_value() throws Throwable {
		String value=r2SanityPo.AS_inputQty.getAttribute("value");
		assertTrue(value.contains(intgeres));
	}
	
	@Then("^verify the Quantity is not allow alphanumeric$")
	public void verify_the_Quantity_is_not_allow_alphanumeric() throws Throwable {
		String quantity= r2SanityPo.AS_inputQty.getAttribute("value");
		assertTrue(quantity.isEmpty());
	}
	
	@Then("^verify the Quantity is not zero$")
	public void verify_the_Quantity_is_not_zero() throws Throwable {
		String quantity= r2SanityPo.AS_inputQty.getAttribute("value");
		assertTrue(!quantity.isEmpty());
	}
	
	@Then("^verify the Quantity is updated$")
	public void verify_the_Quantity_is_updated() throws Throwable {
		String quantity= r2SanityPo.AS_inputQty.getAttribute("value");
		assertTrue(!quantity.isEmpty());
	}
}
