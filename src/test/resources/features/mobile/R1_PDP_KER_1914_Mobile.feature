Feature: To verify Product Wish List - Guest/PA User Flow in Mobile

@Regression @Mobile @All @C-PDP @ZYP_PDP_K1914-3495 @KER-1914 @CR-SG  @1HR @RBeta
 Scenario: To verify Product Wish List - Guest/PA User Flow (PDP) - Signup Mobile
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then User navigates to L3 
	And User clicks on required product in L3 Page 
	Then user should able to click on wishlist button 
 	Then user should be able to enter the signin details "login" "password"
	And User verifies the wishlist modal 
	Then user enter the wishlist name
	And user confirm the successfully added modal
	And user read the SKU number
	Then User navigate to wishlist from header
	Then user check for the item SKU
               
              
                