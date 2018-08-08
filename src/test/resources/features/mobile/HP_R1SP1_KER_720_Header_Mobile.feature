Feature: Verify presence of Global Element Header

  @1HR @KER-720  @C-HP  @Regression  @ZYP_K720-4344 @All @Mobile
  Scenario: Verify presence of Global Element Header from Homepage
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User will verify the presence of ASO Logo
    And User will verify the presence of search
    Then User clicks on the burger menu



 @KER-720  @C-HP  @ZYP_K720-5477 @Regression @All @Mobile
  Scenario: Verify presence of Global Element Header from PLP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    Then User will verify the presence of ASO Logo
    And User will verify the presence of search
    Then User clicks on the burger menu
    
    
     @KER-720 @C-HP   @ZYP_K720-5478 @Regression @All @Mobile
  Scenario: Verify presence of Global Element Header from PDP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    Then User click on the product image
    And User will verify the presence of ASO Logo
    Then User will verify the presence of search
    Then User clicks on the burger menu