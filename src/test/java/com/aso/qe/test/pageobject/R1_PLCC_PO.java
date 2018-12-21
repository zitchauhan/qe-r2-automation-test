package com.aso.qe.test.pageobject;

import static org.testng.Assert.assertTrue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.stepdefinition.web.plcc.Common_Web_SD;

public class R1_PLCC_PO extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_SIT_PO sit_po = PageFactory.initElements(driver, R1_SIT_PO.class);
	R1_PDP_PO pdp_po = PageFactory.initElements(driver, R1_PDP_PO.class);
	Common_Web_SD timer = new Common_Web_SD();

	/*----------------------author:Vidya(MindtreeQA)-PLCC-----START--------------------------------*/
	// PLCC-41 (AddressCheckbox)
	@FindBy(xpath = "//*[@data-auid='signInCta']")
	public WebElement myAccountLinkOnAsoHomePage;
	@FindBy(xpath = "//*[@data-auid='signUp_btn']")
	public WebElement signUpLinkOnLoginPage;
	@FindBy(xpath = "//*[text()='Add Address for Faster Checkout']")
	public WebElement addAddressCheckBox;
	// @FindBy(xpath = "//*[@type='checkbox']")public WebElement addAddressCheckBox;
	@FindBy(xpath = "//*[@data-auid='address_input']")
	public WebElement addressTxtField;
	@FindBy(xpath = "//*[@data-auid='address_zipcode']")
	public WebElement addressZipCodeField;
	@FindBy(xpath = "//*[@data-auid='address_city']")
	public WebElement addressCityField;
	// @FindBy(xpath = "//*[@data-auid='address_state']")public WebElement
	// addressStateDropdown;
	@FindBy(xpath = "//button[@class='css-edkg4i']")
	public WebElement addressStateDropdown;
	// @FindBy(xpath = "//*[text()='Select']")public WebElement
	// addressStateDropdown;
	@FindBy(xpath = "//*[@data-auid='address_phone']")
	public WebElement addressPhoneField;
	@FindBy(xpath = "//*[@data-auid='btnsignup_btn']")
	public WebElement registerationSignUpBtn;
	@FindBy(xpath = "//*[@data-auid='firstname_input']")
	public WebElement firstNameTxtField;
	@FindBy(xpath = "//*[@data-auid='lastname_input']")
	public WebElement lastNameTxtField;
	@FindBy(xpath = "//*[@data-auid='email_input']")
	public WebElement emailIdTxtField;
	@FindBy(xpath = "//*[@data-auid='password_input']")
	public WebElement createPwdTxtField;
	@FindBy(xpath = "//*[@data-auid='checkout_initial_selected_address']")
	public WebElement enteredAddress;
	@FindBy(xpath = "//*[@data-auid='checkout_select_suggested_address_1']")
	public WebElement suggestedAddress;
	@FindBy(xpath = "//*[@data-auid='checkout_shipping_address_verification_modal_close']")
	public WebElement closeAddressSuggestionModalBtn;
	@FindBy(xpath = "//*[@data-auid='btncheckout_use_selected_address_btn']")
	public WebElement userSelectedAddressBtn;
	@FindBy(xpath = "//*[@data-auid='signin_signup_page']")
	public WebElement registrationConfirmationPage;
	// By addMoreAddressDetailsLink1 =
	// By.xpath("//*[@data-auid='signup_address_add_more_details_link'");
	@FindBy(xpath = "//*[@data-auid='signup_address_add_more_details_link']")
	public WebElement addMoreAddressDetailsLink;
	@FindBy(xpath = "//*[@data-auid='btnsingin_redirect_btn']")
	public WebElement letsShopBtn;

	/*----------------------author:Vidya(MindtreeQA)-PLCC-----END--------------------------------*/

	/*-------------------------------author:Vidya Siddaramappa (Mindtree QA)------------------------------------*/

	public void clickOnMyAccountLink() throws Exception {

		{
			assertTrue(isDisplayed(myAccountLinkOnAsoHomePage));
			isClickable(myAccountLinkOnAsoHomePage);
			if (isDisplayed(myAccountLinkOnAsoHomePage)) {
				Thread.sleep(5000);
				assertTrue(clickOnButton(myAccountLinkOnAsoHomePage));
				Thread.sleep(1000);
			} else {
				driver.navigate().refresh();
				Thread.sleep(1000);
			}
		}
	}

	public void clickSignUpLinkOnLoginPage() throws Exception {

		{
			assertTrue(isDisplayed(signUpLinkOnLoginPage));
			isClickable(signUpLinkOnLoginPage);
			if (isDisplayed(signUpLinkOnLoginPage)) {
				Thread.sleep(5000);
				assertTrue(clickOnButton(signUpLinkOnLoginPage));
				Thread.sleep(1000);
			} else {
				driver.navigate().refresh();
				Thread.sleep(1000);
			}
		}
	}

	public void verifyPresenceOfAddAddressCheckBox() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(addAddressCheckBox);
			// assertTrue(isClickable(addAddressCheckBox));
			logger.debug("Add address checkbox is displayed");
		} else {
			isDisplayed(addAddressCheckBox);
			// assertTrue(isClickable(addAddressCheckBox));
			logger.debug("Add address checkbox is not displayed++++++++++++++++++++++++==");
		}
	}

	public void selectAddAddressCheckBox() throws Exception {
		try {
			assertTrue(clickOnButton(addAddressCheckBox));
			// System.out.println("AddressCheckBox is checked");

		} catch (Exception e) {
			addAddressCheckBox.click();

		}
	}

	public void unselectAddAddressCheckBox() throws Exception {
		// assertTrue(selectByText(addAddressCheckBox,"Add Address for Faster
		// Checkout"));
		Assert.assertFalse(addAddressCheckBox.isSelected());
	}

	public void verifyPresenceOfFirstNameTxtField() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(firstNameTxtField);
			logger.debug("FirstName Text Field is not displayed");
		} else {
			isDisplayed(firstNameTxtField);
			logger.debug("FirstName Text Field is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfLastNameTxtField() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(lastNameTxtField);
			logger.debug("LastName Text Field is not displayed");
		} else {
			isDisplayed(lastNameTxtField);
			logger.debug("LastName Text Field is displayed++++++++++++++++++++++++==");
		}
	}

	public void verifyPresenceOfEmailTxtField() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(emailIdTxtField);
			logger.debug("Email Text Field is displayed");
		} else {
			isDisplayed(emailIdTxtField);
			logger.debug("Email Text Field is not displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfCrestePwdTxtField() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(createPwdTxtField);
			logger.debug("Create Text Field is displayed");
		} else {
			isDisplayed(createPwdTxtField);
			logger.debug("Create Text Field is not displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfAddressTxtField() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(addressTxtField);
			logger.debug("Add Address Text Field is displayed");
		} else {
			isDisplayed(addressTxtField);
			logger.debug("Add Address Text Field is not displayed++++++++++++++++++++++++==");
		}
	}

	public void verifyPresenceOfZipTxtField() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(addressZipCodeField);
			logger.debug("Zip Text Field is displayed");
		} else {
			isDisplayed(addressZipCodeField);
			logger.debug("Zip Text Field is not displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfStateDrpdwn() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(addressStateDropdown);
			logger.debug("State Drop down is displayed");
		} else {
			isDisplayed(addressStateDropdown);
			logger.debug("State Drop down is not displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfCityTxtField() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(addressZipCodeField);
			logger.debug("City Text Field is displayed");
		} else {
			isDisplayed(addressZipCodeField);
			logger.debug("City Text Field is not displayed++++++++++++++++++++++++==");
		}
	}

	public void verifyPresenceOfAddMoreAddressDetails() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(addMoreAddressDetailsLink);
			logger.debug("Add company name, Apt.Number, etc. (Optional) link is displayed");
		} else {
			isDisplayed(addMoreAddressDetailsLink);
			logger.debug(
					"Add company name, Apt.Number, etc. (Optional) link is not displayed++++++++++++++++++++++++==");
		}
	}

	public void clickOnAddMoreAddressDetails() throws Exception {

		{
			assertTrue(isDisplayed(myAccountLinkOnAsoHomePage));
			isClickable(addMoreAddressDetailsLink);
			if (isDisplayed(addMoreAddressDetailsLink)) {
				CommonActionHelper.waitUntilEleNotPresent(driver, addMoreAddressDetailsLink, ELEMWAITTIME_MEDIUM);
				assertTrue(clickOnButton(addMoreAddressDetailsLink));
				// Thread.sleep(1000);
			} else {
				driver.navigate().refresh();
				Thread.sleep(1000);
			}
		}
	}

	public void verifyPresenceOfPhoneNumberTxtField() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(addressPhoneField);
			logger.debug("Phone Number Text Field is displayed");
			CommonActionHelper.waitUntilEleNotPresent(driver, addressPhoneField, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(addressPhoneField);
			logger.debug("Phone Number Text Field is not displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfSignUpBtnRegistrationPage() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(registerationSignUpBtn);
			logger.debug("Sign Up Button on Registration Page is displayed");
		} else {
			isDisplayed(registerationSignUpBtn);
			logger.debug("Sign Up Button on Registration Page is not displayed++++++++++++++++++++++++==");
		}
	}

	public void clickOnSignUpBtnRegistrationPage() throws Exception {

		{
			assertTrue(isDisplayed(registerationSignUpBtn));
			isClickable(registerationSignUpBtn);
			if (isDisplayed(registerationSignUpBtn)) {
				Thread.sleep(5000);
				assertTrue(clickOnButton(registerationSignUpBtn));
				Thread.sleep(1000);
			} else {
				Thread.sleep(1000);
			}
		}
	}

	public void verifyPresenceOfUserSelectedAddressBtn() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(userSelectedAddressBtn);
			logger.debug("User selected address button is displayed");
		} else {
			isDisplayed(userSelectedAddressBtn);
			logger.debug("User selected address button is not displayed++++++++++++++++++++++++==");
		}
	}

	public void clickOnUserSelectedAddressBtn() throws Exception {

		{
			assertTrue(isDisplayed(userSelectedAddressBtn));
			isClickable(userSelectedAddressBtn);
			if (isDisplayed(userSelectedAddressBtn)) {
				Thread.sleep(5000);
				assertTrue(clickOnButton(userSelectedAddressBtn));
				Thread.sleep(1000);
			} else {
				driver.navigate().refresh();
				Thread.sleep(1000);
			}
		}
	}

	public void verifyPresenceOfUserSuggestedAddressBtn() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(suggestedAddress);
			logger.debug("User clicked on suggested adress");
		} else {
			isDisplayed(suggestedAddress);
			logger.debug("User did not click on suggested address++++++++++++++++++++++++==");
		}
	}

	public void clickOnUserSuggestedAddressBtn() throws Exception {

		{
			assertTrue(isDisplayed(suggestedAddress));
			isClickable(suggestedAddress);
			if (isDisplayed(suggestedAddress)) {
				Thread.sleep(5000);
				assertTrue(clickOnButton(suggestedAddress));
				Thread.sleep(1000);
			} else {
				driver.navigate().refresh();
				Thread.sleep(1000);
			}
		}
	}

	public void verifyPresenceOfUserEnteredAddressBtn() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(enteredAddress);
			logger.debug("User clicked on entered adress");
		} else {
			isDisplayed(enteredAddress);
			logger.debug("User did not click on entered address++++++++++++++++++++++++==");
		}
	}

	public void clickOnUserEnteredAddressBtn() throws Exception {

		{
			assertTrue(isDisplayed(enteredAddress));
			isClickable(enteredAddress);
			if (isDisplayed(enteredAddress)) {
				Thread.sleep(5000);
				assertTrue(clickOnButton(enteredAddress));
				Thread.sleep(1000);
			} else {
				driver.navigate().refresh();
				Thread.sleep(1000);
			}
		}
	}

	public void verifyPresenceOfRegistrationConfirmation() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(registrationConfirmationPage);
			logger.debug("Registration Confirmation is displayed");
		} else {
			isDisplayed(registrationConfirmationPage);
			logger.debug("Registration Confirmation is not displayed++++++++++++++++++++++++==");
		}
	}

	public void verifyPresenceOfLetsShopButton() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(letsShopBtn);
			logger.debug("LET'S SHOP Button is displayed");
		} else {
			isDisplayed(letsShopBtn);
			logger.debug("LET'S SHOP Button is not displayed++++++++++++++++++++++++==");
		}
	}

	// To enter test data - 1 String Value
	// FirstName
	public void enterFirstNameTxtField(String arg) throws Exception {
		setInputText(firstNameTxtField, webPropHelper.getTestDataProperty(arg));
	}

	// LastName
	public void enterLastNameTxtField(String arg) throws Exception {
		setInputText(lastNameTxtField, webPropHelper.getTestDataProperty(arg));
	}

	// ZipCode
	public void enterZipCodeTxtField(String arg) throws Exception {
		setInputText(addressZipCodeField, webPropHelper.getTestDataProperty(arg));
	}

	// EmailAddress
	public void enterEmailAddressTxtField(String arg) throws Exception {
		setInputText(emailIdTxtField, webPropHelper.getTestDataProperty(arg));
	}

	public void enterEmailAddressTxtFieldAuto(String arg) throws Exception {
		Date NewEmailEveryTime = new Date(System.currentTimeMillis());
		String NewEmailEveryTime2 = NewEmailEveryTime.toString().replaceAll("\\s+", "").replaceAll(":", "");
		String NewEmailEveryTimeValue = "QA" + NewEmailEveryTime2 + "@gmail.com";
		setInputText(emailIdTxtField, NewEmailEveryTimeValue);
	}

	// CreatePassword
	public void enterCreatePwdTxtField(String arg) throws Exception {
		setInputText(createPwdTxtField, webPropHelper.getTestDataProperty(arg));
	}

	// EnterAddress
	public void enterAddressField(String arg) throws Exception {
		setInputText(addressTxtField, webPropHelper.getTestDataProperty(arg));
	}

	// PhoneNumber
	public void enterPhoneNumberTxtField(String arg) throws Exception {
		setInputText(addressPhoneField, webPropHelper.getTestDataProperty(arg));
	}
}
