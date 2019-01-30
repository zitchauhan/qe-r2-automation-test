package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_Cart_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R2_CART_K3173_SD extends CommonActionHelper {

	R2_Cart_PO r2_cart_PO = PageFactory.initElements(driver, R2_Cart_PO.class);
	String productName;
	
	@And("^user click on change location link in order summery cart page$")
	public void user_click_on_change_location_link_in_order_summery_cart_page() {
	assertTrue(clickOnButton(r2_cart_PO.lnkChangeLocationCart));
	}
	
	@Then("^user click on tooltip$")
	public void user_click_on_tooltip() {
		assertTrue(clickOnButton(r2_cart_PO.tooltip));
		
	}
	
	@And("^user should be able to see the message flyout$")
	public void user_should_be_able_to_see_the_message_flyout(){
		assertTrue(isDisplayed(r2_cart_PO.messageFlyout));
	}
	
	@And("^user should be able to see the store message flyout$")
	public void user_should_be_able_to_see_the_store_message_flyout() {
		assertTrue(isDisplayed(r2_cart_PO.storeMessageFlyout));
		
	}
	
	@And("^user click on the remove button in cart page$")
	public void user_click_on_the_remove_button_in_cart_page() {
		productName= r2_cart_PO.lnkProducttext.getText();
		assertTrue(clickOnButton(r2_cart_PO.btnRemoveCart));
	}
	
	@And("^user should be able to see remove message with undo CTA$")
	public void user_should_be_able_to_see_remove_message_with_undo_CTA() {
		assertTrue(isDisplayed(r2_cart_PO.removedproductUndo));
		assertTrue(isDisplayed(r2_cart_PO.removedMessageCart));
		assertTrue(r2_cart_PO.removedMessageCart.getText().contains(productName));
	}
	@And("^user note the product name$")
	public void user_note_the_product_name() {
		productName= r2_cart_PO.lnkProducttext.getText();
	}
	
	@And("^user verify the wishlist moved message is displayed$")
	public void user_verify_the_wishlist_moved_message_is_displayed() {
		assertTrue(isDisplayed(r2_cart_PO.removedproductUndo));
		assertTrue(isDisplayed(r2_cart_PO.moveToWishlistMessageCart));
		assertTrue(r2_cart_PO.moveToWishlistMessageCart.getText().contains(productName));
	}
	
	@And("^user should be able to see out of stock message$")
	public void user_should_be_able_to_see_out_of_stock_message() {
		assertTrue(isDisplayed(r2_cart_PO.outOfStockMesssageCart));
	}
	
	@And("^user should be able to see instore radio button bydefault selected$")
	public void user_should_be_able_to_see_instore_radio_button_bydefault_selected() {
		assertTrue(isDisplayed(r2_cart_PO.inStoreSelectedByDefault));
	}
	
	@And("^user should be able to see the grey icon$")
	public void user_should_be_able_to_see_the_grey_icon() {
		assertTrue(isDisplayed(r2_cart_PO.greyPickUpIcon));
	}
	
	@And("^user should not be able to see the radio button for store pickup$")
	public void user_should_not_be_able_to_see_the_radio_button_for_store_pickup() throws InterruptedException {
		Thread.sleep(Constants.thread_high);
		for (WebElement clickInStorePickUp : r2_cart_PO.clickAllInStorePickUp) {
			assertTrue(!isDisplayed(clickInStorePickUp));
			Thread.sleep(Constants.thread_high);
		}
	}
	
	@And("^user input the quantity more than available \"(.*?)\"$")
	public void user_input_the_quantity_more_than_available(String quantity) throws InterruptedException {
		assertTrue(clickOnButton(r2_cart_PO.input_Quantity));
		r2_cart_PO.input_Quantity.clear();
		Thread.sleep(Constants.thread_low);
		setInputText(r2_cart_PO.input_Quantity, webPropHelper.getTestDataProperty(quantity));
		r2_cart_PO.input_Quantity.sendKeys(Keys.ENTER);
	}
	
	@And("^user should be able to see the limited quantity message \"(.*?)\"$")
	public void user_should_be_able_to_see_the_limited_quantity_message(String message) {
		assertTrue(isDisplayed(r2_cart_PO.messageFlyout));
		String limitedquantityMessage = r2_cart_PO.messageFlyout.getText();
		System.err.println(" limitedquantityMessage "+ limitedquantityMessage+" message "+ webPropHelper.getTestDataProperty(message));
		assertTrue(limitedquantityMessage.contains(webPropHelper.getTestDataProperty(message)));
	}
	
}
