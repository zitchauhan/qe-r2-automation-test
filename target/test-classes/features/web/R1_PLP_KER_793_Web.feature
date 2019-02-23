Feature: To verify Filtering functionality of CLP


  @Regression @Web @All @KER-793 @ZYP_PLP_K793-1982 @C-PLP @CR-AG
  Scenario: To verify Filtering functionality of CLP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    And User expands PRICE Filter Option
    When User selects multiple PRICE filter Options
    Then User should be able to see the selected PRICE filter Options in selected state
    When User deselects multiple PRICE filter Options
    Then User should be able to see the deselected PRICE filter Options in deselected state



  