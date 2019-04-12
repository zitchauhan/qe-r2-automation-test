Feature: To verify Detailed Product Content - Q&A Tab

@Regression  @C-PDP  @Web @ZYP_PDP_K1952-4897 @KER-1952 @All @CR-AKK
  Scenario: To verify Q&A - Answer a Question in PDP page
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    And user is able to see three tabs in the detail content section
    When user clicks on QandA tab
    Then user clicks should be able to see QandA section
    Then verfiy the Ask a question button
    
