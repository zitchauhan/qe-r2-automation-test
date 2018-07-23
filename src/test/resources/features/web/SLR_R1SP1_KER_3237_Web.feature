Feature: Verify the user see search suggestions based on the data entered in the search box

  @SLR @Web @All  @Regression @KER-3237 @ZYP-4384 @Rerun
  Scenario: Verify the user verifies if search predictive suggestions should link and navigate to  CLP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    And User verifies the predictive suggestions for matching category
    Then User click on the matching keyword
    Then User closes the web application

  @SLR @Web @All  @Regression @KER-3237 @ZYP-4380
  Scenario: Verify the user enters two characters into the search box and see predictive suggestions for matching keyword
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User verifies the predictive suggestions for matching keyword
    Then User closes the web application

  @SLR @Web @All  @Regression @KER-3237 @ZYP-5179
  Scenario: Verify the user enters two characters into the search box and see predictive suggestions for matching categories
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    And User verifies the predictive suggestions for matching category
    Then User closes the web application

  @SLR @Web @All  @Regression @KER-3237 @ZYP-5180
  Scenario: Verify the user enters two characters into the search box and see predictive suggestions for matching brand
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    And User verifies the predictive suggestions for matching brand
    Then User closes the web application

  @SLR @Web @All  @Regression @KER-3237 @ZYP-4382 @Rerun		
  Scenario: Verify the user should not see duplicates within the predictive suggestions.
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User should not see duplicates within predictive suggestions
    Then User closes the web application

  @SLR @Web @All  @Regression @KER-3237 @ZYP-4379
  Scenario: Verify the user can clear all the search
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to view Search Box on Homepage
    Then User enter the color for search
    And User click on the search icon
    Then User click on clear all button
    Then User closes the web application
