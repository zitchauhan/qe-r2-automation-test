package com.aso.qe.test.pageobject.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.github.javafaker.Address;
import com.github.javafaker.Faker;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AcademyCreditCardForm {
    /*
    Created by jitsingh7 on 08/05/21
    */
    private static final Logger logger = Logger.getLogger(CartPage.class.getName());
    private AppiumDriver<MobileElement> driver;

    Faker faker = new Faker();

    private final Address address;
    private final String firstName;
    private final String lastName;
    private final String emailAddress;
    private final String validSSN;
    private final String income;

    public AcademyCreditCardForm(AppiumDriver<MobileElement> driver) {
        address = faker.address();
        firstName = faker.name().firstName();
        lastName = faker.name().lastName();
        emailAddress = faker.internet().safeEmailAddress();
        validSSN = faker.idNumber().ssnValid();
        income = String.valueOf(faker.number().numberBetween(30000L, 2500000L));
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(id = "btn_header_cancel")
    public MobileElement btnCancel;

    @iOSXCUITFindBy(id = "lbl_header_title")
    public MobileElement lblHeaderTitle ;

    @iOSXCUITFindBy(id = "webview")
    public MobileElement webview ;

    @iOSXCUITFindBy(id = "btn_loading_indicator")
    public MobileElement loadingIndicator ;

    @iOSXCUITFindBy(id = "lbl_personal_information")
    public MobileElement lblPersonalInformation ;

    @iOSXCUITFindBy(id = "lbl_first_name")
    public MobileElement lblFirstName ;

    @iOSXCUITFindBy(id = "lbl_middle_name")
    public MobileElement lblMiddleName ;

    @iOSXCUITFindBy(id = "lbl_last_name")
    public MobileElement lblLastName ;

    @iOSXCUITFindBy(id = "lbl_last_4_ssn")
    public MobileElement lblLast4Ssn ;

    @iOSXCUITFindBy(id = "lbl_dob")
    public MobileElement lblDob ;

    @iOSXCUITFindBy(id = "lbl_anual_income")
    public MobileElement lblAnualIncome ;

    @iOSXCUITFindBy(id = "lbl_first_name_error")
    public MobileElement lblFirstNameError ;

    @iOSXCUITFindBy(id = "lbl_middle_name_error")
    public MobileElement lblMiddleNameError ;

    @iOSXCUITFindBy(id = "lbl_last_name_error")
    public MobileElement lblLastNameError ;

    @iOSXCUITFindBy(id = "lbl_last_4_ssn_error")
    public MobileElement lblLast4SsnError ;

    @iOSXCUITFindBy(id = "lbl_dob_error")
    public MobileElement lblDobError ;

    @iOSXCUITFindBy(id = "lbl_anual_income_error")
    public MobileElement lblAnualIncomeError ;

    @iOSXCUITFindBy(id = "input_first_name")
    public MobileElement inputFirstName ;

    @iOSXCUITFindBy(id = "input_middle_name")
    public MobileElement inputMiddleName ;

    @iOSXCUITFindBy(id = "input_last_name")
    public MobileElement inputLastName ;

    @iOSXCUITFindBy(id = "input_last_4_ssn")
    public MobileElement inputLast4Ssn ;

    @iOSXCUITFindBy(id = "input_dob")
    public MobileElement inputDob ;

    @iOSXCUITFindBy(id = "input_anual_income")
    public MobileElement inputAnualIncome ;

    @iOSXCUITFindBy(id="lbl_contact_information")
    public MobileElement lblContactInformation;

    @iOSXCUITFindBy(id="lbl_street_address")
    public MobileElement lblStreetAddress;

    @iOSXCUITFindBy(id="lbl_suite_or_apartment_number")
    public MobileElement lblSuiteOrApartmentNumber;

    @iOSXCUITFindBy(id="lbl_city")
    public MobileElement lblCity;

    @iOSXCUITFindBy(id="lbl_state")
    public MobileElement lblState;

    @iOSXCUITFindBy(id="lbl_zip_code")
    public MobileElement lblZipCode;

    @iOSXCUITFindBy(id="lbl_email")
    public MobileElement lblEmail;

    @iOSXCUITFindBy(id="lbl_confirm_email")
    public MobileElement lblConfirmEmail;

    @iOSXCUITFindBy(id="lbl_Mobile_Number")
    public MobileElement lblMobileNumber;

    @iOSXCUITFindBy(id="lbl_alternate_mobile_number")
    public MobileElement lblAlternateMobileNumber;

    @iOSXCUITFindBy(id="lbl_street_address_error")
    public MobileElement lblStreetAddressError;

    @iOSXCUITFindBy(id="lbl_suite_or_apartment_number_error")
    public MobileElement lblSuiteOrApartmentNumberError;

    @iOSXCUITFindBy(id="lbl_city_error")
    public MobileElement lblCityError;

    @iOSXCUITFindBy(id="lbl_state_error")
    public MobileElement lblStateError;

    @iOSXCUITFindBy(id="lbl_zip_code_error")
    public MobileElement lblZipCodeError;

    @iOSXCUITFindBy(id="lbl_email_error")
    public MobileElement lblEmailError;

    @iOSXCUITFindBy(id="lbl_confirm_email_error")
    public MobileElement lblConfirmEmailError;

    @iOSXCUITFindBy(id="lbl_Mobile_Number_Error")
    public MobileElement lblMobileNumberError;

    @iOSXCUITFindBy(id="lbl_alternate_mobile_number_error")
    public MobileElement lblAlternateMobileNumberError;

    @iOSXCUITFindBy(id="input_street_address")
    public MobileElement inputStreetAddress;

    @iOSXCUITFindBy(id="input_suite_or_apartment_number")
    public MobileElement inputSuiteOrApartmentNumber;

    @iOSXCUITFindBy(id="input_city")
    public MobileElement inputCity;

    @iOSXCUITFindBy(id="input_state")
    public MobileElement inputState;

    @iOSXCUITFindBy(id="input_zip_code")
    public MobileElement inputZipCode;

    @iOSXCUITFindBy(id="input_email")
    public MobileElement inputEmail;

    @iOSXCUITFindBy(id="input_confirm_email")
    public MobileElement inputConfirmEmail;

    @iOSXCUITFindBy(id="input_Mobile_Number")
    public MobileElement inputMobileNumber;

    @iOSXCUITFindBy(id="input_alternate_mobile_number")
    public MobileElement inputAlternateMobileNumber;

    private String getElementText(MobileElement  mobileElement){
        return GlobalMobileHelper.getElementText(mobileElement);
    }

    private boolean isElementDisplayed(MobileElement mobileElement){
        return GlobalMobileHelper.isElementDisplayed(mobileElement);
    }

    private void tapOnElement(MobileElement mobileElement){
        GlobalMobileHelper.tapOnElement(mobileElement);
    }

    private void setText(MobileElement mobileElement, String text){
        GlobalMobileHelper.setText(mobileElement, text);
    }

    private void verifyEqualsErrorMessage(String expectedErrorMessage, MobileElement mobileElement){
        assertEquals(expectedErrorMessage.trim(), GlobalMobileHelper.getElementText(mobileElement));
    }

    public void verifyFieldErrorMessage(String fieldName, String expectedErrorMessage) {
        switch (fieldName.toLowerCase()) {
            case "first name":
                verifyEqualsErrorMessage(expectedErrorMessage,lblFirstNameError);
                break;
            case "last name":
                verifyEqualsErrorMessage(expectedErrorMessage,lblLastNameError);
                break;
            case "middle name":
                verifyEqualsErrorMessage(expectedErrorMessage, lblMiddleNameError);
                break;
            case "last 4 ssn":
                verifyEqualsErrorMessage(expectedErrorMessage, lblLast4SsnError);
                break;
            case "date of birth":
                verifyEqualsErrorMessage(expectedErrorMessage, lblDobError);
                break;
            case "annual income":
                verifyEqualsErrorMessage(expectedErrorMessage, lblAnualIncomeError);
                break;
            case "street address":
                verifyEqualsErrorMessage(expectedErrorMessage,lblStreetAddressError);
                break;
            case "suite or apt number":
                verifyEqualsErrorMessage(expectedErrorMessage, lblSuiteOrApartmentNumberError);
                break;
            case "city":
                verifyEqualsErrorMessage(expectedErrorMessage, lblCityError);
                break;
            case "state":
                verifyEqualsErrorMessage(expectedErrorMessage, lblStateError);
                break;
            case "zip code":
                verifyEqualsErrorMessage(expectedErrorMessage, lblZipCodeError);
                break;
            case "email addresss":
                verifyEqualsErrorMessage(expectedErrorMessage, lblEmailError);
                break;
            case "confirm email address":
                verifyEqualsErrorMessage(expectedErrorMessage, lblConfirmEmailError);
                break;
            case "mobile phone number":
                verifyEqualsErrorMessage(expectedErrorMessage, lblMobileNumberError);
                break;
            case "alternate phone number":
                verifyEqualsErrorMessage(expectedErrorMessage, lblAlternateMobileNumberError);
                break;
            default:
                throw new UnsupportedOperationException("Field level error validation is not supported for " + fieldName);
        }
    }

    public void tapOutOfAnElement(String fieldName){
        switch (fieldName.toLowerCase()){
            case "first name":
                tapOnElement(inputFirstName);
                break;
            case "last name":
                tapOnElement(inputLastName);
                break;
            case "last 4 ssn":
                tapOnElement(inputLast4Ssn);
                break;
            case "date of birth":
                tapOnElement(inputDob);
                break;
            case "annual income":
                tapOnElement(inputAnualIncome);
                break;
            case "street address":
                tapOnElement(inputStreetAddress);
                break;
            case "suite or apt number":
                tapOnElement(inputSuiteOrApartmentNumber);
                break;
            case "city":
                tapOnElement(inputCity);
                break;
            case "state":
                tapOnElement(inputState);
                break;
            case "zip code":
                tapOnElement(inputZipCode);
                break;
            case "email addresss":
                tapOnElement(inputEmail);
                break;
            case "confirm email address":
                tapOnElement(inputConfirmEmail);
                break;
            case "mobile phone number":
                tapOnElement(inputMobileNumber);
                break;
            case "alternate phone number":
                tapOnElement(inputAlternateMobileNumber);
                break;
            default:
                throw new UnsupportedOperationException("Field level error validation is not supported for " + fieldName);
        }

        GlobalMobileHelper.tapOnElement(lblHeaderTitle);
        // TODO: To be tested whether tapping on title results in invoking the error validation
    }

    public void verifyIsElementDisplayed(String fieldName) {
        switch (fieldName.toLowerCase()){
            case "first name":
                assertTrue(isElementDisplayed(inputFirstName));
                break;
            case "last name":
                assertTrue(isElementDisplayed(inputLastName));
                break;
            case "last 4 ssn":
                assertTrue(isElementDisplayed(inputLast4Ssn));
                break;
            case "date of birth":
                assertTrue(isElementDisplayed(inputDob));
                break;
            case "annual income":
                assertTrue(isElementDisplayed(inputAnualIncome));
                break;
            case "street address":
                assertTrue(isElementDisplayed(inputStreetAddress));
                break;
            case "suite or apt number":
                assertTrue(isElementDisplayed(inputSuiteOrApartmentNumber));
                break;
            case "city":
                assertTrue(isElementDisplayed(inputCity));
                break;
            case "state":
                assertTrue(isElementDisplayed(inputState));
                break;
            case "zip code":
                assertTrue(isElementDisplayed(inputZipCode));
                break;
            case "email address":
                assertTrue(isElementDisplayed(inputEmail));
                break;
            case "confirm email address":
                assertTrue(isElementDisplayed(inputConfirmEmail));
                break;
            case "mobile phone number":
                assertTrue(isElementDisplayed(inputMobileNumber));
                break;
            case "alternate phone number":
                assertTrue(isElementDisplayed(inputAlternateMobileNumber));
                break;
            default:
                throw new UnsupportedOperationException("Given fieldName verification is not supported "+ fieldName);
        }
    }

    public void enterValueInField(String fieldName) {
        switch (fieldName.toLowerCase()){
            case "first name":
                setText(inputFirstName, firstName);
                break;
            case "last name":
                setText(inputLastName, lastName);
                break;
            case "last 4 ssn":
                setText(inputLast4Ssn, validSSN.split("-")[2]);
                break;
            case "date of birth":
                assertTrue(isElementDisplayed(inputDob));
                break;
            case "annual income":
                setText(inputAnualIncome, income);
                break;
            case "street address":
                setText(inputStreetAddress, address.streetAddress());
                break;
            case "suite or apt number":
                setText(inputSuiteOrApartmentNumber, address.buildingNumber());
                break;
            case "city":
            case "state":
            case "zip code":

                /**
                 assertTrue(isElementDisplayed(inputCity));
                 assertTrue(isElementDisplayed(inputState));
                **/
                setText(inputZipCode, address.zipCode());
                /**
                 * TODO: check if the generated zip code is of US and of 9 or 5 digits
                 * Also validate whether city and state are autopopulated
                 */
                break;

            case "email address":
                setText(inputEmail, emailAddress);
                break;
            case "confirm email address":
                setText(inputConfirmEmail, emailAddress);
                break;
            case "mobile phone number":
                setText(inputMobileNumber, faker.phoneNumber().cellPhone());
                break;
            case "alternate phone number":
                setText(inputAlternateMobileNumber, faker.phoneNumber().phoneNumber());
                break;
            default:
                throw new UnsupportedOperationException("Given fieldName verification is not supported "+ fieldName);
        }
    }

    public void enterValueInField(String fieldName, String fieldValue) {
        switch (fieldName.toLowerCase()){
            case "first name":
                setText(inputFirstName, fieldValue);
                break;
            case "last name":
                setText(inputLastName, fieldValue);
                break;
            case "last 4 ssn":
                setText(inputLast4Ssn, fieldValue);
                break;
            case "date of birth":
                setText(inputDob, fieldValue);
                break;
            case "annual income":
                setText(inputAnualIncome, fieldValue);
                break;
            case "street address":
                setText(inputStreetAddress, fieldValue);
                break;
            case "suite or apt number":
                setText(inputSuiteOrApartmentNumber, fieldValue);
                break;
            case "city":
            case "state":
            case "zip code":
                /**
                 * City and state are auto-populate as per current behavior of the application
                 */
                if (inputZipCode.getText().isEmpty() || inputZipCode.getText().equalsIgnoreCase("")) {
                    setText(inputZipCode, fieldValue);
                }
                break;
            case "email address":
                setText(inputEmail, fieldValue);
                break;
            case "confirm email address":
                setText(inputConfirmEmail, fieldValue);
                break;
            case "mobile phone number":
                setText(inputMobileNumber, fieldValue);
                break;
            case "alternate phone number":
                setText(inputAlternateMobileNumber, fieldValue);
                break;
            default:
                throw new UnsupportedOperationException("Given fieldName verification is not supported "+ fieldName);
        }
    }
}
