Feature: To verify Product Questions and Answers

@Regression  @C-PDP  @Web @ZYP_PDP_K1937-3459 @KER-1937 @All @CR-RKA @1HR
  Scenario: To verify Product question and answer in PDP of Desktop
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    And user is able to see three tabs in the detail content section
    When user clicks on QandA tab
    Then user clicks should be able to see QandA section
    Then verfiy the Ask a question button 
    