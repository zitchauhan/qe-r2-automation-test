Feature: Registration 

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And  user click on Sign Up link 
	Then user expect element First Name to be present 	
	And user enter First Name "First_Name" 
	And user expect element Last Name to be present 
	And user enter Last Name "Last_Name" 
	And user expect element Email Address to be present 
	And user enter Email Address "Email_Address" 
	And user expect element Create Password to be present 
	And user enter Password "Create_Password" 
	And user expect element Add Address for Faster Checkout checkbox to be present 
	When user select Add Address for Faster Checkout checkbox 
	Then user expect element Address to be present 
	And user enter Address "Address" 
	And user expect element Zip Code to be present 
	And user enter Zip Code "Zip_Code" 
	And user expect element City to be present 
	And user expect element State to be present 
	And user expect element Phone number to be present 
	And user enter Phone Number "Phone_Number" 
	And user expect element SIGN UP to be present 
	And user click on SIGN UP 
	

@C-PLCC @Regression @All @PLCC-42 @CR-VS
Scenario: Verify the Address in MyAccount section
	When user expect element User Select Address to be present 
	Then user click on User Select Address
	When user click on My Account link  
    And user click on Address Book in MyAccount link
    And user expect element Address Book to be present
    And user expect element Add New Address link to be present
   # And user expect element for first name and Last name text
    
