Feature: PayPal on Cart: Please return the customer to the cart page if the customer wishes to return to Academy.com

 @ES199 @CR-NN
Scenario: verify if user is redirecting to cart page by clicking on Cancel and return to Academy Sports Outdoor's Test Store link in paypal home page.

    Given user launches the browser and navigates to "ASO" page 
	When User searches a product "productNameSTH" and navigates to PDP
	And user click on ship it button 
	And user will click on View Cart button 
    When user navigate to Cart page 
    Then Verify paypal button on Cart Page 
	Then User click on paypal button on cart page
	Then User click on Cancel and return to Academy Sports Outdoor's Test Store link on paypal home page
	Then Verify user will navigated to cart page
	
	
	