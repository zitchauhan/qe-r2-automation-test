package com.aso.qe.test.stepdefinition.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CreateAccountStepDefs extends GlobalMobileHelper {
    /*
    Create by jitsingh7 on 31/03/21
    */

    @Then("^User sees password strength meter list$")
    public void user_sees_password_strength_meter_list(){
        isElementDisplayed(Locators.CreateAccount.passwordMeterHeader);
    }

    @And("^User sees Create Account button as \"(.*?)\"$")
    public void userSeesCreateAccountButtonAs(String buttonState) {
        if (buttonState.trim().equalsIgnoreCase("inactive")){
            assertFalse(isElementDisplayed(Locators.CreateAccount.buttonCreateAccount));
        }else if (buttonState.trim().equalsIgnoreCase("active")) {
            assertTrue(isElementDisplayed(Locators.CreateAccount.buttonCreateAccount));
        }
    }

}
