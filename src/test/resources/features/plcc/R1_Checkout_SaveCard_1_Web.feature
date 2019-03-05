Feature: PLCC: Checkout - Payment Using PLCC  

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page 
	
@C-PLCC @Regression @All @PLCC-1 @CR-VS	
Scenario: Default ASO/PLcc credit card should be displayed on payment section for faster checkout process
	When user enters "SKUIdOfProduct" in the search box plcc 
	And user click on search icon 
	And user click on Add to Cart button 
	And user click on checkout from ATC pop up plcc 
	And user clicks on checkout button and navigates to checkout page 
	And user expect element credit card text field is present 
	Then user enter visa card "ValidPLCCCard" 
	And user check element payment section to be present 
	And user click on REVIEW ORDER button 
	And user click on PLACE ORDER button
	And user navigates to order confirmation page
	And user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present
	And user expect element Order Number to be present
	And user expect element a confirmation email is on its way to be present
	And user expect element print link to be present
	And user expect element my account link to be present
	When user enters "SKUIdOfProduct" in the search box plcc 
	And user click on search icon 
	And user click on Add to Cart button 
	And user click on checkout from ATC pop up plcc 
	And user clicks on checkout button and navigates to checkout page
	Then user expect element saved card on payment section of checkout page to be present
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
	
@C-PLCC @Regression @All @PLCC-1 @CR-VS	
Scenario: Verify the default payment method when user tries to place an another order with the different session
	When user enters "SKUIdOfProduct" in the search box plcc 
	And user click on search icon 
	And user click on Add to Cart button 
	And user click on checkout from ATC pop up plcc 
	And user clicks on checkout button and navigates to checkout page 
	And user expect element credit card text field is present 
	Then user enter visa card "ValidPLCCCard" 
	And user check element payment section to be present 
	And user click on REVIEW ORDER button 
	And user click on PLACE ORDER button
	And user navigates to order confirmation page
	And user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present
	And user expect element Order Number to be present
	And user expect element a confirmation email is on its way to be present
	And user expect element print link to be present
	And user expect element my account link to be present
	When user enters "SKUIdOfProduct" in the search box plcc 
	And user click on search icon 
	And user click on Add to Cart button 
	And user click on checkout from ATC pop up plcc 
	And user clicks on checkout button and navigates to checkout page
	Then user expect element saved card on payment section of checkout page to be present
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
	 
