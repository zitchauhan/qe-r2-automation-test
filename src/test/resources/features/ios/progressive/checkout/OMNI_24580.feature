Feature: White Glove Service Options on Checkout screen for Bulky and white glove products

  @Sprint2 @ST-OMNI-24580
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