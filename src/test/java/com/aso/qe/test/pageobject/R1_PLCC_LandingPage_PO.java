package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.stepdefinition.web.plcc.Common_Web_SD;

public class R1_PLCC_LandingPage_PO extends CommonActionHelper{
		private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
		R1_SIT_PO sit_po = PageFactory.initElements(driver, R1_SIT_PO.class);
		R1_PDP_PO pdp_po = PageFactory.initElements(driver, R1_PDP_PO.class);
		Common_Web_SD timer = new Common_Web_SD();

		/*----------------------author:Vidya(MindtreeQA)-PLCC-----START--------------------------------*/
		@FindBy(xpath = "//*[@data-component='benefitSection']") public WebElement benefitSection;
		@FindBy(xpath = "//*[@data-component='prescreen']") public WebElement prescreenCode;
		@FindBy(xpath = "//*[@data-component='applyForCard']") public WebElement applyForCardSection;
		@FindBy(xpath = "//*[@data-auid='FOOTER_LINK_Academy Credit Card']") public WebElement academyCreditCardFooterLink;
		@FindBy(xpath="//*[@data-auid='logo']//img")public WebElement imgAcademyLogo;
		@FindBy(xpath="//*[@data-auid='level1Category-SHOP']") public WebElement shopTabInHeader;
		@FindBy(xpath="//*[@data-auid='search-input']")public WebElement searchBox;
		@FindBy(xpath="//*[@data-auid='level1Category-DEALS']") public  WebElement dealsTabInHeader;
		@FindBy(xpath="//*[@data-auid='level1Category-TRENDING']")public WebElement adviceTabInHeader;
		@FindBy(xpath="//*[@data-auid='WeeklyAds']")public WebElement weeklyAdsLinkInHeader;
		@FindBy(xpath="//*[@data-auid='findAStore']")public WebElement findAStoreLinkInHeader;
		@FindBy(xpath="//*[@data-auid='applyNow']")public WebElement applyNowButton;
		@FindBy(xpath="//*[@data-auid='manageCard']")public WebElement manageYourCardLink;
		@FindBy(xpath="//*[@data-auid='plccImage']")public WebElement plccCreditCardImage;
		
		//SignIn Page
		@FindBy(xpath = "//*[@data-auid='emailid_input']") public WebElement emailTxtField;
		@FindBy(xpath = "//*[@data-auid='password_input']") public WebElement passwordTxtField;
		@FindBy(xpath = "//*[@data-auid='btnemail-signin-button']") public WebElement signInButton;
		
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
}
