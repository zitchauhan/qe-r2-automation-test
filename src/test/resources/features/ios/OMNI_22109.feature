Feature: Verify Functionality of bottom navigation

@Sprint1 @TC_OMNI_24716
Scenario: User can navigate to destination screen using bottom navigation
  	Given User has launched the app
    When User taps on homepage
    Then User is navigated to homepage
    When User taps on shop page
    Then User is navigated to shop page
    When User taps on wishlist page
    Then User is navigated to wishlist page
    When User taps on cart page
    Then User is navigated to cart page
    When User taps on account page
    Then User is navigated to account page