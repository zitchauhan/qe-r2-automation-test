Feature: PLCC: Checkout_Payment Using PLCC 

Background: User Login and common steps for identifying card type entering BIN 
	Given user launches the browser and navigates to "ASO_HOME" page plcc
#	When user click on My Account link 
#	And user expect element Email Address to be present 
#	And user enter Email address in sign-in page "Email_IdentifyCardType" 
#	And user enter password in sign-in page "password" 
#	And user click on Signin-button 
#	Then user navigates to ASO-Home page 
#	When user click on My Account link
#	And user click on Payments link
#	Then delete all credit cards from My Account
#	And user clears everything in cart
#	When user enters "SKUIdOfProduct" in the search box plcc
#	And user click on search icon 
#	#And user click on Add to Cart Button 
#	And user click on ship it button
#	And user click on viewcart button
#	Then user navigates to Cart Page
#	And user clicks on checkout button on cart page
#	And user clicks on checkout button and navigates to checkout page

@C-PLCC @Regression @All @PLCC-87 @CR-VS 
Scenario: Verify the PLCC card image in footer when customer is on checkout page 
	Then user expect element plcc card image in footer to be present
	
	