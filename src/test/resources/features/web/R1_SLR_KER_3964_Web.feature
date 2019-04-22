Feature: Verify the user should be able to view a search results page when the user search returns relevant results

  @C-SLR @Web  @Regression @KER-3964  @ZYP_SLR_K3964-4957 @All @Rerun
  Scenario: Verify the user should be able to click on a search result and navigate to PDP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the search data
    And User click on search icon
    Then User is navigated to pdp page
    Then User closes the web application

  @C-SLR @Web  @Regression @KER-3964  @ZYP_SLR_K3964-4966 @All @Rerun
  Scenario: Verify the user should be able to click on a search result and navigate to CLP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the data
    And User click on search icon
    #Then User is navigated to clp page
    Then User is navigated to pdp page
    Then User closes the web application

  @C-SLR @Web  @Regression @KER-3964  @ZYP_SLR_K3964-4961 @All
  Scenario: Verify the user should be shown a Null results page when the search term returns no matching relevant results
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the null data
    And User click on search icon

  @C-SLR @Web  @Regression @KER-3964  @ZYP_SLR_K3964-4964 @All
  Scenario: Verify the user should search by color
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the color
    And User click on search icon
    Then User verify the product name
    Then User closes the web application

  @C-SLR @Web @Regression  @KER-3964  @ZYP_SLR_K3964-4968 @All @1HR
  Scenario: Verify the user should be able to paginate my search results
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the search data which has pagination
    Then User closes the web application
