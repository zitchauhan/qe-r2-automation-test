Feature: [UI] To verify user is able to clear all the filters with a single click - Mobile

  @Mobile @All @C-HP @Regression @KER-563 @ZYP_HP_K563-5586 @CR-AG @1HR
  Scenario: [UI] To verify user is able to clear all the filters with a single click - Dektop
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    Then User clicks on the filter flyout
    And User expands PRICE Filter Option
    When User selects multiple PRICE filter Options
    Then User should be able to see the selected PRICE filter Options in selected state
    And User should be able to click on clear all button 
