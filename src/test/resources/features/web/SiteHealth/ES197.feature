Feature: PayPal on Cart: Display Accurate Shipping and Tax on Order Review After Arriving from PayPal

 @ES197 @CR-NN
Scenario: Verify Accurate Shipping and Tax on Order Review After Arriving from PayPal

    Given user launches the browser and navigates to "ASO" page 
	When User searches a product "productNameSTH" and navigates to PDP
	And user click on ship it button 
	And user will click on View Cart button 
    When user navigate to Cart page 
    Then Verify paypal button on Cart Page 
	Then User click on paypal button on cart page
#	Then user switch to iframe and enter the paypal login "PayPalEmail1" "PaypalPassword1" 
	Then user enter the paypal login "PayPalEmail1" "PayPalPassword" and capture order summary in paypal
	Then capture order summary in checkout after arriving from paypal
	Then verify order summary in checkout should be same as in paypal
	
	 @ES197 @CR-NN @P1 @P1Temp 
Scenario: Place order using Paypal express

    Given user launches the browser and navigates to "ASO" page 
	When User searches a product "productNameSTH" and navigates to PDP
	And user click on ship it button 
	And user will click on View Cart button 
    When user navigate to Cart page 
    Then Verify paypal button on Cart Page 
	Then User click on paypal button on cart page
	Then user switch to iframe and enter the paypal login "PayPalEmail1" "PaypalPassword1" 
#	And user enter the paypal login "PayPalEmail1" "PayPalPassword" and click on Continue button
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
	