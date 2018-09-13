Feature: [Mobile] B07-200 Checkout| Signed In User| Pay using saved Credit Card 

@R2_Mobile @R2_Regression @R2_All @P-Higest @1HR  @C-Checkout @KER-5892 @ZYP_CHECKOUT_K5892-8201 @CR-RKA
Scenario: Verify user is able to see the list of saved credit cards on Checkout while Payment
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	When user clicks on SignIn link from global header
   And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
	Then User clicks on the burger menu
   And User navigates to LThree
	And user clicks on the product card and navigates to PDP 
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
    Then user click on checkout from ATC pop up
    Then Verify below Sub/Main Module of Checkout Page
    |#verify  credit card is selected  | 
     |ChooseCreditcard_Dd|
 

@R2_Mobile @R2_Regression @R2_All @P-Low  @C-Checkout @KER-5892 @ZYP_CHECKOUT_K5892-8203 @CR-RKA
Scenario: Verify user selected credit card is visually indicated in the drop-down
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	When user clicks on SignIn link from global header
   And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
    Then User clicks on the burger menu
	 And User navigates to LThree
	And user clicks on the product card and navigates to PDP 
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
    Then user click on checkout from ATC pop up
    Then user click on credit card dropdown
    Then Verify below Sub/Main Module of Checkout Page
    |#verify  credit card DD is highlighting after clicking on choose creditcard DD  | 
     |ChooseCreditcard_Dd|

@R2_Mobile @R2_Regression @R2_All @P-High  @C-Checkout @KER-5892 @ZYP_CHECKOUT_K5892-10814 @CR-RKA
Scenario:  Verify the user is able to add a new credit card while payment that is displayed in active order only
Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	When user clicks on SignIn link from global header
   And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
	Then User clicks on the burger menu
	 And User navigates to LThree
	And user clicks on the product card and navigates to PDP 
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
    Then user click on checkout from ATC pop up
    Then user click on credit card dropdown
    Then user click on Add new credit card 
     Then Verify below Sub/Main Module of Checkout Page
     |#verify credit card number ,expirydate and cvv input box is displayed|
     |CreditCardNumber_Input|
		|ExpirationDate_Input|
		|Cvv_Input|
		
		
		#pending
#		@R2_Web @R2_Regression @R2_All @P-High  @C-Checkout @KER-5892 @ZYP_CHECKOUT_K5892-10816 @CR-RKA
#Scenario:  Verify the user is able to add a new credit card while payment that is displayed in active order only
#Given user launches the browser and navigates to "ASO_HOME" page 
#	When user clicks on SignIn link from global header
#   And user enter the valid emailaddress "EmailAddress" 
#	And user enter the valid password "Password" 
#    And user click on signin button
#	And User navigates to L2 Mens clothing
#    Then user clicks on one of the subcategory and navigates to LTwo
#    Then user clicks on one of the product category and navigates to LThree
#	Then User is navigated to pdp page
#	Then user click on Add to Cart Button
#	Then user is navigated to Add to cart Notification popup 
#    Then user click on checkout from ATC pop up
#    Then user click on review order
#    
