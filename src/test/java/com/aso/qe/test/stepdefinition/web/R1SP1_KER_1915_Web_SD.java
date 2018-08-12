package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.PDP_PO;
import com.aso.qe.test.pageobject.SIT_AddtoWishListPageObject;

import cucumber.api.java.en.Then;

public class R1SP1_KER_1915_Web_SD extends CommonActionHelper {
	PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), PDP_PO.class);
	public GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver,
			GlobalElementHeader_HomePO.class);
	public SIT_AddtoWishListPageObject AddtoWishListPageObjectPo = PageFactory.initElements(getDriver(), SIT_AddtoWishListPageObject.class);
	

	@Then("^user create new Wishlist \"(.*?)\"$")
	public void user_create_new_Wishlist(String wishlist) throws Throwable {
		assertTrue(clickOnButton(AddtoWishListPageObjectPo.btnNewWishlist));
		setInputText(AddtoWishListPageObjectPo.txtListname, wishlist);
		assertTrue(clickOnButton(AddtoWishListPageObjectPo.btnsave));
	}
	
	@Then("^user create exsiting Wishlist \"(.*?)\"$")
	public void user_create_exsiting_Wishlist(String wishlist) throws Throwable {
		assertTrue(clickOnButton(AddtoWishListPageObjectPo.btnNewWishlist));
		setInputText(AddtoWishListPageObjectPo.txtListname, wishlist);
		assertTrue(clickOnButton(AddtoWishListPageObjectPo.btnsave));
	}

	@Then("^verify error message$")
	public void verify_error_message() throws Throwable {
		assertTrue(isDisplayed(globalElementHeader.addWishListError));
	}
	
	
	@Then("^user click on Add WishList link$")
	public void user_click_on_Add_WishList_link() throws Throwable {
		assertTrue(isDisplayed(pdpPageObj.btnAddToWishList));
	}
}
