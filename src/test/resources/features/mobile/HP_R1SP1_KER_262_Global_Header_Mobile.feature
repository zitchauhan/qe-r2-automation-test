Feature: Verify presence of Global Element Header

  @Sanity @Mobile @HomePage  @KER-262 @ZYP-7283  @All  @Regression
  Scenario: Verify presence of Global Element Header
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User will verify the presence of ASO Logo
    Then User will verify the presence of search
    Then User clicks on the burger menu
#  Then User will verify the presence of add to cart icon