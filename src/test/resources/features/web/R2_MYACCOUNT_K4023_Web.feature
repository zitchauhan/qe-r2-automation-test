Feature: verify Forgotten Password functionality

@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4023-10078 @CR-SK
Scenario: Verify user is able to enter the Forgot Password page from Forgot Password link
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And Sign in page should open 
	When user clicks on Forgot your password link on the Sign in page
	Then Forgot Password page should open

@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4023-10079 @CR-SK	
Scenario: Verify the available elements on the Forgot Password page
Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And Sign in page should open 
	When user clicks on Forgot your password link on the Sign in page
	Then Forgot Password page should open
	And Verify below Sub/Main Module of My Account
		|# Verify following elements in forgot password page	|
		|Email Address - Forgot Password Page					|
		|Submit Button - Forgot Password Page					|
		
	
@R2_Web @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4023-10082 @CR-SK
Scenario: Verify the user gets the error message when both email id and Password are incorrect 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	When user enter the valid emailaddress "InvalidEmailAddress"
	And user enter the valid password "Password" 
	And user click on signin button
	Then user should get an error message stating please enter valid email