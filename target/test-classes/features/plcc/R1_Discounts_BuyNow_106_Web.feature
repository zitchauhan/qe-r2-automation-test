Feature: PLCC Discounts Buy now 

@C-PLCC @Regression @All @PLCC-106 @CR-Manju
Scenario: Verify user can process the order
Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "UserWithSavedAddressAndPayment" 
	And user enter password in sign-in page "BuynowPwd" 
	Then user click on Signin-button 
	And user navigates to ASO-Home page 
	When user enters "SKUForBuyNow" in the search box 
	And user click on search icon 
	And user click on Buy Now button
	And user click on Buy Now button in pop up modal
#	Then user navigates to order confirmation page
#	And user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present
#	And user expect element Order Number to be present
#	And user expect element a confirmation email is on its way to be present
#	And user expect element print link to be present
#	And user expect element my account link to be present