Feature: PLCC: Checkout - Payment Using PLCC 

Background: Common Pre-requisite steps 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_OrderPlacement" 
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
	
@C-PLCC @Regression @All @PLCC-84 @CR-VS 
Scenario: Verify an error message when user enters wrong card number and click on review order button 
	When user handles adding new card "InvalidCard" if already card is saved 
	And user click on REVIEW ORDER button 
	Then user expect element Unrecognized card number to be present 
	
@C-PLCC @Regression @All @PLCC-84 @CR-VS @AutomationSanityR2
Scenario: Verify user is able to navigate to confirm order page by clicking on review order button 
	When user handles adding new card "ValidPLCCCard" if already card is saved 
	And user click on REVIEW ORDER button 
	And user click on PLACE ORDER button 
	Then user navigates to order confirmation page 
	And user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present 
	And user expect element Order Number to be present 
	And user expect element a confirmation email is on its way to be present 
	And user expect element print link to be present 
	And user expect element my account link to be present 
	When user click on My Account link 
	And user click on Payments link 
	Then delete all credit cards from My Account 
	
	#@C-PLCC @Regression @All @PLCC-84 @CR-VS 
	#Scenario: Verify an error message when user enters invalid shipping information and click on review order button
	
@C-PLCC @Regression @All @PLCC-84 @CR-VS @AutomationSanityR2
Scenario: Verify user is able to navigate to confirm order page by using VISA Credit card card 
	When user handles adding new card "ValidVISACard" if already card is saved 
	And user enter expiry date "ExpiryDate" 
	And user enter cvv "cvv" 
	And user click on REVIEW ORDER button 
	And user click on PLACE ORDER button 
	Then user navigates to order confirmation page 
	And user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present 
	And user expect element Order Number to be present 
	And user expect element a confirmation email is on its way to be present 
	And user expect element print link to be present 
	And user expect element my account link to be present 
	When user click on My Account link 
	And user click on Payments link 
	Then delete all credit cards from My Account 
	
@C-PLCC @Regression @All @PLCC-84 @CR-VS @AutomationSanityR2
Scenario: Verify user is able to navigate to confirm order page by using Amex Credit card  
	When user handles adding new card "ValidAmexCard" if already card is saved 
	And user enter expiry date "ExpiryDate" 
	And user enter cvv "cvvAmex" 
	And user click on REVIEW ORDER button 
	And user click on PLACE ORDER button 
	Then user navigates to order confirmation page 
	And user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present 
	And user expect element Order Number to be present 
	And user expect element a confirmation email is on its way to be present 
	And user expect element print link to be present 
	And user expect element my account link to be present 
	When user click on My Account link 
	And user click on Payments link 
	Then delete all credit cards from My Account 
	
@C-PLCC @Regression @All @PLCC-84 @CR-VS @AutomationSanityR2
Scenario: Verify user is able to navigate to confirm order page by using Master Credit card 
	When user handles adding new card "ValidMasterCard" if already card is saved  
	And user enter expiry date "ExpiryDate" 
	And user enter cvv "cvv" 
	And user click on REVIEW ORDER button 
	And user click on PLACE ORDER button 
	Then user navigates to order confirmation page 
	And user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present 
	And user expect element Order Number to be present 
	And user expect element a confirmation email is on its way to be present 
	And user expect element print link to be present 
	And user expect element my account link to be present 
	When user click on My Account link 
	And user click on Payments link 
	Then delete all credit cards from My Account 
	
@C-PLCC @Regression @All @PLCC-84 @CR-VS @AutomationSanityR2 
Scenario: Verify user is able to navigate to confirm order page by using Discover Credit card 
	When user handles adding new card "ValidDiscoverCard" if already card is saved 
	And user enter expiry date "ExpiryDate" 
	And user enter cvv "cvv" 
	And user click on REVIEW ORDER button 
	And user click on PLACE ORDER button 
	Then user navigates to order confirmation page 
	And user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present 
	And user expect element Order Number to be present 
	And user expect element a confirmation email is on its way to be present 
	And user expect element print link to be present 
	And user expect element my account link to be present 
	When user click on My Account link 
	And user click on Payments link 
	Then delete all credit cards from My Account 
	