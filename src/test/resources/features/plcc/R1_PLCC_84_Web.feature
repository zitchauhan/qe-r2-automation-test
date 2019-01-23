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

@C-PLCC @Regression @All @PLCC-84 @CR-VS 
Scenario: Verify an error message when user enters wrong card number and click on review order button 
	When user enter plcc card "InvalidCard" 
	And user click on REVIEW ORDER button
	Then user expect element error message to be present
    #Print oder number 
	#clickOnButton(r2CheckOutPo.ReviewOrder_Btn);
	
@C-PLCC @Regression @All @PLCC-84 @CR-VS 
Scenario: Verify user is able to navigate to confirm order page by clicking on review order button by using existing PLCC card
	When user enter plcc card "ValidPLCCCard" 
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
	#Address of existing PLCC card and address in your account should be same
	
@C-PLCC @Regression @All @PLCC-84 @CR-VS 
Scenario: Verify user is able to navigate to confirm order page by using VISA Credit card card
	When user enter visa card "ValidVISACard"
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
	
 @C-PLCC @Regression @All @PLCC-84 @CR-VS 
Scenario: Verify user is able to navigate to confirm order page by using Amex Credit card
	When user enter plcc card "ValidAmexCard" 
	And user enter expiry date "ExpiryDate" 
	And user enter cvv "cvv"
	And user click on REVIEW ORDER button
	And user click on PLACE ORDER button
	Then user navigates to order confirmation page
    #Print oder number
    

@C-PLCC @Regression @All @PLCC-84 @CR-VS 
Scenario: Verify user is able to navigate to confirm order page by using Master Credit card
	When user enter visa card "ValidMasterCard"
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
        
@C-PLCC @Regression @All @PLCC-84 @CR-VS 
Scenario: Verify user is able to navigate to confirm order page by using Discover Credit card
	When user enter plcc card "ValidDiscoverCard" 
	And user enter expiry date "ExpiryDate" 
	And user enter cvv "cvv"
	And user click on REVIEW ORDER button
	And user click on PLACE ORDER button
	Then user navigates to order confirmation page
    #Print oder number

Scenario: Verify user is able to place bulk orders
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_Address_1" 
	And user enter password in sign-in page "Password_1" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page 
	When user enters "SKUIdOfProduct" in the search box 
	And user click on search icon 
	And user click on Add to cart button 
	And user click on checkout from ATC pop up 
	And user clicks on checkout button and navigates to checkout page 
	And user expect element credit card text field is present 
	When user enter plcc card "ValidPLCCCard" 
	And user click on REVIEW ORDER button
	And user click on PLACE ORDER button
	Then user navigates to order confirmation page
	And user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present
	And user expect element Order Number to be present
	And user expect element a confirmation email is on its way to be present
	And user expect element print link to be present
	And user expect element my account link to be present
	And user place fifty orders and see the response with "SKUIdOfProduct1" with PLCC Card "ValidPLCCCard"
