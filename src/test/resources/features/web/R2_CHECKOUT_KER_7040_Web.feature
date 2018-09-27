Feature: B10-500 - Buy Now Checkout Error Conditions

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-7040 @ZYP_CHECKOUT_K6655-8907 @CR-MS
Scenario: Verify that Authenticated user is NOT able proceed to checkout if payment information fails fraud check
 Given user launches the browser and navigates to "ASO_HOME" page
    And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
	And user click on signin button
	And User Navigates L2 form Homepage Header 
    And User clicks on product in PLP
    Then Verify below Sub/Main Module of PDP
    |#Verify following elements in PDP modal popup|
    |Default_Payment_Option_btn|
    Then user should able to see the BUY NOW button on the PDP