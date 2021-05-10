package com.aso.qe.test.stepdefinition.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.AcademyCreditCardForm;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class AcademyCreditCardStepDefs extends GlobalMobileHelper {
    /*
        created by jitsingh7 on 06/05/21
    */
    private static final Logger logger = Logger.getLogger(AcademyCreditCardStepDefs.class.getName());
    AcademyCreditCardForm academyCreditCardForm = new AcademyCreditCardForm(driver);

    @Then("User sees first name on Academy Credit Card Application Form")
    public void userSeesFirstNameOnAcademyCreditCardApplicationForm() throws Throwable {
        /* Created By jitsingh7 on 06/05/2021 */
        assertTrue(isElementDisplayed(academyCreditCardForm.lblFirstName));
        assertTrue(isElementDisplayed(academyCreditCardForm.inputFirstName));
        logger.debug("user sees first name on academy credit card application form");
    }

    @When("User taps on Academy Sports and Outdoors Credit card")
    public void userTapsOnAcademySportsAndOutdoorsCreditCard() throws Throwable{
        /* Created By jitsingh7 on 06/05/2021 */
        logger.debug("user tapped to open academy credit card application form");
        throw new PendingException("TODO: Include the steps once available on My Account Screen");
    }

    @And("User is on Academy Credit Card Application Form")
    public void userIsOnAcademyCreditCardApplicationForm() throws Throwable{
        /* Created By jitsingh7 on 06/05/2021 */
        assertTrue(isElementDisplayed(academyCreditCardForm.lblHeaderTitle));
        logger.debug("user is on academy credit card application form");
    }

    @And("User sees last name on Academy Credit Card Application Form")
    public void userSeesLastNameOnAcademyCreditCardApplicationForm() throws Throwable{
        /* Created By jitsingh7 on 06/05/2021 */
        assertTrue(isElementDisplayed(academyCreditCardForm.lblLastName));
        assertTrue(isElementDisplayed(academyCreditCardForm.inputLastName));
        logger.debug("user sees the last name on academy credit card application form");
    }

    @And("User sees middle name on Academy Credit Card Application Form")
    public void userSeesMiddleNameOnAcademyCreditCardApplicationForm() throws Throwable{
        /* Created By jitsingh7 on 06/05/2021 */
        assertTrue(isElementDisplayed(academyCreditCardForm.lblMiddleName));
        assertTrue(isElementDisplayed(academyCreditCardForm.inputMiddleName));
        logger.debug("user sees the middle name on academy credit card application form");
    }

    @And("User sees last four ssn on Academy Credit Card Application Form")
    public void userSeesLastFourSsnOnAcademyCreditCardApplicationForm() throws Throwable{
        /* Created By jitsingh7 on 06/05/2021 */
        assertTrue(isElementDisplayed(academyCreditCardForm.lblLast4Ssn));
        assertTrue(isElementDisplayed(academyCreditCardForm.inputLast4Ssn));
        logger.debug("user sees last four ssn name on academy credit card application form");
    }

    @And("User sees date of birth on Academy Credit Card Application Form")
    public void userSeesDateOfBirthOnAcademyCreditCardApplicationForm() throws Throwable{
        /* Created By jitsingh7 on 06/05/2021 */
        assertTrue(isElementDisplayed(academyCreditCardForm.lblDob));
        assertTrue(isElementDisplayed(academyCreditCardForm.inputDob));
        logger.debug("user sees date of birth on academy credit card application form");
    }

    @And("User sees annual income on Academy Credit Card Application Form")
    public void userSeesAnnualIncomeOnAcademyCreditCardApplicationForm() throws Throwable{
        /* Created By jitsingh7 on 06/05/2021 */
        assertTrue(isElementDisplayed(academyCreditCardForm.lblAnualIncome));
        assertTrue(isElementDisplayed(academyCreditCardForm.inputAnualIncome));
        logger.debug("user sees annual income on academy credit card application form");
    }

    @And("User sees cancel button on Academy Credit Card Application Form")
    public void userSeesCancelButtonOnAcademyCreditCardApplicationForm() throws Throwable{
        /* Created By jitsingh7 on 06/05/2021 */
        assertTrue(isElementDisplayed(academyCreditCardForm.btnCancel));
        logger.debug("user sees the cancel button on academy credit card application form");
    }

    @And("User taps on Next button on Academy Credit Card Application form")
    public void userTapsOnNextButtonOnAcademyCreditCardApplicationForm() throws Throwable{
        /* Created By jitsingh7 on 06/05/2021 */
        tapOnElement(academyCreditCardForm.btnCancel);
        logger.debug("user tapped on Next button on academy credit card application form");
    }

    @Then("User sees error message for the field on Academy Credit Card Application form")
    public void userSeesErrorMessageForTheFieldOnAcademyCreditCardApplicationForm(DataTable fieldsData) throws Throwable{
        /* Created By jitsingh7 on 06/05/2021 */
        logger.debug("user sees error message on academy credit card application form");
        List<List<String>> fieldsDataRows = fieldsData.raw();
        for(List<String> fieldsDataRow: fieldsDataRows){
            academyCreditCardForm.verifyFieldErrorMessage(fieldsDataRow.get(0), fieldsDataRow.get(1));
            logger.debug(String.format("user sees %s and error message %s", fieldsDataRow.get(0), fieldsDataRow.get(1)));
        }

    }

    @Then("^User sees error message \"(.*)\" for the \"(.*)\" on Academy Credit Card Application form on tab out$")
    public void userSeesErrorMessageForTheFieldOnAcademyCreditCardApplicationFormWhenTabsOut(String errorMessage, String fieldName)
            throws Throwable {
        /* Created By jitsingh7 on 06/05/2021 */
        academyCreditCardForm.tapOutOfAnElement(fieldName);
        academyCreditCardForm.verifyFieldErrorMessage(errorMessage, fieldName);
        logger.debug(String.format("user sees %s and error message %s", fieldName, errorMessage));
    }

    @And("User enters following data for the fields of Academy Credit Card Application form")
    public void userEntersFollowingDataForTheFieldsOfAcademyCreditCardApplicationForm() throws Throwable{
        /* Created By jitsingh7 on 06/05/2021 */
        logger.debug("user entered given data on academy credit card application form");
        throw new PendingException("user entered given data on academy card application form");
    }


    @And("^User enters the value \"(.*)\" for field \"(.*)\" Academy Credit Card Application form$")
    public void userEntersTheValueForFieldAcademyCreditCardApplicationForm(String fieldValue, String fieldName) throws Throwable{
        /* Created By jitsingh7 on 06/05/2021 */
        academyCreditCardForm.enterValueInField(fieldName, fieldValue);
        throw new PendingException("user enters the value of field on the credit card application form");
    }

    @Then("^User sees the \"(.*)\" for \"(.*)\" field on Academy Credit Card Application form$")
    public void userSeesTheForFieldOnAcademyCreditCardApplicationForm(String errorMessage, String fieldName) throws Throwable{
        /* Created By jitsingh7 on 06/05/2021 */
        academyCreditCardForm.verifyFieldErrorMessage(fieldName, errorMessage);
        logger.debug("Error message : "+ errorMessage + " for field " + fieldName + " is displayed");
    }

    @And("^User sees \"(.*)\" on Academy Credit Card Application Form$")
    public void userSeesOnAcademyCreditCardApplicationForm(String fieldName) throws Throwable{
        /* Created By jitsingh7 on 09/05/2021 */
        academyCreditCardForm.verifyIsElementDisplayed(fieldName);
        logger.debug(fieldName +" is displayed on Academy Credit Card Application form");
    }

    @And("^User enters \"(.*)\" on Academy Credit Card Application Form$")
    public void userEntersOnAcademyCreditCardApplicationForm(String fieldName) throws Throwable{
        /* Created By jitsingh7 on 09/05/2021 */
        academyCreditCardForm.enterValueInField(fieldName);
        logger.debug( fieldName + " was filled with a value");
    }

    @Then("User sees the consent page of the Academy Credit Card Application form")
    public void userSeesTheConsentPageOfTheAcademyCreditCardApplicationForm() {
        /* Created By jitsingh7 on 10/05/2021 */
        throw new PendingException("TODO: Implement the steps for verifying the consent page of credit card application");
    }
}
