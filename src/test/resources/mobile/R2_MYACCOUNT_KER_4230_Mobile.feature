Feature: verify Forgotten Password functionality 

@R2_Mobile @R2_Regression @R2_All @P1   @C-MyAccount @KER-4230 @ZYP_MYACCOUNT_K4230-10576 @CR-RK
Scenario: Verify user is able to enter the Forgot Password page from Forgot Password link
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account
	|# Verify following elements in Sign in/login page	|
	|SignInPage_SignIn_btn								|
	|SignInPage_SignUp_btn								|
	|SignInPage_EmailAddress_txt			   			| 
	|SignInPage_Password_txt				   			|
	And user logs in as "EmailAddressForChangePassword"
	Then User clicks on the burger menu
	And user click on MyAccount
	And user click on profile link
	When user click on change password icon
	And user enters current password
	And user enters new password
	And user clicks on Update button 
	
	
@R2_Mobile @R2_Regression @R2_All @P1 @C-MyAccount @KER-4230
@ZYP_MYACCOUNT_K4230-11120 @CR-RK 
Scenario: Verify that user can continue the shopping without re-authentication after changing the password 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_SignIn_btn								|
		|SignInPage_SignUp_btn								|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user logs in as "EmailAddressForChangePassword" 
	Then User clicks on the burger menu 
	And user navigates to profile in my account
	When user click on change password icon 
	And user enters current password 
	And user enters new password 
	And user clicks on Update button 
	Then User clicks on the burger menu 
	And User navigates to L3 
	And user clicks on the product card and navigates to PDP 
	Then User clicks on the burger menu 
	And user click on MyAccount 
	And user is not logged out
	
@R2_Mobile @R2_Regression @R2_All @P1 @C-MyAccount @KER-4230
@ZYP_MYACCOUNT_K4230-10565 @CR-RK 
Scenario: Verify that user able to update the profile 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_SignIn_btn								|
		|SignInPage_SignUp_btn								|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user logs in as "EmailAddressForChangePassword" 
	Then User clicks on the burger menu 
	And user navigates to profile in my account
	And user click on edit button of default address 
	Then Verify below Sub/Main Module of My Account 
		|#verify following elements in Profile > Edit Profile section	|
		|EditProfilePage_EditProfileHeader_label						|
	And user enter First Name field "FirstName" 
	And user enter Last Name field "LastName" 
	And user clicks on Update button in edit profile 
	When user click on change password icon 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in Profile > change password section|
		|ChangePassworPage_Update_btn									|
		|ChangePassworPage_Cancel_btn									|
	And user enters current password 
	And user enters new password 
	And user clicks on Update button 
	
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-MyAccount @KER-4230
@ZYP_MYACCOUNT_K4230-10566 @CR-RK 
Scenario: Verify that user can see the error message in First name input field. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_SignIn_btn								|
		|SignInPage_SignUp_btn								|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	And user navigates to profile in my account
	And user click on edit button of default address 
	Then Verify below Sub/Main Module of My Account 
		|#verify following elements in Profile > Edit Profile section	|
		|EditProfilePage_EditProfileHeader_label						|
	And user enter First Name field "InvalidFirstName" 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|Not a valid name|
		
@R2_Mobile @R2_Regression @R2_All @P2 @C-MyAccount @KER-4230
@ZYP_MYACCOUNT_K4230-10567 @CR-RK 
Scenario: Verify that user can see the error message in First name field if user enters "1" character in input field. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_SignIn_btn								|
		|SignInPage_SignUp_btn								|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	And user navigates to profile in my account
	And user click on edit button of default address 
	Then Verify below Sub/Main Module of My Account 
		|#verify following elements in Profile > Edit Profile section	|
		|EditProfilePage_EditProfileHeader_label						|
	And user enter First Name field "InvalidFirstNameWithSingleChar" 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|Not a valid name|
		
		
@R2_Mobile @R2_Regression @R2_All @P2 @C-MyAccount @KER-4230
@ZYP_MYACCOUNT_K4230-10568 @CR-RK 
Scenario: Verify that user can see the error message in First name field if user enters "51" character in input field. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_SignIn_btn								|
		|SignInPage_SignUp_btn								|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	And user navigates to profile in my account 
	And user click on edit button of default address 
	Then Verify below Sub/Main Module of My Account 
		|#verify following elements in Profile > Edit Profile section	|
		|EditProfilePage_EditProfileHeader_label						|
	And user enter First Name field "InvalidEmailForMoreThan50Characters" 
	Then Verify First Name field should not accept more than fifty character 
	
	
@R2_Mobile @R2_Regression @R2_All @P2 @C-MyAccount @KER-4230
@ZYP_MYACCOUNT_K4230-10569 @CR-RK 
Scenario: Verify that user can see the error message in last name input field. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_SignIn_btn								|
		|SignInPage_SignUp_btn								|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	And user navigates to profile in my account 
	And user click on edit button of default address 
	Then Verify below Sub/Main Module of My Account 
		|#verify following elements in Profile > Edit Profile section	|
		|EditProfilePage_EditProfileHeader_label						|
	And user enter Last Name field "InvalidLastName" 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|Not a valid name|
		
@R2_Mobile @R2_Regression @R2_All @P2 @C-MyAccount @KER-4230
@ZYP_MYACCOUNT_K4230-10570 @CR-RK 
Scenario: Verify that user can see the error message in Last name field if user enters "1" character in input field. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_SignIn_btn								|
		|SignInPage_SignUp_btn								|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	And user navigates to profile in my account
	And user click on edit button of default address 
	Then Verify below Sub/Main Module of My Account 
		|#verify following elements in Profile > Edit Profile section	|
		|EditProfilePage_EditProfileHeader_label						|
	And user enter Last Name field "InvalidLastNameWithSingleChar" 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|Not a valid name|
		
@R2_Mobile @R2_Regression @R2_All @P2 @C-MyAccount @KER-4230
@ZYP_MYACCOUNT_K4230-10571 @CR-RK 
Scenario: Verify that user can see the error message in Last name field if user enters "51" character in input field. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_SignIn_btn								|
		|SignInPage_SignUp_btn								|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	And user navigates to profile in my account
	And user click on edit button of default address 
	Then Verify below Sub/Main Module of My Account 
		|#verify following elements in Profile > Edit Profile section	|
		|EditProfilePage_EditProfileHeader_label						|
	And user enter Last Name field "InvalidEmailForMoreThan50Characters" 
	Then Verify Last Name field should not accept more than fifty character 
	
	
@R2_Mobile @R2_Regression @R2_All @P2 @C-MyAccount @KER-4230
@ZYP_MYACCOUNT_K4230-10572 @CR-RK 
Scenario: Verify that user can see the error message if user enters the email id in New Email and Confirm Email input fields with non-alpha + character. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_SignIn_btn								|
		|SignInPage_SignUp_btn								|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user logs in as "EmailAddressForChangePassword"  
	Then User clicks on the burger menu 
	And user navigates to profile in my account 
	And user click on edit button of default address 
	Then Verify below Sub/Main Module of My Account 
		|#verify following elements in Profile > Edit Profile section	|
		|EditProfilePage_EditProfileHeader_label						|
	And user enter new email field "InvalidEmailAddress" 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|Please enter the Email Address in a valid format (ex. abc@xyz.com)|
	And user enter confirm email field "InvalidConfirmEmail" 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|Please enter the Email Address in a valid format (ex. abc@xyz.com)| 
		
@R2_Mobile @R2_Regression @R2_All @P2 @C-MyAccount @KER-4230
@ZYP_MYACCOUNT_K4230-10573 @CR-RK 
Scenario: Verify that user can see the error message if user enters the email id  more than 255 Characters in New Email and Confirm Email input fields. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_SignIn_btn								|
		|SignInPage_SignUp_btn								|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user logs in as "EmailAddressForChangePassword"  
	Then User clicks on the burger menu 
	And user navigates to profile in my account
	And user click on edit button of default address 
	Then Verify below Sub/Main Module of My Account 
		|#verify following elements in Profile > Edit Profile section	|
		|EditProfilePage_EditProfileHeader_label						|
	And user enter new email field "InvalidEmailForMoreThan50Characters" 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|Please enter the Email Address in a valid format (ex. abc@xyz.com)|
	And user enter confirm email field "InvalidEmailForMoreThan50Characters" 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|Please enter the Email Address in a valid format (ex. abc@xyz.com)|
		
		
@R2_Mobile @R2_Regression @R2_All @P2 @C-MyAccount @KER-4230
@ZYP_MYACCOUNT_K4230-10577 @CR-RK 
Scenario: Verify that user can see the error message in password field. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_SignIn_btn								|
		|SignInPage_SignUp_btn								|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user logs in as "EmailAddressForChangePassword" 
	Then User clicks on the burger menu 
	And user navigates to profile in my account 
	When user click on change password icon 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in Profile > change password section|
		|ChangePassworPage_Update_btn									|
		|ChangePassworPage_Cancel_btn									|
	And user enters currentpassword "invalidpasswordWithLessThan8Char" 
	And user enters newpassword "invalidpasswordWithLessThan8Char" 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|8 characters minimum|
		
@R2_Mobile @R2_Regression @R2_All @P2 @C-MyAccount @KER-4230
@ZYP_MYACCOUNT_K4230-11115 @CR-RK 
Scenario: Verify that system keep the addresses intact after changing the email address. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
#	Then user should able to click on Signin button 
#	Then Verify below Sub/Main Module of My Account 
#		|# Verify following elements in Sign in/login page	|
#		|SignInPage_SignUp_btn								|
#		|SignInPage_EmailAddress_txt			   			| 
#		|SignInPage_Password_txt				   			|
	And user creates an account 
	Then User clicks on the burger menu 
	And user navigates to profile in my account 
	And user click on edit button of default address 
	Then Verify below Sub/Main Module of My Account 
		|#verify following elements in Profile > Edit Profile section	|
		|EditProfilePage_EditProfileHeader_label						|
	And user enter new email in new email field 
	And user enter new email in confirm email field 
	And user clicks on Update button in edit profile 
	Then User clicks on the burger menu 
	Then user lands on My Account page and click on adress
	Then user Clicks on Add New Address link 
	When user enter First name "FirstName" in address book 
	And user enter Last name "LastName" in address book 
	And user enter Phone number "PhoneNumber" in address book 
	And user enter Address "Address" in address book 
	And user enter Zipcode "zipcode" in address book 
	And user click on set as default button 
	And clicks on Add New Address button 
	And user verifies the First address provided is set as default 
	
@R2_Mobile @R2_Regression @R2_All @P2 @C-MyAccount @KER-4230
@ZYP_MYACCOUNT_K4230-11116 @CR-RK 
Scenario: Verify that system keep the payments intact after changing the email address. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
#	Then user should able to click on Signin button 
#	Then Verify below Sub/Main Module of My Account 
#		|# Verify following elements in Sign in/login page	|
#		|SignInPage_SignUp_btn								|
#		|SignInPage_EmailAddress_txt			   			| 
#		|SignInPage_Password_txt				   			|
	And user creates an account  
	Then User clicks on the burger menu 
	And user navigates to profile in my account
	And user click on edit button of default address 
	Then Verify below Sub/Main Module of My Account 
		|#verify following elements in Profile > Edit Profile section	|
		|EditProfilePage_EditProfileHeader_label						|
	And user enter new email in new email field 
	And user enter new email in confirm email field 
	And user clicks on Update button in edit profile 
	Then User clicks on the burger menu 
	Then user click on My Account and navigate to payment 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in Payment page		|
		|PaymentPage_CreditCardHeader_label				|
		
		
		
@R2_Mobile @R2_Regression @R2_All @P2 @C-MyAccount @KER-4230
@ZYP_MYACCOUNT_K4230-11117 @CR-RK 
Scenario: Verify that system keep the wish-list intact after changing the email address. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
#	Then user should able to click on Signin button 
#	Then Verify below Sub/Main Module of My Account 
#		|# Verify following elements in Sign in/login page	|
#		|SignInPage_SignUp_btn								|
#		|SignInPage_EmailAddress_txt			   			| 
#		|SignInPage_Password_txt				   			|
	And user creates an account
	Then User clicks on the burger menu 
	And user navigates to profile in my account
	And user click on edit button of default address 
	Then Verify below Sub/Main Module of My Account 
		|#verify following elements in Profile > Edit Profile section	|
		|EditProfilePage_EditProfileHeader_label						|
	And user enter new email in new email field 
	And user enter new email in confirm email field 
	And user clicks on Update button in edit profile
	Then User clicks on the burger menu 
	And user click on MyAccount 
	Then user click on WishList 
#	Then Verify below Sub/Main Module of My Account 
#		|#Verify following elements in create a wishlist section		|
#		|WishlistItems_lnk												|
		
		
@R2_Mobile @R2_Regression @R2_All @P1 @1HR_R2 @C-MyAccount @KER-4230
@ZYP_MYACCOUNT_K4230-11118 @CR-RK 
Scenario: Verify that system keep the orders intact after changing the email address. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
#	Then user should able to click on Signin button 
#	Then Verify below Sub/Main Module of My Account 
#		|# Verify following elements in Sign in/login page	|
#		|SignInPage_SignIn_btn								|
#		|SignInPage_SignUp_btn								|
#		|SignInPage_EmailAddress_txt			   			| 
#		|SignInPage_Password_txt				   			|
	And user creates an account 
	Then User clicks on the burger menu 
	And user navigates to profile in my account 
	And user click on edit button of default address 
	Then Verify below Sub/Main Module of My Account 
		|#verify following elements in Profile > Edit Profile section	|
		|EditProfilePage_EditProfileHeader_label						|
	And user enter new email in new email field 
	And user enter new email in confirm email field 
	And user clicks on Update button in edit profile
	Then User clicks on the burger menu 
	And user navigates to orders in my account 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in order section|
		|OrderPage_OrdersHeader_label|
		|Order_View_Details_Btn|
	When user click on view Details 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in order section|
		|Order_Taxes_Price|
		|Order_OrderTotal|