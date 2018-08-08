Feature: Verify presence of Global Element Header

  @Web @All  @C-HP   @Regression @KER-720 @ZYP_K720-4337 @1HR
  Scenario: Verify presence of Global Element Header from Homepage
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User will verify the presence of Sign In
    And User will verify the presence of WeeklyAD
    Then User will verify the presence of Find a Store
    And User will verify the presence of search
    Then User will verify the presence of add to cart icon
    And User will verify the presence of shop category
    Then User will verify the presence of trending category
    And User will verify the presence of deals category

    
    @Web @All  @C-HP  @Regression  @KER-720 @ZYP_K720-5475
  Scenario: Verify presence of Global Element Header from PLP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    Then User will verify the presence of Sign In
    And User will verify the presence of WeeklyAD
    Then User will verify the presence of Find a Store
    And User will verify the presence of search
    Then User will verify the presence of add to cart icon
    And User will verify the presence of shop category
    Then User will verify the presence of trending category
    And User will verify the presence of deals category
    
    
    @Web @All  @C-HP  @Regression  @KER-720 @ZYP_K720-5476
  Scenario: Verify presence of Global Element Header from PDP
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    # Then User click on the product image
    And User will verify the presence of Sign In
    Then User will verify the presence of WeeklyAD
    And User will verify the presence of Find a Store
    Then User will verify the presence of search
    And User will verify the presence of add to cart icon
    Then User will verify the presence of shop category
    And User will verify the presence of trending category
    Then User will verify the presence of deals category