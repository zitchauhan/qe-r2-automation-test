Feature: Place Order

@R2_Web @R2_Regression @P-High @C-Checkout @KER-2915 @ZYP_CART_K2915-8190 @CR-AG 
Scenario: verify if user should be able to submit the order on the checkout page
    Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	And user fill the PO box in shipping address 
	And user click on Go To Shipping Method button in Checkout page
	Then user click on go to payment present in shipping method
	And user verifies master card entery in the card fields
	Then user fill email address in payment
	Then user clicks on the Review order button
	And user able to see the button place order
	And user check order confirmation status in order summary page