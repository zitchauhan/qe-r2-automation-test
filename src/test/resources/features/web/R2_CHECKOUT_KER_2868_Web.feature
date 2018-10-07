Feature: B06-225- BOPIS Order Confirmation Impact

@R2_Web  @C-Order @CC-Checkout_Order @R2_All @P-Highest @1HR_R2   @KER-2868 @ZYP_CHECKOUT_K2868-10722 @CR-AKK
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
				|# Then guest user should be displayed with a banner message for successful account creation|
				|created an account|

		@R2_Web @C-Order @CC-Checkout_Order @R2_All @P-Highest @1HR_R2   @KER-2868 @ZYP_CHECKOUT_K2868-10709 @CR-AKK
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
	
	
	@R2_Web @C-Order @CC-Checkout_Order @R2_All @P-High_Order    @KER-2868 @ZYP_CHECKOUT_K2868-10716 @CR-AKK
Scenario: Verify that UnAuthenticated user is able to view In-Store Pickup Information on Order confirmation page
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
	Then Verify that In-Store Pickup Information is displayed
	
	@R2_Web @C-Order @CC-Checkout_Order @R2_All @P-High_Order   @KER-2868 @ZYP_CHECKOUT_K2868-10739 @CR-AKK
Scenario: Verify that UnAuthenticated user is able to view In-Store Pickup Information on Order confirmation page
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
	And Verify that notes are displayed
	
	
	@R2_Web  @C-Order @CC-Checkout_Order @R2_All @P-High_Order    @KER-2868 @ZYP_CHECKOUT_K2868-10740 @CR-AKK
Scenario: Verify that UnAuthenticated user is able to view   Payment Details  on Order confirmation page
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
	And Verify that Order Summary displayed
	
	@R2_Web @C-Order @CC-Checkout_Order @R2_All @P-High_Order   @KER-2868 @ZYP_CHECKOUT_K2868-10738 @CR-AKK
Scenario: Verify that UnAuthenticated user is able to view Payment Details on Order confirmation page
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
	And Verify that Payment Details is displayed
	
	
	@R2_Web @C-Order @CC-Checkout_Order @R2_All @P-Low   @KER-2868 @ZYP_CHECKOUT_K2868-10713 @CR-AKK
Scenario: Verify that UnAuthenticated user is able to view account section on Order confirmation page
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
				|# Then guest user should be displayed with a banner message for successful account creation|
				|created an account|
	
	
	
	
	