Feature: verify Forgotten Password functionality

@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4230-10576 @CR-RK
Scenario: Verify user is able to enter the Forgot Password page from Forgot Password link
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account
	|SignInPage_SignIn_btn								|
	|SignInPage_SignUp_btn								|
	|SignInPage_EmailAddress_txt			   			| 
	|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then User clicks on the burger menu
	And user click on MyAccount
	And user click on profile link
	When user click on change password icon
	And user enters current password
	And user enters new password
	And user clicks on Update button
	Then user should be able to change password
	 
	 
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4230-11120 @CR-RK
Scenario: Verify that user can continue the shopping without re-authentication after changing the password
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account
	|SignInPage_SignIn_btn								|
	|SignInPage_SignUp_btn								|
	|SignInPage_EmailAddress_txt			   			| 
	|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then User clicks on the burger menu
	And user click on MyAccount
	And user click on profile link
	When user click on change password icon
	And user enters current password
	And user enters new password
	And user clicks on Update button
	Then User clicks on the burger menu
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	Then User clicks on the burger menu
	And user click on MyAccount
	And user is not logged out

@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4230 @ZYP_MYACCOUNT_K4230-10565 @CR-RK
Scenario: Verify that user able to update the profile	
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account
	|SignInPage_SignIn_btn								|
	|SignInPage_SignUp_btn								|
	|SignInPage_EmailAddress_txt			   			| 
	|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu
	And user click on MyAccount
	And user click on profile link
	And user click on edit button of default address
	Then Verify below Sub/Main Module of My Account 
	|#verify following elements in Profile > Edit Profile section	|
		|EditProfilePage_EditProfileHeader_label						|
	And user enter First Name field "FirstName" 
	And user enter Last Name field "LastName" 
	And user clicks on Update button
	When user click on change password icon
	Then Verify below Sub/Main Module of My Account 
	|#Verify following elements in Profile > change password section|
		|ChangePassworPage_CurrentPassword_btn							|
		|ChangePassworPage_NewPassword_txt								|
		|ChangePassworPage_Update_btn									|
		|ChangePassworPage_Cancel_btn									|
	And user enters current password
	And user enters new password
	And user clicks on Update button           	
	
	
	@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4230 @ZYP_MYACCOUNT_K4230-10566 @CR-RK
Scenario: Verify that user can see the error message in First name input field.
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account
	|SignInPage_SignIn_btn								|
	|SignInPage_SignUp_btn								|
	|SignInPage_EmailAddress_txt			   			| 
	|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu
	And user click on MyAccount
	And user click on profile link
	And user click on edit button of default address
	Then Verify below Sub/Main Module of My Account 
	|#verify following elements in Profile > Edit Profile section	|
	|EditProfilePage_EditProfileHeader_label						|
	And user enter First Name field "InvalidFirstName" 
	And user clicks on Update button
	Then Verify the message on the page
	 |Not a valid name|
	 
	 	@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4230 @ZYP_MYACCOUNT_K4230-1057 @CR-RK
Scenario: Verify that user can see the error message in First name input field.
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account
	|SignInPage_SignIn_btn								|
	|SignInPage_SignUp_btn								|
	|SignInPage_EmailAddress_txt			   			| 
	|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu
	And user click on MyAccount
	And user click on profile link
	And user click on edit button of default address
	Then Verify below Sub/Main Module of My Account 
	|#verify following elements in Profile > Edit Profile section	|
	|EditProfilePage_EditProfileHeader_label						|
	And user enter First Name field "InvalidFirstNameWithSingleChar" 
	And user clicks on Update button
	Then Verify the message on the page
	 |Not a valid name|

	 
	 	@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4230 @ZYP_MYACCOUNT_K4230-10568 @CR-RK
Scenario: Verify that user can see the error message in First name input field.
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account
	|SignInPage_SignIn_btn								|
	|SignInPage_SignUp_btn								|
	|SignInPage_EmailAddress_txt			   			| 
	|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu
	And user click on MyAccount
	And user click on profile link
	And user click on edit button of default address
	Then Verify below Sub/Main Module of My Account 
	|#verify following elements in Profile > Edit Profile section	|
		|EditProfilePage_EditProfileHeader_label						|
	And user enter First Name field "InvalidEmailForMoreThan50Characters" 
	And user clicks on Update button
	Then Verify the message on the page
	 |Not a valid name|
	 
	 
	 @R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4230 @ZYP_MYACCOUNT_K4230-10569 @CR-RK
Scenario: Verify that user can see the error message in last name input field.
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account
	|SignInPage_SignIn_btn								|
	|SignInPage_SignUp_btn								|
	|SignInPage_EmailAddress_txt			   			| 
	|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu
	And user click on MyAccount
	And user click on profile link
	And user click on edit button of default address
	Then Verify below Sub/Main Module of My Account 
	|#verify following elements in Profile > Edit Profile section	|
		|EditProfilePage_EditProfileHeader_label						|
	And user enter Last Name field "InvalidLastName" 
	And user clicks on Update button
	Then Verify the message on the page
	 |Not a valid name|