Feature: Registration 

Background:  Common Pre-requisite steps
    Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And  user click on Sign Up link 
	
@C-PLCC @Regression @All @PLCC-41 @CR-VS	
Scenario: Verify the system behavior when user unselects Add Address for faster checkout process check box in registration page
	When user select Add Address for Faster Checkout checkbox
	Then user expect element Add company name, Apt.Number, etc. (Optional) to be present
	Then user expect element Address to be present
	And user expect element Zip Code to be present
	And user expect element City to be present
	And user expect element State to be present
	And user expect element Phone number to be present
	When user unselect Add Address for Faster Checkout checkbox
	Then user expect element Add company name, Apt.Number, etc. (Optional) to not be present
	And user expect element Address to not be present
	And user expect element Zip Code to not be present
	And user expect element City to not be present
	And user expect element State to not be present
	And user expect element Phone number to not be present