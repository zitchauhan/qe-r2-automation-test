Feature: [UI] To verify user is able to clear all the filters with a single click - Dektop

  @Web @All @C-HP @Regression @KER-563 @ZYP_HP_K563-2876 @CR-AG
  Scenario: [UI] To verify user is able to clear all the filters with a single click - Dektop
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User expands PRICE Filter Option
    When User selects multiple PRICE filter Options
    Then User should be able to see the selected PRICE filter Options in selected state
    And User should be able to click on clear all button 