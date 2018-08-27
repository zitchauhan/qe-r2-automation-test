Feature: verify Forgotten Password functionality 

@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4023-10078 @CR-SK 
Scenario:
Verify user is able to enter the Forgot Password page from Forgot Password link 
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
	
	
@R2_Web @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4023-10082 @CR-SK 
Scenario: Verify the user gets the error message when both email id and Password are incorrect 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	When user enter the valid emailaddress "InvalidEmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user should get an error message stating please enter valid email 
	
@R2_Web @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4023 @ZYP_MYACCOUNT_K4023-10081 @CR-RK 
Scenario: Verify the user gets the error message when Email Id is left blank 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	When user clicks on Forgot your password link on the Sign in page 
	And user clicks on Submit button without entering the email address 
	Then user should get an error message 
	
@R2_Web @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4023 @ZYP_MYACCOUNT_K4023-10083 @CR-RK 
Scenario: Verify the user gets the error message on entering non-registered email id 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	When user clicks on Forgot your password link on the Sign in page 
	And user enters a "nonregisteredemailid" and clicks on Submit button 
	Then user should get an error message for nonregisteredemailid address