Feature: CHECKOUT - Regsiter New User and Credit Card Order

@AutomationSmokeRemoved
Scenario Outline: Checkout - Regsiter New User & Place VISA Order 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user creates an account
	And User searches a product "productName" and navigates to PDP 
#	And user click on Add to Cart Button 
#	And user is navigated to Add to cart Notification popup 
#	When user click on checkout button 
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user adds shipment address on checkout page for "Newly Registered" user
	Then user click on Go To Shipping Method button in Checkout page
	And user selects shipment method on check out page for "Newly Registered" user
	And user add "<Payment Type>" details in payment method for "Newly Registered" user
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order
  Then user able to see order number 
	And User navigates to Check Oder status Page
	Examples: 
		|Payment Type	|
		|Credit Card - VISA	|
#		|PayPal			|