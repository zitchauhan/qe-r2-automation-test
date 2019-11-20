Feature: Paypal button should be hidden when ammo item added to cart.

 @KER_15918 @CR-NN
Scenario: verify paypal button should be hidden when ammo is added in cart page

  Given user launches the browser and navigates to "ASO" page 
	When User searches a product "SKUAmmo" and navigates to PDP
	And user click on ship it button 
	And user will click on View Cart button 
    When user navigate to Cart page 
	#Then Verify paypal button on Cart Page 
	Then Verify paypal button should not be displayed on Cart Page