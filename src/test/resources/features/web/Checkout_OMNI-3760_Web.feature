Feature: Add to cart via URL for simple products - Signed in user

 
	@OMNI-3760 @C-Order @Regression @CR-SB @C-Checkout @Web
	Scenario: Verify a logged in user is able to place order for one product using the Add to Cart URL
	
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user creates an account 
  And user hit add to cart URL for "one" product
  Then user verifies correct productID and quantity is visible on the cart page for "one" product
  And user clicks on checkout button on cart page
 	And user adds shipment address on checkout page for "newly registered" user
	And user selects shipment method on check out page for "newly registered" user 
	And user add "Credit Card" details in payment method for "newly registered" user 
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
 
		
		
	@OMNI-3760 @C-Order @Regression @CR-SB @C-Checkout @Web 
	Scenario: Verify a logged in user is able to place order for two product using the Add to Cart URL
	
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user creates an account 
  And user hit add to cart URL for "two" product
  Then user verifies correct productID and quantity is visible on the cart page for "one" product
  And user clicks on checkout button on cart page
 	And user adds shipment address on checkout page for "newly registered" user
	And user selects shipment method on check out page for "newly registered" user 
	And user add "Credit Card" details in payment method for "newly registered" user 
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order
  	
  
	
	 	