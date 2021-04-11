Feature: White Glove Service Options on Checkout screen for Bulky and white glove products

  @Sprint2 @ST-OMNI-24580 @TC-OMNI-
  Scenario: Verify disclaimer message and shipping method label
    Given User launches the application
    And User Logs into the application
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
    And User sees the shipping disclaimer "Orders placed after 2:00 PM CST will be processed the following business day."

  @Sprint4 @ST-OMNI-24580 @TC-OMNI-33478
  Scenario: Verify that a registered academy user
  is able to see required Home delivery options on checkout screen for bulky or white glove products
    Given User launches the application
    And A registered user is logged in
    And User has a whiteGloveBulky product in the cart
    When User taps on checkout button
    Then User sees service delivery options for white glove product


