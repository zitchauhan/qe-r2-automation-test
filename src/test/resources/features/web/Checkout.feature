Feature: CHECKOUT


@Dev
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
	Examples: 
		|Payment Type	|
		|Gift Card		|
#		|PayPal			|

@Dev
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
	And user selects shipment method on check out page for "Newly Registered" user
	And user add "<Payment Type>" details in payment method for "Newly Registered" user
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
#	Then Verify the message on the page 
#		|# Message for successful order is displayed		|
#		|THANKS FOR SUBMITTING YOUR ORDER					|
	Examples: 
		|Payment Type	|
		|Credit Card - VISA	|
#		|PayPal			|


@Dev
Scenario: Checkout -  Registered user BOPIS Order with VISA as tender
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	#HP Added below 3 lines to make sure "SKUForBopisProduct" items is available in that Store 05_21_19
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "SKUForBopisProduct" in the search box 
#	When user click on Add to cart button 
	And user click on ship it button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user select in store pickup option 
	And user click on checkout button in Cart page 
	And User enters CVV number "ThreeDigitCVV"
	And user clicks on Review order button on checkout page
	And user able to see the button place order 
	And user is navigated to order confirmation page and captures order number 

@Dev	
Scenario:  Checkout - Guest User PAYPAL order BOPIS item
	Given user launches the browser and navigates to "ASO_HOME" page 
	#Then User should be able to click on Find Store 
	#And Find Store Modal should pop-up 
	#When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_Regular_Product" in the searchbox
#	#And user click on Add to Cart Button 
	And user click on ship it button
	And user click on view cart
	#Updated by VSN on 07-22-19 for smoke test fix
	#Then user select in store pickup option 
	And user will click on Checkout button and navigates to Checkout page
	And user adds shipment address on checkout page for "guest" user
	Then user click on go to payment present in shipping method 
	When user clicks on Go to payment CTA
	Then user click on paypal radiobtn
	And user click on paypal checkout button
	#And enter the paypal login "PayPalEmail" "PayPalPassword" 
	Then user switch to iframe and enter the paypal login "PayPalEmail" "PayPalPassword" 
	And user able to see the button place order
	And user is navigated to order confirmation page and captures order number
	
	
@Dev
Scenario: Checkout -  Registered user Place Order with ACC as tender 
	Given user launches the browser and navigates to "ASO_HOME" page plcc 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_MultiOderPlacement" 
	And user enter password in sign-in page "passwordPlcc" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page 
	And user clears everything in cart
	When user enters "SKUIdOfProduct1" in the search box plcc 
	And user click on search icon 
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user clicks on checkout button and navigates to checkout page 
	And user expect element credit card text field is present 
	When user handles adding new card "ValidPLCCCard" if already card is saved 
	#And user uncheck Save Payment Info for Later Checkbox 
	And user click on REVIEW ORDER button 
	And user click on PLACE ORDER button 
	Then user navigates to order confirmation page
	And user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present 