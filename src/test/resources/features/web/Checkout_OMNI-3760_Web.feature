Feature: Add to cart via URL for simple products - Non Signed in user

 
	@OMNI-3760 @C-Order @Regression @CR-SB @C-Checkout @Web
	Scenario: Verify a logged in user is able to place order for one product using the Add to Cart URL
	
		Given user launches the browser and navigates to "ASO_HOME" page
		And user clicks on SignIn link from global header 
		And user logs in as "UserWithSavedAddressAndPayment" 
		And user navigate and deletes existing items in cart 
  	And user hit add to cart URL for "one" product
  	Then user verifies correct productID and quantity is visible on the cart page for "one" product
  	And user clicks on checkout button on cart page
 		And user clicks on edit shipping method cta 
		And user click on go to payment present in shipping method 
		And user click on confirm billing address button 
		And user able to see the button place order 
		Then Verify below Sub/Main Module of Checkout Page 
			|#%%  verify order below attributes on order confirmation page %%|
			|OrderConfirmationPage_OrderNumber|
 
		
		
	@OMNI-3760 @C-Order @Regression @CR-SB @C-Checkout @Web 
	Scenario: Verify a logged in user is able to place order for two product using the Add to Cart URL
	
		Given user launches the browser and navigates to "ASO_HOME" page
		And user clicks on SignIn link from global header 
		And user logs in as "UserWithSavedAddressAndPayment" 
		And user navigate and deletes existing items in cart 
  	And user hit add to cart URL for "two" product
  	Then user verifies correct productID and quantity is visible on the cart page for "two" product
  	And user clicks on checkout button on cart page
 		And user clicks on edit shipping method cta 
		And user click on go to payment present in shipping method 
		And user click on confirm billing address button 
		And user able to see the button place order 
		Then Verify below Sub/Main Module of Checkout Page 
			|#%%  verify order below attributes on order confirmation page %%|
			|OrderConfirmationPage_OrderNumber|
  	
  
	
	 	