Feature: Verify the user should be able to view a search results page when the user search returns relevant results

  @C-SLR @Mobile @Regression @All @KER-3237  @ZYP_K3237-5145 @Rerun @1HR
  Scenario: Verify the user verifies if search predictive suggestions should link and navigate to  CLP
    Given user launches the browser and navigates to "ASO_HOME" page
    #  Then User should be able to view Search Lens
    Then User should be able to see Search Box on Homepage
    And User verifies the predictive suggestions for matching category
    Then User click on the matching keyword
    Then User closes the web application

  @C-SLR @Mobile @Regression  @All @KER-3237  @ZYP_K3237-5113 @Rerun
  Scenario: Verify the user can clear all the search
    Given user launches the browser and navigates to "ASO_HOME" page
    # Then User should be able to view Search Lens
    Then User should be able to see Search Box on Homepage
    Then User enter the search data which has pagination
    Then User should be able to view Search Lens
    Then User click on clear all button
    Then User closes the web application

  @C-SLR @Mobile @Regression  @All @KER-3237  @ZYP_K3237-4381 @1HR
  Scenario: Verify the user enters two characters into the search box and see predictive suggestions for matching keyword
    Given user launches the browser and navigates to "ASO_HOME" page
    # Then User should be able to view Search Lens
    Then User should be able to see Search Box on Homepage
    Then User verifies the predictive suggestions for matching keyword
    Then User closes the web application

  @C-SLR @Mobile  @Regression @All @KER-3237  @ZYP_K3237-5184
  Scenario: Verify the user enters two characters into the search box and see predictive suggestions for matching categories
    Given user launches the browser and navigates to "ASO_HOME" page
    #Then User should be able to view Search Lens
    Then User should be able to see Search Box on Homepage
    And User verifies the predictive suggestions for matching category
    Then User closes the web application

  @C-SLR @Mobile  @Regression @All @KER-3237  @ZYP_K3237-5183
  Scenario: Verify the user enters two characters into the search box and see predictive suggestions for matching brand
    Given user launches the browser and navigates to "ASO_HOME" page
    #    Then User should be able to view Search Lens
    Then User should be able to see Search Box on Homepage
    And User verifies the predictive suggestions for matching brand
    Then User closes the web application

  @C-SLR @Mobile @Regression  @All @KER-3237  @ZYP_K3237-5109 @Rerun
  Scenario: Verify the user should not see duplicates within the predictive suggestions.
    Given user launches the browser and navigates to "ASO_HOME" page
    #   Then User should be able to view Search Lens
    Then User should be able to see Search Box on Homepage
    Then User should not see duplicates within predictive suggestions
    Then User closes the web application
