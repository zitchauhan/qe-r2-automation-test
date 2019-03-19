Feature: PLCC: Registration New user creation

Background:  Common Pre-requisite steps
    Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And  user click on Sign Up link 

@C-PLCC @Regression @All @PLCC-41 @CR-VS
Scenario: Verify the system behavior when user selects Add Address for faster checkout process  checkbox in registration page	
	Then user expect element First Name to be present
	And user expect element Last Name to be present
	And user expect element Email Address to be present
	And user expect element Create Password to be present
	And user expect element Add Address for Faster Checkout checkbox to be present
	When user select Add Address for Faster Checkout checkbox
	Then user expect element Address to be present
	And user expect element Zip Code to be present
	And user expect element City to be present
	And user expect element State to be present
	And user expect element Phone number to be present
	And user expect element SIGN UP to be present

@C-PLCC @Regression @All @PLCC-41 @CR-VS
Scenario: Verify the system behavior when user selects Add Company Name, Apt. Number, etc. (Optional) link
	Then user select Add Address for Faster Checkout checkbox
	And user click on Add Company name, Apt. Number, etc. (Optional) link
	And user expect element Add company name, Apt.Number, etc. (Optional) to be present
	
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
	
@C-PLCC @Regression @All @PLCC-41 @CR-VS  
Scenario: Verify the system behavior when user reselects Add Address for faster checkout process check box  in registration page
	When user select Add Address for Faster Checkout checkbox
	Then user expect element Add company name, Apt.Number, etc. (Optional) to be present
	And user expect element Address to be present
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
	When user select Add Address for Faster Checkout checkbox
	Then user expect element Add company name, Apt.Number, etc. (Optional) to be present
	And user expect element Address to be present
	And user expect element Zip Code to be present
	And user expect element City to be present
	And user expect element State to be present
	And user expect element Phone number to be present


	 


