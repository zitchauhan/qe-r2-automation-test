Feature: Product Pricing Display - Price Display Options


 @Web @Regression @KER-608  @ZYP_PLP_K608-3303 @C-PLP 
Scenario: Verify User is able to click on ShopGiftCards and Navigates to ShopGift Cards Page.
 	Given user launches the browser and navigates to "ASO_HOME" page
    And user expect element Services to be present
	When user expect element ShopGiftCards to be present 
	Then user click on ShopGiftCards and navigates to ShopGiftCards Page
	
	
 @Web @Regression @KER-608  @ZYP_PLP_K608-3302 @C-PLP 
Scenario: Verify prices should not display for Gift Card on product card
 	Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And user verify that the page contains price range products
    
    
	
	