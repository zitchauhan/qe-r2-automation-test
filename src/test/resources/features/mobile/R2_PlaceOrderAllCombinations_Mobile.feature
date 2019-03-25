Feature: Place order

@R2_Mobile @R2_All @R2_PlaceOrderUnauthenticated @R2_PlaceOrderAllCombinations @R2_Order 
@CR-SK 
Scenario Outline: Verify if authenticated user is able to place an order for single SKU product 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on the burger menu
	When user creates an account
	And User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
	When user will click on Checkout button and navigates to Checkout page 
	And user adds shipment address on checkout page for "newly registered" user
	And user selects shipment method on check out page for "newly registered" user
	And user add "<Payment Type>" details in payment method for "newly registered" user
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
#	Then Verify the message on the page 
#		|# Message for successful order is displayed		|
#		|THANKS FOR SUBMITTING YOUR ORDER					|
	Examples: 
		|Payment Type	|
#		|Gift Card		|
		|Credit Card - Master	|
		|PayPal			|