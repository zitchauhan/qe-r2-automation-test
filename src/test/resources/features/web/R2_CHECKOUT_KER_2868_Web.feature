Feature: B06-225- BOPIS Order Confirmation Impact 

@R2_Web @CB-MyAccount @R2_All @1HR_R2 @C-BOPIS @KER-2868 @ZYP_MYACCOUNT_K2868-10722 
Scenario: Verify that UnAuthenticated user is able to create an account on Order Confirmation page
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_Regular_Product" in the searchbox
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user click on view cart
	Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
	When user clicks on Go to payment CTA
	Then user enter payment details having random mailing address
	And user able to see the button place order
	And user is navigated to order confirmation page and captures order number
	When user enter "Password" in password field of order confirmation page 
	When user clicks on submit button on order confirmation page
	Then user verify the account is created "Unregistered_User_Account_Created_Checkout"
		
@R2_Web @C-NonOrder @CC-Checkout_Order @R2_All @P-Highest @1HR_R2 @C-BOPIS @C1-Message_B
@KER-2868 @ZYP_CHECKOUT_K2868-10709 @CR-AKK 
Scenario:
Verify that UnAuthenticated user is able to view  in-store pickup instructions on order confirmation page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	Then verify user can begin checkout 
	And user fill the credit card detail in payment 
	And user enters new billing address information "FirstName" , "LastName" , "PhoneNumber" , "Address" , "FindAsStoreZIPCode" , "EmailAddress" 
	Then user click on review order button 
	And user able to see the button place order 
	And registers for the account from the Order confirmation screen with "Password" 
	Then Verify the message on the page 
	
	
@R2_Web @C-NonOrder @CC-Checkout_Order @R2_All @P-High_B_Order @KER-2868 @C-BOPIS @ZYP_CHECKOUT_K2868-10716
Scenario: Verify that UnAuthenticated user is able to view In-Store Pickup Information on Order confirmation page
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button  
	And user will click on View Cart button 
	Then user select in store pickup option 
	Then verify user can begin checkout 
	When user clicks on Go to payment CTA
	And user fill the credit card detail in payment 
	And user enters new billing address information "FirstName" , "LastName" , "PhoneNumber" , "Address" , "FindAsStoreZIPCode" , "EmailAddress" 
	Then user click on review order button 
	And user able to see the button place order 
	And user should be able to see instore pickup information on order confirmation page
	
@R2_Web @C-NonOrder @CC-Checkout_Order @R2_All @P-High_B_Order @KER-2868 @C-BOPIS
@ZYP_CHECKOUT_K2868-10739 @CR-AKK 
Scenario:
Verify that UnAuthenticated user is able to view In-Store Pickup Information on Order confirmation page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	Then verify user can begin checkout 
	And user fill the credit card detail in payment 
	And user enters new billing address information "FirstName" , "LastName" , "PhoneNumber" , "Address" , "FindAsStoreZIPCode" , "EmailAddress" 
	Then user click on review order button 
	And user able to see the button place order 
	And Verify that notes are displayed 
	
	
@R2_Web @C-NonOrder @CC-Checkout_Order @R2_All @P-High_B_Order @KER-2868 @C-BOPIS @ZYP_CHECKOUT_K2868-10740
Scenario: Verify that UnAuthenticated user is able to view Payment Details/order summary details on Order confirmation page
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	Then user select in store pickup option 
	Then verify user can begin checkout 
	When user clicks on Go to payment CTA
	And user fill the credit card detail in payment 
	And user enters new billing address information "FirstName" , "LastName" , "PhoneNumber" , "Address" , "FindAsStoreZIPCode" , "EmailAddress" 
	Then user click on review order button 
	And user able to see the button place order 
	And user verify that item count is displayed in Order Summary
	And user verify that product attributes are displayed in Order Summary
	And user verify that other attributes are displayed in Order Summary
	
@R2_Web @C-NonOrder @CC-Checkout_Order @R2_All @P-High_B_Order @KER-2868 @C-BOPIS
@ZYP_CHECKOUT_K2868-10738 @CR-AKK 
Scenario:
Verify that UnAuthenticated user is able to view Payment Details on Order confirmation page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	Then verify user can begin checkout 
	And user fill the credit card detail in payment 
	And user enters new billing address information "FirstName" , "LastName" , "PhoneNumber" , "Address" , "FindAsStoreZIPCode" , "EmailAddress" 
	Then user click on review order button 
	And user able to see the button place order 
	And Verify that Payment Details is displayed 
	
	
@R2_Web @R2_All @P-Low @KER-2868 @C-BOPIS @ZYP_CHECKOUT_K2868-10713
Scenario: Verify that UnAuthenticated user is able to view account section on Order confirmation page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	Then user select in store pickup option 
	Then verify user can begin checkout 
	When user clicks on Go to payment CTA
	And user fill the credit card detail in payment 
	And user enters new billing address information "FirstName" , "LastName" , "PhoneNumber" , "Address" , "FindAsStoreZIPCode" , "EmailAddress" 
	Then user click on review order button 
	And user able to see the button place order 
	And registers for the account from the Order confirmation screen with "Password" 
	Then Verify the message on the page 
		|# Then guest user should be displayed with a banner message for successful account creation|
		|Create an Account|
		
@R2_Web @R2_All @P-Low @KER-2868 @C-BOPIS @ZYP_CHECKOUT_K2868-10712
Scenario: Verify that UnAuthenticated user is able to view in-store pickup instructions on order confirmation page
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	Then user select in store pickup option 
	Then verify user can begin checkout 
	When user clicks on Go to payment CTA
	And user fill the credit card detail in payment 
	And user enters new billing address information "FirstName" , "LastName" , "PhoneNumber" , "Address" , "FindAsStoreZIPCode" , "EmailAddress" 
	Then user click on review order button 
	And user able to see the button place order 
	And registers for the account from the Order confirmation screen with "Password" 
	Then Verify the message on the page 
		|# Then guest user should be displayed with a IN STORE PICKUP INSTRUCTIONS|
		|IN STORE PICKUP INSTRUCTIONS|
	And user should be able to see the instore pickup instruction		
		

	
