package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.common.Common_Web_PLCC;
//import com.aso.qe.test.stepdefinition.web.plcc.Common_Web_SD_PLCC;

public class R1_PLCC_LandingPage_PO extends Common_Web_PLCC {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_SIT_PO sit_po = PageFactory.initElements(driver, R1_SIT_PO.class);
	R1_PDP_PO pdp_po = PageFactory.initElements(driver, R1_PDP_PO.class);
	

	/*----------------------author:Vidya(MindtreeQA)-PLCC-----START--------------------------------*/
	@FindBy(xpath = "//*[@data-component='benefitSection']")
	public WebElement benefitSection;
	@FindBy(xpath = "//*[@data-component='prescreen']")
	public WebElement prescreenCode;
	@FindBy(xpath = "//*[@data-component='applyForCard']")
	public WebElement applyForCardSection;
	@FindBy(xpath = "//*[@data-auid='FOOTER_LINK_Academy Credit Card']|//*[contains(text(),'Academy Credit Card')]")
	public WebElement academyCreditCardFooterLink;
	@FindBy(xpath = "//*[@data-auid='logo_m']")
	public WebElement imgAcademyLogo;
	@FindBy(xpath = "//*[@data-auid='level1Category-SHOP']")
	public WebElement shopTabInHeader;
	@FindBy(xpath = "//*[@data-auid='search-input']")
	public WebElement searchBox;
	@FindBy(xpath = "//*[@data-auid='level1Category-DEALS']")
	public WebElement dealsTabInHeader;
	@FindBy(xpath = "//*[@data-auid='level1Category-TRENDING']")
	public WebElement adviceTabInHeader;
	@FindBy(xpath = "//*[@data-auid='WeeklyAds']")
	public WebElement weeklyAdsLinkInHeader;
	@FindBy(xpath = "//*[@data-auid='findAStore']")
	public WebElement findAStoreLinkInHeader;
	@FindBy(xpath = "//*[@data-auid='applyNow']")
	public WebElement applyNowButton;
	@FindBy(xpath = "//*[@data-auid='manageCard']")
	public WebElement manageYourCardLink;
	@FindBy(xpath = "//*[@data-auid='plccImage']")
	public WebElement plccCreditCardImage;
	@FindBy(xpath = "//*[@data-auid='search-clear-button']")
	public WebElement searchIcon;
	@FindBy(xpath = "//*[@data-auid='banner_desktop']")
	public WebElement landingPageBanner;
	@FindBy(xpath = "//*[@data-auid='applyToday']")
	public WebElement labelAboveCardImage;
	@FindBy(xpath = "//*[@class='academyicon icon-cart']")
	public WebElement cartIcon;
	
	
	// SignIn Page
	@FindBy(xpath = "//*[@data-auid='emailid_input']")
	public WebElement emailTxtField;
	@FindBy(xpath = "//*[@data-auid='password_input']")
	public WebElement passwordTxtField;
	@FindBy(xpath = "//*[@data-auid='btnemail-signin-button']")
	public WebElement signInButton;

	@FindBy(xpath = "//*[text()='Prescreen code cannot be less than 12 digits']")
	public WebElement prescreenErrorCode;
	@FindBy(xpath = "//*[@id='preCode']")
	public WebElement prescreenCodeTextField;
	@FindBy(xpath = "//*[@data-auid='btnundefined']")
	public WebElement acceptOfferBtn;
	
	// BENEFITS
	@FindBy(xpath = "//*[@data-auid='LandingPage_Benefit-1']")
	public WebElement benefit1Image;
	@FindBy(xpath = "//*[@data-auid='LandingPage_Benefit-2']")
	public WebElement benefit2Image;
	@FindBy(xpath = "//*[@data-auid='LandingPage_Benefit-3']")
	public WebElement benefit3Image;
	// BENEFIT TEXT
	@FindBy(xpath = "//*[@data-auid='card_benefit-1_Text']")
	public WebElement benefit1Text;
	@FindBy(xpath = "//*[@data-auid='card_benefit-2_Text']")
	public WebElement benefit2Text;
	@FindBy(xpath = "//*[@data-auid='card_benefit-3_Text']")
	public WebElement benefit3Text;
	// OFFER TEXT
	@FindBy(xpath = "//*[@data-auid='offerText1']")
	public WebElement offerText1;
	@FindBy(xpath = "//*[@data-auid='offerText2']")
	public WebElement offerText2;
	@FindBy(xpath = "//*[@data-auid='offerText3']")
	public WebElement offerText3;

	// Landing Page Checkout
	@FindBy(xpath = "//*[@data-auid='FOOTER_LINK_Check Gift Card Balance']")
	public WebElement lnkCheckGiftCardBalance;
	@FindBy(xpath = "//*[@data-auid='FOOTER_LINK_Check Order Status']")
	public WebElement lnkcheckorder;

	@FindBy(xpath = "//*[@data-auid='email-signup-main-modal-close']")
	public WebElement emailSignUpModal;

	@FindBy(xpath = "//*[@text='Grand Parkway']")
	public WebElement GrandParkwayLinkInHeader; 
	/*----------------------author:Vidya(MindtreeQA)-PLCC-----END--------------------------------*/
	public void verifyPresenceOfGrand_Parkway() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(GrandParkwayLinkInHeader);
			logger.debug("GrandParkway Link is displayed in mobile");
			Common_Web_PLCC.waitUntilElePresent(driver, GrandParkwayLinkInHeader, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(GrandParkwayLinkInHeader);
			logger.debug("WeeklyAd Link is not displayed++++++++++++++++++++++++==");
		}
	} 
	public void clickOnAcademyCreditCardFooterLink() throws Exception {

		{
			assertTrue(isDisplayed(academyCreditCardFooterLink));
			isClickable(academyCreditCardFooterLink);
			if (isDisplayed(academyCreditCardFooterLink)) {
				Common_Web_PLCC.waitUntilElePresent(driver, academyCreditCardFooterLink, ELEMWAITTIME_MEDIUM);
				Common_Web_PLCC.waitUntilElePresent(driver, academyCreditCardFooterLink, ELEMWAITTIME_MEDIUM);
				assertTrue(clickOnButton(academyCreditCardFooterLink));
			} else {
				Common_Web_PLCC.waitUntilElePresent(driver, academyCreditCardFooterLink, ELEMWAITTIME_MEDIUM);
			}
		}
	}

	public void clickOnASOLogo() throws Exception {

		{
			assertTrue(isDisplayed(academyCreditCardFooterLink));
			isClickable(imgAcademyLogo);
			if (isDisplayed(imgAcademyLogo)) {
				Common_Web_PLCC.waitUntilElePresent(driver, imgAcademyLogo, ELEMWAITTIME_MEDIUM);
				assertTrue(clickOnButton(imgAcademyLogo));
			} else {
				Common_Web_PLCC.waitUntilElePresent(driver, imgAcademyLogo, ELEMWAITTIME_MEDIUM);
			}
		}
	}

	public void verifyPresenceOfFPOApplyCardSection() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(applyForCardSection);
			logger.debug("FPO Apply Card Section on Landing Page is displayed");
			Common_Web_PLCC.waitUntilElePresent(driver, applyForCardSection, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(applyForCardSection);
			logger.debug("FPO Apply Card Section on Landing Page is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfBenefitsSection() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(benefitSection);
			logger.debug("Benefits Section on Landing Page is displayed");
			Common_Web_PLCC.waitUntilElePresent(driver, benefitSection, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(benefitSection);
			logger.debug("Benefits Section on Landing Page is not displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfPrescreenSection() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(benefitSection);
			logger.debug("Preescreen Section on Landing Page is displayed");
			Common_Web_PLCC.waitUntilElePresent(driver, benefitSection, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(benefitSection);
			logger.debug("Preescreen Section on Landing Page is displayed++++++++++++++++++++++++==");
		}

	}
	public void verifyPresenceOfLandingPageBanner() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(landingPageBanner);
			logger.debug("Landing Page Banner is displayed");
			Common_Web_PLCC.waitUntilElePresent(driver, benefitSection, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(landingPageBanner);
			logger.debug("Landing Page Banner is displayed++++++++++++++++++++++++==");
		}

	}
	public void verifyPresenceOfLabelAboveCardImage() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(labelAboveCardImage);
			logger.debug("Label above card Image is displayed");
			Common_Web_PLCC.waitUntilElePresent(driver, benefitSection, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(labelAboveCardImage);
			logger.debug("Label above card image is displayed++++++++++++++++++++++++==");
		}

	}

	public void enterEmailTxtField(String arg) throws Exception {
		setInputText(emailTxtField, webPropHelper.getTestDataProperty(arg));
	}

	public void enterPasswordTxtField(String arg) throws Exception {
		setInputText(passwordTxtField, webPropHelper.getTestDataProperty(arg));
	}

	public void clickOnSignInBtnSignInPage() throws Exception {

		{
			assertTrue(isDisplayed(signInButton));
			assertTrue(isClickable(signInButton));
			if (isDisplayed(signInButton)) {
				Common_Web_PLCC.waitUntilElePresent(driver, signInButton, ELEMWAITTIME_SLOW);
				assertTrue(clickOnButton(signInButton));
			} else {
				Common_Web_PLCC.waitUntilElePresent(driver, signInButton, ELEMWAITTIME_SLOW);
			}
		}
	}

	public void verifyPresenceOfAcademyLogo() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(imgAcademyLogo);
			logger.debug("Academy Logo is displayed");
			Common_Web_PLCC.waitUntilElePresent(driver, imgAcademyLogo, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(imgAcademyLogo);
			logger.debug("Academy Logo is not displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfFindAStoreLink() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(findAStoreLinkInHeader);
			logger.debug("Find A Store Link is displayed");
			Common_Web_PLCC.waitUntilElePresent(driver, findAStoreLinkInHeader, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(findAStoreLinkInHeader);
			logger.debug("Find A Store Link is not displayed++++++++++++++++++++++++==");
		}
	}

	public void verifyPresenceOfShopTab() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(shopTabInHeader);
			logger.debug("SHOP Tab in header is displayed");
			Common_Web_PLCC.waitUntilElePresent(driver, shopTabInHeader, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(shopTabInHeader);
			logger.debug("SHOP Tab in header is not displayed++++++++++++++++++++++++==");
		}
	}

	public void verifyPresenceOfSearchField() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(searchBox);
			logger.debug("Search Field is displayed");
			Common_Web_PLCC.waitUntilElePresent(driver, searchBox, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(searchBox);
			logger.debug("Search Field is not displayed++++++++++++++++++++++++==");
		}
	}

	public void verifyPresenceOfSearchIcon() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(searchIcon));
			logger.debug("Search Icon is displayed");
			Common_Web_PLCC.waitUntilElePresent(driver, searchBox, ELEMWAITTIME_MEDIUM);
		} else {
			assertTrue(isDisplayed(searchIcon));
			logger.debug("Search Icon is not displayed++++++++++++++++++++++++==");
		}
	}

	public void verifyPresenceOfDealsTab() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(dealsTabInHeader);
			logger.debug("Deals Field is displayed");
			Common_Web_PLCC.waitUntilElePresent(driver, dealsTabInHeader, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(dealsTabInHeader);
			logger.debug("Deals Field is not displayed++++++++++++++++++++++++==");
		}
	}

	public void verifyPresenceOfWeeklyAdLink() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(weeklyAdsLinkInHeader);
			logger.debug("WeeklyAd Link is displayed");
			Common_Web_PLCC.waitUntilElePresent(driver, weeklyAdsLinkInHeader, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(weeklyAdsLinkInHeader);
			logger.debug("WeeklyAd Link is not displayed++++++++++++++++++++++++==");
		}
	}

	public void verifyPresenceOfASOHomePage() throws Exception {
		String currentURL = getCurrentPageURL();
<<<<<<< HEAD
		try {
			Assert.assertTrue(currentURL.contains("academy.com"));
		}catch(Exception e) {
=======
		if (currentURL.contains("academy.com"))
			{
			logger.debug("User is successfully navigated to ASO Home page with URL :: " + currentURL);
		} else {
>>>>>>> 96c52157dd82c81c8f1317c7c08f401bdaa95cd0
			logger.debug("User is not able to navigate to ASO Home Page instead navigated to URL :: " + currentURL);
			e.printStackTrace();
		
		}

	}

	public void verifyPresenceOfApplyNowButton() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(applyNowButton);
			logger.debug("Apply Now button is displayed for Mobile");
			Common_Web_PLCC.waitUntilElePresent(driver, applyNowButton, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(applyNowButton);
			logger.debug("Apply Now button is not displayed++++++++++++++++++++++++==");
		}
	}

	public void verifyPresenceOfManageYourCardLink() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(manageYourCardLink);
			logger.debug("Manage your card Link is displayed");
			Common_Web_PLCC.waitUntilElePresent(driver, applyNowButton, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(manageYourCardLink);
			logger.debug("Manage your card Link is displayed");
		}
	}

	public void verifyPresenceOfBankPage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("comenity.net/academy/")) {
			logger.debug("User is successfully navigated to Bank page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to Our bank Page instead navigated to URL :: " + currentURL);
		}

	}

	public void verifyPresenceOfPLCCCreditCardImage() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(plccCreditCardImage);
			logger.debug("PLCC Credit Card Image is displayed");
			Common_Web_PLCC.waitUntilElePresent(driver, plccCreditCardImage, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(plccCreditCardImage);
			logger.debug("PLCC Credit Card Image is not displayed++++++++++++++++++++++++==");
		}
	}

	public void enterEmailTxtFieldOnSignInPage(String arg) throws Exception {
		setInputText(emailTxtField, webPropHelper.getTestDataProperty(arg));
	}

	public void enterPasswordTxtFieldOnSignInPage(String arg) throws Exception {
		setInputText(passwordTxtField, webPropHelper.getTestDataProperty(arg));
	}

	public void verifyPresenceOfPreescreenErrorCode() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(prescreenErrorCode);
			logger.debug("Pre-screen information was not found. Please verify and try again. is displayed");
		} else {
			isDisplayed(prescreenErrorCode);
			logger.debug("Pre-screen information was not found. Please verify and try again. is displayed");
		}
	}

	public void verifyPresenceOfPreescreenTextField() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(prescreenCodeTextField);
			logger.debug("Pre-screen Text Field is displayed for Mobile");
		} else {
			isDisplayed(prescreenCodeTextField);
			logger.debug("Pre-screen Text Field is displayed");
		}
	}

	public void verifyPresenceOfAcceptOffer() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(acceptOfferBtn);
			logger.debug("Accept Offer is displayed");
		} else {
			isDisplayed(acceptOfferBtn);
			logger.debug("Accept Offer is displayed");
		}
	}

	public void enterPrescreenCode(String arg) throws Exception {
		setInputText(prescreenCodeTextField, webPropHelper.getTestDataProperty(arg));
	}

	public void verifyPresenceOfAcademyCreditCardFooterLink() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(academyCreditCardFooterLink);
			logger.debug("Academy Credit Card Footer Link is displayed");
		} else {
			isDisplayed(academyCreditCardFooterLink);
			logger.debug("Academy Credit Card Footer Link is displayed");
		}
	}

	// Footer link navigation:
	public void verifyPresenceOfOurHistoryPage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("/shop/en/store/company-info")) {
			logger.debug("User is successfully navigated to Our History page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to Our History Page instead navigated to URL :: " + currentURL);
		}

	}

	public void verifyPresenceOfCareersPage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("careers.academy.com")) {
			logger.debug("User is successfully navigated to Careers page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to Careers Page instead navigated to URL :: " + currentURL);
		}

	}

	public void verifyPresenceOfPressReleasesPage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("/shop/browse/press-releases-new")) {
			logger.debug("User is successfully navigated to Press Releases page with URL :: " + currentURL);
		} else {
			logger.debug(
					"User is not able to navigate to Press Releases Page instead navigated to URL :: " + currentURL);
		}

	}

	public void verifyPresenceOfPressInvestersPage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("/shop/en/store/investors")) {
			logger.debug("User is successfully navigated to Press Investers page with URL :: " + currentURL);
		} else {
			logger.debug(
					"User is not able to navigate to Press Investers Page instead navigated to URL :: " + currentURL);
		}

	}

	public void verifyPresenceOfLandingPage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("/shop/store/academy-credit-card")) {
			logger.debug("User is successfully navigated to Landing page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to Landing Page instead navigated to URL :: " + currentURL);
		}

	}

	public void verifyPresenceOfBenefit1Image() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(benefit1Image);
			logger.debug("Benefit 1 Image is displayed");
			Common_Web_PLCC.waitUntilElePresent(driver, applyForCardSection, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(benefit1Image);
			logger.debug("Benefit 1 Image is displayed");
		}

	}

	public void verifyPresenceOfBenefit2Image() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(benefit2Image);
			logger.debug("Benefit 2 Image is displayed");
			Common_Web_PLCC.waitUntilElePresent(driver, applyForCardSection, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(benefit2Image);
			logger.debug("Benefit 2 Image is displayed");
		}

	}

	public void verifyPresenceOfBenefit3Image() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(benefit3Image);
			logger.debug("Benefit 3 Image is displayed");
			Common_Web_PLCC.waitUntilElePresent(driver, applyForCardSection, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(benefit3Image);
			logger.debug("Benefit 3 Image is displayed");
		}

	}

	public void verifyPresenceOfBenefit1Text() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(benefit1Text);
			logger.debug("Benefit text 1 is displayed");
			Common_Web_PLCC.waitUntilElePresent(driver, applyForCardSection, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(benefit1Text);
			logger.debug("Benefit text 1 is displayed");
		}

	}

	public void verifyPresenceOfBenefit2Text() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(benefit2Text);
			logger.debug("Benefit text 2 is displayed");
			Common_Web_PLCC.waitUntilElePresent(driver, applyForCardSection, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(benefit2Text);
			logger.debug("Benefit text 2 is displayed");
		}

	}

	public void verifyPresenceOfBenefit3Text() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(benefit3Text);
			logger.debug("Benefit text 3 is displayed");
			Common_Web_PLCC.waitUntilElePresent(driver, applyForCardSection, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(benefit3Text);
			logger.debug("Benefit text 3 is displayed");
		}

	}

	public void verifyPresenceOfOfferText1() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(offerText1);
			logger.debug("Offer Text 1 is displayed");
			Common_Web_PLCC.waitUntilElePresent(driver, applyForCardSection, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(offerText1);
			logger.debug("Offer Text 1 is displayed");
		}

	}

	public void verifyPresenceOfOfferText2() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(offerText2);
			logger.debug("Offer Text 2 is displayed");
			Common_Web_PLCC.waitUntilElePresent(driver, applyForCardSection, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(offerText2);
			logger.debug("Offer Text 2 is displayed");
		}

	}

	public void verifyPresenceOfOfferText3() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(offerText3);
			logger.debug("Offer Text 3 is displayed");
			Common_Web_PLCC.waitUntilElePresent(driver, applyForCardSection, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(offerText3);
			logger.debug("Offer Text 3 is displayed");
		}

	}

	/*
	 * Newly created Method for Footer Links Navigation_Smeetha&Manju
	 */
	public void verifyPresenceOfTermsAndConditionsPage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("/app/answers/detail/a_id/206/kw/condition")) {
			logger.debug("User is successfully navigated to ASO Home page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to ASO Home Page instead navigated to URL :: " + currentURL);
		}

	}

	// Footer link navigation:
	public void verifyPresenceOfCheckOrderPage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("myaccount/orders")) {
			logger.debug("User is successfully navigated to Our History page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to Our History Page instead navigated to URL :: " + currentURL);
		}

	}

	// Footer link navigation:
	public void verifyPresenceOfReturnPolicyPage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("/app/answers/detail/a_id/203")) {
			logger.debug("User is successfully navigated to Our History page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to Our History Page instead navigated to URL :: " + currentURL);
		}

	}

	// Footer link navigation:
	public void verifyPresenceOfProductRecallPage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("/shop/en/store/product-recall-info")) {
			logger.debug("User is successfully navigated to Our History page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to Our History Page instead navigated to URL :: " + currentURL);
		}

	}

	// Footer link navigation:
	public void verifyPresenceOfRebatesPage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("/shop/browse/rebates")) {
			logger.debug("User is successfully navigated to Rebates page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to Our Rebates Page instead navigated to URL :: " + currentURL);
		}

	}

	// Footer link navigation:
	public void verifyPresenceOfCustomerCarePage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("custhelp.com")) {
			logger.debug("User is successfully navigated to Customer care page with URL :: " + currentURL);
		} else {
			logger.debug(
					"User is not able to navigate to Customer care Page instead navigated to URL :: " + currentURL);
		}

	}

	// Footer link navigation:
	public void verifyPresenceOfShopGiftCardsPage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("/shop/browse/Gift-Cards")) {
			logger.debug("User is successfully navigated to Shop gift Card page with URL :: " + currentURL);
		} else {
			logger.debug(
					"User is not able to navigate to Shop gift Card Page instead navigated to URL :: " + currentURL);
		}

	}

	// Footer link navigation:
	public void verifyPresenceOfCheckGiftCradBalancePage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("/webapp/wcs/stores/servlet/GCBView")) {
			logger.debug("User is successfully navigated to check Gift Card Balance page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to check Gift Card Balance Page instead navigated to URL :: "
					+ currentURL);
		}

	}

	// Footer link navigation:
	public void verifyPresenceOfAcademyCreditCardPage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("/shop/store/academy-credit-card")) {
			logger.debug("User is successfully navigated to Academy credit card page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to Academy credit card Page instead navigated to URL :: "
					+ currentURL);
		}

	}

	// Footer link navigation:
	public void verifyPresenceOfStoreServicesLinkPage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("/shop/en/store/instore-services")) {
			logger.debug("User is successfully navigated to Store Services page with URL :: " + currentURL);
		} else {
			logger.debug(
					"User is not able to navigate to Store Services Page instead navigated to URL :: " + currentURL);
		}

	}

	// Footer link navigation:
	public void verifyPresenceOflnkfindastorePage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("/shop/storelocator")) {
			logger.debug("User is successfully navigated to find a store page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to find a store Page instead navigated to URL :: " + currentURL);
		}

	}

	// Footer link navigation:
	public void verifyPresenceOflnkSIGNUPFORMOREDEALSPage() throws Exception {
		String currentsignUpMoreDealsText = emailSignUpModal.getText();
		System.out.println(currentsignUpMoreDealsText);
		if (currentsignUpMoreDealsText.contains("GET MORE DEALS")) {
			logger.debug("User is successfully verified GET MORE DEALS Text in email sign up modal :: "
					+ currentsignUpMoreDealsText);
		} else {
			logger.debug("User is not able to verified GET MORE DEALS Text in email sign up modal  :: "
					+ currentsignUpMoreDealsText);
		}

		closeAlertPopupBox();

	}

	// Footer link navigation:
	public void verifyPresenceOflnkchatnowPage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("/app/chat/chat_launch")) {
			logger.debug("User is successfully navigated to chat now page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to chat now Page instead navigated to URL :: " + currentURL);
		}
		driver.close();

	}

	// Footer link navigation:
	public void verifyPresenceOfFacebookPage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("www.facebook.com/Academy/")) {
			logger.debug("User is successfully navigated to Facebook page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to Facebook Page instead navigated to URL :: " + currentURL);
		}

	}

	// Footer link navigation:
	public void verifyPresenceOfPinterestPage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("www.pinterest.com")) {
			logger.debug("User is successfully navigated to Pinterest page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to Pinterest Page instead navigated to URL :: " + currentURL);
		}

	}

	// Footer link navigation:
	public void verifyPresenceOfTwitterPage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("twitter.com/academy")) {
			logger.debug("User is successfully navigated to Twitter page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to Twitter Page instead navigated to URL :: " + currentURL);
		}

	}
	// Footer link navigation:
		public void verifyPresenceOfInstagramPage() throws Exception {
			String currentURL = getCurrentPageURL();
			if (currentURL.contains("www.instagram.com/academy/")) {
				logger.debug("User is successfully navigated to Twitter page with URL :: " + currentURL);
			} else {
				logger.debug("User is not able to navigate to Twitter Page instead navigated to URL :: " + currentURL);
			}

		}

	public void verifyPresenceOfPrivacyPolicyPage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("/app/answers/detail/a_id/649/kw/privacy")) {
			logger.debug("User is successfully navigated to Privacy  page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to Privacy Page instead navigated to URL :: " + currentURL);
		}

	}

	// Footer link navigation:
	public void verifyPresenceOflnkCaliforniaTransparencyinSupplyChainActPage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("/shop/en/store/california-transparency-in-supply-chains-act")) {
			logger.debug("User is successfully navigated to find a store page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to find a store Page instead navigated to URL :: " + currentURL);
		}

	}

	// Footer link navigation:
	public void verifyPresenceOflnkSiteMapIndex() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("/shop/browse/sitemap")) {
			logger.debug("User is successfully navigated to ShoppingIndex page with URL :: " + currentURL);
		} else {
			logger.debug(
					"User is not able to navigate to ShoppingIndex Page instead navigated to URL :: " + currentURL);
		}

	}

	// Footer link navigation:
	public void verifyPresenceOflnkProductIndex() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("/categories/index.jsp")) {
			logger.debug("User is successfully navigated to ProductIndex page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to ProductIndex Page instead navigated to URL :: " + currentURL);
		}

	}

	// Footer link navigation:
	public void verifyPresenceOflnkShoppingIndex() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("/categories/shopping-index.jsp")) {
			logger.debug("User is successfully navigated to ProductIndex page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to ProductIndex Page instead navigated to URL :: " + currentURL);
		}

	}

	public void verifyPresenceOflnkOutdoors() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("/categories/outdoors.jsp")) {
			logger.debug("User is successfully navigated to Outdoors page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to Outdoors Page instead navigated to URL :: " + currentURL);
		}

	}

	public void verifyPresenceOflnkShoes() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("/categories/shoes.jsp")) {
			logger.debug("User is successfully navigated to Outdoors page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to Outdoors Page instead navigated to URL :: " + currentURL);
		}

	}

	public void verifyPresenceOflnkSportsEquipment() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("/categories/sports-equipment.jsp")) {
			logger.debug("User is successfully navigated to Outdoors page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to Outdoors Page instead navigated to URL :: " + currentURL);
		}

	}

	public void closeAlertPopupBox() {
		emailSignUpModal.click();
	}

}
