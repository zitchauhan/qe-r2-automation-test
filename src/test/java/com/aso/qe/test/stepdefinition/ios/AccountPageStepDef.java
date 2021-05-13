package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.common.Locators.ManageNotificaiton;
import com.aso.qe.test.pageobject.ios.AccountPage;
import com.aso.qe.test.pageobject.ios.OrdersPage;
import com.aso.qe.test.pageobject.ios.SignUpPage;
import com.aso.qe.test.pageobject.ios.WishlistPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;

public class AccountPageStepDef extends GlobalMobileHelper{
	
	AccountPage accountPage = new AccountPage(driver);
	SignUpPage signUpPage = new SignUpPage(driver);
	OrdersPage orderPage = new OrdersPage(driver);

	@Then("^User sees the account page$")
	public void userIsOnHomePage() {
		assertTrue(accountPage.isAccountPageDisplayed());
	}

    @Then("User sees password strength meter list")
    public void userSeesPasswordStrengthMeterList() {
        /* Created By @{USER} on @{DATE} */
		throw new PendingException("userSeesPasswordStrengthMeterList Not implemented");
    }

    @And("^User sees password rule \"(.*?)\" as \"(.*?)\"")
    public void userSeesPasswordRuleAs(String arg0, String arg1) {
        /* Created By @{USER} on @{DATE} */
		throw new PendingException("userSeesPasswordRuleAs Not implemented");
    }

	@When("^User taps on Create An Account button$")
	public void tapOnCreateAnAccount() {
		accountPage.tapOnCreateAnAccount();
	}

	@When("^User sees sign up screen$")
	public void isSignUpScreenVisible() {
		assertTrue(signUpPage.isSignUpPageDisplayed());
	}

	@Then("^User enters \"(.*?)\" in \"(.*?)\" field$")
	public void enterFieldValues(String value,String field) {
		signUpPage.enterFieldValues(value,field);
	}

	@Then("^User enters \"(.*?)\" in \"(.*?)\" field on add address screen$")
	 public void enterFieldValuesOnAddAddress(String value,String field) {
	 accountPage.enterFieldValuesOnAddAddress(value,field);
	}

	@Then("User sees Create Account modal")
	public void userSeesCreateAccountModal() {
		isElementDisplayed(Locators.CreateAccount.buttonCancel);
	}

	@Then("^User taps on Find Store link$")
	public void user_taps_on_Find_Store_link() throws Throwable {
		accountPage.tapOnFindStoreLink();
	}
	@Then("^User verifies set as default address checkbox is \"([^\"]*)\"$")
	public void user_verifies_set_as_default_address_checkbox_is(String status) throws Throwable {
		accountPage.verifydefaultAddress(status);
	}
	
	@Then("^User taps on add new address button$")
	public void user_taps_on_add_new_address_button() throws Throwable {
		accountPage.tapOnAddNewAddress();
	}
	
	@When("^User selects \"([^\"]*)\" address to edit$")
	public void user_selects_address_to_edit(String addressNum) throws Throwable {
		accountPage.selectAddress(addressNum);
	}

	@When("^user see \"([^\"]*)\" on my account page$")
	public void user_see_on_my_account_page(String pagename) throws Throwable {
		assertTrue(accountPage.VarifyElementPresenseOnAccountPage(pagename)); 
	}

	// to verify user is on my accounts cards page
	@Then("^user see \"([^\"]*)\" on my account payment page$")
	public void user_is_on_my_account_cards_page(String pagename) throws Throwable {
		assertTrue(accountPage.VarifyElementPresenseOnAccountCardsPage(pagename)); 
	}

	@Then("^user taps on \"([^\"]*)\" on my account page$")
	public void tabOnButtonOnAccountPage(String btnName) {
		accountPage.tabOnButtonOnAccountPage(btnName);
	}
	@When("^user clicks on \"([^\"]*)\" on my account payment page$")
	public void tabOnButtonOnAccountCardsPage(String btnName) {
		
		accountPage.tabOnButtonOnAccountCardsPage(btnName);
	}
	
	@Then("^i choose to enter \"([^\"]*)\" on aso card page$")
	public void i_choose_to_enter_Aso_card(String carddetails) throws Throwable {
		 accountPage.enterCardDetails(carddetails);
	}

	// To verify that user is on aso card page
	@Then("^user is taken to \"([^\"]*)\" on aso card page$")
	public void user_is_taken_to_on_aso_card_page(String pagename) throws Throwable {
		assertTrue(accountPage.VarifyElementPresenseOnAsoCardsPage(pagename));
	}

	
	@Then("^i choose to verify error \"([^\"]*)\" on credit card page$")
	public void choosetoverifyerroroncreditcardpage(String elementname) throws Throwable {
		assertTrue(accountPage.choosetoverifyerroroncreditcardpage(elementname));
	}
	
	@Then("^User taps on the orders button$")
	public void tapOnOrderButton() {
		accountPage.tapOnOrderButton();
	}
	
	@Then("^User enter \"(.*?)\" in order field$")
	public void enterOrderId(String args) {
		accountPage.enterOrderID(args);
	}
	
	@Then("^User enters \"(.*?)\" in zip code field$")
	public void enterZipCode(String args) {
		accountPage.enterOrderZipCode(args);
	}
	
	@Then("^User taps on Order Check button$")
	public void tapOnOrderCheckButton(String args) {
		accountPage.tapOnOrderCheckButton();
	}
	
	@Then("^User taps on Order button in orders screen$")
	public void tapOnOrderButtonInOrderScreen() {
		accountPage.tapOnOrderButtonInOrderScreen();
	}
	
	@Then("^User is navigated to payment details screen$")
	public void isPaymentDetailsScreenDisplayed() {
		assertTrue(accountPage.isPaymentDetailsScreenDisplayed());
	}
	
	@Then("^User sees Order Summary label$")
	public void isOrderSummaryLabelDisplayed() {
		assertTrue(accountPage.isOrderSummaryLabelDisplayed());
	}
	
	@And("^User sees \"(.*?)\" field in Payment detail screen$")
	public void isOrderSummaryElementsDisplayed(String element) {
		assertTrue(orderPage.isOrderSummaryElementsDisplayed(element));
	}
	
	@Then("^User sees the payment method label$")
	public void isPaymentMethodLabelDisplayed() {
		assertTrue(accountPage.isPaymentMethodLabelDisplayed());
	}

	// To Click on add new Aso card page
	@When("^user clicks on \"([^\"]*)\" on aso card page$")
	public void user_clicks_on_on_aso_card_page(String btnName) {

		accountPage.tabOnButtonOnAsoCardsPage(btnName);
	}

	@When("^User Add the Credit card cardholder Name \"([^\"]*)\"$")
	public void user_Add_the_Credit_card_cardholder_Name(String cardHolderName)  {
		accountPage.addCreditCardHolderName(cardHolderName);
	}

	@Then("^User add the credit Card Number \"([^\"]*)\"$")
	public void user_add_the_credit_Card_Number(String cardNumber)  {
   accountPage.addCreditCardNumber(cardNumber);
}

	@Then("^User add the credit card Expiry Date \"([^\"]*)\"$")
	public void user_add_the_credit_card_Expiry_Date(String expiryDate)  {
    	accountPage.addCreditCardExpiryDate(expiryDate);
	}

	@Then("^User add the credit card cvv \"([^\"]*)\"$")
	public void user_add_the_credit_card_cvv(String cvvNumber)  {
    	accountPage.addCreditCardCvv(cvvNumber);
	}

	@Then("^i choose to enter \"([^\"]*)\" on credit card page$")
	public void i_choose_to_enter_on_credit_card_page(String carddetails)  {
	accountPage.enterCardDetails(carddetails);
}

	@When("^User taps on LogIn button at Account Page$")
	public void tapOnLoginBtn() {
		accountPage.tapOnLoginBtn();
	}

	@Then("^user sees the Billing Address Section$")
	public void user_sees_the_Billing_Address_Section() throws Throwable {
    	accountPage.isBillingAddressSectionDisplayed();
	}

	@And("^User Sees the Listed Credit card$")
	public void isCreditCardDisplayedOnPaymentPage() {
		accountPage.isCreditCardsDisplayed();
	}

	@Then("^User set credit card as default$")
	public void user_set_credit_card_as_default() throws Throwable {
		accountPage.tapOnSetDefaultCheckbox();
	}

	@Then("^User sees \"(.*?)\" in order Cancellation screen$")
	public void isCancellationScreenElementDisplayed(String element) {
		assertTrue(orderPage.isCancellationScreenElementDisplayed(element));
	}

	@Then("^user is navigate to credit card details page$")
	public void user_is_navigate_to_credit_card_details_page()  {
	   assertTrue( accountPage.isCreditCardDetailspageDisplayed());
	}

	@Then("^user sees the Alert PopUp message$")
	public void user_sees_the_Alert_PopUp_message()  {
	   assertTrue( accountPage.isAlertPopUpDisplayed());
	}

	@When("^User Sees the Default credit card on top$")
	public void user_Sees_the_Default_credit_card_on_top()  {
		accountPage.verifyDefaultcreditCard();
	}

	@Then("^User Click on the Listed Credit card no (\\d+)$")
	public void user_Click_on_the_Listed_Credit_card_no(int creditCardPosition)  {
	   accountPage.tapOnCreditCard(creditCardPosition);
	}

	@Then("^Set as default checkbox is not visible to the user$")
	public void isSetAsDefaultNotDisplayed() {
		assertTrue(accountPage.isSetAsDefaultNotDisplayed());
	}

	@Then("^Set as default checkbox is visible to the user$")
	public void isSetAsDefaultDisplayed() {
		assertFalse(accountPage.isSetAsDefaultNotDisplayed());
	}

	@Then("^Default checkbox is unchecked$")
	public void isDefaultCheckBoxChecked() {
		assertFalse(accountPage.isDefaultCheckBoxChecked());
	}

	@Then("^Set as default checkbox is disabled for the user$")
	public void isDefaultCheckBoxDisabled() {
		assertTrue(accountPage.isDefaultCheckBoxDisabled());
	}

	@Then("^User sees the greeting message$")
	public void isGreetingMessageDisplayed() {
		assertTrue(accountPage.isGreetingMessageDisplayed());
	}
	@Then("^User sees the \"([^\"]*)\" at ASO card Page$")
	public void user_sees_the_at_ASO_card_Page(String field) throws Throwable {
	   accountPage.isComponenetDisplayedOnAsoCardPage(field);
	}
	

	@Then("^User taps on \"([^\"]*)\" On Order Page$")
	public void tabOnButtonOnTrackorderPage(String btnName) {
		accountPage.tabOnButtonOnTrackorderPage(btnName);
	}
	
	@Then("^user see \"([^\"]*)\" Page$")
	public void user_see_Page(String pagename) throws Throwable {
		assertTrue(accountPage.VarifyElementPresenseOnOrdersPage(pagename)); 
	}
	@When("^user see \"([^\"]*)\" on order detail page$")
	public void user_see_on_order_detail_page(String pagename) throws Throwable {
		assertTrue(accountPage.VarifyElementPresenseOnOrdersPage(pagename));
}
	
	@When("^user see \"([^\"]*)\" on order history page$")
	public void user_see_on_order_history_page(String elementname) throws Throwable {
		assertTrue(accountPage.VarifyElementPresenseOnOrdershistoryPage(elementname));
	}
	
	@When("^user tabs on  \"([^\"]*)\" on order history page$")
	 public void tabOnButtonOnorderhistoryPage(String btnName) {
		accountPage.tabOnButtonOnorderhistoryPage(btnName);
	}
	// Manage Notification  -------------
	
	@Then("^User sees the Notification prefrence$")
	public boolean user_sees_the_Notification_prefrence() throws Throwable {
		
		MobileElement switchOnEnable = driver.findElement(Locators.ManageNotificaiton.notificationPref);
		return switchOnEnable.isDisplayed();
	}

	@When("^User Tap on Open Settings Button$")
	public void user_Tap_on_Open_Settings_Button() throws Throwable {
		
		  accountPage.tapOnOpenSettings();
	}

	@Then("^User navigate to Notificaion Setting$")
	public void user_navigate_to_Notificaion_Setting() throws Throwable {
		
		GlobalMobileHelper.setImplicitWaitTo(driver, 5);
	accountPage.isNotificationSettingDisplay();
	}

	@Then("^User sees the status as  toggled OFF$")
	public void user_sees_the_status_as_toggled_OFF() throws Throwable {

	}

	@When("^User Sees Order status and  Hot market OFF$")
	public void user_Sees_Order_status_and_Hot_market_OFF() throws Throwable {
	accountPage.isDisplaySwitchOff();
	}

	@Then("^User tap on Toggle  ON Order Status and HotMarket$")
	public void user_tap_on_Toggle_ON_Order_Status_and_HotMarket() throws Throwable {
	   accountPage.tapOnSwitchOn();
	}

	@Then("^User sees the alert Msg Pop Up$")
	public void user_sees_the_alert_Msg_Pop_Up() throws Throwable {
accountPage.isAlertPopUpDisplayed();
	}

	@When("^User Tap on Don't allow$")
	public void user_Tap_on_Don_t_allow() throws Throwable {
	  accountPage.tapOnDontAllow();
	}

	@Then("^User sees Toggle OFF in Notification$")
	public void user_sees_Toggle_OFF_in_Notification() throws Throwable {
	
	}

	@Then("^User sees Message display$")
	public void user_sees_Message_display() throws Throwable {
	
	}

	@When("^User Tap on Allow$")
	public void user_Tap_on_Allow() throws Throwable {
	accountPage.tapOnAllow();
	}

	@Then("^User seeToggle ON in Notification$")
	public void user_seeToggle_ON_in_Notification() throws Throwable {
	
	}

	@Then("^User see Status is ON$")
	public boolean user_see_Status_is_ON() throws Throwable {
		MobileElement switchOnEnable = driver.findElement(Locators.ManageNotificaiton.switchOff);
		return switchOnEnable.isEnabled();
		
	}

	@Then("^User seed  Order status and  Hot market Toogle OFF$")
	public void user_seed_Order_status_and_Hot_market_Toogle_OFF() throws Throwable {
		accountPage.isDisplaySwitchOff();
	}

	@When("^User tap on Enable Notification Toggle OFF$")
	public void user_tap_on_Enable_Notification_Toggle_OFF() throws Throwable {
	 accountPage.tapOnSwitchOn();
	}

	@Then("^User Sees Order status and  Hot market Toggle ON By deafault$")
	public void user_Sees_Order_status_and_Hot_market_Toggle_ON_By_deafault() throws Throwable {
	 accountPage.bothEnable();
	}

	@Then("^User is taken to add address screen$")
	public void user_is_taken_to_add_address_screen() throws Throwable {
		assertTrue(accountPage.isAddressBookDisplayed());
	}
	
	@When("^User taps on the address book placeholder$")
	public void user_taps_on_the_address_book_placeholder() throws Throwable {
		accountPage.tapOnAddressBookPlaceholder();
	}
}