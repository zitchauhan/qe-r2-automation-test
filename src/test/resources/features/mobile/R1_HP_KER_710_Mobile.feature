Feature: [Mobile]Verify product in grid are sorted



@Mobile @Regression @KER-710  @ZYP_HP_K710-3648 @C-HP @CR-RKA @1HR
Scenario: [Mobile]Verify the product in grid are sorted by Price "Low-High"
 Given user launches the browser and navigates to "ASO_HOME" page
 Then User clicks on the burger menu
 Then User navigates to L3 from home page for grid sorting
# Then User should be able to see L3 Page for grid sorting
    Then navigate to sort by and navigate to best selling 
    Then compare the price is in Low to high mode



@Mobile @Regression @KER-710  @ZYP_HP_K710-3647 @C-HP @CR-RKA
Scenario: [Mobile]Verify the product in grid are sorted by Price "High-Low"
 Given user launches the browser and navigates to "ASO_HOME" page
 Then User clicks on the burger menu
 Then User navigates to L3 from home page for grid sorting
# Then User should be able to see L3 Page for grid sorting
   Then select low to high  
   Then compare the price is in high to low mode
  
  
  @Mobile @Regression @KER-710  @ZYP_HP_K710-2623 @C-HP @CR-RKA
  Scenario: [Mobile]To verify user is able to filter on Product Listing/landing page 
  Given user launches the browser and navigates to "ASO_HOME" page
 Then User clicks on the burger menu
 Then User should be able to see L3 Page of shoe 
  Then User clicks on the filter flyout
    And User expands all Filter Options
    Then User select the brand facet product from L3 
      Then User veriy brand facet 
      
      
   
    @Mobile @Regression @KER-710  @ZYP_HP_K710-5338 @C-HP @CR-RKA
    Scenario:  To verify user is able to filter on Sub category landing page - Mobile
     Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2 from home page for shoe catagory
    Then User clicks on the filter flyout
    And User expands all Filter Options
    Then User select the brand facet product from L3 
      Then User veriy brand facet 
     
 
    