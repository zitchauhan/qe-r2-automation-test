Feature: Debug Testing 


@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3129 @ZYP_CART_K3129-8009
@CR-RK 
Scenario:
Verify if authenticated User can  view tax line item in order summary section on checkout. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User searches a product "SKUForATaxableProduct" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When user enters "FindStoreZipcode" in change zipcode field in cart page 
	Then cart page displays updated tax 
	And tax displayed on cart is greater than zero 
	And user makes a note of tax and total amount 
	When user navigates to checkout page 
	Then tax and total amount displayed in checkout page is same as cart page