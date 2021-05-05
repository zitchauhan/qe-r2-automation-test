package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.BottomNav;
import com.aso.qe.test.pageobject.ios.PDPPage;
import com.aso.qe.test.pageobject.ios.PLPPage;
import org.openqa.selenium.By;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.GlobalMobileHelper.Direction;
import com.aso.qe.test.pageobject.ios.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Locale;

public class HomeStepDef extends GlobalMobileHelper{
	
	HomePage homePage = new HomePage(driver);
	BottomNav bottomNav = new BottomNav(driver);
	PLPPage plpPage = new PLPPage(driver);
	PDPPage pdpPage = new PDPPage(driver);
	
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

	
	@And("^User Goes to home page$")
	public void moveToHomePage() {
	homePage.moveToHomePage();}

	@And("^User Sees the Hero Banner$")
	public void isHeroBannerDisplayed() {
	assertTrue(homePage.isHeroBannerDisplayed());
	
	}


	
	@When("^user see \"([^\"]*)\" on home page$")
	public void user_see_on_home_page(String pagename) {
		assertTrue(homePage.varifyElementPresenseOnHomePage(pagename));
	}

	@When("^User sees \"([^\"]*)\" on home page$")
	public void user_sees_on_home_page(String arg1) {
		assertTrue(homePage.varifyElementPresenseOnHomePage(arg1));
	}

	@When("^User click on the \"([^\"]*)\" on home page$")
	public void user_click_on_Banner_Cta(String arg2) {
		if (arg2.contains("information")){
			tapOnElement(Locators.HomePage.buttonInfoMessageCTA);
		}else {
			homePage.tapOnInstructionBanner(arg2);
		}
	}

	@Then("^User is on Instruction banner page$")
	public void user_is_on_Instruction_banner_page() {
		GlobalMobileHelper.setImplicitWaitTo(driver, 5);
		assertTrue(homePage.isOnInstructionBanner());
	}

	@When("User swipes to information section of the home page")
	public void userSwipesToInformationSectionOfTheHomePage() {
		/* Created By jitsingh7 on 21/04/21 */
		swipeScreen(Direction.UP); // as of now only one swipe is required.
	}

	@Then("User is on Information message page")
	public void userIsOnInformationMessagePage() {
		/* Created By jitsingh7 on 21/04/21 */
		assertTrue(homePage.isOnInformationMessagePage());
	}

	@And("^User sees information message title \"([^\"]*)\" on home page$")
	public void userSeesInformationMessageTitleOnHomePage(String titleText) {
		/* Created By jitsingh7 on 21/04/21 */
		String infoMessageTitle = getElementText(Locators.HomePage.labelInfoMessagetitle);
		assertTrue(infoMessageTitle.toLowerCase().contains(titleText.toLowerCase()));
	}

	@And("User sees information message subtitle \"([^\"]*)\" on home page")
	public void userSeesInformationMessageSubtitleOnHomePage(String subTitleText) {
		/* Created By jitsingh7 on 21/04/21 */
		assertTrue(getElementText(Locators.HomePage.labelInfoMessageSubtitle).toLowerCase().contains(subTitleText.toLowerCase()));
	}
	@When("^User sees the Offer Details and terms and conditions \"([^\"]*)\"$")
	public void user_sees_the_Offer_Details_and_terms_and_conditions(String offerDetailsTitle) throws Throwable {
		assertTrue(getElementText(Locators.HomePage.titleOferDetails).toLowerCase().contains(offerDetailsTitle.toLowerCase()));
	}
	@When("^User click on Offer Details and terms and conditions$")
	public void user_click_on_Offer_Details_and_terms_and_conditions() throws Throwable {
	   homePage.tapOnOfferDetails();
	}

    @When("User adds product \"([^\"]*)\" using search")
    public void userAddsProductUsingSearch(String productName) throws Throwable {
        /* Created By jitsingh7 on 01/05/2021 */
		bottomNav.tapOnHome();
		searchProductByName(productName);
		plpPage.tapOnFirstProduct();
		waitForDefaultTime();
		pdpPage.tapOnAddToCart();
		tapOnElement(Locators.PDPPage.buttonViewCart);
		waitForDefaultTime();
    }
    
    
    @When("^User continues as \"([^\"]*)\" on onboarding page$")
    public void user_continues_as_on_onboarding_page (String btnName) throws Throwable {
   	 homePage.tapOnButtonOnOnboarding(btnName);
    }

}
