Feature: CHECKOUT Guest user BOPIS item PAYPAL as tender

@AutomationSmoke @RegressionP1
Scenario:  Checkout - Guest User PAYPAL order Regular BOPIS item
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_Regular_Product" in the searchbox 
	Then user click on pickup button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user will click on Checkout button and navigates to Checkout page
	Then user click on go to payment present in shipping method 
	When user clicks on Go to payment CTA
	Then user click on paypal radiobtn
	And user click on paypal checkout button
	Then user switch to iframe and enter the paypal login "PayPalEmail" "PayPalPassword" 
	And user able to see the button place order
	And user is navigated to order confirmation page and captures order number
	Then user able to see order number 
	And User navigates to Check Oder status Page 
	Then System Generate ordernumber "GeneratedOrdernumber" and "zipcode"