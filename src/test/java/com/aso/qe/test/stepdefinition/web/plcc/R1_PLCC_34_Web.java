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
	@Then("^user expect element ApplyNow_Btn to be present$")
	public void user_expect_element_ApplyNow_Btn_to_be_present() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfApplyNowButton();
	}

	@Then("^user expect element ManageYourCardLink to be present$")
	public void user_expect_element_ManageYourCardLink_to_be_present() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfManageYourCardLink();
	}

	@Then("^user expect element PLCCCreditCardImage to be present$")
	public void user_expect_element_PLCCCreditCardImage_to_be_present() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfPLCCCreditCardImage();
	}
	
	//Footer Link//
	@Then("^user expect element ThisIsAcademy to be present$")
	public void user_expect_element_ThisIsAcademy_to_be_present() throws Throwable {
		plccPageObjects.validatingPresenceOfThisAcademy();
	}

	@Then("^user expect element NeedHelp to be present$")
	public void user_expect_element_NeedHelp_to_be_present() throws Throwable {
		plccPageObjects.validatingPresenceOfNeedHelp();
	}

	@Then("^user expect element PressReleases to be present$")
	public void user_expect_element_PressReleases_to_be_present() throws Throwable {
		globalElementHeader.validatingPressRoom();
	}

	@Then("^user expect element CheckOrder to be present$")
	public void user_expect_element_CheckOrder_to_be_present() throws Throwable {
		plccPageObjects.validatingCheckOrderStatus();
	}

	@Then("^user expect element ReturnPolicy to be present$")
	public void user_expect_element_ReturnPolicy_to_be_present() throws Throwable {
		globalElementHeader.validatingReturnPolicy();
	}

	@Then("^user expect element ProductRecall to be present$")
	public void user_expect_element_ProductRecall_to_be_present() throws Throwable {
		globalElementHeader.validatingProductRecall();
	}

	@Then("^user expect element Rebates to be present$")
	public void user_expect_element_Rebates_to_be_present() throws Throwable {
		globalElementHeader.validatingRebates();
	}

	@Then("^user expect element PhoneNumberL to be present$")
	public void user_expect_element_PhoneNumberL_to_be_present() throws Throwable {
		plccPageObjects.validatingPresenceOfContactNumber();
	}

	@Then("^user expect element CustomerCare to be present$")
	public void user_expect_element_CustomerCare_to_be_present() throws Throwable {
		globalElementHeader.validatingCustomercare();
	}

	@Then("^user expect element Services to be present$")
	public void user_expect_element_Services_to_be_present() throws Throwable {
		plccPageObjects.validatingPresenceOfServices();
	}

	@Then("^user expect element ShopGiftCards to be present$")
	public void user_expect_element_ShopGiftCards_to_be_present() throws Throwable {
		globalElementHeader.validatingGiftcards();
	}

	@Then("^user expect element CheckGiftCradBalance to be present$")
	public void user_expect_element_CheckGiftCradBalance_to_be_present() throws Throwable {
		plccPageObjects.validatingPresenceOfCheckGiftCardBalance();
	}

	@Then("^user expect element AcademyCreditCard to be present$")
	public void user_expect_element_AcademyCreditCard_to_be_present() throws Throwable {
		globalElementHeader.validatingAcademyCreditCard();
	}

	@Then("^user expect element StoreServicesLink to be present$")
	public void user_expect_element_StoreServicesLink_to_be_present() throws Throwable {
		globalElementHeader.validatingStoreServices();
	}

	@Then("^user expect element FindInStoreFooter to be present$")
	public void user_expect_element_FindInStoreFooter_to_be_present() throws Throwable {
		globalElementHeader.validatingFindaStore();
	}

	@Then("^user expect element SignUpForMoreDeals to be present$")
	public void user_expect_element_SignUpForMoreDeals_to_be_present() throws Throwable {
		globalElementHeader.validatingsignupformoredeals();
	}

	@Then("^user expect element ChatNoW to be present$")
	public void user_expect_element_ChatNoW_to_be_present() throws Throwable {
		globalElementHeader.validatingchatnow();
	}

	@Then("^user expect element FaceBook to be present$")
	public void user_expect_element_FaceBook_to_be_present() throws Throwable {
		globalElementHeader.verifypresenceoffacebookicon();
	}

	@Then("^user expect element Pinterest to be present$")
	public void user_expect_element_Pinterest_to_be_present() throws Throwable {
		globalElementHeader.verifypresenceofpinteresticon();
	}

	@Then("^user expect element YouTube to be present$")
	public void user_expect_element_YouTube_to_be_present() throws Throwable {
		globalElementHeader.verifypresenceofyoutubeicon();
	}

	@Then("^user expect element Instagram to be present$")
	public void user_expect_element_Instagram_to_be_present() throws Throwable {
		globalElementHeader.verifypresenceofinstagramicon();
	}

	@Then("^user expect element PrivacyPolicy to be present$")
	public void user_expect_element_PrivacyPolicy_to_be_present() throws Throwable {
		globalElementHeader.validatingPrivatPolicy();
	}

	@Then("^user expect element TermsAndCondition to be present$")
	public void user_expect_element_TermsAndCondition_to_be_present() throws Throwable {
		globalElementHeader.validatingTermsAndConditions();
	}

	@Then("^user expect element CaliforniaTransparencyinSupplyChainAct to be present$")
	public void user_expect_element_CaliforniaTransparencyinSupplyChainAct_to_be_present() throws Throwable {
		globalElementHeader.validatingLegalPolicy();
	}

	@Then("^user expect element © (\\d+) Academy Sports \\+ Outdoors\\. All Rights Reserved to be present$")
	public void user_expect_element_Academy_Sports_Outdoors_All_Rights_Reserved_to_be_present(int arg1) throws Throwable {
		plccPageObjects.validatingPresenceOfAsoRightsLink();
	}

	@Then("^user expect element Sitemap to be present$")
	public void user_expect_element_Sitemap_to_be_present() throws Throwable {
		plccPageObjects.validatingPresenceOfSiteMapLink();
	}

	@Then("^user expect element ProductIndex to be present$")
	public void user_expect_element_ProductIndex_to_be_present() throws Throwable {
		plccPageObjects.validatingPresenceOfProductIndexLink();
	}

	@Then("^user expect element ShoppingIndex to be present$")
	public void user_expect_element_ShoppingIndex_to_be_present() throws Throwable {
		plccPageObjects.validatingPresenceOfShoppingIndexLink();
	}

	@Then("^user expect element BrandsIndex to be present$")
	public void user_expect_element_BrandsIndex_to_be_present() throws Throwable {
		plccPageObjects.validatingPresenceOfBrandsIndexLink();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
