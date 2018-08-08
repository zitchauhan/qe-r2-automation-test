Feature: Verify that by default only Category is open and all other facets are collapsed.

  @1HR @Regression @C-PLP @Mobile @All @KER-2333  @ZYP_K2333-3948 @Rerun
  Scenario: Verify that by default only Category is open and all other facets are collapsed.
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    Then User scroll to facets
    Then User clicks on the filter flyout
    #And User expands CATEGORY Filter Option
    And User verify default Category facet expand and all other facets are collapsed
    Then User closes the web application
