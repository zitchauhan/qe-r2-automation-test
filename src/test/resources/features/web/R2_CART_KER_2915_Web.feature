Feature: Place Order

@R2_Web @C-Order @CC-Cart_Order @P-High_Order   @KER-2915 @ZYP_CART_K2915-8190 @CR-AG @1HR_R2 @C1-Message
Scenario Outline: verify if user should be able to submit the order on the checkout page
    Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP
#	And user click on Add to Cart Button 
	And user click on ship it button 
	And user click on checkout button
	And user adds shipment address on checkout page for "guest" user
	Then user click on go to payment present in shipping method
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

	
	@RegressionP2  
 Scenario: Verify mixed items in the cart and their messages under each line item
    Given user launches the browser and navigates to "ASO_HOME" page
    And User should be able to click on Find Store 
		And Find Store Modal should pop-up 
		When User select store with "BOPIS_Store2"
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
	
	@RegressionP2
  Scenario Outline: Verify the category level promotions created in CMC are getting applied
		Given user launches the browser and navigates to "ASO_HOME" page
		When User searches a product "Productnamenew" and navigates to PDP
    And user click on Add to Cart Button
    And user click on view cart
    And Verify that the Category level promotion is applied and displayed on cart page
    And user clicks on checkout button on cart page
  	And user adds shipment address on checkout page for "guest" user
		Then user click on go to payment present in shipping method
		And user add "<Payment Type>" details in payment method for "guest" user
		And Verify the Category level promotion is applied and displayed on Order Summary section
		And user clicks on place order on checkout page 
		Then verify user is able to successfully place the order
		Examples: 
		#|Payment Type	|
		|Credit Card - VISA	|
		
	@RegressionP2
  Scenario: Validate user is able to change ship modes of an STS added item to Store Pickup or Home Delivery on cart page
    Given user launches the browser and navigates to "ASO_HOME" page
    And User should be able to click on Find Store 
		And Find Store Modal should pop-up 
		When User select store with "BOPIS_Store2"
		When User searches a product "STSItemSKU" and navigates to PDP
		And user click on Add to Cart Button
    And user click on view cart
    And user select the option for Store pick up
    Then Verify that the Store pick up is selected and Home delivery option is unselected
    And Verify that after selecting the Home delivery option again the Store pick up option should be unselected
    
    
    
 @RegressionP2
 Scenario: Validate whether BOPIS WG item is getting successfully added to cart and is not showing OOS
  Given user launches the browser and navigates to "ASO_HOME" page
  And User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2"
	When User searches a product "SKUForWhiteGlovenew" and navigates to PDP
	Then user click on pickup button 
	And user click on view cart
	And Verify that user should be able to navigate to the cart page and the item should be successfully added to cart
	