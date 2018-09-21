Feature: B06-225 - BOPIS Errors in Cart

@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-3468 @ZYP_CART_K3468-9925 @CR-RK 
Scenario: Verify user is able to see the error messages on Cart for insufficient inventory
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne SOF
    Then user clicks on one of the subcategory and navigates to LTwo SOF
    Then user clicks on one of the product category and navigates to LThree SOF
	And User is navigated to pdp page 
	Then user click on Add to Cart Button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When enter the "MoreThanThresholdQuantity" to X 
	Then Verify below Sub/Main Module of Cart Page
    |# Following Error Message should show on the page|
    |ErrorMsgLimitedStack|