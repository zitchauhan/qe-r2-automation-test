Feature: B06-225 - BOPIS Errors in Cart

@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-3468 @ZYP_CART_K3468-9925 @CR-RK @1HR_R2
Scenario: Verify user is able to see the error messages on Cart for insufficient inventory
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "SOFSKUNumber" and navigates to PDP
  	And User is navigated to pdp page 
	Then user click on Add to Cart Button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When enter the "MoreThanThresholdQuantity" to X 
	Then Verify below Sub/Main Module of Cart Page
    |# Following Error Message should show on the page|
    |ErrorMsgLimitedStack|