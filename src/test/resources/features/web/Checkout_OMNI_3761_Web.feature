Feature: Add to cart via URL for simple products - OOS Scenarios

@OMNI-3761 @C-Order @Regression @CR-MT @C-Checkout @Web
	Scenario Outline: Verify a guest is able to place order for two product and one OOS product using the Add to Cart URL	
		Given user launches the browser and navigates to "ASO_HOME" page
  	And user hit add to cart URL for "three" product
  	And user will remove the oos item
  	Then user verifies correct productID and quantity is visible on the cart page for "three" product
  	And user clicks on checkout button on cart page
  	And user adds shipment address on checkout page for "guest" user
		And user selects shipment method on check out page for "guest" user
		And user add "<Payment Type>" details in payment method for "guest" user
		And user clicks on place order on checkout page 
		Then verify user is able to successfully place the order
		Examples: 
		|Payment Type	|
		|Credit Card - VISA	| 