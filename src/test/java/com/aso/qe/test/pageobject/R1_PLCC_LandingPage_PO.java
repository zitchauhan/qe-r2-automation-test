package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.stepdefinition.web.plcc.Common_Web_SD;

public class R1_PLCC_LandingPage_PO extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_SIT_PO sit_po = PageFactory.initElements(driver, R1_SIT_PO.class);
	R1_PDP_PO pdp_po = PageFactory.initElements(driver, R1_PDP_PO.class);
	Common_Web_SD timer = new Common_Web_SD();

	/*----------------------author:Vidya(MindtreeQA)-PLCC-----START--------------------------------*/
	@FindBy(xpath = "//*[@data-component='benefitSection']")
	public WebElement benefitSection;
	@FindBy(xpath = "//*[@data-component='prescreen']")
	public WebElement prescreenCode;
	@FindBy(xpath = "//*[@data-component='applyForCard']")
	public WebElement applyForCardSection;
	@FindBy(xpath = "//*[@data-auid='FOOTER_LINK_Academy Credit Card']")
	public WebElement academyCreditCardFooterLink;
	@FindBy(xpath = "//*[@data-auid='logo']//img")
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

	// SignIn Page
	@FindBy(xpath = "//*[@data-auid='emailid_input']")
	public WebElement emailTxtField;
	@FindBy(xpath = "//*[@data-auid='password_input']")
	public WebElement passwordTxtField;
	@FindBy(xpath = "//*[@data-auid='btnemail-signin-button']")
	public WebElement signInButton;

	@FindBy(xpath = "//*[text()='Pre-screen information was not found. Please verify and try again.']")
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

	/*----------------------author:Vidya(MindtreeQA)-PLCC-----END--------------------------------*/
	public void clickOnAcademyCreditCardFooterLink() throws Exception {

		{
			assertTrue(isDisplayed(academyCreditCardFooterLink));
			isClickable(academyCreditCardFooterLink);
			if (isDisplayed(academyCreditCardFooterLink)) {
				CommonActionHelper.waitUntilElePresent(driver, academyCreditCardFooterLink, ELEMWAITTIME_MEDIUM);
				assertTrue(clickOnButton(academyCreditCardFooterLink));
			} else {
				CommonActionHelper.waitUntilElePresent(driver, academyCreditCardFooterLink, ELEMWAITTIME_MEDIUM);
			}
		}
	}

	public void clickOnASOLogo() throws Exception {

		{
			assertTrue(isDisplayed(academyCreditCardFooterLink));
			isClickable(imgAcademyLogo);
			if (isDisplayed(imgAcademyLogo)) {
				CommonActionHelper.waitUntilElePresent(driver, imgAcademyLogo, ELEMWAITTIME_MEDIUM);
				assertTrue(clickOnButton(imgAcademyLogo));
			} else {
				CommonActionHelper.waitUntilElePresent(driver, imgAcademyLogo, ELEMWAITTIME_MEDIUM);
			}
		}
	}

	public void verifyPresenceOfFPOApplyCardSection() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(applyForCardSection);
			logger.debug("FPO Apply Card Section on Landing Page is displayed");
			CommonActionHelper.waitUntilElePresent(driver, applyForCardSection, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(applyForCardSection);
			logger.debug("FPO Apply Card Section on Landing Page is not displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfBenefitsSection() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(benefitSection);
			logger.debug("Benefits Section on Landing Page is displayed");
			CommonActionHelper.waitUntilElePresent(driver, benefitSection, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(benefitSection);
			logger.debug("Benefits Section on Landing Page is not displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfPrescreenSection() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(benefitSection);
			logger.debug("Preescreen Section on Landing Page is displayed");
			CommonActionHelper.waitUntilElePresent(driver, benefitSection, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(benefitSection);
			logger.debug("Preescreen Section on Landing Page is not displayed++++++++++++++++++++++++==");
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
			isClickable(signInButton);
			if (isDisplayed(signInButton)) {
				CommonActionHelper.waitUntilElePresent(driver, signInButton, ELEMWAITTIME_SLOW);
				assertTrue(clickOnButton(signInButton));
			} else {
				CommonActionHelper.waitUntilElePresent(driver, signInButton, ELEMWAITTIME_SLOW);
			}
		}
	}

	public void verifyPresenceOfAcademyLogo() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(imgAcademyLogo);
			logger.debug("Academy Logo is displayed");
			CommonActionHelper.waitUntilElePresent(driver, imgAcademyLogo, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(imgAcademyLogo);
			logger.debug("Academy Logo is not displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfFindAStoreLink() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(findAStoreLinkInHeader);
			logger.debug("Find A Store Link is displayed");
			CommonActionHelper.waitUntilElePresent(driver, findAStoreLinkInHeader, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(findAStoreLinkInHeader);
			logger.debug("Find A Store Link is not displayed++++++++++++++++++++++++==");
		}
	}

	public void verifyPresenceOfShopTab() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(shopTabInHeader);
			logger.debug("SHOP Tab in header is displayed");
			CommonActionHelper.waitUntilElePresent(driver, shopTabInHeader, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(shopTabInHeader);
			logger.debug("SHOP Tab in header is not displayed++++++++++++++++++++++++==");
		}
	}

	public void verifyPresenceOfSearchField() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(searchBox);
			logger.debug("Search Field is displayed");
			CommonActionHelper.waitUntilElePresent(driver, searchBox, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(searchBox);
			logger.debug("Search Field is not displayed++++++++++++++++++++++++==");
		}
	}

	public void verifyPresenceOfSearchIcon() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(searchIcon);
			logger.debug("Search Icon is displayed");
			CommonActionHelper.waitUntilElePresent(driver, searchBox, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(searchIcon);
			logger.debug("Search Icon is not displayed++++++++++++++++++++++++==");
		}
	}

	public void verifyPresenceOfDealsTab() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(dealsTabInHeader);
			logger.debug("Deals Field is displayed");
			CommonActionHelper.waitUntilElePresent(driver, dealsTabInHeader, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(dealsTabInHeader);
			logger.debug("Deals Field is not displayed++++++++++++++++++++++++==");
		}
	}

	public void verifyPresenceOfWeeklyAdLink() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(weeklyAdsLinkInHeader);
			logger.debug("WeeklyAd Link is displayed");
			CommonActionHelper.waitUntilElePresent(driver, weeklyAdsLinkInHeader, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(weeklyAdsLinkInHeader);
			logger.debug("WeeklyAd Link is not displayed++++++++++++++++++++++++==");
		}
	}

	public void verifyPresenceOfASOHomePage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("academy.com")) {
			logger.debug("User is successfully navigated to ASO Home page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to ASO Home Page instead navigated to URL :: " + currentURL);
		}

	}

	public void verifyPresenceOfApplyNowButton() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(applyNowButton);
			logger.debug("Apply Now button is displayed");
			CommonActionHelper.waitUntilElePresent(driver, applyNowButton, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(applyNowButton);
			logger.debug("Apply Now button is not displayed++++++++++++++++++++++++==");
		}
	}

	public void verifyPresenceOfManageYourCardLink() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(manageYourCardLink);
			logger.debug("Manage your card is displayed");
			CommonActionHelper.waitUntilElePresent(driver, applyNowButton, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(manageYourCardLink);
			logger.debug("Manage your card is not displayed++++++++++++++++++++++++==");
		}
	}

	public void verifyPresenceOfPLCCCreditCardImage() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(plccCreditCardImage);
			logger.debug("PLCC Credit Card Image is displayed");
			CommonActionHelper.waitUntilElePresent(driver, plccCreditCardImage, ELEMWAITTIME_MEDIUM);
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
			logger.debug("Pre-screen Text Field is displayed");
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
			logger.debug("User is successfully navigated to ASO Home page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to ASO Home Page instead navigated to URL :: " + currentURL);
		}

	}

	public void verifyPresenceOfBenefit1Image() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(benefit1Image);
			logger.debug("Benefit 1 Image is displayed");
			CommonActionHelper.waitUntilElePresent(driver, applyForCardSection, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(benefit1Image);
			logger.debug("Benefit 1 Image is displayed");
		}

	}
	public void verifyPresenceOfBenefit2Image() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(benefit2Image);
			logger.debug("Benefit 2 Image is displayed");
			CommonActionHelper.waitUntilElePresent(driver, applyForCardSection, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(benefit2Image);
			logger.debug("Benefit 2 Image is displayed");
		}

	}
	public void verifyPresenceOfBenefit3Image() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(benefit3Image);
			logger.debug("Benefit 3 Image is displayed");
			CommonActionHelper.waitUntilElePresent(driver, applyForCardSection, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(benefit3Image);
			logger.debug("Benefit 3 Image is displayed");
		}

	}
	public void verifyPresenceOfBenefit1Text() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(benefit1Text);
			logger.debug("Benefit text 1 is displayed");
			CommonActionHelper.waitUntilElePresent(driver, applyForCardSection, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(benefit1Text);
			logger.debug("Benefit text 1 is displayed");
		}

	}
	public void verifyPresenceOfBenefit2Text() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(benefit2Text);
			logger.debug("Benefit text 2 is displayed");
			CommonActionHelper.waitUntilElePresent(driver, applyForCardSection, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(benefit2Text);
			logger.debug("Benefit text 2 is displayed");
		}

	}
	public void verifyPresenceOfBenefit3Text() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(benefit3Text);
			logger.debug("Benefit text 3 is displayed");
			CommonActionHelper.waitUntilElePresent(driver, applyForCardSection, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(benefit3Text);
			logger.debug("Benefit text 3 is displayed");
		}

	}
	public void verifyPresenceOfOfferText1() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(offerText1);
			logger.debug("Offer Text 1 is displayed");
			CommonActionHelper.waitUntilElePresent(driver, applyForCardSection, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(offerText1);
			logger.debug("Offer Text 1 is displayed");
		}

	}
	public void verifyPresenceOfOfferText2() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(offerText2);
			logger.debug("Offer Text 2 is displayed");
			CommonActionHelper.waitUntilElePresent(driver, applyForCardSection, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(offerText2);
			logger.debug("Offer Text 2 is displayed");
		}

	}
	public void verifyPresenceOfOfferText3() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(offerText3);
			logger.debug("Offer Text 3 is displayed");
			CommonActionHelper.waitUntilElePresent(driver, applyForCardSection, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(offerText3);
			logger.debug("Offer Text 3 is displayed");
		}

	}

}
