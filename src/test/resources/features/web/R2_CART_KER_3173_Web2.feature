Feature: B06-250- verify BOPIS radio button

@C-BOPIS @R2_Web  @R2_All   @CC-Cart   @KER-3173 @ZYP_CHECKOUT_K3173-10949 @CR-RK
Scenario: Verify request cancellation of order types - BOPIS Orders
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header 
	And user logs in as "Cart_BopisEmail" 
	When User searches a product "BOPIS_Shipping_Not_Availiable" and navigates to PDP 
	When user click on Add to cart button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then user verify BOPIS radio button
 