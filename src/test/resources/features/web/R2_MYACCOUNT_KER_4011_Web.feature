Feature: Verify Login/Sign in page and functionality

@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4011-10038 @CR-SK @1HR_R2
Scenario: Verify user is able to enter the Sign In page from Sign In link 
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header
	Then Sign in page should open 
	
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4011-10039 @CR-SK 
Scenario: Verify available elements on the Sign in page
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header
	Then Verify below Sub/Main Module of My Account
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		|SignInPage_SignIn_btn								|
		|SignInPage_ForgotYourPassword_txt					|
		|SignInPage_SignUp_btn								|

	
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4011-10040 @CR-SK 
Scenario: Verify the user is able to sign in successfully with valid credentials
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then user should get logged in successfully
#	And a greeting message should be displayed
	
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4011-10046 @CR-SK
Scenario: Verify the user gets the error message when both email id and Password are incorrect 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	When user enter the valid emailaddress "IncorrectEmailAddress"
	And user enter the valid password "IncorrectPassword" 
	And user click on signin button
#	Then user should not be allowed to login
	And user should get an error message stating email id or password is incorrect
#	
@R2_Web @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4011-10053 @CR-SK
Scenario: Verify the user gets the error message when login from non-registered email id 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	When user enter the valid emailaddress "UnregisteredEmailAddress"
	And user enter the valid password "Password" 
	And user click on signin button
#	Then user should not be allowed to login
	And user should get an error message stating email id or password is incorrect

	
@R2_Web @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4011-10042 @CR-SK
Scenario: Verify the user gets the error message when Login id is incorrect
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	When user enter the valid emailaddress "IncorrectEmailAddress"
	And user enter the valid password "Password" 
	And user click on signin button
#	Then user should not be allowed to login
	And user should get an error message stating email id or password is incorrect
	
@R2_Web @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4011-10045 @CR-SK
Scenario: Verify the user gets the error message when Password is incorrect 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	When user enter the valid emailaddress "EmailAddress"
	And user enter the valid password "IncorrectPassword" 
	And user click on signin button
#	Then user should not be allowed to login
	And user should get an error message stating email id or password is incorrect

@R2_Web @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4011-10049 @CR-SK
Scenario: Verify the user gets the error message when Login id is left blank
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	When user enter the valid emailaddress "BlankEmailAddress"
	And user enter the valid password "Password" 
	And user click on signin button
	Then Verify the message on the page 
		|# Following error Message should show on the page	|
		|Please enter email address							|

@R2_Web @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4011-10051 @CR-SK
Scenario: Verify the user gets the error message when Password is left blank 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	When user enter the valid emailaddress "RawUser"
	And user enter the valid password "BlankPassword" 
	And user click on signin button
	Then Verify the message on the page 
		|# Following error Message should show on the page	|
		|Please enter password								|

####Failing - Known Issue
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4011-10301 @CR-SK
Scenario: Verify user can do the logout using Flyout from My Account header
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user logs in as "RawUser"
	When user sign out from the website
	Then Sign in page should open
	When user logs in as "RawUser"
	And User navigates to L2 Mens clothing
    And user clicks on one of the subcategory and navigates to LTwo
    And user clicks on one of the product category and navigates to LThree
	And user sign out from the website
	Then User is navigated to pdp page


@R2_Web @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4011-11141 @CR-SK
Scenario: Verify user referenced back to the same page from where sign in is triggered
	Given user launches the browser and navigates to "ASO_HOME" page
	And User navigates to L2 Mens clothing
    And user clicks on one of the subcategory and navigates to LTwo
    And user clicks on one of the product category and navigates to LThree
	And user clicks on SignIn link from global header
	And Sign in page should open
	When user logs in as "RawUser" 
	Then User is navigated to pdp page
#	

@R2_Web @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4011-10052 @CR-SK
Scenario: Verify the user gets the error message when both email id and Password are blank
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	When user enter the valid emailaddress "BlankEmailAddress"
	And user enter the valid password "BlankPassword" 
	And user click on signin button
	Then Verify the message on the page 
		|# Following error Message should show on the page	|
		|Please enter email address							|
		|Please enter password								|
	
