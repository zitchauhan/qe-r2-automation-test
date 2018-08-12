Feature: Verify the Auto Correct in search and search suggestions

  @C-SLR @Mobile @Regression  @All @KER-3274  @ZYP_SLR_K3274-6336 @Rerun @1HR @CR-AG
  Scenario Outline: Verify the user verifies the title for the closest matching term
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the search "<data>"
    And User click on search icon
    Then User verifies the title for closest matching term
    Then User closes the web application
    Examples:
    |data|
    |Goolf|

  @C-SLR @Mobile @Regression @All @KER-3274  @ZYP_SLR_K3274-6337 @Rerun @CR-AG
  Scenario Outline: Verify the user verifies the label for the closest matching term
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the search "<data>"
    And User click on search icon
    Then User verifies the label for closest matching term
    Then User closes the web application
    Examples:
    |data|
    |Goolf|
 
  @C-SLR @Mobile  @Regression @All @KER-3274  @ZYP_SLR_K3274-6340 @Rerun @1HR @CR-AG
Scenario Outline: Verify the user verifies the respective search results are displayed for the closest matching term
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the search "<data>"
    And User click on search icon
    Then User verifies the respective search results
    Then User closes the web application
     Examples:
    |data|
    |Goolf|

  @C-SLR @Mobile  @Regression @All @KER-3274  @ZYP_SLR_K3274-6341 @Rerun @CR-AG
Scenario Outline: Verify the user verifies the respective search results are clickable for the closest matching term
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the search "<data>"
    And User click on search icon
    Then User verifies the respective search results clickable
    Then User closes the web application
 Examples:
    |data|
    |Goolf|