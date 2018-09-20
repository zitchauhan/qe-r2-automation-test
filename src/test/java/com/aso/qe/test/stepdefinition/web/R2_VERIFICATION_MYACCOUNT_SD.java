package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import freemarker.template.utility.NullArgumentException;

import org.apache.log4j.Logger;

public class R2_VERIFICATION_MYACCOUNT_SD extends CommonActionHelper {

	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	private static final Logger logger = Logger.getLogger(R2_VERIFICATION_MYACCOUNT_SD.class);

	@Then("^Verify below Sub/Main Module of My Account$")
	public void Verify_below_Sub_Main_Module_of_My_Account(DataTable arg1) throws Throwable {

		try {
			List<List<String>> elements = arg1.raw();
			for (int i = 1; i < elements.size(); i++) {
				String currentElement = elements.get(i).get(0);
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
		}
	}

}
