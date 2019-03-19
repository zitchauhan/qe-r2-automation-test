Feature: PLCC: Checkout -Default Payment as PLCC _Mobile 

	Background: Common Pre-requisite steps 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on burger menu 
	And user click on My Account link of mobile
	And user enter Email address in sign-in page "Email_OrderPlacement" 
	And user enter password in sign-in page "password" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page
	And user clears everything in cart
	And user click on Academy Logo Icon
	When user enters "SKUIdOfProduct" in the search box plcc for mobile
    And user click on search icon for mobile
	And user click on Add to Cart button  
	And user click on checkout from ATC pop up plcc
	And user clicks on checkout button and navigates to checkout page 
	
	@C-PLCC @Regression @All @PLCC-86 @CR-VS @Mobile
	Scenario: Verify the default payment method when tries to  place an another order
	When user handles adding new card "ValidPLCCCard" if already card is saved 
	And user click on REVIEW ORDER button
	And user click on PLACE ORDER button
	Then user navigates to order confirmation page
	And user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present
	And user expect element Order Number to be present
	And user expect element a confirmation email is on its way to be present
	And user expect element print link to be present
	And user expect element my account link to be present
	When user enters "SKUIdOfProduct" in the search box plcc for mobile
	And user click on search icon for mobile
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
	