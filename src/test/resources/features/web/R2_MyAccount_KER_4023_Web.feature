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
	Then user should be able to validate elements of forgot your password page
