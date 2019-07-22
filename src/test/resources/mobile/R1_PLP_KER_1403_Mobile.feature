Feature: Verify that by default only Category is open and all other facets are collapsed.

  @Regression @Mobile @All @C-PLP  @KER-1403  @ZYP_PLP_K1403-4212 @CR-AG @1HR @RBeta
  Scenario: Verify that by default only Category is open and all other facets are collapsed.
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    Then User scroll to facets
    Then User clicks on the filter flyout
    And User verify default Category facet expand and all other facets are collapsed
    Then User closes the web application
