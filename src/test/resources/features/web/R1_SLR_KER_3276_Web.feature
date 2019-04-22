Feature: Verify the Should display max 4 suggestion terms , Applicable category and brand and on LHS should display 6 product card

 @C-SLR @Web @All @Regression  @KER-3276  @ZYP_SLR_K3276-6593 @Rerun
  Scenario: Verify the title when Applicable category and brand and on LHS displays 6 product card
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    And User verifies the predictive suggestions for matching category
    Then user verifies the title of search results of 6 product card
    Then User closes the web application

 @C-SLR @Web @All  @Regression @KER-3276  @ZYP_SLR_K3276-4347 @Rerun @1HR
  Scenario: Verify the results when Applicable category and brand and on LHS displays 6 product card
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    And User verifies the predictive suggestions for applicable category
    Then user verifies the Applicable category and brand and on LHS displays 6 product card
    Then User closes the web application

    
    @C-SLR @Web @All  @Regression @KER-3276  @ZYP_SLR_K3276-4348 @CR-RKA
    Scenario: To verify that search is updated as user inputs additional characters
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
   	Then user enter "go" in search box and wait for auto suggest pop up for first data 
   	Then user verify the product image name and price  
   	Then user enter "shi" in search box and wait for auto suggest pop up for second data
   
    
   
    @C-SLR @Web @All  @Regression @KER-3276  @ZYP_SLR_K3276-4349 @CR-RKA
    Scenario:  To verify the user is navigated to respective PDP on click on a product card from the flyout
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then user enter "golf" in search box and wait for auto suggest pop up for third data 
   Then user verify the product image name and price 
    Then user click on first image from autosuggestion flyout on home page 
    
    
    @C-SLR @Web @All  @Regression @KER-3276  @ZYP_SLR_K3276-4350 @CR-RKA
    Scenario: To verify the visual search suggestions that show up in flyout should appear on the SERP as well in the same order once search is executed
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then user enter "golf" in search box and wait for auto suggest pop up for third data 
     Then user verify the product image name and price 
    Then user click on Go button and verify relevent search item present in product catagory 
    
    
    
    
    
    
    
    
    
    
    
    
    
    