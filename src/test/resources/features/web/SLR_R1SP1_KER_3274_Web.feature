Feature: Verify the Auto Correct in search and search suggestions

  @SLR @Web @All  @Regression @KER-3274 @ZYP-6334 @Rerun
  Scenario: Verify the user verifies the title for the closest matching term
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the search "<data>"
    And User click on search icon
    Then User verifies the title for closest matching term
    Then User closes the web application

  @SLR @Web @All  @Regression @KER-3274 @ZYP-6338 @Rerun
  Scenario: Verify the user verifies the label for the closest matching term
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the search "<data>"
    And User click on search icon
    Then User verifies the label for closest matching term
    Then User closes the web application

  @SLR @Web @All  @Regression @KER-3274 @ZYP-6339 @Rerun
  Scenario: Verify the user verifies the respective search results are displayed for the closest matching term
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the search "<data>"
    And User click on search icon
    Then User verifies the respective search results
    Then User closes the web application

  @SLR @Web @All  @Regression @KER-3274 @ZYP-6342 @Rerun
  Scenario: Verify the user verifies the respective search results are clickable for the closest matching term
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the search "<data>"
    And User click on search icon
    Then User verifies the respective search results clickable
    Then User closes the web application
