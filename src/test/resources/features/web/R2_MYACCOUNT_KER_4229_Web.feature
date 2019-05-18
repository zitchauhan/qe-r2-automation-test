Feature: E02-100 - MYACCOUNT Page 

@R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-4229 
@ZYP_MYACCOUNT_K4229-10471 @CR-GK 
Scenario: Verify that My Account option is available for Guest User 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then Verify below Sub/Main Module of My Account 
		|# My Account CTA should displayed in header section	|
		|UnauthenticatedUserMyAccountBtn| 
		
@R2_Web @R2_Regression @R2_All @P-Low @C-MyAccount @KER-4229 
@ZYP_MYACCOUNT_K4229-10472 @CR-GK 
Scenario: Verify that My Account option is available for Authenticated User 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And clicks on SignIn button in home page 
	And user enter the valid emailaddress "RawUser" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then Verify below Sub/Main Module of My Account 
		|# My Account CTA should displayed in header section	|
		|LoggedInUserMyAccountBtn	        |
		
		
@R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-4229 
@ZYP_MYACCOUNT_K4229-10473 @CR-GK @1HR_R2
Scenario: Verify that Authenticated User is able to navigate to My Account page 
	Given  user launches the browser and navigates to "ASO_HOME" page 
	And  clicks on SignIn button in home page 
	And  user enter the valid emailaddress "RawUser" 
	And  user enter the valid password "Password" 
	And  user click on signin button 
	And user navigates to profile in my account 
	Then Verify below Sub/Main Module of My Account 
		|#verify following elements in profile page		|
		|ProfilePage_HelloMessage_label					| 
	Then Verify below Sub/Main Module of My Account 
		|#verify following cta in myAccount page	|
		|OrderPage_Order_lnk						|
		|MyAccountPage_Address_lnk					|
		|MyAccountPage_Profile_cta                  |
		|WishlistPage_Wishlist_lnk					|
		|PaymentPage_Payment_lnk_web                |
		
		
@R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-4229 
@ZYP_MYACCOUNT_K4229-10474 @CR-GK 
Scenario: Verify that Authenticated User is able to view order list 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigates to orders in my account 
	Then Verify that list of orders are displayed in the right section of the page 
	And Verify that 10 orders are displayed per page 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in order section|
		|OrderPage_TotalNumberOfOrder_txt           |
		|OrderPage_CustomerCare_lnk                 |
		|OrderPage_OrdersDropDownNewestSorted       |
	And Oldest sorting option is available 
	
	
@R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-4229 
@ZYP_MYACCOUNT_K4229-10475 @CR-GK 
Scenario: Verify that Authenticated User is able to navigate to Profile page 
	Given  user launches the browser and navigates to "ASO_HOME" page 
	And  clicks on SignIn button in home page 
	And user enter the valid emailaddress "EmailAddress" 
	And  user enter the valid password "Password" 
	And  user click on signin button 
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
		|ProfilePage_MaskedPassword                   |
		
		
@R2_Web @R2_Regression @R2_All @P1 @C-MyAccount @KER-4229 
@ZYP_MYACCOUNT_K4229-10476 @CR-GK 
Scenario: Verify that Authenticated User is able to view the address book 
	Given  user launches the browser and navigates to "ASO_HOME" page 
	And  clicks on SignIn button in home page 
	And user enter the valid emailaddress "EmailAddress" 
	And  user enter the valid password "Password" 
	And  user click on signin button 
	And user navigates to address book in my account 
	Then Verify below Sub/Main Module of My Account 
		|#verify following elements in profile page	|
		|myAccountPage_AddNewAddressPluIcon_btn		|
		|AddressPage_AddressBookHeader_txt			|
		|AddressPage_SetAsDefault_btn				|
		|AddressPage_Default_txt					|
		
		
@R2_Web @R2_Regression @R2_All @P1 @C-MyAccount @KER-4229 
@ZYP_MYACCOUNT_K4229-10477 @CR-GK 
Scenario: Verify that Authenticated User is able to view the Wish List 
	Given  user launches the browser and navigates to "ASO_HOME" page 
	And  clicks on SignIn button in home page 
	And user enter the valid emailaddress "EmailAddress" 
	And  user enter the valid password "Password" 
	And  user click on signin button 
	And user navigates to wishlist in my account 
	Then Verify below Sub/Main Module of My Account 
		|#verify following elements in Wish List page	|
		|WishlistItems_lnk      |
		|Wishlist_createlist_lnk|
		
		
@R2_Web @R2_Regression @R2_All @P1 @C-MyAccount @KER-4229 
@ZYP_MYACCOUNT_K4229-10478 @CR-GK 
Scenario: Verify that Authenticated User is able to view the Saved payment options 
	Given  user launches the browser and navigates to "ASO_HOME" page 
	And  clicks on SignIn button in home page 
	And user enter the valid emailaddress "EmailAddress" 
	And  user enter the valid password "Password" 
	And  user click on signin button 
	And user navigates to payments in my account 
	Then Verify below Sub/Main Module of My Account 
		|#verify following elements in Payments page in My Account|
		|AddCreditCardPage_BillingInformationHeader_txt	|
		|PaymentPage_CreditCardDetails					|
		|PaymentPage_SetAsDefault_btn                   |
		|PaymentPage_GiftCardHeader_label				|
		|PaymentPage_RemoveGiftCards_btnList			|
		
		
@R2_Web @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4229 
@ZYP_MYACCOUNT_K4229-10489 @CR-GK 
Scenario: Verify that Authenticated User is able to create new password in My Account Menu. 
	Given  user launches the browser and navigates to "ASO_HOME" page 
	And  clicks on SignIn button in home page 
	And user logs in as "EmailAddressForChangePassword" 
	And user navigates to profile in my account 
	And user click on change password icon 
	And user enters current password 
	And user enters new password 
	And user clicks on Update button 
	Then Verify below Sub/Main Module of My Account 
		|#verify following elements in Payments page in My Account|
		|ProfilePage_ChangePassword_btn|
		
		
@R2_Web @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4229 
@ZYP_MYACCOUNT_K4229-10512 @CR-GK 
Scenario: Verify that Authenticated User is able to view and search existing orders. 
	Given  user launches the browser and navigates to "ASO_HOME" page 
	And  clicks on SignIn button in home page 
	And user enter the valid emailaddress "EmailAddress" 
	And  user enter the valid password "Password" 
	And  user click on signin button 
	And user navigates to orders in my account 
	Then Verify that list of orders are displayed in the right section of the page 
	Then Verify below Sub/Main Module of My Account 
		|#verify following elements in Payments page in My Account|
		|OrderPage_Find_btn|