Feature: To verify basic functionalities of PDP

@Regression @Sanity @PDP  @Web @ZYP-4341 @KER-1926 @All  @Rerun
  Scenario: To verify URL, Image, Attributes ,Add to cart button section by navigation Desktop
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    And user should be able to see Add to cart button and quantity section
    Then user should be able to see inventory status of the product

@Regression  @PDP  @Web @KER-1926 @ZYP-5544 @All @Rerun
  Scenario Outline: To verify URL, Image, Attributes, Add to cart button section by search
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "<SearchTerm>" in the search box
    And user should be able to see PDP mention in the current url
    Then user should be able to see Image of the product
    And user should be able to see the search term in the product title
    Then user should see different attribute and size of the product
    And user should be able to see Add to cart button and quantity section
    Then user should be able to see inventory status of the product

    Examples: 
      | SearchTerm                                          |
      | Nike Women's Nike Cheer Scorpion Cheerleading Shoes |

@Regression  @PDP @Web  @ZYP-4036 @KER-1926 @All @Rerun
  Scenario: To verify product detail content section "Details and specs" tab
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    And user is able to see three tabs in the detail content section
    Then user is able to see the Details and specs tab by default open
    And user should be able to see long description with feature and benefits section

@Regression @PDP  @Web  @KER-1926 @ZYP-5547 @All @Rerun
  Scenario: To verify product detail content section "Reviews" tab
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    When user clicks on Reviews tab
    Then user should be able to see the reviews heading and section
    And user clicks on QandA tab
    Then user clicks should be able to see the closed reviews tab

 @Regression @PDP  @Web @KER-1926 @ZYP-5552 @All @Rerun
  Scenario: To verify product detail content section "QandA" tab Desktop
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    When user clicks on QandA tab
    Then user clicks should be able to see QandA section
    And user clicks on Reviews tab
    Then user clicks should be able to see the closed QandA tab

@Regression @PDP  @Web @KER-1926 @ZYP-5553 @All @Rerun
  Scenario Outline: To verify sku and item value by search  Desktop
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "<SearchTerm>" in the search box
    And user should be able to see the sku and item numbers for the given image

    Examples: 
      | SearchTerm                                          |
      | Nike Women's Nike Cheer Scorpion Cheerleading Shoes |

 @Regression  @PDP @Web @ZYP-4298 @KER-1926 @All @Rerun
  Scenario: To verify sku and item value by navigation  Desktop
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    And user should be able to see the sku and item numbers for the given image

@Regression  @PDP @Web @ZYP-5578 @KER-1926 @All @Rerun
  Scenario: To verify change of sku and item value by navigation Desktop
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    And user should be able to see the sku and item numbers for the given image
    When user select any other size and color of the product varient
    Then user should be able to see the changed value of the sku and item

@Regression  @PDP @Web @KER-1926 @ZYP-5556 @All @Rerun
  Scenario Outline: To verify change of sku and item value by search  Desktop
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "<SearchTerm>" in the search box
    And user should be able to see the sku and item numbers for the given image
    When user select any other size and color of the product varient
    Then user should be able to see the changed value of the sku and item

    Examples: 
      | SearchTerm                                          |
      | Nike Women's Nike Cheer Scorpion Cheerleading Shoes |
