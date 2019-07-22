Feature: Verify the user verifies that there should not be a character limit on search

  @C-SLR @Mobile @Regression  @All @KER-3268  @ZYP_SLR_K3268-6600 @Rerun @1HR
 Scenario Outline: Verify the user verifies that there should not be a character limit on search and check the title
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the boolean search "<data>"
    And User click on search icon
    Then user verifies the title of search results
    Then User closes the web application
    Examples:
    |data|
    |Shoes & Socks|

  @C-SLR @Mobile  @Regression @All @KER-3268  @ZYP_SLR_K3268-6599
 Scenario Outline: Verify the user verifies that there should not be a character limit on search and check the results
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the boolean search "<data>"
    And User click on search icon
    Then User closes the web application
  Examples:
    |data|
    |Shoes & Socks|