Feature: Registration 

@Regression @Web @All @C-VidyaSiddaramappa @PLCC-41  
Scenario: Verify the presence of Add Address for faster checkout process checkbox 
	Given user launches the browser and navigates to "ASO_HOME" page
	When user click on burger menu 
	And user click on My Account link 
	And  user click on Sign Up link 
	Then user expect element Add Address for Faster Checkout checkbox to be present
	 
