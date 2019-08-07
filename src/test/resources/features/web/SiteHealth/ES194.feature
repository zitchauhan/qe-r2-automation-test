Feature: Customer should redirect to paypal website by clicking on paypal button on cart page.

 @ES194 @CR-NN
Scenario: verify if user is redirecting to paypal home page by clicking on paypal button on cart page.

    Given user launches the browser and navigates to "ASO" page 
	When User searches a product "productNameSTH" and navigates to PDP
	And user click on ship it button 
	And user will click on View Cart button 
    When user navigate to Cart page 
	Then Verify paypal button on Cart Page 
	Then User click on paypal button on cart page
#	Then user switch to iframe and enter the paypal login "PayPalEmail" "PayPalPassword" 
    Then Verify User is navigated to paypal home page.