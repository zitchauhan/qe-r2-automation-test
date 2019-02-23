Feature: Product Pricing Display - Price Display Options


 @Web @Regression @KER-608  @ZYP_PLP_K608-3303 @C-PLP 
Scenario: Verify prices should not display for Gift Card on product card
 	Given user launches the browser and navigates to "ASO_HOME" page
    Then User click on shop Gift Cards Link and navigate to Gift Card LAnding page 
	And user click on shop gift card CTA 
	And user verify that price is not displayed on product cards
	
	
 @Web @Regression @KER-608  @ZYP_PLP_K608-3302 @C-PLP 
Scenario: Verify prices should not display for Gift Card on product card
 	Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And user verify that the page contains price range products
    
    
	
	