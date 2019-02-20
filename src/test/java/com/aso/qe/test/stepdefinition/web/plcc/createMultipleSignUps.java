package com.aso.qe.test.stepdefinition.web.plcc;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Registration_PO;

import cucumber.api.java.en.Then;

public class createMultipleSignUps extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_Registration_PO plccPageObjects = PageFactory.initElements(driver, R1_PLCC_Registration_PO.class);
		
	@Then("^user expect two thousand registrations to be done by entering \"(.*?)\"  \"(.*?)\"  \"(.*?)\" \"(.*?)\" \"(.*?)\"  \"(.*?)\" \"(.*?)\"$")
	public void user_expect_two_thousand_registrations_to_be_done_by_entering(String FN, String LN, String Email, String Pwd, String address, String zip, String Phone) throws Throwable {
		for(int n=1;n<=2000;n++)
		{
			plccPageObjects.clickSignUpLinkOnLoginPage();
			plccPageObjects.enterFirstNameTxtField(FN);
			assertTrue(isDisplayed(plccPageObjects.firstNameTxtField));
			waitForElement(plccPageObjects.firstNameTxtField);
			plccPageObjects.enterLastNameTxtField(LN);
			assertTrue(isDisplayed(plccPageObjects.lastNameTxtField));
			waitForElement(plccPageObjects.lastNameTxtField);
			plccPageObjects.enterEmailAddressTxtFieldAuto(Email);
			logger.debug("Email Id is:: " + Email);
			assertTrue(isDisplayed(plccPageObjects.emailIdTxtField));
			waitForElement(plccPageObjects.emailIdTxtField);
			plccPageObjects.enterCreatePwdTxtField(Pwd);
			assertTrue(isDisplayed(plccPageObjects.createPwdTxtField));
			logger.debug("Password is:: " + Pwd);
			waitForElement(plccPageObjects.createPwdTxtField);
			plccPageObjects.verifyPresenceOfAddAddressCheckBox();
			plccPageObjects.selectAddAddressCheckBox();
			plccPageObjects.enterAddressField(address);
			assertTrue(isDisplayed(plccPageObjects.addressTxtField));
			waitForElement(plccPageObjects.addressTxtField);
			plccPageObjects.enterZipCodeTxtField(zip);
			assertTrue(isDisplayed(plccPageObjects.addressZipCodeField));
			waitForElement(plccPageObjects.addressZipCodeField);
			Thread.sleep(2000);
			String prefilledCity = plccPageObjects.addressCityField.getText();
			System.out.println("Autofilled City Value is " + prefilledCity);
			logger.debug("Autofilled City Value is:: " + prefilledCity);
			plccPageObjects.enterPhoneNumberTxtField(Phone);
			assertTrue(isDisplayed(plccPageObjects.addressPhoneField));
			waitForElement(plccPageObjects.addressPhoneField);
			plccPageObjects.clickOnSignUpBtnRegistrationPage();
			plccPageObjects.clickOnMyAccountLink();
			plccPageObjects.signOutLink.click();
			
		}
	
	}
}
