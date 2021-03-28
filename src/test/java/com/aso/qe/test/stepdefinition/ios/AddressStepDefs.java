package com.aso.qe.test.stepdefinition.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;

import static org.junit.Assert.assertTrue;

public class AddressStepDefs extends GlobalMobileHelper{

    private Logger logger = Logger.getLogger(AddressStepDefs.class.getName());

    @And("^User taps on Address Book button$")
    public void user_taps_on_address_book_button() {
        tapOnElement(Locators.AccountPage.buttonAddressBook, 10);
        logger.debug("tapped on address book button on account page");
    }

    @Then("User sees add new address button")
    public void userSeesAddNewAddressButton() {
        assertTrue(isElementDisplayed(Locators.AddressBook.buttonAddNewAddress));
        logger.debug("add new address button is visible");
    }

    @When("User taps on Add New Address button")
    public void userTapsOnAddNewAddressButton() {
        tapOnElement(Locators.AddressBook.buttonAddNewAddress,20);
        logger.debug("tapped on Add New Address button");
    }

    @Then("User is on Add Address screen")
    public void userIsOnAddAddressScreen() {
        assertTrue(isElementDisplayed(Locators.AddAddressPage.addAddressHeader));
        logger.debug("address page is visible");
    }

    @And("User has multiple addresses with one default")
    public void userHasMultipleAddressesWithOneDefault() {
        // TODO: Call methods from Add Address stories
        logger.debug("address page is visible");
    }

    @Then("User sees default address on top")
    public void userSeesDefaultAddressOnTop() {
        // TODO : The label text has Default Address
        logger.debug("user sees default address on the top");
    }

    @And("User sees sequence as per date of added addresses")
    public void userSeesSequenceAsPerDateOfAddedAddresses() {
        // TODO : Default address should be at number 1 position / other addresses should be
    }

    @And("User sees truncated address")
    public void userSeesTruncatedAddress() {
        // TODO : A saved address visually appears truncated. Logic of truncation.
    }
}
