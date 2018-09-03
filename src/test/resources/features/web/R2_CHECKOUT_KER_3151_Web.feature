Feature: View/Select Shipping Address in Checkout 

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3151 @ZYP_CHECKOUT_K3151-8189 @CR-SK 
Scenario: Verify if authenticated user can select a shipping address from the dropdown 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user creates an account and signs in
		|firstName |lastName|email						   |password |confirmPassword|
		|automation|user	|automationuser@academymail.com|Pass@1234|Pass@1234		 |
	And user adds an address 
	And User navigates to L2 Mens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page
	And click on submit button 
	And user is navigated to order summary page 
	When user selects an address from dropdown 
	And user should see the order summary page with the selected address
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3151 @ZYP_CHECKOUT_K3151-8188 @CR-SK 
Scenario: Verify if authenticated user can  view all the shipping addresses at checkout 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user creates an account and signs in
		|firstName |lastName|email						   |password |confirmPassword|
		|automation|user	|automationuser@academymail.com|Pass@1234|Pass@1234		 |
	And user adds an address
	And user adds an address
	And User navigates to L2 Mens clothing 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button  
	And user navigate to Cart page
	And click on submit button 
	When user is navigated to order summary page
	Then user verifies the default shipping address in the drop down
	And user verifies all the saved addresses in my account should be displayed in the dropdown
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3151 @ZYP_CHECKOUT_K3151-10651 @CR-SK 
Scenario: Verify  If the user has already changed/added an address within an active/incomplete order, the same would be displayed instead of default address
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user creates an account and signs in
		|firstName |lastName|email						   |password |confirmPassword|
		|automation|user	|automationuser@academymail.com|Pass@1234|Pass@1234		 |
	And user adds an address
	And user adds an address
	And User navigates to L2 Mens clothing
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page
	And user clicks on Continue to Checkout CTA
	When user enter new address details
	Then new address should be displayed instead of default address
	
	@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3151 @ZYP_CHECKOUT_K3151-10655 @CR-AKK 
	Scenario: Verify The list of addresses will be from newest added to oldest.
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	And User navigates to L2 Mens clothing
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page
	And user navigates to Checkout page And verify address available from my account
	Then the list of addresses will be from newest added to oldest.

	