package com.aso.qe.test.stepdefinition.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.SavedAddresses;
import com.aso.qe.test.pageobject.ios.UpdateAddressPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class UpdateAddressStepDefs extends GlobalMobileHelper {
    /*
        Created by jitsingh7 on 10/04/21
    */

    UpdateAddressPage updateAddressPage = new UpdateAddressPage(driver);
    SavedAddresses savedAddresses = new SavedAddresses(driver);
    
    @Then("^User sees list of saved addresses$")
    public void userSeesListOfSavedAddresses() {
        /* Created By jitsingh7 on 10/04/21 */
        List<MobileElement> listOfAddresses = driver.findElements(Locators.SavedAddresses.radioButtonAddress);
        assertTrue("Saved address list is not visible", listOfAddresses.get(0).isDisplayed());
    }

    @When("^User selects an address \"(.*?)\" to edit$")
    public void userSelectsAnAddressToEdit(String address) {
        /* Created By jitsingh7 on 10/04/21 */
        savedAddresses.tapOnEditAddressLink(address);
    }

    @When("^User updates the address details on edit address screen$")
    public void userUpdatesTheAddressDetailsOnEditAddressScreen() {
        /* Created By jitsingh7 on 10/04/21 */
        updateAddressPage.updateAptNumber();
    }

    @Then("^User sees the AVS screen \"(.*?)\"$")
    public void userSeesTheAVSScreen(String optional) {
        /* Created By jitsingh7 on 10/04/21 */

        if (optional.equalsIgnoreCase("yes")) {
            assertTrue("AVS screen is not visible",
                    isElementDisplayed(Locators.AddressVerification.titleAddressVerification));
        }
    }

    @And("^User sees that the suggested address is selected by default$")
    public void userSeesThatTheSuggestedAddressIsSelectedByDefault() {
        /* Created By jitsingh7 on 10/04/21 */
        throw new PendingException();
    }

    @When("^User selects \"(.*?)\" tile on AVS$")
    public void userSelectsTileOnAVS(String arg0) {
        /* Created By jitsingh7 on 10/04/21 */
        throw new PendingException();
    }

    @And("^User sees updated phone number on edit address screen$")
    public void userSeesUpdatedPhoneNumberOnEditAddressScreen() {
        /* Created By jitsingh7 on 10/04/21 */
        throw new PendingException();
    }

    @And("User taps on update address button")
    public void userTapsOnUpdateAddressButton() {
        /* Created By jitsingh7 on 18/04/21 */
        tapOnElement(Locators.AddAddress.buttonUpdateAddress);
    }

    @Then("^User sees the edit screen alert with text \"(.*?)\"$")
    public void userSeesTheEditScreenAlertWithText(String message) {
        /* Created By jitsingh7 on 18/04/21 */
        String alertWithTextXpath=String.format("//XCUIElementTypeStaticText[@name=\"%s\"]",message);
        // possibility of unsanitized text
        assertTrue("Alert with expected text is not displayed",
                isElementDisplayed(By.xpath(alertWithTextXpath)));
    }

    @And("user taps on OK button on Alert")
    public void userTapsOnOKButtonOnAlert() {
        /* Created By jitsingh7 on 18/04/21 */
        tapOnElement(Locators.AddAddress.buttonAlertOK);
    }

}
