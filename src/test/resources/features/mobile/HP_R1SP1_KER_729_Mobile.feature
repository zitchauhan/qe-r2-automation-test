Feature: To Verify the functionality of "Weekly Ad Link" in the Global Header.

  @Mobile @All @Regression @C-HP @KER-729  @ZYP_HP_K729-1970
  Scenario: Verify presence of weekly ad link in the header on Home page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User should be able to see Weekly Ad link
    Then User closes the web application

  @Mobile @All @Regression  @C-HP @KER-729  @ZYP_HP_K729-2814
  Scenario: Verify presence of weekly ad link in the header on PLP page
    Given user launches the browser and navigates to "ASO_HOME" page
     Then User navigates till PLP
    Then User clicks on the burger menu
    And User should be able to see Weekly Ad link
    Then User closes the web application

  @Mobile @All @1HR  @Regression @C-HP  @KER-729  @ZYP_HP_K729-5626
  Scenario Outline: Verify presence of weekly ad link in the header on PLP page by search Mobile
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "<SearchTerm>" in the search box
    Then User clicks on the burger menu
    And User should be able to see Weekly Ad link
    Then User closes the web application

    Examples: 
      | SearchTerm |
      | Nike Shoe |

  @Mobile @All @Regression @C-HP  @KER-729  @ZYP_HP_K729-5627
  Scenario: Verify presence of weekly ad link in the header on L1 page Mobile
    Given user launches the browser and navigates to "ASO_HOME" page
   Then User clicks on the burger menu
    Then User navigates to L1
    Then User clicks on the burger menu
    And User should be able to see Weekly Ad link
    Then User closes the web application

  @Mobile @All @Regression @C-HP  @KER-729  @ZYP_HP_K729-5628
  Scenario: Verify presence of weekly ad link in the header on CLP page Mobile
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    Then User clicks on the burger menu
    And User should be able to see Weekly Ad link
    Then User closes the web application

  @Mobile @All @Regression  @C-HP @KER-729  @ZYP_HP_K729-5629
  Scenario: Verify presence of weekly ad link in the header on PDP page Mobile
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    Then User clicks on the burger menu
    And User should be able to see Weekly Ad link
    Then User closes the web application
