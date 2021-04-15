package com.aso.qe.test.stepdefinition.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.pageobject.ios.UpdateAddressPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UpdateAddressStepDefs extends GlobalMobileHelper {
    /*
        Created by jitsingh7 on 10/04/21
    */

    UpdateAddressPage updateAddressPage = new UpdateAddressPage(driver);
    
    @Then("^User sees list of saved addresses$")
    public void userSeesListOfSavedAddresses() {
        /* Created By jitsingh7 on 10/04/21 */
        throw new PendingException();
    }

    @When("^User selects an address to edit$")
    public void userSelectsAnAddressToEdit() {
        /* Created By jitsingh7 on 10/04/21 */
        throw new PendingException();
    }

    @When("^User updates the address details on edit address screen$")
    public void userUpdatesTheAddressDetailsOnEditAddressScreen() {
        /* Created By jitsingh7 on 10/04/21 */
        throw new PendingException();
    }

    @Then("^User sees the AVS screen$")
    public void userSeesTheAVSScreen() {
        /* Created By jitsingh7 on 10/04/21 */
        throw new PendingException();
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

}
