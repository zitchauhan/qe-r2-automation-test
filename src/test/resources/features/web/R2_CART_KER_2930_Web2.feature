Feature: Mixed Cart - Cart screen

@R2_Web @R2_Regression @R2_All @P-High @CB-Cart @C-BOPIS @KER-2930 @ZYP_CART_K2930-10850
Scenario: Verify Mixed cart items on cart -Order Summary (BOPIS and SOF)
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When User searches a product "BOPIS_Regular_Product" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user select in store pickup option 
	When user enters "BOPIS_SOF_Product" in the search box 
	When user click on Add to cart button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then user select in store pickup option 
	And user verify that shipping charges for instore is coming as free
	
@R2_Web @R2_Regression @R2_All @P-High @CB-Cart @C-BOPIS @KER-2930 @ZYP_CART_K2930-10852
Scenario: Verify Mixed cart items on cart - BOPIS and Regular item , user changes location for BOPIS
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When User searches a product "BOPIS_Regular_Product" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user select in store pickup option 
	When user enters "productName" in the search box 
	When user click on Add to cart button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on change location link in view cart page
	And Find Store Modal should pop-up 
	And user verify that pickup location for items are displayed	
	
@R2_Web @R2_Regression @R2_All @P-High @CB-Cart @C-BOPIS @KER-2930 @ZYP_CART_K2930-10853
Scenario: Verify Mixed cart items on cart - BOPIS and SOF item , user changes location for BOPIS
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When User searches a product "BOPIS_Regular_Product" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user select in store pickup option 
	When user enters "BOPIS_SOF_Product" in the search box 
	When user click on Add to cart button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then user select in store pickup option 
	And user click on change location link in order summery cart page
	And User select another store "BOPIS_Store1"
	And user verify the selected store is reflected for both the product

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
