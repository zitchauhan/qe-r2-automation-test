Feature: B10-550 - Enable Buy Now Checkout

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6655 @ZYP_CHECKOUT_K6655-8666 @CR-MS
Scenario: Verify that Authenticated user is able to view Enable Buy Now button on PDP if user does not have saved payment and Shipping Address details
    Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User navigates to L2 Mens clothing
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree  
	When User is navigated to pdp page    
    Then Verify that Enable Buy Now button is displayed on PDP
    
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6655 @ZYP_CHECKOUT_K6655-8668 @CR-MS
Scenario: Verify that Authenticated user is able to view "Enable Buy Now" button on PDP if user does not have saved Shipping Address but has saved payment details
    Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailWithoutShipDetails" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User navigates to L2 Mens clothing
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree  
	When User is navigated to pdp page    
    Then Verify that Enable Buy Now button is displayed on PDP
    
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6655 @ZYP_CHECKOUT_K6655-8667 @CR-MS
Scenario: Verify that Authenticated user is able to view "Enable Buy Now" button on PDP if user does not have saved payment details but has saved Shipping Address
    Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailWithoutPaymentDetails" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User navigates to L2 Mens clothing
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree  
	When User is navigated to pdp page    
    Then Verify that Enable Buy Now button is displayed on PDP
    
    