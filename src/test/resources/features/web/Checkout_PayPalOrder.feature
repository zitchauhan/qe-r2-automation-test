Feature: CHECKOUT Guest user BOPIS item PAYPAL as tender

@AutomationSmoke	
Scenario:  Checkout - Guest User PAYPAL order Regular BOPIS item
	Given user launches the browser and navigates to "ASO_HOME" page 
	#Then User should be able to click on Find Store 
	#And Find Store Modal should pop-up 
	#When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_Regular_Product" in the searchbox
#	#And user click on Add to Cart Button 
	And user click on ship it button
	And user click on view cart
	#Updated by VSN on 07-22-19 for smoke test fix
	#Then user select in store pickup option 
	And user will click on Checkout button and navigates to Checkout page
	And user adds shipment address on checkout page for "guest" user
	Then user click on go to payment present in shipping method 
	When user clicks on Go to payment CTA
	Then user click on paypal radiobtn
	And user click on paypal checkout button
	#And enter the paypal login "PayPalEmail" "PayPalPassword" 
	Then user switch to iframe and enter the paypal login "PayPalEmail" "PayPalPassword" 
	And user able to see the button place order
	And user is navigated to order confirmation page and captures order number
	
