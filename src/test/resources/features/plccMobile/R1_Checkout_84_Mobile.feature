Feature: PLCC: Checkout - Payment Using PLCC 

Background: Common Pre-requisite steps 
<<<<<<< HEAD
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on burger menu 
	And user click on My Account link of mobile
	And user enter Email address in sign-in page "Email_OrderPlacement" 
	And user enter password in sign-in page "password" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page
	When user enters "SKUIdOfProduct" in the search box plcc for mobile
    And user click on search icon for mobile
	And user click on Add to Cart button  
	And user click on checkout from ATC pop up plcc
	And user clicks on checkout button and navigates to checkout page 
	
@C-PLCC @Regression @All @PLCC-84 @CR-VS @Mobile 
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
	
@C-PLCC @Regression @All @PLCC-84 @CR-VS 
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

	
@C-PLCC @Regression @All @PLCC-84 @CR-Manju @Mobile  
Scenario: Verify an error message when user enters wrong card number and click on review order button 
	When user handles adding new card "InvalidCard" if already card is saved 
	And user click on REVIEW ORDER button 
	Then user expect element Unrecognized card number to be present 
	
@C-PLCC @Regression @All @PLCC-84 @CR-Manju @Mobile 
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
	
	
@C-PLCC @Regression @All @PLCC-84 @CR-Manju @Mobile 
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

        
