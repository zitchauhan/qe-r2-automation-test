Feature: B06-225- BOPIS Order Confirmation Impact

@R2_Web @R2_Regression @R2_All @P-Highest @1HR-R2 @C-Checkout @KER-2868 @ZYP_CHECKOUT_K2868-10722 @CR-AKK
Scenario: Verify that UnAuthenticated user is able to create an account on Order Confirmation page
Given user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	Then verify user can begin checkout
	And user fill the credit card detail in payment
	And user enters new billing address information "FirstName" , "LastName" , "PhoneNumber" , "Address" , "FindAsStoreZIPCode" , "EmailAddress" 
	Then user click on review order button
	And user able to see the button place order
	And registers for the account from the Order confirmation screen with "Password" 
	Then Verify the message on the page 
		#		|# Then guest user should be displayed with a banner message for successful account creation|
		#		|created an account|

		@R2_Web @R2_Regression @R2_All @P-Highest @1HR-R2 @C-Checkout @KER-2868 @ZYP_CHECKOUT_K2868-10709 @CR-AKK
Scenario: Verify that UnAuthenticated user is able to create an account on Order Confirmation page
Given user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	Then verify user can begin checkout
	And user fill the credit card detail in payment
	And user enters new billing address information "FirstName" , "LastName" , "PhoneNumber" , "Address" , "FindAsStoreZIPCode" , "EmailAddress" 
	Then user click on review order button
	And user able to see the button place order
	And registers for the account from the Order confirmation screen with "Password" 
	Then Verify the message on the page 