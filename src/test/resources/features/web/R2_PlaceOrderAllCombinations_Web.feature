Feature: Place order

#@R2_Web @R2_All @R2_PlaceOrderAuthenticated @R2_PlaceOrderAllCombinations @R2_Order 
#@CR-SK 
#Scenario Outline: Verify that UnAuthenticated user is able to place an order for a bopis product
#	Given user launches the browser and navigates to "ASO_HOME" page
#	And user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore"
#	And User searches a product "SKUForBopisProduct" and navigates to PDP 
#	And user click on Add to Cart Button
#	And user is navigated to Add to cart Notification popup 
#	And user will click on View Cart button
#	And user selects the ship to Store Pick up radio button
#	And verify user can begin checkout
#	And user enters new billing address information "FirstName" , "LastName" , "PhoneNumber" , "Address" , "FindAsStoreZIPCode" , "EmailAddress"
#	And user add "<Payment Type>" details in payment method for "guest" user
#	And user clicks on place order on checkout page 
#	Then verify user is able to successfully place the order 
##	Then Verify the message on the page 
##		|# Message for successful order is displayed		|
##		|THANKS FOR SUBMITTING YOUR ORDER					|
#	Examples: 
#		|Payment Type	|
##		|Gift Card		|
#		|Credit Card	|
#		|PayPal			|

#  *********************Venkat***************
@RegressionP2
Scenario Outline: Verify if authenticated user is able to place an order for single SKU product 
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
	Then user validates shipping address
#	Then Verify the message on the page 
#		|# Message for successful order is displayed		|
#		|THANKS FOR SUBMITTING YOUR ORDER					|
	Examples: 
		|Payment Type	|

#********************Venkat End******************



@R2_Web @R2_All @R2_PlaceOrderAuthenticated @R2_PlaceOrderAllCombinations @R2_Order @DevORIG
Scenario Outline: Verify if authenticated user is able to place an order for single SKU product 
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
#	And user is navigated to Add to cart Notification popup 
#	When user click on checkout button 
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	And user add "<Payment Type>" details in payment method for "guest" user
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
#	Then Verify the message on the page 
#		|# Message for successful order is displayed		|
#		|THANKS FOR SUBMITTING YOUR ORDER					|
	Examples: 
		|Payment Type	|
#		|Gift Card		|
		|Credit Card	|
		|PayPal			|
				
@Regression @P1 @CR-SK @Checkout @RegressionP1
Scenario Outline: Verify if order placement for a Different Card Types
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "SKUForMultiSKUProduct" and navigates to PDP 
	And user click on Add to Cart Button for "MultiSKUProduct" 
#	And user is navigated to Add to cart Notification popup 
#	When user click on checkout button 
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	And user add "<Card Type>" details for a guest user
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
#	Then Verify the message on the page 
#		|# Message for successful order is displayed		|
#		|THANKS FOR SUBMITTING YOUR ORDER					|
	Examples: 
		|Card Type	|
		|Visa      	|
		|discover   |
		|master     |
		|Amex      	|
		
		

@Regression @P1 @CR-SK @Checkout @RegressionP1
Scenario: Place order as a registered user using Paypal express as tender
    Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productNameSTH" and navigates to PDP
	And User gets a product name for "productNameSTH"
	And user click on ship it button 
	And user will click on View Cart button 
    When user navigate to Cart page 
    #Then user should able to click on Signin button
    #And user should be able to enter the signin details "EmailAddress1" "Password"
    #And User clicks on the minicart icon and navigated to minicart 
    Then Verify paypal button on Cart Page 
	Then User click on paypal button on cart page
	And user enter the paypal login "PayPalEmail" "PayPalPassword" and click on Continue button
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order


		
@R2_Web @R2_All @R2_PlaceOrderUnauthenticated @R2_PlaceOrderAllCombinations @R2_Order @C1-Message
 @CR-SK 
Scenario Outline: Verify if unauthenticated user is able to place an for bundle products 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "SKUForBundleProducts" and navigates to PDP 
	And user click on Add to Cart Button for "Bundle Product" 
	#	And user is navigated to Add to cart Notification popup 
#	When user click on checkout button 
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
		|PayPal			|
						
						
						
@R2_Web @R2_All @R2_PlaceOrderUnauthenticated @R2_PlaceOrderAllCombinations @R2_Order 
 @CR-SK 
Scenario Outline: Verify if unauthenticated user is able to place an for standard gift card 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "SKUForGiftCard" and navigates to PDP 
#	And user click on Add to Cart Button 
#	And user is navigated to Add to cart Notification popup 
#	And user click on checkout button 
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
#		|Gift Card		|
		|Credit Card	|
		|PayPal			|
		
		
@R2_Web @R2_All @R2_PlaceOrderUnauthenticated @R2_PlaceOrderAllCombinations @R2_Order  @CR-SK @C1-Message
Scenario Outline: Verify if unauthenticated user is able to place an for bulk gift card 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "SKUForBulkGiftCard" and navigates to PDP
	#	And user click on Add to Cart Button 
#	And user is navigated to Add to cart Notification popup 
#	And user click on checkout button 
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	And user add "<Payment Type>" details in payment method for "guest" user
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
#	And Verify the message on the page 
#		|# Message for successful order is displayed|
#		|THANKS FOR SUBMITTING YOUR ORDER			|
	Examples: 
		|Payment Type	|
#		|Gift Card		|
		|Credit Card - Visa	|
		|PayPal			|
		
@R2_Web @R2_All @R2_PlaceOrderUnauthenticated @R2_PlaceOrderAllCombinations @R2_Order 
 @CR-SK @C1-Message
Scenario Outline: Verify if unauthenticated user is able to place an for bait products
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "SKUForBaitProduct" and navigates to PDP 
	And user click on Add to Cart Button for "Bait Product" 
	#	And user click on Add to Cart Button 
#	And user is navigated to Add to cart Notification popup 
#	And user click on checkout button 
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	And user add "<Payment Type>" details in payment method for "guest" user
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
#	And Verify the message on the page 
#		|# Message for successful order is displayed|
#		|THANKS FOR SUBMITTING YOUR ORDER			|
	Examples: 
		|Payment Type	|
#		|Gift Card		|
		|Credit Card	|
		|PayPal			|


#@R2_Web @R2_All @R2_PlaceOrderUnauthenticated @R2_PlaceOrderAllCombinations @R2_Order @CR-AG
#Scenario Outline: Verify if authenticated user is able to place an with GC and CC
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	And user clicks on SignIn link from global header
#	And user logs in as "SanityEmailAddress"
#	When User searches a product "productName" and navigates to PDP 
#	And user click on Add to Cart Button 
#	And user click on checkout button 
#	Then user click on GiftCard Plus icon in Checkout page
#	Then user selects the gift card which is not exhausted
#	And user add "<Payment Type>" details in payment method for "newly registered" user
#	And user click on Apply button
#	Then user click on review order button
#	Then gift card balance is applied towards the purchase 
#	And user clicks on place order on checkout page 
#	Then verify user is able to successfully place the order 
##	And Verify the message on the page 
##		|# Message for successful order is displayed|
##		|THANKS FOR SUBMITTING YOUR ORDER!			|
#	Examples: 
#		|Payment Type	|
#		|Credit Card	|
		
############================================================================================================================				
		
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
#
#

	

		
		