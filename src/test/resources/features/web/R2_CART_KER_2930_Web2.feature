Feature: Verify Shipping Fee is applicable only for Ship to Home

 @C-BOPIS @R2_Web  @R2_All @P-Highest  @1HR_R2 @C-NonOrder @CC-Checkout_Order   @KER-2930 @ZYP_CHECKOUT_K2930-10848 @CR-RK 
Scenario: Verify Shipping Fee is applicable only for Ship to Home
    Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2"
	When User searches a product "BOPIS_Regular_Product" and navigates to PDP 
	When user click on Add to cart button 
	 And user click on view cart
	When user enters "BOPIS_SOF_Product" in the searchbox
	When user click on Add to cart button
	And user click on view cart
	When user enters "SKUForShiptohome" in the searchbox
	When user click on Add to cart button
	And user click on view cart
	Then user select in store pickup option
	When user will click on Checkout button and navigates to Checkout page
	And user adds shipment address on checkout page for "guest" user 
	And user selects shipment method on check out page for "guest" user
	And user verify the shipping fee for the ship to home