Feature: BOPIS Cart Blade Impact and Variations in Cart

@R2_Web @R2_Regression @R2_All @P-High @CB-Cart @C-BOPIS @KER-3173 @ZYP_CART_K3173-10940
Scenario: Verify that the Store Pickup Checkbox is selected by default if User Selected In Store Pickup on PDP page
    Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_PLP" in the searchbox
	When user lands on the PLP page with Filter Drawer 
	And user should be able to select the store pickup "store pickup" filter
	Then user clicks on the product card and navigates to PDP
	Then user click on Add to Cart Button
    Then user is navigated to Add to cart Notification popup
    And user will click on View Cart button
    And user navigate to Cart page
    And user should be able to see instore radio button bydefault selected
    
    
@R2_Web @R2_Regression @R2_All @P-High @CB-Cart @C-BOPIS @KER-3173 @ZYP_CART_K3173-10941
Scenario: Verify that User is able to change shipping zip code
    Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_Regular_Product" in the searchbox
	And user click on Add to Cart Button 
	And user click on view cart
	And user makes a note of tax calculation
	When user enters "BOPIS_Store1" in change zipcode field in cart page 
	Then cart page displays updated tax
	And estimated tax Is populated separately under Order Summary
	
@R2_Web @R2_Regression @R2_All @P-High @CB-Cart @C-BOPIS @KER-3173 @ZYP_CART_K3173-10943
Scenario: Verify that User is able to change pickup location
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	When user enters "BOPIS_Regular_Product" in the searchbox
	When user click on Add to cart button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user select in store pickup option 
	And user click on change location link in order summery cart page
	And User select another store "BOPIS_Store1"
	And user verify the selected store is reflected	
	
@R2_Web @R2_Regression @R2_All @P-High @CB-Cart @C-BOPIS @KER-3173 @ZYP_CART_K3173-10944
Scenario: Verify that User is able to change pickup location
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_Regular_Product" in the searchbox
	When user click on Add to cart button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user click on tooltip
	And user should be able to see the message flyout	
	
@R2_Web @R2_Regression @R2_All @P-High @CB-Cart @C-BOPIS @KER-3173 @ZYP_CART_K3173-10945
Scenario: Verify that Store Information Tool Tip
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	When user enters "BOPIS_Regular_Product" in the searchbox
	When user click on Add to cart button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user select in store pickup option
	Then user click on tooltip
	And user should be able to see the store message flyout	
	
@R2_Web @R2_Regression @R2_All @P-High @CB-Cart @C-BOPIS @KER-3173 @ZYP_CART_K3173-10946
Scenario: Verify that User is able to remove Items from cart
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	When user enters "BOPIS_Regular_Product" in the searchbox
	When user click on Add to cart button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	And user click on the remove button in cart page
	And user should be able to see remove message with undo CTA	
	
@R2_Web @R2_Regression @R2_All @P-High @CB-Cart @C-BOPIS @KER-3173 @ZYP_CART_K3173-10947
Scenario: Verify that User is able to add cart item to wishlist
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	When user enters "BOPIS_Regular_Product" in the searchbox
	When user click on Add to cart button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	And user note the product name
	When user clicks on Move to Wish list
	And user enter the Wishlist name 
	And user verify the wishlist moved message is displayed
	
@R2_Web @R2_All @P-High @CB-Cart @C-BOPIS @KER-3173 @ZYP_CART_K3173-10950
Scenario: Verify that user is able to view the cart variation when item is Not available for in-store pickup
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email"
	When user enters "NOT_BOPIS_Product" in the searchbox
	And user click on Add to Cart Button 
	And user click on view cart
	And user should be able to see the grey icon
	And user should not be able to see the radio button	for store pickup
	
@R2_Web @R2_All @P-High @CB-Cart @C-BOPIS @KER-3173 @ZYP_CART_K3173-10953
Scenario: Verify that user is able to view the cart variation when item is Not Available At selected store
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "Login_username" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user clicks on mini cart Icon
	Then user remove the product form your cart
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2"  
	And User should be able to see Search Box on Homepage 
	When user enters "Not_Available_Product" in the searchbox	
	When user click on Add to cart button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	And user should be able to see the grey icon
	And user should not be able to see the radio button for store pickup
	And user click on change location link in view cart page
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store1" 
	
@R2_Web @R2_All @P-High @CB-Cart @C-BOPIS @KER-3173 @ZYP_CART_K3173-10954
Scenario: Verify that user is able to view the cart variation when limited stock of item is added to cart
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "Login_username" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user clicks on mini cart Icon
	Then user remove the product form your cart
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2"  
	And User should be able to see Search Box on Homepage 
	When user enters "BOPIS_Regular_Product" in the searchbox	
	When user click on Add to cart button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	And user input the quantity more than available "MoreThanThresholdQuantity"
	And user should be able to see the limited quantity message "limited_quantity_Message_Cart"	
		
	
@R2_Web @R2_Regression @R2_All @P-High @CB-Cart @C-BOPIS @KER-3173 @ZYP_CART_K3173-10955
Scenario: Verify that user is able to view the cart variation when item is OOS
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header
	And user logs in as "OutOfStockItemMail"
	And user clicks on mini cart Icon
	Then user verify the outofstock modal should appear
	And user should be able to see out of stock message

@C-BOPIS @R2_Web  @R2_All   @CC-Cart   @KER-3173 @ZYP_CHECKOUT_K3173-10949 @CR-RK
Scenario: Verify request cancellation of order types - BOPIS Orders
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header 
	And user logs in as "Cart_BopisEmail" 
	When User searches a product "BOPIS_Shipping_Not_Availiable" and navigates to PDP 
	When user click on Add to cart button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then user verify BOPIS radio button		
	
