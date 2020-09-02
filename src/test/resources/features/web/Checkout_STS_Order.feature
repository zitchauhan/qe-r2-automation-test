Feature: CHECKOUT - Guest user, add STS Order


@AutomationSmoke @RegressionP1
Scenario:  Checkout - Guest User order placement for Regular STS item
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 	
	When user enters "STS_Regular_Product" in the searchbox 
	Then user click on pickup button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	When user clicks on Go to payment CTA
	And user fill the payment details for sof guest user
	And user able to see the button place order
	Then verify user is able to successfully place the order
	
	