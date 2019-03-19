Feature: PLCC: Checkout_Payment with Multiple Order Placement
                
@C-PLCC @Regression @All @PLCC-84 @CR-VS @PlaceMultiOrders
Scenario: Verify user is able to place Multiple orders using PLCC Card 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_MultiOderPlacement" 
	And user enter password in sign-in page "password" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page 
	When user click on My Account link
	And user click on Payments link
	Then delete all credit cards from My Account
	And user clears everything in cart
	When user enters "SKUIdOfProduct" in the search box plcc 
	And user click on search icon 
	And user click on Add to Cart button 
	And user click on checkout from ATC pop up plcc 
	And user clicks on checkout button and navigates to checkout page 
	And user expect element credit card text field is present 
	When user handles adding new card "ValidPLCCCard" if already card is saved 
	#And user uncheck Save Payment Info for Later Checkbox 
	And user click on REVIEW ORDER button 
	And user click on PLACE ORDER button 
	Then user navigates to order confirmation page 
	And user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present 
	And user expect element Order Number to be present 
	And user expect element a confirmation email is on its way to be present 
	And user expect element print link to be present 
	And user expect element my account link to be present 
	And user place fifty orders and see the response with "SKUIdOfProduct1" with PLCC Card "ValidPLCCCard"
	
