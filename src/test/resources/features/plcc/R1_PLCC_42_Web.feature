Feature: Registration 

Background: 
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
Scenario: Verify the display of address verification model after clicking on Sign Up button when AVS is unable to verify the provided address
	And user expect element User Select Address to be present


@C-PLCC @Regression @All @PLCC-42 @CR-VS
Scenario: Verify the elements available on Address Verification model 
	When user expect element entered address to be present 
    Then user expect element suggested address to be present
	And user expect element User Select Address to be present

@C-PLCC @Regression @All @PLCC-42 @CR-VS
Scenario: Verify whether user able to select enetered address and proceed to register 
 	When user expect element entered address to be present 
    Then user expect element suggested address to be present
	And user click on entered address 
	
@C-PLCC @Regression @All @PLCC-42 @CR-VS 
Scenario: Verify whether user able to select suggested address and proceed to register 
	And user expect element User Select Address to be present 
	And user click on suggested address 
	When user click on User Select Address 
	Then user navigates to registration confirmation page 
	
@C-PLCC @Regression @All @PLCC-42 @CR-VS
Scenario: Verify whether user able to navigate to registration confirmation page 
	And user expect element User Select Address to be present 
	And user click on suggested address 
	When user click on User Select Address 
	Then user navigates to registration confirmation page 
	When user expect element LET'S SHOP button to be present
	And click on LET'S SHOP button
	And user navigates to ASO-Home page 