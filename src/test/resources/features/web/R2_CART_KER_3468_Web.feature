Feature: B06-225 - BOPIS Errors in Cart

@C-BOPIS @R2_Web @R2_NonRegression @R2_All @P-High_B @CB-Cart @KER-3468 @ZYP_CART_K3468-9925 @CR-RK @1HR_R2
Scenario: Verify user is able to see the error messages on Cart for insufficient inventory
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header 
	And user logs in as "Cart_BopisEmail" 
	When user enters "BOPIS_SOF_Product" in the searchbox
	And user click on Add to Cart Button 
	And user click on view cart
	Then user select in store pickup option
	When enter the "EnterMaxQuantity" to Y 
	And user verfiy the an error message
	Then enter the "EnterMinQuantity" to Z 
# 
    
@C-BOPIS @R2_Web  @R2_All @P-Highest  @1HR_R2 @C-NonOrder @CC-Checkout_Order   @KER-3468 @ZYP_CHECKOUT_K3468-9933 @CR-RK 
Scenario: Verify that without clicking close, alert gets disappers
    Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header 
	And user logs in as "Cart_BopisEmail" 
	When user enters "BOPIS_SOF_Product" in the searchbox
	And user click on Add to Cart Button 
	And user click on view cart
	Then user select in store pickup option
	When enter the "EnterMaxQuantity" to Y
    
@C-BOPIS @R2_Web @R2_All @C-Cart @KER-3468 @ZYP_CART_K3468-9938 
Scenario: Verify that on clicking close in error modal closes the modal
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header
	And user logs in as "OutOfStockItemMail"
	And user clicks on mini cart Icon
	Then user verify the outofstock modal should appear
	And user click on close button in outofstock modal
	And user verify the outofstock modal should not appear
	
@C-BOPIS @R2_Web @R2_All @C-Cart @KER-3468 @ZYP_CART_K3468-9939 
Scenario: Verify that clicking anywhere outside the modal, closes the error modal
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header
	And user logs in as "OutOfStockItemMail"
	And user clicks on mini cart Icon
	Then user verify the outofstock modal should appear
	And user click outside the outofstock modal
	And user verify the outofstock modal should not appear
