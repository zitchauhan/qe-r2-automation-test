Feature: verify Forgotten Password functionality 

@R2_Mobile @R2_Regression @R2_All @P2 @C-MyAccount @KER-4011
@ZYP_MYACCOUNT_K4023-10078 @CR-RK 
Scenario: Verify user is able to enter the Forgot Password page from Forgot Password link 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account 
		|SignInPage_SignIn_btn								|
		|SignInPage_ForgotYourPassword_txt					|
	When user clicks on Forgot your password link on the Sign in page 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in forgot password page|
		|ForgotPasswordPage_EmailAddress_txt				|
		|ForgotPasswordPage_Submit_btn						|
		
@R2_Mobile @R2_Regression @R2_All @P2 @C-MyAccount @KER-4011
@ZYP_MYACCOUNT_K4023-10079 @CR-RK 
Scenario: Verify the available elements on the Forgot Password page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account 
		|SignInPage_SignIn_btn								|
		|SignInPage_ForgotYourPassword_txt					|
	When user clicks on Forgot your password link on the Sign in page 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in forgot password page|
		|ForgotPasswordPage_EmailAddress_txt				|
		|ForgotPasswordPage_Submit_btn						|
		
		
@R2_Mobile @R2_Regression @R2_All @P2 @C-MyAccount @KER-4011
@ZYP_MYACCOUNT_K4023-10082 @CR-RK 
Scenario: Verify the user gets the error message when both email id and Password are incorrect 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account 
		|SignInPage_SignIn_btn								|
		|SignInPage_ForgotYourPassword_txt					|
	When user enter the valid emailaddress "InvalidEmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|Please enter the Email Address in a valid format (ex. abc@xyz.com)|
		
@R2_Mobile @R2_Regression @R2_All @P-Low @C-MyAccount @KER-4023
@ZYP_MYACCOUNT_K4023-10081 @CR-RK 
Scenario: Verify the user gets the error message when Email Id is left blank 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account 
		|SignInPage_SignIn_btn								|
		|SignInPage_ForgotYourPassword_txt					|
	When user clicks on Forgot your password link on the Sign in page 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in forgot password page|
		|ForgotPasswordPage_EmailAddress_txt				|
		|ForgotPasswordPage_Submit_btn						|
	And user clicks on Submit button without entering the email address 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|Please enter an email address|
		
@R2_Mobile @R2_Regression @R2_All @P2 @1HR_R2 @C-MyAccount @KER-4023
@ZYP_MYACCOUNT_K4023-10083 @CR-RK 
Scenario: Verify the user gets the error message on entering non-registered email id 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account 
		|SignInPage_SignIn_btn								|
		|SignInPage_ForgotYourPassword_txt					|
	When user clicks on Forgot your password link on the Sign in page 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in forgot password page|
		|ForgotPasswordPage_EmailAddress_txt				|
		|ForgotPasswordPage_Submit_btn						|
	And user enters a "nonregisteredemailid" and clicks on Submit button 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|Please enter the Email Address in a valid format (ex. abc@xyz.com)|