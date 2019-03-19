Feature: PLCC: Checkout_Payment Using PLCC  : Identify Card Type

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_IdentifyCardType" 
	And user enter password in sign-in page "password" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page 
	When user click on My Account link
	And user click on Payments link
	Then delete all credit cards from My Account
	And user clears everything in cart
	When user enters "SKUIdOfProduct" in the search box plcc
	And user click on search icon 
	#And user click on Add to Cart Button 
	And user click on Add to Cart button
	And user click on checkout from ATC pop up plcc
	And user clicks on checkout button and navigates to checkout page 
	
	
@C-PLCC @Regression @All @PLCC-80 @CR-VS @AutomationSanityR2
Scenario: Verify the system behavior when user enter 778 as three digit BIN number 
	And user handles adding new card "starting3digitsplccCard" if already card is saved
	Then user expect selected credit card image on credit card text field  
	And user expect element plcc credit card image on credit card text field to present 
	
@C-PLCC @Regression @All @PLCC-80 @CR-VS	
Scenario: Verify the system behavior when user enter 40 as two digit BIN number 
	And user handles adding new card "starting2digitsvisaCard" if already card is saved
	Then user expect selected credit card image on credit card text field 
	And user expect element visa card image on credit card text field to present 
	
@C-PLCC @Regression @All @PLCC-80 @CR-VS	
Scenario: Verify the system behavior when user enter 54 as two digit BIN number 
	And user handles adding new card "starting2digitsmasterCard1" if already card is saved
	Then user expect selected credit card image on credit card text field 
	And user expect element master card image on credit card text field to present 
	
@C-PLCC @Regression @All @PLCC-80 @CR-VS	
Scenario: Verify the system behavior when user enter 55 as two digit BIN number 
	And user handles adding new card "starting2digitsmasterCard2" if already card is saved 
	Then user expect selected credit card image on credit card text field 
	And user expect element master card image on credit card text field to present

@C-PLCC @Regression @All @PLCC-80 @CR-VS
Scenario: Verify the system behavior when user enter 37 as two digit BIN number 
	And user handles adding new card "starting2digitamexCard1" if already card is saved
	Then user expect selected credit card image on credit card text field 
	And user expect element amex card image on credit card text field to present 
	
Scenario: Verify the system behavior when user enter 34 as two digit BIN number 
	And user handles adding new card "starting2digitamexCard2" if already card is saved
	Then user expect selected credit card image on credit card text field 
	And user expect element amex card image on credit card text field to present
	When user click on My Account link 
	And user click on Payments link 
	Then delete all credit cards from My Account 
	
@C-PLCC @Regression @All @PLCC-80 @CR-VS @AutomationSanityR2
Scenario: Verify the system behavior when user enter 65 as two digit BIN number 
	And user handles adding new card "starting2digitsdiscoverCard" if already card is saved
	Then user expect selected credit card image on credit card text field 
	And user expect element discover card image on credit card text field to present
	When user click on edit my cart link 
	Then user click on remove from cart 

@C-PLCC @Regression @All @PLCC-80 @CR-VS
Scenario: Verify the system behavior when user enter invalid digits as BIN number 
	And user handles adding new card "InvalidCard" if already card is saved
	Then user expect element invalid card type error message to present 
	When user click on expiry date text field
	Then user expect element Unrecognized card number to be present
	When user click on edit my cart link 
	Then user click on remove from cart 
	
@C-PLCC @Regression @All @PLCC-80 @CR-VS	
Scenario: Verify the display of saved card on payment section of checkout page
	And user handles adding new card "ValidPLCCCard" if already card is saved
	And user check element payment section to be present 
	And user click on REVIEW ORDER button
	Then user expect element saved card on payment section of checkout page to be present 
	When user click on My Account link 
	And user click on Payments link 
	Then delete all credit cards from My Account 
	
