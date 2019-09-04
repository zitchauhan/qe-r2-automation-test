Feature: Paypal button on cart page

 @ES193 @CR-NN
Scenario: verify if user should be able to submit the order on the checkout page
    Given user launches the browser and navigates to "ASO" page 
	When User searches a product "productNameSite_Health" and navigates to PDP
	And user click on ship it button 
	And user will click on View Cart button 
    When user navigate to Cart page 
	Then Verify paypal button on Cart Page 