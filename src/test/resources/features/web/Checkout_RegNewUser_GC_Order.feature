Feature: CHECKOUT - Regsiter New User & Place Order GC as Tender


@AutomationSmoke
Scenario Outline: Checkout - Regsiter New User & Place Gift Card Order 
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
	And user selects shipment method on check out page for "Newly Registered" user
	And user add "<Payment Type>" details in payment method for "Newly Registered" user
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
#	Then Verify the message on the page 
#		|# Message for successful order is displayed		|
#		|THANKS FOR SUBMITTING YOUR ORDER					|
    Then user able to see order number 
	And User navigates to Check Oder status Page
	Then System Generate ordernumber "GeneratedOrdernumber" and "zipcode" 
	And User clicks on Check button
	When User Clicks on Cancel Order link
	And user click on yes cancle my order button
    And Verify that the order cancellation confirmation page is displayed 
	Examples: 
		|Payment Type	|
		|Gift Card		|
#		|PayPal			|
