Feature: verify Forgotten Password functionality

@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4230-10576 @CR-SK
Scenario: Verify user is able to enter the Forgot Password page from Forgot Password link
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header
	And user logs in as "EmailAddressForChangePassword"
	And user click on profile link
	When user click on change password icon
	And user enters current password
	And user enters new password
	And user clicks on Update button
	Then user should be able to change password
	 
	 
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4230-11120 @CR-SK
Scenario: Verify that user can continue the shopping without re-authentication after changing the password
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header
	And user logs in as "EmailAddressForChangePassword"
	And user click on profile link
	When user click on change password icon
	And user enters current password
	And user enters new password
	And user clicks on Update button
	And user clicks on one of the category and navigates to LOne 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page
	And user is not logged out
	
	
