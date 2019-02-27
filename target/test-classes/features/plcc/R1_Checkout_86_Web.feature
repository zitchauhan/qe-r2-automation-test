Feature: PLCC: Checkout - Payment Using PLCC  

	Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_SavedCard" 
	And user enter password in sign-in page "password" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page 
	When user enters "SKUIdOfProduct" in the search box plcc
	And user click on search icon 
	#And user click on Add to Cart Button 
	And user click on Add to Cart button  
	And user click on checkout from ATC pop up plcc
	And user clicks on checkout button and navigates to checkout page 
	And user expect element credit card text field is present 
	
	@C-PLCC @Regression @All @PLCC-86 @CR-VS
	Scenario: Verify the default payment method when tries to  place an another order
	When user enter visa card "ValidPLCCCard"
	And user click on REVIEW ORDER button
	And user click on PLACE ORDER button
	Then user navigates to order confirmation page
	And user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present
	And user expect element Order Number to be present
	And user expect element a confirmation email is on its way to be present
	And user expect element print link to be present
	And user expect element my account link to be present
	When user enters "SKUIdOfProduct" in the search box plcc
	And user click on search icon 
	#And user click on Add to Cart Button 
	And user click on Add to Cart button  
	And user click on checkout from ATC pop up plcc
	And user clicks on checkout button and navigates to checkout page 
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
	
	@C-PLCC @Regression @All @PLCC-86 @CR-VS
	Scenario: Verify user is able to change default PLCC credit card to other credit on payment section of checkout page
	When user enter visa card "ValidPLCCCard"
	And user click on REVIEW ORDER button
	And user click on PLACE ORDER button
	Then user navigates to order confirmation page
	And user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present
	And user expect element Order Number to be present
	And user expect element a confirmation email is on its way to be present
	And user expect element print link to be present
	And user expect element my account link to be present
	When user enters "SKUIdOfProduct" in the search box plcc
	And user click on search icon 
	#And user click on Add to Cart Button 
	And user click on Add to Cart button  
	And user click on checkout from ATC pop up plcc
	And user clicks on checkout button and navigates to checkout page 
	And user clicks on edit link on payment section
	And user select add new card option
	When user enter visa card "ValidPLCCCard"
	And user click on confirm button plcc
	And user clicks on edit link on payment section
	And user click on credit card drop down
	And user select add new card option
	When user enter visa card "ValidVISACard"
	And user enter expiry date "ExpiryDate" 
	And user enter cvv "cvv"
	And user click on confirm button plcc
	And user clicks on edit link on payment section
	And user click on credit card drop down
	And user select add new card option
	When user enter visa card "ValidMasterCard"
	And user enter expiry date "ExpiryDate" 
	And user enter cvv "cvv"
	And user click on confirm button plcc
	And user clicks on edit link on payment section
	And user click on credit card drop down
	And user select add new card option
	When user enter visa card "ValidAmexCard"
	And user enter expiry date "ExpiryDate" 
	And user enter cvv "cvvAmex"
	And user click on confirm button plcc
	And user clicks on edit link on payment section
	And user click on credit card drop down
	And user select add new card option
	When user enter visa card "ValidDiscoverCard"
	And user enter cvv "cvv"
	And user click on confirm button plcc
	When user click on My Account link
	And user click on Payments link
	Then delete all credit cards from My Account
	
	
	
	
	
	