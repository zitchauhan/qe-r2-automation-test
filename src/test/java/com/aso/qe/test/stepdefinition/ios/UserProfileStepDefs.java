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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserProfileStepDefs extends GlobalMobileHelper {
	/*
	 * Create by jitsingh7 on 15/04/21
	 */
	private static final Logger logger = Logger.getLogger(UserProfileStepDefs.class.getName());
	private UserProfilePage userProfilePage = new UserProfilePage(driver);
	private BottomNav bottomNav = new BottomNav(driver);
	private static String currentEmail = null;
	private static String currentName = null;
	private static String firstName = null;
	private static String lastName = null;
	private static String newEmail = null;

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

	
	/* Created By Nirmal Jain on 06/05/2021  OMNI-28637*/
	@Then("^User sees PersonalInformation as label$")
	public void user_sees_PersonalInformation_as_label() throws Throwable {
		assertTrue("Personal information label not  displayed",
				isElementDisplayed(Locators.UserProfile.labelPeronalInformation));

	}

	@Then("^User sees name button on profile screen$")
	public void user_sees_name_button_on_profile_screen() throws Throwable {
		assertTrue("Name button not displayed", isElementDisplayed(Locators.UserProfile.buttonName));
		currentName = userProfilePage.getCurrentName();
	}

	@Then("^User sees email button on profile Screen$")
	public void user_sees_email_button_on_profile_Screen() throws Throwable {
		assertTrue("Email button not displayed", isElementDisplayed(Locators.UserProfile.buttonEmail));
		currentEmail = userProfilePage.getCurrentEmail();

	}

	@Then("^User sees Subscription section with toggle on profile screen$")
	public void user_sees_Subscription_section_with_toggle_on_profile_screen() throws Throwable {
		assertTrue("subscription section not dispalyed",
				isElementDisplayed(Locators.UserProfile.labelSubscribeToEmailsFromAcademy));
	}

	@When("^User taps on name button$")
	public void user_taps_on_name_button() throws Throwable {
		userProfilePage.taponNameButton();

	}

	@Then("^User sees Edit name as label$")
	public void user_sees_Edit_name_as_label() throws Throwable {
		assertTrue("Edit name button not dispalyed", isElementDisplayed(Locators.UserProfile.labelChangeEmail));
	}

	@Then("^User Sees Firstname as input$")
	public void user_Sees_Firstname_as_input() throws Throwable {
		assertTrue("First name input field  not displayed", isElementDisplayed(Locators.UserProfile.inputFirstName));
	}

	@Then("^User sees Lastname as input$")
	public void user_sees_Lastname_as_input() throws Throwable {
		assertTrue("Last name input field  not displayed", isElementDisplayed(Locators.UserProfile.inputLastName));
	}

	@Then("^User sees update button$")
	public void user_sees_update_button() throws Throwable {
		assertTrue("Update button not displayed", isElementDisplayed(Locators.UserProfile.buttonUpdate));
	}

	@Then("^User enter \"([^\"]*)\" in Firstname input field$")
	public void user_enter_in_Firstname_input_field(String arg1) throws Throwable {
		firstName = arg1;
		userProfilePage.enterFirstEmail(firstName);

	}

	@Then("^User enter \"([^\"]*)\" in lastname input field$")
	public void user_enter_in_lastname_input_field(String arg1) throws Throwable {
		lastName = arg1;
		userProfilePage.enterFirstEmail(lastName);

	}

	@When("^User taps on update button$")
	public void user_taps_on_update_button() throws Throwable {
		userProfilePage.taponUpdateButton();

	}

	@Then("^User navigate to previous screen$")
	public void user_navigate_to_previous_screen() throws Throwable {
		assertTrue("Personal information label not  displayed",
				isElementDisplayed(Locators.UserProfile.labelPeronalInformation));

	}

	@Then("^user name is updated in name button$")
	public void user_name_is_updated_in_name_button() throws Throwable {
		String userName = firstName.concat(lastName);
		assertTrue(userProfilePage.getCurrentName().contains(userName));

	}

	@When("^User taps on email button$")
	public void user_taps_on_email_button() throws Throwable {

		userProfilePage.tapOnEmailButton();

	}

	@Then("^User sees change email as label$")
	public void user_sees_change_email_as_label() throws Throwable {
		assertTrue("Change e-mail label not displayed", isElementDisplayed(Locators.UserProfile.labelChangeEmail));
	}

	@Then("^User sees current email label with current email id$")
	public void user_sees_current_email_label_with_current_email_id() throws Throwable {
		assertTrue("current email label  not displayed", isElementDisplayed(Locators.UserProfile.txtCurrentEmail));
	}

	@Then("^User sees new email as input$")
	public void user_sees_new_email_as_input() throws Throwable {
		assertTrue("new email input field not displayed", isElementDisplayed(Locators.UserProfile.inputEmail));

	}

	@Then("^User sees confirm email as input$")
	public void user_sees_confirm_email_as_input() throws Throwable {
		assertTrue("confirm  email input field not displayed",
				isElementDisplayed(Locators.UserProfile.inputConfirmEmail));

	}

	@Then("^User enter \"([^\"]*)\" in new email input field$")
	public void user_enter_in_new_email_input_field(String arg1) throws Throwable {
		newEmail = arg1;
		userProfilePage.enterEmail(newEmail);
	}

	@Then("^User enter \"([^\"]*)\" in confirm email input field$")
	public void user_enter_in_confirm_email_input_field(String arg1) throws Throwable {
		String confirmEmail = arg1;
		userProfilePage.enterEmail(confirmEmail);
	}

	@Then("^user emailid  is updated in email button$")
	public void user_emailid_is_updated_in_email_button() throws Throwable {

		assertTrue("Email not updated ", userProfilePage.getCurrentEmail().equalsIgnoreCase(newEmail));

	}

	@When("^User taps on Back button$")
	public void user_taps_on_Back_button() throws Throwable {
		userProfilePage.tapOnBackButton();

	}
	

@Then("^User enter invalid email as \"([^\"]*)\"$")
public void user_enter_invalid_email_as(String arg1) throws Throwable {
	String invalidEmail=arg1;
    userProfilePage.enterEmail(invalidEmail);
}

@Then("^User sees an error message as \"([^\"]*)\"$")
public void user_sees_an_error_message_as(String arg1) throws Throwable {
    String errorMessage = arg1;
    assertTrue("Error message not matched..",userProfilePage.getEmailErrorMessage().equalsIgnoreCase(errorMessage));
    
    
}



}
