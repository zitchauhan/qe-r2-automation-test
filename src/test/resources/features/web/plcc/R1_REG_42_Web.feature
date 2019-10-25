Feature: PLCC: Registration-Address Verification Modal

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page plcc
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
	And user enter Address plcc "Address2"
	And user expect element Zip Code to be present 
	And user enter Zip Code "Zip_Code" 
	And user expect element City to be present 
	And user expect element State to be present 
	And user expect element Phone number to be present 
	And user enters Phone Number "Phone_Number" 
	And user expect element SIGN UP to be present 
	And user click on SIGN UP 
	
@C-PLCC @Regression @All @PLCC-42 @CR-VS 
Scenario: Verify the elements available on Address Verification model 
	When user expect element entered address to be present 
    Then user expect element suggested address to be present
	And user expect element User Select Address to be present

@C-PLCC @Regression @All @PLCC-42 @CR-VS 
Scenario: Verify user is able to select user entered address
 	When user expect element entered address to be present 
    Then user expect element suggested address to be present
	And user click on entered address 
	
@C-PLCC @Regression @All @PLCC-42 @CR-VS 
Scenario: Verify user is able to navigates to shopping bag after clicking on Let's Shop button 
	And user expect element User Select Address to be present 
	And user click on suggested address 
	When user click on User Select Address 
	Then user navigates to registration confirmation page 
	When user expect element LET'S SHOP button to be present
	And click on LET'S SHOP button
	And user navigates to ASO-Home page 
	
@C-PLCC @Regression @All @PLCC-42 @CR-Manju @Tempdisabled 
Scenario: Verify the Address in MyAccount section
	When user expect element User Select Address to be present 
	Then user click on User Select Address
	When user click on My Account link  
    And user click on Address Book in MyAccount link
    And user expect element Address Book to be present
    And user expect element Add New Address link to be present
    
#Duplicate scenario    	
#@C-PLCC @Regression @All @PLCC-42 @CR-Manju @Tempdisabled 
#Scenario: Verify the Address in MyAccount section
#	When user click on My Account link 
#	And user expect element Email Address to be present 
#	And user enter Email address in sign-in page "Email_IdentifyCardType" 
#	And user enter password in sign-in page "password" 
#	And user click on Signin-button 