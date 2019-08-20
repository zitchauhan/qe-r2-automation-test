Feature: B06-150 - BOPIS PDP Store Selection

@C-BOPIS @R2_Web @R2_NonRegression @R2_All @P-Low @CB-Cart @KER-3613 @ZYP_CART_K3613-10727 @CR-RK 
Scenario: Verify that user should be able to click select store in header & open the Find Store modal 
	Given user launches the browser and navigates to "ASO_HOME" page
	When clicks on the Select Store link in the header
	Then user should be able to see the Find a Store modal prompting up

@C-BOPIS @R2_Web @R2_NonRegression @R2_All @P-Low @CB-Cart @KER-3613 @ZYP_CART_K3613-10759
Scenario: Verify that the user should be able to search the store details by entering ZIP code
	Given user launches the browser and navigates to "ASO_HOME" page
	When clicks on the Select Store link in the header
	Then user enters ZIP "BOPIS_Store2" code manually in the search input bar
	And Clicks submit button
	Then user click on plus icon in Store Address drawer 
	And user verify the store corresponding to zipcode entered "BOPIS_Store2"
	
	
	@C-BOPIS @R2_Web @R2_NonRegression @R2_All @P-Low @CB-Cart @KER-3613 @ZYP_CART_K3613-10758
	Scenario: Verify that the user should be displayed with an  error message when there is no store within 250 miles (or configured value)
	Given user launches the browser and navigates to "ASO_HOME" page
	When user enters "BOPIS_Product" in the searchbox
	And clicks on the Change Pickup Location link
	Then user should be able to see the Find a Store modal
	Then user enter "WrongzipCode" in Find a Store Model
	And user click on submit button
	Then verify Static error message


@C-BOPIS @R2_Web @R2_NonRegression @R2_All @P1 @CB-Cart @KER-3613 @ZYP_CART_K3613-10728 @CR-RK @1HR_R2 
Scenario: Verify that user should be able to open the Find Store modal from PDP for BOPIS
Given user launches the browser and navigates to "ASO_HOME" page 
When user clicks on one of the category and navigates to LOne SOF
    Then user clicks on one of the subcategory and navigates to LTwo SOF
    Then user clicks on one of the product category and navigates to LThree SOF
	Then User is navigated to pdp page
	And clicks on the Change Pickup Location link
	Then user should be able to see the Find a Store modal
	

	
@C-BOPIS @R2_Web @R2_All @P-Low @CB-Cart @KER-3613 @ZYP_CART_K3613-10769 @CR-RK 	
Scenario: Verify that user should be able to see proper  message while adding to cart for the product which is not available for pickup
Given user launches the browser and navigates to "ASO_HOME" page 
And user clicks on SignIn link from global header
	Then Verify below Sub/Main Module of My Account
	|# Verify following elements in Sign in/login page	|
	|SignInPage_SignIn_btn								|
	|SignInPage_SignUp_btn								|
	|SignInPage_EmailAddress_txt			   			| 
	|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	And User navigates to L2 Mens clothing
   Then user clicks on one of the subcategory and navigates to LTwo
   And user is able to see the product category name in section title
   Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	And user should be able to see the BOPIS availability as Cart Items available/Not available for Pickup with product image thumbnails
	
	
	
@C-BOPIS @R2_Web @R2_All @P-Low @CB-Cart @KER-3613 @ZYP_CART_K3613-10760	
Scenario: Verify that user should be able to view  proper error message while adding to cart if a product has limited stock for pick-up 
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "LimitedStockItemBOPISMail" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User should be able to see Search Box on Homepage 
	Then User searches a product "LimitedStockItemBOPIS" and navigates to PDP	
	And user verify that limitied stock message "Limited_Stock_Message" is displayed
	When enter the "MoreThanAvailableQuantity" in PDP page
	#And user click on Add to Cart Button 
	And user click on ship it button 
	Then user verify the limited stock message

	
@C-BOPIS @R2_Web @R2_All @P-Low @CB-Cart @KER-3613 @ZYP_CART_K3613-10766
Scenario: Verify that user should be able to see an error message while adding more inventory of an item to their cart surpassing its existing inventory items for the selected store
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "Login_username" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User should be able to see Search Box on Homepage 
	Then User searches a product "limitedQuantityRestriction_CMC" and navigates to PDP	
	And user verify that limitied stock message "Limited_Stock_Message" is displayed
	When enter the "MoreThanAvailableQuantity" in PDP page
	#And user click on Add to Cart Button 
	And user click on ship it button 
	Then user verify the limited stock message
	And user will click on View Cart button 
	When user navigate to Cart page 
	Then user select in store pickup option
	And User verify that the limited quantity is added to cart
	
@C-BOPIS @R2_Web @R2_All @P-Low @CB-Cart @KER-3613 @ZYP_CART_K3613-10768
Scenario: Verify that user should be able to see proper message if an item is BOPIS eligible but is out of stock at the selected store
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "Login_username" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2"  
	And User should be able to see Search Box on Homepage 
	When user enters "Not_Available_Product" in the searchbox	
	And user Verify that Pickup icon must be greyed out
	And message "Not_Available" with Store Name is displayed 

	
	
@C-BOPIS @R2_Web @R2_NonRegression @R2_All @P-Low @CB-Cart @KER-3613 @ZYP_CART_K3613-10769
Scenario: Verify that user should be able to see proper message while adding to cart for the product which is not available for pickup
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "Login_username" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2"  
	And User should be able to see Search Box on Homepage 
	When user enters "Not_Available_Product" in the searchbox	
	And user Verify that Pickup icon must be greyed out
	And user click on change Location link PDP
	And user should be able to see Item Not Available for Pickup message
	
	
