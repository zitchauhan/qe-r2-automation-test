Feature: Gift Card application 

@R2_Web @R2_Regression @R2_All @R2_PlaceOrdeAllCombinations @P-Low @C-Checkout
@CR-SK 
Scenario Outline:
Verify if user is able to place an order for single SKU product 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user click on checkout button 
	And user adds shipment address on checkout page 
	And user selects shipment method on check out page 
	And user add "<Payment Type>" details in payment method 
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
	And Verify the message on the page 
		|# Message for successful order is displayed		|
		|THANKS FOR SUBMITTING YOUR ORDER					|
	Examples: 
		|Payment Type	|
		|Gift Card		|
		|Credit Card	|
		|PayPal			|
		
		
@R2_Web @R2_Regression @R2_All @R2_PlaceOrdeAllCombinations @P-Low @C-Checkout
@CR-SK 
Scenario Outline:
Verify if user is able to place an order for multi SKU products 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "SKUForMultiSKUProduct" and navigates to PDP 
	And user click on Add to Cart Button for "MultiSKUProduct" 
	And user is navigated to Add to cart Notification popup 
	When user click on checkout button 
	And user adds shipment address on checkout page 
	And user selects shipment method on check out page 
	And user add "<Payment Type>" details in payment method 
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
	Then Verify the message on the page 
		|# Message for successful order is displayed		|
		|THANKS FOR SUBMITTING YOUR ORDER					|
	Examples: 
		|Payment Type	|
		|Gift Card		|
		|Credit Card	|
		|PayPal			|
				
				
				
@R2_Web @R2_Regression @R2_All @R2_PlaceOrdeAllCombinations @P-Low
@C-Checkout @CR-SK 
Scenario Outline:
Verify if user is able to place an order for bundle products 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "SKUForBundleProducts" and navigates to PDP 
	And user click on Add to Cart Button for "BundleProduct" 
	And user is navigated to Add to cart Notification popup 
	And user click on checkout button 
	And user adds shipment address on checkout page 
	And user selects shipment method on check out page 
	And user add "<Payment Type>" details in payment method 
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
	And Verify the message on the page 
		|# Message for successful order is displayed		|
		|THANKS FOR SUBMITTING YOUR ORDER					|
	Examples: 
		|Payment Type	|
		|Gift Card		|
		|Credit Card	|
		|PayPal			|
						
						
						
@R2_Web @R2_Regression @R2_All @R2_PlaceOrdeAllCombinations @P-Low
@C-Checkout @CR-SK 
Scenario Outline:
Verify if user is able to place an order for standard gift card 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "SKUForGiftCard" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user click on checkout button 
	And user adds shipment address on checkout page 
	And user selects shipment method on check out page 
	And user add "<Payment Type>" details in payment method 
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
		
		
@R2_Web @R2_Regression @R2_All @R2_PlaceOrdeAllCombinations @P-Low
@C-Checkout @CR-SK 
Scenario Outline:
Verify if user is able to place an order for bulk gift card 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "SKUForBulkGiftCard" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user click on checkout button 
	And user adds shipment address on checkout page 
	And user selects shipment method on check out page 
	And user add "<Payment Type>" details in payment method 
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
		
@R2_Web @R2_Regression @R2_All @R2_PlaceOrdeAllCombinations @P-Low
@C-Checkout @CR-SK 
Scenario Outline:
Verify if user is able to place an order for bait products
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "SKUForBaitProduct" and navigates to PDP 
	And user click on Add to Cart Button for "Bait Product" 
	And user is navigated to Add to cart Notification popup 
	And user click on checkout button 
	And user adds shipment address on checkout page 
	And user selects shipment method on check out page 
	And user add "<Payment Type>" details in payment method 
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