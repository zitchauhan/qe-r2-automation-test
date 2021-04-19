package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.GlobalMobileHelper.Direction;
import com.aso.qe.test.pageobject.ios.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeStepDef extends GlobalMobileHelper{
	
	HomePage homePage = new HomePage(driver);
	
	@Then("^User sees the homepage$")
	public void userIsOnHomePage() {
		GlobalMobileHelper.setImplicitWaitTo(driver, 5);
		assertTrue(homePage.isOnHomePage());
	}
	
	@When("^User navigates to pdp$")
	public void tapOnGoToPDPButton() {
		homePage.tapOnProduct();
	}
	@When("^User taps on go to shop button$")
	public void tapOnHomeShopButton() {
		homePage.tapOnShopButton();
	}
	


	@When("^User clicks on product$")
	public void tapOnProductId() {
	
		homePage.tapOnAdidasTshirt();
	}
	@When("^User navigate to Home Page$")
	public void tabOnHomeBtn() {
		homePage.tapOnHomeBtn();
	}
	@And("^User click on the product golf Ball$")
	public void tapOnProductGolfBall() {
		homePage.taponGolfBallProduct();
	}
	@And("^User Sees the Search Box$")
	public void isSearchBoxDisplayed() {
		assertTrue(homePage.isSearchBoxDisplayed());
	}
	@Then("^User clicks on the Search Box$")
	public void tapOnSearchBox() {
		homePage.tapOnSearchBox();
	}
	@Then("^User Sees the Shop New section$")
	public void isShopNewSectionAvailable() {
		homePage.isShopNewSectionDisplayed();
	}
	@And("^user click on shop new Section$")
	public void tapOnShopNewSection() {
		homePage.tapOnShopNewSection();
	}
	@And("^user sees the academy Exclusive component$")
	public void isAcademyExclusiveDisplayed() {
		homePage.isAcademyExclusiveDisplayed();
	}
	@Then("^user click on the academy Exclusive Banner$")
	public void tapOnAcademyExclusiveBanner() {
		homePage.tapOnAcademyExcusiveBanner();
	}
	@And("^User Clicks On MaY Be Later$")
	public void tapOnMaybelater() {
		homePage.tapOnMayBelater();
	}
	@And("^User Sees the Hero Banner$")
	public void isHeroBannerDisplayed() {
	assertTrue(homePage.isHeroBannerDisplayed());
	
	}
	@And("^User Goes to home page$")
	public void moveToHomePage() {
		homePage.moveToHomePage();
	}
	
	@When("^user see \"([^\"]*)\" on home page$")
	public void user_see_on_home_page(String pagename) {
		assertTrue(homePage.VarifyElementPresenseOnHomePage(pagename));
	}

	@When("^User sees \"([^\"]*)\" on home page$")
	public void user_sees_on_home_page(String arg1) {
		assertTrue(homePage.VarifyElementPresenseOnHomePage(arg1));
	}

	@When("^User click on the \"([^\"]*)\" on home page$")
	public void user_click_on_Banner_Cta(String arg2) {
		homePage.tapOnInstructionBanner(arg2);
	}

	@When("^User is on Instruction banner page$")
	  public void user_is_on_Instruction_banner_page() {
		//no action
	  }
}
