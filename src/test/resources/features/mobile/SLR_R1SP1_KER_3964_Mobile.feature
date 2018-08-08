Feature: Verify the user should be able to view a search results page when the user search returns relevant results

  @C-SLR @Mobile  @Regression @KER-3964 @All  @ZYP_K3964-4960
  Scenario: Verify the user should be able to click on a search result and navigate to PDP
    Given user launches the browser and navigates to "ASO_HOME" page
    #  Then User should be able to see Search Lens
    Then User should be able to see Search Box on Homepage
    Then User enter the search data
    And User click on search icon
    Then User is navigated to pdp page
    Then User closes the web application

  @C-SLR @Mobile @Regression  @KER-3964  @ZYP_K3964-4967 @All
  Scenario: Verify the user should be able to click on a search result and navigate to CLP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the data
    And User click on search icon
    Then User is navigated to clp page
    Then User closes the web application

  @C-SLR @Mobile  @Regression @KER-3964  @ZYP_K3964-4962 @All
  Scenario: Verify the user should be shown a Null results page when the search term returns no matching relevant results
    Given user launches the browser and navigates to "ASO_HOME" page
    #   Then User should be able to see Search Lens
    Then User should be able to see Search Box on Homepage
    Then User enter the null data
    And User click on search icon
    Then User is navigated to null page
    Then User closes the web application

  @C-SLR @Mobile  @Regression @KER-3964  @ZYP_K3964-4965 @All
  Scenario: Verify the user should search by color
    Given user launches the browser and navigates to "ASO_HOME" page
    #  Then User should be able to see Search Lens
    Then User should be able to see Search Box on Homepage
    Then User enter the color
    And User click on search icon
    Then User verify the product name
    Then User closes the web application

  @C-SLR @Mobile  @Regression @KER-3964  @ZYP_K3964-4988 @All @Rerun
  Scenario: Verify the user should be able to paginate my search results
    Given user launches the browser and navigates to "ASO_HOME" page
    #    Then User should be able to see Search Lens
    Then User should be able to see Search Box on Homepage
    Then User enter the search data which has pagination
    Then User closes the web application
