Feature: [Mobile]  Product Card

  @C-PLP @Mobile @Regression @KER-224 @ZYP_PLP_K224-4920 @CR-RKA
  Scenario: User should be able to view the product image  on PLP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user verify image of product available

  @C-PLP @Mobile @Regression @KER-224 @ZYP_PLP_K224-9422 @CR-RKA @1HR
  Scenario: User  be able to view the colour option on product PLP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user verify colour option in image of product

  @C-PLP @Mobile @Regression @KER-224 @ZYP_PLP_K224-9423 @CR-RKA
  Scenario: User  be able to view the product price  on L2
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    Then user verify product price

  @C-PLP @Mobile @Regression @KER-224 @ZYP_PLP_K224-9425 @CR-RKA
  Scenario: User  be able to view the product name  on PLP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user verify product name
    Then user verify image of product available

  @C-PLP @Mobile @Regression @KER-224 @ZYP_PLP_K224-9427 @CR-RKA @1HR
  Scenario: User  be able to view the product rating  on PLP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user verify product rating

  @C-PLP @Mobile @Regression @KER-224 @ZYP_PLP_K224-5569 @CR-RKA
  Scenario: User  be able to navigate to PDP by clicking on image of product
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user to click on product image and navigate to PDP

  @C-PLP @Mobile @Regression @KER-224 @ZYP_PLP_K224-9429 @CR-RKA
  Scenario: User be able to navigate to PDP by clicking on Name of product
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user to click on product name and navigate to PDP

  @C-PLP @Mobile @Regression @KER-224 @ZYP_PLP_K224-9430
  Scenario: Verify the Product Ad badge component on L2 page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    Then User should be able to see L2 Page
    Then user to navigate to verify Ad feature

  @C-PLP @Mobile @Regression @KER-224 @ZYP_PLP_K224-9431
  Scenario: Product Cards for Gift Cards should display the following on the Gift Card PLP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user to navigate to giftcart

  @C-PLP @Mobile @Regression @KER-224 @ZYP_PLP_K224-4234 @CR-RKA
  Scenario: User should be able to see Product Card details in PLP Page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user verify product name
    Then user verify image of product available

  @C-PLP @Mobile @Regression @KER-224 @ZYP_PLP_K224-5569 @CR-RKA
  Scenario: User should be navigated to PDP Page when clicked on Product Image
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user to click on product image and navigate to PDP
