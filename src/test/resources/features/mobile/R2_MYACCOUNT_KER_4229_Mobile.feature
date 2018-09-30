Feature: E02-100 - MYACCOUNT Page 

@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4229 
@ZYP_MYACCOUNT_K4229-10471 @CR-GK 
Scenario: Verify that My Account option is available for Guest User 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then my account cta is displayed 
	
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-MyAccount @KER-4229 
@ZYP_MYACCOUNT_K4229-10472 @CR-GK 
Scenario: Verify that My Account option is available for Authenticated User 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "RawUser" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	Then Verify below Sub/Main Module of My Account 
		|# My Account CTA should displayed in header section	|
		|BurgerMenu_MyAccount_txt	        |
		
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4229 
@ZYP_MYACCOUNT_K4229-10474 @CR-GK 
Scenario: Verify that Authenticated User is able to view order list 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User clicks on the burger menu 
	And user navigates to orders in my account 
	Then Verify that list of orders are displayed in the right section of the page 
	And Verify that 10 orders are displayed per page 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in order section|
		|TotalNumberOfOrder_txt                     |
		|CustomerCare_lnk                           |
		|OrdersDropDownNewestSorted                 |
	And Oldest sorting option is available 
	
	
@R2_Mobile @R2_Regression @R2_All @P-High @1HR_R2 @C-MyAccount @KER-4229 
@ZYP_MYACCOUNT_K4229-10475 @CR-GK 
Scenario: Verify that Authenticated User is able to navigate to Profile page 
	Given  user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And  user enter the valid password "Password" 
	And  user click on signin button 
	And User clicks on the burger menu 
	And user navigates to profile in my account 
	Then Verify below Sub/Main Module of My Account 
		|#verify following elements in profile page		|
		|ProfilePage_ProfileInformation_label			|
		|ProfilePage_EditIcon_lnk						|
		|ProfilePage_Name_label							|
		|ProfilePage_Name_txt							|
		|ProfilePage_Email_txt							|
		|ProfilePage_Email_label						|
		|ProfilePage_ChangePassword_btn					|
		|MaskedPasswordInProfile_mask                   |
		|ProfilePage_ReceiveEmailNotifications_checkbox	|
		
@R2_Mobile @R2_Regression @R2_All @P-Highest @C-MyAccount @KER-4229 
@ZYP_MYACCOUNT_K4229-10476 @CR-GK 
Scenario: Verify that Authenticated User is able to view the address book 
	Given  user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And  user enter the valid password "Password" 
	And  user click on signin button 
	And User clicks on the burger menu 
	And user navigates to address book in my account 
	Then Verify below Sub/Main Module of My Account 
		|#verify following elements in profile page	|
		|myAccountPage_AddNewAddressPluIcon_btn		|
		|AddressPage_AddressBookHeader_txt			|
		|AddressPage_SetAsDefault_btn				|
		|AddressPage_Default_txt					|


@R2_Mobile @R2_Regression @R2_All @P-Highest @C-MyAccount @KER-4229 
@ZYP_MYACCOUNT_K4229-10477 @CR-GK 
Scenario: Verify that Authenticated User is able to view the Wish List 
	Given  user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And  user enter the valid password "Password" 
	And  user click on signin button 
	And User clicks on the burger menu 
	And user navigates to wishlist in my account 
	Then Verify below Sub/Main Module of My Account 
		|#verify following elements in Wish List page	|
		|WishlistItems_lnk      |
		|Wishlist_createlist_lnk|


@R2_Mobile @R2_Regression @R2_All @P-Highest @C-MyAccount @KER-4229 
@ZYP_MYACCOUNT_K4229-10478 @CR-GK 
Scenario: 
	Verify that Authenticated User is able to view the Saved payment options 
	Given  user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And  user enter the valid password "Password" 
	And  user click on signin button 
	And User clicks on the burger menu 
	And user navigates to payments in my account 
	Then Verify below Sub/Main Module of My Account 
		|#verify following elements in Payments page in My Account|
		|AddCreditCardPage_BillingInformationHeader_txt	|
		|PaymentPage_CreditCardDetails					|
		|PaymentPage_SetAsDefault_btn                   |
		|PaymentPage_GiftCardHeader_label				|
		|PaymentPage_RemoveGiftCards_btnList			|


@R2_Mobile @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4229 
@ZYP_MYACCOUNT_K4229-10489 @CR-GK 
Scenario: 
	Verify that Authenticated User is able to create new password in My Account Menu. 
	Given  user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user should able to click on Signin button 
	And user logs in as "EmailAddressForChangePassword" 
	And User clicks on the burger menu 
	And user navigates to profile in my account 
	And user click on change password icon 
	And user enters current password 
	And user enters new password 
	And user clicks on Update button 
	Then Verify below Sub/Main Module of My Account 
		|#verify following elements in Payments page in My Account|
		|ProfilePage_ChangePassword_btn|


@R2_Mobile @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4229 
@ZYP_MYACCOUNT_K4229-10512 @CR-GK 
Scenario: 
	Verify that Authenticated User is able to view and search existing orders. 
	Given  user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And  user enter the valid password "Password" 
	And  user click on signin button 
	And User clicks on the burger menu 
	And user navigates to orders in my account 
	Then Verify that list of orders are displayed in the right section of the page 
	Then Verify below Sub/Main Module of My Account 
		|#verify following elements in Payments page in My Account|
		|OrderPage_Find_btn|
				