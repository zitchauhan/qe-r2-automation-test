Feature: BOPIS Change Store in CHECKOUT

@C-BOPIS @R2_Web @R2_NonRegression @R2_All @P1 @CB-Cart @KER-3178 @ZYP_CART_K3178-9940 @CR-AG @1HR_R2 
Scenario: Verify the user is able to view the Change Location under In-store Pick Up on Checkout
    Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header 
	And user logs in as "Cart_BopisEmail" 
	When user enters "BOPIS_SOF_Product" in the searchbox
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user click on view cart
	Then user select in store pickup option
	When user will click on Checkout button and navigates to Checkout page
	And user click on change location button
 
@C-BOPIS @R2_Web @R2_All @P1 @CB-Cart @KER-3178 @ZYP_CART_K3178-9941 
Scenario: Verify that user view Find a Store modal from Change Location in Checkout 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	When user enters "BOPIS_SOF_Product" in the searchbox
	#When user enters "BOPIS_Product" in the searchbox
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user click on view cart
	Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
    Then user click on change location button
    Then User is able to see Find a Store Modal
    
@C-BOPIS @R2_Web @R2_All @P1 @CB-Cart @KER-3178 @ZYP_CART_K3178-9942 
Scenario: Verify user can change the store using Find in Store modal 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	When user enters "BOPIS_SOF_Product" in the searchbox
	#When user enters "BOPIS_Product" in the searchbox
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user click on view cart
	Then user select in store pickup option
	#And user click on checkout button
	And user will click on Checkout button and navigates to Checkout page
	Then user click on change location button
	When User select store with "BOPIS_Store2"
	
	
@C-BOPIS @R2_Web @R2_All @P1 @CB-Cart @KER-3178 @ZYP_CART_K3178-9943 
Scenario: Verify the user is able to see the full inventory availability on Find a store modal
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	#When user enters "BOPIS_SOF_Product" in the searchbox
	When user enters "BOPIS_Product" in the searchbox
	#And user click on Add to Cart Button
	And user click on ship it button 
	And user click on view cart
	Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
#	And user check the selected store name
    Then user click on change location button
    Then User is able to see Find a Store Modal
    And user check that the selected store appear at the top
    Then user check for the products count
    

    
    @C-BOPIS @R2_Web @R2_NonRegression @R2_All @P-High_B @CB-Cart @KER-3178 @ZYP_CART_K3178-9944 @CR-AG
Scenario: After searching for a couple of different keywords the header stops displaying
Given user launches the browser and navigates to "ASO_HOME" page 
		When user clicks on SignIn link from global header 
	And user logs in as "EmailAddress"
	When User searches a product "productName" and navigates to PDP
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user click on checkout button
     When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"   
    
    
@C-BOPIS @R2_Web @R2_All @P1 @CB-Cart @KER-3178 @ZYP_CART_K3178-9945
Scenario: Verify the user is able to see the partial inventory availability on Find a store modal
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	#And user logs in as "Bopis_Email" 
	When user enters "BOPIS_Product" in the searchbox
	#And user click on Add to Cart Button
	And user click on ship it button 
	And then user close the add to cart popup
	When user enters "LimitedStockItemBOPIS" in the searchbox
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user click on view cart
	Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
	And user adds shipment address on checkout page for "guest" user 
	And user selects shipment method on check out page for "guest" user
	And user check the selected store name
    Then user click on change location button
    Then User is able to see Find a Store Modal
    And user check that the selected store appear at the top
    And user collapse the store name  
    Then user check for the products count and item available should be less 
         
@C-BOPIS @R2_Web @R2_All @P1 @CB-Cart @KER-3178 @ZYP_CART_K3178-9946
Scenario: Verify the user is able to see no inventory availability on Find a store modal
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "EmailAddress" 
	And User empty the cart
	Then user change the selected store "BOPIS_Store2"
	When user enters "LimitedStockItemBOPIS" in the searchbox
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user click on view cart
	Then user select in store pickup option
	And user will click on Checkout button and navigates to Checkout page
	And user check the selected store name
    Then user click on change location button
    Then User is able to see Find a Store Modal
    And user check that the selected store appear at the top
    Then user check for the products count and item not available should come
