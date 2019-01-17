Feature: PLCC: Checkout - Payment Using PLCC 


Background: User Login and common steps for identifying card type entering BIN 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_Address_2" 
	And user enter password in sign-in page "Password_2" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page 
	#And user expect element ASO Home Page Title to be present
	When user enters "SKUIdOfProduct" in the search box 
	And user click on search icon 
	And user click on Add to cart button 
	And user click on checkout from ATC pop up 
	And user clicks on checkout button and navigates to checkout page 
	#And user selects credit card radio button
	And user expect element credit card text field is present 
	
@C-PLCC @Regression @All @PLCC-80 @CR-VS	
Scenario: Verify the system behavior when user enter 778 as three digit BIN number 
	When user enter plcc card "starting3digitsplccCard"
	Then user expect selected credit card image on credit card text field  
	And user expect element plcc credit card image on credit card text field to present 
	
@C-PLCC @Regression @All @PLCC-80 @CR-VS	
Scenario: Verify the system behavior when user enter 40 as two digit BIN number 
	When user enter visa card "starting2digitsvisaCard" 
	Then user expect selected credit card image on credit card text field 
	And user expect element visa card image on credit card text field to present 
	
@C-PLCC @Regression @All @PLCC-80 @CR-VS	
Scenario: Verify the system behavior when user enter 54/55 as two digit BIN number 
	When user enter master card "starting2digitsmasterCard" 
	Then user expect selected credit card image on credit card text field 
	And user expect element master card image on credit card text field to present 

@C-PLCC @Regression @All @PLCC-80 @CR-VS
Scenario: Verify the system behavior when user enter 37/34 as two digit BIN number 
	When user enter amex card "starting2digitamexCard" 
	Then user expect selected credit card image on credit card text field 
	And user expect element amex card image on credit card text field to present 
	
@C-PLCC @Regression @All @PLCC-80 @CR-VS
Scenario: Verify the system behavior when user enter 65 as two digit BIN number 
	When user enter discover card "starting2digitsdiscoverCard" 
	Then user expect selected credit card image on credit card text field 
	And user expect element discover card image on credit card text field to present 

@C-PLCC @Regression @All @PLCC-80 @CR-VS	
Scenario: Verify the system behavior when user enter invalid digits as BIN number 
	When user enter plcc card "InvalidCard" 
	Then user expect element invalid card type error message to present 
	When user click on expiry date text field
	Then user expect element Unrecognized card number to be present
	When user click on edit my cart link 
	Then user click on remove from cart 
	