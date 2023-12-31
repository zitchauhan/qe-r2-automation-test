package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.CartPage;
import com.aso.qe.test.pageobject.ios.HomePage;
import com.aso.qe.test.pageobject.ios.PDPPage;
import com.aso.qe.test.pageobject.ios.WishlistPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WishListStepDef extends GlobalMobileHelper{
	
	WishlistPage wishlistPage = new WishlistPage(driver);
	
	@Then("^User sees the wishlist page$")
	public void userIsOnWishlistPage() {
		assertTrue(wishlistPage.isWishListPageDisplayed());
	}
	
	@Then("^User should not see the wishlist page$")
	public void wishListPageNotBeDisplayed() {
		assertTrue(!wishlistPage.isWishListPageDisplayed());
	}

	//OMNI-28640
	@When("^User taps on \"([^\"]*)\" button$")
	public void user_taps_on_button(String arg1){
			wishlistPage.tapOnButton(arg1);
	}

	@Then("^User sees \"([^\"]*)\" screen$")
	public void user_sees_page(String arg) {
		verifyUserIsOnPage(arg);
	}

	@Then("^User renames wishlist$")
	public void user_renames_wishlist(){
		String rename = "Favourite List";
		wishlistPage.renameWishlist(rename);
	}
	
	@Then("^User sees \"([^\"]*)\"$")
	public void user_sees_Updated_name(String arg1){
		assertTrue(wishlistPage.verifyUpdatedName(arg1));
	}
	
	@Then("^User sees \"([^\"]*)\" pop up$")
	public void user_sees_Confirmation_popup(String arg1){
		wishlistPage.verifyConfirmationPopup(arg1);
	}
	
	@Then("^User sees that wishlist is deleted$")
	public void user_sees_that_wishlist_is_deleted(){
		GlobalMobileHelper.setImplicitWaitTo(driver, 5);
		assertTrue(wishlistPage.isOnEditWishlistPage());
	}

	//OMNI-33102
	@When("^User taps on Wishlist$")
	public void tapOnWishlist() {
		wishlistPage.tapOnWishList();
	}
	
	@Then("^User taps on \"([^\"]*)\" icon$")
	public void user_taps_on__Wishlisticon(String arg1) {
		wishlistPage.tapOnWishListIcon(arg1);
	}

	@Then("^User enters wishlist name$")
	public void enterWishlistName() {
			String wishlist = "My List";
			wishlistPage.enterWishlistName(wishlist);
	}

	@Then("^User sees \"([^\"]*)\" button enabled$")
	public void user_sees_button_enabled(String btn) {
		wishlistPage.buttonEnabled(btn);
	}


	@When("^User taps on \"([^\"]*)\" back button$")
	public void user_taps_on_back_button(String back) {
		wishlistPage.tapOnBackButton(back);
	}

	@Then("^User sees item count in wishlist items screen$")
	public void isItemCountDisplayed() {
		assertTrue(wishlistPage.isItemCountDisplayed());
	}

	@Then("^User sees \"([^\"]*)\" of the wishlist item$")
	public void isWishListItemDisplayed(String arg) {
		assertTrue(wishlistPage.isWishListItemDisplayed(arg));
	}

	@Then("^User taps on wishlist \"([^\"]*)\"$")
	public void tapOnWishList(String wishlist) {
		wishlistPage.tapOnWishList(wishlist);
	}

	@Then("^User is taken to \"([^\"]*)\" wishlist$")
	public void isWishListDisplayed(String wishlist) {
		wishlistPage.isWishListDisplayed(wishlist);
	}

	@When("^User taps on Remove button$")
	public void tapOnRemoveButton() {
		wishlistPage.tapOnRemoveButton();
	}

	@Then("^User is shown the confirmation popup$")
	public void isConfirmationPopUpDisplayed() {
		assertTrue(wishlistPage.isConfirmationPopUpDisplayed());
	}
	
	//OMNI-28622
	@When("^User taps on \"([^\"]*)\" wishlist$")
	public void user_taps_on_wishlist(String arg1){
		wishlistPage.tapOnCreatedWishList(arg1);
	}
	
	@Then("^User sees \"([^\"]*)\" on wishlist page$")
	public void user_sees_on_wishlist_page(String arg1) {
		assertTrue(wishlistPage.varifyElementPresenseOnPage(arg1));
	}
	@Then("^User sees information message title \"([^\"]*)\" on wishlist page$")
	public void user_sees_title_on_wishlist_page(String titleText) {
		String infoMessageTitle = getElementText(Locators.HomePage.labelInfoMessagetitle);
		assertTrue(infoMessageTitle.toLowerCase().contains(titleText.toLowerCase()));	}

	@Then("^User sees information message subtitle \"([^\"]*)\" on wishlist page$")
	public void user_sees_information_message_subtitle_on_wishlist_page(String subTitleText){
		assertTrue(getElementText(Locators.HomePage.labelInfoMessageSubtitle).toLowerCase().contains(subTitleText.toLowerCase()));
	}
	
	@Then("^User click on the \"([^\"]*)\" on wishlist page$")
	public void user_click_on_cta(String arg1){
		if (arg1.contains("Visit Academy.com")){
			tapOnElement(Locators.WishlistPage.bannerCTA);
		}else {
			wishlistPage.tapOnBannerCta(arg1);
		}
	}
	
	@Then("^I choose to verify user navigated to Web$")
	public void i_choose_to_verify_user_navigated_to_Web() {
		assertTrue(wishlistPage.isNavigatedToWeb());
	}
	
	@Then("^User sees \"([^\"]*)\" on existing wishlist$")
	public void user_sees_on_existing_wishlist(String elementname) throws Throwable {
		assertTrue(wishlistPage.VarifyElementPresenseOnexistingwishlist(elementname));

	}
	
	@Then("^user click on \"([^\"]*)\" on existing wishlist$")
	public void user_click_on_on_existing_wishlist(String btnName) throws Throwable {
		wishlistPage.clickonButtononexistingwishlist(btnName);
	}
	
}
