Feature: verify Forgotten Password functionality

@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4230 @ZYP_MYACCOUNT_K4230-10576 @CR-RK
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
	 
	 
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4230 @ZYP_MYACCOUNT_K4230-11120 @CR-RK
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
 
	 	@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4230 @ZYP_MYACCOUNT_K4230-10567 @CR-RK
Scenario: Verify that user can see the error message in First name field if user enters "1" character in input field.
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
Scenario: Verify that user can see the error message in First name field if user enters "51" character in input field.
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
	 
	 @R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4230 @ZYP_MYACCOUNT_K4230-10570 @CR-RK
Scenario: Verify that user can see the error message in Last name field if user enters "1" character in input field.
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
	And user enter Last Name field "InvalidLastNameWithSingleChar" 
	And user clicks on Update button
	Then Verify the message on the page
	 |Not a valid name|
	 
	 @R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4230 @ZYP_MYACCOUNT_K4230-10571 @CR-RK
Scenario: Verify that user can see the error message in Last name field if user enters "51" character in input field.
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
	And user enter Last Name field "InvalidEmailForMoreThan50Characters" 
	And user clicks on Update button
	Then Verify the message on the page
	 |Not a valid name|
	
	
		 @R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4230 @ZYP_MYACCOUNT_K4230-10572 @CR-RK
Scenario: Verify that user can see the error message if user enters the email id in New Email and Confirm Email input fields with non-alpha + character.
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
	And user enter new email field "InvalidEmailAddress" 
	Then Verify the message on the page
	|Please enter the Email Address in a valid format (ex. abc@xyz.com)|
	And user enter confirm email field "InvalidConfirmEmail" 
	Then Verify the message on the page
	|Please enter the Email Address in a valid format (ex. abc@xyz.com)| 
	 
	  @R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4230 @ZYP_MYACCOUNT_K4230-10573 @CR-RK
Scenario: Verify that user can see the error message if user enters the email id  more than 255 Characters in New Email and Confirm Email input fields.
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
	And user enter new email field "InvalidEmailForMoreThan50Characters" 
	Then Verify the message on the page
	|Please enter the Email Address in a valid format (ex. abc@xyz.com)|
	And user enter confirm email field "InvalidEmailForMoreThan50Characters" 
	Then Verify the message on the page
	|Please enter the Email Address in a valid format (ex. abc@xyz.com)|
	
	
	@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4230 @ZYP_MYACCOUNT_K4230-10576 @CR-RK
Scenario: Verify that user can change the password in Profile section.
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
	Then Verify below Sub/Main Module of My Account 
	|#Verify following elements in Profile > change password section|
		|ChangePassworPage_NewPassword_txt								|
		|ChangePassworPage_Update_btn									|
		|ChangePassworPage_Cancel_btn									|
	And user enters currentpassword "Password"
	And user enters newpassword "Password"
	And user clicks on Update button 
	
		@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4230 @ZYP_MYACCOUNT_K4230-10577 @CR-RK
Scenario: Verify that user can see the error message in password field.
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
	Then Verify below Sub/Main Module of My Account 
	|#Verify following elements in Profile > change password section|
		|ChangePassworPage_NewPassword_txt								|
		|ChangePassworPage_Update_btn									|
		|ChangePassworPage_Cancel_btn									|
	And user enters currentpassword "invalidpasswordWithLessThan8Char"
	And user enters newpassword "invalidpasswordWithLessThan8Char"
	Then Verify the message on the page
	  |8 characters minimum|