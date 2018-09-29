Feature: Place order

#@R2_Web @R2_All @R2_PlaceOrderAuthenticated @R2_PlaceOrderAllCombinations @R2_Order 
#@CR-SK 
#Scenario Outline: Verify if authenticated user is able to place an order for single SKU product 
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user clicks on SignIn link from global header 
#	And user logs in as "UserForOrderPlacement"
#    And user navigate and deletes existing items in cart
#	And User searches a product "productName" and navigates to PDP 
#	And user click on Add to Cart Button 
#	And user is navigated to Add to cart Notification popup 
#	And user click on checkout button 
#	And user adds shipment address on checkout page for "authenticated" user
#	And user selects shipment method on check out page for "authenticated" user
#	And user add "<Payment Type>" details in payment method for "authenticated" user
#	And user clicks on place order on checkout page 
#	Then verify user is able to successfully place the order 
#	And Verify the message on the page 
#		|# Message for successful order is displayed		|
#		|THANKS FOR SUBMITTING YOUR ORDER					|
#	Examples: 
#		|Payment Type	|
##		|Gift Card		|
#		|Credit Card - Visa	|
#		|PayPal			|
		

@R2_Web @R2_All @R2_PlaceOrderAuthenticated @R2_PlaceOrderAllCombinations @R2_Order @CR-SK
Scenario Outline: Verify if authenticated user is able to place an order for single SKU product 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user creates an account
	And User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	When user click on checkout button 
	And user adds shipment address on checkout page for "newly registered" user
	And user selects shipment method on check out page for "newly registered" user
	And user add "<Payment Type>" details in payment method for "newly registered" user
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
	Then Verify the message on the page 
		|# Message for successful order is displayed		|
		|THANKS FOR SUBMITTING YOUR ORDER					|
	Examples: 
		|Payment Type	|
#		|Gift Card		|
		|Credit Card - Master	|
		|PayPal			|
#		
#@R2_Web @R2_All @R2_PlaceOrderAuthenticated @R2_PlaceOrderAllCombinations @R2_Order @CR-SK
#Scenario Outline: Verify if authenticated user is able to place an order for multi SKU products 
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user creates an account
#	And User searches a product "SKUForMultiSKUProduct" and navigates to PDP 
#	And user click on Add to Cart Button for "MultiSKUProduct" 
#	And user is navigated to Add to cart Notification popup 
#	When user click on checkout button 
#	And user adds shipment address on checkout page for "newly registered" user
#	And user selects shipment method on check out page for "newly registered" user
#	And user add "<Payment Type>" details in payment method for "newly registered" user
#	And user clicks on place order on checkout page 
#	Then verify user is able to successfully place the order 
#	Then Verify the message on the page 
#		|# Message for successful order is displayed		|
#		|THANKS FOR SUBMITTING YOUR ORDER					|
#	Examples: 
#		|Payment Type	|
##		|Gift Card		|
#		|Credit Card - Master	|
#		|PayPal			|
#				
#		
#				
#@R2_Web @R2_All @R2_PlaceOrderAuthenticated @R2_PlaceOrderAllCombinations @R2_Order 
# @CR-SK 
#Scenario Outline: Verify if authenticated user is able to place an order for bundle products 
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user creates an account
#	When User searches a product "SKUForBundleProducts" and navigates to PDP 
#	And user click on Add to Cart Button for "Bundle Product" 
#	And user is navigated to Add to cart Notification popup 
#	And user click on checkout button 
#	And user adds shipment address on checkout page for "newly registered" user
#	And user selects shipment method on check out page for "newly registered" user
#	And user add "<Payment Type>" details in payment method for "newly registered" user
#	And user clicks on place order on checkout page 
#	Then verify user is able to successfully place the order 
#	And Verify the message on the page 
#		|# Message for successful order is displayed		|
#		|THANKS FOR SUBMITTING YOUR ORDER					|
#	Examples: 
#		|Payment Type	|
##		|Gift Card		|
#		|Credit Card - Amex	|
#		|PayPal			|
#						
#						
#						
#@R2_Web @R2_All @R2_PlaceOrderAuthenticated @R2_PlaceOrderAllCombinations @R2_Order 
# @CR-SK 
#Scenario Outline: Verify if authenticated user is able to place an order for standard gift card 
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user creates an account
#	When User searches a product "SKUForGiftCard" and navigates to PDP 
#	And user click on Add to Cart Button 
#	And user is navigated to Add to cart Notification popup 
#	And user click on checkout button 
#	And user adds shipment address on checkout page for "newly registered" user
#	And user selects shipment method on check out page for "newly registered" user
#	And user add "<Payment Type>" details in payment method for "newly registered" user
#	And user clicks on place order on checkout page 
#	Then verify user is able to successfully place the order 
#	And Verify the message on the page 
#		|# Message for successful order is displayed|
#		|THANKS FOR SUBMITTING YOUR ORDER			|
#	Examples: 
#		|Payment Type	|
##		|Gift Card		|
#		|Credit Card - Discover	|
#		|PayPal			|
#		
#		
#@R2_Web @R2_All @R2_PlaceOrderAuthenticated @R2_PlaceOrderAllCombinations @R2_Order 
# @CR-SK 
#Scenario Outline: Verify if authenticated user is able to place an order for bulk gift card 
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user creates an account
#	And User searches a product "SKUForBulkGiftCard" and navigates to PDP 
#	And user click on Add to Cart Button 
#	And user is navigated to Add to cart Notification popup 
#	And user click on checkout button 
#	And user adds shipment address on checkout page for "newly registered" user
#	And user selects shipment method on check out page for "newly registered" user
#	And user add "<Payment Type>" details in payment method for "newly registered" user
#	And user clicks on place order on checkout page 
#	Then verify user is able to successfully place the order 
#	And Verify the message on the page 
#		|# Message for successful order is displayed|
#		|THANKS FOR SUBMITTING YOUR ORDER			|
#	Examples: 
#		|Payment Type	|
##		|Gift Card		|
#		|Credit Card	|
#		|PayPal			|
#		
#@R2_Web @R2_All @R2_PlaceOrderAuthenticated @R2_PlaceOrderAllCombinations  @CR-SK @R2_Order 
#Scenario Outline: Verify if authenticated user is able to place an order for bait products
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user creates an account
#	When User searches a product "SKUForBaitProduct" and navigates to PDP 
#	And user click on Add to Cart Button for "Bait Product" 
#	And user is navigated to Add to cart Notification popup 
#	And user click on checkout button 
#	And user adds shipment address on checkout page for "newly registered" user
#	And user selects shipment method on check out page for "newly registered" user
#	And user add "<Payment Type>" details in payment method for "newly registered" user
#	And user clicks on place order on checkout page 
#	Then verify user is able to successfully place the order 
#	And Verify the message on the page 
#		|# Message for successful order is displayed|
#		|THANKS FOR SUBMITTING YOUR ORDER			|
#	Examples: 
#		|Payment Type	|
##		|Gift Card		|
#		|Credit Card - Visa	|
#		|PayPal			|
#
#
#@R2_Web @R2_All @R2_PlaceOrderUnauthenticated @R2_PlaceOrderAllCombinations @R2_Order 
#@CR-SK 
#Scenario Outline: Verify if unauthenticated user is able to place an order for single SKU product 
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When User searches a product "productName" and navigates to PDP 
#	And user click on Add to Cart Button 
#	And user is navigated to Add to cart Notification popup 
#	And user click on checkout button 
#	And user adds shipment address on checkout page for "guest" user
#	And user selects shipment method on check out page for "guest" user
#	And user add "<Payment Type>" details in payment method for "guest" user
#	And user clicks on place order on checkout page 
#	Then verify user is able to successfully place the order 
#	And Verify the message on the page 
#		|# Message for successful order is displayed		|
#		|THANKS FOR SUBMITTING YOUR ORDER					|
#	Examples: 
#		|Payment Type	|
##		|Gift Card		|
#		|Credit Card - Master	|
#		|PayPal			|
#		
#		
@R2_Web @R2_All @R2_PlaceOrderUnauthenticated @R2_PlaceOrderAllCombinations @R2_Order 
@CR-SK 
Scenario Outline: Verify if unauthenticated user is able to place an for multi SKU products 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "SKUForMultiSKUProduct" and navigates to PDP 
	And user click on Add to Cart Button for "MultiSKUProduct" 
	And user is navigated to Add to cart Notification popup 
	When user click on checkout button 
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	And user add "<Payment Type>" details in payment method for "guest" user
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
	Then Verify the message on the page 
		|# Message for successful order is displayed		|
		|THANKS FOR SUBMITTING YOUR ORDER					|
	Examples: 
		|Payment Type	|
#		|Gift Card		|
		|Credit Card - Amex	|
		|PayPal			|
				
				
				
@R2_Web @R2_All @R2_PlaceOrderUnauthenticated @R2_PlaceOrderAllCombinations @R2_Order 
 @CR-SK 
Scenario Outline: Verify if unauthenticated user is able to place an for bundle products 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "SKUForBundleProducts" and navigates to PDP 
	And user click on Add to Cart Button for "Bundle Product" 
	And user is navigated to Add to cart Notification popup 
	And user click on checkout button 
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	And user add "<Payment Type>" details in payment method for "guest" user
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
	And Verify the message on the page 
		|# Message for successful order is displayed		|
		|THANKS FOR SUBMITTING YOUR ORDER					|
	Examples: 
		|Payment Type	|
#		|Gift Card		|
		|Credit Card - Discover	|
		|PayPal			|
						
						
						
@R2_Web @R2_All @R2_PlaceOrderUnauthenticated @R2_PlaceOrderAllCombinations @R2_Order 
 @CR-SK 
Scenario Outline: Verify if unauthenticated user is able to place an for standard gift card 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "SKUForGiftCard" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user click on checkout button 
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	And user add "<Payment Type>" details in payment method for "guest" user
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
	And Verify the message on the page 
		|# Message for successful order is displayed|
		|THANKS FOR SUBMITTING YOUR ORDER			|
	Examples: 
		|Payment Type	|
#		|Gift Card		|
		|Credit Card	|
		|PayPal			|
		
		
@R2_Web @R2_All @R2_PlaceOrderUnauthenticated @R2_PlaceOrderAllCombinations @R2_Order 
 @CR-SK 
Scenario Outline: Verify if unauthenticated user is able to place an for bulk gift card 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "SKUForBulkGiftCard" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user click on checkout button 
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	And user add "<Payment Type>" details in payment method for "guest" user
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
	And Verify the message on the page 
		|# Message for successful order is displayed|
		|THANKS FOR SUBMITTING YOUR ORDER			|
	Examples: 
		|Payment Type	|
#		|Gift Card		|
		|Credit Card - Visa	|
		|PayPal			|
		
@R2_Web @R2_All @R2_PlaceOrderUnauthenticated @R2_PlaceOrderAllCombinations @R2_Order 
 @CR-SK 
Scenario Outline: Verify if unauthenticated user is able to place an for bait products
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "SKUForBaitProduct" and navigates to PDP 
	And user click on Add to Cart Button for "Bait Product" 
	And user is navigated to Add to cart Notification popup 
	And user click on checkout button 
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	And user add "<Payment Type>" details in payment method for "guest" user
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
	And Verify the message on the page 
		|# Message for successful order is displayed|
		|THANKS FOR SUBMITTING YOUR ORDER			|
	Examples: 
		|Payment Type	|
#		|Gift Card		|
		|Credit Card	|
		|PayPal			|
		
		