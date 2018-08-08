Feature: [Mobile]Verify product in grid are sorted



@Mobile @Regression @KER-710  @ZYP_K710-3648 @C-HP @1HR
Scenario: [Mobile]Verify the product in grid are sorted by Price "Low-High"
 Given user launches the browser and navigates to "ASO_HOME" page
 Then User clicks on the burger menu
 Then User navigates to L3 from home page for grid sorting
 Then User should be able to see L3 Page for grid sorting
    Then navigate to sort by and navigate to best selling 
    Then compare the price is in Low to high mode



@Mobile @Regression @KER-710  @ZYP_K710-3647 @C-HP
Scenario: [Mobile]Verify the product in grid are sorted by Price "High-Low"
 Given user launches the browser and navigates to "ASO_HOME" page
 Then User clicks on the burger menu
 Then User navigates to L3 from home page for grid sorting
 Then User should be able to see L3 Page for grid sorting
   Then select low to high  
   Then compare the price is in high to low mode
  