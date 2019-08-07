Feature: Paypal button should be hidden when restrictive item added to cart.

 @ES195 @CR-NN
Scenario: verify Paypal button should be hidden when restrictive item added to cart.

    Given user launches the browser and navigates to "ASO" page 
    When User searches a product "SOFSKUNumber" and navigates to PDP
	And user click on ship it button 
	And user will click on View Cart button 
    When user navigate to Cart page 
	Then Verify paypal button should not be displayed on Cart Page 