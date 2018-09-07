Feature: Debug


	Scenario: Verify MyAccount
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in home page			|
		|BurgerMenu_MyAccount_txt				   			|
			
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		|SignInPage_SignIn_btn								|
		|SignInPage_ForgotYourPassword_txt					|
		|SignInPage_SignUp_btn								|
		
		
		|# Verify following elements in forgot password page|
		|ForgotPasswordPage_EmailAddress_txt				|
		|ForgotPasswordPage_Submit_btn						|
		
		|# Verify following elements in address page|
		|MyAccountPage_Address_lnk					|
		|AddressPage_AddNewAddress_btn				|
		|AddressPage_FirstName_txt				   	|
		|AddressPage_LastName_txt					|
		|AddressPage_PhoneNumber_txt				|
		|AddressPage_Address_txt 					|
		|AddressPage_ZipCode_txt			   		|
		|AddressPage_City_txt						|
		|AddressPage_State_txt						|
		|AddressPage_SetAsDefault_chkBox			|
		|AddressPage_AddressBookHeader_txt			|
		|AddressPage_Add_btn						|
		|AddressPage_Cancel_btn						|
		|AddressPage_Edit_btn						|
		|AddressPage_SetAsDefault_btn				|
		|AddressPage_Default_txt					|
		|##Below elements has same name in PO		|
		|myAccountPage_AddNewAddressPluIcon_btn		|	

				
		|#Verify following elements in Payment page		|
		|PaymentPage_Payment_lnk_mobile					|
		|PaymentPage_PaymentsHeader_label				|
		|PaymentPage_CreditCardHeader_label				|
		|PaymentPage_GiftCardHeader_label				|
		|PaymentPage_YouhaveNoCreditCardsListed_label	|
		|PaymentPage_YouHaveNoGiftcardsListed_label		|
		|PaymentPage_AddNewCreditCard_btn				|	
		|PaymentPage_AddNewGiftCard_btn					|
		|PaymentPage_RemoveGiftCards_btnList			|
		|PaymentPage_AddedGiftCards_txtList				|
		
		|#Verify following elements in Payments > Add new credit card section	|
		|AddCreditCardPage_BillingInformationHeader_txt							|
		|AddCreditCardPage_AddNewCreditCardsHeader_label						|
		|AddCreditCardPage_CreditCardNumber_txt									|
		|AddCreditCardPage_CardExpiryDate_txt									|
		|AddCreditCardPage_CardCVV_txt											|		
		|AddCreditCardPage_FirstName_txt										|
		|AddCreditCardPage_LastName_txt											|
		|AddCreditCardPage_Address_txt											|
		|AddCreditCardPage_ZipCode_txt											|
		|AddCreditCardPage_City_txt												|
		|AddCreditCardPage_State_dropdown										|
		|AddCreditCardPage_PhoneNumber_txt										|
		|AddCreditCardPage_Add_btn												|
		|AddCreditCardPage_Cancel_btn											|
		|AddCreditCardPage_CVV_toolTip											|
		|AddCreditCardPage_IconCVV_toolTipFlyout								|
		|AddCreditCardPage_InlineErrorMessage_txt								|
		|AddCreditCardPage_AddNewCreditCard										|
		
		
		
		|#Verify following elements in Payments > Add New Gift card section	|
		|AddGiftCardPage_GiftCardNumber_txt									|
		|AddGiftCardPage_PIN_txt											|
		|AddGiftCardPage_Cancel_txt											|
		|AddGiftCardPage_Add_txt											|
		|AddGiftCardPage_Pin_toolTip										|
		
		|#verify following elements in profile page		|
		|MyAccountPage_Profile_lnk_Mobile				|
		|ProfilePage_HelloMessage_label					| 
		|ProfilePage_ProfileHeader_label				|			
		|ProfilePage_ProfileInformation_label			|
		|ProfilePage_EditIcon_lnk						|
		|ProfilePage_Name_label							|
		|ProfilePage_Name_txt							|
		|ProfilePage_Email_txt							|
		|ProfilePage_Email_label						|
		|ProfilePage_PasswordHeader_label				|		
		|ProfilePage_ChangePassword_btn					|
		|ProfilePage_ReceiveEmailNotifications_checkbox	|
		
		|#verify following elements in Profile > Edit Profile section	|
		|EditProfilePage_EditProfileHeader_label						|
		|EditProfilePage_FirstName_txt									|
		|EditProfilePage_LastName_txt									|
		|EditProfilePage_NewEmail_txt									|
		|EditProfilePage_ConfirmEmail_txt								|
		|EditProfilePage_Update_btn										|
		|EditProfilePage_Cancel_btn										|	
				
		|#Verify following elements in Profile > change password section|
		|ChangePassworPage_CurrentPassword_btn							|
		|ChangePassworPage_NewPassword_txt								|
		|ChangePassworPage_Update_btn									|
		|ChangePassworPage_Cancel_btn									|
		
		|#Verify following elements in create a wishlist section		|
		|WishlistPage_Wishlist_lnk										|
		|WishlistPage_CreateANewWishlist_btn							|
		|WishlistPage_WishListName_txt									|
		|WishlistPage_CreateWishList_btn								|
		
		|#Verify following elements in order section|
		|OrderPage_Order_lnk						|
		|OrderPage_OrdersHeader_label				|
		|OrderPage_OrderNumber_txt					|
		|OrderPage_ShippingZipCode_txt				|
		|OrderPage_Find_btn							|
		
		|#Verify following elements in SignUp section	|
		|SignUp_FirstName_txt						 	|
		|SignUp_LastName_txt							|
		|SignUp_EmailAddress						 	|
		|SignUp_Password					         	| 
		|SignUp_ReceivePromotion_chkBx					|
		|SignUpPage_SignUp_btn							|
		|SignUpPage_AlreadyHaveAnAccount_txt			|
		|SignUpPage_SignInNow_lnk						|
		|SignUpPage_PasswordMustContain_txt				|
		|SignUpPage_MinimumCharacters_txt				|
		|SignUpPage_Cross_icon							|
		|SignUpPage_PasswordStrength_txt				|
		|SignUpPage_Weak_txt							|
		|SignUpPage_Strong_txt							|
		|SignUpPage_PasswordStrengthBar_txt				|
	

	