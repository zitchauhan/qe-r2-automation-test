Feature: Verify Login/Sign in page and functionality

@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4011-10038 @CR-SK 
Scenario: Verify user is able to enter the Sign In page from Sign In link 
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header
	Then Sign in page should open 
	
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4011-10039 @CR-SK 
Scenario: Verify available elements on the Sign in page
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header
	Then user should be able to validate elements of sign in page
	
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4011-10040 @CR-SK 
Scenario: Verify the user is able to sign in successfully with valid credentials
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then user should get logged in successfully
	And a greeting message should be displayed
	
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4011-10046 @CR-SK
Scenario: Verify the user gets the error message when both email id and Password are incorrect 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	When user enter the valid emailaddress "IncorrectEmailAddress"
	And user enter the valid password "IncorrectPassword" 
	And user click on signin button
	Then user should not be allowed to login
	And user should get an error message stating email id or password is incorrect

	
