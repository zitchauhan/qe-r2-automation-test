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

public class R1_LP_34_Web extends CommonActionHelper {
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
		//CommonActionHelper.waitUntilElePresent(driver, Element, timeOutInSeconds);
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

	@Then("^user expect element (\\d+) Academy Sports \\+ Outdoors\\. All Rights Reserved to be present$")
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
	
	//Footer navigation validations
	@When("^user expect element Our History to be present$")
	public void user_expect_element_Our_History_to_be_present() throws Throwable {
		globalElementHeader.validatingOurhistory();
	}

	@Then("^user click on Our History and navigates to Our History Page$")
	public void user_click_on_Our_History_and_navigates_to_Our_History_Page() throws Throwable {
	  globalElementHeader.lnkourhistory.click();
      plccLandingPageObjects.verifyPresenceOfOurHistoryPage();
	}

	@When("^user expect element Careers to be present$")
	public void user_expect_element_Careers_to_be_present() throws Throwable {
		globalElementHeader.validatingCareers();
	}

	@Then("^user click on Careers and navigates to Careers Page$")
	public void user_click_on_Careers_and_navigates_to_Careers_Page() throws Throwable {
		globalElementHeader.lnkcareers.click();
		plccLandingPageObjects.verifyPresenceOfCareersPage();
	}

	@Then("^user click on PressReleases and navigates to PressReleases Page$")
	public void user_click_on_PressReleases_and_navigates_to_PressReleases_Page() throws Throwable {
		globalElementHeader.lnkPressReleases.click();
		plccLandingPageObjects.verifyPresenceOfPressReleasesPage();
	}

	@When("^user expect element Investors to be present$")
	public void user_expect_element_Investors_to_be_present() throws Throwable {
		globalElementHeader.validatingInvestors();
	}

	@Then("^user click on Investors and navigates to Investors Page$")
	public void user_click_on_Investors_and_navigates_to_Investors_Page() throws Throwable {
		globalElementHeader.lnkInvestors.click();
		plccLandingPageObjects.verifyPresenceOfPressInvestersPage();
	}

	@Then("^Navigate back to PLCC Landing Page$")
	public void navigate_back_to_PLCC_LAnding_Page() throws Throwable {
		plccLandingPageObjects.clickOnASOLogo();
		plccLandingPageObjects.clickOnAcademyCreditCardFooterLink();
		plccLandingPageObjects.verifyPresenceOfFPOApplyCardSection();
	}
	/*
	 * Navigation Links Newly created for PLCC Landing Page by Smeetha and Manju
	 */
	@When("^user click on TermsAndCondition link in the footer section of ASO-Home page$")
	public void user_click_on_TermsAndCondition_link_in_the_footer_section_of_ASO_Home_page() throws Throwable {
		globalElementHeader.lnktermsandconditions.click();
		
	}

	@Then("^user expect TermsAndConditions page to be present$")
	public void user_expect_TermsAndConditions_page_to_be_present() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfTermsAndConditionsPage();
	}
	
	@Then("^user click on CheckOrder and navigates to CheckOrder Page$")
	public void user_click_on_CheckOrder_and_navigates_to_CheckOrder_Page() throws Throwable {
		  plccLandingPageObjects.lnkcheckorder.click();
	      plccLandingPageObjects.verifyPresenceOfCheckOrderPage();
	}

	@Then("^user click on ReturnPolicy and navigates to ReturnPolicy Page$")
	public void user_click_on_ReturnPolicy_and_navigates_to_ReturnPolicy_Page() throws Throwable {
		 globalElementHeader.lnkreturnpolicy.click();
	      plccLandingPageObjects.verifyPresenceOfReturnPolicyPage();
		
	}

	@Then("^user click on ProductRecall and navigates to ProductRecall Page$")
	public void user_click_on_ProductRecall_and_navigates_to_ProductRecall_Page() throws Throwable {
		 globalElementHeader.lnkproductrecall.click();
	      plccLandingPageObjects.verifyPresenceOfProductRecallPage();
	}

	@Then("^user click on Rebates and navigates to Rebates Page$")
	public void user_click_on_Rebates_and_navigates_to_Rebates_Page() throws Throwable {
		 globalElementHeader.lnkrebates.click();
	      plccLandingPageObjects.verifyPresenceOfRebatesPage();
	}

	@Then("^user click on CustomerCare and navigates to CustomerCare Page$")
	public void user_click_on_CustomerCare_and_navigates_to_CustomerCare_Page() throws Throwable {
		 globalElementHeader.lnkcustomercare.click();
	      plccLandingPageObjects.verifyPresenceOfCustomerCarePage();
	}
	
	@Then("^user click on ShopGiftCards and navigates to ShopGiftCards Page$")
	public void user_click_on_ShopGiftCards_and_navigates_to_ShopGiftCards_Page() throws Throwable {
		globalElementHeader.lnkgiftcards.click();
	    plccLandingPageObjects.verifyPresenceOfShopGiftCardsPage();
	}

	@Then("^user click on CheckGiftCradBalance and navigates to CheckGiftCradBalance Page$")
	public void user_click_on_CheckGiftCradBalance_and_navigates_to_CheckGiftCradBalance_Page() throws Throwable {
		plccLandingPageObjects.lnkCheckGiftCardBalance.click();
	      plccLandingPageObjects.verifyPresenceOfCheckGiftCradBalancePage();
	}

	@Then("^user click on AcademyCreditCard and navigates to AcademyCreditCard Page$")
	public void user_click_on_AcademyCreditCard_and_navigates_to_AcademyCreditCard_Page() throws Throwable {
		globalElementHeader.lnkAcademyCreditCards.click();
	    plccLandingPageObjects.verifyPresenceOfAcademyCreditCardPage();
	}

	@Then("^user click on StoreServicesLink and navigates to StoreServicesLink Page$")
	public void user_click_on_StoreServicesLink_and_navigates_to_StoreServicesLink_Page() throws Throwable {
		globalElementHeader.lnkStoreServices.click();
	    plccLandingPageObjects.verifyPresenceOfStoreServicesLinkPage();
	}
	
	@Then("^user click on FindInStoreFooter and navigates to FindInStoreFooter Page$")
	public void user_click_on_FindInStoreFooter_and_navigates_to_FindInStoreFooter_Page() throws Throwable {
		globalElementHeader.lnkfindastore.click();
		plccLandingPageObjects.verifyPresenceOflnkfindastorePage();		
	}

	@Then("^user click on SignUpForMoreDeals and navigates to SignUpForMoreDeals Page$")
	public void user_click_on_SignUpForMoreDeals_and_navigates_to_SignUpForMoreDeals_Page() throws Throwable {
		globalElementHeader.lnkSIGNUPFORMOREDEALS.click();
	}

	@Then("^user click on ChatNoW and navigates to ChatNoW Page$")
	public void user_click_on_ChatNoW_and_navigates_to_ChatNoW_Page() throws Throwable {
		globalElementHeader.lnkchatnow.click();
	}
	
	@Then("^user verify the presence of ChatNow page$")
	public void user_verify_the_presence_of_ChatNow_page() throws Throwable {
		plccLandingPageObjects.verifyPresenceOflnkchatnowPage(); 
	}
	
	@Then("^user verify presence of getMoreDeals text to be present in the modal$")
	public void user_verify_presence_of_getMoreDeals_text_to_be_present_in_the_modal() throws Throwable {
		plccLandingPageObjects.verifyPresenceOflnkSIGNUPFORMOREDEALSPage();
	}
}
