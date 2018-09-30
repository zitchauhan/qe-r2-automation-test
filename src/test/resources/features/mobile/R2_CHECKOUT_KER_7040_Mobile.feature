Feature: B10-500 - Buy Now Checkout Error Conditions

@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-7040 @ZYP_CHECKOUT_K6655-8907 @CR-MS @1HR_R2
Scenario: Verify that Authenticated user is NOT able proceed to checkout if payment information fails fraud check
Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailWithoutPaymentDetails" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User searches a product "productName" and navigates to PDP
	Then Verify below Sub/Main Module of PDP
    |#Verify following elements in PDP modal popup|
    |Default_Payment_Option_btn|
    Then user should able to see the BUY NOW button on the PDP
    