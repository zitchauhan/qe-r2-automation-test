package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertTrue;
import java.util.Date;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.stepdefinition.web.plcc.Common_Web_SD;

public class R1_PLCC_Registration_PO extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_SIT_PO sit_po = PageFactory.initElements(driver, R1_SIT_PO.class);
	R1_PDP_PO pdp_po = PageFactory.initElements(driver, R1_PDP_PO.class);
	Common_Web_SD timer = new Common_Web_SD();

	/*----------------------author:Vidya(MindtreeQA)-PLCC-----START--------------------------------*/
	// PLCC-41 (AddressCheckbox)
	//@FindBy(xpath = "//*[@data-auid='signInCta']")public WebElement myAccountLinkOnAsoHomePage;
	@FindBy(xpath = "//*[@data-auid='MyAccount']")public WebElement myAccountLinkOnAsoHomePage;
	
	@FindBy(xpath = "//*[@data-auid='signUp_btn']")public WebElement signUpLinkOnLoginPage;
	@FindBy(xpath = "//*[text()='Add Address for Faster Checkout']")public WebElement addAddressCheckBox;
	// @FindBy(xpath = "//*[@type='checkbox']")public WebElement addAddressCheckBox;
	@FindBy(xpath = "//*[@data-auid='address_input']")public WebElement addressTxtField;
	@FindBy(xpath = "//*[@data-auid='address_zipcode']")public WebElement addressZipCodeField;
	@FindBy(xpath = "//*[@data-auid='address_city']")public WebElement addressCityField;
	// @FindBy(xpath = "//*[@data-auid='address_state']")public WebElement
	// addressStateDropdown;
	@FindBy(xpath = "//button[@class='css-edkg4i']")public WebElement addressStateDropdown;
	// @FindBy(xpath = "//*[text()='Select']")public WebElement
	// addressStateDropdown;
	@FindBy(xpath = "//*[@data-auid='address_phone']")public WebElement addressPhoneField;
	@FindBy(xpath = "//*[@data-auid='btnsignup_btn']")public WebElement registerationSignUpBtn;
	@FindBy(xpath = "//*[@data-auid='firstname_input']")public WebElement firstNameTxtField;
	@FindBy(xpath = "//*[@data-auid='lastname_input']")public WebElement lastNameTxtField;
	@FindBy(xpath = "//*[@data-auid='email_input']")public WebElement emailIdTxtField;
	@FindBy(xpath = "//*[@data-auid='password_input']")public WebElement createPwdTxtField;
	@FindBy(xpath = "//*[@data-auid='checkout_initial_selected_address']")public WebElement enteredAddress;
	@FindBy(xpath = "//*[@data-auid='checkout_select_suggested_address_1']")public WebElement suggestedAddress;
	@FindBy(xpath = "//*[@data-auid='checkout_shipping_address_verification_modal_close']")public WebElement closeAddressSuggestionModalBtn;
	@FindBy(xpath = "//*[@data-auid='btncheckout_use_selected_address_btn']")public WebElement userSelectedAddressBtn;
	@FindBy(xpath = "//*[@data-auid='signin_signup_page']")public WebElement registrationConfirmationPage;
	@FindBy(xpath = "//*[@data-auid='signup_address_add_more_details_link']")public WebElement addMoreAddressDetailsLink;
	@FindBy(xpath = "//*[@data-auid='btnsingin_redirect_btn']")public WebElement letsShopBtn;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_3_California Transparency in Supply Chain Act(SB 657)']")public WebElement californiaTranparencyActLink;
	@FindBy(xpath="//*[text()='Sitemap']")public WebElement siteMapLink;
	@FindBy(xpath="//*[text()='© 2018 Academy Sports + Outdoors. All Rights Reserved']")public WebElement asoRightsLink;
	@FindBy(xpath="//*[text()='Product Index']")public WebElement productIndexLink;
	@FindBy(xpath="//*[text()='Shopping Index']")public WebElement shoppingIndexLink;
	@FindBy(xpath="//*[text()='Accessories & More']")public WebElement accessories$moreLink;
	@FindBy(xpath="//*[text()='Shops']")public WebElement shopsLink;
	@FindBy(xpath="//*[text()='Outdoors']")public WebElement outdoorsLink;
	@FindBy(xpath="//*[text()='Shoes']")public WebElement shoesLink;
	@FindBy(xpath="//*[text()='Sports Equipment']")public WebElement sportsEquipmentLink;
	@FindBy(xpath="//*[text()='THIS IS ACADEMY']")public WebElement thisIsAcademy;
	@FindBy(xpath="//*[text()='NEED HELP?']")public WebElement needHelp;
	@FindBy(xpath="//*[text()='SERVICES']")public WebElement servicesFooterText;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_1-888-922-2336']")public WebElement contactFooterLink;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_Check Gift Card Balance']") public WebElement lnkCheckGiftCardBalance;
	@FindBy(xpath="//*[text()='Brands']")public WebElement brandsIndexLink;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_Check Order Status']") public WebElement lnkcheckorderStatus;

	//Field Validation Errors
		@FindBy(xpath="//*[text()='Please enter the First Name']") public WebElement firstNameErrorMessage;
		@FindBy(xpath="//*[text()=' Please enter a Last Name']") public WebElement lastNameErrorMessage;
		@FindBy(xpath="//*[text()='Please enter an email address']") public WebElement emailAddressErrorMessage;
		@FindBy(xpath="//*[text()='Please enter the Password']") public WebElement passwordErrorMessage;
		@FindBy(xpath="//*[text()='Address is required']") public WebElement addressErrorMessage;
		@FindBy(xpath="//*[text()='Zip code is required']") public WebElement zipErrorMessage;
		@FindBy(xpath="//*[text()='City is required']") public WebElement cityErrorMessage;
		@FindBy(xpath="//*[text()='State is required']") public WebElement stateErrorMessage;
		@FindBy(xpath="//*[text()='Mobile number is required']") public WebElement mobileErrorMessage;
		@FindBy(xpath="//div[10]/div[5]/span") public WebElement invalidMobileNumberErrorMessage;
		@FindBy(xpath="//*[text()='Invalid Zip code']") public WebElement invalidZipErrorMessage;
		
		@FindBy(xpath="//*[@data-auid='checkout_modify_shipping_address_link']") public WebElement modifyAddressLink;
		@FindBy(xpath="//*[text()='We were unable to verify your address with the postal database. Using the address you entered may cause delays receiving your order.']") 
		public WebElement addressVerificationModalTxt;
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
	public void validatingPresenceOfThisAcademy() throws Exception{

		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(thisIsAcademy);
			logger.debug("This is Academy footer text is not displayed");
		}else {
			isDisplayed(thisIsAcademy);
			logger.debug("This is Academy footer text is displayed");
		}}
	public void validatingPresenceOfNeedHelp() throws Exception{

		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(needHelp);
			logger.debug("Need Help footer text is not displayed");
		}else {
			isDisplayed(needHelp);
			logger.debug("Need Help footer text is displayed");
		}}
	public void validatingPresenceOfCheckGiftCardBalance() throws Exception{

		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnkCheckGiftCardBalance);
			assertTrue(isClickable(lnkCheckGiftCardBalance));
			logger.debug("Check Gift Card Balance link is not displayed");
		}else {
			isDisplayed(lnkCheckGiftCardBalance);
			assertTrue(isClickable(lnkCheckGiftCardBalance));
			logger.debug("Check Gift Card Balance link is displayed");
		}}
	public void validatingPresenceOfContactNumber() throws Exception{

		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(contactFooterLink);
			assertTrue(isClickable(contactFooterLink));
			logger.debug("Footer Contact Number is not displayed");
		}else {
			isDisplayed(contactFooterLink);
			assertTrue(isClickable(contactFooterLink));
			logger.debug("Footer Contact Number is displayed");
		}}
	public void validatingPresenceOfServices() throws Exception{

		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(servicesFooterText);
			logger.debug("Services footer Text is not displayed");
		}else {
			isDisplayed(servicesFooterText);
			logger.debug("Services footer text is displayed");
		}}
	public void validatingPresenceOfcaliforniaTranparencyActLink() throws Exception{

		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(californiaTranparencyActLink);
			assertTrue(isClickable(californiaTranparencyActLink));
			logger.debug("FOOTER_LINK_3_California Transparency in Supply Chain Act(SB 657)");
		}else {
			isDisplayed(californiaTranparencyActLink);
			assertTrue(isClickable(californiaTranparencyActLink));
			logger.debug("FOOTER_LINK_3_California Transparency in Supply Chain Act(SB 657)");
		}}
	public void validatingPresenceOfSiteMapLink() throws Exception{

		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(siteMapLink);
			logger.debug("SiteMap Link is not displayed");
		}else {
			isDisplayed(siteMapLink);
			logger.debug("SiteMap Link is displayed");
		}}
	public void validatingPresenceOfAsoRightsLink() throws Exception{

		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(asoRightsLink);
			logger.debug("© 2018 Academy Sports + Outdoors. All Rights Reserved is not displayed");
		}else {
			isDisplayed(asoRightsLink);
			logger.debug("© 2018 Academy Sports + Outdoors. All Rights Reserved is displayed");
		}}
	public void validatingPresenceOfProductIndexLink() throws Exception{

		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(productIndexLink);
			logger.debug("Product Index is not displayed");
		}else {
			isDisplayed(productIndexLink);
			logger.debug("Product Index is displayed");
		}}
	public void validatingPresenceOfAccessoriesAndmoreLink() throws Exception{

		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(accessories$moreLink);
			logger.debug("Accessories And More Link is not displayed");
		}else {
			isDisplayed(accessories$moreLink);
			logger.debug("Accessories And More Link is displayed");
		}}
	public void validatingCheckOrderStatus() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnkcheckorderStatus);
			assertTrue(isClickable(lnkcheckorderStatus));
			logger.debug("CheckOrder Status link is not displayed");
		}else {
			isDisplayed(lnkcheckorderStatus);
			isClickable(lnkcheckorderStatus);
			logger.debug("CheckOrder Status link is displayed++++++++++++++++++++++++==");
		}
	}
	public void validatingPresenceOfShopsLink() throws Exception{

		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(shopsLink);
			logger.debug("Shops Link is not displayed");
		}else {
			isDisplayed(shopsLink);
			logger.debug("Shops Link is displayed");
		}}
	public void validatingPresenceOfOutdoorsLink() throws Exception{

		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(outdoorsLink);
			logger.debug("Outdoors Link is not displayed");
		}else {
			isDisplayed(outdoorsLink);
			logger.debug("Outdoors Link is displayed");
		}}
	public void validatingPresenceOfShoesLink() throws Exception{

		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(shoesLink);
			logger.debug("Shoes Link is not displayed");
		}else {
			isDisplayed(shoesLink);
			logger.debug("Shoes Link is displayed");
		}}
	public void validatingPresenceOfSportsEquipmentLink() throws Exception{

		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(sportsEquipmentLink);
			logger.debug("Sports Equipment Link is not displayed");
		}else {
			isDisplayed(sportsEquipmentLink);
			logger.debug("Sports Equipment Link is displayed");
		}}
	public void validatingPresenceOfShoppingIndexLink() throws Exception{

		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(shoppingIndexLink);
			logger.debug("Shopping Index is not displayed");
		}else {
			isDisplayed(shoppingIndexLink);
			logger.debug("Shopping Index is displayed");
		}}
	public void validatingPresenceOfBrandsIndexLink() throws Exception{

			if("mobile".equalsIgnoreCase(testtype)){
				isDisplayed(brandsIndexLink);
				logger.debug("Brands Index is not displayed");
			}else {
				isDisplayed(brandsIndexLink);
				logger.debug("Brands Index is displayed");
			}}
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
				CommonActionHelper.waitUntilElePresent(driver, addMoreAddressDetailsLink, ELEMWAITTIME_MEDIUM);
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
			CommonActionHelper.waitUntilElePresent(driver, addressPhoneField, ELEMWAITTIME_MEDIUM);
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
	
	public void verifyPresenceOfMyAccountLink() throws Exception {

		if ("web".equalsIgnoreCase(testtype)) {
			isDisplayed(myAccountLinkOnAsoHomePage);
			logger.debug("My Account Link is displayed");
			CommonActionHelper.waitUntilElePresent(driver, myAccountLinkOnAsoHomePage, ELEMWAITTIME_MEDIUM);
		} else {
			isDisplayed(myAccountLinkOnAsoHomePage);
			logger.debug("My Account Link is not displayed++++++++++++++++++++++++==");
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

	public void enterEmailAddressTxtFieldAuto(String arg) throws Exception {
		Date NewEmailEveryTime = new Date(System.currentTimeMillis());
		String NewEmailEveryTime2 = NewEmailEveryTime.toString().replaceAll("\\s+", "").replaceAll(":", "");
		String NewEmailEveryTimeValue = "QA" + NewEmailEveryTime2 + "@gmail.com";
		setInputText(emailIdTxtField, NewEmailEveryTimeValue);
	}
	//Enter Invalid Phone Number
	public void enterInvalidPhoneNumber(String arg) throws Exception {
		setInputText(addressPhoneField, webPropHelper.getTestDataProperty(arg));
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
	
	//Field Level Errors
	
	public void verifypresenceofFirstNameErrorMessage() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(firstNameErrorMessage);
			logger.debug("Please enter the First Name error message is not displayed");
		}else {
			isDisplayed(firstNameErrorMessage);
			logger.debug("Please enter the First Name error message is displayed++++++++++++++++++++++++==");
		}
	}
	public void verifypresenceofLastNameErrorMessage() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lastNameErrorMessage);
			logger.debug("Please enter a Last Name error message is not displayed");
		}else {
			isDisplayed(lastNameErrorMessage);
			logger.debug("Please enter a Last Name error message is displayed++++++++++++++++++++++++==");
		}
	}
	public void verifypresenceofEmailAddressErrorMessage() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(emailAddressErrorMessage);
			logger.debug("Please enter an email address error message is not displayed");
		}else {
			isDisplayed(emailAddressErrorMessage);
			logger.debug("Please enter an email address error message is displayed++++++++++++++++++++++++==");
		}
	}
	
	public void verifypresenceofPasswordErrorMessage() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(passwordErrorMessage);
			logger.debug("Please enter the Password error message is not displayed");
		}else {
			isDisplayed(passwordErrorMessage);
			logger.debug("Please enter the Password error message is displayed++++++++++++++++++++++++==");
		}
	}
	public void verifypresenceofAddressErrorMessage() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(addressErrorMessage);
			logger.debug("Address is required error message is not displayed");
		}else {
			isDisplayed(addressErrorMessage);
			logger.debug("Address is required error message is displayed++++++++++++++++++++++++==");
		}
	}
	public void verifypresenceofZipErrorMessage() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(zipErrorMessage);
			logger.debug("Zip code is required error message is not displayed");
		}else {
			isDisplayed(zipErrorMessage);
			logger.debug("Zip code is required error message is displayed++++++++++++++++++++++++==");
		}
	}
	public void verifypresenceofCityErrorMessage() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(cityErrorMessage);
			logger.debug("City is required error message is not displayed");
		}else {
			isDisplayed(cityErrorMessage);
			logger.debug("City is required error message is displayed++++++++++++++++++++++++==");
		}
	}
	public void verifypresenceofStateErrorMessage() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(stateErrorMessage);
			logger.debug("State is required error message is not displayed");
		}else {
			isDisplayed(stateErrorMessage);
			logger.debug("State is required error message is displayed++++++++++++++++++++++++==");
		}
	}
	public void verifypresenceofInvalidMobileNumberErrorMessage() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(invalidMobileNumberErrorMessage);
			logger.debug("Mobile number can't be less than 10 digits error message is not displayed");
		}else {
			isDisplayed(invalidMobileNumberErrorMessage);
			logger.debug("Mobile number can't be less than 10 digits error message is displayed++++++++++++++++++++++++==");
		}
	}
	public void verifypresenceofInvalidZipCodeErrorMessage() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(invalidZipErrorMessage);
			logger.debug("Invalid Zip code error message is not displayed");
		}else {
			isDisplayed(invalidZipErrorMessage);
			logger.debug("Invalid Zip code error message is displayed++++++++++++++++++++++++==");
		}
	}
	public void verifypresenceofMobileErrorMessage() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(invalidZipErrorMessage);
			logger.debug("Invalid Zip code error message is not displayed");
		}else {
			isDisplayed(invalidZipErrorMessage);
			logger.debug("Invalid Zip code message is displayed++++++++++++++++++++++++==");
		}
	}
	
	public void verifyPresenceOfModifyAddressLink() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(modifyAddressLink);
			logger.debug("Modify Address Link is dispalyed");
		} else {
			isDisplayed(modifyAddressLink);
			logger.debug("Modify Address Link is displayed");
		}
	}
	public void verifyPresenceOfAddressVerificationModalTxt() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(addressVerificationModalTxt);
			logger.debug("We were unable to verify your address with the postal database. Using the address you entered may cause delays receiving your order.\r\n" + 
					" is dispalyed");
		} else {
			isDisplayed(addressVerificationModalTxt);
			logger.debug("We were unable to verify your address with the postal database. Using the address you entered may cause delays receiving your order.\r\n" + 
					" is displayed");
		}
	}
}
