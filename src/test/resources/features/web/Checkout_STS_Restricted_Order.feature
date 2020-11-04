Feature: CHECKOUT - Guest user, add STS Order


@AutomationSmoke @RegressionP1
Scenario:  Checkout - Guest User order placement for Regular STS item
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 	
	When user enters "STS_Regular_Product" in the searchbox
	Then user validates estimated date is visible on "PDP"
	Then user click on pickup button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	When user clicks on Go to payment CTA
	And user fill the payment details for sof guest user
	And user able to see the button place order
	Then verify user is able to successfully place the order
	
@RegressionP1 @abcd
Scenario Outline: Guest User - Validate Limited Qty msg is visible to the user on PDP and cart page and user should not be able to place 
order for more than the limit in a single day with the same billing address
	Given user launches the browser and navigates to "ASO_HOME" page
	And User searches a product "RestrictedQtySku" and navigates to PDP 
	And user verifies the restricted message is visible on "PDP"
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	#And user add "<Card Type>" details for a guest user
	And user add "<Payment Type>" details in payment method for "guest" user 
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
	Then Verify the message on the page 
		| Order Number |
	And User searches a product "RestrictedQtySku" and navigates to PDP
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user selects shipment method on check out page for "guest" user
	And user add "<Card Type>" details for a guest user
	And user clicks on place order on checkout page 
	Then user sees the restriction error message on checkout page
	Examples: 
		|Payment Type	|
		|Credit Card - visa	|
		
@RegressionP1 @abc
Scenario Outline: Ship alone items should appear in separate package and not combined with other items and order should be placed successfully
	Given user launches the browser and navigates to "ASO_HOME" page plcc 
  When user creates an account
	When User searches a product "ShipAloneItem" and navigates to PDP
	And user click on ship it button 
	And then user close the add to cart popup
	When User searches a product "productName" and navigates to PDP
	And user click on ship it button 
	And user will click on View Cart button 
  When user navigate to Cart page 
  #When user clicks on Add Promo code link under Cart Order Summary
  And user view and Applied Promotions/Discounts "Promocode" 
	And verify Promo code discount is applied 
	And user clicks on checkout button on cart page
	And user adds shipment address on checkout page for "Newly Registered" user
	And user selects shipment method on check out page for "Newly Registered" user
	And user add "<Payment Type>" details in payment method for "Newly Registered" user
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
		Examples: 
		|Payment Type	|
		|Credit Card - master	|