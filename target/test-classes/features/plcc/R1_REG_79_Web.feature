Feature: Registration 

Background:  Common Pre-requisite steps
Given user launches the browser and navigates to "ASO_HOME" page
When user click on My Account link 
And  user click on Sign Up link  

@C-PLCC @Regression @All @PLCC-79 @CR-VS
Scenario: Verify auto population of city and state when user provides valid zip code
	Then user expect element First Name to be present
	And user enter First Name "First_Name" 
	And user expect element Last Name to be present
	And user enter Last Name "Last_Name"
	And user expect element Email Address to be present
	And user enter Email Address "Email_Address"
	And user expect element Create Password to be present
	And user enter Password "Create_Password"
	And user expect element Add Address for Faster Checkout checkbox to be present
	And user select Add Address for Faster Checkout checkbox
	And user expect element Address to be present
	And user enter Address "Address"
	And user expect element Zip Code to be present
	And user enter Zip Code "Zip_Code"
	And user expect element City to be present
	And user expect element City text to equal "city"
	And user expect element State to be present
	And user expect element State text to equal "state"

@C-PLCC @Regression @All @PLCC-79 @CR-VS
Scenario: Verify system behavior when user provides invalid zip code
	Then user select Add Address for Faster Checkout checkbox 
	And user click on SIGN UP 
	And user expect Please enter the First Name to be present 
	And user expect Please enter a Last Name to be present 
	And user expect Please enter an email address to be present 
	And user expect Please enter the Password to be present 
	And user expect Address is required to be present 
	And user expect City is required Name to be present 
	And user expect State is required to be present 
	And user enter Zip Code "Invalid_ZipCode" 
	And user expect Invalid Zip code to be present 
	And user expect Mobile number is required to be present 