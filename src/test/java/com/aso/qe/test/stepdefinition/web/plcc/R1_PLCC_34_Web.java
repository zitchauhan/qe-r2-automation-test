package com.aso.qe.test.stepdefinition.web.plcc;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_LandingPage_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Registration_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_PLCC_34_Web extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_LandingPage_PO plccLandingPageObjects = PageFactory.initElements(driver, R1_PLCC_LandingPage_PO.class);
	R1_PLCC_Registration_PO plccPageObjects = PageFactory.initElements(driver, R1_PLCC_Registration_PO.class);

	@When("^user click on AcademyCreditCard link in the footer section of ASO-Home page$")
	public void user_click_on_AcademyCreditCard_link_in_the_footer_section_of_ASO_Home_page() throws Throwable {
		plccLandingPageObjects.clickOnAcademyCreditCardFooterLink();
	}

	@Then("^user expect element FPO Apply Order section to be present$")
	public void user_expect_element_FPO_Apply_Order_section_to_be_present() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfFPOApplyCardSection();
	}

	@Then("^user expect element Benefits section to be present$")
	public void user_expect_element_Benefits_section_to_be_present() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfBenefitsSection();
	}

	@Then("^user expect element prescreen section to be present$")
	public void user_expect_element_prescreen_section_to_be_present() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfPrescreenSection();

	}

	@When("^user enter Email address in sign-in page \"(.*?)\"$")
	public void user_enter_Email_address_in_sign_in_page(String arg1) throws Throwable {
		plccLandingPageObjects.enterEmailTxtFieldOnSignInPage(arg1);
		assertTrue(isDisplayed(plccLandingPageObjects.emailTxtField));
		waitForElement(plccLandingPageObjects.emailTxtField);
	}

	@When("^user enter password in sign-in page \"(.*?)\"$")
	public void user_enter_password_in_sign_in_page(String arg1) throws Throwable {
		plccLandingPageObjects.enterPasswordTxtFieldOnSignInPage(arg1);
		assertTrue(isDisplayed(plccLandingPageObjects.passwordTxtField));
		waitForElement(plccLandingPageObjects.passwordTxtField);
	}

	@When("^user click on Signin-button$")
	public void user_click_on_Signin_button() throws Throwable {
		plccLandingPageObjects.clickOnSignInBtnSignInPage();
	}

	@When("^user navigates to ASO-Home page$")
	public void user_navigates_to_ASO_Home_page() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfASOHomePage();
	}

	@Then("^user expect element AcademyLogo to be present$")
	public void user_expect_element_AcademyLogo_to_be_present() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfAcademyLogo();
	}

	@Then("^user expect element FindAStoreLink to be present$")
	public void user_expect_element_FindAStoreLink_to_be_present() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfFindAStoreLink();
	}

	@Then("^user expect element ShopTab to be present$")
	public void user_expect_element_ShopTab_to_be_present() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfShopTab();
	}

	@Then("^user expect element Search Input Field to be present$")
	public void user_expect_element_Search_Input_Field_to_be_present() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfSearchField();
	}

	@Then("^user expect element Deals Tab to be present$")
	public void user_expect_element_Deals_Tab_to_be_present() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfDealsTab();
	}

	@Then("^user expect element My Account Link to be present$")
	public void user_expect_element_My_Account_Link_to_be_present() throws Throwable {
		plccPageObjects.verifyPresenceOfMyAccountLink();
	}

	@Then("^user expect element WeeklyAd Link to be present$")
	public void user_expect_element_WeeklyAd_Link_to_be_present() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfWeeklyAdLink();
	}
}
