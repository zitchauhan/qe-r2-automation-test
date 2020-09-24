package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R2_MYACCOUNT_K4229_SD extends CommonActionHelper {
	R2_MyAccount_PO r2_MyAccount_PO = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R2_R1_Fun_PO r2R1FunPo = PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R2_MyAccount_PO myAccountPo= PageFactory.initElements(driver, R2_MyAccount_PO.class);
	Actions keyAction = new Actions(getDriver());
	private static final Logger logger = Logger.getLogger(R2_MYACCOUNT_K4229_SD.class);
	
	@Then("^user navigates to profile in my account$")
	public void user_navigates_to_profile_in_my_account() throws Throwable {
		Thread.sleep(Constants.thread_low);
		if ("mobile".equalsIgnoreCase(testtype)) {
			Thread.sleep(10000);
			assertTrue(clickOnButton(r2_MyAccount_PO.myAccount_txt_Mobile));
			assertTrue(clickOnButton(r2_MyAccount_PO.lnkProfile_Mobile));
		} else {
			assertTrue(clickOnButton(r2_MyAccount_PO.lnkMyAccount));
			assertTrue(clickOnButton(r2_MyAccount_PO.myAccount_MyAccountList_Profile_lnk));
		}
	}

	@And("^user navigates to orders in my account$")
	public void user_navigates_to_orders_in_my_account() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(r2_MyAccount_PO.myAccount_txt_Mobile));
			assertTrue(clickOnButton(r2_MyAccount_PO.burgerMenu_Orders_lnk));
		} else {
			assertTrue(clickOnButton(r2_MyAccount_PO.lnkMyAccount));
			assertTrue(clickOnButton(r2_MyAccount_PO.myAccount_MyAccountList_Orders_lnk));
		}
	}

	@Then("^Verify that list of orders are displayed in the right section of the page$")
	public void verify_that_list_of_orders_are_displayed_in_the_right_section_of_the_page() throws Throwable {
		if(isDisplayed(r2_MyAccount_PO.NoOrdersMyAccount))
		{
			System.out.println("No orders exist for this user");
		}
		else {
			for (WebElement viewOrderDetails : r2_MyAccount_PO.viewOrderDetailsBtn) {
			isDisplayed(viewOrderDetails);
			}
		}
	}

	// SID 15-Nov
	@And("^Verify that (\\d+) orders are displayed per page$")
	public void verify_that_orders_are_displayed_per_page(int arg1) throws Throwable {
		if(isDisplayed(r2_MyAccount_PO.NoOrdersMyAccount))
		{
			System.out.println("No orders exist for this user");
		}
		
		else {
		int count = 0;
		waitForElement(r2_MyAccount_PO.ordersHeading);
		isDisplayed(r2_MyAccount_PO.ordersHeading);
			for (WebElement viewOrderDetails : r2_MyAccount_PO.viewOrderDetailsBtn) {
			count++;
			}
		System.err.println(count);
		assertTrue(count <= arg1);
		}
	}

	@And("^Oldest sorting option is available$")
	public void oldest_sorting_option_is_available() throws Throwable {
		if(isDisplayed(r2_MyAccount_PO.NoOrdersMyAccount))
		{
			System.out.println("No orders exist for this user");
		}
		else {
		scrollPageToWebElement(r2_MyAccount_PO.ordersDropDownNewest);
		Actions hover = new Actions(getDriver());
		hover.click(r2_MyAccount_PO.ordersDropDownNewest).build().perform();
		hover.sendKeys(Keys.DOWN, Keys.ENTER).build().perform();
		Thread.sleep(Constants.thread_low);
		assertTrue(isDisplayed(r2_MyAccount_PO.ordersDropDownOldest));
		}
	}

	@And("^user navigates to address book in my account$")
	public void user_navigates_to_address_book_in_my_account() throws Throwable {
		Thread.sleep(Constants.thread_low);
		if ("mobile".equalsIgnoreCase(testtype)) {
			scrollPageToWebElement(r2_MyAccount_PO.myAccount_txt_Mobile);
			clickOnButton(r2_MyAccount_PO.myAccount_txt_Mobile);
			scrollPageToWebElement(r2_MyAccount_PO.addressBook_M);
			clickOnButton(r2_MyAccount_PO.addressBook_M);
		} else {
			assertTrue(clickOnButton(r2_MyAccount_PO.lnkMyAccount));
			assertTrue(clickOnButton(r2_MyAccount_PO.myAccount_MyAccountList_AddressBook_lnk));
		}
	}

	@Then("^my account cta is displayed$")
	public void my_account_cta_is_displayed() throws Throwable {
		assertTrue(isDisplayed(r2R1FunPo.lnkSignInMobile));
	}

	@And("^user navigates to wishlist in my account$")
	public void user_navigates_to_wishlist_in_my_account() throws Throwable {
		Thread.sleep(Constants.thread_low);
		if ("mobile".equalsIgnoreCase(testtype)) {
			scrollPageToWebElement(r2_MyAccount_PO.myAccount_txt_Mobile);
			clickOnButton(r2_MyAccount_PO.myAccount_txt_Mobile);
			scrollPageToWebElement(r2_MyAccount_PO.Wishlist_Mobile_lnk);
			clickOnButton(r2_MyAccount_PO.Wishlist_Mobile_lnk);
		} else {
			assertTrue(clickOnButton(r2_MyAccount_PO.lnkMyAccount));
			assertTrue(clickOnButton(r2_MyAccount_PO.wishList));
		}
	}

	@And("^user navigates to payments in my account$")
	public void user_navigates_to_payments_in_my_account() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			scrollPageToWebElement(r2_MyAccount_PO.myAccount_txt_Mobile);
			clickOnButton(r2_MyAccount_PO.myAccount_txt_Mobile);
			scrollPageToWebElement(r2R1FunPo.payment_M_Txt);
			clickOnButton(r2R1FunPo.payment_M_Txt);
		} else {
			assertTrue(clickOnButton(r2_MyAccount_PO.myAccount));
			assertTrue(clickOnButton(r2_MyAccount_PO.myAccount_MyAccountList_Payment_lnk));
		}
		Thread.sleep(Constants.thread_low);
	}
	
}
