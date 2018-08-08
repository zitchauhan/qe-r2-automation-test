Feature: Verify the user verifies that there should not be a character limit on search

  @C-SLR @Web @All  @Regression @KER-3268  @ZYP_K3268-6598 @Rerun
  Scenario: Verify that there should not be a character limit on search and check the title
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the boolean search "<data>"
    And User click on search icon
    Then user verifies the title of search results
    Then User closes the web application

  @C-SLR @Web @All  @Regression @KER-3268  @ZYP_K3268-4364
  Scenario: Verify that there should not be a character limit on search and check the results
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the boolean search "<data>"
    And User click on search icon
    Then User closes the web application
