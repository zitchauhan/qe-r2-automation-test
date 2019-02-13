Feature: BOPIS Change Store in Cart 

@R2_Web @R2_Regression @R2_All @P-High @CB-Cart @C-BOPIS @KER-2865 @ZYP_CART_K2865-9980
Scenario: Verify that user view 'Find a Store' modal from Change Location in Cart Order Summary
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When User searches a product "BOPIS_Regular_Product" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user select in store pickup option 
	And user click on change location link in order summery cart page
	And Find Store Modal should pop-up 

@C-BOPIS @R2_Web @R2_All @P-Highest @CB-Cart @KER-2865 @ZYP_CART_K2865-9983
Scenario: Verify the user is able to see the full inventory availability on Find a store modal
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2"
	When user enters "BOPIS_SOF_Product" in the searchbox
	And user click on Add to Cart Button 
	And user click on view cart
	Then user select in store pickup option
    And user click on change location link in order summery cart page
	And Find Store Modal should pop-up 
    Then user check for the products count	
    
@C-BOPIS @R2_Web @R2_All @P-Highest @CB-Cart @KER-2865 @ZYP_CART_K2865-9984
Scenario: Verify the user is able to see the partial inventory availability on Find a store modal
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2"
	When user enters "BOPIS_Product" in the searchbox
	And user click on Add to Cart Button 
	And user click on view cart
	When User searches a product "BOPIS_Regular_Product" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user select in store pickup option
	And user click on change location link in view cart page
    And user collapse the store name
    Then user check for the products count and item available should be less
   
@C-BOPIS @R2_Web @R2_All @P-Highest @CB-Cart @KER-2865 @ZYP_CART_K2865-9985
Scenario: Verify the user is able to see no inventory availability on Find a store modal
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2"
	When user enters "BOPIS_Product" in the searchbox
	And user click on Add to Cart Button 
	And user click on view cart
	Then user select in store pickup option
	And user click on change location link in view cart page
	Then User is able to see Find a Store Modal
    Then user check for the products count and item not available should come   
        
	