package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;

import cucumber.api.java.en.Then;

public class R1SP1_KER_262_Global_Header_SD extends CommonActionHelper{
	//private static final Logger logger = Logger.getLogger(R1SP1_KER_728_Web_SD.class);

	GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	//public ShoppingCartViewPO shoppingCartViewPO =  PageFactory.initElements(driver, ShoppingCartViewPO.class);


	@Then("^User will verify the presence of Sign In$")
	public void user_will_verify_the_presence_of_Sign_In() throws Throwable {
		//scrollPageToWebElement(globalElementHeader.btnSignIn);
		globalElementHeader.verifypresenceofsigninlink();


	}
	@Then("^User will verify the presence of ASO Logo$")
	public void user_will_verify_the_presence_of_ASO_Logo() throws Throwable {
		//scrollPageToWebElement(globalElementHeader.btnSignIn);
		globalElementHeader.clickASO_LOGO();


	}
	@Then("^User will verify the presence of WeeklyAD$")
	public void user_will_verify_the_presence_of_WeeklyAD() throws Throwable {
		globalElementHeader.validateWeeklyAdLinkPresence();

	}
	@Then("^User will verify the presence of Find a Store$")
	public void user_will_verify_the_presence_of_Find_a_Store() throws Throwable {
		globalElementHeader.validatePreseneceOfFindStore();
	}
	@Then("^User will verify the presence of search$")
	public void user_will_verify_the_presence_of_search() throws Throwable {
		globalElementHeader.validatingTxtSearchBox();
	}
	@Then("^User will verify the presence of add to cart icon$")
	public void user_will_verify_the_presence_of_add_cart_icon() throws Throwable {
		globalElementHeader.validatingAddtoCartIcon();
	}

	@Then("^User will verify the presence of shop category$")
	public void user_will_verify_the_presence_of_shop_category() throws Throwable {

		globalElementHeader.validatingShopCategory();
	}
	@Then("^User will verify the presence of trending category$")
	public void user_will_verify_the_presence_of_trending_category() throws Throwable {

		globalElementHeader.validatingTrendingCategory();
	}
	@Then("^User will verify the presence of deals category$")
	public void user_will_verify_the_presence_of_deals_category() throws Throwable {

		globalElementHeader.validatingDealsCategory();
	}
	
	@Then("^Verify signout from my account$")
	public void verify_signout_from_my_account() throws Throwable {
		assertTrue(clickOnButton(globalElementHeader.btnMyAccount));
		Thread.sleep(1000);
		assertTrue(clickOnButton(globalElementHeader.btnSignOut));
	}

	@Then("^verify account summary detail from my account$")
	public void verify_account_summary_detail_from_my_account() throws Throwable {
	 
		assertTrue(isDisplayed(globalElementHeader.btmkAccountSummary_M));
	}
	
	//###################
	@Then("^User to verify serch option box is available$")
	public void user_to_verify_serch_option_box_is_available() throws Throwable {
	    assertTrue(isDisplayed(globalElementHeader.searchBox_M));
		
	}

	@Then("^User to verify search for any requirement\"(.*?)\"$")
	public void user_to_verify_search_for_any_requirement(String data) throws Throwable {
		
		waitForPageLoad(driver);
		Thread.sleep(4000);
		globalElementHeader.searchBox_M.sendKeys(data);
		String actText=getText(globalElementHeader.verifyPantInSearch_M);
	     assertEquals(actText, "pant");
		
	}
	

	@Then("^User to click on search button after putting data$")
	public void user_to_click_on_search_button_after_putting_data() throws Throwable {
	    
	}
	@Then("^User to click on search button after putting data\"(.*?)\"$")
	public void user_to_click_on_search_button_after_putting_data(String data) throws Throwable {
		waitForPageLoad(driver);
		Thread.sleep(4000);
		globalElementHeader.searchBox_M.sendKeys(data);
		clickOnButton(globalElementHeader.searchbtn_M);
		assertTrue(isDisplayed(globalElementHeader.searchResultText_M));
		
	}

	@Then("^User to verify magnifying glass icon when scroll down$")
	public void user_to_verify_magnifying_glass_icon_when_scroll_down() throws Throwable {
	    assertTrue(isDisplayed(globalElementHeader.magnifying_M));
	}
	

	@Then("^user to verify global search box functionality\"(.*?)\"$")
	public void user_to_verify_global_search_box_functionality(String data) throws Throwable {
		Thread.sleep(4000);
		   globalElementHeader.searchBox_M.sendKeys(data);
			clickOnButton(globalElementHeader.searchbtn_M);
			assertTrue(isDisplayed(globalElementHeader.searchResultText_M));
	}

	
	@Then("^user verify signup and signin$")
	public void user_verify_signup_and_signin() throws Throwable {
	    assertTrue(isDisplayed(globalElementHeader.btmSignIn));
	    assertTrue(isDisplayed(globalElementHeader.linkSignUP ));
	}
	
	
}
