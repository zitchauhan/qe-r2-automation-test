package com.aso.qe.test.pageobject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class R1_PLCC_CreditCardApplicationModal_PO extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	@FindBy(xpath = "//*[@data-auid='credit_application_first_name']")
	public WebElement firstNameCCModal;
	@FindBy(xpath = "//*[@data-auid='credit_application_middle_name']")
	public WebElement middleNameCCModal;
	@FindBy(xpath = "//*[@data-auid='credit_application_last_name']")
	public WebElement lastNameCCModal;
	@FindBy(xpath = "//*[@data-auid='credit_application_SSN']")
	public WebElement ssnCCModal;
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

	@FindBy(xpath = "//*[@name='state']")
	public WebElement stateDropDownCCModal;
	@FindBy(xpath = "//*[@data-auid='undefined_dropdownList']")
	public WebElement stateDropDownListCCModal;
	@FindBy(xpath = "//*[contains(@role,'presentation')]")
	public WebElement stateDropDownElementsCCModal;
	@FindBy(xpath = "//*[@data-auid='li_listOption_42']")
	public WebElement stateDropDownPACCModal;
	@FindBy(xpath = "//*[@id='plcc_modal_cancel']")
	public WebElement cancelLinkCCModal;
	
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
	public WebElement TandCCheckBox;
	@FindBy(xpath = "//*[text()='Submit']")
	public WebElement submitButton;
	

	public void verifyPresenceOfFirstNameCCModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(firstNameCCModal);
			logger.debug("First Name Text Field on Credit Card Application Modal is displayed");
		} else {
			isDisplayed(firstNameCCModal);
			logger.debug("First Name Text Field on Credit Card Application Modal is displayed");
		}
	}
	public void verifyPresenceOfCancelLinkCCModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(cancelLinkCCModal);
			logger.debug("Cancel Link on Credit Card Application Modal is displayed");
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
			logger.debug("Generic Credit Card Application Modal is displayed");
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
			logger.debug("Continue Button on Credit Card Application Modal is displayed");
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
			logger.debug("Agree T&C is displayed");
		} else {
			isDisplayed(TandCCheckBox);
			logger.debug("Agree T&C is displayed is displayed");
		}
	}

	public void verifyPresenceOfSuccessModalCCModal() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(successModal);
			logger.debug("Credit Card Application Form Submit Success Modal is displayed");
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
}
