Feature: Verify Restrict display of SOF on app Wishlist

  @Sprint5 @TC-OMNI-36640 @ST-OMNI-28622
  Scenario Outline: Verify user is restricted display of SOF on app Wishlist
    # User should have logged in with the same credentials in web and
    # must have a SOF/Firearm item added in to the "Wishlist"
    Given User launches the application
    And User continues as guest user
    And User is on Log In screen
    Then User sees email address field
    And User sees passwordd field
    Then User enters valid email "verifiedAddressList@yopmail.com"
    And User enters valid password "Password@123"
    And User taps on Login
    Then User sees the account page
    When User taps on Wishlist
    And User sees "created wishlist" screen
    When User taps on "created" wishlist
    Then User sees "Information message" on wishlist page
    And User sees "Information message subtitle" on wishlist page
    And User sees information message title "<title>" on wishlist page
    And User sees information message subtitle "<subTitleMessage>" on wishlist page
    And User click on the "Visit Academy.com Cta" on wishlist page
    Then I choose to verify user navigated to Web

    Examples: 
      | title                                    | subTitleMessage                     |
      | Item(s) were removed from your Wish list | firearms cannot be purchased in app |
