package com.aso.qe.test.stepdefinition.ios;
import static org.junit.Assert.assertTrue;

import org.codehaus.plexus.logging.Logger;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.Context;
import com.aso.qe.test.pageobject.ios.ShopPage;
<<<<<<< HEAD
import com.aso.qe.test.pageobject.ios.WishlistPage;

import cucumber.api.java.en.And;
=======
>>>>>>> origin/Feature_Mamta_MobileApp
import cucumber.api.java.en.Then;

public class ShopStepDef extends GlobalMobileHelper{
	ShopPage shopPage = new ShopPage(driver);
	
	@Then("^User sees the shop page$")
	public void userIsOnShopPage() {
		assertTrue(shopPage.isShopPageDisplayed());
	}
<<<<<<< HEAD
	@And("^User click on Shop sub categories$")
	public void tapOnSubCat() {
		shopPage.tapOnShopSubCat();
	}
	@And("^User click on Shop All$")
	public void tapOnShopAll() {
		shopPage.tapOnShopAll();
=======
	
	@Then("^User sees the categories list is not empty$")
	public void userSeesCategories() throws InterruptedException {
		shopPage.isCategoriesDisplayed();
	}

	
	@Then("^User navigates to \"([^\"]*)\" category in the list$")
	public void user_navigates_to_link_in_the_list(String category) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    shopPage.navigateToNthLinkInList(category);
	}
	
	@Then("^User verifies the level One category list$")
	public void user_navigates_to_the_level_One_category_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		shopPage.verifyL1CategoryLevel();
	}
	
	@Then("^User verifies the level two category list$")
	public void user_navigates_to_the_level_two_category_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		shopPage.verifyL2CategoryLevel();
	}

	@Then("^User verifies the level three category list$")
	public void user_navigates_to_the_level_three_category_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		shopPage.verifyL3CategoryLevel();
	}
	@Then("^verify user is on \"([^\"]*)\" page$")
	public void verify_user_is_on_page(String category) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		shopPage.verifyCategoryTitle(category);
	}
	
	@Then("^User navigates to link (\\d+) in the list$")
	public void user_navigates_to_link_in_the_list(int linkNumber) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    shopPage.navigateToNthLinkInList(linkNumber);
	}
	
	@Then("^User taps on shop all link$")
	public void user_taps_on_shop_all_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		shopPage.navigateToShopAllLink();
	}

	@Then("^User fetch the sub category name list$")
	public void user_fetch_the_category_name_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Context.setShopBySubCategoryList(shopPage.getCategoryList());
	}
	@Then("^User verifies all categories and navigates to each PLP from Shop By Category$")
	public void user_verifies_all_categories_and_navigates_to_each_PLP_from_Shop_By_Category() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    shopPage.verifyAllCategoriesAndPLP();
	}
	
	@Then("^User fetch the \"([^\"]*)\" list$")
	public void user_fetch_the_list(String categoryLevel) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    if(categoryLevel.equalsIgnoreCase("L1 category")) {
	    	shopPage.L1CategoryList();
	    }else if(categoryLevel.equalsIgnoreCase("L2 category")) {
	    	shopPage.L2CategoryList();
	    }else if(categoryLevel.equalsIgnoreCase("L3 category")) {
	    	shopPage.L3CategoryList();
	    } 
	}
	@Then("^User taps on back button$")
	public void user_taps_on_back_button() throws InterruptedException {
		shopPage.tapOnBackbtn(driver);
>>>>>>> origin/Feature_Mamta_MobileApp
	}
}
