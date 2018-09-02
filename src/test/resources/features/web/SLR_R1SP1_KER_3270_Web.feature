Feature: Verify the case behavior for redirect keyword. Search keywords - Shirt vs shirt

  @C-SLR @Web @All  @Regression @KER-3270  @ZYP_SLR_K3270-7419 @RBeta
  Scenario: Verify the user search for Customer Keyword like Shirt
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the search upper keyword "<data>"
    And User click on search icon
    Then User is navigated to pdp page and verifies search result visible
    Then User closes the web application

  @C-SLR @Web @All  @Regression @KER-3270  @ZYP_SLR_K3270-7420
  Scenario: verify the ability to create specific keywords that redirects to search result pages
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the specific search keyword "<data>"
    And User click on search icon
    Then navigated to pdp page
    Then User closes the web application

  @C-SLR @Web @All  @Regression @KER-3270  @ZYP_SLR_K3270-7421
  Scenario: verify the ability to configure replacement words for specific search terms as Search Instead For
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the instead of search keyword "<data>"
    And User click on search icon
    Then User verifes the last breadcrumb in the series of keyword
    Then User closes the web application

  
  @C-SLR @Web @All  @Regression @KER-3270  @ZYP_SLR_K3270-7422 @RBeta
  Scenario: verify the ability to configure replacement words for specific search terms as Also Search for
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the search term in search box "<data>"
    And User click on search icon
    Then User verifes the last breadcrumb keyword
    Then User closes the web application

  @C-SLR @Web @All  @Regression @KER-3270  @ZYP_SLR_K3270-7423
  Scenario: verify the ability to configure synonyms for specific search terms
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the synonyms search keyword "<data>"
    And User click on search icon
    Then User is navigated to pdp page and verifies search result like disc
    Then User closes the web application
