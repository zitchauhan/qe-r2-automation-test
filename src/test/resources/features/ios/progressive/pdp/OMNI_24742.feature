Feature: Validate user can navigate to PDP from cart

@ST-OMNI-24742 @TC-OMNI-29786
Scenario: User taps on product title in cart and moves to the pdp page
    Given User launches the application
    And User continues as guest user
    When User navigates to pdp
    Then User sees product image
    And User sees Product title
    And User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen
    And User taps on product title
    Then User sees product image
    And User sees Product title