Feature: Registration 

Background: Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And  user click on Sign Up link 
	Then user select Add Address for Faster Checkout checkbox 
	And user click on SIGN UP 
	And user expect Please enter the First Name to be present 
	And user expect Please enter a Last Name to be present 
	And user expect Please enter an email address to be present 
	And user expect Please enter the Password to be present 
	And user expect Address is required to be present 
	And user expect City is required Name to be present 
	And user expect State is required to be present 
	
@C-PLCC @Regression @All @PLCC-50 @CR-VS 
Scenario: Verify an error message without providing mandatory fields.
#<Note: without providing ADDRESS, Zip Code, CITY, State and Phone number>
	And user expect Zip code is required Name to be present 
	And user expect Mobile number is required to be present 
	
@C-PLCC @Regression @All @PLCC-50 @CR-VS 
Scenario: Verify an error message when user provides invalid data
#<Note: Provided invalid ADDRESS, Zip Code, CITY, State and Phone number>
	And user enter Zip Code "Invalid_ZipCode" 
	And user expect Invalid Zip code to be present 
	And user expect Mobile number is required to be present 
	
	
