Feature: Verify that user can see promotional ads on PLP based on configuration in CMS

  @Sprint6 @ST-OMNI-22062
  Scenario Outline: Veriy that the user can see promotional ad for categories on shop screen
    Given User launches the application
    And User continues as guest user
    Then User sees the homepage
    When User taps on shop in bottom nav
    Then User sees the shop page
    When User navigates to "<category>" category in the list
    And User fetch the sub category name list
    And User taps on shop all link
    Then User sees the Promo ad image on PLP

    Examples:
      | category |
      | clothing		|
#      | Home & Backyard |
#      | Health & Fitness |