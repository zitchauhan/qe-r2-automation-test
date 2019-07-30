Feature: To verify basic functionalities of PDP

 @Regression @1HR @C-PDP @Mobile  @ZYP_PDP_K1926-4359 @KER-1926 @All @Rerun
  Scenario: To verify URL, Image, Attributes ,Add to cart button section by navigation Desktop
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    #And user should be able to see Add to cart button and quantity section
    And user should be able to see ship it button and quantity section
    Then user should be able to see inventory status of the product

  @Regression  @C-PDP @Mobile @KER-1926  @ZYP_PDP_K1926-5558 @All @Rerun @1HR @RBeta
  Scenario: To verify URL, Image, Attributes, Add to cart button section mobile by search
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "SearchPDP" in the searchbox
    And user should be able to see PDP mention in the current url
    Then user should be able to see Image of the product
    And user should be able to see the search term in the product title
    Then user should see different attribute and size of the product
    #And user should be able to see Add to cart button and quantity section
    And user should be able to see ship it button and quantity section
    Then user should be able to see inventory status of the product

 @Regression  @C-PDP @Mobile  @ZYP_PDP_K1926-4358 @KER-1926 @All @Rerun
  Scenario: To verify product detail content section "Details and specs" tab
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    And user is able to see three tabs in the detail content section
    When user clicks on the Details and specs tab
    And user should be able to see long description with feature and benefits section

 @Regression @C-PDP  @Mobile @KER-1926  @ZYP_PDP_K1926-5567 @All @Rerun
  Scenario: To verify product detail content section "Reviews" tab
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    When user clicks on Reviews tab
    Then user should be able to see the reviews heading and section
    And user clicks on QandA tab
    Then user clicks should be able to see the closed reviews tab

   @Regression @C-PDP  @Mobile  @KER-1926  @ZYP_PDP_K1926-5568 @All @Rerun
  Scenario: To verify product detail content section "QandA" tab
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    When user clicks on QandA tab
    Then user clicks should be able to see QandA section
    And user clicks on Reviews tab
    Then user clicks should be able to see the closed QandA tab

    @All  @C-PDP @Regression @Mobile  @KER-1926  @ZYP_PDP_K1926-5570 @Rerun
    Scenario: To verify sku and item value by search
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "SearchPDP" in the searchbox
    And user should be able to see the sku and item numbers for the given image


  @Regression   @C-PDP @Mobile   @ZYP_PDP_K1926-4299 @KER-1926 @All @Rerun
  Scenario: To verify sku and item value by navigation
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
   And user should be able to see the sku and item numbers for the given image

  @Regression @C-PDP  @Mobile  @ZYP_PDP_K1926-5580 @KER-1926 @All @Rerun
  Scenario: To verify change of sku and item value by navigation Mobile
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    And user should be able to see the sku and item numbers for the given image
    When user select any other size and color of the product varient
    Then user should be able to see the changed value of the sku and item

  @Regression  @C-PDP @Mobile @KER-1926  @ZYP_PDP_K1926-5756 @All @Rerun @RBeta
  Scenario: To verify change of sku and item value by search
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "SearchPDP" in the searchbox
    And user should be able to see the sku and item numbers for the given image
    When user select any other size and color of the product varient
    Then user should be able to see the changed value of the sku and item
