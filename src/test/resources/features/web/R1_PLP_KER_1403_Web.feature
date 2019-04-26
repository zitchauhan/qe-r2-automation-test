Feature: Verify that by default only Category is open and all other facets are collapsed.

  @Regression @Web @All @C-PLP  @KER-1403  @ZYP_PLP_K1403-3351 @CR-AG
  Scenario: Verify that by default only Category is open and all other facets are collapsed.
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    Then User scroll to facets
    Then User closes the web application
