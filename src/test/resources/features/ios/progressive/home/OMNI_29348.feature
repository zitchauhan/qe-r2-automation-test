Feature: Verify Functionality of Instruction Banner Component

@Sprint4 @TC_OMNI_29348 @ST-OMNI-29348
Scenario: Verify user can navigate to Instruction Banner Component enabled for Home screen
  	Given User launches the application
  	And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage 
    Then User scrolls down to the bottom
    When user see "Instruction banner" on home page
    When User sees "Instruction Banner subtitle" on home page
    And User click on the "Instruction Banner Cta" on home page
    Then User is on Instruction banner page