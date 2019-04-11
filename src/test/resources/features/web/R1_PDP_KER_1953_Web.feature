Feature: To verify basic functionalities of PDP

  @1HR @Regression  @C-PDP  @Web @All @ZYP_PDP_K1953-3945 @KER-1953 @Rerun @CR-AG
  Scenario: To verify product detail content section
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    When user clicks on the Details and specs tab
    Then user should be able to see long description with feature and benefits section
    When user clicks on Reviews tab
    Then user should be able to see the reviews heading and section
    When user clicks on QandA tab
    Then user clicks should be able to see QandA section

   @Regression @C-PDP  @Web @All @ZYP_PDP_K1953-3950 @KER-1953 @Rerun @CR-AG
  Scenario: To verify sku and item value
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    
   

  @Regression  @C-PDP @Mobile @All  @ZYP_PDP_K1953-4137 @KER-1953 @CR-AG
  Scenario: To verify sku and item value
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
     And user is able to see three tabs in the detail content section 