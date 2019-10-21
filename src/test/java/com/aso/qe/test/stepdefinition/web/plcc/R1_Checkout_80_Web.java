package com.aso.qe.test.stepdefinition.web.plcc;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertFalse;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.common.Common_Web_PLCC;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;
import com.aso.qe.test.pageobject.R1_PLCC_LandingPage_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Mobile_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Registration_PO;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import freemarker.template.utility.NullArgumentException;

public class R1_Checkout_80_Web extends CommonActionHelper {
	R2_MyAccount_PO myAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_LandingPage_PO plccLandingPageObjects = PageFactory.initElements(driver, R1_PLCC_LandingPage_PO.class);
	R1_PLCC_Registration_PO plccPageObjects = PageFactory.initElements(driver, R1_PLCC_Registration_PO.class);
	R1_PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), R1_PDP_PO.class);
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);
	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_MyAccount_PO r2MyAccountPO = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R2_R1_Fun_PO r2_r1_fun_po = PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R1_SearchProduct_PO r1_SearchPO = PageFactory.initElements(getDriver(), R1_SearchProduct_PO.class);
	R2_Cart_PO cartR2PageObj = PageFactory.initElements(driver, R2_Cart_PO.class);
	R1_PLCC_Mobile_PO plccMobile_PO = PageFactory.initElements(driver, R1_PLCC_Mobile_PO.class);

	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);

	/*The below method should be written on the page level*/
	/**Modified by Rahul Singh**/
	@When("^user enters \"(.*?)\" in the search box plcc$")
	public void user_enters_in_the_search_box_plcc(String arg1) throws Throwable {
		//Thread.sleep(5000);
		assertTrue(isDisplayed(plccLandingPageObjects.searchBox));
		plccPageObjects.enterSearchItem(arg1);
		
		//waitForElement(plccLandingPageObjects.searchBox);
	}

	@When("^user enters \"(.*?)\" in the search box plcc for mobile$")
	public void user_enters_in_the_search_box_plcc_for_mobile(String arg1) throws Throwable {
		try {
			Thread.sleep(5000);
			plccPageObjects.enterSearchItemMobile(arg1);
			assertTrue(isDisplayed(plccMobile_PO.searchInputfieldMobile));
			waitForElement(plccMobile_PO.searchInputfieldMobile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("^user click on search icon for mobile$")
	public void user_click_on_search_icon_for_mobile() throws Throwable {
		plccMobile_PO.searchIconMobile.click();
		Thread.sleep(3000);
	}

	/*
	 * @When("^user click on Add to cart button plcc$") public void
	 * user_click_on_Add_to_cart_button_plcc() throws Throwable { //
	 * pdpPageObj.addToCartAvailability(); Thread.sleep(pageLoadWaitTime);
	 * genericPO.addToCartButton.click(); waitForElement(pdpPageObj.btnAddToCart);
	 * assertTrue(clickOnButton(pdpPageObj.btnAddToCart)); }
	 */

	@When("^user click on Add to Cart button$")
	public void user_click_on_Add_to_Cart_button() throws Throwable {
		waitForPageLoad(getDriver());
		pdpPageObj.addToCartAvailability();
		waitForElement(pdpPageObj.btnAddToCart);
		assertTrue(clickOnButton(pdpPageObj.btnAddToCart));
		Thread.sleep(7000);
	}

	@Given("^user click on Add an Item to cart Button$")
	public void user_click_on_Add_an_Item_to_cart_Button() throws Throwable {
		try {
			waitForElement(pdpPageObj.AddToCartBtn);
			assertTrue(clickOnButton(pdpPageObj.AddToCartBtn));
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("Exception Message:" + e.getMessage());
		}
	}

	/**Modified by Rahul Singh**/
	@When("^user click on search icon$")
	public void user_click_on_search_icon() throws Throwable {
		try {
			plccLandingPageObjects.verifyPresenceOfSearchIcon();
			clickOnButton(plccLandingPageObjects.searchIcon);
		//	plccLandingPageObjects.searchIcon.click();
			
			//driver.navigate().refresh();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.navigate().refresh();
		//Thread.sleep(5000);
	}

	@When("^user click on checkout from ATC pop up plcc$")
	public void user_click_on_checkout_from_ATC_pop_up_plcc() throws Throwable {
		genericPO.clickOnCheckoutButton();
		Thread.sleep(14000);
		// Common_Web_PLCC.waitUntilElePresent(driver, searchBox, ELEMWAITTIME_SLOW);
	}

	@When("^user selects credit card radio button$")
	public void user_selects_credit_card_radio_button() throws Throwable {
		genericPO.verifyPresenceOfCreditCardRadioButton();
		r2CheckOutPo.CreditCard_radioBtn.click();
	}

	@When("^user add \"(.*?)\" details on payment method for \"(.*?)\" user$")
	public void user_add_details_on_payment_method_for_user(String arg1, String arg2) throws Throwable {
		boolean userWithoutExistingPaymentDetails = false;
		if (arg2.equalsIgnoreCase("newly registered") | arg2.equalsIgnoreCase("guest")
				| arg2.equalsIgnoreCase("unauthenticated"))
			userWithoutExistingPaymentDetails = true;

		if (!(userWithoutExistingPaymentDetails)) {
			if (isDisplayed(r2CheckOutPo.EditPayment_Link)) {
				clickOnButton(r2CheckOutPo.EditPayment_Link);
			}
			if (isDisplayed(r2CheckOutPo.btnRemoveGiftCard)) {
				clickOnButton(r2CheckOutPo.btnRemoveGiftCard);
			}
		}

		if (arg1.toLowerCase().contains(("credit card"))) {
			String creditCardNumber;
			String cvv = "CVV";
			//// Credit card to be picked
			if (arg1.toLowerCase().contains(("visa")))
				creditCardNumber = "CardVISA";
			else if (arg1.toLowerCase().contains(("master")))
				creditCardNumber = "CardMaster";
			else if (arg1.toLowerCase().contains(("amex"))) {
				creditCardNumber = "CardAmex";
				cvv = "FourDigitCVV";
			}

			// *----author:Vidya Siddaramappa ---*//
			else if (arg1.toLowerCase().contains(("plcc card"))) {
				creditCardNumber = "CardPlcc";
				// *----author:Vidya Siddaramappa ---*//

			} else if (arg1.toLowerCase().contains(("discover")))
				creditCardNumber = "CardDiscover";
			else
				creditCardNumber = "CreditCardNumber";

			boolean chooseCreditCard = false;
			if (!(userWithoutExistingPaymentDetails)) {
				if (!(isDisplayed(r2CheckOutPo.chooseCreditcard_Dd)))
					chooseCreditCard = true;
			}

			if (chooseCreditCard | userWithoutExistingPaymentDetails) {
				setInputText(r2CheckOutPo.CreditCardNumber_Input, webPropHelper.getTestDataProperty(creditCardNumber));
				setInputText(r2CheckOutPo.txtExpirationDateInput, webPropHelper.getTestDataProperty("ExpDate"));
				setInputText(r2CheckOutPo.Cvv_Input, webPropHelper.getTestDataProperty(cvv));
				if (arg2.equalsIgnoreCase("guest") | arg2.equalsIgnoreCase("unauthenticated")) {
					setInputText(r2CheckOutPo.EmailAddressforOrderConfirmation_Input,
							r2MyAccountPO.generateRandomEmailId());
				}

				assertTrue(clickOnButton(r2CheckOutPo.ReviewOrder_Btn));
			}
			if (!(userWithoutExistingPaymentDetails)) {
				if (isDisplayed(r2CheckOutPo.ReviewOrder_Btn))
					assertTrue(clickOnButton(r2CheckOutPo.ReviewOrder_Btn));
			}
			Thread.sleep(Constants.thread_medium);

		} else if (arg1.equalsIgnoreCase("gift card")) {
			boolean chooseGiftCard = true;
			if (!(userWithoutExistingPaymentDetails)) {
				if (isDisplayed(r2CheckOutPo.plusIconGiftCard)) {
					assertTrue(clickOnButton(r2CheckOutPo.plusIconGiftCard));
					if (isDisplayed((r2CheckOutPo.inputGiftcardNumber))) {
						setInputText(r2CheckOutPo.inputGiftcardNumber,
								webPropHelper.getTestDataProperty("GiftCardNumberForOrderPlacement"));

					} else if (isDisplayed(r2CheckOutPo.btnCheckoutApply)) {
						chooseGiftCard = false;
						clickOnButton(r2CheckOutPo.btnCheckoutApply);

					}
				}
			} else {
				assertTrue(clickOnButton(r2CheckOutPo.plusIconGiftCard));
				setInputText(r2CheckOutPo.inputGiftcardNumber,
						webPropHelper.getTestDataProperty("GiftCardNumberForOrderPlacement"));
			}

			if (chooseGiftCard) {
				setInputText(r2CheckOutPo.inputPinNumber,
						webPropHelper.getTestDataProperty("GiftCardPinForOrderPlacement"));
				waitForElement(r2CheckOutPo.btnCheckoutApply);
				assertTrue(clickOnButton(r2CheckOutPo.btnCheckoutApply));
				waitForElement(r2CheckOutPo.txtGiftCardAppliedSuccessMessage);
				if (arg2.equalsIgnoreCase("guest") | arg2.equalsIgnoreCase("unauthenticated")) {
					setInputText(r2CheckOutPo.EmailAddressforOrderConfirmation_Input,
							r2MyAccountPO.generateRandomEmailId());
				}
			}

			Thread.sleep(Constants.thread_medium);
			if (isDisplayed(r2CheckOutPo.ReviewOrder_Btn)) {
				assertTrue(clickOnButton(r2CheckOutPo.ReviewOrder_Btn));
			}

		} else if (arg1.equalsIgnoreCase("PayPal")) {
			clickOnButton(r2CheckOutPo.PayPal_radioBtn);
			Thread.sleep(Constants.thread_low);
			driver.switchTo().frame(r2_r1_fun_po.paypalCheckoutFrame);
			assertTrue(clickOnButton(r2CheckOutPo.PayPalCheckOut_Btn));
			Thread.sleep(Constants.thread_highest);
			Set<String> set = driver.getWindowHandles();
			Iterator<String> it = set.iterator();
			String parentWindow = it.next();
			String childWindow = it.next();
			driver.switchTo().window(childWindow);
			waitForPageLoad(driver);

			if (isDisplayed(r2CheckOutPo.PaypalClose_icon))
				assertTrue(clickOnButton(r2CheckOutPo.PaypalClose_icon));
			if (isDisplayed(r2CheckOutPo.PaypalScreenLogin_Btn))
				assertTrue(clickOnButton(r2CheckOutPo.PaypalScreenLogin_Btn));

			// assertTrue(clickOnButton(r2CheckOutPo.PaypalScreenLogin_Btn));
			waitForElement(r2CheckOutPo.PaypalEmail_Input);
			assertTrue(clickOnButton(r2CheckOutPo.PaypalEmail_Input));
			setInputText(r2CheckOutPo.PaypalEmail_Input, webPropHelper.getTestDataProperty("PayPalEmail"));
			assertTrue(clickOnButton(r2CheckOutPo.PaypalNext_Btn));
			waitForElement(r2CheckOutPo.PaypalPassWord_Input);
			setInputText(r2CheckOutPo.PaypalPassWord_Input, webPropHelper.getTestDataProperty("PayPalPassword"));
			assertTrue(clickOnButton(r2CheckOutPo.PaypalLogin_Btn));
			waitForPageLoad(driver);
			assertTrue(clickOnButton(r2CheckOutPo.PayPalContinue_Btn));
			driver.switchTo().window(parentWindow);
		}
		waitForElement(r2CheckOutPo.btnPlaceOrderPaymentPage);
	}

	@When("^user clicks on checkout button and navigates to checkout page$")
	public void user_clicks_on_checkout_button_and_navigates_to_checkout_page() throws Throwable {
		try {
			genericPO.verifyPresenceOfCheckoutPage();
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	@When("^user expect credit card text field is present$")
	public void user_expect_credit_card_text_field_is_present() throws Throwable {
		genericPO.verifyPresenceOfCreditCardTextField();
	}

	@When("^user enter plcc card \"(.*?)\"$")
	public void user_enter_plcc_card(String arg1) throws Throwable {
		genericPO.enterCardBinNumber(arg1);
		assertTrue(isDisplayed(genericPO.CreditCardNumber_Input));
		waitForElement(genericPO.CreditCardNumber_Input);
	}

	@Then("^user expect element plcc credit card image on credit card text field to present$")
	public void user_expect_element_plcc_credit_card_image_on_credit_card_text_field_to_present() throws Throwable {
		genericPO.verifyPresenceOfPlccCardOnCreditCardTxtField();
	}

	@When("^user enter visa card \"(.*?)\"$")
	public void user_enter_visa_card(String arg1) throws Throwable {
		genericPO.enterCardBinNumber(arg1);
		assertTrue(isDisplayed(genericPO.CreditCardNumber_Input));
		waitForElement(genericPO.CreditCardNumber_Input);
	}

	@Then("^user expect element visa card image on credit card text field to present$")
	public void user_expect_element_visa_card_image_on_credit_card_text_field_to_present() throws Throwable {
		genericPO.verifyPresenceOfVisaCardImageOnCCField();
	}

	@When("^user enter master card \"(.*?)\"$")
	public void user_enter_master_card(String arg1) throws Throwable {
		genericPO.enterCardBinNumber(arg1);
		assertTrue(isDisplayed(genericPO.CreditCardNumber_Input));
		waitForElement(genericPO.CreditCardNumber_Input);
	}

	@Then("^user expect element master card image on credit card text field to present$")
	public void user_expect_element_master_card_image_on_credit_card_text_field_to_present() throws Throwable {
		genericPO.verifyPresenceOfVisaCardImageOnCCField();
	}

	@When("^user enter amex card \"(.*?)\"$")
	public void user_enter_amex_card(String arg1) throws Throwable {
		genericPO.enterCardBinNumber(arg1);
		assertTrue(isDisplayed(genericPO.CreditCardNumber_Input));
		waitForElement(genericPO.CreditCardNumber_Input);
	}

	@When("^user enter discover card \"(.*?)\"$")
	public void user_enter_discover_card(String arg1) throws Throwable {
		genericPO.enterCardBinNumber(arg1);
		assertTrue(isDisplayed(genericPO.CreditCardNumber_Input));
		waitForElement(genericPO.CreditCardNumber_Input);
	}

	@Then("^user expect element amex card image on credit card text field to present$")
	public void user_expect_element_amex_card_image_on_credit_card_text_field_to_present() throws Throwable {
		genericPO.verifyPresenceOfAmexCardImageOnCCField();
	}

	@Then("^user expect element discover card image on credit card text field to present$")
	public void user_expect_element_discover_card_image_on_credit_card_text_field_to_present() throws Throwable {
		genericPO.verifyPresenceOfDiscoveCardImageOnCCField();
	}

	@Then("^user expect element invalid card type error message to present$")
	public void user_expect_element_invalid_card_type_error_message_to_present() throws Throwable {
		genericPO.verifyPresenceOfInvalidErrorMessageOnCCField();
	}

	@When("^user expect element credit card text field is present$")
	public void user_expect_element_credit_card_text_field_is_present() throws Throwable {
		genericPO.verifyPresenceOfCreditCardTextField();
	}

	@Then("^user expect selected credit card image on credit card text field$")
	public void user_expect_selected_credit_card_image_on_credit_card_text_field() throws Throwable {
		genericPO.verifyPresenceOfCreditCardImageOnCCField();
	}

	@When("^user click on edit my cart link$")
	public void user_click_on_edit_my_cart_link() throws Throwable {
		try {
			genericPO.verifyPresenceOfEditMyCartLink();
			r2CheckOutPo.btnEditCart.click();
		} catch (Exception e) {
			logger.debug("Exception Message: " + e.getMessage());
		}
	}

	@When("^user click on remove from cart$")
	public void user_click_on_remove_from_cart() throws Throwable {
		try {
			genericPO.verifyPresenceOfRemoveFromCartLink();
			r2CheckOutPo.AS_btnRemoveFromCart.click();
		} catch (Exception e) {
			logger.debug("Exception Message: " + e.getMessage());
		}

	}

	@When("^user click on expiry date text field$")
	public void user_click_on_expiry_date_text_field() throws Throwable {
		genericPO.verifyPresenceOfExpiryTextField();
		r2CheckOutPo.txtExpirationDateInput.click();
	}

	@Then("^user expect element Unrecognized card number to be present$")
	public void user_expect_element_Unrecognized_card_number_to_be_present() throws Throwable {
		genericPO.verifyPresenceOfInvalidCardNumberErrorMsg();
	}

	@Then("^Verify below Sub/Main Module of MyAccount$")
	public void verify_below_Sub_Main_Module_of_MyAccount(DataTable arg1) throws Throwable {
		String currentElement = null;
		try {
			List<List<String>> elements = arg1.raw();
			for (int i = 1; i < elements.size(); i++) {
				currentElement = elements.get(i).get(0);
				// ===============================================================================
				//// Home Page
				// ===============================================================================
				if (currentElement.equalsIgnoreCase("UnauthenticatedUserMyAccountBtn"))
					assertTrue(isDisplayed(r2MyAccountPo.signIn));
				else if (currentElement.equalsIgnoreCase("LoggedInUserMyAccountBtn"))
					assertTrue(isDisplayed(r2MyAccountPo.lnkMyAccount));
				// ===============================================================================
				//// sign in or login page
				// ===============================================================================
				else if (currentElement.equalsIgnoreCase("SignInPage_EmailAddress_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.inputEmailAddress_SignIn));
				else if (currentElement.equalsIgnoreCase("SignInPage_Password_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.password));
				else if (currentElement.equalsIgnoreCase("SignInPage_SignIn_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.logIn));
				else if (currentElement.equalsIgnoreCase("SignInPage_SignUp_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.lnkSignUp));
				else if (currentElement.equalsIgnoreCase("SignInPage_ForgotYourPassword_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.btnForgotYourPassword));
				// ===============================================================================
				////// forgot password
				// ===============================================================================
				else if (currentElement.equalsIgnoreCase("ForgotPasswordPage_EmailAddress_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.emailAddress));
				else if (currentElement.equalsIgnoreCase("ForgotPasswordPage_Submit_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.btnSubmit));
				// ===============================================================================
				///// Address
				// ===============================================================================
				else if (currentElement.equalsIgnoreCase("MyAccountPage_Address_lnk"))
					assertTrue(isDisplayed(r2MyAccountPo.addressBook));
				else if (currentElement.equalsIgnoreCase("AddressPage_FirstName_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.adr_inpFirstName));
				else if (currentElement.equalsIgnoreCase("AddressPage_LastName_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.adr_inpLastName));
				else if (currentElement.equalsIgnoreCase("AddressPage_PhoneNumber_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.AddressBook_inpPhoneNumber));
				else if (currentElement.equalsIgnoreCase("AddressPage_Address_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.adr_inpAddress1));
				else if (currentElement.equalsIgnoreCase("AddressPage_ZipCode_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.adr_inpzipCode));
				else if (currentElement.equalsIgnoreCase("AddressPage_City_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.adr_inpCity));
				else if (currentElement.equalsIgnoreCase("AddressPage_State_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.btnState));
				else if (currentElement.equalsIgnoreCase("AddressPage_SetAsDefault_chkBox"))
					assertTrue(isDisplayed(r2MyAccountPo.chkBoxSetAsDefault));
				else if (currentElement.equalsIgnoreCase("AddressPage_AddressBookHeader_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.headerAddressBook));
				else if (currentElement.equalsIgnoreCase("AddressPage_Add_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.btnAddInAddressField));
				else if (currentElement.equalsIgnoreCase("AddressPage_AddNewAddress_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.addNewAddressBtn));
				else if (currentElement.equalsIgnoreCase("AddressPage_Cancel_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.btnCancelInAddCreditCard));
				else if (currentElement.equalsIgnoreCase("AddressPage_Edit_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.btnEdit));
				else if (currentElement.equalsIgnoreCase("AddressPage_SetAsDefault_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.setAsDefaultBtn));
				else if (currentElement.equalsIgnoreCase("AddressPage_Default_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.default_txt));
				else if (currentElement.equalsIgnoreCase("BurgerMenu_MyAccount_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.myAccount_txt_Mobile));
				else if (currentElement.equalsIgnoreCase("myAccountPage_AddNewAddressPluIcon_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.myAccountPage_AddNewAddressPluIcon_btn));

				// ===============================================================================
				//// Payment
				// ===============================================================================
				else if (currentElement.equalsIgnoreCase("PaymentPage_Payment_lnk_web"))
					assertTrue(isDisplayed(r2MyAccountPo.lnkPayment));
				else if (currentElement.equalsIgnoreCase("PaymentPage_Payment_lnk_mobile"))
					assertTrue(isDisplayed(r2MyAccountPo.lnkPayment_Mobile));
				else if (currentElement.equalsIgnoreCase("PaymentPage_PaymentsHeader_label"))
					assertTrue(isDisplayed(r2MyAccountPo.headerPayments));
				else if (currentElement.equalsIgnoreCase("PaymentPage_CreditCardHeader_label"))
					assertTrue(isDisplayed(r2MyAccountPo.headerCreditCards));
				else if (currentElement.equalsIgnoreCase("PaymentPage_GiftCardHeader_label"))
					assertTrue(isDisplayed(r2MyAccountPo.headerGiftCards));
				else if (currentElement.equalsIgnoreCase("PaymentPage_YouhaveNoCreditCardsListed_label"))
					assertTrue(isDisplayed(r2MyAccountPo.txtNoCreditCardListed));
				else if (currentElement.equalsIgnoreCase("PaymentPage_YouHaveNoGiftcardsListed_label"))
					assertTrue(isDisplayed(r2MyAccountPo.txtNoGiftCardListed));
				else if (currentElement.equalsIgnoreCase("PaymentPage_AddNewCreditCard_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.btnAddNewCreditCard));
				else if (currentElement.equalsIgnoreCase("PaymentPage_AddNewGiftCard_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.btnAddNewGiftCard));
				else if (currentElement.equalsIgnoreCase("PaymentPage_CrediCardRemoved_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtCreditCardRemoved));
				else if (currentElement.equalsIgnoreCase("PaymentPage_CrediCardList_txt"))
					for (WebElement txtAddedCreditCards : r2MyAccountPo.txtCreditCard) {
						assertTrue(isDisplayed(txtAddedCreditCards));
					}
				else if (currentElement.equalsIgnoreCase("PaymentPage_InvalidFirstName_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtInvalidFirstNameError));
				else if (currentElement.equalsIgnoreCase("PaymentPage_InvalidLastName_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtInvalidLastNameError));

				else if (currentElement.equalsIgnoreCase("PaymentPage_RemoveGiftCards_btnList"))
					for (WebElement btnRemove : r2MyAccountPo.btnRemoveGiftCardList) {
						assertTrue(isDisplayed(btnRemove));
					}
				else if (currentElement.equalsIgnoreCase("PaymentPage_AddedGiftCards_txtList"))
					for (WebElement txtAddedGiftCard : r2MyAccountPo.txtAddedGiftCardList) {
						assertTrue(isDisplayed(txtAddedGiftCard));
					}
				else if (currentElement.equalsIgnoreCase("PaymentPage_AddNewGiftCards_plusIcon"))
					assertTrue(isDisplayed(r2MyAccountPo.btnAddGiftCardPlusIcon));
				else if (currentElement.equalsIgnoreCase("PaymentPage_CreditCardDetails"))
					assertTrue(isDisplayed(r2MyAccountPo.txtCreditCardDetails));
				else if (currentElement.equalsIgnoreCase("PaymentPage_SetAsDefault_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.setAsDefaultBtn));

				// ===============================================================================
				//// Profile
				// ===============================================================================
				else if (currentElement.equalsIgnoreCase("ProfilePage_HelloMessage_label"))
					assertTrue(isDisplayed(r2MyAccountPo.txtHelloMessage));
				else if (currentElement.equalsIgnoreCase("ProfilePage_ProfileHeader_label"))
					assertTrue(isDisplayed(r2MyAccountPo.headerProfile));
				else if (currentElement.equalsIgnoreCase("ProfilePage_EditIcon_lnk"))
					assertTrue(isDisplayed(r2MyAccountPo.lnkEdit));
				else if (currentElement.equalsIgnoreCase("ProfilePage_ProfileInformation_label"))
					assertTrue(isDisplayed(r2MyAccountPo.headerProileInformation));
				else if (currentElement.equalsIgnoreCase("ProfilePage_Name_label"))
					assertTrue(isDisplayed(r2MyAccountPo.labelName));
				else if (currentElement.equalsIgnoreCase("ProfilePage_Name_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtName));
				else if (currentElement.equalsIgnoreCase("ProfilePage_Email_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtEmail));
				else if (currentElement.equalsIgnoreCase("ProfilePage_Email_label"))
					assertTrue(isDisplayed(r2MyAccountPo.labelEmail));
				else if (currentElement.equalsIgnoreCase("ProfilePage_PasswordHeader_label"))
					assertTrue(isDisplayed(r2MyAccountPo.headerPassword));
				else if (currentElement.equalsIgnoreCase("ProfilePage_ChangePassword_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.btnChangePassword));
				else if (currentElement.equalsIgnoreCase("ProfilePage_ReceiveEmailNotifications_checkbox"))
					assertTrue(isDisplayed(r2MyAccountPo.chkReceiveNotifications));
				else if (currentElement.equalsIgnoreCase("MyAccountPage_Profile_lnk_Mobile"))
					assertTrue(isDisplayed(r2MyAccountPo.lnkProfile_Mobile));
				else if (currentElement.equalsIgnoreCase("MyAccountPage_Profile_cta"))
					assertTrue(isDisplayed(r2MyAccountPo.myAccountProfilecta));
				else if (currentElement.equalsIgnoreCase("ProfilePage_MaskedPassword"))
					assertTrue(isDisplayed(r2MyAccountPo.maskedPasswordInProfile));
				else if (currentElement.equalsIgnoreCase("ChangePasswordPage_toolTip_Btn"))
					assertTrue(isDisplayed(r2MyAccountPo.ChangePasswordPage_toolTip_Btn));

				// ===============================================================================
				//// Profile > Edit Profile
				// ===============================================================================
				else if (currentElement.equalsIgnoreCase("EditProfilePage_EditProfileHeader_label"))
					assertTrue(isDisplayed(r2MyAccountPo.headerEditProfile));
				else if (currentElement.equalsIgnoreCase("EditProfilePage_FirstName_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtFirstName));
				else if (currentElement.equalsIgnoreCase("EditProfilePage_LastName_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtLastName));
				else if (currentElement.equalsIgnoreCase("EditProfilePage_NewEmail_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtNewEmail));
				else if (currentElement.equalsIgnoreCase("EditProfilePage_ConfirmEmail_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtConfirmEmail));
				else if (currentElement.equalsIgnoreCase("EditProfilePage_Update_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.btnUpdate));
				else if (currentElement.equalsIgnoreCase("EditProfilePage_Cancel_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.btnCancelGiftCard));
				// ===============================================================================
				//// Profile > Change Password
				// ===============================================================================
				else if (currentElement.equalsIgnoreCase("ChangePassworPage_CurrentPassword_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.txtCurrentPassword));
				else if (currentElement.equalsIgnoreCase("ChangePassworPage_NewPassword_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtNewPassword));
				else if (currentElement.equalsIgnoreCase("ChangePassworPage_Update_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.btnUpdate));
				else if (currentElement.equalsIgnoreCase("ChangePassworPage_Cancel_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.myAccount_ChangePassword_Cancel_btn));
				// ===============================================================================
				//// Payment > Add new credit card
				// ===============================================================================
				else if (currentElement.equalsIgnoreCase("AddCreditCardPage_BillingInformationHeader_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.headerBillingInformation));
				else if (currentElement.equalsIgnoreCase("AddCreditCardPage_AddNewCreditCardsHeader_label"))
					assertTrue(isDisplayed(r2MyAccountPo.headerAddNewCreditCards));
				else if (currentElement.equalsIgnoreCase("AddCreditCardPage_CreditCardNumber_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtCreditCardNumber));
				else if (currentElement.equalsIgnoreCase("AddCreditCardPage_CardExpiryDate_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtExpiryDate));
				else if (currentElement.equalsIgnoreCase("AddCreditCardPage_CardCVV_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtCVV));
				else if (currentElement.equalsIgnoreCase("AddCreditCardPage_FirstName_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtFirstNameInAddCreditCard));
				else if (currentElement.equalsIgnoreCase("AddCreditCardPage_LastName_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtLastNameInAddCreditCard));
				else if (currentElement.equalsIgnoreCase("AddCreditCardPage_Address_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtAddressInAddCreditCard));
				else if (currentElement.equalsIgnoreCase("AddCreditCardPage_ZipCode_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtZipCodeInAddCreditCard));
				else if (currentElement.equalsIgnoreCase("AddCreditCardPage_City_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtCityInAddCreditCard));
				else if (currentElement.equalsIgnoreCase("AddCreditCardPage_State_dropdown"))
					assertTrue(isDisplayed(r2MyAccountPo.btnState));
				else if (currentElement.equalsIgnoreCase("AddCreditCardPage_PhoneNumber_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtPhoneNumberInAddCreditCard));
				else if (currentElement.equalsIgnoreCase("AddCreditCardPage_Add_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.PaymentPage_AddCreditCard_Add_btn));
				else if (currentElement.equalsIgnoreCase("AddCreditCardPage_Cancel_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.btnCancelInAddCreditCard));
				else if (currentElement.equalsIgnoreCase("AddCreditCardPage_CVV_toolTip"))
					assertTrue(isDisplayed(r2MyAccountPo.iconCVVToolTip));
				else if (currentElement.equalsIgnoreCase("AddCreditCardPage_IconCVV_toolTipFlyout"))
					assertTrue(isDisplayed(r2MyAccountPo.iconCVVToolTipFlyout));
				else if (currentElement.equalsIgnoreCase("AddCreditCardPage_InlineErrorMessage_txt"))
					for (WebElement inlineError : r2MyAccountPo.inlineErrorMsg) {
						assertTrue(isDisplayed(inlineError));
					}
				else if (currentElement.equalsIgnoreCase("AddCreditCardPage_AddNewCreditCard"))
					assertTrue(isDisplayed(r2MyAccountPo.addNewCardCta));

				// ===============================================================================
				//// Payment > Add new gift card
				// ===============================================================================
				else if (currentElement.equalsIgnoreCase("AddGiftCardPage_GiftCardNumber_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtGiftCardNumber));
				else if (currentElement.equalsIgnoreCase("AddGiftCardPage_PIN_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtGifCardPin));
				else if (currentElement.equalsIgnoreCase("AddGiftCardPage_Cancel_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.btnCancelGiftCard));
				else if (currentElement.equalsIgnoreCase("AddGiftCardPage_Add_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.btnAddGiftCard));
				else if (currentElement.equalsIgnoreCase("AddGiftCardPage_Pin_toolTip"))
					assertTrue(isDisplayed(r2MyAccountPo.AddGiftCardPage_Pin_toolTip));

				// ===============================================================================
				//// Wishlist
				// ===============================================================================
				else if (currentElement.equalsIgnoreCase("WishlistPage_Wishlist_lnk"))
					assertTrue(isDisplayed(r2MyAccountPo.lnkWishlist));
				else if (currentElement.equalsIgnoreCase("WishlistPage_CreateANewWishlist_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.btnCreateNewWishlist));
				else if (currentElement.equalsIgnoreCase("WishlistPage_WishListName_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtWishListName));
				else if (currentElement.equalsIgnoreCase("WishlistPage_CreateWishList_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.btnCreateWishList));
				else if (currentElement.equalsIgnoreCase("Wishlist_Mobile_lnk"))
					assertTrue(isDisplayed(r2MyAccountPo.Wishlist_Mobile_lnk));
				else if (currentElement.equalsIgnoreCase("WishlistItems_lnk"))
					assertTrue(isDisplayed(r2MyAccountPo.WishlistItems_lnk));
				else if (currentElement.equalsIgnoreCase("DeleteList_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.DeleteList_btn));
				else if (currentElement.equalsIgnoreCase("DeleteWishList_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.DeleteWishList_btn));
				else if (currentElement.equalsIgnoreCase("Wishlist_icn"))
					assertTrue(isDisplayed(r2MyAccountPo.Wishlist_icn));
				else if (currentElement.equalsIgnoreCase("browse_products_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.browse_products_btn));
				else if (currentElement.equalsIgnoreCase("Wishlist_createlist_lnk"))
					assertTrue(isDisplayed(r2MyAccountPo.Wishlist_createlist_lnk));
				else if (currentElement.equalsIgnoreCase("Rename_list_lnk"))
					assertTrue(isDisplayed(r2MyAccountPo.Rename_list_lnk));
				else if (currentElement.equalsIgnoreCase("Rename_list_lnk_mob"))
					assertTrue(isDisplayed(r2MyAccountPo.Rename_list_lnk_mob));
				else if (currentElement.equalsIgnoreCase("Wishlist_name_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.Wishlist_name_txt));
				else if (currentElement.equalsIgnoreCase("Keep_Wishlist_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.Keep_Wishlist_btn));
				else if (currentElement.equalsIgnoreCase("Share_list_lnk"))
					assertTrue(isDisplayed(r2MyAccountPo.Share_list_lnk));
				else if (currentElement.equalsIgnoreCase("Email_input_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.Email_input_txt));
				else if (currentElement.equalsIgnoreCase("Message_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.Message_txt));
				else if (currentElement.equalsIgnoreCase("Share_Wishlist_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.Share_Wishlist_btn));
				else if (currentElement.equalsIgnoreCase("Cancel_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.Cancel_btn));
				else if (currentElement.equalsIgnoreCase("WhishList_Remove_Lnk"))
					assertTrue(isDisplayed(r2MyAccountPo.WhishList_Remove_Lnk));
				else if (currentElement.equalsIgnoreCase("WhishList_Remove_Lnk_M"))
					assertTrue(isDisplayed(r2MyAccountPo.WhishList_Remove_Lnk_M));
				else if (currentElement.equalsIgnoreCase("WishList_Product_Img"))
					assertTrue(isDisplayed(r2MyAccountPo.WishList_Product_Img));
				else if (currentElement.equalsIgnoreCase("WishList_Product_Eyebrow"))
					assertTrue(isDisplayed(r2MyAccountPo.WishList_Product_Eyebrow));
				else if (currentElement.equalsIgnoreCase("WishList_Product_Tittle"))
					assertTrue(isDisplayed(r2MyAccountPo.WishList_Product_Tittle));
				else if (currentElement.equalsIgnoreCase("WishList_Product_Review"))
					assertTrue(isDisplayed(r2MyAccountPo.WishList_Product_Review));
				else if (currentElement.equalsIgnoreCase("WishList_Product_Price"))
					assertTrue(isDisplayed(r2MyAccountPo.WishList_Product_Price));
				else if (currentElement.equalsIgnoreCase("Wishlist_MoveToACart_Btn"))
					assertTrue(isDisplayed(r2MyAccountPo.Wishlist_MoveToACart_Btn));
				else if (currentElement.equalsIgnoreCase("Wishlist_Undo"))
					assertTrue(isDisplayed(r2MyAccountPo.Wishlist_Undo));

				// ===============================================================================
				//// Order
				// ===============================================================================
				else if (currentElement.equalsIgnoreCase("OrderPage_Order_lnk"))
					assertTrue(isDisplayed(r2MyAccountPo.lnkOrder));
				else if (currentElement.equalsIgnoreCase("OrderPage_OrdersHeader_label"))
					assertTrue(isDisplayed(r2MyAccountPo.headerOrder));
				else if (currentElement.equalsIgnoreCase("OrderPage_OrderNumber_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtOrderNumber));
				else if (currentElement.equalsIgnoreCase("OrderPage_ShippingZipCode_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtShippingZipCode));
				else if (currentElement.equalsIgnoreCase("OrderPage_BillingZipCode_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.BillindZipCode_Input));
				else if (currentElement.equalsIgnoreCase("OrderPage_Find_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.btnFind));
				else if (currentElement.equalsIgnoreCase("OrderPage_TotalNumberOfOrder_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.totalNumberOfOrder));
				else if (currentElement.equalsIgnoreCase("OrderPage_CustomerCare_lnk"))
					assertTrue(isDisplayed(r2MyAccountPo.customerCareLink));
				else if (currentElement.equalsIgnoreCase("OrderPage_OrdersDropDownNewestSorted"))
					assertTrue(isDisplayed(r2MyAccountPo.ordersDropDownNewest));
				else if (currentElement.equalsIgnoreCase("Order_View_Details_Btn"))
					assertTrue(isDisplayed(r2MyAccountPo.Order_View_Details_Btn));
				else if (currentElement.equalsIgnoreCase("Order_Cancel_lnk"))
					assertTrue(isDisplayed(r2MyAccountPo.Order_Cancel_lnk));
				else if (currentElement.equalsIgnoreCase("Order_Note_Txt"))
					assertTrue(isDisplayed(r2MyAccountPo.Order_Note_Txt));
				else if (currentElement.equalsIgnoreCase("Order_Back_To_Order_Lnk_M"))
					assertTrue(isDisplayed(r2MyAccountPo.Order_Back_To_Order_Lnk_M));
				else if (currentElement.equalsIgnoreCase("Order_Back_To_Order_Lnk"))
					assertTrue(isDisplayed(r2MyAccountPo.Order_Back_To_Order_Lnk));
				else if (currentElement.equalsIgnoreCase("Order_OrderTotal"))
					assertTrue(isDisplayed(r2MyAccountPo.txtTotal));
				else if (currentElement.equalsIgnoreCase("Order_Taxes_Price"))
					assertTrue(isDisplayed(r2MyAccountPo.TaxesPrice_Txt));
				else if (currentElement.equalsIgnoreCase("Order_Number_Txt"))
					assertTrue(isDisplayed(r2MyAccountPo.Order_Number_Txt));
				else if (currentElement.equalsIgnoreCase("Total_Items_Txt"))
					assertTrue(isDisplayed(r2MyAccountPo.Total_Items_Txt));
				else if (currentElement.equalsIgnoreCase("Cancel_Yes_Order_Btn"))
					assertTrue(isDisplayed(r2MyAccountPo.Cancel_Yes_Order_Btn));
				else if (currentElement.equalsIgnoreCase("Cancel_NO_Order_Btn"))
					assertTrue(isDisplayed(r2MyAccountPo.Cancel_NO_Order_Btn));
				else if (currentElement.equalsIgnoreCase("Order_Payment_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.Order_Payment_txt));
				else if (currentElement.equalsIgnoreCase("Order_Payment_Section"))
					assertTrue(isDisplayed(r2MyAccountPo.Order_Payment_Section));
				else if (currentElement.equalsIgnoreCase("MyAccount_OrderPage_OrderPlacedOnDate_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.MyAccount_OrderPage_OrderPlacedOnDate_txt));
				else if (currentElement.equalsIgnoreCase("MyAccount_OrderPage_OrderNumber_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.MyAccount_OrderPage_OrderNumber_txt));
				else if (currentElement.equalsIgnoreCase("MyAccount_OrderPage_OrderTotal_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.MyAccount_OrderPage_OrderTotal_txt));
				else if (currentElement.equalsIgnoreCase("MyAccount_OrderPage_OrderNumberInput"))
					assertTrue(isDisplayed(r2MyAccountPo.OrderNumber_Input));
				else if (currentElement.equalsIgnoreCase("MyAccount_OrderPage_OrderDetailsPage"))
					assertTrue(isDisplayed(r2MyAccountPo.Order_Details_page));
				else if (currentElement.equalsIgnoreCase("MyAccount_OrderDetailsPage_OrderDate"))
					assertTrue(isDisplayed(r2MyAccountPo.MyAccount_OrderDetailsPage_OrderDate));
				else if (currentElement.equalsIgnoreCase("MyAccount_OrderDetailsPage_OrderNumber"))
					assertTrue(isDisplayed(r2MyAccountPo.MyAccount_OrderDetailsPage_OrderNumber));
				else if (currentElement.equalsIgnoreCase("MyAccount_OrderDetailsPage_OrderStatus"))
					assertTrue(isDisplayed(r2MyAccountPo.MyAccount_OrderDetailsPage_OrderStatus));
				else if (currentElement.equalsIgnoreCase("MyAccount_OrderDetailsPage_ShippingAmount"))
					assertTrue(isDisplayed(r2MyAccountPo.MyAccount_OrderDetailsPage_ShippingAmount));
				else if (currentElement.equalsIgnoreCase("MyAccount_OrderDetailsPage_TaxAmount"))
					assertTrue(isDisplayed(r2MyAccountPo.TaxesPrice_Txt));
				else if (currentElement.equalsIgnoreCase("MyAccount_OrderDetailsPage_SubTotalAmount"))
					assertTrue(isDisplayed(r2MyAccountPo.MyAccount_OrderDetailsPage_SubTotalAmount));
				else if (currentElement.equalsIgnoreCase("MyAccount_OrderDetailsPage_PrintReceipt"))
					assertTrue(isDisplayed(r2MyAccountPo.Order_Print_Receipt));
				else if (currentElement.equalsIgnoreCase("MyAccount_OrderDetailsPage_OrderCancelLink"))
					assertTrue(isDisplayed(r2MyAccountPo.Order_Cancel_lnk));
				else if (currentElement.equalsIgnoreCase("MyAccount_OrderDetailsPage_ShippingAddress"))
					assertTrue(isDisplayed(r2MyAccountPo.MyAccount_OrderDetailsPage_ShippingAddress));
				else if (currentElement.equalsIgnoreCase("MyAccount_OrderDetailsPage_BillingInfo"))
					assertTrue(isDisplayed(r2MyAccountPo.headerBillingInformation));
				else if (currentElement.equalsIgnoreCase("MyAccount_OrderDetailsPage_EmailOrPhone"))
					assertTrue(isDisplayed(r2MyAccountPo.MyAccount_OrderDetailsPage_EmailOrPhone));
				else if (currentElement.equalsIgnoreCase("Order_Bopis_In_Store_Pickup_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.Order_Bopis_In_Store_Pickup_txt));
				else if (currentElement.equalsIgnoreCase("Order_Bopis_Pickup_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.Order_Bopis_Pickup_txt));
				else if (currentElement.equalsIgnoreCase("Order_Bopis_Store_Hours_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.Order_Bopis_Store_Hours_txt));
				else if (currentElement.equalsIgnoreCase("Order_Bopis_Pickup_Information_Person_Details_Txt"))
					assertTrue(isDisplayed(r2MyAccountPo.Order_Bopis_Pickup_Information_Person_Details_Txt));
				else if (currentElement.equalsIgnoreCase("Order_Bopis_View_Store_Btn"))
					assertTrue(isDisplayed(r2MyAccountPo.Order_Bopis_View_Store_Btn));
				else if (currentElement.equalsIgnoreCase("Order_Bopis_Print_Receipt_lnk"))
					assertTrue(isDisplayed(r2MyAccountPo.Order_Bopis_Print_Receipt_lnk));
				else if (currentElement.equalsIgnoreCase("Order_Bopis_InStore_Pickup_Msg"))
					assertTrue(isDisplayed(r2MyAccountPo.Order_Bopis_InStore_Pickup_Msg));
				else if (currentElement.equalsIgnoreCase("Order_Bopis_Item_Img"))
					assertTrue(isDisplayed(r2MyAccountPo.Order_Bopis_Item_Img));
				else if (currentElement.equalsIgnoreCase("Order_Bopis_Item_Details"))
					assertTrue(isDisplayed(r2MyAccountPo.Order_Bopis_Item_Details));

				// ===============================================================================
				//// SignUp
				// ===============================================================================
				else if (currentElement.equalsIgnoreCase("SignUp_FirstName_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.inputFirstName));
				else if (currentElement.equalsIgnoreCase("SignUp_LastName_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.inputLastName));
				else if (currentElement.equalsIgnoreCase("SignUp_EmailAddress"))
					assertTrue(isDisplayed(r2MyAccountPo.inputEmailAddress));
				else if (currentElement.equalsIgnoreCase("SignUp_Password"))
					assertTrue(isDisplayed(r2MyAccountPo.inputCreatePassword));
				else if (currentElement.equalsIgnoreCase("SignUp_ReceivePromotion_chkBx"))
					assertTrue(isDisplayed(r2MyAccountPo.inputOptIn));
				else if (currentElement.equalsIgnoreCase("SignUpPage_SignUp_btn"))
					assertTrue(isDisplayed(r2MyAccountPo.btnSignUp));
				else if (currentElement.equalsIgnoreCase("SignUpPage_AlreadyHaveAnAccount_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtAlreadyHaveAnAccountSignInNow));
				else if (currentElement.equalsIgnoreCase("SignUpPage_SignInNow_lnk"))
					assertTrue(isDisplayed(r2MyAccountPo.lnkSignInNow));
				else if (currentElement.equalsIgnoreCase("SignUpPage_PasswordMustContain_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtPasswordMustContainLabel));
				else if (currentElement.equalsIgnoreCase("SignUpPage_MinimumCharacters_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtCharactersMin));
				else if (currentElement.equalsIgnoreCase("SignUpPage_Cross_icon"))
					assertTrue(isDisplayed(r2MyAccountPo.iconCross));
				else if (currentElement.equalsIgnoreCase("SignUpPage_PasswordStrength_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtPasswordStrength));
				else if (currentElement.equalsIgnoreCase("SignUpPage_Weak_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtWeak));
				else if (currentElement.equalsIgnoreCase("SignUpPage_Strong_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.txtStrong));
				else if (currentElement.equalsIgnoreCase("SignUpPage_PasswordStrengthBar_txt"))
					assertTrue(isDisplayed(r2MyAccountPo.SignUpPage_PasswordStrengthBar_txt));
				// ===============================================================================
				//// MyAccount dropdown header
				// ===============================================================================
				else if (currentElement.equalsIgnoreCase("myAccount_MyAccountList_Orders_lnk"))
					assertTrue(isDisplayed(r2MyAccountPo.myAccount_MyAccountList_Orders_lnk));
				else if (currentElement.equalsIgnoreCase("myAccount_MyAccountList_AddressBook_lnk"))
					assertTrue(isDisplayed(r2MyAccountPo.myAccount_MyAccountList_AddressBook_lnk));
				else if (currentElement.equalsIgnoreCase("myAccount_MyAccountList_Payment_lnk"))
					assertTrue(isDisplayed(r2MyAccountPo.myAccount_MyAccountList_Payment_lnk));
				else if (currentElement.equalsIgnoreCase("myAccount_MyAccountList_Profile_lnk"))
					assertTrue(isDisplayed(r2MyAccountPo.myAccount_MyAccountList_Profile_lnk));

				else {
					logger.error("Element <" + currentElement + "> is not found in the SD list.");
					throw new NullArgumentException("Element <" + currentElement + "> is not found in the SD list.");
				}

			}
		} catch (NullPointerException e) {
			logger.error("This test-step has been failed");
		} catch (AssertionError a) {
			logger.error("Element " + currentElement + " is not present on screen.");
			throw new AssertionError("Element <" + currentElement + "> is not present on application page .");
		}
	}

	@Then("^user click on MyAccount and navigate to payment$")
	public void user_click_on_My_Account_and_navigate_to_payment() throws Throwable {

		if ("mobile".equalsIgnoreCase(testtype)) {
			clickOnButton(myAccountPo.myAccount_txt_Mobile);
			clickOnButton(r2_r1_fun_po.payment_M_Txt);

		} else {
			clickOnButton(myAccountPo.lnkMyAccount);
			clickOnButton(r2_r1_fun_po.payment_Txt);
		}
	}

	@Then("^user verifies the credit card saved and set as default$")
	public void user_verifies_the_credit_card_saved_and_set_as_default() throws Throwable {
		if (isDisplayed(r2MyAccountPo.txtDefaultDescription)) {

		} else {
			assertTrue(clickOnButton(r2MyAccountPo.addNewCardCta));
			setInputText(r2MyAccountPo.txtCreditCardNumber, webPropHelper.getTestDataProperty("ValidPLCCCard"));
			setInputText(r2MyAccountPo.txtFirstNameInAddCreditCard,
					webPropHelper.getTestDataProperty("UpdateFirstName"));
			setInputText(r2MyAccountPo.txtLastNameInAddCreditCard, webPropHelper.getTestDataProperty("UpdateLastName"));
			setInputText(r2MyAccountPo.txtAddressInAddCreditCard, webPropHelper.getTestDataProperty("UpdateAddress"));
			setInputText(r2MyAccountPo.txtZipCodeInAddCreditCard, webPropHelper.getTestDataProperty("UpdateZipcode"));
			setInputText(r2MyAccountPo.adr_inpPhoneNumber, webPropHelper.getTestDataProperty("UpdatePhoneNumber"));
			assertTrue(clickOnButton(r2MyAccountPo.PaymentPage_AddCreditCard_Add_btn));
			Thread.sleep(Constants.thread_medium);
			assertTrue(isDisplayed(r2MyAccountPo.txtDefaultDescription));
		}
	}

	@When("^user check element payment section to be present$")
	public void user_check_element_payment_section_to_be_present() throws Throwable {
		genericPO.verifyPresenceOfPaymentSectionOnCheckoutPage();
	}

	@Then("^user expect element saved card on payment section of checkout page to be present$")
	public void user_expect_element_saved_card_on_payment_section_of_checkout_page_to_be_present() throws Throwable {
		genericPO.verifyPresenceOfPaymentCardTypeLabel();
		String savedCard = genericPO.paymentCardTypeLabel.getText();
		logger.debug(savedCard + " Saved card is displayed on payment page");

	}

	@Then("^user click on gift card link$")
	public void user_click_on_gift_card_link() throws Throwable {
		try {
			genericPO.gitCardLink.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("^user enter Gift card \"(.*?)\"$")
	public void user_enter_Gift_card(String arg1) throws Throwable {
		
		try {
			if (genericPO.GiftCardNumber_Input.isDisplayed()) {
				genericPO.enterGiftCardNumber(arg1);
				Thread.sleep(8000);
				assertTrue(isDisplayed(genericPO.GiftCardNumber_Input));
				waitForElement(genericPO.GiftCardNumber_Input);

			} 
			else {
				genericPO.savedGiftCardDropDown.click();
				genericPO.addNewGiftCardOption.click();
				genericPO.enterGiftCardNumber(arg1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^user enter CVV number for Gift card \"(.*?)\"$")
	public void user_enter_CVV_number_for_Gift_card(String arg1) throws Throwable {
		try {
			genericPO.enterCVVNumber(arg1);
		} catch (Exception e) {
			logger.debug("Exception Message:" + e.getMessage());
		}
	}

	@When("^user click on gift card Apply Button$")
	public void user_click_on_gift_card_Apply_Button() throws Throwable {
		try {
			genericPO.giftCardApplyButton.click();
		} catch (Exception e) {
			logger.debug("Exception Message:" + e.getMessage());
		}
		Thread.sleep(3000);
	}

	@Then("^user expect element Gift card payment applied meesage to be present$")
	public void user_expect_element_Gift_card_payment_applied_meesage_to_be_present() throws Throwable {
		try {
			genericPO.verifyGiftCardPaymentAppliedMessageCheckoutPage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^user clears everything in cart$")
	public void user_clears_everything_in_cart() throws Throwable {
		try {
			genericPO.verifyPresenceOfCartIcon();
			clickOnButton(genericPO.cartIcon);
		//	genericPO.cartIcon.click();
			Thread.sleep(10000);
			r2CheckOutPo.AS_btnRemoveFromCart.click();
			Thread.sleep(10000);
		} catch (Exception e) {

			logger.debug("Exception Message: " + e.getMessage());
		}
	}

	@Given("^user click on Academy Logo Icon$")
	public void user_click_on_Academy_Logo_Icon() throws Throwable {
		try {

			// plccLandingPageObjects.imgAcademyLogo.click();
			WebElement element = driver.findElement(By.xpath("//img[@src='/content/dam/academysports/Logo.png']"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
			logger.debug("Academy Logo icon is displayed");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("^user handles adding new card \"(.*?)\" if already card is saved$")
	public void user_handles_adding_new_card_if_already_card_is_saved(String arg1) throws Throwable {
		try {
			
			if(genericPO.editLinkPaymentSection.isDisplayed())
			{
				genericPO.verifyPresenceOfEditLinkPaymentSectionCheckoutPage();
				clickOnButton(genericPO.editLinkPaymentSection);
				try {
					clickOnButton(genericPO.savedCardDropDown);
					clickOnButton(genericPO.addNewCardOption);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Thread.sleep(3000);
				genericPO.enterCardBinNumber(arg1);
			}
			else if (genericPO.CreditCardNumber_Input.isDisplayed()) {
				genericPO.enterCardBinNumber(arg1);
				Thread.sleep(8000);
				assertTrue(isDisplayed(genericPO.CreditCardNumber_Input));
			//	waitForElement(genericPO.CreditCardNumber_Input);
			} 
			else {
				clickOnButton(genericPO.savedCardDropDown);
				clickOnButton(genericPO.addNewCardOption);
				genericPO.enterCardBinNumber(arg1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Then("^user adds shipment address on checkout page for guest user plcc$")
	public void user_adds_shipment_address_on_checkout_page_for_guest_user_plcc() throws Throwable {
		setInputText(r2CheckOutPo.inputCheckoutFirstName, webPropHelper.getTestDataProperty("FirstName"));
		setInputText(r2CheckOutPo.inputCheckoutLasttName, webPropHelper.getTestDataProperty("LastName"));
		setInputText(r2CheckOutPo.inputCheckoutPhoneNumber, r2MyAccountPO.generateRandomMobileNumber());
		setInputText(r2CheckOutPo.inputCheckoutAddress, webPropHelper.getTestDataProperty("Address"));
		setInputText(r2CheckOutPo.inputCheckoutZipCode, webPropHelper.getTestDataProperty("zipcode"));
		assertTrue(clickOnButton(r2CheckOutPo.btnGoToShippingMethod));
		Thread.sleep(9000);
		clickOnButton(r2CheckOutPo.checkout_ShippingMethod_GoToPayment_btn);
	
	
	}
}
