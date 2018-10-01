Feature: BOPIS Change Store in CHECKOUT

@R2_Web @R2_Regression @R2_All @P-Highest @C-Cart @KER-3178 @ZYP_CART_K3178-9940 @CR-AG @1HR_R2
Scenario: Verify the user is able to view the Change Location under In-store Pick Up on Checkout
Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "EmailAddress"
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	Then Shipping radio button is selected by default 
	Then in-stores radio button is deselected 
 
    @R2_Web @R2_Regression @R2_All @P-Highest @C-Cart @KER-3178 @ZYP_CART_K3178-9941 @CR-AG
 Scenario: Verify that user view Find a Store modal from Change Location in Checkout
 Given user launches the browser and navigates to "ASO_HOME" page 
		When user clicks on SignIn link from global header 
	And user logs in as "EmailAddress"
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
   And click on Change Location link
   Then Find in Store modal should get open
    
    @R2_Web @R2_Regression @R2_All @P-Highest @C-Cart @KER-3178 @ZYP_CART_K3178-9942 @CR-AG
Scenario: Verify user can change the store using Find in Store modal
Given user launches the browser and navigates to "ASO_HOME" page 
		When user clicks on SignIn link from global header 
	And user logs in as "EmailAddress"
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
     When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"   
    When user navigates to checkout page
    
    
#    @R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-3178 @ZYP_CART_K3178-9943 @CR-AG
#Scenario: Verify the user is able to see the full inventory availability on Find a store modal
#Given user launches the browser and navigates to "ASO_HOME" page 
#		When user clicks on SignIn link from global header 
#	And user logs in as "EmailAddress"
#	When User searches a product "productName" and navigates to PDP
#	And user click on Add to Cart Button 
#	And user click on checkout button
#     When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"   
#
#    
#    @R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-3178 @ZYP_CART_K3178-9944 @CR-AG
#Scenario: After searching for a couple of different keywords the header stops displaying
#Given user launches the browser and navigates to "ASO_HOME" page 
#		When user clicks on SignIn link from global header 
#	And user logs in as "EmailAddress"
#	When User searches a product "productName" and navigates to PDP
#	And user click on Add to Cart Button 
#	And user click on checkout button
#     When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"   
#    
#    
#@R2_Web @R2_Regression @R2_All @P-Medium @C-Cart @KER-3178 @ZYP_CART_K3178-9945 @CR-AG
#Scenario: Verify the user is able to see the partial inventory availability on Find a store modal
#Given user launches the browser and navigates to "ASO_HOME" page 
#	When user clicks on SignIn link from global header 
#	And user logs in as "EmailAddress"
#	When User searches a product "productName" and navigates to PDP
#	And user click on Add to Cart Button 
#	And user click on checkout button
#     When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"   
#
#     
#         
#@R2_Web @R2_Regression @R2_All @P-Medium @C-Cart @KER-3178 @ZYP_CART_K3178-9946 @CR-AG
#Scenario: Verify the user is able to see no inventory availability on Find a store modal
#Given user launches the browser and navigates to "ASO_HOME" page 
#		When user clicks on SignIn link from global header 
#	And user logs in as "EmailAddress"
#	When User searches a product "productName" and navigates to PDP
#	And user click on Add to Cart Button 
#	And user click on checkout button
#     When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"   