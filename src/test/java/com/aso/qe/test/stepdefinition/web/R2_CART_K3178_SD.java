package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_FindStore_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R2_CART_K3178_SD extends CommonActionHelper {

	String selectedStoreName="";
	R2_CheckOut_PO r2CheckoutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_R1_Fun_PO r2R1FunPO = PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R2_Cart_PO cartPO = PageFactory.initElements(driver, R2_Cart_PO.class);
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	R1_FindStore_PO findStorePo = PageFactory.initElements(driver, R1_FindStore_PO.class);
	
	@Then("^user click on change location button$")
	public void user_click_on_change_location_button() {
		assertTrue(clickOnButton(r2CheckoutPo.ChangeLocation_Lnk));
	}
	
	@Then("^user click on change location button on cart$")
	public void user_click_on_change_location_button_on_cart() throws InterruptedException {
		assertTrue(clickOnButton(cartPO.lnkChangeLocationCart));
		Thread.sleep(Constants.thread_highest);
	}
	
	@Then("^user click on find the store button on cart$")
	public void user_click_on_find_the_store_button_on_cart() throws InterruptedException {
		assertTrue(clickOnButton(cartPO.cart_FindStore));
		Thread.sleep(Constants.thread_highest);
	}
	

	@Then("^user select in store pickup option$")
	public void user_select_in_store_pickup__option() throws InterruptedException {
		Thread.sleep(Constants.thread_high);
		for (WebElement clickInStorePickUp : cartPO.clickAllInStorePickUp) {
			assertTrue(clickOnButton(clickInStorePickUp));
			Thread.sleep(Constants.thread_highest);
		}
	}

	@And("^user check the selected store name$")
	public void user_check_the_selected_store_name() {
		waitForElement(r2CheckoutPo.selectedBOPISStore);
		isDisplayed(r2CheckoutPo.selectedBOPISStore);
		System.err.println("r2CheckoutPo.selectedBOPISStore.getText() "+ r2CheckoutPo.selectedBOPISStore.getText());
		selectedStoreName =	r2CheckoutPo.selectedBOPISStore.getText();
	}
	
	@And("^user check that the selected store appear at the top$")
	public void user_check_that_the_selected_store_appear_at_the_top() throws InterruptedException {
		Thread.sleep(Constants.thread_high);
		String storeInFAS = r2CheckoutPo.selectedBOPISStoreNameFAS.getText();
		System.err.println("storeInFAS "+ storeInFAS);
		System.err.println("selectedStoreName "+ selectedStoreName);
		assertTrue(selectedStoreName.equalsIgnoreCase(storeInFAS));
	}
	
	@Then("^user check for the products count$")
	public void user_check_for_the_products_count() throws InterruptedException {
		Thread.sleep(Constants.thread_high);
		assertTrue(clickOnButton(r2CheckoutPo.collapse));
		Thread.sleep(Constants.thread_high);
		String productCountMessage = r2CheckoutPo.productsAvailabelOnSelectedStore.getText();
		System.err.println("productCountMessage "+ productCountMessage);
		String arr[] = productCountMessage.split("of");
		String arr1[] = arr[1].trim().split(" ");
		int count1 = Integer.parseInt(arr[0].trim());
		int count2 = Integer.parseInt(arr1[0]);
		if(count1==count2) {
			assertTrue(true);
		}else {
			assertTrue(false);
		}
	}
	
	@Then("^user check for the products count and item available should be less$")
	public void user_check_for_the_products_count_and_item_available_should_be_less() throws InterruptedException {
		Thread.sleep(Constants.thread_high);
		String productCountMessage = r2CheckoutPo.productsAvailabelOnSelectedStore.getText();
		System.err.println("productCountMessage " + productCountMessage);
		String arr[] = productCountMessage.split("of");
		String arr1[] = arr[1].trim().split(" ");
		int count1 = Integer.parseInt(arr[0].trim());
		int count2 = Integer.parseInt(arr1[0]);
		System.err.println("count1 " + count1);
		System.err.println("count2 " + count2);
		if (count1 < count2) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

	@Then("^user check for the products count and item not available should come$")
	public void user_check_for_the_products_count_and_item_not_available_should_come() throws InterruptedException {
		Thread.sleep(Constants.thread_high);
		String availableMessage = r2CheckoutPo.productsNotAvailabelOnSelectedStore.getText();
		System.err.println("availableMessage " + availableMessage);
		if (availableMessage.toLowerCase().contains("not available")) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

	@Then("^user change the selected store \"(.*?)\"$")
	public void user_change_the_selected_store(String store) throws InterruptedException {
		Thread.sleep(Constants.thread_highest);
		assertTrue(clickOnButton(cartPO.selectStoreMiniBalloon));
		waitForElement(findStorePo.ovly_searchTextBox);
		Thread.sleep(Constants.thread_highest);
		boolean flag = false;
		System.err.println("Expected: " + webPropHelper.getTestDataProperty(store) + " we get :"+ findStorePo.selectedStoreZipCode.getText());
		flag = findStorePo.selectedStoreZipCode.getText().contains(webPropHelper.getTestDataProperty(store));
		if (!flag) {
		
			setInputText(findStorePo.ovly_searchTextBox, webPropHelper.getTestDataProperty(store));
			clickOnButton(findStorePo.ovly_btnGO);
			assertTrue(clickOnButton(findStorePo.selectChangedStore));
			clickOnButton(findStorePo.ovly_btnMakeMyStore_1);
		}
		clickOnButton(findStorePo.ovly_btnCloseContainer);
	}

	@And("^User empty the cart$")
	public void User_empty_the_cart() throws InterruptedException {
		cartPO.navigateAndDeleteAllProductsInCart();
	}

}
