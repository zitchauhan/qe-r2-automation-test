Feature: To Verify the functionality of "ASO - Logo" in the Global Header

  @Web @All  @C-HP  @Regression @KER-728 @ZYP_HP_K728-1971 @1HR
  Scenario: As a user I want to navigate to Home page from PLP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User is able to see the ASO_Logo
    Then User navigates till PLP
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page
    Then User closes the web application

  @Web @All     @C-HP @Regression @KER-728 @ZYP_HP_K728-5615 @1HR
  Scenario: As a user I want to navigate to Home page from PDP
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page
    Then User closes the web application

  @Web @All   @C-HP @Regression @KER-728 @ZYP_HP_K728-5616 @1HR
  Scenario: As a user I want to navigate to Home page from CLP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page
    Then User closes the web application

  @Web @All @C-HP @Regression @KER-728 @ZYP_HP_K728-5617 @1HR
  Scenario: As a user I want to navigate to Home page from L1
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L1
    Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page
    Then User closes the web application
