package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.Then;

public class R2_MYACCOUNT_K4233_SD extends CommonActionHelper {
	
	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	
	@Then("^user click on WishList$")
	public void user_click_on_WishList() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(clickOnButton(r2MyAccountPo.Wishlist_Mobile_lnk));
		}
		else
		{
			assertTrue(clickOnButton(r2MyAccountPo.wishList));
		}
	}
	
	@Then("^user clicks on Create List$")
	public void user_clicks_on_Create_List() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.Wishlist_createlist_lnk));
	}
	
	
	@Then("^user enters Wishlist name \"(.*?)\"$")
	public void user_enters_Wishlist_name(String arg1) throws Throwable {
		setInputText(r2MyAccountPo.Wishlist_name_txt, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user click on create list$")
	public void user_click_on_create_list() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.btnCreateWishList));
	}
	
	@Then("^Verify that Create Your First Wish List button$")
	public void verify_that_Create_Your_First_Wish_List_button() throws Throwable {
		assertTrue(isDisplayed(r2MyAccountPo.btnCreateNewWishlist));
	}
	
	@Then("^user clicks on WishListItems$")
	public void user_clicks_on_WishListItems() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.WishlistItems_lnk));
	}
	
	@Then("^user clicks on Delete list$")
	public void user_clicks_on_Delete_list() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(clickOnButton(r2MyAccountPo.Wishlist_icn));
			assertTrue(clickOnButton(r2MyAccountPo.DeleteList_btn));
			
		}
		else
		{
			assertTrue(clickOnButton(r2MyAccountPo.DeleteList_btn));
		}
	}
	
	@Then("^user clicks on Delete WishList$")
	public void user_clicks_on_Delete_WishList() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.DeleteWishList_btn));
		
	}
	@Then("^user clicks on create$")
	public void user_clicks_on_create() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.btnSubmit));
	}
	
	@Then("^verify the created list$")
	public void verify_the_created_list() throws Throwable {
		assertTrue(isDisplayed(r2MyAccountPo.WishlistItems_lnk));
	}
	
	@Then("^user clicks on Rename List$")
	public void user_clicks_on_Rename_List() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.Rename_list_lnk));
	}
	
	@Then("^clicks on browse products$")
	public void clicks_on_browse_products() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.browse_products_btn));
		
	}


}
