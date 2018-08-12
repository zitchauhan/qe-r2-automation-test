Feature: To Verify the functionality of "Weekly Ad Link" in the Global Header.

  @Web @All @C-HP @Regression @KER-729 @ZYP_HP_K729-2815
  Scenario: Verify presence of weekly ad link in the header on Home page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Weekly Ad link
    Then User closes the web application

  @Web @All  @C-HP @Regression @KER-729 @ZYP_HP_K729-2816
  Scenario: Verify presence of weekly ad link in the header on PLP page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User should be able to see Weekly Ad link
    Then User closes the web application

  @Web @All @C-HP  @Regression @KER-729 @ZYP_HP_K729-5621
  Scenario: Verify presence of weekly ad link in the header on L1 page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L1
    And User should be able to see Weekly Ad link
    Then User closes the web application

  @Web @All @C-HP  @Regression @KER-729 @ZYP_HP_K729-5622
  Scenario: Verify presence of weekly ad link in the header on CLP page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    And User should be able to see Weekly Ad link
    Then User closes the web application

  @Web @All @C-HP  @Regression @KER-729 @ZYP_HP_K729-5625
  Scenario: Verify presence of weekly ad link in the header on PDP page
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    And User should be able to see Weekly Ad link
    Then User closes the web application

  @Web @All @C-HP @Sanity @Regression @KER-729 @ZYP_HP_K729-5630 @1HR
  Scenario Outline: Verify presence of weekly ad link in the header on PLP page by search Mobile
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "<SearchTerm>" in the search box
    And User should be able to see Weekly Ad link
    Then User closes the web application

    Examples: 
      | SearchTerm |
      | Nike Shoe |
