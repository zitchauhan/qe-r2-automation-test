Feature: Verify Bottom Nav

	@ST-OMNI-25648 @TC-OMNI-30702
  Scenario: Verify User is shown the bottom nav
  	Given User launches the application
    When User taps on home in bottom nav
    Then User sees the homepage
    When User taps on shop in bottom nav
    Then User sees the shop page
    Then User should not see the wishlist page
    When User taps on cart in bottom nav
    Then User is navigated To Cart Screen
    When User taps on account in bottom nav
    Then User sees the account page