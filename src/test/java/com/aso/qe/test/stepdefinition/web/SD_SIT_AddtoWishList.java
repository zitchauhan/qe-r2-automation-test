package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;


import org.apache.log4j.Logger;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.SIT_AddtoWishListPageObject;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;

import cucumber.api.java.en.Then;

public class SD_SIT_AddtoWishList extends CommonActionHelper {
		private static final  Logger logger = Logger.getLogger(SD_SIT_AddtoWishList.class);
		SIT_AddtoWishListPageObject WishlistPo= PageFactory.initElements(driver, SIT_AddtoWishListPageObject.class);
		GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
		//SD_SIT_AddtoWishList AddWishlistPo= new SD_SIT_AddtoWishList();
		
		
		@Then("^user click on Add to Wish List/Sign In$")
		public void user_click_on_Add_to_Wish_List_Sign_In() throws Throwable {
			assertTrue(clickOnButton(WishlistPo.lnkaddtowishlist));
		}
		
		@Then("^user click on MyAccount link$")
		public void user_click_on_MyAccount_link() throws Throwable {
			globalElementHeader.clickMyAccountDropDown();
		}
		
		@Then("^user click on WishList link$")
		public void user_click_on_WishList_link() throws Throwable {
						
			
				globalElementHeader.clickOnWishListsFromMyAccount();
			
		}
		 
		@Then("^user should verify the WishList page and create new Wishlist$")
		public void user_should_verify_the_WishList_page_and_create_new_Wishlist() throws Throwable {
			assertTrue(clickOnButton(WishlistPo.btnNewWishlist));
			assertTrue(isDisplayed(WishlistPo.tltCreatewishlist));
			WishlistPo.enterListName();
			assertTrue(clickOnButton(WishlistPo.btncancel));
			assertTrue(clickOnButton(WishlistPo.btnNewWishlist));
			assertTrue(clickOnButton(WishlistPo.btnsave));
			
		}
		
		@Then("^user should verify the created WishList$")
		public void user_should_verify_the_created_WishList() throws Throwable {
			String wishlist= getText(WishlistPo.txtwishlistselect);
			logger.info("Created Wishlist name " + wishlist);
			
		}
		
		@Then("^user should rename the created WishList$")
		public void user_should_rename_the_created_WishList() throws Throwable {
			assertTrue(clickOnButton(WishlistPo.btnrenamewishlist));
			//AddWishlistPo.clearInputBox(WishlistPo.txtListname);
			WishlistPo.txtrenamewishlistselect.clear();
			setInputText(WishlistPo.txtrenamewishlistselect, "Rename wishlist");
			assertTrue(clickOnButton(WishlistPo.btnrenamesave));
			
		}
		

		@Then("^user should delete the created WishList$")
		public void user_should_delete_the_created_WishList() throws Throwable {
			assertTrue(clickOnButton(WishlistPo.btndeletewishlist));
			assertTrue(isDisplayed(WishlistPo.tltDeletewishlist));
			assertTrue(clickOnButton(WishlistPo.btndeletecancel));
			assertTrue(clickOnButton(WishlistPo.btndeletewishlist));
			assertTrue(clickOnButton(WishlistPo.btndelete));
		}
		
		
		@Then("^user should create a WishList$")
		public void user_should_create_a_WishList() throws Throwable {
			WishlistPo.txtcreatenewwishlist.sendKeys("Mywish");
			assertTrue(clickOnButton(WishlistPo.btncreatenewwishlist));
//			assertTrue(clickOnButton(WishlistPo.lnkaddtowishlist));
//			assertTrue(clickOnButton(WishlistPo.lnkaddtowishlist));
//			assertTrue(isDisplayed(WishlistPo.txtcreatedwishlist));
			
		}

		@Then("^user should delete a WishList$")
		public void user_should_delete_a_WishList() throws Throwable {
		   
		}
		
	

}

	
	

