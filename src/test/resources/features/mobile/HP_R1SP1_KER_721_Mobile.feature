Feature: To verify "Global Differences" in Mobile view

  @Mobile @All @C-HP  @1HR @Regression @KER-721  @ZYP_K721-1979
  Scenario: Verify presence of header content on Home page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User should be able to see FindStore Navigation Categories and MyAccount links
    Then User closes the web application

  @Mobile @All  @C-HP @1HR @Regression @KER-721  @ZYP_K721-2806
  Scenario: Verify user is able to see the search box after clicking on the magnifying glass in PLP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    Then Verify user is able to see the search box after clicking on the magnifying glass
    Then User closes the web application

  @Mobile @All @C-HP  @Regression @KER-721  @ZYP_K721-2845
  Scenario: Validate Search box is not exposed in L1 mobile
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see open Search text box
    Then User clicks on the burger menu
    Then User navigates to L1
    Then Verify user is able to see the search box after clicking on the magnifying glass

  @Mobile @All @C-HP  @Regression @KER-721  @ZYP_K721-5607 @Rerun
  Scenario: Verify presence of header content on L1 page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L1
    Then User clicks on the burger menu
    Then User should be able to see FindStore Navigation Categories and MyAccount links
    Then User closes the web application

  @Mobile @All @C-HP  @Regression @KER-721  @ZYP_K721-5608
  Scenario: Verify presence of header content on CLP page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    Then User clicks on the burger menu
    Then User should be able to see FindStore Navigation Categories and MyAccount links
    Then User closes the web application

  @Mobile @All @C-HP  @Regression @KER-721  @ZYP_K721-5609
  Scenario: Verify presence of header content on PLP page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    Then User clicks on the burger menu
    Then User should be able to see FindStore Navigation Categories and MyAccount links
    Then User closes the web application

  @Mobile @All  @C-HP @Regression @KER-721  @ZYP_K721-5610
  Scenario: Verify presence of header content on PDP page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    Then User clicks on the burger menu
    Then User should be able to see FindStore Navigation Categories and MyAccount links
    Then User closes the web application

  @Mobile @All  @C-HP @Regression @KER-721  @ZYP_K721-5611
  Scenario: Validate Search box is not exposed in L2 mobile
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see open Search text box
    Then User clicks on the burger menu
    Then User navigates to L2
    Then Verify user is able to see the search box after clicking on the magnifying glass

  @Mobile @All @C-HP  @Regression @KER-721  @ZYP_K721-5612
  Scenario: Validate Search box is not exposed in L3 mobile
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see open Search text box
    Then User clicks on the burger menu
    Then User navigates to L3
    Then Verify user is able to see the search box after clicking on the magnifying glass

  
  @Mobile @All @C-HP  @Regression @KER-721  @ZYP_K721-5613
  Scenario: Validate Search box is not exposed in PDP mobile
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see open Search text box
    Then User clicks on the burger menu
    Then User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    Then Verify user is able to see the search box after clicking on the magnifying glass
