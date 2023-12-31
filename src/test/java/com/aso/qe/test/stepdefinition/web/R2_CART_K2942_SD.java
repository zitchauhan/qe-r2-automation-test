package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
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
		assertTrue(isDisplayed(r2CartPo.txtPromocodeCart));// txtPromoCodePrice
	}

	

	@Then("^Verify cart is empty$")
	public void verify_cart_is_empty() throws Throwable {
		assertTrue(isDisplayed(r2SanityPo.AS_txtYourCart));
	}
	
	@Then("^verify the Remove Quantity link$")
	public void verify_the_Remove_Quantity_link() throws Throwable {
		//assertTrue(isDisplayed(r2SanityPo.AS_btnRemoveFromCart));
		assertTrue(isDisplayed(r2CartPo.btnRemoveCart));
		
	}
	
	@And("^user updates the product \"(.*?)\" on PDP to four$")
	public void user_updates_the_product_on_PDP_to_four(String arg1) throws Throwable {
		Thread.sleep(Constants.thread_medium); 
		clearInputBox(r2CartPo.R2_iconQuantityIncrease);
		setInputText(r2CartPo.R2_iconQuantityIncrease, webPropHelper.getTestDataProperty(arg1));
		Thread.sleep(Constants.thread_highest);
	}
	
	@Then("^user should not be allowed to enter more than available stock \"(.*?)\"$")
	public void user_should_not_be_allowed_to_enter_more_than_available_stock(String quantity3) throws Throwable {
		Thread.sleep(Constants.thread_low);

		String str1 = r2SanityPo.AS_inputQty.getAttribute("value");
		int quantityFromSite = Integer.parseInt(str1);
		int quantityFromProperty = Integer.parseInt(webPropHelper.getTestDataProperty(quantity3));
		assertTrue(quantityFromSite != quantityFromProperty);
		Thread.sleep(Constants.thread_low);
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
		Thread.sleep(Constants.thread_medium); 
	}


	@Then("^verify the Quantity is numeric value$")
	public void verify_the_Quantity_is_numeric_value() throws Throwable {
		moveHover(r2SanityPo.AS_inputQty);
		String value=r2SanityPo.AS_inputQty.getAttribute("value");
		boolean flag = true;
		try {
			Integer.parseInt(value);
		} catch (NumberFormatException e) {
			flag = false;
		} catch (NullPointerException e) {
			flag = false;
		}

		assertTrue(flag == true);
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
	
	@Then("^user verfiy the an error message$")
	public void user_verfiy_the_an_error_message() throws Throwable {
		assertTrue(isDisplayed(r2CartPo.ErrorMsgLimitedStack));
	}

	@And("^user should be able to see out of stock error message on cart page \"(.*?)\" with add to wishlist and remove cart option$")
	public void user_should_be_able_to_see_out_of_stock_error_message_on_cart_page_with_add_to_wishlist_and_remove_cart_option(String message) {
		assertTrue(isDisplayed(r2CartPo.messageFlyout));
		String errorMessage = r2CartPo.messageFlyout.getText();
		System.err.println(" errorMessage " + errorMessage + " message " + webPropHelper.getTestDataProperty(message));
		assertEquals(errorMessage, webPropHelper.getTestDataProperty(message));
		assertTrue(isDisplayed(r2CartPo.lnkAddToWishList));
		for (WebElement removeCartforOOSProduct_lst_btn : r2CartPo.removeCartforOOSProducts_lst_btn) {
			assertTrue(isDisplayed(removeCartforOOSProduct_lst_btn));
		}
	}

}
