package com.aso.qe.test.stepdefinition.ios;
import static org.junit.Assert.assertTrue;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.ShopPage;
import cucumber.api.java.en.Then;

public class ShopStepDef extends GlobalMobileHelper{
	
	ShopPage shopPage = new ShopPage(driver);
	
	@Then("^User sees the shop page$")
	public void userIsOnShopPage() {
		assertTrue(shopPage.isShopPageDisplayed());
	}
	
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
		assertTrue("shop all link is not present",GlobalMobileHelper.isElementDisplayed(Locators.ShopPage.shopAllLink));
		GlobalMobileHelper.tapOnElement(Locators.ShopPage.shopAllLink);
	}
	@Then("^User fetch the sub category name list$")
	public void user_fetch_the_category_name_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    shopPage.getCategoryList();
	}
}
