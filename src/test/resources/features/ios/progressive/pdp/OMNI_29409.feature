Feature: PD - Gift Card - ATC Enable/Disable + OOS

  @Sprint06 @ST-OMNI-29409
  Scenario Outline: : Varify PD Gift Cards / eGift Cards are out of Stock
    Given User launches the application
    And User continues as "guest user" on onboarding page
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And i choose to enter "BOPISOOSSKU" In Search box
    And i choose to click on "Searcheditem" on Search page
    #Given User launches the application
    #When User Clicks On MaY Be Later
    #And User continues as guest user
    #Then User sees the homepage
    #When User Sees the Search Box
    # Then User clicks on the Search Box
    And User Search for the "<product>"
    And I choose to navigate to PDP
    When inventory is not available
    Then Verify display Out of Stock as per design

    Examples: 
      | product   |
      | eGiftCard |
      | gitcard   |
