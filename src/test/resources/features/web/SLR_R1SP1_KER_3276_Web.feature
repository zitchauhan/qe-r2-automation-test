Feature: Verify the Should display max 4 suggestion terms , Applicable category and brand and on LHS should display 6 product card

 @C-SLR @Web @All @Regression  @KER-3276  @ZYP_K3276-6593 @Rerun
  Scenario: Verify the title when Applicable category and brand and on LHS displays 6 product card
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    And User verifies the predictive suggestions for matching category
    Then user verifies the title of search results of 6 product card
    Then User closes the web application

 @C-SLR @Web @All  @Regression @KER-3276  @ZYP_K3276-4347 @Rerun
  Scenario: Verify the results when Applicable category and brand and on LHS displays 6 product card
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    And User verifies the predictive suggestions for applicable category
    Then user verifies the Applicable category and brand and on LHS displays 6 product card
    Then User closes the web application
