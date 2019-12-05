Feature: Verify Google Pay as payment mode 

@googlePay @Web @CR-NS @C-Order
Scenario: Checkout - Guest User Google Pay order Regular item
  Given user launches the browser and navigates to "ASO_HOME" page 
	And user enters "BOPIS_Regular_Product" in the searchbox  
	And user click on ship it button
	And user click on view cart
	And user will click on Checkout button and navigates to Checkout page
	And user adds shipment address on checkout page for "guest" user
	Then user click on go to payment present in shipping method 
	Then user click on googlePay radiobtn
	And user click on googlePay checkout button
	Then user switch to iframe and enter the google login "GooglePayEmail" "GooglePayPassword" 
	And user is navigated to order confirmation page and captures order number

@OMNI-2300 @Web @CR-NS @C-Order
Scenario: Verify GooglePay option should not display in checkout for ammunition 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user enters "ammoSKU" in the searchbox  
	And user click on ship it button
	And user click on view cart
	And user will click on Checkout button and navigates to Checkout page
	And user adds shipment address on checkout page for "guest" user
	Then user click on go to payment present in shipping method
	And user verify "GooglePay" option is not displayed
	
@OMNI-2299 @Web @CR-NS @C-Order
Scenario: Verify GooglePay option should not display in checkout for firearms 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "SOFSKUNumber" in the searchbox 
	#SOFSKUNumber,BOPIS_SOF_Product
	And user click on ship it button
	And user click on view cart
	And user will click on Checkout button and navigates to Checkout page
    And user should see unselected checkbox acknowledgement with appropriate age restriction disclaimers 
	And user click on checkbox in special order ship to store section 
	When user clicks on Go to payment CTA
	Then user click on go to payment present in shipping method
	And user verify "GooglePay" option is not displayed	 