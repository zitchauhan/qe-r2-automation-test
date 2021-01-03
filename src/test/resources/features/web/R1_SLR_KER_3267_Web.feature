Feature: Verify the user search for Customer Keyword/SKU Search

  @C-SLR @Web @All  @Regression @KER-3267  @ZYP_SLR_K3267-6329 @DevORIG @1HR @TC-OMNI-12553
  Scenario Outline: Verify the user search for Customer Keyword/SKU Search
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the SKU search "<data>"
    And User click on search icon
    And user should be able to see PDP mention in the current url
    And user verifies the entered SKU id
    Then User closes the web application
    Examples:
    |data|
    |109273651|
    |nike mens compression|

  @C-SLR @Web @All @Regression  @KER-3267  @ZYP_SLR_K3267-6333 @Rerun @1HR @CR-AG
  Scenario Outline:Verify the user search for invalid Customer Keyword/SKU Search
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the invalid SKU search "<data>"
    And User click on search icon
    Then user verifies the error null search result page
    Then User closes the web application
   Examples:
    |data|
    |1111111111|