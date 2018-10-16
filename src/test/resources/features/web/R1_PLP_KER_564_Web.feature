Feature: Faceted Navigation - Refresh products whenever the filters values changed


 @Web @Regression @KER-564  @ZYP_PLP_K564-2874 @C-PLP @CR-RKA
Scenario: Verify Faceted Navigation - Refresh products whenever the filters values changed for Desktop
    Given user launches the browser and navigates to "ASO_HOME" page    
    Then User navigates to L3 from home page for grid sorting
    Then User should be able to see L3 Page for grid sorting
    Then User select the brand facet product from L3 
    Then User veriy brand facet 
    Then User Verify color facet   
    Then User Verify Pagination of page  
  