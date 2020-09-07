Feature: Place Order

@R2_Web @C-Order @CC-Cart_Order @P-High_Order   @KER-2915 @ZYP_CART_K2915-8190 @CR-AG @1HR_R2 @C1-Message
Scenario Outline: verify if user should be able to submit the order on the checkout page
    Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP
#	And user click on Add to Cart Button 
	And user click on ship it button 
	And user click on checkout button
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	And user add "<Payment Type>" details in payment method for "guest" user
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
	Then Verify the message on the page 
		|# Message for successful order is displayed		|
		|THANKS FOR SUBMITTING YOUR ORDER!					|
	Examples: 
		|Payment Type	|
		|Credit Card - VISA	|

			
#	And user fill the PO box in shipping address 
#	And user click on Go To Shipping Method button in Checkout page
#	Then user click on go to payment present in shipping method
#	And user verifies master card entery in the card fields
#	Then user fill email address in payment
#	Then user clicks on the Review order button
#	And user able to see the button place order
#	And user check order confirmation status in order summary page
	
		
   
  @RegressionP2
Scenario: Verify SKU is displayed for all the line items in cart page
    Given user launches the browser and navigates to "ASO_HOME" page 
    When User searches a product "Productnamenew" and navigates to PDP
    And user click on Add to Cart Button
    And close the pop up
    And User searches a product "dsv_sku" and navigates to PDP
    And user click on Add to Cart Button
    And user click on view cart
    Then verify child SKU of the product is displayed on the Cart page

	
	
Scenario Outline: Verify mixed items in the cart and their messages under each line item and place order
    Given user launches the browser and navigates to "ASO_HOME" page 
    When User searches a product "Productnamenew" and navigates to PDP
    And user click on Add to Cart Button
    And close the pop up
    When User searches a product "dsv_sku" and navigates to PDP
    And user click on Add to Cart Button
    And close the pop up
    And User searches a product "SKUForWhiteGlovenew" and navigates to PDP
    And user click on Add to Cart Button
    And user click on view cart
    Then verify the message for whiteGlove item and DSV item on the cart page
	And user clicks on checkout button on cart page
  	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	And user add "<Payment Type>" details in payment method for "guest" user
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order
		Examples: 
		|Payment Type	|
		|Credit Card - VISA	| 		
		
	