Feature: Verify that by default only Category is open and all other facets are collapsed.

  @Sanity @Regression @Web @All @PLP  @KER-2333 @ZYP-4106
  Scenario: Verify that by default only Category is open and all other facets are collapsed.
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    Then User scroll to facets
    And User verify default Category facet expand and all other facets are collapsed
    Then User closes the web application
