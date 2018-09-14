Feature: Debug Testing

#####In progress
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-8124 @ZYP_CART_K2927-8124 @CR-SK
Scenario: To Verify Available Taxes and Tax is > $0.00 - Authenticated User
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu 
	And user clicks on SignIn link from global header
	And user logs in as "UserWithTaxableAddress"
	And User searches a product "SKUForATaxableProduct" and navigates to PDP 
	When user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page
	And user enters "FindStoreZipcode" in change zipcode field in cart page
	Then cart page displays updated tax
	And tax displayed on cart is greater than zero
	And user makes a note of tax and total amount
	When user navigates to checkout page
	Then tax and total amount displayed in checkout page is same as cart page
