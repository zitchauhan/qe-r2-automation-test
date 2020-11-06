Feature: Add to cart via URL for simple products - Non Signed in user

 
	@OMNI-3724 @C-Order @Regression @CR-SB @C-Checkout @Web
	Scenario Outline: Verify a guest is able to place order for one product using the Add to Cart URL
	
		Given user launches the browser and navigates to "ASO_HOME" page
  	And user hit add to cart URL for "one" product
  	Then user verifies correct productID and quantity is visible on the cart page for "one" product
  	And user clicks on checkout button on cart page
  	And user adds shipment address on checkout page for "guest" user
		Then user click on go to payment present in shipping method
		And user add "<Payment Type>" details in payment method for "guest" user
		And user clicks on place order on checkout page 
		Then verify user is able to successfully place the order
		Examples: 
		|Payment Type	|
		|Credit Card - VISA	| 
		
		
	@OMNI-3724 @C-Order @Regression @CR-SB @C-Checkout @Web 
	Scenario Outline: Verify a guest is able to place order for two product using the Add to Cart URL
	
		Given user launches the browser and navigates to "ASO_HOME" page
  	And user hit add to cart URL for "two" product
  	Then user verifies correct productID and quantity is visible on the cart page for "two" product
  	And user clicks on checkout button on cart page
  	And user adds shipment address on checkout page for "guest" user
		Then user click on go to payment present in shipping method
		And user add "<Payment Type>" details in payment method for "guest" user
		And user clicks on place order on checkout page 
		Then verify user is able to successfully place the order
		Examples: 
		|Payment Type	|
		|Credit Card - MASTER	| 
		
		
  	
  
	
	 	