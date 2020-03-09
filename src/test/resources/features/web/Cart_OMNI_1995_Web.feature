Feature: BOPIS - taxes should update correctly on change of the store on cart page

@Web @Regression @OMNI-1995_1 @CR-MT @C-Checkout @C-Order
Scenario: Verify taxes should be updated correctly onchange of the store on cart page
	Given user launches the browser and navigates to "ASO_HOME" page 
  Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_Regular_Product" in the searchbox
	Then user click on pickup button
	And user click on view cart
	Then get the tax on cart page "before" refresh 
	And user click on change location link in order summery cart page
	And User select another store "FindAsStoreZIPCodeForTaxChange"
	#And User select another store "BOPIS_Store1"
	Then get the tax on cart page "after" refresh 
  Then compare the tax applied on cart page