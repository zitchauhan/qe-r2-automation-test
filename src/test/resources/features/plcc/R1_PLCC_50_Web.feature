Feature: Registration 

Background: 
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
	
@Regression @Web @All @C-VidyaSiddaramappa @PLCC-50 @PLCC-127 
Scenario: Validate errors providing fields empty value 
	And user expect Zip code is required Name to be present 
	And user expect Mobile number is required to be present 
	
@Regression @Web @All @C-VidyaSiddaramappa @PLCC-50 @PLCC-128 
Scenario: Validate errors providing invalid zip code field 
	Then user select Add Address for Faster Checkout checkbox 
	And user enter Zip Code "Invalid_ZipCode" 
	And user expect Invalid Zip code to be present 
	And user expect Mobile number is required to be present 
	
@Regression @Web @All @C-VidyaSiddaramappa @PLCC-50 @PLCC-129 
Scenario: Validate errors providing invalid phone number field 
	And user enter Phone number "Invalid_PhoneNumber" 
	And user expect Mobile number can't be less than ten digits to be present 
	And user expect Zip code is required Name to be present
	
	