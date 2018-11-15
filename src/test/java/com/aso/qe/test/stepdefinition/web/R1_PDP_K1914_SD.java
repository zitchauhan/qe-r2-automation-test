package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R1_SIT_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R1_PDP_K1914_SD extends CommonActionHelper {
	R1_PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), R1_PDP_PO.class);
	public R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);
	public R1_SIT_PO HomePagePo = PageFactory.initElements(driver, R1_SIT_PO.class);
	
	
	@Then("^user should able to click on wishlist button$")
	public void user_should_able_to_click_on_wishlist_button() throws InterruptedException {
		waitForElement(pdpPageObj.btnAddToWishList);
		assertTrue(clickOnButton(pdpPageObj.btnAddToWishList));
	}
	
	@And("^User verifies the wishlist modal$")
	public void User_verifies_the_wishlist_modal() {
		pdpPageObj.checkModal();
	}
	
	@Then("^user enter the wishlist name$")
	public void user_enter_the_wishlist_name() throws InterruptedException {
		pdpPageObj.createWishList();
	}
	
	@And("^user confirm the successfully added modal$")
	public void user_confirm_the_successfully_added_modal() {
		assertTrue(isDisplayed(pdpPageObj.successWishlistModal));
	}
	
	@And("^user read the SKU number$")
	public void user_read_the_SKU_number() throws InterruptedException {
		pdpPageObj.skuPDP();		
		Thread.sleep(Constants.thread_low);
	}
	
	
	@Then("^User navigate to wishlist from header$")
	public void User_navigate_to_wishlist_from_header() throws InterruptedException {
		if("mobile".equalsIgnoreCase(testtype)) {
			Thread.sleep(Constants.thread_low);
			globalElementHeader.clickOnBurgerMenu();
			scrollPageToWebElement(globalElementHeader.btnMyAccountMobile);
			isDisplayed(globalElementHeader.btnMyAccountMobile);
			assertTrue(clickOnButton(globalElementHeader.btnMyAccountMobile));
			assertTrue(clickOnButton(globalElementHeader.wishListFromMyAccount_Mobile));
		}
		else {
			Thread.sleep(Constants.thread_low);
		scrollPageToWebElement(globalElementHeader.btnMyAccount);
		isDisplayed(globalElementHeader.btnMyAccount);
		assertTrue(clickOnButton(globalElementHeader.btnMyAccount));
		assertTrue(clickOnButton(pdpPageObj.headerWishList));
	}
	}
	@Then("^User navigate to wishlist from burger menu$")
	public void User_navigate_to_wishlist_from_burger_menu() throws InterruptedException {
		assertTrue(clickOnButton(globalElementHeader.btnBurgerMenu));
		assertTrue(clickOnButton(globalElementHeader.btnSHOPBurgerMenuMinusIcon));
		assertTrue(clickOnButton(globalElementHeader.btnMyAccountMobile));
		assertTrue(clickOnButton(globalElementHeader.wishListFromMyAccount_Mobile));
	}
	@Then("^user select the wishlist$")
	public void user_select_the_wishlist() {
		assertTrue(clickOnButton(globalElementHeader.selectWishlist));
	}
	
	@Then("^user check for the item SKU$")
	public void user_check_for_the_item_SKU() {
		waitForElement(pdpPageObj.wishListSKU);
		pdpPageObj.matchWishlistSKU();
	}
}
