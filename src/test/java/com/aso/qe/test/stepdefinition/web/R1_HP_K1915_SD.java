package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R1_SIT_PO;

import cucumber.api.java.en.Then;

public class R1_HP_K1915_SD extends CommonActionHelper {
	R1_PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), R1_PDP_PO.class);
	public R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);
	public R1_SIT_PO AddtoWishListPageObjectPo = PageFactory.initElements(getDriver(), R1_SIT_PO.class);
	String timeStamp = new SimpleDateFormat("MM.dd.HH.mm.ss").format(new Date());  //Sid

	@Then("^user create new Wishlist$")
	public void user_create_new_Wishlist() throws Throwable {
		assertTrue(clickOnButton(AddtoWishListPageObjectPo.btnNewWishlist));
		setInputText(AddtoWishListPageObjectPo.txtListname, timeStamp);
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
	
	@Then("^user should not be able to see Add WishList link$")
	public void user_should_not_be_able_to_see_Add_WishList_link() throws Throwable {
		assertFalse(isDisplayed(pdpPageObj.btnAddToWishList));
	}
}
