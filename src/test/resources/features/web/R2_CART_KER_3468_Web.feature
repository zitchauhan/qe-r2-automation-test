Feature: B06-225 - BOPIS Errors in Cart

@C-BOPIS @R2_Web @R2_NonRegression @R2_All @P-High_B @CB-Cart @KER-3468 @ZYP_CART_K3468-9925 @CR-RK @1HR_R2
Scenario: Verify user is able to see the error messages on Cart for insufficient inventory
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore"
	 When user enters "SOFSKUNumber" in the search box
  	And User is navigated to pdp page 
	Then user click on Add to Cart Button 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When enter the "MoreThanThresholdQuantity" to X 
	Then Verify below Sub/Main Module of Cart Page
    |# Following Error Message should show on the page|
    |ErrorMsgLimitedStack|   

@R2_Web @R2_All @CB-Cart @KER-3468 @ZYP_CART_K3468-9926 @C-BOPIS
Scenario: verify user is able to see the error messages on Cart for OOS item
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	Then user navigate to Sweatshirts plp	  
	And user should be able to click on shipping and pickup drawer
	And user should be able to select the store pickup "store pickup" filter
	Then user clicks on the product card and navigates to PDP
	Then user click on Add to Cart Button
    Then user is navigated to Add to cart Notification popup
    And user will click on View Cart button
    And user navigate to Cart page
    And user should be able to see out of stock error message "BOPIS_Out_Of_Stock"
	And user click on close button in outofstock modal
	
    
@C-BOPIS @R2_Web @R2_All @CB-Cart @KER-3468 @ZYP_CART_K3468-9931
Scenario: Verify the user is able to see no inventory availability on Find a store modal
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "BOPIS_Regular_Product" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user select in store pickup option 
	And user will click on Checkout button and navigates to Checkout page
	And user will see the store error message "BOPIS_Store_Not_Selected_Error_Message"    
 
@R2_Web @R2_All @CB-Cart @KER-3468 @ZYP_CART_K3468-9935 @C-BOPIS
Scenario: Verify user is able to see the error messages for item available in lesser quantity than added once returns to cart
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2"  
	And User should be able to see Search Box on Homepage 
	When user enters "BOPIS_SOF_Product" in the searchbox	
	When user click on Add to cart button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	And user input the quantity more than available "MoreThanThresholdQuantity"
	And user should be able to see the limited quantity message "limited_quantity_Message_Cart"	 
    
@C-BOPIS @R2_Web @R2_All @CB-Cart @KER-3468 @ZYP_CART_K3468-9936
Scenario: Verify user is able to see the error messages for items OOS once returns to cart
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header
	And user logs in as "OutOfStockItemMail"
	And user clicks on mini cart Icon
	Then user verify the outofstock modal should appear
	And user should be able to see out of stock error message "BOPIS_Out_Of_Stock"	    
    
@C-BOPIS @R2_Web @R2_All @C-Cart @KER-3468 @ZYP_CART_K3468-9932
Scenario: Verify that on clicking close in alert closes the alert
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header
	And user logs in as "OutOfStockItemMail"
	And user clicks on mini cart Icon
	Then user verify the outofstock modal should appear
	And user click on close button in outofstock modal
	And user verify the outofstock modal should not appear    
    
@C-BOPIS @R2_Web @R2_All @C-Cart @KER-3468 @ZYP_CART_K3468-9938 
Scenario: Verify that on clicking close in error modal closes the modal
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header
	And user logs in as "OutOfStockItemMail"
	And user clicks on mini cart Icon
	Then user verify the outofstock modal should appear
	And user click on close button in outofstock modal
	And user verify the outofstock modal should not appear
	
@C-BOPIS @R2_Web @R2_All @C-Cart @KER-3468 @ZYP_CART_K3468-9939 
Scenario: Verify that clicking anywhere outside the modal, closes the error modal
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header
	And user logs in as "OutOfStockItemMail"
	And user clicks on mini cart Icon
	Then user verify the outofstock modal should appear
	And user click outside the outofstock modal
	And user verify the outofstock modal should not appear
