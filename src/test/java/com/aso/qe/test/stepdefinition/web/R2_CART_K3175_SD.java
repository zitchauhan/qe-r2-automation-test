package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_FindStore_PO;
import com.aso.qe.test.pageobject.R1_PLP_PO;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_PDP_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R2_CART_K3175_SD extends CommonActionHelper {

	R1_SearchProduct_PO searchProductPo = PageFactory.initElements(driver, R1_SearchProduct_PO.class);
	R1_FindStore_PO findStorePo = PageFactory.initElements(driver, R1_FindStore_PO.class);
	R2_R1_Fun_PO r2r1FunPo = PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R2_PDP_PO pdpPo = PageFactory.initElements(driver, R2_PDP_PO.class);
	R1_PLP_PO plp_po = PageFactory.initElements(getDriver(), R1_PLP_PO.class);
	R2_Cart_PO r2_cart_PO = PageFactory.initElements(driver, R2_Cart_PO.class);
	Actions hover = new Actions(driver);
	String count1="";
	String storeName="";

	@And("^user verify the shipping and pickup drawer$")
	public void user_verify_the_shipping_and_pickup_drawer() {
		assertTrue(isDisplayed(r2r1FunPo.txtShippingPickupFilterDrawerPLP));
	}
	
	@And("^user verify that the shipping drawer is collaspsed by default$")
	public void user_verify_that_the_shipping_drawer_is_collaspsed_by_default() {
		assertTrue(isDisplayed(r2r1FunPo.txtShippingPickupFilterDrawerExpandIcon));
	}
	
	@And("^user should be able to click on shipping and pickup drawer$")
	public void user_should_be_able_to_click_on_shipping_and_pickup_drawer() {
		assertTrue(clickOnButton(r2r1FunPo.txtShippingPickupFilterDrawerExpandIcon));
	}
	
	@Then("^user verify that shipping and in store options are displayed$")
	public void user_verify_that_shipping_and_in_store_options_are_displayed() {
		assertTrue(isDisplayed(r2r1FunPo.txtStorePickUp));
		assertTrue(isDisplayed(r2r1FunPo.txtShipping));
	}
	
	@And("^user should be able to select the shipping \"(.*?)\" filter$")
	public void user_should_be_able_to_select_the_shipping_filter(String arg1) throws InterruptedException {
		count1 = searchProductPo.itemscount.getText();
		hover.moveToElement(r2r1FunPo.selectShipping).click().build().perform();
		Thread.sleep(2000);
		assertTrue(arg1.equalsIgnoreCase(r2r1FunPo.shippingFilterApplied.getText()));
		System.err.println(r2r1FunPo.shippingFilterApplied.getText());
	}
	
	@And("^user should be able to deselect the shipping \"(.*?)\" filter$")
	public void user_should_be_able_to_deselect_the_shipping_filter(String arg1) throws InterruptedException {
		
		hover.moveToElement(r2r1FunPo.selectShipping).click().build().perform();
	}
	
	@And("^user should be able to select the store pickup \"(.*?)\" filter$")
	public void user_should_be_able_to_select_the_store_pickup_filter(String arg1) throws InterruptedException {
		count1 = searchProductPo.itemscount.getText();
		Thread.sleep(2000);
		hover.moveToElement(r2r1FunPo.selectStorePickUp).click().build().perform();
		Thread.sleep(2000);
		assertTrue(arg1.equalsIgnoreCase(r2r1FunPo.storePickUpFilterApplied.getText()));
		System.err.println(r2r1FunPo.storePickUpFilterApplied.getText());
	}
	
	@And("^user should be able to deselect the store pickup \"(.*?)\" filter$")
	public void user_should_be_able_to_deselect_the_store_pickup_filter(String arg1) throws InterruptedException {
		Thread.sleep(2000);
		hover.moveToElement(r2r1FunPo.selectStorePickUp).click().build().perform();
	}
	
	@Then("^user verify that only store pickup item are displayed$")
	@And("^user verify that only shipping item are displayed$")
	public void user_verify_that_only_shipping_item_are_displayed() {
		String count2="";
		count2 = searchProductPo.itemscount.getText();
		String arr[] = count1.split(" ");
		String arr1[] = count2.split(" ");
		int beforeFilterCount= Integer.parseInt(arr[0].replace(",", ""));
		int afterFilterCount= Integer.parseInt(arr1[0].replace(",", ""));
		System.err.println("beforeFilterCount "+beforeFilterCount+" afterFilterCount "+afterFilterCount);
		if(afterFilterCount<=beforeFilterCount) {
			assertTrue(true);
		}
		else {
			assertTrue(false);
		}
	}

	@And("^user click on change pickup location$")
	public void user_click_on_change_pickup_location() {
		assertTrue(clickOnButton(r2r1FunPo.changePickUpLocationPLP));
	}

	@And("^User select another store \"(.*?)\"$")
	public void User_select_another_store(String store) throws InterruptedException {
		Thread.sleep(Constants.thread_high);
		waitForElement(findStorePo.ovly_searchTextBox);
		setInputText(findStorePo.ovly_searchTextBox, webPropHelper.getTestDataProperty(store));
		clickOnButton(findStorePo.ovly_btnGO);
		String selectedStoreTitle = getText(findStorePo.ovly_secStore);
		System.err.println(selectedStoreTitle);
		clickOnButton(findStorePo.expandStore);
		storeName = r2r1FunPo.storeNameStoreModalPLP.getText();
		System.err.println(findStorePo.selectedStoreNameinModal.getText());
		clickOnButton(findStorePo.ovly_btnMakeMyStore_1);
		Thread.sleep(Constants.thread_medium);
		storeName = r2r1FunPo.storeNameStoreModalPLP.getText();
		clickOnButton(findStorePo.ovly_btnCloseContainer);
	}
	
	@And("^user verify the selected store is reflected$")
	public void user_verify_the_selected_store_is_reflected() throws InterruptedException {
		String storeDetails = r2_cart_PO.storeNameCartOrderSummary.getText();
		
		System.err.println(" storeDetails "+ storeDetails+" storeName "+ storeName);
		assertTrue(storeDetails.contains(storeName));
	}
	
	@And("^user verify the selected store is reflected for both the product$")
	public void user_verify_the_selected_store_is_reflected_for_both_the_product() {
		String store = r2_cart_PO.storeNameCart.getText();
		assertEquals(store, storeName);
	}

	@And("^user verify the new selected location is displayed$")
	public void user_verify_the_new_selected_location_is_displayed() {
		System.err.println("storeName " + storeName + " r2r1FunPo.bopisStoreNamePLP.getText() "	+ r2r1FunPo.bopisStoreNamePLP.getText());
		assertTrue(storeName.equalsIgnoreCase(r2r1FunPo.bopisStoreNamePLP.getText()));
	}
	
	@And("^user should be able to see store pickup message \"(.*?)\"$")
	public void user_should_be_able_to_see_store_pickup_message(String message) {
		assertTrue(webPropHelper.getTestDataProperty(message).equalsIgnoreCase(pdpPo.storePickUpAvailableMessage.getText()));
	}
	
	@And("^user should be able to see shipping message \"(.*?)\"$")
	public void user_should_be_able_to_see_shippingp_message(String message) {
		assertTrue(webPropHelper.getTestDataProperty(message).equalsIgnoreCase(pdpPo.shippingMessage.getText()));
	}
	
	
	@Then("^user check for shipping only product \"(.*?)\"$")
	public void user_check_for_shipping_only_product(String shippingProductName) {
		assertTrue(pdpPo.shippingProducts(webPropHelper.getTestDataProperty(shippingProductName)));
	}
	
	
	@Then("^user navigates back and check for BOPIS eligible product$")
	public void user_navigates_back_and_check_for_BOPIS_eligible_product() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(Constants.thread_low);
		assertTrue(clickOnButton(plp_po.productPLP1));
		Thread.sleep(Constants.thread_low);
	}
	
	@Then("^user verify that no item is available$")
	public void user_verify_that_no_item_is_available() {
		assertTrue(isDisplayed(r2r1FunPo.bopisNoInventoryMesssagePLP));
	}
	
}
