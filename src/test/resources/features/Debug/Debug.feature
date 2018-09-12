Feature: Debug Testing

#Failing - Known Issue
@R2_Mobile @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4011 @ZYP_MYACCOUNT_K4011-10049_M @CR-SK
Scenario: Verify the user gets the error message when Login id is left blank
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu
	And user clicks on sign in link from burger menu 
	When user enter the valid emailaddress "BlankEmailAddress"
	And user enter the valid password "Password" 
	And user click on signin button
	Then Verify the message on the page 
		|# Following error Message should show on the page	|
		|Please enter email address							|
	