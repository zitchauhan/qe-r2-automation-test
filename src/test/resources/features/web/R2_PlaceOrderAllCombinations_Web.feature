Feature: Place order

#  *********************Venkat***************
@RegressionP2 @MyAccount @TC-OMNI-13383
Scenario Outline: Verify whether the new address entered in Checkout page gets saved in My account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user creates an account
	And User searches a product "productName" and navigates to PDP 
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user adds shipment address on checkout page for "Newly Registered" user
	And user selects shipment method on check out page for "Newly Registered" user
	And user add "<Payment Type>" details in payment method for "Newly Registered" user
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
	Then user validates shipping address
	And Verify the message on the page 
		|# Message for successful order is displayed		|
		|THANKS FOR SUBMITTING YOUR ORDER					|
	Examples: 
		|Payment Type	|

#********************Venkat End******************



@R2_Web @R2_All @R2_PlaceOrderAuthenticated @R2_PlaceOrderAllCombinations @R2_Order @DevORIG
Scenario Outline: Verify if authenticated user is able to place an order for single SKU product 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user creates an account
	And User searches a product "productName" and navigates to PDP 
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user adds shipment address on checkout page for "Newly Registered" user
	And user selects shipment method on check out page for "Newly Registered" user
	And user add "<Payment Type>" details in payment method for "Newly Registered" user
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
	And Verify the message on the page 
		|# Message for successful order is displayed		|
		|THANKS FOR SUBMITTING YOUR ORDER					|
	Examples: 
		|Payment Type	|
		|Gift Card		|
#		|Credit Card - VISA	|
#		|PayPal			|
	
@R2_Web @R2_All @R2_PlaceOrderUnauthenticated @R2_PlaceOrderAllCombinations @R2_Order @C1-Message 
@CR-SK 
Scenario Outline: Verify if unauthenticated user is able to place an for multi SKU products 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "SKUForMultiSKUProduct" and navigates to PDP 
	And user click on Add to Cart Button for "MultiSKUProduct" 
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
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
		|Credit Card	|
		|PayPal			|
				
@Regression @P1 @CR-SK @Checkout @RegressionP1
Scenario Outline: Verify guest user order placement for with Different Card Types
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "SKUForMultiSKUProduct" and navigates to PDP 
	#And user click on Add to Cart Button for "MultiSKUProduct" 
	And user click on ship it button 
	And user click on view cart button 
	#And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	And user add "<Card Type>" details for a guest user
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
	And Verify the message on the page 
		|# Message for successful order is displayed		|
		|THANKS FOR SUBMITTING YOUR ORDER					||
	Examples: 
		|Card Type	|
		|Visa      	|
		|discover   |
		|master     |
		|Amex      	|
		
		

@Regression @P1 @CR-SK @Checkout @RegressionP1 @TC-OMNI-13460
Scenario: Place order as a registered user using Paypal express as tender
  Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productNameSTH" and navigates to PDP
	And User gets a product name for "productNameSTH"
	And user click on ship it button 
	And user will click on View Cart button 
  When user navigate to Cart page 
  Then Verify paypal button on Cart Page 
	Then User click on paypal button on cart page
	Then user switch to iframe and enter the paypal login "PayPalEmail" "PayPalPassword"
	And user clicks on ok button of order not complete modal
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
	And Verify the message on the page 
		|# Message for successful order is displayed		|
		|THANKS FOR SUBMITTING YOUR ORDER					|


		
@R2_Web @R2_All @R2_PlaceOrderUnauthenticated @R2_PlaceOrderAllCombinations @R2_Order @C1-Message
 @CR-SK @RegressionP3 @TC-OMNI-13445
Scenario Outline: Verify if unauthenticated user is able to place an for bundle products 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "SKUForBundleProducts" and navigates to PDP 
	And user click on Add to Cart Button for "Bundle Product" 
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
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
		|Credit Card 	|
#		|PayPal			|
						
						
						
@R2_Web @R2_All @R2_PlaceOrderUnauthenticated @R2_PlaceOrderAllCombinations @R2_Order 
 @CR-SK 
Scenario Outline: Verify if unauthenticated user is able to place an for standard gift card 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "SKUForGiftCard" and navigates to PDP  
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
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
		|Gift Card		|
		|Credit Card	|
		|PayPal			|
		
		
@R2_Web @R2_All @R2_PlaceOrderUnauthenticated @R2_PlaceOrderAllCombinations @R2_Order  @CR-SK @C1-Message
Scenario Outline: Verify if unauthenticated user is able to place an for bulk gift card 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "SKUForBulkGiftCard" and navigates to PDP
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
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
		|Credit Card - Visa	|
		|PayPal			|
		
@R2_Web @R2_All @R2_PlaceOrderUnauthenticated @R2_PlaceOrderAllCombinations @R2_Order 
 @CR-SK @C1-Message @RegressionP3
Scenario Outline: Verify if unauthenticated user is able to place an for bait products
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "SKUForBaitProduct" and navigates to PDP 
	And user click on Add to Cart Button for "Bait Product"
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	And user add "<Payment Type>" details in payment method for "guest" user
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
	Examples: 
		|Payment Type	|
		|Credit Card - Master	|
#		|PayPal			|

	@RegressionP3 @OMNI-13444
	Scenario Outline: Verify guest user - succesfully placed with Standard Delivery and correct shipping charges
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	And user verify shipping fee for the ship to home product
	And user add "<Payment Type>" details in payment method for "guest" user
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order
	And user validates same shipping fee on order confirmation page 
	Examples: 
		|Payment Type	|
		|Credit Card - visa	|