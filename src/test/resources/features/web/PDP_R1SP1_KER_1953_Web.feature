Feature: To verify basic functionalities of PDP

  @1HR @Regression  @C-PDP  @Web @All @ZYP_K1953-3945 @KER-1953 @Rerun
  Scenario: To verify product detail content section
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    When user clicks on the Details and specs tab
    Then user should be able to see long description with feature and benefits section
    And user should be able to expand and colapse reading section with read more and read less button
    When user clicks on Reviews tab
    Then user should be able to see the reviews heading and section
    When user clicks on QandA tab
    Then user clicks should be able to see QandA section

  @1HR  @Regression @C-PDP  @Web @All @ZYP_K1953-3950 @KER-1953 @Rerun
  Scenario: To verify sku and item value
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    And user should be able to see the sku and item numbers for the given image
    When user select any other size and color of the product varient
    Then user should be able to see the changed value of the sku and item
