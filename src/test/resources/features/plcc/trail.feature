Feature: Registration 
@Regression @Web @All @C-VidyaSiddaramappa @PLCC-42 
Scenario:
Verify whether user able to select enetered address and proceed to register 
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
	And user expect element City text to equal "city" 
	And user expect element State to be present 
	And user expect element State text to equal "state" 
	And user expect element Phone number to be present 
	And user enter Phone Number "Phone_Number" 
	And user expect element SIGN UP to be present 
	And user click on SIGN UP 
	And user expect element User Select Address to be present 
	And user click on entered address 
	When user click on User Select Address 
	Then user navigates to registration confirmation page 
	
