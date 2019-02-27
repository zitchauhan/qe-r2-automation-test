Feature: PLCC: Checkout - Payment Using PLCC  

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_IdentifyCardType" 
	And user enter password in sign-in page "password" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page 
	When user enters "SKUIdOfProduct" in the search box 
	And user click on search icon 
	#And user click on Add to Cart Button 
	And user click on Add to Cart button  
	And user click on checkout from ATC pop up 
	And user clicks on checkout button and navigates to checkout page 
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
Scenario: Verify the system behavior when user enter 54 as two digit BIN number 
	When user enter master card "starting2digitsmasterCard" 
	Then user expect selected credit card image on credit card text field 
	And user expect element master card image on credit card text field to present 
	
@C-PLCC @Regression @All @PLCC-80 @CR-VS	
Scenario: Verify the system behavior when user enter 55 as two digit BIN number 
	When user enter master card "starting2digitsmasterCard1" 
	Then user expect selected credit card image on credit card text field 
	And user expect element master card image on credit card text field to present

@C-PLCC @Regression @All @PLCC-80 @CR-VS
Scenario: Verify the system behavior when user enter 37 as two digit BIN number 
	When user enter amex card "starting2digitamexCard1" 
	Then user expect selected credit card image on credit card text field 
	And user expect element amex card image on credit card text field to present 
	
Scenario: Verify the system behavior when user enter 34 as two digit BIN number 
	When user enter amex card "starting2digitamexCard2" 
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
	
@C-PLCC @Regression @All @PLCC-80 @CR-VS	
Scenario: Verify the display of saved card on payment section of checkout page
When user check element payment section to be present
Then user expect element saved card on payment section of checkout page to be present

