package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aso.qe.framework.common.CommonActionHelper;

public class R1_PLCC_CreditCardApplicationModal_PO extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	WebDriverWait wait = new WebDriverWait(driver, 20);
	@FindBy(xpath = "//*[@data-auid='credit_application_first_name']")
	public WebElement firstNameCCModal;
	@FindBy(xpath = "//*[@data-auid='credit_application_middle_name']")
	public WebElement middleNameCCModal;
	@FindBy(xpath = "//*[@data-auid='credit_application_last_name']")
	public WebElement lastNameCCModal;
	@FindBy(xpath = "//*[@data-auid='credit_application_SSN']")
	public WebElement ssnCCModal;
	@FindBy(xpath = "//*[@data-auid='credit_application_SSN_confirm']")
	public WebElement confirmSsnCCModal;
	@FindBy(xpath = "//*[@data-auid='credit_application_date_of_birth']")
	public WebElement dobCCModal;
	@FindBy(xpath = "//*[@data-auid='credit_application_annual_income']")
	public WebElement annualIncomeCCModal;
	@FindBy(xpath = "//*[@id='personal-title']")
	public WebElement personalTitleCCModal;
	@FindBy(xpath = "//*[@data-auid='credit_application_street_address']")
	public WebElement streetAddressCCModal;
	@FindBy(xpath = "//*[@data-auid='credit_application_suite_or_apartment']")
	public WebElement apartmentNameCCModal;
	@FindBy(xpath = "//*[@data-auid='credit_application_city']")
	public WebElement cityCModal;
	@FindBy(xpath = "//img[src='/content/dam/academysports/banner-desktop.jpg']|//img[@class='css-ducv57']")
	//@FindBy(xpath = "//img[@alt='Banner']")
	public WebElement bannerCartPage;
	@FindBy(xpath = "//img[@src='/content/dam/academysports/banner-mobile.jpg']")
	public WebElement bannerCartPage_m;
	@FindBy(xpath = "//*[@data-auid='continuetocheckout_existing_user']")
	public WebElement continueBtnExistingUser;
	@FindBy(xpath = "//*[@data-auid='continuetocheckout_error']")
	public WebElement continueToCheckoutBtnErrorModal;
	@FindBy(xpath = "//*[@data-auid='continuetocheckout_declined']")
	public WebElement continueToCheckoutBtnURModal;
		
	@FindBy(xpath = "//*[@name='state']")
	public WebElement stateDropDownCCModal;
	@FindBy(xpath = "//*[@id='customDropdownList']")
	public WebElement stateDropDownListCCModal;
	@FindBy(xpath = "//*[contains(@role,'presentation')]")
	public WebElement stateDropDownElementsCCModal;
	@FindBy(xpath = "//*[@data-auid='li_listOption_42']")
	public WebElement stateDropDownPACCModal;
	@FindBy(xpath = "//*[@id='plcc_modal_cancel']")
	public WebElement cancelLinkCCModal;

	// Pre-Screen Credir Card Appliction Modal
	@FindBy(xpath = "//*[@id='ads-notice']")
	public WebElement noticeIFramePCCApplicationModal;
	@FindBy(xpath = "//*[text()='Your Personal Information']")
	public WebElement personalInfoPCCApplicationModal;
	@FindBy(xpath = "//*[@name='confirmSsn']")
//	public WebElement confirmSSNPCCApplicationModal;
	//@FindBy(xpath = "//div[3]/div[2]/div[2]")
	public WebElement disclosureTxt1PCCApplicationModal;
	@FindBy(xpath = "//div[4]/div[6]")
	public WebElement disclosureTxt2PCCApplicationModal;
	@FindBy(xpath = "//*[text()=' STEP 1 : PRESCREEN ACCEPTANCE ']")
	public WebElement pageLabelPCCApplicationModal;
	@FindBy(xpath = "//*[@data-auid='acceptOffer']")
	public WebElement acceptOfferButtonPCCApplicationModal;
	@FindBy(xpath = "//*[@data-auid='row css-pufki9']")
	public WebElement progressIndicatorPCCApplicationModal;
	@FindBy(xpath = "//*[@class='academyicon icon-close']")
	public WebElement closeButtonCCApplicationModal;

//Credit Card Application Modal - Consent Modal
	@FindBy(xpath = "//*[@class='mt-2 mb-2']")
	public WebElement disclosureTxt1ConsentModal;
	@FindBy(xpath = "//*[@class='ml-half undefined']")
	public WebElement disclosureTxt2ConsentModal;

	@FindBy(xpath = "//*[text()='CONSENT TO ACCOUNT TERMS AND CONDITIONS']")
	public WebElement consentToAccountTAndCsLabelConsentModal;

	@FindBy(xpath = "//*[@id='financialTerms']")
	public WebElement consentToAccountIframeConsentModal;

	@FindBy(xpath = "//*[text()=' STEP 2 : CONSENT ']")
	public WebElement pageLabelConsentModal;

	@FindBy(xpath = "//*[@src='/content/dam/academysports/plcc_card.png']")
	public WebElement plccCardImgCCAM;

	@FindBy(xpath = "//*[text()='ACCOUNT TERMS AND CONDITIONS']")
	public WebElement accountTAndCsLabelConsentModal;

	@FindBy(xpath = "//*[text()='CONSENT TO FINANCIAL TERMS OF THE ACCOUNT']")
	public WebElement accountToFinancialTAndCsLabelConsentModal;
	@FindBy(xpath = "//*[@id='financialTerms']")
	public WebElement consentToFinancialIframeConsentModal;
	@FindBy(xpath = "//*[@id='plcc_modal_print']")
	public WebElement printLinkConsentModal;

	@FindBy(xpath = "//*[@id='button-strip']/paper-button[2]")
	public WebElement CancelLink;
	
	@FindBy(xpath = "//*[@class='css-1l4mqdj academyicon icon-checkbox-inactive null d-flex align-items-start']")
	public WebElement t$CCheckBoxInactiveConsentModel;
	@FindBy(xpath = "//*[@data-auid='success_modal_close']")
	public WebElement closeIconSuccessModal;
	
	//*[@data-auid="checkout_order_summary_section"]//div[1]/div[2]


//	@FindAll({
//		   @FindBy(xpath = "//*[@name='state']")
//		   @FindBy(xpath = "//*[@data-auid='undefined_listOption_1']")
//		})

	@FindBy(xpath = "//*[@data-auid='credit_application_zipcode']")
	public WebElement zipCodeCCModal;
	@FindBy(xpath = "//*[@data-auid='credit_application_email']")
	public WebElement emailIdCCModal;
	@FindBy(xpath = "//*[@data-auid='credit_application_confirm_email']")
	public WebElement confirmEmailIdCCModal;
	@FindBy(xpath = "//*[@data-auid='credit_application_mobile_phone']")
	public WebElement mobilePhoneCCModal;
	@FindBy(xpath = "//*[@data-auid='btncheckout_goto_shipping_method_btn']")
	public WebElement continueButtonCCModal;
	@FindBy(xpath = "//*[@data-auid='credit_application_alternate_phone']")
	public WebElement alternatePhoneCCModal;
	@FindBy(xpath = "//*[@data-auid='credit_application_modal_agree']")
	public WebElement agreeApplicationModal;
	@FindBy(xpath = "//*[@aria-label='Success Modal']")
	public WebElement successModal;
	@FindBy(xpath = "//*[@data-auid='continuetocheckout']")
	public WebElement continueToCheckout;
	@FindBy(xpath = "//*[@data-auid='successModalImage']")
	public WebElement creditCardImageOnSuccessModal;
	@FindBy(xpath = "//*[text()='WELCOME ALWAYS APPROVE! (FPO) ']")
	public WebElement welcomeAlwaysText;
	@FindBy(xpath = "//*[@data-auid='returntoshopping']")
	
	public WebElement returnToShoppingButton;
	@FindBy(xpath = "//*[@aria-label='Credit Application Modal']")
	public WebElement creditCardApplicationModal;
	@FindBy(xpath = "//*[@data-auid='btncrt_btnCntinueShop']")
	public WebElement continueShoppingBtn;
	@FindBy(xpath = "//*[@class='ml-half undefined']")
	// *[@name='creditApplicationModal']
	public WebElement TandCCheckBox;
	@FindBy(xpath = "//*[text()='Submit']")
	public WebElement submitButton;
	@FindBy(xpath = "//*[text()=' STEP2: CONSENT ']")
	public WebElement consentModelPageLabel;

	// CONSENT MODEL:
	@FindBy(xpath = "//*[@id='plcc_modal_back']")
	public WebElement backButtonConsentModel;
	@FindBy(xpath = "//*[@data-auid='returntoapplication']")
	public WebElement returnToApplicationErrorModal;
	
	//Creditcard Application Modal Response:
	@FindBy(xpath = "//*[@aria-label='Error Modal']")
	public WebElement errorModalCCAM;
	@FindBy(xpath = "//*[@data-auid='errorModalImage']")
	public WebElement errorModalImageCCAM;
	@FindBy(xpath = "//*[text()='APPLICATION UNDER REVIEW (FPO)']")
	public WebElement applicationUnderReviewText;
	@FindBy(xpath = "//*[text()='Your credit application is under review. You will be notified by mail within 10 business days.']")
	public WebElement disclosureMsgErrorModalCCAM;
	@FindBy(xpath = "//*[@data-auid='error_modal_close']")
	public WebElement closeIconErrorModal;
	@FindBy(xpath = "//*[text()='EXISTING ACCOUNT!']")
	public WebElement existingAccount;
	@FindBy(xpath = "//*[text()='Thank for your interest. Our records indicate that you already have an Academy Sports + Outdoors Credit Card. For your convenience, your account number has been pre-filled in the payment section at checkout.']")
	public WebElement disclosureTxtExistingAccountModal;
	
	//SUCCESS Modal:
	
	@FindBy(xpath = "//*[text()='WELCOME ALWAYS APPROVE! ']")
	public WebElement welcomeTxtSuccessModal;
	@FindBy(xpath = "//*[text()='Your new Academy Sports + Outdoors Credit Card will arrive in the mail within the next 10 business days.']")
	public WebElement disclosureTxt1SuccessModal;
	@FindBy(xpath = "//*[text()='Your Academy Sports + Outdoors Credit Card Account has been ']")
	public WebElement disclosureTxt2SuccessModal;
	@FindBy(xpath = "//*[text()='approved with a $4500 credit limit.']")
	public WebElement disclosureTxt3SuccessModal;
	@FindBy(xpath = "//*[text()='If you'd like to add more items to your cart, click on 'Return to shopping' now. Otherwise, simply click 'Continue to Checkout' to complete your order now.']")
	public WebElement disclosureTxt4SuccessModal;
	
	
	@FindBy(xpath = "//*[@data-auid='returntoshopping']")
	public WebElement returntoShoppingButton;
	
	//ERROR MODAL:
	@FindBy(xpath = "//*[text()='ERROR']")
	public WebElement errorTextErrorModal;
	@FindBy(xpath = "//*[text()='An error has occured.You may go back and try again. If you continue recieving this please call 1-888-922-2336 and speak with a customer service representative. Customer Service: 877-321-8509, TDD/TTY: 888-819-1918']")
	public WebElement disclosureTxtErrorState;
	
	
	// Order Summary:
	@FindBy(xpath = "//*[@data-auid='checkout_order_summary_section']//div[1]/div[2]")
	public WebElement subtotalValue;
	
	public void verifyPresenceOfSubTotalValue() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(subtotalValue);
			logger.debug("Sub total value is displayed");
		} else {
			isDisplayed(subtotalValue);
			logger.debug("Sub total value is displayed");
		}
	}
	public void verifyPresenceOfContnueToCheckoutURModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(continueToCheckoutBtnURModal);
			logger.debug("Continue to checkout button on application under review modal");
		} else {
			isDisplayed(continueToCheckoutBtnURModal);
			logger.debug("Continue to checkout button on application under review modal");
		}
	}
	
	public void verifyPresenceOfReturnToApplicationErrorModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(returnToApplicationErrorModal);
			logger.debug("Return To Application on Error Modal is displayed");
		} else {
			isDisplayed(returnToApplicationErrorModal);
			logger.debug("Return To Application on Error Modal is displayed");
		}
	}
	
	public void verifyPresenceOfContinueToCheckoutExistingUser() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(continueBtnExistingUser);
			logger.debug("Continue to Checkout button on Existing User Modal is displayed");
		} else {
			isDisplayed(continueBtnExistingUser);
			logger.debug("Continue to Checkout button on Existing User Modal is displayed");
		}
	}
	public void verifyPresenceOfContinueToCheckoutErrorModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(continueToCheckoutBtnErrorModal);
			logger.debug("Continue to Checkout button on Error Modal is displayed");
		} else {
			isDisplayed(continueToCheckoutBtnErrorModal);
			logger.debug("Continue to Checkout button on Error User Modal is displayed");
		}
	}
	
	
	
	public void verifyPresenceOfBannerOnCartPage() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) 
		{
			try {
				wait.until(ExpectedConditions.visibilityOf(bannerCartPage_m));
				bannerCartPage_m.click();
				logger.debug("Banner on Cart Page is displayed");
			} catch (Exception e) {
				isDisplayed(bannerCartPage_m);
				wait.until(ExpectedConditions.visibilityOf(bannerCartPage_m));
				WebElement element = driver.findElement(By.xpath("//img[@src='/content/dam/academysports/banner-mobile.jpg']"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", element);
				logger.debug("Banner on Cart Page is displayed");
			}
		} 
		else 
		{
			try {
				WebElement element = driver.findElement(By.xpath("//img[@src='/content/dam/academysports/banner-mobile.jpg']"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", element);
				Thread.sleep(3000);
				logger.debug("Banner on Cart Page is displayed");
								
			} catch (Exception e) {
				wait.until(ExpectedConditions.visibilityOf(bannerCartPage));
				bannerCartPage.click();
			}
		}
	}
	
	public void verifyPresenceOfErrorText() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(errorTextErrorModal);
			logger.debug("Error Text on Error Modal is displayed");
		} else {
			isDisplayed(errorTextErrorModal);
			logger.debug("Error Text on Error Modal is displayed");
		}
	}	
	public void verifyPresenceOfDisclosureText() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(disclosureTxtErrorState);
			logger.debug("Disclosure Text on Error Modal is displayed");
		} else {
			isDisplayed(disclosureTxtErrorState);
			logger.debug("Disclosure Text on Error Modal is displayed");
		}
	}
	public void verifyPresenceOfContinueToShopping() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(returntoShoppingButton);
			logger.debug("Continue to Shopping Button is displayed");
		} else {
			isDisplayed(returntoShoppingButton);
			logger.debug("Continue to Shopping is displayed");
		}
	}	
	
	
	public void verifyPresenceOfDisclosureTxt4SuccessModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(disclosureTxt4SuccessModal);
			logger.debug("WELCOME ALWAYS APPROVE! is displayed");
		} else {
			isDisplayed(disclosureTxt4SuccessModal);
			logger.debug("WELCOME ALWAYS APPROVE! is displayed");
		}
	}
	public void verifyPresenceOfWelcomeTxt() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(welcomeTxtSuccessModal);
			logger.debug("WELCOME ALWAYS APPROVE! is displayed");
		} else {
			isDisplayed(welcomeTxtSuccessModal);
			logger.debug("WELCOME ALWAYS APPROVE! is displayed");
		}
	}
	public void verifyPresenceOfDisclosureTxt1SuccessModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(disclosureTxt1SuccessModal);
			logger.debug("Your new Academy Sports + Outdoors Credit Card will arrive in the mail within the next 10 business days. is displayed");
		} else {
			isDisplayed(disclosureTxt1SuccessModal);
			logger.debug("Your new Academy Sports + Outdoors Credit Card will arrive in the mail within the next 10 business days. is displayed");
		}
	}
	public void verifyPresenceOfDisclosureTxt2SuccessModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(disclosureTxt2SuccessModal);
			logger.debug("Your Academy Sports + Outdoors Credit Card Account has been is displayed");
		} else {
			isDisplayed(disclosureTxt2SuccessModal);
			logger.debug("Your Academy Sports + Outdoors Credit Card Account has been is displayed");
		}
	}
	public void verifyPresenceOfDisclosureTxt3SuccessModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(disclosureTxt3SuccessModal);
			logger.debug("If you'd like to add more items to your cart, click on 'Return to shopping' now. Otherwise, simply click 'Continue to Checkout' to complete your order now. is displayed");
		} else {
			isDisplayed(disclosureTxt3SuccessModal);
			logger.debug("If you'd like to add more items to your cart, click on 'Return to shopping' now. Otherwise, simply click 'Continue to Checkout' to complete your order now. is displayed");
		}
	}
	

	public void verifyPresenceOfDisclosureTextExistingAccount() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(disclosureTxtExistingAccountModal);
			logger.debug("Thank for your interest. Our records indicate that you already have an Academy Sports + Outdoors Credit Card. For your convenience, your account number has been pre-filled in the payment section at checkout. Text is displayed");
		} else {
			isDisplayed(disclosureTxtExistingAccountModal);
			logger.debug("Thank for your interest. Our records indicate that you already have an Academy Sports + Outdoors Credit Card. For your convenience, your account number has been pre-filled in the payment section at checkout. Text is displayed");
		}
	}
	
	
	public void verifyPresenceOfCartPage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("academy.com")) {
			logger.debug("User is successfully navigated to Cart page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to Cart Page instead navigated to URL :: " + currentURL);
		}

	}
			
	public void verifyPresenceOfErrorModalCCAM() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(errorModalCCAM);
			logger.debug("Error Modal for declined/pending card approval is displayed");
		} else {
			isDisplayed(errorModalCCAM);
			logger.debug("Error Modal for declined/pending card approval is displayed");
		}
	}
	public void verifyPresenceOfCloseIconErrorModalCCAM() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(closeIconErrorModal);
			logger.debug("Close Icon on Error Modal is displayed");
		} else {
			isDisplayed(closeIconErrorModal);
			logger.debug("Close Icon on Error Modal is displayed");
		}
	}
	
					public void verifyPresenceOfErrorModalImageCCAM() throws Exception {
						if ("mobile".equalsIgnoreCase(testtype)) {
							isDisplayed(errorModalImageCCAM);
							logger.debug("Error Modal Card Image is displayed");
						} else {
							isDisplayed(errorModalImageCCAM);
							logger.debug("Error Modal Card Image is displayed");
						}
					}
					public void verifyPresenceOfApplicationUnderReviewText() throws Exception {
						if ("mobile".equalsIgnoreCase(testtype)) {
							isDisplayed(applicationUnderReviewText);
							logger.debug("Application Under Review Text is displayed");
						} else {
							isDisplayed(applicationUnderReviewText);
							logger.debug("Application Under Review Text is displayed");
						}
					}
					public void verifyPresenceOfDisclosureMsgErrorModalCCAM() throws Exception {
						if ("mobile".equalsIgnoreCase(testtype)) {
							isDisplayed(disclosureMsgErrorModalCCAM);
							logger.debug("Disclosure Message on Error Modal is displayed");
						} else {
							isDisplayed(disclosureMsgErrorModalCCAM);
							logger.debug("Disclosure Message on Error Modal is displayed");
						}
					}
	
					
	public void verifyPresenceOfConsentModelPageLabel() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(firstNameCCModal);
			logger.debug("STEP2: CONSENT is displayed for Mobile");
		} else {
			isDisplayed(firstNameCCModal);
			logger.debug("STEP2: CONSENT is displayed");
		}
	}

	public void verifyPresenceOfFirstNameCCModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(firstNameCCModal);
			logger.debug("First Name Text Field on Credit Card Application Modal is displayed for Mobile");
		} else {
			isDisplayed(firstNameCCModal);
			logger.debug("First Name Text Field on Credit Card Application Modal is displayed");
		}
	}

	public void verifyPresenceOfCancelLinkCCModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(cancelLinkCCModal);
			logger.debug("Cancel Link on Credit Card Application Modal is displayed for Mobile");
		} else {
			isDisplayed(cancelLinkCCModal);
			logger.debug("Cancel Link on Credit Card Application Modal is displayed");
		}
	}

	public void verifyPresenceOfDOBTextField() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(dobCCModal);
			logger.debug("DOB Text Field on Credit Card Application Modal is displayed");
		} else {
			isDisplayed(dobCCModal);
			logger.debug("DOB Text Field on Credit Card Application Modal is displayed");
		}
	}

	public void verifyPresenceOfSubmitButtonCCModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(submitButton);
			logger.debug("Submit button is displayed");
		} else {
			isDisplayed(submitButton);
			logger.debug("Submit button is displayed");
		}
	}

	public void verifyPresenceOfGenericCreditCardApplicationModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(creditCardApplicationModal);
			logger.debug("Generic Credit Card Application Modal is displayed for Mobile");
		} else {
			isDisplayed(creditCardApplicationModal);
			logger.debug("Generic Credit Card Application Modal is displayed");
		}
	}

	public void verifyPresenceOfLastNameCCModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(lastNameCCModal);
			logger.debug("Last Name Text Field on Credit Card Application Modal is displayed");
		} else {
			isDisplayed(lastNameCCModal);
			logger.debug("Last Name Text Field on Credit Card Application Modal is displayed");
		}
	}

	public void verifyPresenceOfMiddleNameCCModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(middleNameCCModal);
			logger.debug("Middle Name Text Field on Credit Card Application Modal is displayed");
		} else {
			isDisplayed(middleNameCCModal);
			logger.debug("Middle Name Text Field on Credit Card Application Modal is displayed");
		}
	}

	public void verifyPresenceOfSSNCCModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(ssnCCModal);
			logger.debug("SSN on Credit Card Application Modal is displayed");
		} else {
			isDisplayed(ssnCCModal);
			logger.debug("SSN on Credit Card Application Modal is displayed");
		}
	}
	public void verifyPresenceOfConfirmSSNCCModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(confirmSsnCCModal);
			logger.debug("Confirm SSN on Credit Card Application Modal is displayed");
		} else {
			isDisplayed(confirmSsnCCModal);
			logger.debug("Confirm SSN on Credit Card Application Modal is displayed");
		}
	}

	public void verifyPresenceOfAnnualIncomeCCModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(annualIncomeCCModal);
			logger.debug("Annual Income on Credit Card Application Modal is displayed");
		} else {
			isDisplayed(annualIncomeCCModal);
			logger.debug("Annual Income on Credit Card Application Modal is displayed");
		}
	}

	public void verifyPresenceOfPersonalTitleCCModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(personalTitleCCModal);
			logger.debug("Personal Title on Credit Card Application Modal is displayed");
		} else {
			isDisplayed(personalTitleCCModal);
			logger.debug("Personal Title on Credit Card Application Modal is displayed");
		}
	}

	public void verifyPresenceOfApartmentNameCCModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(apartmentNameCCModal);
			logger.debug("ApartmentName on Credit Card Application Modal is displayed");
		} else {
			isDisplayed(apartmentNameCCModal);
			logger.debug("Apartment name on Credit Card Application Modal is displayed");
		}
	}

	public void verifyPresenceOfCityCModalCCModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(cityCModal);
			logger.debug("City on Credit Card Application Modal is displayed");
		} else {
			isDisplayed(cityCModal);
			logger.debug("city on Credit Card Application Modal is displayed");
		}
	}

	public void verifyPresenceOfStateDropDownCCModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(stateDropDownCCModal);
			logger.debug("State Drop Downon Credit Card Application Modal is displayed");
		} else {
			isDisplayed(stateDropDownCCModal);
			logger.debug("State Drop Down on Credit Card Application Modal is displayed");
		}
	}

	public void verifyPresenceOfZipCodeCCModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(zipCodeCCModal);
			logger.debug("Zip Code on Credit Card Application Modal is displayed");
		} else {
			isDisplayed(zipCodeCCModal);
			logger.debug("zip code on Credit Card Application Modal is displayed");
		}
	}

	public void verifyPresenceOfEmailIdCCModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(emailIdCCModal);
			logger.debug("Email Code on Credit Card Application Modal is displayed");
		} else {
			isDisplayed(emailIdCCModal);
			logger.debug("Email code on Credit Card Application Modal is displayed");
		}
	}

	public void verifyPresenceOfConfirmEmailIdCCModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(confirmEmailIdCCModal);
			logger.debug("Confirmed Email ID on Credit Card Application Modal is displayed");
		} else {
			isDisplayed(confirmEmailIdCCModal);
			logger.debug("Confirmed Email ID on Credit Card Application Modal is displayed");
		}
	}

	public void verifyPresenceOfMobilePhoneCCModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(mobilePhoneCCModal);
			logger.debug("Mobile Phone Number on Credit Card Application Modal is displayed");
		} else {
			isDisplayed(mobilePhoneCCModal);
			logger.debug("Mobile Phone Number on Credit Card Application Modal is displayed");
		}
	}

	public void verifyPresenceOfAlternatePhoneCCModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(alternatePhoneCCModal);
			logger.debug("Alternate Phone Number on Credit Card Application Modal is displayed");
		} else {
			isDisplayed(alternatePhoneCCModal);
			logger.debug("Alternate Phone Number on Credit Card Application Modal is displayed");
		}
	}

	public void verifyPresenceOfContinueButtonCCModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(continueButtonCCModal);
			logger.debug("Continue Button on Credit Card Application Modal is displayed for Mobile");
		} else {
			isDisplayed(continueButtonCCModal);
			logger.debug("Continue button on Credit Card Application Modal is displayed");
		}

	}

	public void verifyPresenceOfContinueShoppingBtnCCModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(continueShoppingBtn);
			logger.debug("Continue Shopping button is displayed");
		} else {
			isDisplayed(continueShoppingBtn);
			logger.debug("Continue Shopping button is displayed");
		}
	}

	public void verifyPresenceOfAgreeApplicationModalCCModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(TandCCheckBox);
			logger.debug("Agree T&C is displayed for Mobile");
		} else {
			isDisplayed(TandCCheckBox);
			logger.debug("Agree T&C is displayed is displayed");
		}
	}

	public void verifyPresenceOfSuccessModalCCModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(successModal);
			logger.debug("Credit Card Application Form Submit Success Modal is displayed on mobile");
		} else {
			isDisplayed(successModal);
			logger.debug("Credit Card Application Form Submit Success Modal is displayed");
		}
	}

	public void verifyPresenceOfContinueToCheckoutCCModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(continueToCheckout);
			logger.debug("Continue to Checkout button is displayed");
		} else {
			isDisplayed(continueToCheckout);
			logger.debug("Continue to Checkout button is displayed");
		}
	}

	public void verifyPresenceOfStreetCCModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(streetAddressCCModal);
			logger.debug("Street test field is displayed");
		} else {
			isDisplayed(streetAddressCCModal);
			logger.debug("Street test field is displayed");
		}
	}

	public void enterFNCCModal(String arg) throws Exception {
		setInputText(firstNameCCModal, webPropHelper.getTestDataProperty(arg));
	}

	public void enterMNCCModal(String arg) throws Exception {
		setInputText(middleNameCCModal, webPropHelper.getTestDataProperty(arg));
	}

	public void enterLNCCModal(String arg) throws Exception {
		setInputText(lastNameCCModal, webPropHelper.getTestDataProperty(arg));

	}

	public void enterDOBCCModal(String arg) throws Exception {
		setInputText(dobCCModal, webPropHelper.getTestDataProperty(arg));
	}

	public void enterSSNCCModal(String arg) throws Exception {
		setInputText(ssnCCModal, webPropHelper.getTestDataProperty(arg));
	}

	public void enterConfirmSSNCCModal(String arg) throws Exception {
		setInputText(confirmSsnCCModal, webPropHelper.getTestDataProperty(arg));
	}

	public void enterAnnualIncomeCCModal(String arg) throws Exception {
		setInputText(annualIncomeCCModal, webPropHelper.getTestDataProperty(arg));
	}

	public void enterStreetAddressCCModal(String arg) throws Exception {
		setInputText(streetAddressCCModal, webPropHelper.getTestDataProperty(arg));
	}

	public void enterApartmentNameCCModal(String arg) throws Exception {
		setInputText(apartmentNameCCModal, webPropHelper.getTestDataProperty(arg));
	}

	public void enterCityCCModal(String arg) throws Exception {
		setInputText(cityCModal, webPropHelper.getTestDataProperty(arg));
	}

	public void selectStateCCModal(String arg) throws Exception {
		setInputText(stateDropDownCCModal, webPropHelper.getTestDataProperty(arg));
	}

	public void enterZipCCModal(String arg) throws Exception {
		setInputText(zipCodeCCModal, webPropHelper.getTestDataProperty(arg));
	}

	public void enterEmailIdCCModal(String arg) throws Exception {
		setInputText(emailIdCCModal, webPropHelper.getTestDataProperty(arg));
	}

	public void enterConfirmEmailIdCCModal(String arg) throws Exception {
		setInputText(confirmEmailIdCCModal, webPropHelper.getTestDataProperty(arg));
	}

	public void enterMobilePhoneCCModal(String arg) throws Exception {
		setInputText(mobilePhoneCCModal, webPropHelper.getTestDataProperty(arg));
	}

	public void enterAlternatePhoneCCModal(String arg) throws Exception {
		setInputText(alternatePhoneCCModal, webPropHelper.getTestDataProperty(arg));
	}

	public void verifyPresenceOfASOHomePage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("/shop/cart")) {
			logger.debug("User is successfully navigated to Cart page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to Cart Page instead navigated to URL :: " + currentURL);
		}

	}
	
	public void verifyPresenceOfNoticeIFramePCCApplicationModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(noticeIFramePCCApplicationModal);
			logger.debug("Notice IFrame on Pre-screen Credit card ApplicationModal is displayed");
		} else {
			isDisplayed(noticeIFramePCCApplicationModal);
			logger.debug("Notice IFrame on Pre-screen Credit card ApplicationModal is displayed");
		}
	}

	public void verifyPresenceOfPersonalInfoPCCApplicationModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(personalInfoPCCApplicationModal);
			logger.debug("Peronal Info Label on Pre-screen Credit card ApplicationModal is displayed");
		} else {
			isDisplayed(personalInfoPCCApplicationModal);
			logger.debug("Peronal Info Label on Pre-screen Credit card ApplicationModal is displayed");
		}
	}


	public void verifyPresenceOfDisclosureTxt1PCCApplicationModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(disclosureTxt1PCCApplicationModal);
			logger.debug("Disclosure text 1 on Pre-screen Credit card ApplicationModal is displayed");
		} else {
			isDisplayed(disclosureTxt1PCCApplicationModal);
			logger.debug("Disclosure text 1 on Pre-screen Credit card ApplicationModal is displayed");
		}
	}

	public void verifyPresenceOfDisclosureTxt2PCCApplicationModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(disclosureTxt2PCCApplicationModal);
			logger.debug("Disclosure text 2 on Pre-screen Credit card ApplicationModal is displayed");
		} else {
			isDisplayed(disclosureTxt2PCCApplicationModal);
			logger.debug("Disclosure text 2 on Pre-screen Credit card ApplicationModal is displayed");
		}

	}

	public void verifyPresenceOfNoticeIframeModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(noticeIFramePCCApplicationModal);
			logger.debug("Notice Iframe on Pre-screen Credit card ApplicationModal is displayed");
		} else {
			isDisplayed(noticeIFramePCCApplicationModal);
			logger.debug("Notice Iframe on Pre-screen Credit card ApplicationModal is displayed");
		}

	}

	public void verifyPresenceOfProgressIndicatorPCCApplicationModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(progressIndicatorPCCApplicationModal);
			logger.debug("Progress Indicator on Pre-screen Credit card ApplicationModal is displayed");
		} else {
			isDisplayed(progressIndicatorPCCApplicationModal);
			logger.debug("Progress Indicatior on Pre-screen Credit card ApplicationModal is displayed");
		}

	}

	public void verifySubmitButtonIsDisabled() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(submitButton);
			assertFalse(isClickable(submitButton));
			logger.debug("Submit Button on Pre-Screen Conset Modal is not clickable");
		} else {
			isDisplayed(submitButton);
			assertFalse(isClickable(submitButton));
			logger.debug("Submit Button on Pre-Screen Conset Modal is not clickable");
		}
	}

	public void verifySubmitButtonIsEnabled() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(submitButton);
			assertTrue(isClickable(submitButton));
			logger.debug("Submit Button on Pre-Screen Conset Model is clickable");
		} else {
			isDisplayed(submitButton);
			assertTrue(isClickable(submitButton));
			logger.debug("Submit Button on Pre-Screen Conset Model is clickable");
		}
	}

	public void verifyTAndCCheckboxOnConsentModelInactive() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(t$CCheckBoxInactiveConsentModel);
			logger.debug("I agree to Terms and Conditions Checkbox on Consent Modal is Inactive");
		} else {
			isDisplayed(t$CCheckBoxInactiveConsentModel);
			logger.debug("I agree to Terms and Conditions Checkbox on Consent Modal is Inactive");
		}

	}

	public void verifyPresenceOfBackButtonConsentModel() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(backButtonConsentModel);
			logger.debug("Back Button on Consent Modal Modal is displayed");
		} else {
			isDisplayed(backButtonConsentModel);
			logger.debug("Back Button on Consent Modal Modal is displayed");
		}

	}

	public void verifyPresenceOfCloseIconCCAM() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(closeButtonCCApplicationModal);
			logger.debug("Close icon on credit card Application modal is displayed");
		} else {
			isDisplayed(closeButtonCCApplicationModal);
			logger.debug("Close icon on credit card Application modal is displayed");
		}

	}
	public void verifyPresenceOfExistingCustomer() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(existingAccount);
			logger.debug("EXISTING CUSTOMER TEXT is displayed");
		} else {
			isDisplayed(existingAccount);
			logger.debug("EXISTING CUSTOMER TEXT is displayed");
		}

	}
	
	public void verifyPresenceOfDisclosureTxt1ConsentModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(disclosureTxt1ConsentModal);
			logger.debug("Disclosure Text one on Consent modal is displayed for Mobile");
		} else {
			isDisplayed(disclosureTxt1ConsentModal);
			logger.debug("Disclosure Text one on Consent modal is displayed");
		}

	}

	public void verifyPresenceOfDisclosureTxt2ConsentModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(disclosureTxt2ConsentModal);
			logger.debug("Disclosure Text two on Consent modal is displayed for Mobile");
		} else {
			isDisplayed(disclosureTxt2ConsentModal);
			logger.debug("Disclosure Text two on Consent modal is displayed");
		}

	}

	public void verifyPresenceOfConsentToAccountTAndCsLabelConsentModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(consentToAccountTAndCsLabelConsentModal);
			logger.debug("CONSENT TO ACCOUNT TERMS AND CONDITIONS on Consent modal is displayed");
		} else {
			isDisplayed(consentToAccountTAndCsLabelConsentModal);
			logger.debug("CONSENT TO ACCOUNT TERMS AND CONDITIONS on Consent modal is displayed");
		}

	}

	public void verifyPresenceOfAccountToFinancialTAndCsLabelConsentModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(accountToFinancialTAndCsLabelConsentModal);
			logger.debug("CONSENT TO FINANCIAL TERMS OF THE ACCOUNT on Consent modal is displayed");
		} else {
			isDisplayed(accountToFinancialTAndCsLabelConsentModal);
			logger.debug("CONSENT TO FINANCIAL TERMS OF THE ACCOUNT on Consent modal is displayed");
		}

	}

	public void verifyPresenceOfPrintLinkConsentModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(printLinkConsentModal);
			logger.debug("Print link on Consent modal is displayed");
		} else {
			isDisplayed(printLinkConsentModal);
			logger.debug("Print link on Consent modal is displayed");
		}

	}

	public void verifyPresenceOfConsentToFinancialIframeConsentModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(consentToFinancialIframeConsentModal);
			logger.debug("Account to Financial Iframe on Consent modal is displayed");
		} else {
			isDisplayed(consentToFinancialIframeConsentModal);
			logger.debug("Account to Financial Iframe on Consent modal is displayed");
		}

	}

	public void verifyPresenceOfAccountTAndCsLabelConsentModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(accountTAndCsLabelConsentModal);
			logger.debug("ACCOUNT TERMS AND CONDITIONS on Consent modal is displayed for Mobile");
		} else {
			isDisplayed(accountTAndCsLabelConsentModal);
			logger.debug("ACCOUNT TERMS AND CONDITIONS on Consent modal is displayed");
		}

	}

	public void verifyPresenceOfPlccCardImgCCAM() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(plccCardImgCCAM);
			logger.debug("plcc Card Image on Consent modal is displayed");
		} else {
			isDisplayed(plccCardImgCCAM);
			logger.debug("plcc Card Image on Consent modal is displayed");
		}

	}
	public void verifyPresenceOfCloseIconSuccessModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(closeIconSuccessModal);
			logger.debug("Close Icon of Sccess Modal is displayed");
		} else {
			isDisplayed(closeIconSuccessModal);
			logger.debug("Close Icon of Sccess Modal is displayed");
		}

	}
	

	public void verifyPresenceOfPageLabelPCCApplicationModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(pageLabelPCCApplicationModal);
			logger.debug(" STEP1:PRESCREEN ACCEPTANCE 2 on Pre-screen Credit card ApplicationModal is displayed for Mobile");
		} else {
			isDisplayed(pageLabelPCCApplicationModal);
			logger.debug(" STEP1:PRESCREEN ACCEPTANCE on Pre-screen Credit card ApplicationModal is displayed");
		}
	}
	public void verifyPresenceOfPrintIconPLCCApplicationModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(printLinkConsentModal);
			logger.debug("Print Icon on  Pre-screen Credit card ApplicationModal is displayed");
		} else {
			isDisplayed(printLinkConsentModal);
			logger.debug("Print Icon on  Pre-screen Credit card ApplicationModal is not displayed");
		}

	}
}
