Feature:  [Desktop]Verify product in grid are sorted
 
 @Web @Regression @KER-710 @ZYP_K710-3656 @C-HP @1HR
   Scenario: [Web]Verify the product in grid are sorted by Price "Low-High"
   Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L3 from home page for grid sorting
    Then User should be able to see L3 Page for grid sorting
    Then navigate to sort by and navigate to best selling 
    Then compare the price is in Low to high mode 
    
@Web @Regression @KER-710 @ZYP_K710-3655  @C-HP
Scenario: [Web]Verify the product in grid are sorted by Price "High-Low"
   Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L3 from home page for grid sorting
    Then User should be able to see L3 Page for grid sorting
    Then navigate to sort by and navigate to best selling in high to low  
    Then compare the price is in high to low mode  