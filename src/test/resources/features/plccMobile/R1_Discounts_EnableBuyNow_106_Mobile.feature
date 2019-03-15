Feature: PLCC Discounts for Enable BuyNow For Mobile

@C-PLCC @Regression @All @PLCC-106 @CR-Manju @Mobile
Scenario: Verify user can process the order using Enable Buy Now
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on burger menu
	And user click on My Account link of mobile
	And user click on Sign Up link   
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
	And user enter Address plcc "Address"
	And user expect element Zip Code to be present 
	And user enter Zip Code "Zip_Code" 
	And user expect element City to be present 
	And user expect element State to be present 
	And user expect element Phone number to be present 
	And user enters Phone Number "Phone_Number" 
	And user expect element SIGN UP to be present 
	And user click on SIGN UP 
	And user expect element User Select Address to be present 
	And user click on suggested address 
	When user click on User Select Address
	And user click on expand academy search icon
	When user enters "SKUIdOfProduct" in the search box plcc for mobile
	And user click on search icon for mobile
	And user click on Enable BuyNow button
	When user handles adding new card "ValidPLCCCard" if already card is saved 
	And user select SameAsShippingAddress checkbox
	And user enter Email Address "EnableBuyNowEmail_Address" for Enable BuyNow page
	And user click on Default PaymentFormSubmit Button for BuyNow
	And user expect element User Select Address to be present 
	#And user click on suggested address 
	When user click on User Select Address
	