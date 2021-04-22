Feature: Content Stack: Home screen - Offer Details and T&Cs (CMS) Component

  @Sprint5 @ST-OMNI-34341 @TC-OMNI-34781
  Scenario Outline: Verify that the app has the ability to inform ASO App Users on offer details and terms
    Given User launches the application
    And User Clicks On MaY Be Later
    And User continues as guest user
    When User taps on home in bottom nav
    Then User sees the homepage

    When User swipes to information section of the home page
    Then User sees "Information message" on home page
    And User sees "Information message subtitle" on home page
    And User sees information message title "<title>" on home page
    And User sees information message subtitle "<subTitleMessage>" on home page
    And User click on the "Information message Cta" on home page
    Then User is on Information message page

    Examples:
    | title              | subTitleMessage   |
    | Free shipping over | Lorem ipsum dolor |