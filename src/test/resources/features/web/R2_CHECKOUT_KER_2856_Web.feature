Feature: B06-175- Mixed Cart - Order Confirmation screen

@C-BOPIS @R2_Web  @R2_All @P1 @CC-Checkout_Order  @KER-2856 @ZYP_CHECKOUT_K2856-10865 
Scenario: Verify Mixed Cart Order Confirmation - Fullfilment methods Ship to Home and BOPIS 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	When user enters "SKUForBopisProduct" in the search box 
#	When user click on Add to cart button 
	And user click on ship it button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user select in store pickup option 
	When user enters "productName" in the search box 
	#When user click on Add to cart button 
	And user click on ship it button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user click on checkout button in Cart page 
	And user adds shipment address on checkout page for "authenticated" user 
	And user selects shipment method on check out page for "authenticated" user 
	And user fill the payment details for sof registered user
	And user able to see the button place order 
	And user is navigated to order confirmation page and captures order number 
	
@C-BOPIS @R2_Web  @R2_All @P-High_B_Order @C-NonOrder @CC-Checkout_Order   @KER-2856 @ZYP_CHECKOUT_K2856-10866
Scenario: Verify Mixed Cart Order Confirmation - Fullfilment methods BOPIS and SOF 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	When User searches a product "BOPIS_SOF_Product" and navigates to PDP 
	#When user click on Add to cart button 
	And user click on ship it button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user select in store pickup option 
	When user enters "SKUForBopisProduct" in the search box 
	#When user click on Add to cart button 
	And user click on ship it button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When user will click on Checkout button and navigates to Checkout page 
	And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers 
	And user click on checkbox in special order ship to store section 
	When user clicks on Go to payment CTA
	And user fill the payment details for sof registered user
	And user able to see the button place order 
	And user is navigated to order confirmation page and captures order number 
	
	@C-BOPIS @R2_Web  @R2_All @P-High_B_Order @C-NonOrder @CC-Checkout_Order   @KER-2856 @ZYP_CHECKOUT_K2856-10867 @CR-RK
    Scenario: Verify Mixed Cart Order Confirmation - Fullfilment methods SOF and Ship to Home
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore" 
	When User searches a product "SOFSKUNumber" and navigates to PDP 
	#When user click on Add to cart button 
	And user click on ship it button 
	And user is navigated to Add to cart Notification popup 
	And user click on continue shopping 
	When user enters "productName" in the search box 
	#When user click on Add to cart button 
	And user click on ship it button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When user will click on Checkout button and navigates to Checkout page 
	And user adds shipment address on checkout page for "guest" user 
	And user selects shipment method on check out page for "guest" user 
	And user does accepts the firearm specific compliance 
	And user clicks on Continue button 
	Then verify that user navigates to payment drawer 
	And user add "credit card" details in payment method for "guest" user 
	And user able to see the button place order 
	And user is navigated to order confirmation page and captures order number 
	
@C-BOPIS @R2_Web  @R2_All @P-High_B_Order @CB-Checkout   @KER-2856 @ZYP_CHECKOUT_K2856-10868
Scenario: Verify Mixed Cart Order Confirmation - Fullfilment methods for BOPIS, Sequence - Un authenticated user 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When User searches a product "BOPIS_SOF_Product" and navigates to PDP 
	#When user click on Add to cart button 
	And user click on ship it button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user select in store pickup option 
	When user enters "SKUForBopisProduct" in the search box 
	#When user click on Add to cart button 
	And user click on ship it button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When user will click on Checkout button and navigates to Checkout page 
	And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers 
	And user click on checkbox in special order ship to store section 
	When user clicks on Go to payment CTA
	And user able to see the button place order 
	And user is navigated to order confirmation page and captures order number 
	And user should be able to see the instore pickup instruction
	And user should be able to see the create an account section
	And user should be able to see in store pickup details
	And user should be able to see the payment details
		
	@C-BOPIS @R2_Web  @R2_All @P-High_B_Order @C-NonOrder @CC-Checkout_Order  @C1-Message  @KER-2856 @ZYP_CHECKOUT_K2856-10869 @CR-RK
Scenario: Verify Mixed Cart Order Confirmation - Fullfilment methods SOF and Ship to Home 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore" 
	When User searches a product "SOFSKUNumber" and navigates to PDP 
	#When user click on Add to cart button 
	And user click on ship it button 
	And user is navigated to Add to cart Notification popup 
	And user click on continue shopping 
	When user enters "productName" in the search box 
	#When user click on Add to cart button 
	And user click on ship it button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When user will click on Checkout button and navigates to Checkout page 
	And user adds shipment address on checkout page for "guest" user 
	And user selects shipment method on check out page for "guest" user 
	And user does accepts the firearm specific compliance 
	And user clicks on Continue button 
	Then verify that user navigates to payment drawer 
	And user add "credit card" details in payment method for "guest" user 
	And user able to see the button place order 
	And user is navigated to order confirmation page and captures order number 
	Then Verify the message on the page 
		|# Following Message should show on the page|
		|SPECIAL ORDER SHIP TO STORE				|
		|SHIPPING ITEMS								|
