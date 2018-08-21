Feature: Debug Testing

@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4230-10078 @CR-SK
Scenario: Verify user is able to enter the Forgot Password page from Forgot Password link
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header
	And user logs in as "EmailAddressForChangePassword"
	And user click on my account link
	And user click on profile link
	When user click on change password icon
	And user enters current password
	And user enters new password
	And user clicks on Update button
	Then user should be able to change password