Feature: Registration 

@C-BOPIS @R2_Web  @R2_All @P-Highest  @1HR_R2 @C-NonOrder @CC-Checkout_Order   @KER-2856 @ZYP_CHECKOUT_K2856-10865 @CR-RK 
Scenario: Verify Mixed Cart Order Confirmation - Fullfilment methods Ship to Home and BOPIS 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	When user enters "SKUForBopisProduct" in the search box 
	When user click on Add to cart button 
	Then user is navigated to Add to cart Notification popup 
	And user click on continue shopping 
	When user enters "productName" in the search box 
	And user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user click on checkout button in Cart page 
	And user adds shipment address on checkout page for "authenticated" user 
	And user selects shipment method on check out page for "authenticated" user 
	And user add "credit card" details in payment method for "authenticated" user 
	And user able to see the button place order 
	And user is navigated to order confirmation page and captures order number 