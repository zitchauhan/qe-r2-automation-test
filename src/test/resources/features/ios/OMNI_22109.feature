Feature: Verify Functionality of bottom navigation

@Sprint1 @TC_OMNI_24716
Scenario: User can navigate to destination screen using bottom navigation
  	Given User launches the application
    When User taps on home in bottom nav
    Then User sees the homepage
    When User taps on shop in bottom nav
    Then User sees the shop page
    When User taps on wishlist in bottom nav
    Then User sees the wishlist page
    When User taps on cart in bottom nav
    Then User is navigated To Cart Screen
    When User taps on account in bottom nav
    Then User sees the account page