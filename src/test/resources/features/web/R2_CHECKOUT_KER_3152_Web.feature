Feature: Verfiy Edit Shipping Address in Checkout 

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3152 @ZYP_CHECKOUT_K3152-8025 @CR-AKK 
Scenario: Verify that authenticated user is able to edit address in shipping address section on checkout page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user creates an account and signs in
		|firstName |lastName|email						   |password |confirmPassword|
		|automation|user	|automationuser@academymail.com|Pass@1234|Pass@1234		 |
	And user clicks on one of the category and navigates to LOne 
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
	And user navigates to Checkout page 
	Then User verifies the default address is selected in dropdown in shipping address section
	And User navigates to Shipping Method section
	Then User verifies that an "Edit" CTA is displayed for Shipping Address
	And User clicks on edit CTA 
	Then User verify Shipping Method should collapse and the Shipping Address section expands and field should populate with previously added data
	|FirstName | LastName |Phone Number| Address |
	|automation|user	  |1234567890  |BOSTON   |
	And CTA to add additional address information, that on click displays the following fields
	|Company Name| Apt. Number| P.O. Box |
	|ABC         | 10-11      | 123456   |
	Then verify If these fields already contained values, they should be display on click of "Edit"
	| ZIP Code | City  | State |
	| 12345    |ABC    | DEF   | 
	And User edits shipping address and completes the checkout
	And User navigates to Address book
	Then User verifies that the new address is added to Address book