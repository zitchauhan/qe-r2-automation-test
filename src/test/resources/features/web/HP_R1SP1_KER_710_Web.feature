Feature:  [Desktop]Verify product in grid are sorted
 
 @Web @Regression @KER-710 @ZYP_HP_K710-3656 @C-HP @CR-RKA
   Scenario: [Web]Verify the product in grid are sorted by Price "Low-High"
   Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L3 from home page for grid sorting
    Then User should be able to see L3 Page for grid sorting
    Then navigate to sort by and navigate to best selling 
    Then compare the price is in Low to high mode 
    
@Web @Regression @KER-710 @ZYP_HP_K710-3655  @C-HP @CR-RKA
Scenario: [Web]Verify the product in grid are sorted by Price "High-Low"
   Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L3 from home page for grid sorting
    Then User should be able to see L3 Page for grid sorting
    Then navigate to sort by and navigate to best selling in high to low  
    Then compare the price is in high to low mode  
    

  @Web @Regression @KER-710 @ZYP_HP_K710-3649 @C-HP @CR-RKA  
  Scenario: [Web]Verify the product in grid are sorted by "Brand (A-Z)"
   Given user launches the browser and navigates to "ASO_HOME" page
   Then User navigates to L2 from home page
    Then User should be able to see L2 Page
    Then User should be able to see L3 Page for grid sorting
    Then User should be able to sort by brand A to Z 
    Then User compare the product baised on A to Z 
   
   
     @Web @Regression @KER-710 @ZYP_HP_K710-2621 @C-HP @CR-RKA 
    Scenario: To verify user is able to sort on Product Listing/landing page
     Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L3 from home page for grid sorting
    Then User should be able to see L3 Page for grid sorting
    Then navigate to sort by and navigate to best selling 
    Then compare the price is in Low to high mode 
     Then navigate to sort by and navigate to best selling in high to low  
    Then compare the price is in high to low mode  
     Then User should be able to sort by brand A to Z 
    Then User compare the product baised on A to Z 
    
     @Web @Regression @KER-710 @ZYP_HP_K710-2622 @C-HP @CR-RKA
     Scenario: To verify user is able to filter on Sub category landing page(L2)
      Given user launches the browser and navigates to "ASO_HOME" page
      Then User should be able to see L2 Page of shoe 
      Then User Select the product from L2 
      Then User select the brand facet product from L2 
      Then User veriy brand facet 
      
       @Web @Regression @KER-710 @ZYP_HP_K710-2722 @C-HP @CR-RKA 
    Scenario: To verify user is able to sort & filter on Sub category landing page(L2)
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2 from home page
    Then User should be able to see L2 Page
    Then navigate to sort by and navigate to best selling 
    Then compare the price is in Low to high mode 
     Then navigate to sort by and navigate to best selling in high to low  
    Then compare the price is in high to low mode  
     Then User should be able to sort by brand A to Z 
    Then User compare the product baised on A to Z 
    
     @Web @Regression @KER-710 @ZYP_HP_K710-2723 @C-HP @CR-RKA 
    Scenario: To verify user is able to sort & filter on Product Listing/landing page(L3)	
    
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L3 from home page for grid sorting
    Then User should be able to see L3 Page for grid sorting
    Then navigate to sort by and navigate to best selling 
    Then compare the price is in Low to high mode 
     Then navigate to sort by and navigate to best selling in high to low  
    Then compare the price is in high to low mode  
     Then User should be able to sort by brand A to Z 
    Then User compare the product baised on A to Z 
       
       
   
     @Web @Regression @KER-710 @ZYP_HP_K710-5533 @C-HP @CR-RKA
    Scenario: To verify user is able to filter on Product Listing/landing page(L3) 
    
      Given user launches the browser and navigates to "ASO_HOME" page
      Then User navigates to L3 from home page for grid sorting
      Then User should be able to see L3 Page for grid sorting
       Then User should be able to sort by brand A to Z 
    Then User compare the product baised on A to Z
    
     @Web @Regression @KER-710 @ZYP_HP_K710-3657 @C-HP @CR-RKA
    Scenario: Verify the product in grid are sorted by"Brand (A-Z)L2
    
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see L2 Page of shoe 
    Then User Select the product from L2
    Then navigate to sort by and navigate to best selling in high to low  
    Then compare the price is in high to low mode 
     Then navigate to sort by and navigate to best selling 
    Then compare the price is in Low to high mode 
     Then User should be able to sort by brand A to Z 
    Then User compare the product baised on A to Z
     