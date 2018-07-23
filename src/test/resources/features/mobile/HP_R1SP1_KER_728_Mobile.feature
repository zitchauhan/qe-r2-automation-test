Feature: To Verify the functionality of "ASO - Logo" in the Global Header

  @Mobile @All @Sanity  @HomePage  @Regression @KER-728 @ZYP-2811 @Rerun
  Scenario: As a user I want to navigate to Home page from PDP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page
    Then User closes the web application

  @Mobile @All @Sanity @Regression  @HomePage @KER-728 @ZYP-5618
  Scenario: As a user I want to navigate to Home page from PLP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page
    Then User closes the web application

  @Mobile @All  @Sanity  @Regression  @HomePage @KER-728 @ZYP-5619
  Scenario: As a user I want to navigate to Home page from CLP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page
    Then User closes the web application

  @Mobile @All   @Sanity @Regression  @HomePage @KER-728 @ZYP-5620
  Scenario: As a user I want to navigate to Home page from L1
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L1
    Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page
    Then User closes the web application

  @Mobile @All @Sanity @Regression  @HomePage @KER-728 @ZYP-2850
  Scenario: As a user I want to navigate to Home page from Everypage
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User is able to see the ASO_Logo
    Then User clicks on the burger menu
    Then User navigates to L1
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page
    Then User clicks on the burger menu
    Then User navigates to L2
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page
    Then User clicks on the burger menu
    Then User navigates to L3
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page
    Then User clicks on the burger menu
    Then User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page
