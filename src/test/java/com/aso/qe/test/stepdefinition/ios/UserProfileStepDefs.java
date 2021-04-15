package com.aso.qe.test.stepdefinition.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.UserProfilePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;

import static org.junit.Assert.assertTrue;

public class UserProfileStepDefs extends GlobalMobileHelper {
    /*
    Create by jitsingh7 on 15/04/21
    */
    private static final Logger logger = Logger.getLogger(UserProfileStepDefs.class.getName());
    private UserProfilePage userProfilePage = new UserProfilePage(driver);

    @When("User navigates to Profile Page")
    public void userNavigatesToProfilePage() {
        /* Created By jitsingh7 on 15/04/2021 */
        // TODO : To be implemented after discussing with dev or on implementation of elements on the app
        throw new PendingException();
    }

    @When("User subscribes for Academy Emails")
    public void userSubscribesForAcademyEmails() {
        /* Created By jitsingh7 on 15/04/2021 */
        userProfilePage.subscribeForPromotionalEmails();
        logger.debug("user subscribed for academy emails");
    }

    @Then("User receives promotional emails")
    public void userReceivesPromotionalEmails() {
        /* Created By jitsingh7 on 15/04/2021 */
        logger.warn("To be verified using an email client or by logging into the inbox");
    }

    @When("User unsubscribes for Academy Emails")
    public void userUnsubscribesForAcademyEmails() {
        /* Created By jitsingh7 on 15/04/2021 */
        userProfilePage.unSubscribeFromPromotionalEmails();
        logger.debug("user unsubscribed for academy emails");
    }

    @Then("User does not receive promotional emails")
    public void userDoesNotReceivePromotionalEmails() {
        /* Created By jitsingh7 on 15/04/2021 */
        logger.warn("To be verified using an email client or by logging into the inbox");
    }

    @Then("User sees signup for emails text")
    public void userSeesSignupForEmailsText() {
        /* Created By jitsingh7 on 15/04/2021 */
        assertTrue(isElementDisplayed(Locators.UserProfile.labelSubscribeMessage));
    }
}
