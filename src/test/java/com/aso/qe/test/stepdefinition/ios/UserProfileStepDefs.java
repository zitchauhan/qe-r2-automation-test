package com.aso.qe.test.stepdefinition.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.BottomNav;
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
    private BottomNav bottomNav = new BottomNav(driver);

    @When("User navigates to Profile Page")
    public void userNavigatesToProfilePage() throws Throwable {
        /* Created By jitsingh7 on 15/04/2021 */
        bottomNav.tapOnAccount();
        tapOnElement(Locators.AccountPage.buttonProfile);
        logger.debug("tapped on Profile button on Account screen");
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
        assertTrue("User doesn't see the Signup text", isElementDisplayed(Locators.UserProfile.labelSubscribeMessage));
    }
}
