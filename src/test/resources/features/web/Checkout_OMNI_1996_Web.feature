Feature: Taxes are getting updated on the checkout page when user changes the store multiple times

 
	@OMNI-1996 @C-Order @Regression @CR-SB @C-Checkout @Web
	Scenario: Verify taxes should be updated correctly on change of store on checkout page
	
	Given user launches the browser and navigates to "ASO_HOME" page 
  Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_Regular_Product" in the searchbox
	Then user click on pickup button
	And user click on view cart
	And user verifies taxes visible on the cart page
	And user clicks on checkout button on cart page
	And user validate the taxes on cart page are same as on checkout page
	Then user click on change location button
  Then User is able to see Find a Store Modal
  When User select store with "BOPIS_Store1" zipcode
  Then user click on change location button
  Then User is able to see Find a Store Modal
  When User select store with "BOPIS_Store2" zipcode
  And user validate the taxes for the current store are same as were before on the checkout page
  
	
			
		
	