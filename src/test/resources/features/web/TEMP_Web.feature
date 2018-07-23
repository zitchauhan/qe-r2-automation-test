Feature: To Verify the functionality of "Weekly Ad Link" in the Global Header.

  

  @Web @All  @Homepage @Regression @KER-729 @ZYP-2816
  Scenario: Verify presence of weekly ad link in the header on PLP page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User should be able to see Weekly Ad link
    Then User closes the web application

  @Web @All @Homepage  @Regression @KER-729 @ZYP-5621
  Scenario: Verify presence of weekly ad link in the header on L1 page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L1
    And User should be able to see Weekly Ad link
    Then User closes the web application

  @Web @All @Homepage  @Regression @KER-729 @ZYP-5622
  Scenario: Verify presence of weekly ad link in the header on CLP page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    And User should be able to see Weekly Ad link
    Then User closes the web application

 