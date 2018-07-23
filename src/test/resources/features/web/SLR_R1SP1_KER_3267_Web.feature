Feature: Verify the user search for Customer Keyword/SKU Search

  @SLR @Web @All  @Regression @KER-3267 @ZYP-6329 @Rerun
  Scenario: Verify the user search for Customer Keyword/SKU Search
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the SKU search "<data>"
    And User click on search icon
    Then User is navigated to pdp page
    And user verifies the entered SKU id
    Then User closes the web application

  @SLR @Web @All @Regression  @KER-3267 @ZYP-6333 @Rerun
  Scenario: Verify the user search for invalid Customer Keyword/SKU Search
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the invalid SKU search "<data>"
    And User click on search icon
    Then user verifies the error null search result page
    Then User closes the web application
